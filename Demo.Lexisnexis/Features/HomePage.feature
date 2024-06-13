
Feature: Homepage

Scenario: Ensure elements under Financial Services are present and clickable
    Given I open LexisNexis Risk Solutions homepage
    When I Click on Choose Your Industry tab
    Then the Financial Services link should be present, clickable and active

Scenario: Ensure elements under Insurance are present and clickable
    Given I open LexisNexis Risk Solutions homepage
    When I Click on Choose Your Industry tab
    Then the Insurance link should be present, clickable and active
    
Scenario: Ensure elements under Life and Pensions are present and clickable
    Given I open LexisNexis Risk Solutions homepage
    When I Click on Choose Your Industry tab
    Then the Life and Pensions link should be present, clickable and active
    
Scenario: Ensure elements under Corporations and Non-Profits are present and clickable
    Given I open LexisNexis Risk Solutions homepage
    When I Click on Choose Your Industry tab
    Then the Corporations and Non-Profits link should be present, clickable and active

 