
Feature: Deals page testing



  Scenario: Free CRM Login Scenario
    Given user is already on login page
    When title of login page is CRM 
    Then user enters username and password
    | username | password |
    |umairxerox@hotmail.com | Pa123456 |
    Then user clicks on login button
   
    Then user clicked on deals link
    Then user lands on deals page
    Then user enter deals values
    | title | amount | comission | 
    | test deal 1 | 25000 | 12000 |
    | test deal 2 | 45000 | 11000 |
    | test deal 3 | 35000 | 10000 | 
