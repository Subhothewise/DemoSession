Feature: To test login functionality of a sample page

  Scenario Outline: To validate teh login pge is working or not
    Given google browser is open
    And user is on the login page
    When user enters the <id> and <password>
    And clicks on the login button
    Then user is navigated to home page

    Examples: 
      | id    | password |
      | Subho |    12345 |
      | Rahul |    12345 |
