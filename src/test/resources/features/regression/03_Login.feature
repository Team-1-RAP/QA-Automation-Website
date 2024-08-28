@@regression @login

Feature: Login

  Background: User already on Login page
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    Then The user will redirect to Login page

  Scenario: User can access Lupa Password link
    Given On Login page, The user click Lupa Password
    Then The user will redirect to Lupa Password page

  Scenario: User can access Daftar link
    Given On Login page, The user click Daftar
    Then The user will redirect to Register page

  Scenario: User login with valid credentials
    Given On Login page, The user input "test.website" in Username
    When On Login page, The user input "Password2024!" in Password
    And On Login page, The user click Login button
    Then The user will redirect to Beranda page

  Scenario: User login with invalid credentials
    Given On Login page, The user input "invalid.account" in Username
    When On Login page, The user input "Invalid2024!" in Password
    And On Login page, The user click Login button
    Then The user verify login failed