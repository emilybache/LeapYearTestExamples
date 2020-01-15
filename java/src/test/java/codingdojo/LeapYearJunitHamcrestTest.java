package codingdojo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static codingdojo.LeapYear.isLeap;

public class LeapYearJunitHamcrestTest {
    @Test
    void commonYear() {
        assertThat(isLeap(1993), is(false));
    }

    @Test
    void typicalLeap() {
        assertThat(isLeap(1992), is(true));
    }

    @Test
    void atypicalCommon() {
        assertThat(isLeap(1900), is(false));
    }

    @Test
    void atypicalLeap() {
        assertThat(isLeap(2000), is(true));
    }
}
