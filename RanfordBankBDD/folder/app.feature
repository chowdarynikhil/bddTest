Feature: login
Scenario: To check the tittle of the page
Given     Launch the site
When      check the tittle of the page "KEXIM BANK" data
Then      Homepage should be displayed
And       Close the site




Scenario: To verify the username and password
Given     Launch the site
When      Enter the username and password and click on login btn
Then      Branches btn should be displayed
And       Close the site

