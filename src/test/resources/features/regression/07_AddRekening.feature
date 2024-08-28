@regression @addRekening

Feature: Add Rekening

  Background: User already login
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    And The user will redirect to Login page
    And On Login page, The user input "test.website" in Username
    And On Login page, The user input "Password2024!" in Password
    And On Login page, The user click Login button

  Scenario: User can select Jenis rekening
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Tambah Rekening" menu
    And The user will redirect to Tambah Rekening page
    Then The user select "Bronze" in Jenis Rekening

  Scenario: User can click Selanjutnya button in Jenis rekening
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Tambah Rekening" menu
    And The user will redirect to Tambah Rekening page
    And The user select "Bronze" in Jenis Rekening
    And The user click Selanjutnya button
    Then The user verify redirected to Tab Formula Data Diri