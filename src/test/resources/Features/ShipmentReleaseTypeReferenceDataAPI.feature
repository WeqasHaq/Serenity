Feature: Title of your feature
  I want to use this template for my feature file

#Scenario 1
 @API @ShipmentRelease @ShipmentRelease34 @checkSchema @smoke @referenceData
Scenario: This scenario will tell test Shipment Release Type Code 34
	Given a shipmentReleaseType exists with an shipmentReleaseTypeCode of "34"
  When a user retrieves the shipmentReleaseType code by shipmentReleaseType
  Then the status code is 200
  And response includes the following
      | data.shipmentReleaseType[0].activeStatusInd         | false		           	|
    	| data.shipmentReleaseType[0].description							| PAPS		 						|
     	| data.shipmentReleaseType[0].shipmentReleaseTypeCode | 34	 							  |

#Scenario 2
 @API @ShipmentRelease @ShipmentReleaseNegative @negative @smoke @referenceData
Scenario: This scenario will tell test Shipment Release Type for Negative input
	Given a shipmentReleaseType exists with an shipmentReleaseTypeCode of "344"
  When a user retrieves the shipmentReleaseType code by shipmentReleaseType
  Then the status code is 200
  And response includes the following
   #   | data.shipmentReleaseType| 		          																								 	|
    	| errors.message[0]				| Exception while fetching data (/shipmentReleaseType) : 404 null	|
     	| errors[0].path[0]				| shipmentReleaseType	 							 															|

@API @ShipmentRelease @checkSchema @smoke @ShipmentReleasecheckSchema @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed
 	Given a shipmentReleaseType exists with an shipmentReleaseTypeCode of "34"
  When a user retrieves the shipmentReleaseType code by shipmentReleaseType
  Then the status code is 200
  And a user will check the graphql server for changes for ShipmentRelease info type
 	And a user will check the graphql server for changes for ShipmentRelease schema change for activeStatusInd
 	And a user will check the graphql server for changes for ShipmentRelease schema change for description
 	And a user will check the graphql server for changes for ShipmentRelease schema change for shipmentReleaseTypeCode   	
