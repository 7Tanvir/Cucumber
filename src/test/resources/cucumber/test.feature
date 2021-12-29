@feature
Feature: Add to cart

  #Rule: Add from Store

  Scenario Outline: Add a product to cart

    Given I am on the Store page
    When I add a <product> to the cart
    Then I see 1 of <product> in the cart

    Examples:
      | product     |
      | Blue Shoes  |
      | Blue Tshirt |

