@guest
Feature: Guest Order Checkout

  Scenario Outline: Guest Order Checkout

    Given I am a guest customer
    And my billing details are

      | Fname | Lname | Country     | Address     | City | State | Zip  | Email           |
      | Tan   | Aht   | Switzerland | XStrasse 13 | Bern | Bern  | 3000 | Tan@hotmail.com |

    And I have a <product> in the cart
    And I am on the checkout page
    When I provide my billing details

    And I place the order
    Then the order is placed


    Examples:
      | product    |
      | Blue Shoes |
