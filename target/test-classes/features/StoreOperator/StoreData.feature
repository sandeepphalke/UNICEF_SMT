Feature: Store Data tab in SMT application for Store Operator user
  We will be using this feature file for Store Operator user using Store Data functionality validations in SMT application mentioning all possible scenarios.

  Background: User login to SMT application and navigate to Store Data tab
 	 	Given User is on home page
   	When  User is getting correct title of home page
   	Then  User click on login button
   	When  User click on Proceed To Login button in "English"
   	Then  User enter email
   	And   User enter password
   	When  User click on sign in button
   	Given User click on "Apply" button
   	And   User click on "Store Data" tab
   	
  Scenario Outline: Verify user is able to add storage data
  	Given   User click on "Add" button
  	And     "Add new storage data" heading is visible
  	And     User select "<Equipment category>" from "Equipment category" in "Store Data" tab
  	And     User select "<Supplier>" from "Supplier" in "Store Data" tab
  	And     User select "<Equipment Type/Model>" from "Equipment Type/Model" in "Store Data" tab
  	And     User enter random text in "equipmentName"
  	And     User select "<Status>" from "Status" in "Store Data" tab
  	When    User click on "Create" button
  	Then    Storage Data is created successfully
  	And     Storage Data is visible in storage data table to user
  	Examples:
  
      | Equipment category | Supplier | Equipment Type/Model | Status     |
      | Walk In Freezer    | Haier    | VLS 354A AC          | Functional |
      
      
 	Scenario Outline: Verify user is able to update storage data
 		Given   User click on edit button of newly created storage data
  	And     User select "<Equipment category>" from "Equipment category" in "Store Data" tab
  	And     User select "<Supplier>" from "Supplier" in "Store Data" tab
  	And     User select "<Equipment Type/Model>" from "Equipment Type/Model" in "Store Data" tab
  	And     User enter random text in "equipmentName"
  	And     User select "<Status>" from "Status" in "Store Data" tab
  	When    User click on "Update" button
  	Then    Storage Data is updated successfully
  	And     Storage Data is visible in storage data table to user
  	Examples:
  
      | Equipment category | Supplier | Equipment Type/Model | Status         |
      | Freezer            | Haier    | BFRV55               | Non Functional |
      
      
   Scenario Outline: Verify user is able to delete storage data
 		Given   User click on delete button of newly created storage data
 		When    User click on "Yes" button
 		Then    Storage Data is deleted successfully
 		And     Storage Data is not visible in storage data table to user
      
      
      
      
   
      
      
      
      
      
      