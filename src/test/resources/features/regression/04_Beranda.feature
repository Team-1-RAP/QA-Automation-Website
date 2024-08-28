@regression @beranda

Feature: Beranda

  Background: User already login
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    And The user will redirect to Login page
    And On Login page, The user input "test.website" in Username
    And On Login page, The user input "Password2024!" in Password
    And On Login page, The user click Login button

  Scenario: User access menu mutasi
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Mutasi" menu
    Then The user will redirect to Mutasi page

  Scenario: User access menu profil
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Profil" menu
    Then The user will redirect to Profil page

  Scenario: User access menu pengaturan
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Pengaturan" menu
    Then The user will redirect to Pengaturan page

  Scenario: User access menu beranda from pengaturan
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Pengaturan" menu
    And The user will redirect to Pengaturan page
    And On Beranda page, The user click "Beranda" menu
    Then The user will redirect to Beranda page

  Scenario: User access qris
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "QRIS" menu
    Then The user will redirect to QRIS page

  Scenario: User access menu transfer
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Transfer" menu
    Then The user will redirect to Transfer page

  Scenario: User access menu tambah rekening
    Given The user will redirect to Beranda page
    When On Beranda page, The user click "Tambah Rekening" menu
    Then The user will redirect to Tambah Rekening page