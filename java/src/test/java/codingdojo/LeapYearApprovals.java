package codingdojo;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * explanation, year -> is leap year?
 * typical common year, 2001 -> false
 * typical leap year, 1996 -> true
 * atypical common year, 1900 -> false
 * atypical leap year, 2000 -> true
 *
 */
public class LeapYearApprovals {


    @Test
    void isLeapYearWithoutExplanations() {
        List<Integer> years = List.of(2001, 1996, 1900, 2000);
        Map<Integer, Boolean> results = years.stream().collect(Collectors.toMap(
                e -> e,
                e -> LeapYear.isLeap(e)));
        Approvals.verifyAll("year -> is leap year", results.entrySet(), e -> e.getKey() + " -> " + e.getValue());
    }

    @Test
    void isLeapYear() {
        Map<String, Integer> years = Map.of(
                "typical common year", 2001,
                "typical leap year", 1996,
                "atypical common year", 1900,
                "atypical leap year", 2000
        );
        Map<String, Boolean> results = years.entrySet()
                .stream()
                .collect(Collectors.toMap(e -> e.getKey() + ", " + e.getValue(),
                        e -> LeapYear.isLeap(e.getValue())));

        Approvals.verifyAll("explanation, year -> is leap year?", results.entrySet(),
                e -> e.getKey() + " -> " + e.getValue());
    }
}
