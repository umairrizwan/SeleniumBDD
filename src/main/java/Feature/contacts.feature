Feature: Free CRM Login Feature Contacts


Scenario Outline: Free CRM Login Scenario

Given user is already on login pagee
Then user enters "<username>" and "<password>" and clicks on login button
Then user lands on homepage
Then user clicks on contacts page
When user clicks on new contact button
Then user enters contact details "<firstname>" and "<lastname>" and "<category>" and "<email>"
#Then close the browser

Examples:
		| username | password | firstname | lastname | category | email |
		| umairxerox@hotmail.com | Pa123456 | Junaid | Akbar | Lead | junaid@gmail.com |
		| umairxerox@hotmail.com | Pa123456 | Laiba | Khan | Customer | laiba@gmail.com |