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
    Given the year <year>
    When the user asks whether it is a leap year
    Then it should respond with <result>

    Examples: Common Years
      | description | year  | result |
      | typical     | 1993  | False  |
      | atypical    | 1900  | False  |

    Examples: Leap Years
      | description | year  | result |
      | typical     | 1992  | True  |
      | atypical    | 2000  | True  |


Feature: Leap Year Function
  The user needs a function that returns true or false
  depending on whether its input integer is a leap year or not.

  Scenario Outline: recent years
    When the user asks if <int> is a leap year or not
    Then the function returns "<result>"
    Examples:
      | description          | int  | result |
      | typical common year  | 2001 | false  |
      | atypical common year | 1900 | false  |
      | typical leap year    | 1996 | true   |
      | atypical leap year   | 2000 | true   |

