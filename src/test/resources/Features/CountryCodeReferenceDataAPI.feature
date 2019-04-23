Feature: This Feature File will test Country Code Reference Data

@API @CountryCode @CountryCodeAD @checkSchema @smoke @referenceData
  Scenario: Test country code with country being ANDORRA
  			Given a countryCode exists with an CountryCode of "AD"
        When a user retrieves the countryCode code by countryCode
        Then the status code is 200
       	And response includes the following this data.countryCode.activeInd "true"
    	  And response includes the following this data.countryCode.countryISOAlphaCode "AND"
    		And response includes the following this data.countryCode.countryISOCode "AD"
    		And response includes the following this data.countryCode.countryISONMRCCode "020"
        And response includes the following this data.countryCode.countryISOShortLowerCaseName "Andorra"
        And response includes the following this data.countryCode.countryISOShortName "ANDORRA"    			  				
        And response includes the following this data.countryCode.countryShortName "ANDORRA"    			  				
        And response includes the following this data.countryCode.effectiveBeginDate is null    			  				
        And response includes the following this data.countryCode.effectiveEndDate is null     			  				
        And response includes the following this data.countryCode.statusISOText "Officially assigned"    			  				

@API @CountryCode @negative @smoke @referenceData
  Scenario: this is a negative scenario for countryCode
	 			Given a countryCode exists with an CountryCode of "ALO"
        When a user retrieves the countryCode code by countryCode
        Then the status code is 200
        And response includes the following this data.countryCode is null
    		And response includes the following this errors.message "Exception while fetching data (/countryCode) : 404 null"
    	  And response includes the following this errors.path "countryCode"

@API @CountryCode @CountryCodecheckSchema @checkSchema @smoke @referenceData
  Scenario: This Scenario will check to see if any graphql schema doesnt change for Country Code and its nested payload
  	Given a countryCode exists with an CountryCode of "AD"
    When a user retrieves the countryCode code by countryCode
  	Then the status code is 200
  	And a user will check the graphql server for changes for Country Code schema change
  	And a user will check the graphql server for changes for Country Code schema change for activeInd
  	And a user will check the graphql server for changes for Country Code schema change for countryISOAlphaCode
 	  And a user will check the graphql server for changes for Country Code schema change for countryISOCode    	  
  	And a user will check the graphql server for changes for Country Code schema change for countryISONMRCCode
  	And a user will check the graphql server for changes for Country Code schema change for countryISOShortLowerCaseName
 	  And a user will check the graphql server for changes for Country Code schema change for countryISOShortName    	
 	  And a user will check the graphql server for changes for Country Code schema change for countryShortName
  	And a user will check the graphql server for changes for Country Code schema change for effectiveBeginDate
 	  And a user will check the graphql server for changes for Country Code schema change for effectiveEndDate    	
 	  And a user will check the graphql server for changes for Country Code schema change for statusISOText    	

#@API @CountryCode @CountryCodeAE
 # Scenario: Test country code with country being United Arab Emirates
  #			Given a countryCode exists with an CountryCode of "AE"
 #       When a user retrieves the countryCode code by countryCode
  #      Then the status code is 200
   # 		And response includes the following this data.countryCode.activeInd "true"
    #	  And response includes the following this data.countryCode.countryISOAlphaCode "ARE"
    #		And response includes the following this data.countryCode.countryISOCode "AE"
    #		And response includes the following this data.countryCode.countryISONMRCCode "784"
    #    And response includes the following this data.countryCode.countryISOShortLowerCaseName "United Arab Emirates (the)"
    #    And response includes the following this data.countryCode.countryISOShortName "UNITED ARAB EMIRATES"    			  				
    #    And response includes the following this data.countryCode.countryShortName "UNITED ARAB EMIRATES"    			  				
    #    And response includes the following this data.countryCode.effectiveBeginDate is null    			  				
    #    And response includes the following this data.countryCode.effectiveEndDate is null     			  				
    #    And response includes the following this data.countryCode.statusISOText "Officially assigned"    
        
#@API @CountryCode @CountryCodeAF
#  Scenario: Test country code with country being AFGHANISTAN
#  			Given a countryCode exists with an CountryCode of "AF"
#        When a user retrieves the countryCode code by countryCode
#        Then the status code is 200
#    		And response includes the following this data.countryCode.activeInd "true"
#    	  And response includes the following this data.countryCode.countryISOAlphaCode "AFG"
#    		And response includes the following this data.countryCode.countryISOCode "AF"
#    		And response includes the following this data.countryCode.countryISONMRCCode "004"
#        And response includes the following this data.countryCode.countryISOShortLowerCaseName "Afghanistan"
#        And response includes the following this data.countryCode.countryISOShortName "AFGHANISTAN"    			  				
#        And response includes the following this data.countryCode.countryShortName "AFGHANISTAN"    			  				
#        And response includes the following this data.countryCode.effectiveBeginDate is null    			  				
#        And response includes the following this data.countryCode.effectiveEndDate is null     			  				
#        And response includes the following this data.countryCode.statusISOText "Officially assigned"   
        
#@API @CountryCode @CountryCodeAG
#  Scenario: Test country code with country being ANTIGUA AND BARBUDA
#  			Given a countryCode exists with an CountryCode of "AG"
#        When a user retrieves the countryCode code by countryCode
#        Then the status code is 200
#    		And response includes the following this data.countryCode.activeInd "true"
#    	  And response includes the following this data.countryCode.countryISOAlphaCode "ATG"
#    		And response includes the following this data.countryCode.countryISOCode "AG"
#    		And response includes the following this data.countryCode.countryISONMRCCode "028"
#        And response includes the following this data.countryCode.countryISOShortLowerCaseName "Antigua and Barbuda"
#        And response includes the following this data.countryCode.countryISOShortName "ANTIGUA AND BARBUDA"    			  				
#        And response includes the following this data.countryCode.countryShortName "ANTIGUA AND BARBUDA"    			  				
#        And response includes the following this data.countryCode.effectiveBeginDate is null    			  				
#        And response includes the following this data.countryCode.effectiveEndDate is null     			  				
#        And response includes the following this data.countryCode.statusISOText "Officially assigned"  
        
#@API @CountryCode @CountryCodeAI
#  Scenario: Test country code with country being ANGUILLA
#  			Given a countryCode exists with an CountryCode of "AI"
#        When a user retrieves the countryCode code by countryCode
#        Then the status code is 200
#    		And response includes the following this data.countryCode.activeInd "true"
#    	  And response includes the following this data.countryCode.countryISOAlphaCode "AIA"
#    		And response includes the following this data.countryCode.countryISOCode "AI"
#    		And response includes the following this data.countryCode.countryISONMRCCode "660"
#        And response includes the following this data.countryCode.countryISOShortLowerCaseName "Anguilla"
#        And response includes the following this data.countryCode.countryISOShortName "ANGUILLA"    			  				
#        And response includes the following this data.countryCode.countryShortName "ANGUILLA"    			  				
#        And response includes the following this data.countryCode.effectiveBeginDate is null    			  				
#        And response includes the following this data.countryCode.effectiveEndDate is null     			  				
#        And response includes the following this data.countryCode.statusISOText "Officially assigned" 
#        
#@API @CountryCode @CountryCodeAL
#  Scenario: Test country code with country being ALBANIA
#  			Given a countryCode exists with an CountryCode of "AL"
#        When a user retrieves the countryCode code by countryCode
#        Then the status code is 200
#    		And response includes the following this data.countryCode.activeInd "true"
#    	  And response includes the following this data.countryCode.countryISOAlphaCode "ALB"
#    		And response includes the following this data.countryCode.countryISOCode "AL"
#    		And response includes the following this data.countryCode.countryISONMRCCode "008"
#        And response includes the following this data.countryCode.countryISOShortLowerCaseName "Albania"
#        And response includes the following this data.countryCode.countryISOShortName "ALBANIA"    			  				
#        And response includes the following this data.countryCode.countryShortName "ALBANIA"    			  				
#        And response includes the following this data.countryCode.effectiveBeginDate is null    			  				
#        And response includes the following this data.countryCode.effectiveEndDate is null     			  				
#        And response includes the following this data.countryCode.statusISOText "Officially assigned" 

#@API @CountryCode @CountryCodeAL
#  Scenario: Test country code with country being ARMENIA
#  			Given a countryCode exists with an CountryCode of "AM"
#        When a user retrieves the countryCode code by countryCode
#        Then the status code is 200
#    		And response includes the following this data.countryCode.activeInd "true"
#    	  And response includes the following this data.countryCode.countryISOAlphaCode "ARM"
#    		And response includes the following this data.countryCode.countryISOCode "AM"
#    		And response includes the following this data.countryCode.countryISONMRCCode "051"
#        And response includes the following this data.countryCode.countryISOShortLowerCaseName "Armenia"
#        And response includes the following this data.countryCode.countryISOShortName "ARMENIA"    			  				
#        And response includes the following this data.countryCode.countryShortName "ARMENIA"    			  				
#        And response includes the following this data.countryCode.effectiveBeginDate is null    			  				
#        And response includes the following this data.countryCode.effectiveEndDate is null     			  				
#        And response includes the following this data.countryCode.statusISOText "Officially assigned" 
#        
           