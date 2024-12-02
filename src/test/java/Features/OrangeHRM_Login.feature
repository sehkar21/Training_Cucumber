@smoke
Feature: Login into OrangeHRM

  @reg
  Scenario Outline: Login into OrangeHRM
    Given i launch the browser and enter into orangeHRM site
    Given user enters "<username>" and "<password>"
    And click on the login button 
    Then verify the homepage
    
    Examples: 
    |username|password|
    |Admin  |admin123 |
    
    
    Scenario: verifying the homepage admin
    Given iam on the homepage of the OrangeHrm
    Then i click on the Admin tab on the left side
    Then i search for the employee
    And i click the search button

    Scenario: Applying the leave in the leave page
    Given i land on the Leave page
    Then i click on the Apply tab
    Then i apply leave 
    And i click on the submit button
    
    @reg
    Scenario: checking the performance in OrangeHRM
    Given user clicks on the performance left panel
    Then user clicks on the configure tab and clicks on the KPI tracker
    Then user selects the job Title
    Then user clicks on the search button to see the results
        
    