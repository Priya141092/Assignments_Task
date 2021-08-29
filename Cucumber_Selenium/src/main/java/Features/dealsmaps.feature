Feature: Deals data creation

Scenario: Free CRM test login scenario
Given User is on already on login page
When title on login page is free crm
Then User enters username and password
 |username | password |
| achieve.ps.1014@gmail.com | Qait@1234 |

Then use clicks on login button
And User is on home page
Then Click on deals page
Then create deal with title and description and identifier
 | title |description | identifier| 
| test | hi its new | test45 |
| test2 | hi new3 | test900 |

Then close the browser
