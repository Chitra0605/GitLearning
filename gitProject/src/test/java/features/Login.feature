Feature: Verify Login page

  Background:
    Given the user navigate to the home page


    Scenario: 1. Verify LoginPage with Valid Credentials

      When the user enter "standard_user" in username field
      And the user enter "secret_sauce" in password field
      And the user click on login button
      Then the user should see "Products" page


    Scenario: 2.  Verify LoginPage with inValid Credentials
      When the user enter "standard_user" in username field
      And the user enter "secret-sauce" in password field
      And the user click on login button
      Then the user should see "Epic sadface: Username and password do not match any user in this service" text on the page

  @smokeTest
  Scenario Outline: Verify LoginPage with data driven

    When the user login with "<username>" username and "<password>" password and click on login button
    Then the user should see "<expectedText>" text on the page

    Examples:

      | username      | password     | expectedText |
      | standard_user | secret_sauce | Products     |
      | standard_user | secret-sauce | Epic sadface: Username and password do not match any user in this service|

