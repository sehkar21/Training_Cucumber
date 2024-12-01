@sanity
Feature: Login into OrangeHRM

  @tag1
  Scenario Outline: Login into OrangeHRM
    Given i launch the browser and enter into orangeHRM site
    Given user enters "<username>" and "<password>"
    And click on the login button 
    Then verify the homepage
    Then click on the myinfo left panel
    Then user enters the details 
    And user saves the page
    
    
    Examples: 
    |username|password|
    |Admin  |admin123 |