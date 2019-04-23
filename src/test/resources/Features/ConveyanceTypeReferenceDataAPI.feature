Feature: This feature will test Conveyance Type Reference Data API


@API @ConveyanceType @ConveyanceTypeCodeAR @checkSchema @smoke @referenceData
Scenario: This scenario will tell test Conveyance type code AR
	Given a Conveyancetype exists with an conveyanceTypeCode of "AR"
  When a user retrieves the Conveyancetype code by Conveyancetype
  Then the status code is 200
  And response includes the following
      | data.conveyanceType[0].conveyanceTypeCode             | AR		                          |
    	| data.conveyanceType[0].description           				  | Armored Truck		 							  |
    	| data.conveyanceType[0].sealRequiredInd                | false		                        |
 

@API @ConveyanceType @ConveyanceTypeCodeNegative @negative @smoke @referenceData
  Scenario: this is a Negative scenario for conveyanceTypeCode data Api for conveyanceTypeCode ArR
   			Given a Conveyance Type exists with a conveyanceTypeCode of "ArR"
			  When a user retrieves the Conveyancetype code by Conveyancetype
        Then the status code is 200
        And response includes the following
        |data.Conveyancetype | 																													 |
        |errors.message[0] 	 |Exception while fetching data (/conveyanceType) : 404 null |
        |errors[0].path[0]   |conveyanceType																						 |
        
@API @ConveyanceType @ConveyanceTypecheckSchema @checkSchema @smoke @referenceData
  Scenario: This Scenario will check to see if any graphql schema doesnt change for Conveyance Type and its nested payload
		Given a Conveyancetype exists with an conveyanceTypeCode of "AR"
		When a user retrieves the Conveyancetype code by Conveyancetype
  	Then the status code is 200
  	And a user will check the graphql server for changes for ConveyanceType schema change
  	And a user will check the graphql server for changes for ConveyanceType schema change for conveyanceTypeCode
  	And a user will check the graphql server for changes for ConveyanceType schema change for description
 	  And a user will check the graphql server for changes for ConveyanceType schema change for sealRequiredInd
        
  