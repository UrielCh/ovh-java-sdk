package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.connectivity.eligibility.OvhBuilding;
import net.minidev.ovh.api.connectivity.eligibility.OvhCity;
import net.minidev.ovh.api.connectivity.eligibility.OvhEligibilityTest;
import net.minidev.ovh.api.connectivity.eligibility.OvhLine;
import net.minidev.ovh.api.connectivity.eligibility.OvhLineStatusEnum;
import net.minidev.ovh.api.connectivity.eligibility.OvhMeetings;
import net.minidev.ovh.api.connectivity.eligibility.OvhStreet;
import net.minidev.ovh.api.connectivity.monitoring.OvhGenericIncident;
import net.minidev.ovh.api.connectivity.monitoring.OvhGenericIncidentStatusEnum;
import net.minidev.ovh.api.xdsl.OvhAsyncTask;
import net.minidev.ovh.api.xdsl.OvhAsyncTaskArray;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/connectivity
 * version:1.0
 */
public class ApiOvhConnectivity extends ApiOvhBase {
	public ApiOvhConnectivity(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List validated and recently closed generic incidents
	 *
	 * REST: GET /connectivity/monitoring/genericIncident/public
	 * @param status [required] Filter by the status of the incident (validated or closed)
	 * @param creationDate [required] List only incidents created after this date
	 * @param endDate [required] List only incidents closed prior to this date
	 *
	 * API beta
	 */
	public ArrayList<OvhGenericIncident> monitoring_genericIncident_public_GET(Date creationDate, Date endDate, OvhGenericIncidentStatusEnum status) throws IOException {
		String qPath = "/connectivity/monitoring/genericIncident/public";
		StringBuilder sb = path(qPath);
		query(sb, "creationDate", creationDate);
		query(sb, "endDate", endDate);
		query(sb, "status", status);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhGenericIncident>> t1 = new TypeReference<ArrayList<OvhGenericIncident>>() {};

	/**
	 * List detected, validated and recently closed generic incidents. For partners only
	 *
	 * REST: GET /connectivity/monitoring/genericIncident/partners
	 * @param status [required] Filter by the status of the incident (detected, validated or closed)
	 * @param creationDate [required] List only incidents created after this date
	 * @param endDate [required] List only incidents closed prior to this date
	 *
	 * API beta
	 */
	public ArrayList<OvhGenericIncident> monitoring_genericIncident_partners_GET(Date creationDate, Date endDate, OvhGenericIncidentStatusEnum status) throws IOException {
		String qPath = "/connectivity/monitoring/genericIncident/partners";
		StringBuilder sb = path(qPath);
		query(sb, "creationDate", creationDate);
		query(sb, "endDate", endDate);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Do an eligibility test on an OTP (Optical Termination Panel), for fiber only
	 *
	 * REST: POST /connectivity/eligibility/test/otp
	 * @param otp [required] OTP (Optical Termination Panel) identifier
	 */
	public OvhAsyncTask<OvhEligibilityTest> eligibility_test_otp_POST(String otp) throws IOException {
		String qPath = "/connectivity/eligibility/test/otp";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "otp", otp);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<OvhAsyncTask<OvhEligibilityTest>> t2 = new TypeReference<OvhAsyncTask<OvhEligibilityTest>>() {};

	/**
	 * Do an eligibility test on a building, for fiber only
	 *
	 * REST: POST /connectivity/eligibility/test/building
	 * @param building [required] Building identifier, that can be found using /connectivity/eligibility/search/building* methods
	 */
	public OvhAsyncTask<OvhEligibilityTest> eligibility_test_building_POST(String building) throws IOException {
		String qPath = "/connectivity/eligibility/test/building";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "building", building);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * Do an eligibility for an address, if no line exist
	 *
	 * REST: POST /connectivity/eligibility/test/address
	 * @param streetNumber [required] Street number
	 * @param streetCode [required] Unique identifier of the street (you can get it with POST /connectivity/eligibility/search/streets)
	 */
	public OvhAsyncTask<OvhEligibilityTest> eligibility_test_address_POST(String streetCode, String streetNumber) throws IOException {
		String qPath = "/connectivity/eligibility/test/address";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streetCode", streetCode);
		addBody(o, "streetNumber", streetNumber);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * Do an eligibility for an address, if no line exist. Partners only.
	 *
	 * REST: POST /connectivity/eligibility/test/address/partners
	 * @param streetNumber [required] Street number
	 * @param streetCode [required] Unique identifier of the street (you can get it with POST /connectivity/eligibility/search/streets)
	 *
	 * API beta
	 */
	public OvhAsyncTask<OvhEligibilityTest> eligibility_test_address_partners_POST(String streetCode, String streetNumber) throws IOException {
		String qPath = "/connectivity/eligibility/test/address/partners";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streetCode", streetCode);
		addBody(o, "streetNumber", streetNumber);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * Get an eligibility by its reference
	 *
	 * REST: GET /connectivity/eligibility/test
	 * @param eligibilityReference [required] Eligibility reference
	 */
	public OvhEligibilityTest eligibility_test_GET(String eligibilityReference) throws IOException {
		String qPath = "/connectivity/eligibility/test";
		StringBuilder sb = path(qPath);
		query(sb, "eligibilityReference", eligibilityReference);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEligibilityTest.class);
	}

	/**
	 * Do an eligibility test on a line number, for copper only
	 *
	 * REST: POST /connectivity/eligibility/test/line
	 * @param status [required] Status of the line number
	 * @param lineNumber [required] Line number
	 */
	public OvhAsyncTask<OvhEligibilityTest> eligibility_test_line_POST(String lineNumber, OvhLineStatusEnum status) throws IOException {
		String qPath = "/connectivity/eligibility/test/line";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "lineNumber", lineNumber);
		addBody(o, "status", status);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * Do an eligibility test on a line number, for copper only. Partners only.
	 *
	 * REST: POST /connectivity/eligibility/test/line/partners
	 * @param lineNumber [required] Line number
	 * @param status [required] Status of the line number
	 *
	 * API beta
	 */
	public OvhAsyncTask<OvhEligibilityTest> eligibility_test_line_partners_POST(String lineNumber, OvhLineStatusEnum status) throws IOException {
		String qPath = "/connectivity/eligibility/test/line/partners";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "lineNumber", lineNumber);
		addBody(o, "status", status);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * Get all buildings for a specific address
	 *
	 * REST: POST /connectivity/eligibility/search/buildings
	 * @param streetNumber [required] Street number
	 * @param streetCode [required] Unique identifier of the street (you can get it with POST /connectivity/eligibility/search/streets)
	 */
	public OvhAsyncTaskArray<OvhBuilding> eligibility_search_buildings_POST(String streetCode, String streetNumber) throws IOException {
		String qPath = "/connectivity/eligibility/search/buildings";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streetCode", streetCode);
		addBody(o, "streetNumber", streetNumber);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhBuilding>> t3 = new TypeReference<OvhAsyncTaskArray<OvhBuilding>>() {};

	/**
	 * Get the details for a building
	 *
	 * REST: POST /connectivity/eligibility/search/buildingDetails
	 * @param building [required] Building identifier, that can be found using /connectivity/eligibility/search/building* methods
	 */
	public OvhAsyncTask<OvhBuilding> eligibility_search_buildingDetails_POST(String building) throws IOException {
		String qPath = "/connectivity/eligibility/search/buildingDetails";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "building", building);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t4);
	}
	private static TypeReference<OvhAsyncTask<OvhBuilding>> t4 = new TypeReference<OvhAsyncTask<OvhBuilding>>() {};

	/**
	 * Get all localities linked to a zip code
	 *
	 * REST: POST /connectivity/eligibility/search/cities
	 * @param zipCode [required] Zip code
	 */
	public OvhAsyncTaskArray<OvhCity> eligibility_search_cities_POST(String zipCode) throws IOException {
		String qPath = "/connectivity/eligibility/search/cities";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zipCode", zipCode);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t5);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhCity>> t5 = new TypeReference<OvhAsyncTaskArray<OvhCity>>() {};

	/**
	 * Get all street linked to a locality
	 *
	 * REST: POST /connectivity/eligibility/search/streets
	 * @param inseeCode [required] French INSEE identifier (you can get it with POST /connectivity/eligibility/search/cities)
	 */
	public OvhAsyncTaskArray<OvhStreet> eligibility_search_streets_POST(String inseeCode) throws IOException {
		String qPath = "/connectivity/eligibility/search/streets";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "inseeCode", inseeCode);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t6);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhStreet>> t6 = new TypeReference<OvhAsyncTaskArray<OvhStreet>>() {};

	/**
	 * Search for active and inactive lines at an address. It will search for active lines only if the owner name is specified
	 *
	 * REST: POST /connectivity/eligibility/search/lines
	 * @param ownerName [required] Owner name, at least the first three chars
	 * @param streetCode [required] Street code, that can be found using /connectivity/eligibility/search/streets method
	 * @param streetNumber [required] Street number, that can be found using /connectivity/eligibility/search/streetNumbers method
	 */
	public OvhAsyncTaskArray<OvhLine> eligibility_search_lines_POST(String ownerName, String streetCode, String streetNumber) throws IOException {
		String qPath = "/connectivity/eligibility/search/lines";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ownerName", ownerName);
		addBody(o, "streetCode", streetCode);
		addBody(o, "streetNumber", streetNumber);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t7);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhLine>> t7 = new TypeReference<OvhAsyncTaskArray<OvhLine>>() {};

	/**
	 * Get the available street numbers for a given street code (unique identifier of a street you can get with the method POST /connectivity/eligibility/search/streets)
	 *
	 * REST: POST /connectivity/eligibility/search/streetNumbers
	 * @param streetCode [required] Street code
	 */
	public OvhAsyncTaskArray<String> eligibility_search_streetNumbers_POST(String streetCode) throws IOException {
		String qPath = "/connectivity/eligibility/search/streetNumbers";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streetCode", streetCode);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t8);
	}
	private static TypeReference<OvhAsyncTaskArray<String>> t8 = new TypeReference<OvhAsyncTaskArray<String>>() {};

	/**
	 * Search for available line creation meeting time slots, for copper only
	 *
	 * REST: POST /connectivity/eligibility/search/meetings
	 * @param productCode [required] Choosen offer product code
	 * @param eligibilityReference [required] Eligibility test reference
	 */
	public OvhAsyncTask<OvhMeetings> eligibility_search_meetings_POST(String eligibilityReference, String productCode) throws IOException {
		String qPath = "/connectivity/eligibility/search/meetings";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "eligibilityReference", eligibilityReference);
		addBody(o, "productCode", productCode);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t9);
	}
	private static TypeReference<OvhAsyncTask<OvhMeetings>> t9 = new TypeReference<OvhAsyncTask<OvhMeetings>>() {};

	/**
	 * Get building references from a given line number
	 *
	 * REST: POST /connectivity/eligibility/search/buildingsByLine
	 * @param status [required] Status of the line number
	 * @param lineNumber [required] Line number
	 */
	public OvhAsyncTaskArray<OvhBuilding> eligibility_search_buildingsByLine_POST(String lineNumber, OvhLineStatusEnum status) throws IOException {
		String qPath = "/connectivity/eligibility/search/buildingsByLine";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "lineNumber", lineNumber);
		addBody(o, "status", status);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}
}
