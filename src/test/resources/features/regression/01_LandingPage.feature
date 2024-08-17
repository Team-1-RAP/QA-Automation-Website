@landingPage

Feature: Landing Page

  Scenario: User can access landing page
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    Then The user verify already on Landing Page Simple Bank

#  Scenario: User can access Register button in landing page
#    Given The user open Simple Bank Website
#    When The user already on Simple Bank Website
#    And On Landing page, The user click "Register" button

  Scenario: User can access Login button in landing page
    Given The user open Simple Bank Website
    When The user already on Simple Bank Website
    And On Landing page, The user click "Login" button
    Then The user will redirect to Login page