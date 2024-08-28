@regression @mutasi

Feature: Mutasi

  Background: User already login
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    And The user will redirect to Login page
    And On Login page, The user input "test.website" in Username
    And On Login page, The user input "Password2024!" in Password
    And On Login page, The user click Login button

  Scenario: User can filter mutasi by month July
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Mutasi" menu
    And The user will redirect to Mutasi page
    And On Mutasi page, The user click filter by "Month"
    And On Mutasi page, The user select July
    Then The user verify filter applied

  Scenario: User can filter mutasi by type pemasukan
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Mutasi" menu
    And The user will redirect to Mutasi page
    And On Mutasi page, The user click filter by "Type"
    And On Mutasi page, The user select Pengeluaran
    Then The user verify filter applied

  Scenario: User can filter mutasi by show data 25
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Mutasi" menu
    And The user will redirect to Mutasi page
    And On Mutasi page, The user click filter by "Show Data"
    And On Mutasi page, The user select 25
    Then The user verify filter applied