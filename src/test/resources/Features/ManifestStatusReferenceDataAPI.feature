Feature: This Feature will test The Manifest Status API


@API @ManifestStatus @ManifestStatusDR @checkSchema @smoke @referenceData
Scenario: This scenario will tell test Manifest Status code DR
	Given a manifestStatus exists with an manifestStatusCode of "DR"
  When a user retrieves the manifestStatus code by manifestStatus
  Then the status code is 200
  And response includes the following
      | data.manifestStatus[0].description             | Draft		            |
    	| data.manifestStatus[0].manifestStatusCode      | DR		 							  |

    	
@API @ManifestStatus @negative @ManifestStatusNegative @smoke @referenceData
Scenario: This scenario will tell test Manifest Status code with negative input
	Given a manifestStatus exists with an manifestStatusCode of "DRR"
  When a user retrieves the manifestStatus code by manifestStatus
  Then the status code is 200
  And response includes the following
      | data.manifestStatus       | 		       																					      |
    	| errors[0].message		      | Exception while fetching data (/manifestStatus) : 404 null|
    	| errors[0].path[0]  			  | manifestStatus		 															  			  |

@API @ManifestStatus @checkSchema @smoke @ManifestStatuscheckSchema @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed
 	Given a manifestStatus exists with an manifestStatusCode of "DR"
  When a user retrieves the manifestStatus code by manifestStatus
  Then the status code is 200
  And a user will check the graphql server for changes for manifestStatus info type
 	And a user will check the graphql server for changes for manifestStatus schema change for description
 	And a user will check the graphql server for changes for manifestStatus schema change for manifestStatusCode 	  