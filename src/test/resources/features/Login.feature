@login @android
Feature: Login

  @positive
  Scenario: Verify user sucessfully login when input valid username & password
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    And user click login button
    Then user successfully login

  @negative
  Scenario: Verify user failed login when input invalid username & password
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    And user click login button
    Then user successfully login

  @positive
  Scenario: Verify user do swipe
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    And user click login button
    Then user successfully login
    When user go to menu list
    When user do swipe