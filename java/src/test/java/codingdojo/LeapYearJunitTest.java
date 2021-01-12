package codingdojo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static codingdojo.LeapYear.isLeap;

public class LeapYearJunitTest {
    @Test
    void typicalCommonYear() {
        assertFalse(isLeap(1993));
    }

    @Test
    void typicalLeapYear() {
        assertTrue(isLeap(1992));
    }

    @Test
    void atypicalCommonYear() {
        assertFalse(isLeap(1900));
    }

    @Test
    void atypicalLeapYear() {
        assertTrue(isLeap(2000));
    }
}
