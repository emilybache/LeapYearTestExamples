package codingdojo;

import codingdojo.LeapYear;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearStepDefs2 {

    int year;
    boolean isLeap;

    @When("I have the year {int}")
    public void iHaveTheYear(int year) {
        this.year = year;
    }

    @Then("it is not a leap year")
    public void itIsNotALeapYear() {
        assertFalse(LeapYear.isLeap(this.year));
    }

    @Then("it is a leap year")
    public void itIsALeapYear() {
        assertTrue(LeapYear.isLeap(this.year));
    }

    @When("I calculate whether it is a leap year")
    public void iCalculateWhetherItIsALeapYear() {
        isLeap = LeapYear.isLeap(this.year);
    }

    @Then("it should be {string}")
    public void itShouldBe(String result) {
        boolean expected = Boolean.parseBoolean(result);
        assertEquals(expected, isLeap);
    }
}
