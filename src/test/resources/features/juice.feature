#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Launch the application
    Given Launch the URL
    And Create a User
    Then Login into the page
    When The page is logged in we can able to Add one or two items to basket
    And Go to your basket and increase the quantity of all items by 2
    And Press checkout and add a new address
    Then Select the address and any delivery speed
    And Add a new card, try to add a fake coupon (10 digits) and verify error message
    And Select card, review and place the order
    And Verify in Account, order history print order, track order
    Then logout from the application
