import cucumber.api.java8.En;

import static codingdojo.LeapYear.isLeap;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearStepDefs implements En {
    int year;
    boolean isLeap;

    public LeapYearStepDefs() {
        When("^I have the year (\\d+)$", (Integer year) -> {
            this.year = year;
        });
        Then("^it is not a leap year$", () -> {
            assertFalse(isLeap(this.year));
        });
        Then("^it is a leap year$", () -> {
            assertTrue(isLeap(this.year));

        });
        When("^I calculate whether it is a leap year$", () -> {
            this.isLeap = isLeap(this.year);
        });
        Then("^it should be \"([^\"]*)\"$", (String result) -> {
            assertEquals(this.isLeap, Boolean.parseBoolean(result));
        });
    }
}
