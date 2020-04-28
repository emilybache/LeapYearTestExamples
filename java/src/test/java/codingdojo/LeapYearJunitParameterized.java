package codingdojo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static codingdojo.LeapYear.isLeap;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LeapYearJunitParameterized {

    @ParameterizedTest
    @MethodSource("leapYearTestData")
    public void leapYears(String scenario, int year, boolean expected) {
        assertEquals(scenario, expected, isLeap(year));
    }

    public static Stream<Arguments> leapYearTestData() {
        return Stream.of(
                arguments( "typical common year", 1993, false ),
                arguments( "typical leap year", 1992, true ),
                arguments( "atypical common year", 1900, false ),
                arguments( "atypical leap year", 2000, true )
        );
    }
}
