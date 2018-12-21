package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhUnitAndValues;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.spare.xdsl.OvhXdslSpare;
import net.minidev.ovh.api.telephony.OvhRma;
import net.minidev.ovh.api.xdsl.OvhAccess;
import net.minidev.ovh.api.xdsl.OvhAccessDiagnostic;
import net.minidev.ovh.api.xdsl.OvhAccessStatisticsTypeEnum;
import net.minidev.ovh.api.xdsl.OvhAntiSpam;
import net.minidev.ovh.api.xdsl.OvhAsyncTask;
import net.minidev.ovh.api.xdsl.OvhAsyncTaskArray;
import net.minidev.ovh.api.xdsl.OvhConnectedDevice;
import net.minidev.ovh.api.xdsl.OvhDHCP;
import net.minidev.ovh.api.xdsl.OvhDHCPStaticAddress;
import net.minidev.ovh.api.xdsl.OvhDeconsolidationTerms;
import net.minidev.ovh.api.xdsl.OvhDslamLineProfile;
import net.minidev.ovh.api.xdsl.OvhDslamPort;
import net.minidev.ovh.api.xdsl.OvhDslamPortLog;
import net.minidev.ovh.api.xdsl.OvhExtraIpRangeMove;
import net.minidev.ovh.api.xdsl.OvhIP;
import net.minidev.ovh.api.xdsl.OvhIncident;
import net.minidev.ovh.api.xdsl.OvhLAN;
import net.minidev.ovh.api.xdsl.OvhLineStatisticsTypeEnum;
import net.minidev.ovh.api.xdsl.OvhModem;
import net.minidev.ovh.api.xdsl.OvhModemInfo;
import net.minidev.ovh.api.xdsl.OvhMonitoringNotification;
import net.minidev.ovh.api.xdsl.OvhPendingAction;
import net.minidev.ovh.api.xdsl.OvhPortMapping;
import net.minidev.ovh.api.xdsl.OvhRadiusConnectionLog;
import net.minidev.ovh.api.xdsl.OvhResiliationFollowUpDetail;
import net.minidev.ovh.api.xdsl.OvhResiliationSurvey;
import net.minidev.ovh.api.xdsl.OvhResiliationTerms;
import net.minidev.ovh.api.xdsl.OvhServiceStatusEnum;
import net.minidev.ovh.api.xdsl.OvhStatisticsPeriodEnum;
import net.minidev.ovh.api.xdsl.OvhTaskStatusEnum;
import net.minidev.ovh.api.xdsl.OvhTemplateModem;
import net.minidev.ovh.api.xdsl.OvhTimestampAndValue;
import net.minidev.ovh.api.xdsl.OvhWLAN;
import net.minidev.ovh.api.xdsl.OvhWLANFrequencyEnum;
import net.minidev.ovh.api.xdsl.OvhXdslEmailPro;
import net.minidev.ovh.api.xdsl.antispam.OvhEvidencesInfo;
import net.minidev.ovh.api.xdsl.eligibility.OvhAddress;
import net.minidev.ovh.api.xdsl.eligibility.OvhBuilding;
import net.minidev.ovh.api.xdsl.eligibility.OvhCity;
import net.minidev.ovh.api.xdsl.eligibility.OvhEligibility;
import net.minidev.ovh.api.xdsl.eligibility.OvhFiberEligibility;
import net.minidev.ovh.api.xdsl.eligibility.OvhFiberStreet;
import net.minidev.ovh.api.xdsl.eligibility.OvhLandlineStatusEnum;
import net.minidev.ovh.api.xdsl.eligibility.OvhLine;
import net.minidev.ovh.api.xdsl.eligibility.OvhMeetingSlots;
import net.minidev.ovh.api.xdsl.eligibility.OvhStreet;
import net.minidev.ovh.api.xdsl.email.pro.OvhTask;
import net.minidev.ovh.api.xdsl.linediagnostic.OvhAnswers;
import net.minidev.ovh.api.xdsl.linediagnostic.OvhCustomerActionsEnum;
import net.minidev.ovh.api.xdsl.linediagnostic.OvhDiagnostic;
import net.minidev.ovh.api.xdsl.linediagnostic.OvhFaultTypeEnum;
import net.minidev.ovh.api.xdsl.monitoringnotifications.OvhFrequencyEnum;
import net.minidev.ovh.api.xdsl.monitoringnotifications.OvhTypeEnum;
import net.minidev.ovh.api.xdsl.orderfollowup.OvhStep;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhProtocolTypeEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/xdsl
 * version:1.0
 */
public class ApiOvhXdsl extends ApiOvhBase {
	public ApiOvhXdsl(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /xdsl
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/xdsl";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/templateModem/{name}
	 * @param name [required] Name of the Modem Template
	 *
	 * API beta
	 */
	public OvhTemplateModem templateModem_name_GET(String name) throws IOException {
		String qPath = "/xdsl/templateModem/{name}";
		StringBuilder sb = path(qPath, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTemplateModem.class);
	}

	/**
	 * Delete this Modem Template
	 *
	 * REST: DELETE /xdsl/templateModem/{name}
	 * @param name [required] Name of the Modem Template
	 *
	 * API beta
	 */
	public void templateModem_name_DELETE(String name) throws IOException {
		String qPath = "/xdsl/templateModem/{name}";
		StringBuilder sb = path(qPath, name);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * List of TemplateModem
	 *
	 * REST: GET /xdsl/templateModem
	 *
	 * API beta
	 */
	public ArrayList<String> templateModem_GET() throws IOException {
		String qPath = "/xdsl/templateModem";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new Modem Template from existing modem
	 *
	 * REST: POST /xdsl/templateModem
	 * @param name [required] Modem Template name (only alphanumeric characters)
	 * @param serviceName [required] The access name with the config you want to duplicate
	 *
	 * API beta
	 */
	public OvhTemplateModem templateModem_POST(String name, String serviceName) throws IOException {
		String qPath = "/xdsl/templateModem";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "serviceName", serviceName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTemplateModem.class);
	}

	/**
	 * Do an eligibility for a line
	 *
	 * REST: POST /xdsl/eligibility/test/line
	 * @param lineNumber [required] The line number
	 * @param lineStatus [required] The line status
	 * @deprecated
	 */
	public OvhAsyncTask<OvhEligibility> eligibility_test_line_POST(String lineNumber, OvhLandlineStatusEnum lineStatus) throws IOException {
		String qPath = "/xdsl/eligibility/test/line";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "lineNumber", lineNumber);
		addBody(o, "lineStatus", lineStatus);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<OvhAsyncTask<OvhEligibility>> t2 = new TypeReference<OvhAsyncTask<OvhEligibility>>() {};

	/**
	 * Do an eligibility for an address, if no line exist
	 *
	 * REST: POST /xdsl/eligibility/test/address
	 * @param address [required] The address
	 * @deprecated
	 */
	public OvhAsyncTask<OvhEligibility> eligibility_test_address_POST(OvhAddress address) throws IOException {
		String qPath = "/xdsl/eligibility/test/address";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "address", address);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * Get an eligibility by its id
	 *
	 * REST: GET /xdsl/eligibility/test
	 * @param id [required] The eligibility id
	 * @deprecated
	 */
	public OvhEligibility eligibility_test_GET(String id) throws IOException {
		String qPath = "/xdsl/eligibility/test";
		StringBuilder sb = path(qPath);
		query(sb, "id", id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEligibility.class);
	}

	/**
	 * Perform a fiber eligibility for a building
	 *
	 * REST: POST /xdsl/eligibility/test/fiber/building
	 * @param building [required] Unique identifier of the building (you can get it with POST /xdsl/eligibility/search/buildings)
	 * @deprecated
	 */
	public OvhAsyncTask<OvhFiberEligibility> eligibility_test_fiber_building_POST(String building) throws IOException {
		String qPath = "/xdsl/eligibility/test/fiber/building";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "building", building);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}
	private static TypeReference<OvhAsyncTask<OvhFiberEligibility>> t3 = new TypeReference<OvhAsyncTask<OvhFiberEligibility>>() {};

	/**
	 * Search for meeting time slot
	 *
	 * REST: GET /xdsl/eligibility/meetings
	 * @param offerLabel [required] The choosen offer label
	 * @param eligibilityId [required] The eligibility test id
	 * @deprecated
	 */
	public OvhAsyncTask<OvhMeetingSlots> eligibility_meetings_GET(String eligibilityId, String offerLabel) throws IOException {
		String qPath = "/xdsl/eligibility/meetings";
		StringBuilder sb = path(qPath);
		query(sb, "eligibilityId", eligibilityId);
		query(sb, "offerLabel", offerLabel);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<OvhAsyncTask<OvhMeetingSlots>> t4 = new TypeReference<OvhAsyncTask<OvhMeetingSlots>>() {};

	/**
	 * Get the inactive lines at given address
	 *
	 * REST: POST /xdsl/eligibility/lines/inactive
	 * @param contactName [required] The contact name first three letters
	 * @param street [required] The information about the street
	 * @param city [required] The information about the city
	 * @param streetNumber [required] The number in the street
	 * @deprecated
	 */
	public OvhAsyncTaskArray<OvhLine> eligibility_lines_inactive_POST(String contactName, OvhStreet street, OvhCity city, String streetNumber) throws IOException {
		String qPath = "/xdsl/eligibility/lines/inactive";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactName", contactName);
		addBody(o, "street", street);
		addBody(o, "city", city);
		addBody(o, "streetNumber", streetNumber);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t5);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhLine>> t5 = new TypeReference<OvhAsyncTaskArray<OvhLine>>() {};

	/**
	 * Get the active lines at given address
	 *
	 * REST: POST /xdsl/eligibility/lines/active
	 * @param contactName [required] The contact name first three letters
	 * @param street [required] The information about the street
	 * @param city [required] The information about the city
	 * @param streetNumber [required] The number in the street
	 * @deprecated
	 */
	public OvhAsyncTaskArray<OvhLine> eligibility_lines_active_POST(String contactName, OvhStreet street, OvhCity city, String streetNumber) throws IOException {
		String qPath = "/xdsl/eligibility/lines/active";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactName", contactName);
		addBody(o, "street", street);
		addBody(o, "city", city);
		addBody(o, "streetNumber", streetNumber);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t5);
	}

	/**
	 * Get the streets from a city inseeCode and partial street name
	 *
	 * REST: GET /xdsl/eligibility/streets
	 * @param inseeCode [required] The inseeCode of the city
	 * @param partialName [required] The partial name to match against the name of the street
	 * @deprecated
	 */
	public ArrayList<OvhStreet> eligibility_streets_GET(String inseeCode, String partialName) throws IOException {
		String qPath = "/xdsl/eligibility/streets";
		StringBuilder sb = path(qPath);
		query(sb, "inseeCode", inseeCode);
		query(sb, "partialName", partialName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhStreet>> t6 = new TypeReference<ArrayList<OvhStreet>>() {};

	/**
	 * Get the cities from a zipCode
	 *
	 * REST: GET /xdsl/eligibility/cities
	 * @param zipCode [required] The zipCode of the city
	 * @deprecated
	 */
	public ArrayList<OvhCity> eligibility_cities_GET(String zipCode) throws IOException {
		String qPath = "/xdsl/eligibility/cities";
		StringBuilder sb = path(qPath);
		query(sb, "zipCode", zipCode);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhCity>> t7 = new TypeReference<ArrayList<OvhCity>>() {};

	/**
	 * Get the available street numbers for a given street code (unique identifier of a street you can get with the method POST /xdsl/eligibility/search/streets)
	 *
	 * REST: POST /xdsl/eligibility/search/streetNumbers
	 * @param streetCode [required] Street code
	 * @deprecated
	 */
	public OvhAsyncTaskArray<String> eligibility_search_streetNumbers_POST(String streetCode) throws IOException {
		String qPath = "/xdsl/eligibility/search/streetNumbers";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streetCode", streetCode);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t8);
	}
	private static TypeReference<OvhAsyncTaskArray<String>> t8 = new TypeReference<OvhAsyncTaskArray<String>>() {};

	/**
	 * Get all buildings for a specific address
	 *
	 * REST: POST /xdsl/eligibility/search/buildings
	 * @param streetCode [required] Unique identifier of the street (you can get it with POST /xdsl/eligibility/search/streets)
	 * @param streetNumber [required] Street number
	 * @deprecated
	 */
	public OvhAsyncTaskArray<OvhBuilding> eligibility_search_buildings_POST(String streetCode, String streetNumber) throws IOException {
		String qPath = "/xdsl/eligibility/search/buildings";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streetCode", streetCode);
		addBody(o, "streetNumber", streetNumber);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t9);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhBuilding>> t9 = new TypeReference<OvhAsyncTaskArray<OvhBuilding>>() {};

	/**
	 * Get all localities linked to a zip code
	 *
	 * REST: POST /xdsl/eligibility/search/cities
	 * @param zipCode [required] Zip code
	 * @deprecated
	 */
	public OvhAsyncTaskArray<OvhCity> eligibility_search_cities_POST(String zipCode) throws IOException {
		String qPath = "/xdsl/eligibility/search/cities";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zipCode", zipCode);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t10);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhCity>> t10 = new TypeReference<OvhAsyncTaskArray<OvhCity>>() {};

	/**
	 * Get all street linked to a locality
	 *
	 * REST: POST /xdsl/eligibility/search/fiberStreets
	 * @param inseeCode [required] French INSEE identifier (you can get it with POST /xdsl/eligibility/search/cities)
	 * @deprecated
	 */
	public OvhAsyncTaskArray<OvhFiberStreet> eligibility_search_fiberStreets_POST(String inseeCode) throws IOException {
		String qPath = "/xdsl/eligibility/search/fiberStreets";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "inseeCode", inseeCode);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t11);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhFiberStreet>> t11 = new TypeReference<OvhAsyncTaskArray<OvhFiberStreet>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/incidents/{id}
	 * @param id [required] ID of the incident
	 */
	public OvhIncident incidents_id_GET(Long id) throws IOException {
		String qPath = "/xdsl/incidents/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIncident.class);
	}

	/**
	 * List of incidents
	 *
	 * REST: GET /xdsl/incidents
	 * @param endDate [required] Filter the value of endDate property (<)
	 * @param creationDate [required] Filter the value of creationDate property (>)
	 */
	public ArrayList<Long> incidents_GET(Date creationDate, Date endDate) throws IOException {
		String qPath = "/xdsl/incidents";
		StringBuilder sb = path(qPath);
		query(sb, "creationDate", creationDate);
		query(sb, "endDate", endDate);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}
	private static TypeReference<ArrayList<Long>> t12 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /xdsl/email/pro
	 */
	public ArrayList<String> email_pro_GET() throws IOException {
		String qPath = "/xdsl/email/pro";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Change the email password
	 *
	 * REST: POST /xdsl/email/pro/{email}/changePassword
	 * @param password [required] New email password
	 * @param email [required] The email address if the XDSL Email Pro
	 */
	public OvhTask email_pro_email_changePassword_POST(String email, String password) throws IOException {
		String qPath = "/xdsl/email/pro/{email}/changePassword";
		StringBuilder sb = path(qPath, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/email/pro/{email}
	 * @param email [required] The email address if the XDSL Email Pro
	 */
	public OvhXdslEmailPro email_pro_email_GET(String email) throws IOException {
		String qPath = "/xdsl/email/pro/{email}";
		StringBuilder sb = path(qPath, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhXdslEmailPro.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/email/pro/{email}
	 * @param body [required] New object properties
	 * @param email [required] The email address if the XDSL Email Pro
	 */
	public void email_pro_email_PUT(String email, OvhXdslEmailPro body) throws IOException {
		String qPath = "/xdsl/email/pro/{email}";
		StringBuilder sb = path(qPath, email);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the email
	 *
	 * REST: DELETE /xdsl/email/pro/{email}
	 * @param email [required] The email address if the XDSL Email Pro
	 */
	public void email_pro_email_DELETE(String email) throws IOException {
		String qPath = "/xdsl/email/pro/{email}";
		StringBuilder sb = path(qPath, email);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * List available services
	 *
	 * REST: GET /xdsl/spare
	 */
	public ArrayList<String> spare_GET() throws IOException {
		String qPath = "/xdsl/spare";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/spare/{spare}/serviceInfos
	 * @param spare [required] The internal name of your spare
	 */
	public OvhService spare_spare_serviceInfos_GET(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}/serviceInfos";
		StringBuilder sb = path(qPath, spare);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/spare/{spare}/serviceInfos
	 * @param body [required] New object properties
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_serviceInfos_PUT(String spare, OvhService body) throws IOException {
		String qPath = "/xdsl/spare/{spare}/serviceInfos";
		StringBuilder sb = path(qPath, spare);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Return the list of brand compatible to be replaced
	 *
	 * REST: GET /xdsl/spare/{spare}/compatibleReplacement
	 * @param spare [required] The internal name of your spare
	 */
	public ArrayList<String> spare_spare_compatibleReplacement_GET(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}/compatibleReplacement";
		StringBuilder sb = path(qPath, spare);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/spare/{spare}
	 * @param spare [required] The internal name of your spare
	 */
	public OvhXdslSpare spare_spare_GET(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}";
		StringBuilder sb = path(qPath, spare);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhXdslSpare.class);
	}

	/**
	 * Delete the spare as if it was not belonging to OVH anymore
	 *
	 * REST: DELETE /xdsl/spare/{spare}
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_DELETE(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}";
		StringBuilder sb = path(qPath, spare);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Replace the modem by its spare
	 *
	 * REST: POST /xdsl/spare/{spare}/replace
	 * @param domain [required] The modem to replace by the spare
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_replace_POST(String spare, String domain) throws IOException {
		String qPath = "/xdsl/spare/{spare}/replace";
		StringBuilder sb = path(qPath, spare);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Return the broken equipment in instantRefund
	 *
	 * REST: POST /xdsl/spare/{spare}/returnMerchandise
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_returnMerchandise_POST(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}/returnMerchandise";
		StringBuilder sb = path(qPath, spare);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get all available spare brands
	 *
	 * REST: GET /xdsl/spare/brands
	 */
	public ArrayList<String> spare_brands_GET() throws IOException {
		String qPath = "/xdsl/spare/brands";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Resiliate the access
	 *
	 * REST: POST /xdsl/{serviceName}/resiliate
	 * @param resiliationDate [required] The desired resiliation date
	 * @param resiliationSurvey [required] Comment about resiliation reasons
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhResiliationFollowUpDetail serviceName_resiliate_POST(String serviceName, Date resiliationDate, OvhResiliationSurvey resiliationSurvey) throws IOException {
		String qPath = "/xdsl/{serviceName}/resiliate";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "resiliationDate", resiliationDate);
		addBody(o, "resiliationSurvey", resiliationSurvey);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhResiliationFollowUpDetail.class);
	}

	/**
	 * Change the status of the IPv6 for this access
	 *
	 * REST: POST /xdsl/{serviceName}/ipv6
	 * @param enabled [required] Should the IPv6 be enabled ?
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_ipv6_POST(String serviceName, Boolean enabled) throws IOException {
		String qPath = "/xdsl/{serviceName}/ipv6";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "enabled", enabled);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/pendingAction
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhPendingAction serviceName_pendingAction_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/pendingAction";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPendingAction.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/diagnostic
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhAccessDiagnostic serviceName_diagnostic_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/diagnostic";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccessDiagnostic.class);
	}

	/**
	 * Run diagnostic on the access
	 *
	 * REST: POST /xdsl/{serviceName}/diagnostic
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_diagnostic_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/diagnostic";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Renew PPP password and send the PPP login informations to the e-mail of the nicAdmin
	 *
	 * REST: POST /xdsl/{serviceName}/requestPPPLoginMail
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_requestPPPLoginMail_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/requestPPPLoginMail";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get various statistics about this access
	 *
	 * REST: GET /xdsl/{serviceName}/statistics
	 * @param type [required]
	 * @param period [required]
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhUnitAndValues<OvhTimestampAndValue> serviceName_statistics_GET(String serviceName, OvhStatisticsPeriodEnum period, OvhAccessStatisticsTypeEnum type) throws IOException {
		String qPath = "/xdsl/{serviceName}/statistics";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t13);
	}
	private static TypeReference<OvhUnitAndValues<OvhTimestampAndValue>> t13 = new TypeReference<OvhUnitAndValues<OvhTimestampAndValue>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhAccess serviceName_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccess.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_PUT(String serviceName, OvhAccess body) throws IOException {
		String qPath = "/xdsl/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get information about the ongoing resiliation
	 *
	 * REST: GET /xdsl/{serviceName}/resiliationFollowup
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhResiliationFollowUpDetail serviceName_resiliationFollowup_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/resiliationFollowup";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResiliationFollowUpDetail.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/tasks/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_tasks_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/xdsl/{serviceName}/tasks/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Delete the task in problem from the results
	 *
	 * REST: POST /xdsl/{serviceName}/tasks/{id}/archive
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_tasks_id_archive_POST(String serviceName, Long id) throws IOException {
		String qPath = "/xdsl/{serviceName}/tasks/{id}/archive";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Tasks scheduled for this access
	 *
	 * REST: GET /xdsl/{serviceName}/tasks
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, String function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/xdsl/{serviceName}/tasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}

	/**
	 * Give the price to requestTotalDeconsolidation on the access
	 *
	 * REST: GET /xdsl/{serviceName}/totalDeconsolidationTerms
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhDeconsolidationTerms serviceName_totalDeconsolidationTerms_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/totalDeconsolidationTerms";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDeconsolidationTerms.class);
	}

	/**
	 * List of PortMappings on this modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/portMappings
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_modem_portMappings_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a port mapping
	 *
	 * REST: POST /xdsl/{serviceName}/modem/portMappings
	 * @param allowedRemoteIp [required] An ip which will access to the defined rule. Default : no restriction applied
	 * @param name [required] Name of the port mapping entry
	 * @param externalPortEnd [required] The last port of the interval on the External Client that will get the connections
	 * @param internalPort [required] The port on the Internal Client that will get the connections
	 * @param internalClient [required] The IP address of the destination of the packets
	 * @param protocol [required] Protocol of the port mapping (TCP / UDP)
	 * @param description [required] Description of the Port Mapping
	 * @param externalPortStart [required] External Port that the modem will listen on
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhPortMapping serviceName_modem_portMappings_POST(String serviceName, String allowedRemoteIp, String name, Long externalPortEnd, Long internalPort, String internalClient, OvhProtocolTypeEnum protocol, String description, Long externalPortStart) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowedRemoteIp", allowedRemoteIp);
		addBody(o, "name", name);
		addBody(o, "externalPortEnd", externalPortEnd);
		addBody(o, "internalPort", internalPort);
		addBody(o, "internalClient", internalClient);
		addBody(o, "protocol", protocol);
		addBody(o, "description", description);
		addBody(o, "externalPortStart", externalPortStart);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhPortMapping.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/modem/portMappings/{name}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param name [required] Name of the port mapping entry
	 */
	public OvhPortMapping serviceName_modem_portMappings_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPortMapping.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}/modem/portMappings/{name}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param name [required] Name of the port mapping entry
	 */
	public void serviceName_modem_portMappings_name_PUT(String serviceName, String name, OvhPortMapping body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete this port mapping
	 *
	 * REST: DELETE /xdsl/{serviceName}/modem/portMappings/{name}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param name [required] Name of the port mapping entry
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_portMappings_name_DELETE(String serviceName, String name) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Reboot the modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/reboot
	 * @param todoDate [required] Date when the reboot will start
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_reboot_POST(String serviceName, Date todoDate) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/reboot";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "todoDate", todoDate);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Remove all the current port mapping rules and set the same config as the access given in parameters
	 *
	 * REST: POST /xdsl/{serviceName}/modem/duplicatePortMappingConfig
	 * @param accessName [required] The access name with the config you want to duplicate
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @deprecated
	 */
	public void serviceName_modem_duplicatePortMappingConfig_POST(String serviceName, String accessName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/duplicatePortMappingConfig";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accessName", accessName);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Refresh the list of connected devices on the modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/refreshConnectedDevices
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_refreshConnectedDevices_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/refreshConnectedDevices";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Launch a task to install target firmware on modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/firmware
	 * @param todoDate [required] Date of execution, default is now
	 * @param firmware [required] The firmware version to upgrade to
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_firmware_POST(String serviceName, Date todoDate, String firmware) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/firmware";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "todoDate", todoDate);
		addBody(o, "firmware", firmware);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get the firmware version installed on modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/firmware
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public String serviceName_modem_firmware_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/firmware";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get the status of sip alg service on modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/sipAlg
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_sipAlg_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/sipAlg";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Change the status of the sip alg service on modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/sipAlg
	 * @param sipAlg [required] the new status of the sip alg service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_sipAlg_POST(String serviceName, OvhServiceStatusEnum sipAlg) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/sipAlg";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "sipAlg", sipAlg);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get the status of the Bloc IP on modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/blocIp
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_blocIp_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/blocIp";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Change the status of the Bloc IP on modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/blocIp
	 * @param status [required] the new status of the bloc ip service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_blocIp_POST(String serviceName, OvhServiceStatusEnum status) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/blocIp";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "status", status);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/modem/connectedDevices/{macAddress}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param macAddress [required] MAC address of the device
	 */
	public OvhConnectedDevice serviceName_modem_connectedDevices_macAddress_GET(String serviceName, String macAddress) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/connectedDevices/{macAddress}";
		StringBuilder sb = path(qPath, serviceName, macAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhConnectedDevice.class);
	}

	/**
	 * List of devices connected on this modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/connectedDevices
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_modem_connectedDevices_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/connectedDevices";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * List available firmware for this modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/firmwareAvailable
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_modem_firmwareAvailable_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/firmwareAvailable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 */
	public OvhLAN serviceName_modem_lan_lanName_GET(String serviceName, String lanName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}";
		StringBuilder sb = path(qPath, serviceName, lanName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhLAN.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}/modem/lan/{lanName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 */
	public void serviceName_modem_lan_lanName_PUT(String serviceName, String lanName, OvhLAN body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}";
		StringBuilder sb = path(qPath, serviceName, lanName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * List of DHCP on this modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}/dhcp
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 */
	public ArrayList<String> serviceName_modem_lan_lanName_dhcp_GET(String serviceName, String lanName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp";
		StringBuilder sb = path(qPath, serviceName, lanName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 * @param MACAddress [required] The MAC address of the device
	 */
	public OvhDHCPStaticAddress serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_MACAddress_GET(String serviceName, String lanName, String dhcpName, String MACAddress) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}";
		StringBuilder sb = path(qPath, serviceName, lanName, dhcpName, MACAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDHCPStaticAddress.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 * @param MACAddress [required] The MAC address of the device
	 */
	public void serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_MACAddress_PUT(String serviceName, String lanName, String dhcpName, String MACAddress, OvhDHCPStaticAddress body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}";
		StringBuilder sb = path(qPath, serviceName, lanName, dhcpName, MACAddress);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete this port mapping
	 *
	 * REST: DELETE /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 * @param MACAddress [required] The MAC address of the device
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_MACAddress_DELETE(String serviceName, String lanName, String dhcpName, String MACAddress) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}";
		StringBuilder sb = path(qPath, serviceName, lanName, dhcpName, MACAddress);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * List of DHCP Static Address of this modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 */
	public ArrayList<String> serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_GET(String serviceName, String lanName, String dhcpName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses";
		StringBuilder sb = path(qPath, serviceName, lanName, dhcpName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a DHCP static lease
	 *
	 * REST: POST /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses
	 * @param MACAddress [required] The MAC address of the device
	 * @param IPAddress [required] The IP address of the device
	 * @param name [required] Name of the DHCP static lease
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 */
	public OvhDHCPStaticAddress serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_POST(String serviceName, String lanName, String dhcpName, String MACAddress, String IPAddress, String name) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses";
		StringBuilder sb = path(qPath, serviceName, lanName, dhcpName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "MACAddress", MACAddress);
		addBody(o, "IPAddress", IPAddress);
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhDHCPStaticAddress.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 */
	public OvhDHCP serviceName_modem_lan_lanName_dhcp_dhcpName_GET(String serviceName, String lanName, String dhcpName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}";
		StringBuilder sb = path(qPath, serviceName, lanName, dhcpName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDHCP.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 */
	public void serviceName_modem_lan_lanName_dhcp_dhcpName_PUT(String serviceName, String lanName, String dhcpName, OvhDHCP body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}";
		StringBuilder sb = path(qPath, serviceName, lanName, dhcpName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * List of LANs on this modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/lan
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_modem_lan_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Change the status of the Upnp on modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/upnp
	 * @param upnp [required] the new status of the upnp service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_upnp_POST(String serviceName, OvhServiceStatusEnum upnp) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/upnp";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "upnp", upnp);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get the status of the Upnp on modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/upnp
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_upnp_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/upnp";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * get general Modem information
	 *
	 * REST: POST /xdsl/{serviceName}/modem/retrieveInfo
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhAsyncTask<OvhModemInfo> serviceName_modem_retrieveInfo_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/retrieveInfo";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, t14);
	}
	private static TypeReference<OvhAsyncTask<OvhModemInfo>> t14 = new TypeReference<OvhAsyncTask<OvhModemInfo>>() {};

	/**
	 * Remove all the current port mapping rules
	 *
	 * REST: POST /xdsl/{serviceName}/modem/resetPortMappingConfig
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_modem_resetPortMappingConfig_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/resetPortMappingConfig";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * List of WLANs on this modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/wifi
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_modem_wifi_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/wifi";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/modem/wifi/{wifiName}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param wifiName [required] Name of the Wifi
	 */
	public OvhWLAN serviceName_modem_wifi_wifiName_GET(String serviceName, String wifiName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/wifi/{wifiName}";
		StringBuilder sb = path(qPath, serviceName, wifiName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhWLAN.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}/modem/wifi/{wifiName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param wifiName [required] Name of the Wifi
	 */
	public void serviceName_modem_wifi_wifiName_PUT(String serviceName, String wifiName, OvhWLAN body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/wifi/{wifiName}";
		StringBuilder sb = path(qPath, serviceName, wifiName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get the status of contentSharing on modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/contentSharing
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_contentSharing_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/contentSharing";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Change the status of contentSharing on modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/contentSharing
	 * @param contentSharing [required] the new status of the contentSharing service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_contentSharing_POST(String serviceName, OvhServiceStatusEnum contentSharing) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/contentSharing";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contentSharing", contentSharing);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * List available WLAN channel for this modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/availableWLANChannel
	 * @param frequency [required] WLAN frequency you want to retrieve channels
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<Long> serviceName_modem_availableWLANChannel_GET(String serviceName, OvhWLANFrequencyEnum frequency) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/availableWLANChannel";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "frequency", frequency);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}

	/**
	 * Get the status of ipsec alg service on modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/ipsecAlg
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_ipsecAlg_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/ipsecAlg";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Change the status of the ipsec alg service on modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/ipsecAlg
	 * @param ipsecAlg [required] the new status of the ipsec alg service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_ipsecAlg_POST(String serviceName, OvhServiceStatusEnum ipsecAlg) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/ipsecAlg";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipsecAlg", ipsecAlg);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/modem
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhModem serviceName_modem_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhModem.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}/modem
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_modem_PUT(String serviceName, OvhModem body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Reset the modem to its default configuration
	 *
	 * REST: POST /xdsl/{serviceName}/modem/reset
	 * @param resetOvhConfig [required] Reset configuration stored in OVH databases
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_reset_POST(String serviceName, Boolean resetOvhConfig) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/reset";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "resetOvhConfig", resetOvhConfig);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get the status of callWaiting on modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/callWaiting
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_callWaiting_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/callWaiting";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Change the status of callWaiting on modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/callWaiting
	 * @param callWaiting [required] the new status of the callWaiting service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_callWaiting_POST(String serviceName, OvhServiceStatusEnum callWaiting) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/callWaiting";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "callWaiting", callWaiting);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get the status of ftp service on modem
	 *
	 * REST: GET /xdsl/{serviceName}/modem/ftp
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_ftp_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/ftp";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Change the status of the ftp service on modem
	 *
	 * REST: POST /xdsl/{serviceName}/modem/ftp
	 * @param ftp [required] the new status of the ftp service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_modem_ftp_POST(String serviceName, OvhServiceStatusEnum ftp) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/ftp";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ftp", ftp);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * List antiSpams for this access
	 *
	 * REST: GET /xdsl/{serviceName}/antiSpams
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_antiSpams_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/antiSpams";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/antiSpams/{ip}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param ip [required] IP which spam
	 */
	public OvhAntiSpam serviceName_antiSpams_ip_GET(String serviceName, String ip) throws IOException {
		String qPath = "/xdsl/{serviceName}/antiSpams/{ip}";
		StringBuilder sb = path(qPath, serviceName, ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAntiSpam.class);
	}

	/**
	 * List of evidences stored on PCS for this ip
	 *
	 * REST: GET /xdsl/{serviceName}/antiSpams/{ip}/evidences
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param ip [required] IP which spam
	 */
	public OvhEvidencesInfo serviceName_antiSpams_ip_evidences_GET(String serviceName, String ip) throws IOException {
		String qPath = "/xdsl/{serviceName}/antiSpams/{ip}/evidences";
		StringBuilder sb = path(qPath, serviceName, ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEvidencesInfo.class);
	}

	/**
	 * List the notifications for this access
	 *
	 * REST: GET /xdsl/{serviceName}/monitoringNotifications
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<Long> serviceName_monitoringNotifications_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}

	/**
	 * Add a notification
	 *
	 * REST: POST /xdsl/{serviceName}/monitoringNotifications
	 * @param email [required] The e-mail address, if type is mail
	 * @param frequency [required]
	 * @param smsAccount [required] The SMS account which will be debited for each sent SMS, if the type is sms
	 * @param type [required]
	 * @param phone [required] The phone number, if type is sms
	 * @param downThreshold [required] [default=120] The number of seconds the access has to be down to trigger the alert
	 * @param allowIncident [required] [default=true] Whether or not to allow notifications concerning generic incidents
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhMonitoringNotification serviceName_monitoringNotifications_POST(String serviceName, String email, OvhFrequencyEnum frequency, String smsAccount, OvhTypeEnum type, String phone, Long downThreshold, Boolean allowIncident) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "frequency", frequency);
		addBody(o, "smsAccount", smsAccount);
		addBody(o, "type", type);
		addBody(o, "phone", phone);
		addBody(o, "downThreshold", downThreshold);
		addBody(o, "allowIncident", allowIncident);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhMonitoringNotification.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/monitoringNotifications/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public OvhMonitoringNotification serviceName_monitoringNotifications_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMonitoringNotification.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}/monitoringNotifications/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_monitoringNotifications_id_PUT(String serviceName, Long id, OvhMonitoringNotification body) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete this notification
	 *
	 * REST: DELETE /xdsl/{serviceName}/monitoringNotifications/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_monitoringNotifications_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/xdsl/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/incident
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhIncident serviceName_incident_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/incident";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIncident.class);
	}

	/**
	 * Informations about the extra IP range during address move
	 *
	 * REST: GET /xdsl/{serviceName}/addressMove/extraIpRange
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhExtraIpRangeMove serviceName_addressMove_extraIpRange_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/addressMove/extraIpRange";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhExtraIpRangeMove.class);
	}

	/**
	 * Initiate the extra IP range migration
	 *
	 * REST: POST /xdsl/{serviceName}/addressMove/extraIpRangeMove
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_addressMove_extraIpRangeMove_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/addressMove/extraIpRangeMove";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Apply TemplateModem to existing Modem
	 *
	 * REST: POST /xdsl/{serviceName}/applyTemplateToModem
	 * @param templateName [required] Modem Template Name
	 * @param serviceName [required] The internal name of your XDSL offer
	 *
	 * API beta
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_applyTemplateToModem_POST(String serviceName, String templateName) throws IOException {
		String qPath = "/xdsl/{serviceName}/applyTemplateToModem";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "templateName", templateName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get resiliation terms
	 *
	 * REST: GET /xdsl/{serviceName}/resiliationTerms
	 * @param resiliationDate [required] The desired resiliation date
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhResiliationTerms serviceName_resiliationTerms_GET(String serviceName, Date resiliationDate) throws IOException {
		String qPath = "/xdsl/{serviceName}/resiliationTerms";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "resiliationDate", resiliationDate);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResiliationTerms.class);
	}

	/**
	 * Reset the port on the DSLAM
	 *
	 * REST: POST /xdsl/{serviceName}/lines/{number}/dslamPort/reset
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_lines_number_dslamPort_reset_POST(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort/reset";
		StringBuilder sb = path(qPath, serviceName, number);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/lines/{number}/dslamPort
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public OvhDslamPort serviceName_lines_number_dslamPort_GET(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort";
		StringBuilder sb = path(qPath, serviceName, number);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDslamPort.class);
	}

	/**
	 * List all availables profiles for this port
	 *
	 * REST: GET /xdsl/{serviceName}/lines/{number}/dslamPort/availableProfiles
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public ArrayList<OvhDslamLineProfile> serviceName_lines_number_dslamPort_availableProfiles_GET(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort/availableProfiles";
		StringBuilder sb = path(qPath, serviceName, number);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t15);
	}
	private static TypeReference<ArrayList<OvhDslamLineProfile>> t15 = new TypeReference<ArrayList<OvhDslamLineProfile>>() {};

	/**
	 * Change the profile of the port
	 *
	 * REST: POST /xdsl/{serviceName}/lines/{number}/dslamPort/changeProfile
	 * @param dslamProfileId [required] The id of the xdsl.DslamLineProfile
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_lines_number_dslamPort_changeProfile_POST(String serviceName, String number, Long dslamProfileId) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort/changeProfile";
		StringBuilder sb = path(qPath, serviceName, number);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dslamProfileId", dslamProfileId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get the logs emitted by the DSLAM for this port
	 *
	 * REST: GET /xdsl/{serviceName}/lines/{number}/dslamPort/logs
	 * @param limit [required] [default=50]
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public ArrayList<OvhDslamPortLog> serviceName_lines_number_dslamPort_logs_GET(String serviceName, String number, Long limit) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort/logs";
		StringBuilder sb = path(qPath, serviceName, number);
		query(sb, "limit", limit);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t16);
	}
	private static TypeReference<ArrayList<OvhDslamPortLog>> t16 = new TypeReference<ArrayList<OvhDslamPortLog>>() {};

	/**
	 * Get various statistics about the line
	 *
	 * REST: GET /xdsl/{serviceName}/lines/{number}/statistics
	 * @param period [required]
	 * @param type [required]
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public OvhUnitAndValues<OvhTimestampAndValue> serviceName_lines_number_statistics_GET(String serviceName, String number, OvhStatisticsPeriodEnum period, OvhLineStatisticsTypeEnum type) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/statistics";
		StringBuilder sb = path(qPath, serviceName, number);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t13);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/lines/{number}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public net.minidev.ovh.api.xdsl.OvhLine serviceName_lines_number_GET(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}";
		StringBuilder sb = path(qPath, serviceName, number);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhLine.class);
	}

	/**
	 * Update and get advanced diagnostic of the line
	 *
	 * REST: POST /xdsl/{serviceName}/lines/{number}/diagnostic/run
	 * @param actionsDone [required] Customer possible actions
	 * @param faultType [required] [default=noSync] Line diagnostic type. Depends of problem
	 * @param answers [required] Customer answers for line diagnostic
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public OvhDiagnostic serviceName_lines_number_diagnostic_run_POST(String serviceName, String number, OvhCustomerActionsEnum[] actionsDone, OvhFaultTypeEnum faultType, OvhAnswers answers) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/diagnostic/run";
		StringBuilder sb = path(qPath, serviceName, number);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "actionsDone", actionsDone);
		addBody(o, "faultType", faultType);
		addBody(o, "answers", answers);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhDiagnostic.class);
	}

	/**
	 * Cancel line diagnostic if possible
	 *
	 * REST: POST /xdsl/{serviceName}/lines/{number}/diagnostic/cancel
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public void serviceName_lines_number_diagnostic_cancel_POST(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/diagnostic/cancel";
		StringBuilder sb = path(qPath, serviceName, number);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * The lines of the access
	 *
	 * REST: GET /xdsl/{serviceName}/lines
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_lines_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Unlock order in "waitingCustomer" status. It only concerns orders whose modem is sent before anything have been forwarded to our provider
	 *
	 * REST: POST /xdsl/{serviceName}/sendOrderToProvider
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_sendOrderToProvider_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/sendOrderToProvider";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get the status of the order
	 *
	 * REST: GET /xdsl/{serviceName}/orderFollowup
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<OvhStep> serviceName_orderFollowup_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/orderFollowup";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t17);
	}
	private static TypeReference<ArrayList<OvhStep>> t17 = new TypeReference<ArrayList<OvhStep>>() {};

	/**
	 * Update RIO, or disable portability, for order in error because of missing or invalid RIO
	 *
	 * REST: POST /xdsl/{serviceName}/updateInvalidOrMissingRio
	 * @param relaunchWithoutPortability [required] Do not set RIO, and relaunch order without portability
	 * @param rio [required] RIO number for portability
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_updateInvalidOrMissingRio_POST(String serviceName, Boolean relaunchWithoutPortability, String rio) throws IOException {
		String qPath = "/xdsl/{serviceName}/updateInvalidOrMissingRio";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "relaunchWithoutPortability", relaunchWithoutPortability);
		addBody(o, "rio", rio);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get information about the ongoing resiliation
	 *
	 * REST: GET /xdsl/{serviceName}/canCancelResiliation
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public Boolean serviceName_canCancelResiliation_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/canCancelResiliation";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * List the radius connection logs
	 *
	 * REST: GET /xdsl/{serviceName}/radiusConnectionLogs
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<OvhRadiusConnectionLog> serviceName_radiusConnectionLogs_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/radiusConnectionLogs";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t18);
	}
	private static TypeReference<ArrayList<OvhRadiusConnectionLog>> t18 = new TypeReference<ArrayList<OvhRadiusConnectionLog>>() {};

	/**
	 * Cancel the ongoing resiliation
	 *
	 * REST: POST /xdsl/{serviceName}/cancelResiliation
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_cancelResiliation_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/cancelResiliation";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /xdsl/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/xdsl/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t12);
	}

	/**
	 * Switch this access to total deconsolidation
	 *
	 * REST: POST /xdsl/{serviceName}/requestTotalDeconsolidation
	 * @param rio [required] A token to prove the ownership of the line number, needed to port the number
	 * @param noPortability [required] Do not port the number
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_requestTotalDeconsolidation_POST(String serviceName, String rio, Boolean noPortability) throws IOException {
		String qPath = "/xdsl/{serviceName}/requestTotalDeconsolidation";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "rio", rio);
		addBody(o, "noPortability", noPortability);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Return Merchandise Authorisation associated
	 *
	 * REST: GET /xdsl/{serviceName}/rma
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_rma_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/rma";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/rma/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Return merchandise authorisation identifier
	 */
	public OvhRma serviceName_rma_id_GET(String serviceName, String id) throws IOException {
		String qPath = "/xdsl/{serviceName}/rma/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRma.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /xdsl/{serviceName}/rma/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Return merchandise authorisation identifier
	 */
	public void serviceName_rma_id_PUT(String serviceName, String id, OvhRma body) throws IOException {
		String qPath = "/xdsl/{serviceName}/rma/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Cancel the rma
	 *
	 * REST: DELETE /xdsl/{serviceName}/rma/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Return merchandise authorisation identifier
	 */
	public void serviceName_rma_id_DELETE(String serviceName, String id) throws IOException {
		String qPath = "/xdsl/{serviceName}/rma/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * List of IPs addresses for this access
	 *
	 * REST: GET /xdsl/{serviceName}/ips
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_ips_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/ips";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Order an extra /29 range of IPv4 addresses
	 *
	 * REST: POST /xdsl/{serviceName}/ips
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public net.minidev.ovh.api.xdsl.OvhTask serviceName_ips_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/ips";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.xdsl.OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /xdsl/{serviceName}/ips/{ip}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param ip [required] The IP address
	 */
	public OvhIP serviceName_ips_ip_GET(String serviceName, String ip) throws IOException {
		String qPath = "/xdsl/{serviceName}/ips/{ip}";
		StringBuilder sb = path(qPath, serviceName, ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIP.class);
	}

	/**
	 * Stop renewing this extra IPv4 option
	 *
	 * REST: DELETE /xdsl/{serviceName}/ips/{ip}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param ip [required] The IP address
	 */
	public void serviceName_ips_ip_DELETE(String serviceName, String ip) throws IOException {
		String qPath = "/xdsl/{serviceName}/ips/{ip}";
		StringBuilder sb = path(qPath, serviceName, ip);
		exec(qPath, "DELETE", sb.toString(), null);
	}
}
