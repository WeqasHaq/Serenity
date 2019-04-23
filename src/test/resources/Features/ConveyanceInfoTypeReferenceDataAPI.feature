Feature: This feature will test conveyance info type API, for conveyance there is no filter you will recieve the whole payload
  

  @API @ConveyanceInfoType @checkSchema @smoke @referenceData 
  Scenario: This Scenario will check to see if any graphql schema doesnt change for Conveyance info type and its nested payload
	Given a Conveyance exists with an nested payload
  When a user retrieves the ConveyanceInfotype code by ConveyanceInfotype
  Then the status code is 200
  And a user will check the graphql server for changes for ConveyanceInfoType schema change    
  And a user will check the graphql server for changes for ConveyanceInfoType schema change actualCarrierCode  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change actualConveyanceName  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change addressLine1   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change addressLine2
  And a user will check the graphql server for changes for ConveyanceInfoType schema change addressLine3
  And a user will check the graphql server for changes for ConveyanceInfoType schema change addressLine4
  And a user will check the graphql server for changes for ConveyanceInfoType schema change billOfLading
  #bill of lading is not done, will need to come back to this, has more data within it to query it    
  And a user will check the graphql server for changes for ConveyanceInfoType schema change carrierAceId  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change carrierCode   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change cityName 
  And a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceAceId   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceActionCode 
  And a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceCountryCode   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceEvent  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceInstance   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceInternalId
  And a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceName   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceNumber  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceTypeCode    
  And a user will check the graphql server for changes for ConveyanceInfoType schema change countryCode  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change crewInfo  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change dotNumber 
  And a user will check the graphql server for changes for ConveyanceInfoType schema change equipmentInfo    
  And a user will check the graphql server for changes for ConveyanceInfoType schema change foreignManifestNumber 
  And a user will check the graphql server for changes for ConveyanceInfoType schema change foreignManifestOperationType   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change imoNumber  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change insuranceAmount    
  And a user will check the graphql server for changes for ConveyanceInfoType schema change insuranceCompanyName
  And a user will check the graphql server for changes for ConveyanceInfoType schema change insuranceCurrencyCode   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change insurancePolicyIssuanceYear  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change insurancePolicyNumber   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change licensePlateInfo 
  And a user will check the graphql server for changes for ConveyanceInfoType schema change countryOfIssuanceCode   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change licensePlateNumber  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change stateOfIssuanceCode    
  And a user will check the graphql server for changes for ConveyanceInfoType schema change manifestAceId
  And a user will check the graphql server for changes for ConveyanceInfoType schema change manifestSequenceNumber   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change  modeOfTransportationCode 
  And a user will check the graphql server for changes for ConveyanceInfoType schema change postalCode    
  And a user will check the graphql server for changes for ConveyanceInfoType schema change scheduledDate 
  And a user will check the graphql server for changes for ConveyanceInfoType schema change scheduledPortCode   
  And a user will check the graphql server for changes for ConveyanceInfoType schema change scheduledTime  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change sealInfo    
  And a user will check the graphql server for changes for ConveyanceInfoType schema change sealLocation 
  And a user will check the graphql server for changes for ConveyanceInfoType schema change sealNumber  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change stateCode  
  And a user will check the graphql server for changes for ConveyanceInfoType schema change transponderIdNumber    
  And a user will check the graphql server for changes for ConveyanceInfoType schema change vehicleIdentificationNumber 