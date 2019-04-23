Feature: This Feature will test State Code Reference Data API

#Scenario 1
 @API @stateCode @countryISOCodeAR @checkSchema @smoke @referenceData
Scenario: This scenario will tell test state code type Code AR
	Given a State Code exists with an countryISOCode of "AR" and stateISOCode "1"
  When a user retrieves the State Code code by State Code
  Then the status code is 200
  And response includes the following
      | data.stateCode[0].countryISOCode| AR					|
    	| data.stateCode[0].name 					| Buenos Aires|
     	| data.stateCode[0].stateISOCode	| 1	 					|

#Scenario 1
 @API @stateISOCodeNegative @smoke @negative @referenceData 
Scenario: This scenario will tell test state code type Code ARR
	Given a State Code exists with an countryISOCode of "ARR" and stateISOCode "1"
  When a user retrieves the State Code code by State Code
  Then the status code is 200
  And response includes the following
      | data.stateCode		| 					|
    	| errors[0].message 	| Exception while fetching data (/stateCode) : 404 null|
     	| errors[0].path[0]		| stateCode	 					|

@API @StateCode @checkSchema @smoke @StateCodecheckSchema @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed
 Given a State Code exists with an countryISOCode of "AR" and stateISOCode "1"
  When a user retrieves the State Code code by State Code
  Then the status code is 200
  And a user will check the graphql server for changes for State Code info type
 	And a user will check the graphql server for changes for State Code schema change for countryISOCode
 	And a user will check the graphql server for changes for State Code schema change for name
 	And a user will check the graphql server for changes for State Code schema change for stateISOCode   	
     	