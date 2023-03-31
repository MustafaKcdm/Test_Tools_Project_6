Feature: Bill Pay Functionality

  Background:

    Given Navigate to site

    When User sending Keys for Login

    Then User should Login successfully

  Scenario Outline: Bill Pay

    Then Navigate to Bill Pay Page

    And User should Pay Bill as Entry info with "<payeeName>" "<address>""<city>""<state>""<zipcode>""<phone>""<account>""<verifyAccount>""<amount>"

    And Successful message should be displayed

    Examples:

      | payeeName | address        | city      | state | zipcode | phone      | account | verifyAccount | amount |
      | Electric  | Dadaloglu cad. | LTekirdag | TR    | 5900    | 5098887766 | 98765   | 98765         | 85     |
      | Water     | Karanfil       | İstanbul  | TR    | 5900    | 5580001234 | 12345   | 12345         | 45     |
      | Gas       | PlazaDelsol    | Madrid    | ESP   | 1092    | 5009182734 | 109287  | 109287        | 120    |

