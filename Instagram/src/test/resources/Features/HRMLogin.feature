Feature: Login module of OrangeHRM application

Scenario: To check that when user enters valid usn and pwd click on Login button Homepage should be displayed

Given user open browser and enter the url login page should be displayed 
When user enters valid username, password and click on login button
Then Home page should be displayed 
And user should be able to logout
