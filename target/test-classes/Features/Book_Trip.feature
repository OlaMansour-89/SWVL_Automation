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
Feature: Book A Trip
  As A user to SWVL APP 
  I want to book my ride successully 

  @tag1 @test
  Scenario: Book ride successfully
    Given I am an alredy registered user to SWVL app
    And I logged in successfully
    And I searched for the route
    When I click on the needed route
    And I confirmed the booking details 
    Then the trip should be booked successfully 
    
    
 