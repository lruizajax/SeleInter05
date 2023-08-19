@Login
Feature: Login on Luma ecommerce

  Scenario Outline: Successful Login with valid credentials

    When user enters "<username>" and "<password>"
    And  user clicks on sign in button
    Then message displayed "Account Information"
    Examples:
      | username            | password     |
      | lruizajax@gmail.com | ckzsd68REn@cgp5      |
      | lruiz23@gmail.com   | lruiz23@#@@! |