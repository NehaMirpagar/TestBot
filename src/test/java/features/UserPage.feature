Feature: CreateUser

  @Underscore
  Scenario: Create new user
    Given user is on home page
    When creates new user
  |firstName|middleName|lastName|cohort |role       |emailId             |contact|dateOfBirth|country|state      |suburb|dateOfJoining|zipCode|
  |Calvin   |N         |M       |Testing|Executor   |neharewise@gmail.com|789456 |10/10/1988 |India  |Maharashtra|Pune  |14/18/2020   |74185  |
    Then new user should ne listed in the user list