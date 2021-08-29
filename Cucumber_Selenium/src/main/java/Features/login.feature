Feature: Login Action


#Scenario: Free CRM test login scenario
#Given User is on already on login page
#When title on login page is free crm
#Then User1 enters "priyasaxena1492@gmail.com" 
#And User enters "Qait@1234"
#Then use clicks on login button
#And User is on home page


Scenario Outline: Free CRM test login scenario
Given User is on already on login page
When title on login page is free crm
Then User1 enters "<username>" 
And User enters "<password>"
Then use clicks on login button
And User is on home page
Then close the browser


Examples:
         | username  | password |
         | achieve.ps.1014@gmail.com | Cogmento CRM |
         | tom | test123 |