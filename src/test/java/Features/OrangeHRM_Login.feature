@tag
Feature: Login into OrangeHRM

  @tag1
  Scenario Outline: Login into OrangeHRM
    Given i launch the browser and enter into orangeHRM site
    And enter <username> and <password>
    And click on the login button 
    Then verify the homepage
    
    Examples: 
    |usename|password|
    |admin  |admin   |
