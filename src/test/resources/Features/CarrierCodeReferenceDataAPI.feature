Feature: This will test the CarrierCode Reference data API

#Scenario 1
@CarrierCode @API @CarrierCodeACSR @checkSchema @smoke @referenceData
  Scenario: this is a positve scenario for Reference data  Api for CarrierCode ACSR
  			Given a CarrierCode exists with a CarrierCode of "ACSR"
        When a user retrieves the CarrierCode code by CarrierCode
        Then the status code is 200
        And response includes the following this data.carrierCode.carrierCode "ACSR"
        And response includes the following this data.carrierCode.carrierName "ALLIED CONTAINER SERVICE INC"
        And response includes the following this data.carrierCode.activeInd "false"
    		And response includes the following this data.carrierCode.carrierAirPrefixCode is null
    		And response includes the following this data.carrierCode.censusCarrirerAbbrCode is null
    		And response includes the following this data.carrierCode.csiCountryIsoCode is null
        And response includes the following this data.carrierCode.ctpatInd "false"
        And response includes the following this data.carrierCode.iataInd "false"
        And response includes the following this data.carrierCode.inbondPrefixCode is null
 				And response includes the following this data.carrierCode.motCode "10"
 			  And response includes the following this data.carrierCode.nvoccInd "false"
 			  And response includes the following this data.carrierCode.partyAceId "0000057449"
 				And response includes the following this data.carrierCode.pprlsParticipantInd "false"

#Scenario 8
@CarrierCode @API @negative @checkSchema @smoke @CarrierCodeNegative @referenceData
  Scenario: this is a Negative scenario for Reference data  Api for CarrierCode
  			Given a CarrierCode exists with a CarrierCode of "ACVvQ"
        When a user retrieves the CarrierCode code by CarrierCode
        Then the status code is 200
        And response includes the following this data.carrierCode is null
        And response includes the following this errors.message "Exception while fetching data (/carrierCode) : 404 null"
        And response includes the following this errors.path "carrierCode"

#Scenario 9
@API @CarrierCodeSchema @CarrierCode  @checkSchema @smoke @referenceData
	Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed CarrierCode
			Given a Carrier Code exists 
      When a user retrieves the CarrierCode code by CarrierCode
  		Then the status code is 200
  		And a user will check the graphql server for changes for Carrier Code      
			And a user will check the graphql server for changes for Carrier Code schema change for carrierName
			And a user will check the graphql server for changes for Carrier Code schema change for activeInd
			And a user will check the graphql server for changes for Carrier Code schema change for carrierAirPrefixCode
			And a user will check the graphql server for changes for Carrier Code schema change for censusCarrirerAbbrCode
			And a user will check the graphql server for changes for Carrier Code schema change for csiCountryIsoCode
			And a user will check the graphql server for changes for Carrier Code schema change for ctpatInd
			And a user will check the graphql server for changes for Carrier Code schema change for iataInd
			And a user will check the graphql server for changes for Carrier Code schema change for inbondPrefixCode
			And a user will check the graphql server for changes for Carrier Code schema change for motCode
			And a user will check the graphql server for changes for Carrier Code schema change for nvoccInd
			And a user will check the graphql server for changes for Carrier Code schema change for partyAceId
			And a user will check the graphql server for changes for Carrier Code schema change for pprlsParticipantInd

#Scenario 2
#CarrierCode @API @CarrierCodeACRO
 # Scenario: this is a positve scenario for Reference data  Api for CarrierCode ACRO
  #			Given a CarrierCode exists with a CarrierCode of "ACRO"
   #     When a user retrieves the CarrierCode code by CarrierCode
    #    Then the status code is 200
    #    And response includes the following this data.carrierCode.carrierCode "ACRO"
    #    And response includes the following this data.carrierCode.carrierName "ACORN TRANSPORTATION"
    #    And response includes the following this data.carrierCode.activeInd "false"
    #		And response includes the following this data.carrierCode.carrierAirPrefixCode is null
    #		And response includes the following this data.carrierCode.censusCarrirerAbbrCode is null
   # 		And response includes the following this data.carrierCode.csiCountryIsoCode is null
   #     And response includes the following this data.carrierCode.ctpatInd "false"
   #     And response includes the following this data.carrierCode.iataInd "false"
   #     And response includes the following this data.carrierCode.inbondPrefixCode is null
 	#			And response includes the following this data.carrierCode.motCode is null
 	#		  And response includes the following this data.carrierCode.nvoccInd "false"
 	#		  And response includes the following this data.carrierCode.partyAceId "0000057450"
 	#			And response includes the following this data.carrierCode.pprlsParticipantInd "false"
 
##Scenario 3
#@CarrierCode @API @CarrierCodeACSJ
#  Scenario: this is a positve scenario for Reference data  Api for CarrierCode ACSJ
#  			Given a CarrierCode exists with a CarrierCode of "ACSJ"
#        When a user retrieves the CarrierCode code by CarrierCode
#        Then the status code is 200
#        And response includes the following this data.carrierCode.carrierCode "ACSJ"
##        And response includes the following this data.carrierCode.carrierName "AIR CHARTER SERVICE"
#        And response includes the following this data.carrierCode.activeInd "false"
#    		And response includes the following this data.carrierCode.carrierAirPrefixCode is null
#    		And response includes the following this data.carrierCode.censusCarrirerAbbrCode is null
#    		And response includes the following this data.carrierCode.csiCountryIsoCode is null
#        And response includes the following this data.carrierCode.ctpatInd "false"
#        And response includes the following this data.carrierCode.iataInd "false"
##        And response includes the following this data.carrierCode.inbondPrefixCode is null
# 				And response includes the following this data.carrierCode.motCode "40"
# 			  And response includes the following this data.carrierCode.nvoccInd "false"
# 			  And response includes the following this data.carrierCode.partyAceId "0000057451"
 #				And response includes the following this data.carrierCode.pprlsParticipantInd "false"

#Scenario 4
#@CarrierCode @API @CarrierCodeACSS
 # Scenario: this is a positve scenario for Reference data  Api for CarrierCode ACSS
 # 			Given a CarrierCode exists with a CarrierCode of "ACSS"
 #       When a user retrieves the CarrierCode code by CarrierCode
#        Then the status code is 200
#        And response includes the following this data.carrierCode.carrierCode "ACSS"
#        And response includes the following this data.carrierCode.carrierName "AIRCRAFT SERVICES INC"
#        And response includes the following this data.carrierCode.activeInd "false"
#    		And response includes the following this data.carrierCode.carrierAirPrefixCode is null
#    		And response includes the following this data.carrierCode.censusCarrirerAbbrCode is null
#    		And response includes the following this data.carrierCode.csiCountryIsoCode is null
#        And response includes the following this data.carrierCode.ctpatInd "false"
#        And response includes the following this data.carrierCode.iataInd "false"
#        And response includes the following this data.carrierCode.inbondPrefixCode is null
# 				And response includes the following this data.carrierCode.motCode "40"
# 			  And response includes the following this data.carrierCode.nvoccInd "false"
# 			  And response includes the following this data.carrierCode.partyAceId "0000057452"
# 				And response includes the following this data.carrierCode.pprlsParticipantInd "false"

#Scenario 5
#@CarrierCode @API @CarrierCodeACRL
  #Scenario: this is a positve scenario for Reference data  Api for CarrierCode ACRL
  #			Given a CarrierCode exists with a CarrierCode of "ACRL"
  #      When a user retrieves the CarrierCode code by CarrierCode
  #      Then the status code is 200
  #      And response includes the following this data.carrierCode.carrierCode "ACRL"
  #      And response includes the following this data.carrierCode.carrierName "AMERICAN CENTRAL TRANSPORT INC"
  #      And response includes the following this data.carrierCode.activeInd "false"
  ##  		And response includes the following this data.carrierCode.carrierAirPrefixCode is null
  #  		And response includes the following this data.carrierCode.censusCarrirerAbbrCode is null
  #  		And response includes the following this data.carrierCode.csiCountryIsoCode is null
 #       And response includes the following this data.carrierCode.ctpatInd "false"
 ##       And response includes the following this data.carrierCode.iataInd "false"
 #       And response includes the following this data.carrierCode.inbondPrefixCode is null
 #				And response includes the following this data.carrierCode.motCode "30"
 #			  And response includes the following this data.carrierCode.nvoccInd "false"
 #			  And response includes the following this data.carrierCode.partyAceId "0000057453"
 #				And response includes the following this data.carrierCode.pprlsParticipantInd "false"

#Scenario 6
#@CarrierCode @API @CarrierCodeACRN
  #Scenario: this is a positve scenario for Reference data  Api for CarrierCode ACRN
  	#		Given a CarrierCode exists with a CarrierCode of "ACRN"
    #    When a user retrieves the CarrierCode code by CarrierCode
    #    Then the status code is 200
    #    And response includes the following this data.carrierCode.carrierCode "ACRN"
    #    And response includes the following this data.carrierCode.carrierName "ACORN PIPELINE COMPANY"
    #    And response includes the following this data.carrierCode.activeInd "false"
    #		And response includes the following this data.carrierCode.carrierAirPrefixCode is null
    #		And response includes the following this data.carrierCode.censusCarrirerAbbrCode is null
    #		And response includes the following this data.carrierCode.csiCountryIsoCode is null
    #    And response includes the following this data.carrierCode.ctpatInd "false"
    #    And response includes the following this data.carrierCode.iataInd "false"
    #    And response includes the following this data.carrierCode.inbondPrefixCode is null
 		#		And response includes the following this data.carrierCode.motCode "00"
 		#	  And response includes the following this data.carrierCode.nvoccInd "false"
 	###		  And response includes the following this data.carrierCode.partyAceId "0000057454"
 	#			And response includes the following this data.carrierCode.pprlsParticipantInd "false" 
 				
#Scenario 7
#@CarrierCode @API @CarrierCodeACRM	
#  Scenario: this is a positve scenario for Reference data  Api for CarrierCode ACRM
 # 			Given a CarrierCode exists with a CarrierCode of "ACRM"
 #       When a user retrieves the CarrierCode code by CarrierCode
 #       Then the status code is 200
 #       And response includes the following this data.carrierCode.carrierCode "ACRM"
 ###       And response includes the following this data.carrierCode.carrierName "ALS CARTAGE"
 #       And response includes the following this data.carrierCode.activeInd "false"
 #   		And response includes the following this data.carrierCode.carrierAirPrefixCode is null
 #   		And response includes the following this data.carrierCode.censusCarrirerAbbrCode is null
 ##   		And response includes the following this data.carrierCode.csiCountryIsoCode is null
 #       And response includes the following this data.carrierCode.ctpatInd "false"
 #       And response includes the following this data.carrierCode.iataInd "false"
 #       And response includes the following this data.carrierCode.inbondPrefixCode is null
 #				And response includes the following this data.carrierCode.motCode "30"
 ##			  And response includes the following this data.carrierCode.nvoccInd "false"
 #			  And response includes the following this data.carrierCode.partyAceId "0000057455"
 #				And response includes the following this data.carrierCode.pprlsParticipantInd "false"  						
 				
    