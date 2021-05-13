Feature: Operations of dividing and power
  Scenario:
    Given inputs 21 3 "/"
    When I do operation
    Then the output is 7
  Scenario:
    Given inputs 5 2 "^"
    When I do operation
    Then the output is 25
Scenario Outline:
  Given inputs <first> <second> "<opt>"
  When I do operation
  Then the output is <result>
  Examples:
    | first | second | opt | result |
    | 6     | 2      | /   | 3      |
    | 6     | 2      | ^   | 36     |
    | 8     | 4      | /   | 2      |
    | 8     | 3      | ^   | 512    |