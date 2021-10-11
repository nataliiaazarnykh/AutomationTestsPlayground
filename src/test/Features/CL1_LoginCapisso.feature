#Author: nataliia.azarnykh@sentryc.com 16.08.2021

Feature: Capisso login
    @CL @LoginTest @CapissoTest @CL1 @Test
    Scenario: Test of capisso login with valid credentials
        Given CL1 - user opens browser capisso
        And CL1 - user is on capisso login page capisso
        When CL1 - user enters email capisso
        And CL1 - user enters password capisso
        And CL1 - clicks on capisso login button capisso
        Then CL1 - user is navigated to capisso homepage capisso
