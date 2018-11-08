Feature: Login

  @Smoke
  Scenario: Login valid
    Given user is on login page
    When he provides valid credentials
    |Username|Password       |
    |vaibhav.bhosale@rewiseglobal.com  |vaibhav123     |
    Then he should be able to login successfully