Feature: This Feature will test Bol Type Reference Data API

  @API @BOLType @checkSchema @smoke @BOLTypeSmoke @referenceData
  Scenario: This Scenario will check to see if any graphql schema doesnt change for BOLType info type and its nested payload
			Given a BOLType exists 
      When a user retrieves the BOLType code by BOLType
 			Then the status code is 200
		  And a user will check the graphql server for changes for BOLType schema change    
		  And a user will check the graphql server for changes for BOLType schema change bolTypeCode  
		  And a user will check the graphql server for changes for BOLType schema change description  
		  And a user will check the graphql server for changes for BOLType schema change massPostingInd   
		  And a user will check the graphql server for changes for BOLType schema change shortDscText
		  And a user will check the graphql server for changes for BOLType schema change tradeTruckDisplayInd
 
 @API @BOLType @BOLTypeCode01 @checkSchema @smoke @referenceData
Scenario: This scenario will tell test BOLType code 01
	Given a BOLType exists with an BOLType Code of "01"
  When a user retrieves the BOLType code by BOLType
  Then the status code is 200
  And response includes the following
      | data.bolType[0].bolTypeCode           | 01		  |
    	| data.bolType[0].description           | Non AMS	|
    	| data.bolType[0].massPostingInd        | 0		    |
    	| data.bolType[0].shortDscText          | NAMS		|
    	| data.bolType[0].tradeTruckDisplayInd  | false		|
 
  @API @BOLType @smoke @negative @BOLTypeNegative @referenceData
  Scenario: This scenario will tell test BOLType type code with negative input
	Given a BOLType exists with an BOLType Code of "011"
  When a user retrieves the BOLType code by BOLType
  Then the status code is 200
  And response includes the following
      | data.bolType    | 		                       											   |
    	| errors[0].message  | Exception while fetching data (/bolType) : 404 null |
    	| errors[0].path[0]  | bolType		                      								   |
 