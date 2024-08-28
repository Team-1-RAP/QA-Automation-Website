@regression @transfer

Feature: Transfer

  Background: User already login
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    And The user will redirect to Login page
    And On Login page, The user input "test.website" in Username
    And On Login page, The user input "Password2024!" in Password
    And On Login page, The user click Login button
    And The user will redirect to Beranda page

  Scenario: User can access landing page
    Given On Beranda page, The user check balance account
    When On Beranda page, The user click "Transfer" menu
    Then The user will redirect to Transfer page
    And On Transfer page, The user click "Transfer Baru" button
    And On Transfer page, The user verify Bank Tujuan is "BCA"
    And On Transfer page, The user input "0120000028" as Rekening Tujuan
    And On Transfer page, The user click "Selanjutnya" button
    And On Transfer page, The user verify value in preview Rekening Tujuan is correct
    And On Transfer page, The user select "0120000027" as Rekening Sumber
    And On Transfer page, The user input "66666" as Nominal
    And On Transfer page, The user input "Automation Website" as Keterangan
    And On Transfer page, The user click "Lanjutkan" button