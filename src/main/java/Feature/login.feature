Feature: Free CRM Login Feature

#Without exmaple keywords
#Scenario: Free CRM Login Scenario

#Given user is already on login page
#When title of login page is CRM
#Then user enters "umairxerox@hotmail.com" and "Pa123456"  -->> This line is without example keyword
#Then user clicks on login button
#Then user lands on homepage
#Then close the browser


#With examples keyword
Scenario Outline: Free CRM Login Scenario

Given user is already on login page
When title of login page is CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user lands on homepage
Then user clicks on contacts page
Then user enters contact details
Then close the browser

Examples:
		| username | password |
		| umairxerox@hotmail.com | Pa123456 |