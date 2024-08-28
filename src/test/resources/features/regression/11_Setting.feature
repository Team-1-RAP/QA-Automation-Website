@regression @setting

Feature: Setting

  Background: User already login
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    And The user will redirect to Login page
    And On Login page, The user input "test.website" in Username
    And On Login page, The user input "Password2024!" in Password
    And On Login page, The user click Login button
    And The user will redirect to Beranda page

  Scenario: User can access ubah password menu
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Pengaturan" menu
    And The user will redirect to Pengaturan page
    And On Pengaturan page, The user click Ubah Password option
    Then The user redirected to Ubah Password page

  Scenario: User can access ubah password menu
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Pengaturan" menu
    And The user will redirect to Pengaturan page
    And On Pengaturan page, The user click Ubah Pin option
    Then The user redirected to Ubah Pin page