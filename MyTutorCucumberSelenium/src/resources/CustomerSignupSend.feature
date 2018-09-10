Feature: My Tutor Customer finding a Tutor
This feature verifies the End to End functionality for a customer to find a tutor
 
Scenario Outline: Check that a new parent customer can sign up with valid details and send a message to a tutor
Given I use Chrome browser
When I open MyTutor hompage
Then I enter Get Started valid credentials for "<firstname>" , "<lastname>" , "<email>" , "<signperson>" and "<phonenumber>" 
Then I trigger the initial tutor search
Then I enter a "<password>"
Then I trigger the find tutor search
Then I choose a "<subject>"
Then I choose a subject level
Then I choose the required achievement
Then I choose the time to start 
And the finding matches search page is displayed
Then I choose a tutor from tutor search result page
Then I send a message to the tutor
And I verify the final message_sent page is displayed
Examples:
|  firstname  |  lastname  |      email      | signperson | phonenumber |  password  |  subject  |
|  Matt       |  Matts     |   xrr@msn.com   | parent     | 11110002919 |  MATTmatt1 |  Maths    |

