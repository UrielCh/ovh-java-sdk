package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.paas.timeseries.OvhConsumption;
import net.minidev.ovh.api.paas.timeseries.OvhKey;
import net.minidev.ovh.api.paas.timeseries.OvhProject;
import net.minidev.ovh.api.paas.timeseries.OvhQuota;
import net.minidev.ovh.api.paas.timeseries.OvhRegion;
import net.minidev.ovh.api.paas.timeseries.OvhTag;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.tsaas.OvhPermissionEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/paas/timeseries
 * version:1.0
 */
public class ApiOvhPaastimeseries extends ApiOvhBase {
	public ApiOvhPaastimeseries(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get a key
	 *
	 * REST: GET /paas/timeseries/{serviceName}/key/{keyId}
	 * @param serviceName [required] Service Name
	 * @param keyId [required] Key id
	 * @deprecated
	 */
	public OvhKey serviceName_key_keyId_GET(String serviceName, String keyId) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/key/{keyId}";
		StringBuilder sb = path(qPath, serviceName, keyId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhKey.class);
	}

	/**
	 * Create a key
	 *
	 * REST: PUT /paas/timeseries/{serviceName}/key/{keyId}
	 * @param serviceName [required] Service Name
	 * @param keyId [required] Key id
	 * @param description [required] Description
	 * @param permissions [required] Permissions associated to this key
	 * @param tags [required] Descriptive tags
	 * @deprecated
	 */
	public OvhKey serviceName_key_keyId_PUT(String serviceName, String keyId, String description, OvhPermissionEnum[] permissions, OvhTag[] tags) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/key/{keyId}";
		StringBuilder sb = path(qPath, serviceName, keyId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "permissions", permissions);
		addBody(o, "tags", tags);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhKey.class);
	}

	/**
	 * Delete a OpenTSDB token
	 *
	 * REST: DELETE /paas/timeseries/{serviceName}/key/{keyId}
	 * @param serviceName [required] Service Name
	 * @param keyId [required] Key id
	 * @deprecated
	 */
	public Boolean serviceName_key_keyId_DELETE(String serviceName, String keyId) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/key/{keyId}";
		StringBuilder sb = path(qPath, serviceName, keyId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Get keys for a project
	 *
	 * REST: GET /paas/timeseries/{serviceName}/key
	 * @param serviceName [required] Service Name
	 * @deprecated
	 */
	public ArrayList<OvhKey> serviceName_key_GET(String serviceName) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/key";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhKey>> t1 = new TypeReference<ArrayList<OvhKey>>() {};

	/**
	 * Create a key for a project
	 *
	 * REST: POST /paas/timeseries/{serviceName}/key
	 * @param serviceName [required] Service Name
	 * @param description [required] Description
	 * @param permissions [required] Permissions for this token
	 * @param tags [required] Descriptive tags
	 * @deprecated
	 */
	public OvhKey serviceName_key_POST(String serviceName, String description, String[] permissions, OvhTag[] tags) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/key";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "permissions", permissions);
		addBody(o, "tags", tags);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhKey.class);
	}

	/**
	 * Setup a project
	 *
	 * REST: POST /paas/timeseries/{serviceName}/setup
	 * @param serviceName [required] Service Name
	 * @param displayName [required] Project name
	 * @param description [required] Project description
	 * @param regionId [required] Region to use
	 * @param raTokenId [required] Your runabove app token id
	 * @param raTokenKey [required] Your runabove app token key
	 * @deprecated
	 */
	public OvhProject serviceName_setup_POST(String serviceName, String description, String displayName, String raTokenId, String raTokenKey, String regionId) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/setup";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "displayName", displayName);
		addBody(o, "raTokenId", raTokenId);
		addBody(o, "raTokenKey", raTokenKey);
		addBody(o, "regionId", regionId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhProject.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/timeseries/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your timeseries project
	 * @deprecated
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /paas/timeseries/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your timeseries project
	 * @deprecated
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /paas/timeseries/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your timeseries project
	 * @deprecated
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get consumption
	 *
	 * REST: GET /paas/timeseries/{serviceName}/consumption
	 * @param serviceName [required] Service Name
	 * @deprecated
	 */
	public ArrayList<OvhConsumption> serviceName_consumption_GET(String serviceName) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/consumption";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhConsumption>> t3 = new TypeReference<ArrayList<OvhConsumption>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/timeseries/{serviceName}
	 * @param serviceName [required] The internal name of your timeseries project
	 * @deprecated
	 */
	public net.minidev.ovh.api.timeseries.OvhProject serviceName_GET(String serviceName) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.timeseries.OvhProject.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /paas/timeseries/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your timeseries project
	 * @deprecated
	 */
	public void serviceName_PUT(String serviceName, net.minidev.ovh.api.timeseries.OvhProject body) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get quotas
	 *
	 * REST: GET /paas/timeseries/{serviceName}/quota
	 * @param serviceName [required] Service Name
	 * @deprecated
	 */
	public ArrayList<OvhQuota> serviceName_quota_GET(String serviceName) throws IOException {
		String qPath = "/paas/timeseries/{serviceName}/quota";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhQuota>> t4 = new TypeReference<ArrayList<OvhQuota>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /paas/timeseries
	 * @deprecated
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/paas/timeseries";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<String>> t5 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get available regions
	 *
	 * REST: GET /paas/timeseries/region
	 * @deprecated
	 */
	public ArrayList<OvhRegion> region_GET() throws IOException {
		String qPath = "/paas/timeseries/region";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhRegion>> t6 = new TypeReference<ArrayList<OvhRegion>>() {};
}
