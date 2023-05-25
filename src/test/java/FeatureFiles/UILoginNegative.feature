Feature: Login Functionality
@SmokeTest
  Scenario Outline: Login with invalid username and password
    Given Navigate to Akakce website
    And Click on the element
      | girisYapLink |
    And Sendkeys on the element
      | eposta   | <epostaInput>   |
      | password | <passwordInput> |
    And Click on the element
      | girisYapButton |
    Then Verify failure login
    Examples:
      | epostaInput             | passwordInput  |
      | busrakuzucu94@gmail.com | YanlisPassword |
      | yanlisEposta@gmail.com  | Akakce.17      |

