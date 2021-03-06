package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.dedicated.ceph.OvhPermissions;
import net.minidev.ovh.api.dedicated.ceph.OvhResponse;
import net.minidev.ovh.api.dedicated.ceph.clusterupdate.OvhCrushTunablesEnum;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/dedicated/ceph
 * version:1.0
 */
public class ApiOvhDedicatedceph extends ApiOvhBase {
	public ApiOvhDedicatedceph(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dedicated/ceph
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dedicated/ceph";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Terminate your service
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/terminate
	 * @param serviceName [required] The internal ID of your ceph cluster
	 *
	 * API beta
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get cluster health
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/health
	 * @param serviceName [required] ID of cluster
	 *
	 * API beta
	 */
	public OvhResponse serviceName_health_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/health";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * Delete a single ceph pool
	 *
	 * REST: DELETE /dedicated/ceph/{serviceName}/pool/{poolName}
	 * @param serviceName [required] ID of cluster
	 * @param poolName [required] name of ceph pool
	 *
	 * API beta
	 */
	public String serviceName_pool_poolName_DELETE(String serviceName, String poolName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/pool/{poolName}";
		StringBuilder sb = path(qPath, serviceName, poolName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get details about an existing ceph pool
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/pool/{poolName}
	 * @param serviceName [required] ID of cluster
	 * @param poolName [required] name of pool
	 *
	 * API beta
	 */
	public OvhResponse serviceName_pool_poolName_GET(String serviceName, String poolName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/pool/{poolName}";
		StringBuilder sb = path(qPath, serviceName, poolName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * Create a new ceph pool
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/pool
	 * @param serviceName [required] ID of cluster
	 * @param poolName [required] Name of new pool
	 *
	 * API beta
	 */
	public String serviceName_pool_POST(String serviceName, String poolName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/pool";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "poolName", poolName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get list of all pools in a cluster
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/pool
	 * @param serviceName [required] ID of cluster
	 *
	 * API beta
	 */
	public ArrayList<OvhResponse> serviceName_pool_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/pool";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhResponse>> t2 = new TypeReference<ArrayList<OvhResponse>>() {};

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal ID of your ceph cluster
	 *
	 * API beta
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/confirmTermination";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "commentary", commentary);
		addBody(o, "futureUse", futureUse);
		addBody(o, "reason", reason);
		addBody(o, "token", token);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get cluster details
	 *
	 * REST: GET /dedicated/ceph/{serviceName}
	 * @param serviceName [required] ID of cluster
	 *
	 * API beta
	 */
	public OvhResponse serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * Update cluster details
	 *
	 * REST: PUT /dedicated/ceph/{serviceName}
	 * @param serviceName [required] ID of cluster
	 * @param crushTunables [required] Tunables of cluster
	 * @param label [required] Name of the cluster
	 *
	 * API beta
	 */
	public String serviceName_PUT(String serviceName, OvhCrushTunablesEnum crushTunables, String label) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "crushTunables", crushTunables);
		addBody(o, "label", label);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your ceph cluster
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/ceph/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your ceph cluster
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Create a new ceph user
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/user
	 * @param serviceName [required] ID of cluster
	 * @param userName [required] Name of new user
	 *
	 * API beta
	 */
	public String serviceName_user_POST(String serviceName, String userName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "userName", userName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get list of all users in a cluster
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/user
	 * @param serviceName [required] ID of cluster
	 *
	 * API beta
	 */
	public ArrayList<OvhResponse> serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Delete an existing single ceph user
	 *
	 * REST: DELETE /dedicated/ceph/{serviceName}/user/{userName}
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 *
	 * API beta
	 */
	public String serviceName_user_userName_DELETE(String serviceName, String userName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}";
		StringBuilder sb = path(qPath, serviceName, userName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get details about a ceph user
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/user/{userName}
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 *
	 * API beta
	 */
	public OvhResponse serviceName_user_userName_GET(String serviceName, String userName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}";
		StringBuilder sb = path(qPath, serviceName, userName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * Clear user-pool permission for single pool
	 *
	 * REST: DELETE /dedicated/ceph/{serviceName}/user/{userName}/pool/{poolName}
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 * @param poolName [required] Name of Ceph pool
	 *
	 * API beta
	 */
	public String serviceName_user_userName_pool_poolName_DELETE(String serviceName, String userName, String poolName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}/pool/{poolName}";
		StringBuilder sb = path(qPath, serviceName, userName, poolName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List user-pool permissions
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/user/{userName}/pool
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 *
	 * API beta
	 */
	public ArrayList<OvhResponse> serviceName_user_userName_pool_GET(String serviceName, String userName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}/pool";
		StringBuilder sb = path(qPath, serviceName, userName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
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
	 *
	 * API beta
	 */
	public String serviceName_user_userName_pool_PUT(String serviceName, String userName, Boolean classRead, Boolean classWrite, Boolean execute, String poolName, Boolean read, Boolean write) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}/pool";
		StringBuilder sb = path(qPath, serviceName, userName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "classRead", classRead);
		addBody(o, "classWrite", classWrite);
		addBody(o, "execute", execute);
		addBody(o, "poolName", poolName);
		addBody(o, "read", read);
		addBody(o, "write", write);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Create new user-pool permissions. All old permissions will be cleared
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/user/{userName}/pool
	 * @param userName [required] Name of ceph user
	 * @param serviceName [required] ID of cluster
	 * @param permissions [required] Permissions
	 *
	 * API beta
	 */
	public String serviceName_user_userName_pool_POST(String serviceName, String userName, OvhPermissions[] permissions) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/user/{userName}/pool";
		StringBuilder sb = path(qPath, serviceName, userName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "permissions", permissions);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/changeContact
	 * @param contactAdmin [required] The contact to set as admin contact
	 * @param contactTech [required] The contact to set as tech contact
	 * @param contactBilling [required] The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your ceph cluster
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get task details
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/task/{taskId}
	 * @param serviceName [required] ID of cluster
	 * @param taskId [required] ID of task
	 *
	 * API beta
	 */
	public ArrayList<OvhResponse> serviceName_task_taskId_GET(String serviceName, String taskId) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * List tasks in progress
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/task
	 * @param serviceName [required] ID of cluster
	 *
	 * API beta
	 */
	public ArrayList<OvhResponse> serviceName_task_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Delete single IP ACL
	 *
	 * REST: DELETE /dedicated/ceph/{serviceName}/acl/{aclId}
	 * @param serviceName [required] ID of cluster
	 * @param aclId [required] ID of ACL
	 *
	 * API beta
	 */
	public String serviceName_acl_aclId_DELETE(String serviceName, String aclId) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/acl/{aclId}";
		StringBuilder sb = path(qPath, serviceName, aclId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get details about IP ACL
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/acl/{aclId}
	 * @param serviceName [required] ID of cluster
	 * @param aclId [required] ID of ACL
	 *
	 * API beta
	 */
	public OvhResponse serviceName_acl_aclId_GET(String serviceName, String aclId) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/acl/{aclId}";
		StringBuilder sb = path(qPath, serviceName, aclId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResponse.class);
	}

	/**
	 * Create one or more new IP ACLs
	 *
	 * REST: POST /dedicated/ceph/{serviceName}/acl
	 * @param serviceName [required] ID of cluster
	 * @param aclList [required] List of new ACLs
	 *
	 * API beta
	 */
	public String serviceName_acl_POST(String serviceName, String[] aclList) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/acl";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "aclList", aclList);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get list of all IP ACLs in a cluster
	 *
	 * REST: GET /dedicated/ceph/{serviceName}/acl
	 * @param serviceName [required] ID of cluster
	 *
	 * API beta
	 */
	public ArrayList<OvhResponse> serviceName_acl_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/ceph/{serviceName}/acl";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
}
