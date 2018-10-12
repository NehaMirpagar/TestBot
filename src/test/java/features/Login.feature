Feature: Login

  Scenario: Login valid
    Given user is on login page
    When he provides valid credentials
    |Username             |Password|
    |nehavtayade@gmail.com|test    |
    Then he should be able to login successfully