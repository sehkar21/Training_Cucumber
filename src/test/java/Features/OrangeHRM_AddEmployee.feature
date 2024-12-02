
@adhoc
Feature: To Add employee in OrangeHRM


Background:
 Given i login into in the Orange HRM site
 Then i enter the username and password in the orangeHRM site
 Then i click the Login button in OrangeHRM site

 
  Scenario: To Add employee in OrangeHRM
    Given user clicks on the PIM left panel in the homepage of orangeHRM
    Then user clicks on the Add employee tab
    Then user enters the details in the site
    Then user clicks on the save button
    
    Scenario: checking the performance in OrangeHRM
    Given user clicks on the performance left panel
    Then user clicks on the configure tab and clicks on the KPI tracker
    Then user selects the job Title
    Then user clicks on the search button to see the results

  