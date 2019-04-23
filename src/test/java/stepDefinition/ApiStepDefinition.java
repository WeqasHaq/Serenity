package stepDefinition;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import basePackage.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ApiStepDefinition extends BaseClass {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	private ResponseBody body;
	private String WHOLE;
	private String GRAPHQL_ENDPOINT = "http://35.172.0.90:8080/graphql";
	private String QUERYtravelDocumentType = "{travelDocumentType(travelDocumentTypeCode:\"%s\"){travelDocumentTypeCode,countryRequiredInd,defaultCountryISoCode,description,edifactTravelDocTypeCode,partyIdQualifierCode,stateRequiredInd,whtiDocumentInd}}";

	/*************************************************************************************************************
	 * Scenario 1 for TravelDocumentType
	 *
	 **************************************************************************************************************/
	@Given("^a travelDocumentType exists with an travelDocumentTypeCode of \"([^\"]*)\"$")
	public void a_travelDocumentType_exists_with_an_travelDocumentTypeCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYtravelDocumentType"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the travelDocumentType code by travelDocumentTypeCode$")
	public void a_user_retrieves_the_travelDocumentType_code_by_travelDocumentTypeCode() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("^the status code is (\\d+)$")
	public void the_status_code_is(int arg1) {
		json = response.then().assertThat().statusCode(arg1);
	}

	@Then("^response includes the following this data\\.travelDocumentType\\.travelDocumentTypeCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_travelDocumentType_travelDocumentTypeCode(String arg1) {
		json.body("data.travelDocumentType[0].travelDocumentTypeCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.travelDocumentType\\.countryRequiredInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_travelDocumentType_countryRequiredInd(String a) {
		Boolean h = Boolean.valueOf(a);
		json.body("data.travelDocumentType[0].countryRequiredInd", equalTo(Boolean.valueOf(h)));
	}

	@Then("^response includes the following this data\\.travelDocumentType\\.description \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_travelDocumentType_description(String arg1) {
		json.body("data.travelDocumentType[0].description", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.travelDocumentType\\.edifactTravelDocTypeCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_travelDocumentType_edifactTravelDocTypeCode(String arg1) {
		json.body("data.travelDocumentType[0].edifactTravelDocTypeCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.travelDocumentType\\.defaultCountryISoCode is null$")
	public void response_includes_the_following_this_data_travelDocumentType_defaultCountryISoCode_is_null() {
		json.body("data.travelDocumentType[0].defaultCountryISoCode", equalTo(null));
	}

	@Then("^response includes the following this data\\.travelDocumentType\\.partyIdQualifierCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_travelDocumentType_partyIdQualifierCode(String arg1) {
		json.body("data.travelDocumentType[0].partyIdQualifierCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.travelDocumentType\\.stateRequiredInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_travelDocumentType_stateRequiredInd(String arg1) {
		Boolean h = Boolean.valueOf(arg1);
		json.body("data.travelDocumentType[0].stateRequiredInd", equalTo(Boolean.valueOf(h)));
	}

	@Then("^response includes the following this data\\.travelDocumentType\\.whtiDocumentInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_travelDocumentType_whtiDocumentInd(String arg1) {
		Boolean h = Boolean.valueOf(arg1);
		json.body("data.travelDocumentType[0].whtiDocumentInd", equalTo(Boolean.valueOf(h)));
	}

	/*************************************************************************************************************
	 * Below is for Scenario 2 for TravelDocumentType "5J"
	 *
	 **************************************************************************************************************/
	@Then("^response includes the following this data\\.travelDocumentType\\.partyIdQualifierCode is null$")
	public void response_includes_the_following_this_data_travelDocumentType_partyIdQualifierCode_is_null() {
		json.body("data.travelDocumentType[0].partyIdQualifierCode", equalTo(null));
	}

	/*************************************************************************************************************
	 * Below is for Scenario 4 for TravelDocumentType "ALV" Below is for Scenario 5
	 * for TravelDocumentType "HD"
	 **************************************************************************************************************/
	@Then("^response includes the following this data\\.travelDocumentType\\.defaultCountryISoCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_travelDocumentType_defaultCountryISoCode(String arg1) {
		json.body("data.travelDocumentType[0].defaultCountryISoCode", equalTo(arg1));
	}

	/*************************************************************************************************************
	 * Below is for Scenario 24 for TravelDocumentType "ALV" Below is for Scenario
	 * 23 Below is for Scenario 24 This is a negative Scenario
	 **************************************************************************************************************/

	@Then("^response includes the following this data\\.travelDocumentType is null$")
	public void response_includes_the_following_this_data_travelDocumentType_is_null() {
		json.body("data.travelDocumentType", equalTo(null));
	}

	@Then("^response includes the following this errors\\.message \"([^\"]*)\"$")
	public void response_includes_the_following_this_errors_message(String arg1) {
		json.body("errors.message[0]", equalTo(arg1));
	}

	@Then("^response includes the following this errors\\.path \"([^\"]*)\"$")
	public void response_includes_the_following_this_errors_path(String arg1) {
		json.body("errors[0].path[0]", equalTo(arg1));
	}

	/*************************************************************************************************************
	 * Below is for TravelDocumentType this will test to check if the schema has
	 * changed
	 **************************************************************************************************************/

	@Given("^travelDocumentType exists$")
	public void traveldocumenttype_exists() {
		String query = String.format(BaseClass.propValue("QUERYtravelDocumentTypeALL"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());

	}

	@Then("^a user will check the graphql server for changes for travelDocumentType info type$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_info_type() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("travelDocumentType"));
	}

	@Then("^a user will check the graphql server for changes for travelDocumentType schema change for cdlDocumentInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_schema_change_for_cdlDocumentInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("cdlDocumentInd"));
	}

	@Then("^a user will check the graphql server for changes for travelDocumentType schema change for countryRequiredInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_schema_change_for_countryRequiredInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryRequiredInd"));
	}

	@Then("^a user will check the graphql server for changes for travelDocumentType schema change for defaultCountryISoCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_schema_change_for_defaultCountryISoCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("defaultCountryISoCode"));
	}

	@Then("^a user will check the graphql server for changes for travelDocumentType schema change for description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_schema_change_for_description() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for travelDocumentType schema change for edifactTravelDocTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_schema_change_for_edifactTravelDocTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("edifactTravelDocTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for travelDocumentType schema change for partyIdQualifierCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_schema_change_for_partyIdQualifierCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("partyIdQualifierCode"));
	}

	@Then("^a user will check the graphql server for changes for travelDocumentType schema change for stateRequiredInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_schema_change_for_stateRequiredInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("stateRequiredInd"));
	}

	@Then("^a user will check the graphql server for changes for travelDocumentType schema change for travelDocumentTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_schema_change_for_travelDocumentTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("travelDocumentTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for travelDocumentType schema change for whtiDocumentInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_travelDocumentType_schema_change_for_whtiDocumentInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("whtiDocumentInd"));
	}

	/*************************************************************************************************************
	 * Below is for Scenario 1 for CarrierCode Reference Data "ACSR", This is for
	 * CarrierCodeReferenceDataAPI.feature File this will be universal for all steps
	 * for CarrierCode
	 ***************************************************************************************************************/

	@Given("^a CarrierCode exists with a CarrierCode of \"([^\"]*)\"$")
	public void a_CarrierCode_exists_with_a_CarrierCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYCarrierCode"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the CarrierCode code by CarrierCode$")
	public void a_user_retrieves_the_CarrierCode_code_by_CarrierCode() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("^response includes the following this data\\.carrierCode\\.carrierCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_carrierCode_carrierCode(String arg1) {
		json.body("data.carrierCode[0].carrierCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.carrierCode\\.carrierName \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_carrierCode_carrierName(String arg1) {
		json.body("data.carrierCode[0].carrierName", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.carrierCode\\.activeInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_carrierCode_activeInd(String arg1) {
		json.body("data.carrierCode[0].activeInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.carrierCode\\.carrierAirPrefixCode is null$")
	public void response_includes_the_following_this_data_carrierCode_carrierAirPrefixCode_is_null() {
		json.body("data.carrierCode[0].carrierAirPrefixCode", equalTo(null));
	}

	@Then("^response includes the following this data\\.carrierCode\\.censusCarrirerAbbrCode is null$")
	public void response_includes_the_following_this_data_carrierCode_censusCarrirerAbbrCode_is_null() {
		json.body("data.carrierCode[0].censusCarrirerAbbrCode", equalTo(null));
	}

	@Then("^response includes the following this data\\.carrierCode\\.csiCountryIsoCode is null$")
	public void response_includes_the_following_this_data_carrierCode_csiCountryIsoCode_is_null() {
		json.body("data.carrierCode[0].csiCountryIsoCode", equalTo(null));
	}

	@Then("^response includes the following this data\\.carrierCode\\.ctpatInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_carrierCode_ctpatInd(String arg1) {
		json.body("data.carrierCode[0].ctpatInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.carrierCode\\.iataInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_carrierCode_iataInd(String arg1) {
		json.body("data.carrierCode[0].iataInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.carrierCode\\.inbondPrefixCode is null$")
	public void response_includes_the_following_this_data_carrierCode_inbondPrefixCode_is_null() {
		json.body("data.carrierCode[0].inbondPrefixCode", equalTo(null));
	}

	@Then("^response includes the following this data\\.carrierCode\\.motCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_carrierCode_motCode(String arg1) {
		json.body("data.carrierCode[0].motCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.carrierCode\\.nvoccInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_carrierCode_nvoccInd(String arg1) {
		json.body("data.carrierCode[0].nvoccInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.carrierCode\\.partyAceId \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_carrierCode_partyAceId(String arg1) {
		json.body("data.carrierCode[0].partyAceId", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.carrierCode\\.pprlsParticipantInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_carrierCode_pprlsParticipantInd(String arg1) {
		json.body("data.carrierCode[0].pprlsParticipantInd", equalTo(Boolean.valueOf(arg1)));
	}

	/*************************************************************************************************************
	 * Below is for Scenario 9 for CarrierCode Reference Data , This is for
	 * CarrierCodeReferenceDataAPI.feature File, this is universal for all Carrier
	 * Code for checking schema
	 ***************************************************************************************************************/
	@Given("^a Carrier Code exists$")
	public void a_Carrier_Code_exists() {
		String query = String.format(BaseClass.propValue("QUERYCarrierCodeSchema"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@Then("^a user will check the graphql server for changes for Carrier Code$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("carrierCode"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for carrierName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_carrierName() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("carrierName"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for activeInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_activeInd() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("activeInd"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for carrierAirPrefixCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_carrierAirPrefixCode() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("carrierAirPrefixCode"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for censusCarrirerAbbrCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_censusCarrirerAbbrCode() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("censusCarrirerAbbrCode"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for csiCountryIsoCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_csiCountryIsoCode() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("csiCountryIsoCode"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for ctpatInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_ctpatInd() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("ctpatInd"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for iataInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_iataInd() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("iataInd"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for inbondPrefixCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_inbondPrefixCode() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("inbondPrefixCode"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for motCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_motCode() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("motCode"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for nvoccInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_nvoccInd() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("nvoccInd"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for partyAceId$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_partyAceId() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("partyAceId"));
	}

	@Then("^a user will check the graphql server for changes for Carrier Code schema change for pprlsParticipantInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Carrier_Code_schema_change_for_pprlsParticipantInd() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("pprlsParticipantInd"));
	}

	/*************************************************************************************************************
	 * Below is for Scenario 2 for CarrierCode Reference Data "ACSR", This is for
	 * CarrierCodeReferenceDataAPI.feature File, this is universal for all Carrier
	 * Code
	 ***************************************************************************************************************/
	@Then("^response includes the following this data\\.carrierCode\\.motCode is null$")
	public void response_includes_the_following_this_data_carrierCode_motCode_is_null() {
		json.body("data.carrierCode[0].motCode", equalTo(null));
	}

	/*************************************************************************************************************
	 * Below is for Carrier code negative scenario
	 ***************************************************************************************************************/

	@Then("^response includes the following this data\\.carrierCode is null$")
	public void response_includes_the_following_this_data_carrierCode_is_null() {
		json.body("data.carrierCode", equalTo(null));
	}

	/************************************************************************************************
	 * Below Steps are for CountryCode Feature file
	 ************************************************************************************************/

	@Given("^a countryCode exists with an CountryCode of \"([^\"]*)\"$")
	public void a_countryCode_exists_with_an_CountryCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYCountryCode"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the countryCode code by countryCode$")
	public void a_user_retrieves_the_countryCode_code_by_countryCode() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("^response includes the following this data\\.countryCode\\.activeInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_countryCode_activeInd(String arg1) {
		json.body("data.countryCode[0].activeInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.countryCode\\.countryISOAlphaCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_countryCode_countryISOAlphaCode(String arg1) {
		json.body("data.countryCode[0].countryISOAlphaCode", equalTo(arg1));

	}

	@Then("^response includes the following this data\\.countryCode\\.countryISOCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_countryCode_countryISOCode(String arg1) {
		json.body("data.countryCode[0].countryISOCode", equalTo(arg1));

	}

	@Then("^response includes the following this data\\.countryCode\\.countryISONMRCCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_countryCode_countryISONMRCCode(String arg1) {
		json.body("data.countryCode[0].countryISONMRCCode", equalTo(arg1));

	}

	@Then("^response includes the following this data\\.countryCode\\.countryISOShortLowerCaseName \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_countryCode_countryISOShortLowerCaseName(String arg1) {
		json.body("data.countryCode[0].countryISOShortLowerCaseName", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.countryCode\\.countryISOShortName \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_countryCode_countryISOShortName(String arg1) {
		json.body("data.countryCode[0].countryISOShortName", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.countryCode\\.countryShortName \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_countryCode_countryShortName(String arg1) {
		json.body("data.countryCode[0].countryShortName", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.countryCode\\.effectiveBeginDate is null$")
	public void response_includes_the_following_this_data_countryCode_effectiveBeginDate_is_null() {
		json.body("data.countryCode[0].effectiveBeginDate", equalTo(null));
	}

	@Then("^response includes the following this data\\.countryCode\\.effectiveEndDate is null$")
	public void response_includes_the_following_this_data_countryCode_effectiveEndDate_is_null() {
		json.body("data.countryCode[0].effectiveEndDate", equalTo(null));
	}

	@Then("^response includes the following this data\\.countryCode\\.statusISOText \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_countryCode_statusISOText(String arg1) {
		json.body("data.countryCode[0].statusISOText", equalTo(arg1));
	}

	@Given("^a countryCode exists with an countryCode of \"([^\"]*)\"$")
	public void a_countryCode_exists_with_an_countryCode_of(String arg1) {
		json.body("data.countryCode[0].statusISOText", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.countryCode is null$")
	public void response_includes_the_following_this_data_countryCode_is_null() {
		json.body("data.countryCode", equalTo(null));
	}

	/*****************************************************************************************************************
	 * Below is for is checking the schema changed for Country Code Feature file
	 * scenarios
	 *****************************************************************************************************************/
	@Then("^a user will check the graphql server for changes for Country Code schema change$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryCode"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for activeInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_activeInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("activeInd"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for countryISOAlphaCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_countryISOAlphaCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryISOAlphaCode"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for countryISOCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_countryISOCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryISOCode"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for countryISONMRCCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_countryISONMRCCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryISONMRCCode"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for countryISOShortLowerCaseName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_countryISOShortLowerCaseName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryISOShortLowerCaseName"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for countryISOShortName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_countryISOShortName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryISOShortName"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for countryShortName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_countryShortName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryShortName"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for effectiveBeginDate$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_effectiveBeginDate() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("effectiveBeginDate"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for effectiveEndDate$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_effectiveEndDate() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("effectiveEndDate"));
	}

	@Then("^a user will check the graphql server for changes for Country Code schema change for statusISOText$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Country_Code_schema_change_for_statusISOText() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("statusISOText"));
	}

	/*****************************************************************************************************************
	 * Below is for Distportcode Feature file scenarios
	 *****************************************************************************************************************/

	@Given("^a distPortCode exists with an port code of \"([^\"]*)\"$")
	public void a_distPortCode_exists_with_an_port_code_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYDistPortCode"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the distPortCode by distPortCode$")
	public void a_user_retrieves_the_distPortCode_by_distPortCode() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("^response includes the following this data\\.distPortCode\\.aceUsageCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_aceUsageCode(String arg1) {
		json.body("data.distPortCode[0].aceUsageCode", equalTo(arg1));

	}

	@Then("^response includes the following this data\\.distPortCode\\.activeInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_activeInd(String arg1) {
		json.body("data.distPortCode[0].activeInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.distPortCode\\.addressLineOneText \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_addressLineOneText(String arg1) {
		String hello = "data.distPortCode[0].addressLine1Text";
		json.body(hello.trim(), equalTo(arg1 + "                   "));
	}

	@Then("^response includes the following this data\\.distPortCode\\.addressLineTwoText \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_addressLineTwoText(String arg1) {
		json.body("data.distPortCode[0].addressLine2Text", equalTo(arg1 + "               "));
	}

	@Then("^response includes the following this data\\.distPortCode\\.addressLineThreeText \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_addressLineThreeText(String arg1) {
		json.body("data.distPortCode[0].addressLine3Text", equalTo(arg1 + "                                "));
	}

	@Then("^response includes the following this data\\.distPortCode\\.aiiPprlsSummaryInd	\"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_aiiPprlsSummaryInd(String arg1) {
		json.body("data.distPortCode[0].aiiPprlsSummaryInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.distPortCode\\.borderTypeCode is null$")
	public void response_includes_the_following_this_data_distPortCode_borderTypeCode_is_null() {
		json.body("data.distPortCode[0].borderTypeCode", equalTo(null));
	}

	@Then("^response includes the following this data\\.distPortCode\\.cargoSelectInd	\"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_cargoSelectInd(String arg1) {
		json.body("data.distPortCode[0].cargoSelectInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.distPortCode\\.carrierTypeCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_carrierTypeCode(String arg1) {
		json.body("data.distPortCode[0].carrierTypeCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.cityName \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_cityName(String arg1) {
		json.body("data.distPortCode[0].cityName", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.cmcCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_cmcCode(String arg1) {
		json.body("data.distPortCode[0].cmcCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.distCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_distCode(String arg1) {
		json.body("data.distPortCode[0].distCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.distPortCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_distPortCode(String arg1) {
		json.body("data.distPortCode[0].distPortCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.distPortName \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_distPortName(String arg1) {
		json.body("data.distPortCode[0].distPortName", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.expressConsignmentInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_expressConsignmentInd(String arg1) {
		json.body("data.distPortCode[0].expressConsignmentInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.distPortCode\\.locCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_locCode(String arg1) {
		json.body("data.distPortCode[0].locCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.mpfXmpCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_mpfXmpCode(String arg1) {
		json.body("data.distPortCode[0].mpfXmpCode", equalTo(arg1 + " "));
	}

	@Then("^response includes the following this data\\.distPortCode\\.portCityName \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_portCityName(String arg1) {
		json.body("data.distPortCode[0].portCityName", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.portCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_portCode(String arg1) {
		json.body("data.distPortCode[0].portCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.portOfEntryInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_portOfEntryInd(String arg1) {
		json.body("data.distPortCode[0].portOfEntryInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.distPortCode\\.portStateISOCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_portStateISOCode(String arg1) {
		json.body("data.distPortCode[0].portStateISOCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.regionCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_regionCode(String arg1) {
		json.body("data.distPortCode[0].regionCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.selectivityPortInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_selectivityPortInd(String arg1) {
		json.body("data.distPortCode[0].selectivityPortInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.distPortCode\\.servicePortCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_servicePortCode(String arg1) {
		json.body("data.distPortCode[0].servicePortCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.stateISOCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_stateISOCode(String arg1) {
		json.body("data.distPortCode[0].stateISOCode", equalTo(arg1));
	}

	@Then("^response includes the following this data\\.distPortCode\\.unladingPortInd \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_unladingPortInd(String arg1) {
		json.body("data.distPortCode[0].unladingPortInd", equalTo(Boolean.valueOf(arg1)));
	}

	@Then("^response includes the following this data\\.distPortCode\\.zipCode \"([^\"]*)\"$")
	public void response_includes_the_following_this_data_distPortCode_zipCode(String arg1) {
		json.body("data.distPortCode[0].zipCode", equalTo(arg1 + "    "));
	}

	/**********************************************************************************************
	 * Below is a Negative Scenario for Dist Port Code Scenario 2
	 **********************************************************************************************/
	@Given("^a DistPortCode exists with a DistPortCode of \"([^\"]*)\"$")
	public void a_DistPortCode_exists_with_a_DistPortCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYDistPortCode"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the DistPortCode code by DistPortCode$")
	public void a_user_retrieves_the_DistPortCode_code_by_DistPortCode() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a for checking for schema changes
	 **********************************************************************************************/

	@Then("^a user will check the graphql server for changes for DistPortCode schema change$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("distPortCode"));
	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for activeInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_activeInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("activeInd"));
	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for aceUsageCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_aceUsageCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("aceUsageCode"));
	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for addressLine(\\d+)Text$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_addressLine_Text(
			int arg1) {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("addressLine" + arg1));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for aiiPprlsSummaryInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_aiiPprlsSummaryInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("aiiPprlsSummaryInd"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for borderTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_borderTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("borderTypeCode"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for cargoSelectInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_cargoSelectInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("cargoSelectInd"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for carrierTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_carrierTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("carrierTypeCode"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for cityName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_cityName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("cityName"));
	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for cmcCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_cmcCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("cmcCode"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for distCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_distCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("distCode"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for distPortCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_distPortCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("distPortCode"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for distPortName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_distPortName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("distPortName"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for expressConsignmentInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_expressConsignmentInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("expressConsignmentInd"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for locCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_locCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("locCode"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for mpfXmpCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_mpfXmpCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("mpfXmpCode"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for portCityName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_portCityName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("portCityName"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for portCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_portCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("portCode"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for portOfEntryInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_portOfEntryInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("portOfEntryInd"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for portStateISOCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_portStateISOCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("portStateISOCode"));
	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for regionCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_regionCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("regionCode"));

	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for selectivityPortInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_selectivityPortInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("selectivityPortInd"));
	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for servicePortCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_servicePortCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("servicePortCode"));
	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for stateISOCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_stateISOCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("stateISOCode"));
	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for unladingPortInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_unladingPortInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("unladingPortInd"));
	}

	@Then("^a user will check the graphql server for changes for DistPortCode schema change for zipCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_DistPortCode_schema_change_for_zipCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("zipCode"));
	}

	/**********************************************************************************************
	 * Below is a conveyance Type Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a Conveyancetype exists with an conveyanceTypeCode of \"([^\"]*)\"$")
	public void a_Conveyancetype_exists_with_an_conveyanceTypeCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYConveyanceType"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());

	}

	@When("^a user retrieves the Conveyancetype code by Conveyancetype$")
	public void a_user_retrieves_the_Conveyancetype_code_by_Conveyancetype() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a conveyance Type Reference data feature scenario checking all the
	 * schema
	 **********************************************************************************************/

	@Given("^a Conveyance Type exists with an nested payload$")
	public void a_Conveyance_Type_exists_with_an_nested_payload() {
		String query = String.format(BaseClass.propValue("QUERYConveyanceType"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@Then("^a user will check the graphql server for changes for ConveyanceType schema change$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceType_schema_change() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceType"));

	}

	@Then("^a user will check the graphql server for changes for ConveyanceType schema change for conveyanceTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceType_schema_change_for_conveyanceTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceType schema change for description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceType_schema_change_for_description() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceType schema change for sealRequiredInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceType_schema_change_for_sealRequiredInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("sealRequiredInd"));
	}

	/**********************************************************************************************
	 * Below is a conveyance Type Reference data feature scenario This is checking
	 * the Schema for any changes
	 **********************************************************************************************/

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyance"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change actualCarrierCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_actualCarrierCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("actualCarrierCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change actualConveyanceName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_actualConveyanceName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("actualConveyanceName"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change addressLine(\\d+)$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_addressLine(
			int arg1) {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("addressLine" + arg1));

	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change billOfLading$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_billOfLading() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("billOfLading"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change carrierAceId$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_carrierAceId() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("carrierAceId"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change carrierCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_carrierCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("carrierCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change cityName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_cityName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("cityName"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceAceId$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_conveyanceAceId() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceAceId"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceActionCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_conveyanceActionCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceActionCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceCountryCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_conveyanceCountryCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceCountryCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceEvent$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_conveyanceEvent() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceEvent"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceInstance$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_conveyanceInstance() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceInstance"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceInternalId$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_conveyanceInternalId() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceInternalId"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_conveyanceName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceName"));

	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_conveyanceNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceNumber"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change conveyanceTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_conveyanceTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("conveyanceTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change countryCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_countryCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change crewInfo$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_crewInfo() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("crewInfo"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change dotNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_dotNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("dotNumber"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change equipmentInfo$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_equipmentInfo() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipmentInfo"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change foreignManifestNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_foreignManifestNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("foreignManifestNumber"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change foreignManifestOperationType$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_foreignManifestOperationType() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("foreignManifestOperationType"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change imoNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_imoNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("imoNumber"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change insuranceAmount$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_insuranceAmount() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("insuranceAmount"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change insuranceCompanyName$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_insuranceCompanyName() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("insuranceCompanyName"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change insuranceCurrencyCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_insuranceCurrencyCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("insuranceCurrencyCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change insurancePolicyIssuanceYear$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_insurancePolicyIssuanceYear() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("insurancePolicyIssuanceYear"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change insurancePolicyNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_insurancePolicyNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("insurancePolicyNumber"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change licensePlateInfo$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_licensePlateInfo() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("licensePlateInfo"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change countryOfIssuanceCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_countryOfIssuanceCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryOfIssuanceCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change licensePlateNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_licensePlateNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("licensePlateNumber"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change stateOfIssuanceCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_stateOfIssuanceCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("stateOfIssuanceCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change manifestAceId$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_manifestAceId() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("manifestAceId"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change manifestSequenceNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_manifestSequenceNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("manifestSequenceNumber"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change  modeOfTransportationCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_modeOfTransportationCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("modeOfTransportationCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change postalCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_postalCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("postalCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change scheduledDate$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_scheduledDate() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("scheduledDate"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change scheduledPortCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_scheduledPortCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("scheduledPortCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change scheduledTime$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_scheduledTime() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("scheduledTime"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change sealInfo$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_sealInfo() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("sealInfo"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change sealLocation$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_sealLocation() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("sealLocation"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change sealNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_sealNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("sealNumber"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change stateCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_stateCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("stateCode"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change transponderIdNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_transponderIdNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("transponderIdNumber"));
	}

	@Then("^a user will check the graphql server for changes for ConveyanceInfoType schema change vehicleIdentificationNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ConveyanceInfoType_schema_change_vehicleIdentificationNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("vehicleIdentificationNumber"));
	}

	/**********************************************************************************************
	 * Below is a does a lot of feature file body checks using DataTable
	 **********************************************************************************************/

	@Then("^response includes the following$")
	public void response_includes_the_following(DataTable arg1) {
		Map<String, String> responseFields = arg1.asMap(String.class, String.class);
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			if (StringUtils.isNumeric(field.getValue())) {
				json.body(field.getKey(), equalTo(field.getValue()));
			} else if ("true".equals(field.getValue()) || "false".equals(field.getValue())) {
				json.body(field.getKey(), equalTo(Boolean.valueOf(field.getValue())));
			} else if (StringUtils.isEmpty(field.getValue())) {
				json.body(field.getKey(), equalTo(null));
			} else {
				json.body(field.getKey(), equalTo(field.getValue()));
			}
		}
	}

	/**********************************************************************************************
	 * Below is a conveyance Type Reference data feature scenario for Negative test
	 * 
	 **********************************************************************************************/
	@Given("^a Conveyance Type exists with a conveyanceTypeCode of \"([^\"]*)\"$")
	public void a_Conveyance_Type_exists_with_a_conveyanceTypeCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYConveyanceType"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	/**********************************************************************************************
	 * Below is a Conveyance Info Type Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a Conveyance exists with an nested payload$")
	public void a_Conveyance_exists_with_an_nested_payload() {
		String query = BaseClass.propValue("QUERYConveyanceInfoType");
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the ConveyanceInfotype code by ConveyanceInfotype$")
	public void a_user_retrieves_the_ConveyanceInfotype_code_by_ConveyanceInfotype() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a manifestStatus Type Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a manifestStatus exists with an manifestStatusCode of \"([^\"]*)\"$")
	public void a_manifestStatus_exists_with_an_manifestStatusCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYManifestStatus"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the manifestStatus code by manifestStatus$")
	public void a_user_retrieves_the_manifestStatus_code_by_manifestStatus() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a manifestStatus Type Reference data feature scenario is checking
	 * schema changes
	 * 
	 **********************************************************************************************/

	@Then("^a user will check the graphql server for changes for manifestStatus info type$")
	public void a_user_will_check_the_graphql_server_for_changes_for_manifestStatus_info_type() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("manifestStatus"));
	}

	@Then("^a user will check the graphql server for changes for manifestStatus schema change for description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_manifestStatus_schema_change_for_description() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for manifestStatus schema change for manifestStatusCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_manifestStatus_schema_change_for_manifestStatusCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("manifestStatusCode"));
	}

	/**********************************************************************************************
	 * Below is a Equipment Info Type Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a Equipment exists with an Equipment$")
	public void a_Equipment_exists_with_an_Equipment() {
		String query = BaseClass.propValue("QUERYEquipmentInfoType");
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the EquipmentInfoType code by EquipmentInfoType$")
	public void a_user_retrieves_the_EquipmentInfoType_code_by_EquipmentInfoType() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("^a user will check the graphql server for changes for Equipment info type$")
	public void a_user_will_check_the_graphql_server_for_changes_for_Equipment_info_type() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipment"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentDescriptionCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_equipmentDescriptionCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipmentDescriptionCode"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentHeight$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_equipmentHeight() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipmentHeight"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentInternalId$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_equipmentInternalId() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipmentInternalId"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentLength$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_equipmentLength() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipmentLength"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_equipmentNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipmentNumber"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_equipmentTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipmentTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for equipmentWidth$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_equipmentWidth() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipmentWidth"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for licensePlateInfo$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_licensePlateInfo() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("licensePlateInfo"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for countryOfIssuanceCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_countryOfIssuanceCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryOfIssuanceCode"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for licensePlateNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_licensePlateNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("licensePlateNumber"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for stateOfIssuanceCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_stateOfIssuanceCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("stateOfIssuanceCode"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for loadedEmptyStatus$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_loadedEmptyStatus() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("loadedEmptyStatus"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for positionNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_positionNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("positionNumber"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for sealInfo$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_sealInfo() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("sealInfo"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for sealLocation$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_sealLocation() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("sealLocation"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for sealNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_sealNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("sealNumber"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for serviceTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_serviceTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("serviceTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for EquipmentInfoType schema change for terminalCargoNumber$")
	public void a_user_will_check_the_graphql_server_for_changes_for_EquipmentInfoType_schema_change_for_terminalCargoNumber() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("terminalCargoNumber"));
	}

	/**********************************************************************************************
	 * Below is a TripPartyType Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a TripPartyType exists with an tripPartyTypeCode of \"([^\"]*)\"$")
	public void a_TripPartyType_exists_with_an_tripPartyTypeCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYTripPartyType"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());

	}

	@When("^a user retrieves the TripPartyType code by manifesTripPartyTypetStatus$")
	public void a_user_retrieves_the_TripPartyType_code_by_manifesTripPartyTypetStatus() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a TripPartyType Reference data feature scenario for checking schema
	 * 
	 **********************************************************************************************/

	@Given("^TripPartyType exists$")
	public void trippartytype_exists() {
		String query = String.format(BaseClass.propValue("QUERYTripPartyTypeAll"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the TripPartyType code$")
	public void a_user_retrieves_the_TripPartyType_code() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("^a user will check the graphql server for changes for TripPartyType info type$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TripPartyType_info_type() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("tripPartyType"));
	}

	@Then("^a user will check the graphql server for changes for TripPartyType schema change for description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TripPartyType_schema_change_for_description() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for TripPartyType schema change for edifactTripPartyTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TripPartyType_schema_change_for_edifactTripPartyTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("edifactTripPartyTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for TripPartyType schema change for tripPartyTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TripPartyType_schema_change_for_tripPartyTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("tripPartyTypeCode"));
	}

	/**********************************************************************************************
	 * Below is a DistPortCode Reference data feature scenario checking schema
	 * 
	 **********************************************************************************************/

	@Given("^a DistPortCode exists with an DistPortCode$")
	public void a_DistPortCode_exists_with_an_DistPortCode() {
		String query = String.format(BaseClass.propValue("QUERYDistPortCodeSchema"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the DistPortCode code by DistPortCode and checks schema is not returning null$")
	public void a_user_retrieves_the_DistPortCode_code_by_DistPortCode_and_checks_schema_is_not_returning_null() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a Trip Status Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a TripStatus exists with an trip Leg Status of \"([^\"]*)\"$")
	public void a_TripStatus_exists_with_an_trip_Leg_Status_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYTripLegStatus"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the TripStatus code by TripStatus$")
	public void a_user_retrieves_the_TripStatus_code_by_TripStatus() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a Trip Status Reference data feature scenario for schema check
	 * 
	 **********************************************************************************************/

	@Given("^TripStatus exists$")
	public void tripstatus_exists() {
		String query = String.format(BaseClass.propValue("QUERYTripLegStatusAll"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());

	}

	@When("^a user retrieves the TripStatus$")
	public void a_user_retrieves_the_TripStatus() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("^a user will check the graphql server for changes for TripStatus info type$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TripStatus_info_type() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("tripLegStatus"));
	}

	@Then("^a user will check the graphql server for changes for TripStatus schema change for description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TripStatus_schema_change_for_description() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for TripStatus schema change for tripLegStatusCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TripStatus_schema_change_for_tripLegStatusCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("tripLegStatusCode"));
	}

	/**********************************************************************************************
	 * Below is a shipment Release Type Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a shipmentReleaseType exists with an shipmentReleaseTypeCode of \"([^\"]*)\"$")
	public void a_shipmentReleaseType_exists_with_an_shipmentReleaseTypeCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYShipmentReleaseType"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the shipmentReleaseType code by shipmentReleaseType$")
	public void a_user_retrieves_the_shipmentReleaseType_code_by_shipmentReleaseType() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a shipment Release Type Reference data feature scenario checking the
	 * schema
	 * 
	 **********************************************************************************************/

	@Then("^a user will check the graphql server for changes for ShipmentRelease info type$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ShipmentRelease_info_type() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("shipmentReleaseType"));
	}

	@Then("^a user will check the graphql server for changes for ShipmentRelease schema change for activeStatusInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ShipmentRelease_schema_change_for_activeStatusInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("activeStatusInd"));
	}

	@Then("^a user will check the graphql server for changes for ShipmentRelease schema change for description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ShipmentRelease_schema_change_for_description() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for ShipmentRelease schema change for shipmentReleaseTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_ShipmentRelease_schema_change_for_shipmentReleaseTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("shipmentReleaseTypeCode"));
	}

	/**********************************************************************************************
	 * Below is a service Type Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a service Type exists with an serviceTypeCode of \"([^\"]*)\"$")
	public void a_service_Type_exists_with_an_serviceTypeCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYServiceType"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());

	}

	@When("^a user retrieves the service Type code by service Type$")
	public void a_user_retrieves_the_service_Type_code_by_service_Type() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a service Type Reference data feature scenario checking if schema
	 * has changed
	 * 
	 **********************************************************************************************/

	@Then("^a user will check the graphql server for changes for serviceType info type$")
	public void a_user_will_check_the_graphql_server_for_changes_for_serviceType_info_type() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("serviceType"));
	}

	@Then("^a user will check the graphql server for changes for serviceType schema change for description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_serviceType_schema_change_for_description() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for serviceType schema change for edifactServiceTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_serviceType_schema_change_for_edifactServiceTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("edifactServiceTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for serviceType schema change for serviceTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_serviceType_schema_change_for_serviceTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("serviceTypeCode"));
	}

	/**********************************************************************************************
	 * Below is a State Code Reference data feature scenario using query with
	 * countryISOCode
	 * 
	 **********************************************************************************************/

	@Given("^a State Code exists with an countryISOCode of \"([^\"]*)\" and stateISOCode \"([^\"]*)\"$")
	public void a_State_Code_exists_with_an_countryISOCode_of_and_stateISOCode(String arg1, String arg2) {
		String query = String.format(BaseClass.propValue("QUERYStateCodeCountryISOCode"), arg1, arg2);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the State Code code by State Code$")
	public void a_user_retrieves_the_State_Code_code_by_State_Code() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a State Code Reference data feature scenario using query
	 * 
	 **********************************************************************************************/

	@Then("^a user will check the graphql server for changes for State Code info type$")
	public void a_user_will_check_the_graphql_server_for_changes_for_State_Code_info_type() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("stateCode"));
	}

	@Then("^a user will check the graphql server for changes for State Code schema change for countryISOCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_State_Code_schema_change_for_countryISOCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("countryISOCode"));
	}

	@Then("^a user will check the graphql server for changes for State Code schema change for name$")
	public void a_user_will_check_the_graphql_server_for_changes_for_State_Code_schema_change_for_name() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("name"));
	}

	@Then("^a user will check the graphql server for changes for State Code schema change for stateISOCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_State_Code_schema_change_for_stateISOCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("stateISOCode"));
	}

	/**********************************************************************************************
	 * Below is a bol Status Reference data feature scenario using query with
	 * 
	 * 
	 **********************************************************************************************/

	@Given("^a bol Status exists$")
	public void a_bol_Status_exists() {
		String query = String.format(BaseClass.propValue("QueryBolStatusWhole"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@Then("^a user will check the graphql server for changes for BolStatus$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BolStatus() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("bolStatus"));
	}

	@Then("^a user will check the graphql server for changes for BolStatus schema change for bolStatusCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BolStatus_api_for_bolStatusCode() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("bolStatusCode"));

	}

	@Then("^a user will check the graphql server for changes for BolStatus schema change for description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BolStatus_api_for_description() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for BolStatus schema change for shortDescription$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BolStatus_api_for_shortDescription() {
		body = response.getBody();
		String whole = body.asString();
		Assert.assertTrue(whole.contains("shortDescription"));
	}

	/**********************************************************************************************
	 * Below is a User Trade Ui Service data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a user exists$")
	public void a_user_exists() {
		String query = String.format(BaseClass.propValue("QueryUserFromTradeUi"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves data from graphql$")
	public void a_user_retrieves_data_from_graphql() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a User Trade Ui Service data feature scenario Negative Scenario
	 **********************************************************************************************/

	@Given("^a user does not exist$")
	public void a_user_does_not_exist() {
		String query = String.format(BaseClass.propValue("QueryUserFromTradeUiNegative"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves data from graphql with invalid query for user$")
	public void a_user_retrieves_data_from_graphql_with_invalid_query_for_user() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a BOL Status Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a bol Status exists with an bolStatusCode of \"([^\"]*)\"$")
	public void a_bol_Status_exists_with_an_bolStatusCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QueryBolStatus"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the bol Status by bol Status Code$")
	public void a_user_retrieves_the_bol_Status_by_bol_Status_Code() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a Truck Equipment type Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a TruckEquipment exists with an equipmentTypeCode of \"([^\"]*)\"$")
	public void a_TruckEquipment_exists_with_an_equipmentTypeCode_of(String arg1) {
		String query = String.format(BaseClass.propValue("QueryTruckEquipmentType"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the TruckEquipment by equipmentTypeCode$")
	public void a_user_retrieves_the_TruckEquipment_by_equipmentTypeCode() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	/**********************************************************************************************
	 * Below is a Truck Equipment type Reference data feature scenario for checking
	 * schema
	 * 
	 **********************************************************************************************/
	@Given("^a TruckEquipment exists$")
	public void a_TruckEquipment_exists() {
		String query = String.format(BaseClass.propValue("QueryTruckEquipmentTypeAll"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^user retrieves the TruckEquipment$")
	public void user_retrieves_the_TruckEquipment() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("^a user will check the graphql server for changes for TruckEquipment info type$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TruckEquipment_info_type() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("truckEquipmentType"));
	}

	@Then("^a user will check the graphql server for changes for TruckEquipment schema change for description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TruckEquipment_schema_change_for_description() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for TruckEquipment schema change for equipmentTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TruckEquipment_schema_change_for_equipmentTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("equipmentTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for TruckEquipment schema change for licenseRequiredInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TruckEquipment_schema_change_for_licenseRequiredInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("licenseRequiredInd"));
	}

	@Then("^a user will check the graphql server for changes for TruckEquipment schema change for sealRequiredInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_TruckEquipment_schema_change_for_sealRequiredInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("sealRequiredInd"));
	}

	/**********************************************************************************************
	 * Below is a BOL Type Reference data feature scenario for checking schema
	 * 
	 **********************************************************************************************/
	@Given("^a BOLType exists$")
	public void a_BOLType_exists() {
		String query = String.format(BaseClass.propValue("QUERYBOLTypeAll"));
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

	@When("^a user retrieves the BOLType code by BOLType$")
	public void a_user_retrieves_the_BOLType_code_by_BOLType() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("^a user will check the graphql server for changes for BOLType schema change$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BOLType_schema_change() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("bolType"));
	}

	@Then("^a user will check the graphql server for changes for BOLType schema change bolTypeCode$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BOLType_schema_change_bolTypeCode() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("bolTypeCode"));
	}

	@Then("^a user will check the graphql server for changes for BOLType schema change description$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BOLType_schema_change_description() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("description"));
	}

	@Then("^a user will check the graphql server for changes for BOLType schema change massPostingInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BOLType_schema_change_massPostingInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("massPostingInd"));
	}

	@Then("^a user will check the graphql server for changes for BOLType schema change shortDscText$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BOLType_schema_change_shortDscText() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("shortDscText"));
	}

	@Then("^a user will check the graphql server for changes for BOLType schema change tradeTruckDisplayInd$")
	public void a_user_will_check_the_graphql_server_for_changes_for_BOLType_schema_change_tradeTruckDisplayInd() {
		body = response.getBody();
		WHOLE = body.asString();
		Assert.assertTrue(WHOLE.contains("tradeTruckDisplayInd"));
	}

	/**********************************************************************************************
	 * Below is a BOL Type Reference data feature scenario
	 * 
	 **********************************************************************************************/

	@Given("^a BOLType exists with an BOLType Code of \"([^\"]*)\"$")
	public void a_BOLType_exists_with_an_BOLType_Code_of(String arg1) {
		String query = String.format(BaseClass.propValue("QUERYBOLType"), arg1);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());
	}

}
