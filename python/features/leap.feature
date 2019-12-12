Feature: Leap years

  Scenario: Common Year
    When I have a common year
    Then it is not a leap year

  Scenario Outline:
    Given I have year <year>
    When I calculate whether it is a leap year
    Then it should be <result>

    Examples: Common Years
    | year  | result |
    | 1993  | False  |
    | 1900  | False  |

    Examples: Leap Years
    | year  | result |
    | 1992  | True  |
    | 2000  | True  |