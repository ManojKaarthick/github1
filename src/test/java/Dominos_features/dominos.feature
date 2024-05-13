Feature: Automating the dominos Application

  Scenario: Adding the products to cart
    Given launching the url
    And user clicking order online button
    And user enter the address and select the first suggestion
    And user clicking the veg pizza menu
    And user clicking the bevereges in current page
    And user remove the products from cart
    Then user click the check out button
