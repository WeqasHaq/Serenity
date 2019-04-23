Feature: This Feature is test Equipment Info Type for Reference Data API
				 for Equipment you cannot filter the results you get the whole payload

@API @Equipment @checkSchema @smoke @EquipmentcheckSchema @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed
  Given a Equipment exists with an Equipment 
  When a user retrieves the EquipmentInfoType code by EquipmentInfoType
  Then the status code is 200
  And a user will check the graphql server for changes for Equipment info type
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentDescriptionCode
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentHeight
  And a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentInternalId    	  
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentLength
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentNumber
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentTypeCode    	
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentWidth
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for licensePlateInfo
  And a user will check the graphql server for changes for EquipmentInfoType schema change for countryOfIssuanceCode    	
  And a user will check the graphql server for changes for EquipmentInfoType schema change for licensePlateNumber    	
  And a user will check the graphql server for changes for EquipmentInfoType schema change for stateOfIssuanceCode
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for loadedEmptyStatus
  And a user will check the graphql server for changes for EquipmentInfoType schema change for positionNumber    
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for sealInfo
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for sealLocation
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for sealNumber    	
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for serviceTypeCode
 	And a user will check the graphql server for changes for EquipmentInfoType schema change for terminalCargoNumber
