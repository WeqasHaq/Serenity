Feature: This Feature will test Travel Document Type API
  
#Scenario 1
@API @TravelDocumentType	@TravelDocumentType6W	 @checkSchema @smoke @referenceData
    Scenario: this is a positve scenario for 6W
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "6W"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "6W"
        And response includes the following this data.travelDocumentType.countryRequiredInd "true"
        And response includes the following this data.travelDocumentType.defaultCountryISoCode is null
    		And response includes the following this data.travelDocumentType.description "Enhanced Driver's License (EDL) ID"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "6W"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR110"
        And response includes the following this data.travelDocumentType.stateRequiredInd "true"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 2		  	
@API @TravelDocumentType	@TravelDocumentType5J	 @referenceData
  Scenario: this is a positve scenario for 5J
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "5J"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "5J"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "true"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode is null
    		And response includes the following this data.travelDocumentType.description "Driver's License"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "40"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode is null
        And response includes the following this data.travelDocumentType.stateRequiredInd "true"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "false"    			  				
#Scenario 3		  	
@API @TravelDocumentType	@TravelDocumentType5K  @referenceData
  Scenario: this is a positve scenario for 5K
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "5K"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "5K"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "true"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode is null
    		And response includes the following this data.travelDocumentType.description "Commercial Driver's License"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "5K"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR100"
        And response includes the following this data.travelDocumentType.stateRequiredInd "true"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "false"    			  				

#Scenario 4		  	
@API @TravelDocumentType	@TravelDocumentTypeALV 	
  Scenario: this is a positve scenario for ALV
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "ALV"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "ALV"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "SENTRI Card"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "ALV"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR770"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"    			  				

#Scenario 5		  	
@API @TravelDocumentType	@TravelDocumentTypeHD	
  Scenario: this is a positve scenario for HD
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "HD"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "HD"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode is null
    		And response includes the following this data.travelDocumentType.description "DOT Hazardous Number "
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "HD"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode is null
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"    			  				

#Scenario 6		  	
@API @TravelDocumentType	@TravelDocumentTypeAAG		
  Scenario: this is a positve scenario for AAG
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "AAG"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "AAG"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "Military ID Document (number)"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "AAG"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR730"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 7		  	
@API @TravelDocumentType	@TravelDocumentTypeACU			
  Scenario: this is a positve scenario for ACU
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "ACU"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "ACU"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "Permanent Resident Card C2"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "ACU"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR600"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 8  	
@API @TravelDocumentType	@TravelDocumentTypeACW			
  Scenario: this is a positve scenario for ACW
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "ACW"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "ACW"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "true"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode is null
    		And response includes the following this data.travelDocumentType.description "Passport"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "39"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR500"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"
        
#Scenario 9  	
@API @TravelDocumentType	@TravelDocumentTypeAEF		
  Scenario: this is a positve scenario for AEF
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "AEF"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "AEF"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "U.S. Passport Card"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "AEF"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR510"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"
        
#Scenario 10  	
@API @TravelDocumentType	@TravelDocumentTypeAEW	
  Scenario: this is a positve scenario for AEW
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "AEW"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "AEW"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "NEXUS Card"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "AEW"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR760"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 11  	
@API @TravelDocumentType	@TravelDocumentTypeAGR		
  Scenario: this is a positve scenario for AGR
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "AGR"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "AGR"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "U.S. Alien Registration Card  A1"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "AGR"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR640"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"
################################################
#Scenario 12  	
@API @TravelDocumentType	@TravelDocumentTypeAGS		
  Scenario: this is a positve scenario for AGS
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "AGS"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "AGS"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "Permanent Resident Card (1998-2003) C1"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "AGS"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR630"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 13  	
@API @TravelDocumentType	@TravelDocumentTypeAGT		
  Scenario: this is a positve scenario for AGT
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "AGT"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "AGT"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "Visa Non-Immigrant"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "AGT"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR700"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 14  	
@API @TravelDocumentType	@TravelDocumentTypeALR				
  Scenario: this is a positve scenario for ALR
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "ALR"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "ALR"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "U.S. Alien Registration Card A2"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "ALR"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR650"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 15  	
@API @TravelDocumentType	@TravelDocumentTypeALX	
  Scenario: this is a positve scenario for ALX
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "ALX"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "ALX"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "U.S. Merchant Mariner Document ID"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "ALX"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR720"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 16	
@API @TravelDocumentType	@TravelDocumentTypeALY	
  Scenario: this is a positve scenario for ALY
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "ALY"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "ALY"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode is null
    		And response includes the following this data.travelDocumentType.description "Native American Indian/INAC"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "ALY"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR740"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 17	
@API @TravelDocumentType	@TravelDocumentTypeBCN
  Scenario: this is a positve scenario for BCN
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "BCN"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "BCN"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode is null
    		And response includes the following this data.travelDocumentType.description "Birth Certificate "
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "BCN"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR200"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "false"
        
#Scenario 17	
@API @TravelDocumentType	@TravelDocumentTypeBCP	
  Scenario: this is a positve scenario for BCP
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "BCP"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "BCP"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "Laser Visa Border crossing card"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "BCP"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR400"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"
    
#Scenario 18	
@API @TravelDocumentType	@TravelDocumentTypeCDN	
  Scenario: this is a positve scenario for CDN
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "CDN"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "CDN"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode is null
    		And response includes the following this data.travelDocumentType.description "Citizenship Card"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "CDN"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR300"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "false"
    
    
#Scenario 19	
@API @TravelDocumentType	@TravelDocumentTypeCON	
  Scenario: this is a positve scenario for CON
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "CON"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "CON"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "Certificate of Naturalization"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "CON"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR310"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "false"

#Scenario 20	
@API @TravelDocumentType	@TravelDocumentTypeOTD	
  Scenario: this is a positve scenario for OTD
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "OTD"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "OTD"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode is null
    		And response includes the following this data.travelDocumentType.description "Other Travel Document ID"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "OTD"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR750"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "false"
     
#Scenario 21	
@API @TravelDocumentType	@TravelDocumentTypeREP	
  Scenario: this is a positve scenario for REP
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "REP"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "REP"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "DHS Re-entry permit"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "REP"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR610"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 22	
@API @TravelDocumentType	@TravelDocumentTypeRTP	
  Scenario: this is a positve scenario for RTP
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "RTP"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType.travelDocumentTypeCode "RTP"
    		And response includes the following this data.travelDocumentType.countryRequiredInd "false"
    	  And response includes the following this data.travelDocumentType.defaultCountryISoCode "US"
    		And response includes the following this data.travelDocumentType.description "DHS Refugee Travel Document"
    		And response includes the following this data.travelDocumentType.edifactTravelDocTypeCode "RTP"
    		And response includes the following this data.travelDocumentType.partyIdQualifierCode "ZTR620"
        And response includes the following this data.travelDocumentType.stateRequiredInd "false"
        And response includes the following this data.travelDocumentType.whtiDocumentInd "true"

#Scenario 23
@API @TravelDocumentType @negative @checkSchema @smoke
  Scenario: this is a negative scenario for TravelDocumentType
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "ReTP"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
        And response includes the following this data.travelDocumentType is null
    		And response includes the following this errors.message "Exception while fetching data (/travelDocumentType) : 404 null"
    	  And response includes the following this errors.path "travelDocumentType"
    	  
@API @TravelDocumentType @checkSchema @smoke @TravelDocumentTypecheckSchema
	Scenario: This test will check to see if any schema changes has been made if failed then the schema has been changed
				Given travelDocumentType exists 
     		 When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is 200
			  And a user will check the graphql server for changes for travelDocumentType info type
			 	And a user will check the graphql server for changes for travelDocumentType schema change for cdlDocumentInd
			 	And a user will check the graphql server for changes for travelDocumentType schema change for countryRequiredInd
			 	And a user will check the graphql server for changes for travelDocumentType schema change for defaultCountryISoCode   	
			 	And a user will check the graphql server for changes for travelDocumentType schema change for description
			 	And a user will check the graphql server for changes for travelDocumentType schema change for edifactTravelDocTypeCode
			 	And a user will check the graphql server for changes for travelDocumentType schema change for partyIdQualifierCode   
			 	And a user will check the graphql server for changes for travelDocumentType schema change for stateRequiredInd
			 	And a user will check the graphql server for changes for travelDocumentType schema change for travelDocumentTypeCode
			 	And a user will check the graphql server for changes for travelDocumentType schema change for whtiDocumentInd   
    	