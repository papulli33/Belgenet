Feature: Login

  Scenario: Verification of Login Function
    Given the user on the belgenet page
    When the user clicks the Demo button
    And the user enters the username as "botcu"
    And the user enters the password as "spider"
    And the user clicks the login button
    Then the user should be redirected to the home page

    
