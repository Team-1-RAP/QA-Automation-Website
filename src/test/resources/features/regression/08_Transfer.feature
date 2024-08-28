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

  Scenario: User can click add transfer baru button
    Given On Beranda page, The user check balance account
    When On Beranda page, The user click "Transfer" menu
    And The user will redirect to Transfer page
    And On Transfer page, The user click "Transfer Baru" button
    Then On Transfer page, The user verify Bank Tujuan is "BCA"

  Scenario: User can input rekening tujuan
    Given On Beranda page, The user check balance account
    When On Beranda page, The user click "Transfer" menu
    And The user will redirect to Transfer page
    And On Transfer page, The user click "Transfer Baru" button
    And On Transfer page, The user verify Bank Tujuan is "BCA"
    And On Transfer page, The user input "0120000028" as Rekening Tujuan
    And On Transfer page, The user click "Selanjutnya" button
    Then On Transfer page, The user verify value in preview Rekening Tujuan is correct

  Scenario: User verify Konfirmasi transfer
    Given On Beranda page, The user check balance account
    When On Beranda page, The user click "Transfer" menu
    And The user will redirect to Transfer page
    And On Transfer page, The user click "Transfer Baru" button
    And On Transfer page, The user verify Bank Tujuan is "BCA"
    And On Transfer page, The user input "0120000028" as Rekening Tujuan
    And On Transfer page, The user click "Selanjutnya" button
    And On Transfer page, The user verify value in preview Rekening Tujuan is correct
    And On Transfer page, The user select "0120000027" as Rekening Sumber
    And On Transfer page, The user input "11111" as Nominal
    And On Transfer page, The user input "Automation Website" as Keterangan
    And On Transfer page, The user click "Lanjutkan" button
    And On Transfer page, The user verify data in Konfirmasi Transfer is correct

  Scenario: User can transfer to same BCA
    Given On Beranda page, The user check balance account
    When On Beranda page, The user click "Transfer" menu
    And The user will redirect to Transfer page
    And On Transfer page, The user click "Transfer Baru" button
    And On Transfer page, The user verify Bank Tujuan is "BCA"
    And On Transfer page, The user input "0120000028" as Rekening Tujuan
    And On Transfer page, The user click "Selanjutnya" button
    And On Transfer page, The user verify value in preview Rekening Tujuan is correct
    And On Transfer page, The user select "0120000027" as Rekening Sumber
    And On Transfer page, The user input "11111" as Nominal
    And On Transfer page, The user input "Automation Website" as Keterangan
    And On Transfer page, The user click "Lanjutkan" button
    And On Transfer page, The user verify data in Konfirmasi Transfer is correct
    And On Transfer page, The user input "123456" as Pin
    And On Transfer page, The user click "Transfer" button
    Then The user verify Transfer is success