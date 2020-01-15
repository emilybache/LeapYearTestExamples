Feature: Leap years
  Does February have 29 days?

  Scenario: Common Year
    When I have the year 1993
    Then it is not a leap year

  Scenario: Leap Year
    When I have the year 1992
    Then it is a leap year

  Scenario: Atypical Common Year
    When I have the year 1900
    Then it is not a leap year

  Scenario: Atypical Leap Year
    When I have the year 2000
    Then it is a leap year

  Scenario Outline:
    Given I have the year <year>
    When I calculate whether it is a leap year
    Then it should be "result"

    Examples: Common Years
      | year  | result |
      | 1993  | False  |
      | 1900  | False  |

    Examples: Leap Years
      | year  | result |
      | 1992  | True  |
      | 2000  | True  |