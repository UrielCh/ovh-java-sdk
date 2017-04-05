package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.dedicated.ceph.OvhPermissions;
import net.minidev.ovh.api.dedicated.ceph.OvhResponse;
import net.minidev.ovh.api.dedicated.ceph.clusterupdate.OvhCrushTunablesEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/dedicated/ceph
 * version:1.0
 */
public class ApiOvhDedicatedceph extends ApiOvhBase {
	public ApiOvhDedicatedceph(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your ceph cluster
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/ceph/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your ceph cluster
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get cluster details
	 *
	 * REST: GET /dedicated/ceph/{serviceName}
	 * @param serviceName [required] ID of cluster
	 */
	public OvhResponse serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * Update cluster details
	 *
	 * REST: PUT /dedicated/ceph/{serviceName}
	 * @param serviceName [required] ID of cluster
	 * @param crushTunables [required] Tunables of cluster
	 * @param label [required] Name of the cluster
	 */
	public String serviceName_PUT(String serviceName, OvhCrushTunablesEnum crushTunables, String label) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "crushTunables", crushTunables);
		addBody(o, "label", label);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Delete single IP ACL
	 *
	 * REST: DELETE /dedicated/ceph/{serviceName}/acl/{aclId}
	 * @param serviceName [required] ID of cluster
	 * @param aclId [required] ID of ACL
	 */
	public String serviceName_acl_aclId_DELETE(String serviceName, String aclId) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/acl/{aclId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{aclId}", aclId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get details about IP ACL
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/acl/{aclId}
	 * @param serviceName [required] ID of cluster
	 * @param aclId [required] ID of ACL
	 */
	public OvhResponse serviceName_acl_aclId_GET(String serviceName, String aclId) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/acl/{aclId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{aclId}", aclId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * Create one or more new IP ACLs
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/acl
	 * @param serviceName [required] ID of cluster
	 * @param aclList [required] List of new ACLs
	 */
	public String serviceName_acl_POST(String serviceName, String[] aclList) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/acl";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "aclList", aclList);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get list of all IP ACLs in a cluster
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/acl
	 * @param serviceName [required] ID of cluster
	 */
	public ArrayList<OvhResponse> serviceName_acl_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/acl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhResponse>> t1 = new TypeReference<ArrayList<OvhResponse>>() {};

	/**
	 * List tasks in progress
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/task
	 * @param serviceName [required] ID of cluster
	 */
	public ArrayList<OvhResponse> serviceName_task_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get task details
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/task/{taskId}
	 * @param serviceName [required] ID of cluster
	 * @param taskId [required] ID of task
	 */
	public ArrayList<OvhResponse> serviceName_task_taskId_GET(String serviceName, String taskId) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/task/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get cluster health
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/health
	 * @param serviceName [required] ID of cluster
	 */
	public OvhResponse serviceName_health_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/health";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your ceph cluster
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/changeContact";
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
	 * Create a new ceph pool
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/pool
	 * @param serviceName [required] ID of cluster
	 * @param poolName [required] Name of new pool
	 */
	public String serviceName_pool_POST(String serviceName, String poolName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/pool";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "poolName", poolName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get list of all pools in a cluster
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/pool
	 * @param serviceName [required] ID of cluster
	 */
	public ArrayList<OvhResponse> serviceName_pool_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/pool";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Delete a single ceph pool
	 *
	 * REST: DELETE /dedicated/ceph/{serviceName}/pool/{poolName}
	 * @param serviceName [required] ID of cluster
	 * @param poolName [required] name of ceph pool
	 */
	public String serviceName_pool_poolName_DELETE(String serviceName, String poolName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/pool/{poolName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{poolName}", poolName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get details about an existing ceph pool
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/pool/{poolName}
	 * @param serviceName [required] ID of cluster
	 * @param poolName [required] name of pool
	 */
	public OvhResponse serviceName_pool_poolName_GET(String serviceName, String poolName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/pool/{poolName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{poolName}", poolName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * Create a new ceph user
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/user
	 * @param serviceName [required] ID of cluster
	 * @param userName [required] Name of new user
	 */
	public String serviceName_user_POST(String serviceName, String userName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "userName", userName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get list of all users in a cluster
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/user
	 * @param serviceName [required] ID of cluster
	 */
	public ArrayList<OvhResponse> serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Delete an existing single ceph user
	 *
	 * REST: DELETE /dedicated/ceph/{serviceName}/user/{userName}
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 */
	public String serviceName_user_userName_DELETE(String serviceName, String userName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get details about a ceph user
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/user/{userName}
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 */
	public OvhResponse serviceName_user_userName_GET(String serviceName, String userName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * List user-pool permissions
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/user/{userName}/pool
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 */
	public ArrayList<OvhResponse> serviceName_user_userName_pool_GET(String serviceName, String userName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}/pool";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Update user-pool permission for single pool
	 *
	 * REST: PUT /dedicated/ceph/{serviceName}/user/{userName}/pool
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 * @param write [required] Write permission
	 * @param execute [required] Execute permission
	 * @param classWrite [required] Class write permission
	 * @param read [required] Read permission
	 * @param poolName [required] Name of Ceph pool
	 * @param classRead [required] Class read permission
	 */
	public String serviceName_user_userName_pool_PUT(String serviceName, String userName, Boolean write, Boolean execute, Boolean classWrite, Boolean read, String poolName, Boolean classRead) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}/pool";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "write", write);
		addBody(o, "execute", execute);
		addBody(o, "classWrite", classWrite);
		addBody(o, "read", read);
		addBody(o, "poolName", poolName);
		addBody(o, "classRead", classRead);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Create new user-pool permissions. All old permissions will be cleared
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/user/{userName}/pool
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 * @param permissions [required]
	 */
	public String serviceName_user_userName_pool_POST(String serviceName, String userName, OvhPermissions[] permissions) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}/pool";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "permissions", permissions);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Clear user-pool permission for single pool
	 *
	 * REST: DELETE /dedicated/ceph/{serviceName}/user/{userName}/pool/{poolName}
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 * @param poolName [required] Name of Ceph pool
	 */
	public String serviceName_user_userName_pool_poolName_DELETE(String serviceName, String userName, String poolName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}/pool/{poolName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		qPath = qPath.replace("{poolName}", poolName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dedicated/ceph
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dedicated/ceph";
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};
}
