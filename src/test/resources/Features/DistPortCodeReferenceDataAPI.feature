Feature: This Feature will test DistPort from Reference Data API

#Scenario 1
@API @distPortCode @distPortCode0101 @checkSchema @smoke @referenceData
  Scenario Outline: Test DistPortCode with distPortName being PORTLAND, ME
  			Given a distPortCode exists with an port code of "<distPortCode>"
        When a user retrieves the distPortCode by distPortCode
        Then the status code is <status code>
    		And response includes the following this data.distPortCode.aceUsageCode "4"
    	  And response includes the following this data.distPortCode.activeInd "<activeInd>"
    		And response includes the following this data.distPortCode.addressLineOneText "<addressLine1Text>"
    		And response includes the following this data.distPortCode.addressLineTwoText "<addressLine2Text>"
        And response includes the following this data.distPortCode.addressLineThreeText "<addressLine3Text>"
        And response includes the following this data.distPortCode.aiiPprlsSummaryInd	"<aiiPprlsSummaryInd>"			
        And response includes the following this data.distPortCode.borderTypeCode is null 			  				
        And response includes the following this data.distPortCode.cargoSelectInd	"<cargoSelectInd>"			  				
        And response includes the following this data.distPortCode.carrierTypeCode "<carrierTypeCode>"		  				
        And response includes the following this data.distPortCode.cityName "<cityName> "
        And response includes the following this data.distPortCode.cmcCode "<cmcCode>"
    		And response includes the following this data.distPortCode.distCode "<distCode>"
        And response includes the following this data.distPortCode.distPortCode "<distPortCode>"
        And response includes the following this data.distPortCode.distPortName "<distPortName>"		  				
        And response includes the following this data.distPortCode.expressConsignmentInd "<expressConsignmentInd>"	  				
        And response includes the following this data.distPortCode.locCode "<locCode>"			  				
        And response includes the following this data.distPortCode.mpfXmpCode "<mpfXmpCode>"			  				
        And response includes the following this data.distPortCode.portCityName "<portCityName>"
  	    And response includes the following this data.distPortCode.portCode "<portCode>"
    		And response includes the following this data.distPortCode.portOfEntryInd "<portOfEntryInd>"
        And response includes the following this data.distPortCode.portStateISOCode "<portStateISOCode>"
        And response includes the following this data.distPortCode.regionCode "<regionCode>"		  				
        And response includes the following this data.distPortCode.selectivityPortInd "<selectivityPortInd>"			  				
        And response includes the following this data.distPortCode.servicePortCode "<servicePortCode>"			  				
        And response includes the following this data.distPortCode.stateISOCode "<stateISOCode>"			  				
        And response includes the following this data.distPortCode.unladingPortInd "<unladingPortInd>"
        And response includes the following this data.distPortCode.zipCode "<zipCode>"
 
 Examples:
 |distPortCode | status code | aceUsageCode | activeInd |addressLine1Text | addressLine2Text |addressLine3Text |aiiPprlsSummaryInd  |cargoSelectInd |carrierTypeCode |cityName			 |cmcCode |distCode | distPortCode  |distPortName |expressConsignmentInd |locCode |mpfXmpCode |portCityName | portCode|portOfEntryInd |portStateISOCode |regionCode |selectivityPortInd   | servicePortCode|stateISOCode |unladingPortInd|zipCode |
 |0101 					| 200 				| 4 					| true 			|PORT DIRECTOR 		| 155 GANNETT DRIVE |								 |true 							  |true 					|B						   |SOUTH PORTLAND |04			 |01      | 0101 					|PORTLAND, ME |false 								 |0 		  |  					|PORTLAND     | 01			|true					  |ME							  |1					 |false 						  | 01						 |ME					 |true					|04106 |
        
 
#Scenario 2
@API @distPortCode @distPortCodeNegative @negative @smoke @referenceData
  Scenario Outline: this is a Negative scenario for DistPortCode data Api for DistPortCode 001222
   			Given a DistPortCode exists with a DistPortCode of "001222"
        When a user retrieves the distPortCode by distPortCode
        Then the status code is <status code>
        And response includes the following this data.carrierCode is null
        And response includes the following this errors.message "<message>"
        And response includes the following this errors.path "<path>"
        
Examples:  
|DistPortCode|status code|				message																					|path					|
|001222			|200				 |Exception while fetching data (/distPortCode) : 404 null|distPortCode	|

@API @distPortCodecheckSchema @distPortCode  @checkSchema @smoke @referenceData
Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed DistPortCode
  Given a DistPortCode exists with an DistPortCode 
  When a user retrieves the DistPortCode code by DistPortCode
  Then the status code is 200
  And a user will check the graphql server for changes for DistPortCode schema change
 	And a user will check the graphql server for changes for DistPortCode schema change
 	And a user will check the graphql server for changes for DistPortCode schema change for activeInd
 	And a user will check the graphql server for changes for DistPortCode schema change for aceUsageCode
  And a user will check the graphql server for changes for DistPortCode schema change for activeInd    	  
 	And a user will check the graphql server for changes for DistPortCode schema change for addressLine1Text
 	And a user will check the graphql server for changes for DistPortCode schema change for addressLine2Text
 	And a user will check the graphql server for changes for DistPortCode schema change for addressLine3Text    	
 	And a user will check the graphql server for changes for DistPortCode schema change for aiiPprlsSummaryInd
 	And a user will check the graphql server for changes for DistPortCode schema change for borderTypeCode
  And a user will check the graphql server for changes for DistPortCode schema change for cargoSelectInd    	
  And a user will check the graphql server for changes for DistPortCode schema change for carrierTypeCode    	
  And a user will check the graphql server for changes for DistPortCode schema change for cityName
 	And a user will check the graphql server for changes for DistPortCode schema change for cmcCode
  And a user will check the graphql server for changes for DistPortCode schema change for distCode    
 	And a user will check the graphql server for changes for DistPortCode schema change for distPortCode
 	And a user will check the graphql server for changes for DistPortCode schema change for distPortName
 	And a user will check the graphql server for changes for DistPortCode schema change for expressConsignmentInd    	
 	And a user will check the graphql server for changes for DistPortCode schema change for locCode
 	And a user will check the graphql server for changes for DistPortCode schema change for mpfXmpCode
  And a user will check the graphql server for changes for DistPortCode schema change for portCityName    	
  And a user will check the graphql server for changes for DistPortCode schema change for portCode  
 	And a user will check the graphql server for changes for DistPortCode schema change for portOfEntryInd
 	And a user will check the graphql server for changes for DistPortCode schema change for portStateISOCode
 	And a user will check the graphql server for changes for DistPortCode schema change for regionCode    	
 	And a user will check the graphql server for changes for DistPortCode schema change for selectivityPortInd
 	And a user will check the graphql server for changes for DistPortCode schema change for servicePortCode
  And a user will check the graphql server for changes for DistPortCode schema change for stateISOCode    	
  And a user will check the graphql server for changes for DistPortCode schema change for unladingPortInd 
  And a user will check the graphql server for changes for DistPortCode schema change for zipCode    	  	