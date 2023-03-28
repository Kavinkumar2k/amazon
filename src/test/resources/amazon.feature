Feature: To validate the login page of amazon website
Background: Launch the browser and maxmize the window
Scenario Outline: To validate valid mail id 
When To launch the Url
And To click the login button
And To pass the email id into the" <email>" mailid field
And To press the continue button
Then To close the browser
Examples:
|email|
|kavin@gmail.com|
|kumar.gmail.com|
|inmakes@gmail.com|
|selenium@gmail.com|


