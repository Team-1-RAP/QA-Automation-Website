@regression @checkBalance

Feature: Check Balance

  Background: User already login
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    And The user will redirect to Login page
    And On Login page, The user input "test.website" in Username
    And On Login page, The user input "Password2024!" in Password
    And On Login page, The user click Login button

  Scenario: User can show balance account
    Given On Beranda page, The user click show hide balance icon
    Then The user verify balance is show

  Scenario: User can hide balance account
    Given On Beranda page, The user click show hide balance icon
    When The user verify balance is show
    And On Beranda page, The user click show hide balance icon
    Then The user verify balance is hide