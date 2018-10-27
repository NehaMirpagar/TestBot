Feature: CreateUser

  @Underscore
  Scenario: Create new user
    Given user is on home page
    When creates new user
  |firstName|middleName|lastName|role       |emailId          |contact    |dateOfBirth|country|state      |suburb|dateOfJoining|zipCode|
  |Calvina   |N         |M       |Executor   |cal123@gmail.com|7894561245 |10/10/1988 |India  |Maharashtra|Pune  |1/1/2020     |74185  |
    Then new user should ne listed in the user list