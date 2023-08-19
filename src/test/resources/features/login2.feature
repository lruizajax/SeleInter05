@datatable
Feature: Login on Luma ecommerce

  Scenario: Successful Login with datatable

    When user enters and password
      | lruizajax@gmail.com | ckzsd68REn@cgp5 |
    And  user clicks on sign in button
    Then message displayed "Account Information"