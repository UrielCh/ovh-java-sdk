package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.dbaas.queue.OvhApp;
import net.minidev.ovh.api.dbaas.queue.OvhKey;
import net.minidev.ovh.api.dbaas.queue.OvhMetricsAccount;
import net.minidev.ovh.api.dbaas.queue.OvhRegion;
import net.minidev.ovh.api.dbaas.queue.OvhRole;
import net.minidev.ovh.api.dbaas.queue.OvhTopic;
import net.minidev.ovh.api.dbaas.queue.OvhUser;
import net.minidev.ovh.api.dbaas.queue.OvhUserWithPassword;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/dbaas/queue
 * version:1.0
 */
public class ApiOvhDbaasqueue extends ApiOvhBase {
	public ApiOvhDbaasqueue(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dbaas/queue
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dbaas/queue";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get user roles
	 *
	 * REST: GET /dbaas/queue/{serviceName}/user/{userId}/roles
	 * @param serviceName [required] Application ID
	 * @param userId [required] User ID
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_user_userId_roles_GET(String serviceName, String userId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user/{userId}/roles";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get a user
	 *
	 * REST: GET /dbaas/queue/{serviceName}/user/{userId}
	 * @param serviceName [required] Application ID
	 * @param userId [required] User ID
	 *
	 * API beta
	 */
	public OvhUser serviceName_user_userId_GET(String serviceName, String userId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user/{userId}";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Generate a new user password
	 *
	 * REST: POST /dbaas/queue/{serviceName}/user/{userId}/changePassword
	 * @param serviceName [required] Application ID
	 * @param userId [required] User ID
	 *
	 * API beta
	 */
	public OvhUserWithPassword serviceName_user_userId_changePassword_POST(String serviceName, String userId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user/{userId}/changePassword";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhUserWithPassword.class);
	}

	/**
	 * List all users of the application
	 *
	 * REST: GET /dbaas/queue/{serviceName}/user
	 * @param serviceName [required] Application ID
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get an application
	 *
	 * REST: GET /dbaas/queue/{serviceName}
	 * @param serviceName [required] Application ID
	 *
	 * API beta
	 */
	public OvhApp serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhApp.class);
	}

	/**
	 * Update an application
	 *
	 * REST: PUT /dbaas/queue/{serviceName}
	 * @param serviceName [required] Application ID
	 * @param name [required] Application name
	 *
	 * API beta
	 */
	public OvhApp serviceName_PUT(String serviceName, String name) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhApp.class);
	}

	/**
	 * Get one region
	 *
	 * REST: GET /dbaas/queue/{serviceName}/region/{regionId}
	 * @param serviceName [required] Application ID
	 * @param regionId [required] Region ID
	 *
	 * API beta
	 */
	public OvhRegion serviceName_region_regionId_GET(String serviceName, String regionId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/region/{regionId}";
		StringBuilder sb = path(qPath, serviceName, regionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRegion.class);
	}

	/**
	 * List all regions ID
	 *
	 * REST: GET /dbaas/queue/{serviceName}/region
	 * @param serviceName [required] Application ID
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_region_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/region";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dbaas/queue/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your Queue app
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dbaas/queue/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your Queue app
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * List all topics of the application
	 *
	 * REST: GET /dbaas/queue/{serviceName}/topic
	 * @param serviceName [required] Application ID
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_topic_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/topic";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get a topic
	 *
	 * REST: GET /dbaas/queue/{serviceName}/topic/{topicId}
	 * @param serviceName [required] Application ID
	 * @param topicId [required] Topic ID
	 *
	 * API beta
	 */
	public OvhTopic serviceName_topic_topicId_GET(String serviceName, String topicId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/topic/{topicId}";
		StringBuilder sb = path(qPath, serviceName, topicId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTopic.class);
	}

	/**
	 * Delete a topic
	 *
	 * REST: DELETE /dbaas/queue/{serviceName}/topic/{topicId}
	 * @param serviceName [required] Application ID
	 * @param topicId [required] Topic ID
	 *
	 * API beta
	 */
	public void serviceName_topic_topicId_DELETE(String serviceName, String topicId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/topic/{topicId}";
		StringBuilder sb = path(qPath, serviceName, topicId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get metrics account
	 *
	 * REST: GET /dbaas/queue/{serviceName}/metrics/account
	 * @param serviceName [required] Application ID
	 *
	 * API beta
	 */
	public OvhMetricsAccount serviceName_metrics_account_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/metrics/account";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMetricsAccount.class);
	}

	/**
	 * List all keys of the application
	 *
	 * REST: GET /dbaas/queue/{serviceName}/key
	 * @param serviceName [required] Application ID
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_key_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/key";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get a key
	 *
	 * REST: GET /dbaas/queue/{serviceName}/key/{keyId}
	 * @param serviceName [required] Application ID
	 * @param keyId [required] Key ID
	 *
	 * API beta
	 */
	public OvhKey serviceName_key_keyId_GET(String serviceName, String keyId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/key/{keyId}";
		StringBuilder sb = path(qPath, serviceName, keyId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhKey.class);
	}

	/**
	 * Get a role
	 *
	 * REST: GET /dbaas/queue/{serviceName}/role/{roleName}
	 * @param serviceName [required] Application ID
	 * @param roleName [required] Role name
	 *
	 * API beta
	 */
	public OvhRole serviceName_role_roleName_GET(String serviceName, String roleName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/role/{roleName}";
		StringBuilder sb = path(qPath, serviceName, roleName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRole.class);
	}

	/**
	 * List all roles of the application
	 *
	 * REST: GET /dbaas/queue/{serviceName}/role
	 * @param serviceName [required] Application ID
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_role_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/role";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
