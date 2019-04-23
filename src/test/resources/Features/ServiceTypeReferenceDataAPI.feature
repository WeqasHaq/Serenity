Feature: This Feature is testing Service Type Reference Data API

#Scenario 1
 @API @ServiceCD @Service @checkSchema @smoke @referenceData
Scenario: This scenario will tell test Service Type Code CD
	Given a service Type exists with an serviceTypeCode of "CD"
  When a user retrieves the service Type code by service Type
  Then the status code is 200
  And response includes the following
      | data.serviceType[0].description            | Collect on Delivery|
    	| data.serviceType[0].edifactServiceTypeCode | 41			 						|
     	| data.serviceType[0].serviceTypeCode				 | CD	 							  |

#Scenario 2
 @API @Service @ServiceNegative @negative  @smoke @referenceData
Scenario: This scenario will tell test Service Type Code CD
	Given a service Type exists with an serviceTypeCode of "CDD"
  When a user retrieves the service Type code by service Type
  Then the status code is 200
  And response includes the following
      | data.serviceType   	 | 																												|
      | errors[0].message 	 | Exception while fetching data (/serviceType) : 404 null|
     	| errors[0].path[0]	   | serviceType	 							  													|     	

@API @Service @checkSchema @smoke @ServicecheckSchema @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed
 Given a service Type exists with an serviceTypeCode of "CD"
  When a user retrieves the service Type code by service Type
  Then the status code is 200
  And a user will check the graphql server for changes for serviceType info type
 	And a user will check the graphql server for changes for serviceType schema change for description
 	And a user will check the graphql server for changes for serviceType schema change for edifactServiceTypeCode
 	And a user will check the graphql server for changes for serviceType schema change for serviceTypeCode   	