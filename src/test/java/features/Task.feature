Feature: Create New Task ans assign it to team member

  @Tabulate
  Scenario: New task creation and assigning to team member
    Given user is on home page
    When he creates new task and assign it to assignee
    |Taskname|
    |BeforeTesting |
    Then new task should be created and Task list should be updated


