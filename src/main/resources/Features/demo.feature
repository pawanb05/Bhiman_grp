Feature: This Feature demostrates even number or not

Scenario Outline:
  Given I have number from <row>
  When I add Both numbers
  Then check weather addition is even
  Examples:
   |1|
   |2|
   |3|
   |4|
   |5|
   
