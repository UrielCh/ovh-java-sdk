package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.HashMap;
import net.minidev.ovh.api.connectivity.eligibility.OvhBuilding;
import net.minidev.ovh.api.connectivity.eligibility.OvhCity;
import net.minidev.ovh.api.connectivity.eligibility.OvhEligibilityTest;
import net.minidev.ovh.api.connectivity.eligibility.OvhLine;
import net.minidev.ovh.api.connectivity.eligibility.OvhLineStatusEnum;
import net.minidev.ovh.api.connectivity.eligibility.OvhMeetings;
import net.minidev.ovh.api.connectivity.eligibility.OvhStreet;
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
	 * Do an eligibility test on a line number, for copper only
	 *
	 * REST: POST /connectivity/eligibility/test/line
	 * @param lineNumber [required] Line number
	 * @param status [required] Status of the line number
	 */
	public OvhAsyncTask<OvhEligibilityTest> eligibility_test_line_POST(String lineNumber, OvhLineStatusEnum status) throws IOException {
		String qPath = "/connectivity/eligibility/test/line";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "lineNumber", lineNumber);
		addBody(o, "status", status);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}
	private static TypeReference<OvhAsyncTask<OvhEligibilityTest>> t1 = new TypeReference<OvhAsyncTask<OvhEligibilityTest>>() {};

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
		return convertTo(resp, t1);
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
	 * Do an eligibility for an address, if no line exist
	 *
	 * REST: POST /connectivity/eligibility/test/address
	 * @param streetNumber [required] Street number
	 * @param streetCode [required] Unique identifier of the street (you can get it with POST /connectivity/eligibility/search/streets)
	 */
	public OvhAsyncTask<OvhEligibilityTest> eligibility_test_address_POST(String streetNumber, String streetCode) throws IOException {
		String qPath = "/connectivity/eligibility/test/address";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streetNumber", streetNumber);
		addBody(o, "streetCode", streetCode);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}

	/**
	 * Search for available line creation meeting time slots, for copper only
	 *
	 * REST: POST /connectivity/eligibility/search/meetings
	 * @param productCode [required] Choosen offer product code
	 * @param eligibilityReference [required] Eligibility test reference
	 */
	public OvhAsyncTask<OvhMeetings> eligibility_search_meetings_POST(String productCode, String eligibilityReference) throws IOException {
		String qPath = "/connectivity/eligibility/search/meetings";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "productCode", productCode);
		addBody(o, "eligibilityReference", eligibilityReference);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<OvhAsyncTask<OvhMeetings>> t2 = new TypeReference<OvhAsyncTask<OvhMeetings>>() {};

	/**
	 * Get all buildings for a specific address
	 *
	 * REST: POST /connectivity/eligibility/search/buildings
	 * @param streetCode [required] Unique identifier of the street (you can get it with POST /connectivity/eligibility/search/streets)
	 * @param streetNumber [required] Street number
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
		return convertTo(resp, t4);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhStreet>> t4 = new TypeReference<OvhAsyncTaskArray<OvhStreet>>() {};

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
		return convertTo(resp, t5);
	}
	private static TypeReference<OvhAsyncTask<OvhBuilding>> t5 = new TypeReference<OvhAsyncTask<OvhBuilding>>() {};

	/**
	 * Search for active and inactive lines at an address. It will search for active lines only if the owner name is specified
	 *
	 * REST: POST /connectivity/eligibility/search/lines
	 * @param streetNumber [required] Street number, that can be found using /connectivity/eligibility/search/streetNumbers method
	 * @param ownerName [required] Owner name, at least the first three chars
	 * @param streetCode [required] Street code, that can be found using /connectivity/eligibility/search/streets method
	 */
	public OvhAsyncTaskArray<OvhLine> eligibility_search_lines_POST(String streetNumber, String ownerName, String streetCode) throws IOException {
		String qPath = "/connectivity/eligibility/search/lines";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streetNumber", streetNumber);
		addBody(o, "ownerName", ownerName);
		addBody(o, "streetCode", streetCode);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t6);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhLine>> t6 = new TypeReference<OvhAsyncTaskArray<OvhLine>>() {};

	/**
	 * Get building references from a given line number
	 *
	 * REST: POST /connectivity/eligibility/search/buildingsByLine
	 * @param status [required] Status of the line number
	 * @param lineNumber [required] Line number
	 */
	public OvhAsyncTaskArray<OvhBuilding> eligibility_search_buildingsByLine_POST(OvhLineStatusEnum status, String lineNumber) throws IOException {
		String qPath = "/connectivity/eligibility/search/buildingsByLine";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "status", status);
		addBody(o, "lineNumber", lineNumber);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}

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
		return convertTo(resp, t7);
	}
	private static TypeReference<OvhAsyncTaskArray<String>> t7 = new TypeReference<OvhAsyncTaskArray<String>>() {};

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
		return convertTo(resp, t8);
	}
	private static TypeReference<OvhAsyncTaskArray<OvhCity>> t8 = new TypeReference<OvhAsyncTaskArray<OvhCity>>() {};
}
