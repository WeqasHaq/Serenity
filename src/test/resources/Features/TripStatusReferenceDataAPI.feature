Feature: This feature will test Trip Status Reference Data API


@API @TripStatus @TripStatusAR @checkSchema @smoke @referenceData
Scenario: This scenario will tell test Trip Status code AR
	Given a TripStatus exists with an trip Leg Status of "AR"
  When a user retrieves the TripStatus code by TripStatus
  Then the status code is 200
  And response includes the following
      | data.tripLegStatus[0].description        | Arrived		          |
    	| data.tripLegStatus[0].tripLegStatusCode  | AR		 							  |

    	
@API @TripStatus @negative @TripStatusNegative @smoke @referenceData
Scenario: This scenario will tell test Trip Status code with negative input
	Given a TripStatus exists with an trip Leg Status of "DRR"
  When a user retrieves the TripStatus code by TripStatus
  Then the status code is 200
  And response includes the following
      | data.tripLegStatus             | 		       																						     |
    	| errors[0].message	   | Exception while fetching data (/tripLegStatus) : 404 null |
	  	| errors[0].path[0]		 | tripLegStatus		 																			   |

@API @TripStatus @checkSchema @smoke @TripStatuscheckSchema @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed
 Given TripStatus exists 
  When a user retrieves the TripStatus
  Then the status code is 200
  And a user will check the graphql server for changes for TripStatus info type
 	And a user will check the graphql server for changes for TripStatus schema change for description
 	And a user will check the graphql server for changes for TripStatus schema change for tripLegStatusCode
	
 
