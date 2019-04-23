Feature: This Feature will test the BOL status Reference data API

 #Scenario 1
 @API @BolStatus @BolStatusFC @checkSchema @smoke @referenceData
Scenario: This scenario will tell test bol Status Code FC
	Given a bol Status exists with an bolStatusCode of "FC"
  When a user retrieves the bol Status by bol Status Code
  Then the status code is 200
  And response includes the following
      | data.bolStatus[0].bolStatusCode   | FC					|
    	| data.bolStatus[0].description 		| Fully Closed|
     	| data.bolStatus[0].shortDescription| CLSD	 			|

     	 #Scenario 1
 @API @BolStatus @BolStatusNegative @negative @smoke @referenceData
Scenario: This scenario will tell test bol Status Code with negative input
	Given a bol Status exists with an bolStatusCode of "FFC"
  When a user retrieves the bol Status by bol Status Code
  Then the status code is 200
  And response includes the following
      | data.bolStatus	 | 					|
    	| errors[0].message| Exception while fetching data (/bolStatus) : 404 null|
     	| errors[0].path[0]| bolStatus	 			|
     	
@API @BolStatuscheckSchema @BolStatus  @checkSchema @smoke @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed BolStatus
	Given a bol Status exists 
  When a user retrieves the bol Status by bol Status Code
  Then the status code is 200
  And a user will check the graphql server for changes for BolStatus 
  And a user will check the graphql server for changes for BolStatus schema change for bolStatusCode
  And a user will check the graphql server for changes for BolStatus schema change for description
  And a user will check the graphql server for changes for BolStatus schema change for shortDescription