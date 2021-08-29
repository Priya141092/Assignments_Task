Feature: Contact Creation


Scenario Outline: Free CRM test login scenario
Given User is on already on login page
When title on login page is free crm
Then User1 enters "<username>" 
And User enters "<password>"
Then use clicks on login button
And User is on home page
Then Click on contacts
Then create contact with "<firstname>" and "<lastname>" and "<company>"
Then close the browser


Examples:
         | username  | password | firstname | lastname | company |
         | achieve.ps.1014@gmail.com | Qait@1234| hi | hello | Test1234 |
         