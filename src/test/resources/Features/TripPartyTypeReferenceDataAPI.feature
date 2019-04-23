Feature: This Feature will test out Trip Party Type Reference Data API

#Scenario 1
 @API @TripPartyType @TripPartyTypeCRW @checkSchema @smoke @referenceData
Scenario: This scenario will tell test Trip Party Type Code CRW
	Given a TripPartyType exists with an tripPartyTypeCode of "CRW"
  When a user retrieves the TripPartyType code by manifesTripPartyTypetStatus
  Then the status code is 200
  And response includes the following
      | data.tripPartyType[0].description             | Crew		           	  |
    	| data.tripPartyType[0].edifactTripPartyTypeCode| FM		 							  |
     	| data.tripPartyType[0].tripPartyTypeCode      	| CRW		 							  |


#Scenario 2
 @API @TripPartyType @TripPartyTypeNegative @negative @checkSchema @smoke @referenceData
Scenario: This scenario will tell test Trip Party Type Code with negitive trip type code
	Given a TripPartyType exists with an tripPartyTypeCode of "CRWW"
  When a user retrieves the TripPartyType code by manifesTripPartyTypetStatus
  Then the status code is 200
  And response includes the following
      | data.tripPartyType           | 		           														 								 |
    	| errors.message[0]     	 | Exception while fetching data (/tripPartyType) : 404 null |
     	| errors[0].path[0]     		 | tripPartyType		 							 													 |
     	
@API @TripPartyType @checkSchema @smoke @TripPartyTypecheckSchema @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed
 Given TripPartyType exists 
  When a user retrieves the TripPartyType code
  Then the status code is 200
  And a user will check the graphql server for changes for TripPartyType info type
 	And a user will check the graphql server for changes for TripPartyType schema change for description
 	And a user will check the graphql server for changes for TripPartyType schema change for edifactTripPartyTypeCode
 	And a user will check the graphql server for changes for TripPartyType schema change for tripPartyTypeCode   	
 