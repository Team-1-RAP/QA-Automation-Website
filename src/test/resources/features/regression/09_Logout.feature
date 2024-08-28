@logout

Feature: Logout

  Background: User already login
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    And The user will redirect to Login page
    And On Login page, The user input "qa.website" in Username
    And On Login page, The user input "password" in Password
    And On Login page, The user click Login button

  Scenario: User can logout from Simple Bank
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Logout" button
    Then The user will redirect to Login page