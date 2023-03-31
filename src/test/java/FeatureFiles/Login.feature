Feature: Login Functionality

  Background:

    Given Navigate to site

  Scenario: Login to Account




    When User sending Keys for Login

    Then User should Login successfully

    And User Logout

  Scenario Outline: Wrong user login

    When User sending Keys for "<username>" and "<password>" click to login

    Then Alert massage should be displayed

    Examples:
      | username | password     |
      | MECorlu1  | Corlu8601     |
      | Tech1no3 | Tech1nogrp34 |
      | Joker12  | Batman114    |

