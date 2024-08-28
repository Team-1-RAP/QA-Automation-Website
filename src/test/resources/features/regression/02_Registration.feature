@regression @registration

Feature: Registration

  Scenario: User can input username field in tab Registrasi Akun
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Register" button
    And The user will redirect to Register page
    Then On Tab Registrasi Akun, The user input "automationwebsite@simple.bank" in email

  Scenario: User can input email field in tab Registrasi Akun
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Register" button
    And The user will redirect to Register page
    And On Tab Registrasi Akun, The user input "automationwebsite@simple.bank" in email
    Then On Tab Registrasi Akun, The user input "automation website" in username

  Scenario: User can input password field in tab Registrasi Akun
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Register" button
    And The user will redirect to Register page
    And On Tab Registrasi Akun, The user input "automationwebsite@simple.bank" in email
    And On Tab Registrasi Akun, The user input "automation website" in username
    Then On Tab Registrasi Akun, The user input "Password123!" in password

  Scenario: User can input confirm password field in tab Registrasi Akun
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Register" button
    And The user will redirect to Register page
    And On Tab Registrasi Akun, The user input "automationwebsite@simple.bank" in email
    And On Tab Registrasi Akun, The user input "automation" in username
    And On Tab Registrasi Akun, The user input "Password123!" in password
    Then On Tab Registrasi Akun, The user input "Password123!" in confirm password

  Scenario: User can click Selanjutnya button in tab Registrasi Akun
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Register" button
    And The user will redirect to Register page
    And On Tab Registrasi Akun, The user input "automationwebsite@simple.bank" in email
    And On Tab Registrasi Akun, The user input "automation" in username
    And On Tab Registrasi Akun, The user input "Password123!" in password
    And On Tab Registrasi Akun, The user input "Password123!" in confirm password
    And On Tab Registrasi Akun, The user click "Selanjutnya" button
    Then The user will redirect to Tab Verifikasi Email