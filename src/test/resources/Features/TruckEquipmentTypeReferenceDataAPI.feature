Feature: This Feature will test the Truck Equipment type Reference data API

@API @TruckEquipment @equipmentTypeCode20 @smoke @referenceData
Scenario: This scenario will tell test Truck Equipment code with negative input
	Given a TruckEquipment exists with an equipmentTypeCode of "20"
  When a user retrieves the TruckEquipment by equipmentTypeCode
  Then the status code is 200
  And response includes the following
      | data.truckEquipmentType[0].description           | 20ft OpenTop Sea Cnt  |
    	| data.truckEquipmentType[0].equipmentTypeCode	   | 20										 |
	  	| data.truckEquipmentType[0].licenseRequiredInd		 | false		 						 |
	  	| data.truckEquipmentType[0].sealRequiredInd		 	 | true		 							 |


@API @TruckEquipment @negative @TruckEquipmentNegative @smoke @referenceData
Scenario: This scenario will tell test Truck Equipment code with negative input
	Given a TruckEquipment exists with an equipmentTypeCode of "DRR"
  When a user retrieves the TruckEquipment by equipmentTypeCode
  Then the status code is 200
  And response includes the following
      | data.truckEquipmentType  | 		       																		  |
    	| errors[0].message	  		 | Exception while fetching data (/truckEquipmentType) : 404 null |
	  	| errors[0].path[0]				 | truckEquipmentType		 																			    |

@API @TruckEquipment @checkSchema @smoke @TruckEquipmentcheckSchema @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed
	Given a TruckEquipment exists
  When user retrieves the TruckEquipment
  Then the status code is 200
  And a user will check the graphql server for changes for TruckEquipment info type
 	And a user will check the graphql server for changes for TruckEquipment schema change for description
 	And a user will check the graphql server for changes for TruckEquipment schema change for equipmentTypeCode
	And a user will check the graphql server for changes for TruckEquipment schema change for licenseRequiredInd
	And a user will check the graphql server for changes for TruckEquipment schema change for sealRequiredInd
	
 
