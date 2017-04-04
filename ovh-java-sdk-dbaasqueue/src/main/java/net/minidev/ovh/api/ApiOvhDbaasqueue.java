package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.dbaas.queue.OvhApp;
import net.minidev.ovh.api.dbaas.queue.OvhAppConfiguration;
import net.minidev.ovh.api.dbaas.queue.OvhKey;
import net.minidev.ovh.api.dbaas.queue.OvhKeyWithSecret;
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
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/dbaas/queue
 * version:1.0
 */
public class ApiOvhDbaasqueue extends ApiOvhBase {
	public ApiOvhDbaasqueue(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your Queue app
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /dbaas/queue/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your Queue app
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * List all topics of the application
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/topic
	 * @param serviceName [required] Application ID
	 */
	public ArrayList<String> serviceName_topic_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/topic";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Create a topic
	 * 
	 * REST: POST /dbaas/queue/{serviceName}/topic
	 * @param serviceName [required] Application ID
	 * @param id [required] Topic ID
	 * @param partitions [required] Number of partitions
	 * @param replicationFactor [required] Replication factor
	 */
	public OvhTopic serviceName_topic_POST(String serviceName, String id, Long partitions, Long replicationFactor) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/topic";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "id", id);
		addBody(o, "partitions", partitions);
		addBody(o, "replicationFactor", replicationFactor);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTopic.class);
	}

	/**
	 * Get a topic
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/topic/{topicId}
	 * @param serviceName [required] Application ID
	 * @param topicId [required] Topic ID
	 */
	public OvhTopic serviceName_topic_topicId_GET(String serviceName, String topicId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/topic/{topicId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{topicId}", topicId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTopic.class);
	}

	/**
	 * Update a topic configuration
	 * 
	 * REST: PUT /dbaas/queue/{serviceName}/topic/{topicId}
	 * @param serviceName [required] Application ID
	 * @param topicId [required] Topic ID
	 * @param partitions [required] Number of partitions
	 */
	public void serviceName_topic_topicId_PUT(String serviceName, String topicId, Long partitions) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/topic/{topicId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{topicId}", topicId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "partitions", partitions);
		exec("PUT", qPath, o);
	}

	/**
	 * Delete a topic
	 * 
	 * REST: DELETE /dbaas/queue/{serviceName}/topic/{topicId}
	 * @param serviceName [required] Application ID
	 * @param topicId [required] Topic ID
	 */
	public void serviceName_topic_topicId_DELETE(String serviceName, String topicId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/topic/{topicId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{topicId}", topicId);
		exec("DELETE", qPath);
	}

	/**
	 * Get an application
	 * 
	 * REST: GET /dbaas/queue/{serviceName}
	 * @param serviceName [required] Application ID
	 */
	public OvhApp serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhApp.class);
	}

	/**
	 * Update an application
	 * 
	 * REST: PUT /dbaas/queue/{serviceName}
	 * @param serviceName [required] Application ID
	 * @param name [required] Application name
	 */
	public OvhApp serviceName_PUT(String serviceName, String name) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhApp.class);
	}

	/**
	 * List all regions ID
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/region
	 * @param serviceName [required] Application ID
	 */
	public ArrayList<String> serviceName_region_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/region";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get one region
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/region/{regionId}
	 * @param serviceName [required] Application ID
	 * @param regionId [required] Region ID
	 */
	public OvhRegion serviceName_region_regionId_GET(String serviceName, String regionId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/region/{regionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{regionId}", regionId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRegion.class);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /dbaas/queue/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your Queue app
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Create a key
	 * 
	 * REST: POST /dbaas/queue/{serviceName}/key
	 * @param serviceName [required] Application ID
	 * @param name [required] Key name
	 */
	public OvhKeyWithSecret serviceName_key_POST(String serviceName, String name) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/key";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhKeyWithSecret.class);
	}

	/**
	 * List all keys of the application
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/key
	 * @param serviceName [required] Application ID
	 */
	public ArrayList<String> serviceName_key_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/key";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get a key
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/key/{keyId}
	 * @param serviceName [required] Application ID
	 * @param keyId [required] Key ID
	 */
	public OvhKey serviceName_key_keyId_GET(String serviceName, String keyId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/key/{keyId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{keyId}", keyId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhKey.class);
	}

	/**
	 * Update a key name
	 * 
	 * REST: PUT /dbaas/queue/{serviceName}/key/{keyId}
	 * @param serviceName [required] Application ID
	 * @param keyId [required] Key ID
	 * @param name [required] Key name
	 */
	public OvhKey serviceName_key_keyId_PUT(String serviceName, String keyId, String name) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/key/{keyId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{keyId}", keyId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhKey.class);
	}

	/**
	 * Delete a key
	 * 
	 * REST: DELETE /dbaas/queue/{serviceName}/key/{keyId}
	 * @param serviceName [required] Application ID
	 * @param keyId [required] Key ID
	 */
	public void serviceName_key_keyId_DELETE(String serviceName, String keyId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/key/{keyId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{keyId}", keyId);
		exec("DELETE", qPath);
	}

	/**
	 * Generate a new key secret
	 * 
	 * REST: POST /dbaas/queue/{serviceName}/key/{keyId}/changeSecret
	 * @param serviceName [required] Application ID
	 * @param keyId [required] Key ID
	 */
	public OvhKeyWithSecret serviceName_key_keyId_changeSecret_POST(String serviceName, String keyId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/key/{keyId}/changeSecret";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{keyId}", keyId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhKeyWithSecret.class);
	}

	/**
	 * Configure an application
	 * 
	 * REST: POST /dbaas/queue/{serviceName}/configure
	 * @param serviceName [required] Application ID
	 * @param name [required] Application name
	 * @param regionId [required] Application region ID
	 */
	public OvhAppConfiguration serviceName_configure_POST(String serviceName, String name, String regionId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/configure";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "regionId", regionId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhAppConfiguration.class);
	}

	/**
	 * Create a user
	 * 
	 * REST: POST /dbaas/queue/{serviceName}/user
	 * @param serviceName [required] Application ID
	 * @param name [required] User name
	 * @param roles [required] User roles
	 */
	public OvhUserWithPassword serviceName_user_POST(String serviceName, String name, String[] roles) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "roles", roles);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhUserWithPassword.class);
	}

	/**
	 * List all users of the application
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/user
	 * @param serviceName [required] Application ID
	 */
	public ArrayList<String> serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get user roles
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/user/{userId}/roles
	 * @param serviceName [required] Application ID
	 * @param userId [required] User ID
	 */
	public ArrayList<String> serviceName_user_userId_roles_GET(String serviceName, String userId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user/{userId}/roles";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add a role to a user
	 * 
	 * REST: POST /dbaas/queue/{serviceName}/user/{userId}/roles
	 * @param serviceName [required] Application ID
	 * @param userId [required] User ID
	 * @param roleName [required] Role name
	 */
	public ArrayList<String> serviceName_user_userId_roles_POST(String serviceName, String userId, String roleName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user/{userId}/roles";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "roleName", roleName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t1);
	}

	/**
	 * Delete a role from a user's ones
	 * 
	 * REST: DELETE /dbaas/queue/{serviceName}/user/{userId}/roles/{role}
	 * @param serviceName [required] Application ID
	 * @param userId [required] User ID
	 * @param role [required] Role name
	 */
	public void serviceName_user_userId_roles_role_DELETE(String serviceName, String userId, String role) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user/{userId}/roles/{role}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId);
		qPath = qPath.replace("{role}", role);
		exec("DELETE", qPath);
	}

	/**
	 * Get a user
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/user/{userId}
	 * @param serviceName [required] Application ID
	 * @param userId [required] User ID
	 */
	public OvhUser serviceName_user_userId_GET(String serviceName, String userId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user/{userId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Delete a user
	 * 
	 * REST: DELETE /dbaas/queue/{serviceName}/user/{userId}
	 * @param serviceName [required] Application ID
	 * @param userId [required] User ID
	 */
	public void serviceName_user_userId_DELETE(String serviceName, String userId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user/{userId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId);
		exec("DELETE", qPath);
	}

	/**
	 * Generate a new user password
	 * 
	 * REST: POST /dbaas/queue/{serviceName}/user/{userId}/changePassword
	 * @param serviceName [required] Application ID
	 * @param userId [required] User ID
	 */
	public OvhUserWithPassword serviceName_user_userId_changePassword_POST(String serviceName, String userId) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/user/{userId}/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhUserWithPassword.class);
	}

	/**
	 * Get metrics account
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/metrics/account
	 * @param serviceName [required] Application ID
	 */
	public OvhMetricsAccount serviceName_metrics_account_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/metrics/account";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhMetricsAccount.class);
	}

	/**
	 * List all roles of the application
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/role
	 * @param serviceName [required] Application ID
	 */
	public ArrayList<String> serviceName_role_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/role";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create a role
	 * 
	 * REST: POST /dbaas/queue/{serviceName}/role
	 * @param serviceName [required] Application ID
	 * @param name [required] Role name
	 * @param readAcl [required] List of topics with read access
	 * @param writeAcl [required] List of topics with write access
	 * @param autoCreateAcl [required] Automatically create non-existing topics on read & write operations
	 */
	public OvhRole serviceName_role_POST(String serviceName, String name, String[] readAcl, String[] writeAcl, Boolean autoCreateAcl) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/role";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "readAcl", readAcl);
		addBody(o, "writeAcl", writeAcl);
		addBody(o, "autoCreateAcl", autoCreateAcl);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhRole.class);
	}

	/**
	 * Get a role
	 * 
	 * REST: GET /dbaas/queue/{serviceName}/role/{roleName}
	 * @param serviceName [required] Application ID
	 * @param roleName [required] Role name
	 */
	public OvhRole serviceName_role_roleName_GET(String serviceName, String roleName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/role/{roleName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleName}", roleName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRole.class);
	}

	/**
	 * Update a role
	 * 
	 * REST: PUT /dbaas/queue/{serviceName}/role/{roleName}
	 * @param serviceName [required] Application ID
	 * @param roleName [required] Role name
	 * @param name [required] New role name
	 * @param readAcl [required] List of topics with read access
	 * @param writeAcl [required] List of topics with write access
	 * @param autoCreateAcl [required] Automatically create non-existing topics on read & write operations
	 */
	public OvhRole serviceName_role_roleName_PUT(String serviceName, String roleName, String name, String[] readAcl, String[] writeAcl, Boolean autoCreateAcl) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/role/{roleName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleName}", roleName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "readAcl", readAcl);
		addBody(o, "writeAcl", writeAcl);
		addBody(o, "autoCreateAcl", autoCreateAcl);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhRole.class);
	}

	/**
	 * Delete a role
	 * 
	 * REST: DELETE /dbaas/queue/{serviceName}/role/{roleName}
	 * @param serviceName [required] Application ID
	 * @param roleName [required] Role name
	 */
	public void serviceName_role_roleName_DELETE(String serviceName, String roleName) throws IOException {
		String qPath = "/dbaas/queue/{serviceName}/role/{roleName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleName}", roleName);
		exec("DELETE", qPath);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /dbaas/queue
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dbaas/queue";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
}
