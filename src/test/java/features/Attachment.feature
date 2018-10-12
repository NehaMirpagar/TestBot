Feature: Attachment Page

  Scenario: Add an attachment
    Given user is on home page
    When clicks on add attachment

      |Client Name|Work Category|Subwork Category|Document Name|
      |Rewise     |Accounting   |Tax Accounting  |XYZ          |

    Then the new attachment should be successfully added