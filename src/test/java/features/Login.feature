Feature: Login

  @Smoke
  Scenario: Login valid
    Given user is on login page
    When he provides valid credentials
    |Username|Password       |
    |user1  |user123     |
    Then he should be able to login successfully