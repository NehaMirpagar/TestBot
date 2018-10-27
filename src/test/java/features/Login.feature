Feature: Login

  @Smoke
  Scenario: Login valid
    Given user is on login page
    When he provides valid credentials
    |Username|Password  |
    |user1   |pass1     |
    Then he should be able to login successfully