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
Feature: Login with valid credentials

  Scenario Outline: Login with valid credentials
    Given User opens the browser
    When User enters username "<username>"
    And User enters encrypted password "<password>"
    And User clicks on the Login button
    Then User closes the browser

  Examples:
    | username | password                      |
    | yoni_02  | 35nmjo+O3dqmOBVyF6wy1Q==      |
    |     		 | someEncryptedPasswordForAlice |
    | yoni     |  														 |
    |          |                               |
    |     		 | someEncryptedPasswordForAlice |
    | bob      |  														 |

