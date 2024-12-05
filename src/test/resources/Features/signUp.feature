@signupFeature
Feature: Feature to test signup functionality

  @validSignup
  Scenario: Check signup is successful with valid information
    Given user is on the signup page
    When user enters valid username, email, and password
    And clicks on the signup button
    Then user is navigated to the welcome page
    And a confirmation message "Signup successful" is displayed

  @existingUser
  Scenario: Check signup with an already registered email
    Given user is on the signup page
    When user enters an email that is already registered
    And clicks on the signup button
    Then error message "Email is already registered" is displayed
    And user remains on the signup page

  @weakPassword
  Scenario: Check signup with a weak password
    Given user is on the signup page
    When user enters a weak password
    And clicks on the signup button
    Then error message "Password is too weak" is displayed
    And user remains on the signup page

  @invalidEmail
  Scenario: Check signup with an invalid email format
    Given user is on the signup page
    When user enters an invalid email format
    And clicks on the signup button
    Then error message "Invalid email format" is displayed
    And user remains on the signup page

  @missingInformation
  Scenario: Check signup with missing required information
    Given user is on the signup page
    When user leaves required fields empty
    And clicks on the signup button
    Then error message "All fields are required" is displayed
    And user remains on the signup page
