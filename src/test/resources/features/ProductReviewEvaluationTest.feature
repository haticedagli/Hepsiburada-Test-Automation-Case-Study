Feature:

  @Chrome
  Scenario: User's approval of reviews on product detail page
    And Search "iphone" in search box
    And Click search button
    And Click on the first product that has rating stars on the page that opens
    And Open product rating tab
    When the yes button of the first product is clicked
    Then verify there is a message that says thank you

  @Chrome
  Scenario: User's approval of reviews on product detail page
    And Search "toka" in search box
    And Click search button
    And Click on the first product that has no rating stars on the page that opens
    When Open product rating tab
    Then verify that product has no review in it
