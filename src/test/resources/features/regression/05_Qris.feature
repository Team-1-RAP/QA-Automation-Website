@regression @qris

Feature: QRIS

  Background: User already login and access qris menu
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    And The user will redirect to Login page
    And On Login page, The user input "test.website" in Username
    And On Login page, The user input "Password2024!" in Password
    And On Login page, The user click Login button
    And The user will redirect to Beranda page
    And On Beranda page, The user click "QRIS" menu
    And The user will redirect to QRIS page

  Scenario: User can select Sumber Rekening
    Given On Qris page, The user select "Gold" account as Rekening Sumber

  Scenario: User can input nominal
    Given On Qris page, The user select "Gold" account as Rekening Sumber
    Then On Qris page, The user input "10000" as nominal

  Scenario: User can input pin
    Given On Qris page, The user select "Gold" account as Rekening Sumber
    When On Qris page, The user input "10000" as nominal
    Then On Qris page, The user input "123456" as pin

  Scenario: User can create qris tampil kode
    Given On Qris page, The user select "Gold" account as Rekening Sumber
    When On Qris page, The user input "55555" as nominal
    And On Qris page, The user input "123456" as pin
    And On Qris page, The user click Selanjutnya button
    Then The user verify qr code success generated
