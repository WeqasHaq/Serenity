Feature: This Feature will test User End point from Trade UI Service API

 
#Scenario 1
@API @User @checkSchema @smoke
Scenario: This scenario will tell test a user exist
	Given a user exists 
  When a user retrieves data from graphql
  Then the status code is 200
  And response includes the following
      | data.user.aceId             		| 1111111		      |
    	| data.user.authorizedCarrierCodes| 	 							|
     	| data.user.carrierCode     		 	| ACRL		 			  |
   	  | data.user.email         		    | user1@cbp.com		|
    	| data.user.firstName							| John		 				|
     	| data.user.lastName    			  	| Doe							|
     	| data.user.userId           		  | user1		        |
    	| data.user.userType							| 		 						|

#Scenario 1
@API @UserNegative @checkSchema @smoke
Scenario: This scenario will be a Negative test for user trade ui service
	Given a user does not exist
  When a user retrieves data from graphql with invalid query for user
  Then the status code is 200
  And response includes the following
         | errors[0].message       		| Validation error of type FieldUndefined: Field 'name' in type 'UserDto' is undefined @ 'user/name'		      |
   
