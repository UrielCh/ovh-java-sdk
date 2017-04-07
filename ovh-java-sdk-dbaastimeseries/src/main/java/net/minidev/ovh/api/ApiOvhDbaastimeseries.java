package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.paas.timeseries.OvhConsumption;
import net.minidev.ovh.api.paas.timeseries.OvhKey;
import net.minidev.ovh.api.paas.timeseries.OvhQuota;
import net.minidev.ovh.api.paas.timeseries.OvhRegion;
import net.minidev.ovh.api.paas.timeseries.OvhTag;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.timeseries.OvhProject;
import net.minidev.ovh.api.tsaas.OvhOpenTSDBToken;
import net.minidev.ovh.api.tsaas.OvhPermissionEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/dbaas/timeseries
 * version:1.0
 */
public class ApiOvhDbaastimeseries extends ApiOvhBase {
	public ApiOvhDbaastimeseries(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get quotas
	 *
	 * REST: GET /dbaas/timeseries/{serviceName}/quota
	 * @param serviceName [required] Service Name
	 */
	public ArrayList<OvhQuota> serviceName_quota_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/quota";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhQuota>> t1 = new TypeReference<ArrayList<OvhQuota>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dbaas/timeseries/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your timeseries project
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dbaas/timeseries/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your timeseries project
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dbaas/timeseries/{serviceName}
	 * @param serviceName [required] The internal name of your timeseries project
	 */
	public OvhProject serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhProject.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dbaas/timeseries/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your timeseries project
	 */
	public void serviceName_PUT(String serviceName, OvhProject body) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get keys for a project
	 *
	 * REST: GET /dbaas/timeseries/{serviceName}/key
	 * @param serviceName [required] Service Name
	 * @deprecated
	 */
	public ArrayList<OvhKey> serviceName_key_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/key";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhKey>> t2 = new TypeReference<ArrayList<OvhKey>>() {};

	/**
	 * Create a key for a project
	 *
	 * REST: POST /dbaas/timeseries/{serviceName}/key
	 * @param serviceName [required] Service Name
	 * @param description [required] Description
	 * @param permissions [required] Permissions for this token
	 * @param tags [required] Descriptive tags
	 * @deprecated
	 */
	public OvhKey serviceName_key_POST(String serviceName, String description, String[] permissions, OvhTag[] tags) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/key";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "permissions", permissions);
		addBody(o, "tags", tags);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhKey.class);
	}

	/**
	 * Get a key
	 *
	 * REST: GET /dbaas/timeseries/{serviceName}/key/{keyId}
	 * @param serviceName [required] Service Name
	 * @param keyId [required] Key id
	 * @deprecated
	 */
	public OvhKey serviceName_key_keyId_GET(String serviceName, String keyId) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/key/{keyId}";
		StringBuilder sb = path(qPath, serviceName, keyId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhKey.class);
	}

	/**
	 * Create a key
	 *
	 * REST: PUT /dbaas/timeseries/{serviceName}/key/{keyId}
	 * @param serviceName [required] Service Name
	 * @param keyId [required] Key id
	 * @param description [required] Description
	 * @param permissions [required] Permissions associated to this key
	 * @param tags [required] Descriptive tags
	 * @deprecated
	 */
	public OvhKey serviceName_key_keyId_PUT(String serviceName, String keyId, String description, OvhPermissionEnum[] permissions, OvhTag[] tags) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/key/{keyId}";
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
	 * REST: DELETE /dbaas/timeseries/{serviceName}/key/{keyId}
	 * @param serviceName [required] Service Name
	 * @param keyId [required] Key id
	 * @deprecated
	 */
	public Boolean serviceName_key_keyId_DELETE(String serviceName, String keyId) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/key/{keyId}";
		StringBuilder sb = path(qPath, serviceName, keyId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /dbaas/timeseries/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your timeseries project
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Setup a project
	 *
	 * REST: POST /dbaas/timeseries/{serviceName}/setup
	 * @param serviceName [required] Service Name
	 * @param displayName [required] Project name
	 * @param description [required] Project description
	 * @param regionId [required] Region to use
	 * @param raTokenId [required] Your runabove app token id
	 * @param raTokenKey [required] Your runabove app token key
	 */
	public net.minidev.ovh.api.paas.timeseries.OvhProject serviceName_setup_POST(String serviceName, String displayName, String description, String regionId, String raTokenId, String raTokenKey) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/setup";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "displayName", displayName);
		addBody(o, "description", description);
		addBody(o, "regionId", regionId);
		addBody(o, "raTokenId", raTokenId);
		addBody(o, "raTokenKey", raTokenKey);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.paas.timeseries.OvhProject.class);
	}

	/**
	 * Get consumption
	 *
	 * REST: GET /dbaas/timeseries/{serviceName}/consumption
	 * @param serviceName [required] Service Name
	 */
	public ArrayList<OvhConsumption> serviceName_consumption_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/consumption";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhConsumption>> t4 = new TypeReference<ArrayList<OvhConsumption>>() {};

	/**
	 * Get OpenTSDB tokens
	 *
	 * REST: GET /dbaas/timeseries/{serviceName}/token/opentsdb
	 * @param serviceName [required] Service Name
	 *
	 * API beta
	 */
	public ArrayList<OvhOpenTSDBToken> serviceName_token_opentsdb_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/token/opentsdb";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhOpenTSDBToken>> t5 = new TypeReference<ArrayList<OvhOpenTSDBToken>>() {};

	/**
	 * Create a OpenTSDB token
	 *
	 * REST: POST /dbaas/timeseries/{serviceName}/token/opentsdb
	 * @param serviceName [required] Service Name
	 * @param description [required]
	 * @param permission [required]
	 * @param tags [required]
	 *
	 * API beta
	 */
	public OvhOpenTSDBToken serviceName_token_opentsdb_POST(String serviceName, String description, String permission, OvhTag[] tags) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/token/opentsdb";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "permission", permission);
		addBody(o, "tags", tags);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOpenTSDBToken.class);
	}

	/**
	 * Get a OpenTSDB token
	 *
	 * REST: GET /dbaas/timeseries/{serviceName}/token/opentsdb/{tokenId}
	 * @param serviceName [required] Service Name
	 * @param tokenId [required] token id
	 *
	 * API beta
	 */
	public OvhOpenTSDBToken serviceName_token_opentsdb_tokenId_GET(String serviceName, String tokenId) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/token/opentsdb/{tokenId}";
		StringBuilder sb = path(qPath, serviceName, tokenId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOpenTSDBToken.class);
	}

	/**
	 * Delete an OpenTSDB token
	 *
	 * REST: DELETE /dbaas/timeseries/{serviceName}/token/opentsdb/{tokenId}
	 * @param serviceName [required] Service Name
	 * @param tokenId [required] token id
	 *
	 * API beta
	 */
	public Boolean serviceName_token_opentsdb_tokenId_DELETE(String serviceName, String tokenId) throws IOException {
		String qPath = "/dbaas/timeseries/{serviceName}/token/opentsdb/{tokenId}";
		StringBuilder sb = path(qPath, serviceName, tokenId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dbaas/timeseries
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dbaas/timeseries";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<String>> t6 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get available regions
	 *
	 * REST: GET /dbaas/timeseries/region
	 */
	public ArrayList<OvhRegion> region_GET() throws IOException {
		String qPath = "/dbaas/timeseries/region";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhRegion>> t7 = new TypeReference<ArrayList<OvhRegion>>() {};
}
