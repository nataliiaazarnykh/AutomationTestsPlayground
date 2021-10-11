#Author: nataliia.azarnykh@sentryc.com 16.08.2021

@SmokeScenario
Feature: feature to test login functionality

  @LoginTest @PL1 @PL @ProtegoTest @Test
  Scenario: PL1 - Check Protego login is successful with valid credentials
    Given PL1 - producer opens browser
    When PL1 - producer opens protego login page
    And PL1 - producer enters email
    And PL1 - producer enters password
    And PL1 - producer clicks on login button
    Then PL1 - producer is navigated to protego homepage

