package codingdojo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static codingdojo.LeapYear.isLeap;

public class LeapYearJunitTest {
    @Test
    void commonYear() {
        assertFalse(isLeap(1993));
    }

    @Test
    void typicalLeap() {
        assertTrue(isLeap(1992));
    }

    @Test
    void atypicalCommon() {
        assertFalse(isLeap(1900));
    }

    @Test
    void atypicalLeap() {
        assertTrue(isLeap(2000));
    }
}
