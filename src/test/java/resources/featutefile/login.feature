Feature: Login Test
  As user I want to login to Virgin Games Website


  Scenario: user should see login link on home page
    Given I am on homepage
    When I accept cookies
    And I click on Free Games
    Then I should see text Experience a Selection of Free Games