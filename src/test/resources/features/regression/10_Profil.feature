@regression @profil

Feature: Profile

  Background: User already login
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    And The user will redirect to Login page
    And On Login page, The user input "test.website" in Username
    And On Login page, The user input "Password2024!" in Password
    And On Login page, The user click Login button

  Scenario: User show balance in menu profile
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Profil" menu
    And The user will redirect to Profil page
    And On Profil page, The user click show balance icon
    Then The user verify balance in profile is show

  Scenario: User hide balance in menu profile
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Profil" menu
    And The user will redirect to Profil page
    And On Profil page, The user click show balance icon
    And The user verify balance in profile is show
    And On Profil page, The user click hide balance icon
    Then The user verify balance in profile is hide