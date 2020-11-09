Feature: This is for testing with tags

@Regression @Sanity
Scenario: To verify login page
Given User is on login page

@Regression @Functional
Scenario: To verify contact page
Given User is on contact page

@SmokeTest @Functional
Scenario: To verify deals page
Given User is on deals page

@Sanity
Scenario: To verify task page
Given User is on task page

@Regression
Scenario: To verify cases page
Given User is on cases page


