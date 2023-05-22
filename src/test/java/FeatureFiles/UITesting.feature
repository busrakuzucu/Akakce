Feature: Add Product Tracking List

  Scenario: Login Process
    Given Navigate to Akakce website
    And Click on the element
      | girisYapLink |
    When Sendkeys on the element
      | eposta   | busrakuzucu94@gmail.com |
      | password | Akakce.17               |
    And Click on the element
      | girisYapButton |
    Then User should login successfully
    And Sendkeys on the element
      | searchTextBox | ipad |
    And Click on the element
      | searchButton |
    And Get the product
      | uruneGit |
    And JsClick on the element
      | takibeAl |
    And Click on the element
      | takipIcon |
    Then User should added successfully on list




