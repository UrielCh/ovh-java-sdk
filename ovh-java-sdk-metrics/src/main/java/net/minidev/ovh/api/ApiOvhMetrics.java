package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.metrics.api.OvhConsumption;
import net.minidev.ovh.api.metrics.api.OvhLabel;
import net.minidev.ovh.api.metrics.api.OvhPermissionEnum;
import net.minidev.ovh.api.metrics.api.OvhService;
import net.minidev.ovh.api.metrics.api.OvhToken;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/metrics
 * version:1.0
 */
public class ApiOvhMetrics extends ApiOvhBase {
	public ApiOvhMetrics(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /metrics
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/metrics";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Find TokenID for a specific token
	 *
	 * REST: POST /metrics/{serviceName}/lookup/token
	 * @param serviceName [required] Name of your service
	 * @param accessToken [required] access token
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_lookup_token_POST(String serviceName, String accessToken) throws IOException {
		String qPath = "/metrics/{serviceName}/lookup/token";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accessToken", accessToken);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}

	/**
	 * Set overquota
	 *
	 * REST: PUT /metrics/{serviceName}/quota
	 * @param serviceName [required] Name of your service
	 * @param quota [required] New value for overquota
	 *
	 * API beta
	 */
	public String serviceName_quota_PUT(String serviceName, Long quota) throws IOException {
		String qPath = "/metrics/{serviceName}/quota";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quota", quota);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /metrics/{serviceName}/terminate
	 * @param serviceName [required] The internal ID of your metrics
	 *
	 * API beta
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/metrics/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /metrics/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your metrics
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/metrics/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get consumption for your service
	 *
	 * REST: GET /metrics/{serviceName}/consumption
	 * @param serviceName [required] Name of your service
	 * @param duration [required] Last 'm' minutes. Default is 60min
	 *
	 * API beta
	 */
	public OvhConsumption serviceName_consumption_GET(String serviceName, Long duration) throws IOException {
		String qPath = "/metrics/{serviceName}/consumption";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "duration", duration);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhConsumption.class);
	}

	/**
	 * Get service
	 *
	 * REST: GET /metrics/{serviceName}
	 * @param serviceName [required] Name of your service
	 *
	 * API beta
	 */
	public OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/metrics/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Modify service
	 *
	 * REST: PUT /metrics/{serviceName}
	 * @param description [required] New description for your service
	 * @param serviceName [required] Name of your service
	 *
	 * API beta
	 */
	public OvhService serviceName_PUT(String serviceName, String description) throws IOException {
		String qPath = "/metrics/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Revoke a token
	 *
	 * REST: DELETE /metrics/{serviceName}/token/{tokenId}
	 * @param serviceName [required] Name of your service
	 * @param tokenId [required] ID of the desired token
	 *
	 * API beta
	 */
	public void serviceName_token_tokenId_DELETE(String serviceName, String tokenId) throws IOException {
		String qPath = "/metrics/{serviceName}/token/{tokenId}";
		StringBuilder sb = path(qPath, serviceName, tokenId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get a specific token
	 *
	 * REST: GET /metrics/{serviceName}/token/{tokenId}
	 * @param serviceName [required] Name of your service
	 * @param tokenId [required] ID of the desired token
	 *
	 * API beta
	 */
	public OvhToken serviceName_token_tokenId_GET(String serviceName, String tokenId) throws IOException {
		String qPath = "/metrics/{serviceName}/token/{tokenId}";
		StringBuilder sb = path(qPath, serviceName, tokenId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhToken.class);
	}

	/**
	 * Modify a token
	 *
	 * REST: PUT /metrics/{serviceName}/token/{tokenId}
	 * @param description [required] New description for your token
	 * @param serviceName [required] Name of your service
	 * @param tokenId [required] ID of the desired token
	 *
	 * API beta
	 */
	public OvhToken serviceName_token_tokenId_PUT(String serviceName, String tokenId, String description) throws IOException {
		String qPath = "/metrics/{serviceName}/token/{tokenId}";
		StringBuilder sb = path(qPath, serviceName, tokenId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhToken.class);
	}

	/**
	 * Get list of tokens
	 *
	 * REST: GET /metrics/{serviceName}/token
	 * @param serviceName [required] Name of your service
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_token_GET(String serviceName) throws IOException {
		String qPath = "/metrics/{serviceName}/token";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a token
	 *
	 * REST: POST /metrics/{serviceName}/token
	 * @param description [required] Description for the new token
	 * @param labels [required] Labels for the new token
	 * @param serviceName [required] Name of your service
	 * @param permission [required] Type of the new token. Read or Write
	 *
	 * API beta
	 */
	public OvhToken serviceName_token_POST(String serviceName, String description, OvhLabel[] labels, OvhPermissionEnum permission) throws IOException {
		String qPath = "/metrics/{serviceName}/token";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "labels", labels);
		addBody(o, "permission", permission);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhToken.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /metrics/{serviceName}/confirmTermination
	 * @param futureUse What next after your termination request
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal ID of your metrics
	 *
	 * API beta
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/metrics/{serviceName}/confirmTermination";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "futureUse", futureUse);
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /metrics/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your metrics
	 *
	 * API beta
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/metrics/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /metrics/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your metrics
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, net.minidev.ovh.api.services.OvhService body) throws IOException {
		String qPath = "/metrics/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}
}
