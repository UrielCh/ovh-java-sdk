package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.cluster.hadoop.OvhClusterConsumption;
import net.minidev.ovh.api.cluster.hadoop.OvhClusterServiceNameEnum;
import net.minidev.ovh.api.cluster.hadoop.OvhHadoop;
import net.minidev.ovh.api.cluster.hadoop.OvhNetworkAcl;
import net.minidev.ovh.api.cluster.hadoop.OvhNode;
import net.minidev.ovh.api.cluster.hadoop.OvhNodeBillingProfile;
import net.minidev.ovh.api.cluster.hadoop.OvhNodeConsumption;
import net.minidev.ovh.api.cluster.hadoop.OvhNodeProfileEnum;
import net.minidev.ovh.api.cluster.hadoop.OvhOperationStateEnum;
import net.minidev.ovh.api.cluster.hadoop.OvhOrderInformations;
import net.minidev.ovh.api.cluster.hadoop.OvhRole;
import net.minidev.ovh.api.cluster.hadoop.OvhRoleTypeEnum;
import net.minidev.ovh.api.cluster.hadoop.OvhTask;
import net.minidev.ovh.api.cluster.hadoop.OvhUser;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/cluster/hadoop
 * version:1.0
 */
public class ApiOvhClusterhadoop extends ApiOvhBase {
	public ApiOvhClusterhadoop(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/networkAcl/{block}
	 * @param serviceName [required] The internal name of your cluster
	 * @param block [required] IP Block to allow
	 */
	public OvhNetworkAcl serviceName_networkAcl_block_GET(String serviceName, String block) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/networkAcl/{block}";
		StringBuilder sb = path(qPath, serviceName, block);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNetworkAcl.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cluster/hadoop/{serviceName}/networkAcl/{block}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your cluster
	 * @param block [required] IP Block to allow
	 */
	public void serviceName_networkAcl_block_PUT(String serviceName, String block, OvhNetworkAcl body) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/networkAcl/{block}";
		StringBuilder sb = path(qPath, serviceName, block);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove this ACL
	 *
	 * REST: DELETE /cluster/hadoop/{serviceName}/networkAcl/{block}
	 * @param serviceName [required] The internal name of your cluster
	 * @param block [required] IP Block to allow
	 */
	public OvhTask serviceName_networkAcl_block_DELETE(String serviceName, String block) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/networkAcl/{block}";
		StringBuilder sb = path(qPath, serviceName, block);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Network ACL associated with this Hadoop Cluster
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/networkAcl
	 * @param serviceName [required] The internal name of your cluster
	 */
	public ArrayList<String> serviceName_networkAcl_GET(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/networkAcl";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Add an ACL to your cluster
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/networkAcl
	 * @param block [required] IP block to allow
	 * @param description [required] Free description
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_networkAcl_POST(String serviceName, String block, String description) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/networkAcl";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "block", block);
		addBody(o, "description", description);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the current consumptions that you will billed for on the next bill
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/consumptions
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhClusterConsumption serviceName_consumptions_GET(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/consumptions";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhClusterConsumption.class);
	}

	/**
	 * Restart a Cloudera Manager service (THIS ACTION WILL RESTART OTHER DEPENDANT SERVICES)
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/service/restart
	 * @param service [required] Name of the service to be restarted
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_service_restart_POST(String serviceName, OvhClusterServiceNameEnum service) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/service/restart";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "service", service);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Stop a Cloudera Manager service (THIS ACTION WILL STOP OTHER DEPENDANT SERVICES)
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/service/stop
	 * @param service [required] Name of the service to be stopped
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_service_stop_POST(String serviceName, OvhClusterServiceNameEnum service) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/service/stop";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "service", service);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Start a Cloudera Manager service
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/service/start
	 * @param service [required] Name of the service to be started
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_service_start_POST(String serviceName, OvhClusterServiceNameEnum service) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/service/start";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "service", service);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of orderable Node profiles
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/orderableNodeProfiles
	 * @param serviceName [required] The internal name of your cluster
	 */
	public ArrayList<String> serviceName_orderableNodeProfiles_GET(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/orderableNodeProfiles";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Start the Cloudera Manager Hadoop Cluster
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/start
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_start_POST(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/start";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Terminate your service. THE CLUSTER WILL BE DELETED. ALL YOUR DATA WILL BE LOST
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cluster/hadoop/{serviceName}
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhHadoop serviceName_GET(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHadoop.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/node/{hostname}
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 */
	public OvhNode serviceName_node_hostname_GET(String serviceName, String hostname) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}";
		StringBuilder sb = path(qPath, serviceName, hostname);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNode.class);
	}

	/**
	 * Remove this Node from the Cluster
	 *
	 * REST: DELETE /cluster/hadoop/{serviceName}/node/{hostname}
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 */
	public OvhTask serviceName_node_hostname_DELETE(String serviceName, String hostname) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}";
		StringBuilder sb = path(qPath, serviceName, hostname);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Recommission the node and all the services on it
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/node/{hostname}/recommission
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 */
	public OvhTask serviceName_node_hostname_recommission_POST(String serviceName, String hostname) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}/recommission";
		StringBuilder sb = path(qPath, serviceName, hostname);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Roles (ie set of Hadoop services) of the Node
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/node/{hostname}/role
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 */
	public ArrayList<OvhRoleTypeEnum> serviceName_node_hostname_role_GET(String serviceName, String hostname) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}/role";
		StringBuilder sb = path(qPath, serviceName, hostname);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhRoleTypeEnum>> t2 = new TypeReference<ArrayList<OvhRoleTypeEnum>>() {};

	/**
	 * Add the Role to the Node
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/node/{hostname}/role
	 * @param type [required] Role name
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 */
	public OvhTask serviceName_node_hostname_role_POST(String serviceName, String hostname, OvhRoleTypeEnum type) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}/role";
		StringBuilder sb = path(qPath, serviceName, hostname);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restart the role on the node (THIS ACTION WILL RESTART OTHER DEPENDANT ROLES)
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/node/{hostname}/role/{type}/restart
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 * @param type [required] Role name
	 */
	public OvhTask serviceName_node_hostname_role_type_restart_POST(String serviceName, String hostname, net.minidev.ovh.api.cluster.hadoop.OvhRoleTypeEnum type) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}/role/{type}/restart";
		StringBuilder sb = path(qPath, serviceName, hostname, type);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/node/{hostname}/role/{type}
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 * @param type [required] Role name
	 */
	public OvhRole serviceName_node_hostname_role_type_GET(String serviceName, String hostname, net.minidev.ovh.api.cluster.hadoop.OvhRoleTypeEnum type) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}/role/{type}";
		StringBuilder sb = path(qPath, serviceName, hostname, type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRole.class);
	}

	/**
	 * Remove this Role from the Node
	 *
	 * REST: DELETE /cluster/hadoop/{serviceName}/node/{hostname}/role/{type}
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 * @param type [required] Role name
	 */
	public OvhTask serviceName_node_hostname_role_type_DELETE(String serviceName, String hostname, net.minidev.ovh.api.cluster.hadoop.OvhRoleTypeEnum type) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}/role/{type}";
		StringBuilder sb = path(qPath, serviceName, hostname, type);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Start the role on the node
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/node/{hostname}/role/{type}/start
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 * @param type [required] Role name
	 */
	public OvhTask serviceName_node_hostname_role_type_start_POST(String serviceName, String hostname, net.minidev.ovh.api.cluster.hadoop.OvhRoleTypeEnum type) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}/role/{type}/start";
		StringBuilder sb = path(qPath, serviceName, hostname, type);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Stop the role on the node (THIS ACTION WILL STOP OTHER DEPENDANT ROLES)
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/node/{hostname}/role/{type}/stop
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 * @param type [required] Role name
	 */
	public OvhTask serviceName_node_hostname_role_type_stop_POST(String serviceName, String hostname, net.minidev.ovh.api.cluster.hadoop.OvhRoleTypeEnum type) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}/role/{type}/stop";
		StringBuilder sb = path(qPath, serviceName, hostname, type);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Decommission the node and all the services on it
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/node/{hostname}/decommission
	 * @param serviceName [required] The internal name of your cluster
	 * @param hostname [required] Hostname of the node
	 */
	public OvhTask serviceName_node_hostname_decommission_POST(String serviceName, String hostname) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node/{hostname}/decommission";
		StringBuilder sb = path(qPath, serviceName, hostname);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Nodes of the Cluster
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/node
	 * @param softwareProfile [required] Filter the value of softwareProfile property (=)
	 * @param serviceName [required] The internal name of your cluster
	 */
	public ArrayList<String> serviceName_node_GET(String serviceName, OvhNodeProfileEnum softwareProfile) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/node";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "softwareProfile", softwareProfile);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Restart the Cloudera Manager Hadoop Cluster (THIS ACTION WILL RESTART EVERY SERVICE)
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/restart
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_restart_POST(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/restart";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Order a new node in the cluster
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/orderNewNodeHourly
	 * @param nodeProfile [required] Node profile you want to order
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_orderNewNodeHourly_POST(String serviceName, String nodeProfile) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/orderNewNodeHourly";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "nodeProfile", nodeProfile);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/task/{taskId}
	 * @param serviceName [required] The internal name of your cluster
	 * @param taskId [required]
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated with this Hadoop Cluster
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/task
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your cluster
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhOperationStateEnum status) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Stop a Cloudera Manager Hadoop Cluster (THIS ACTION WILL STOP EVERY SERVICE)
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/stop
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_stop_POST(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/stop";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the current node consumptions that you will billed for on the next bill
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/nodeConsumptions
	 * @param serviceName [required] The internal name of your cluster
	 */
	public ArrayList<OvhNodeConsumption> serviceName_nodeConsumptions_GET(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/nodeConsumptions";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhNodeConsumption>> t4 = new TypeReference<ArrayList<OvhNodeConsumption>>() {};

	/**
	 * Detailed description for each Node profile
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/nodeBillingProfiles
	 * @param serviceName [required] The internal name of your cluster
	 */
	public ArrayList<OvhNodeBillingProfile> serviceName_nodeBillingProfiles_GET(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/nodeBillingProfiles";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhNodeBillingProfile>> t5 = new TypeReference<ArrayList<OvhNodeBillingProfile>>() {};

	/**
	 * Users associated with this Hadoop Cluster
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/user
	 * @param serviceName [required] The internal name of your cluster
	 */
	public ArrayList<String> serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add an User to your cluster
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/user
	 * @param clouderaManager [required] Whether or not the User is allowed to access to the Cloudera Manager interface
	 * @param hue [required] Whether or not the User is allowed to access to the Hue interface
	 * @param password [required] Password of the User
	 * @param httpFrontend [required] Whether or not the User is allowed to access to the WebUI interfaces
	 * @param username [required] Username of the User
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhTask serviceName_user_POST(String serviceName, Boolean clouderaManager, Boolean httpFrontend, Boolean hue, String password, String username) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "clouderaManager", clouderaManager);
		addBody(o, "httpFrontend", httpFrontend);
		addBody(o, "hue", hue);
		addBody(o, "password", password);
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Reset the password for a given Hadoop Cluster User
	 *
	 * REST: POST /cluster/hadoop/{serviceName}/user/{username}/resetPassword
	 * @param password [required] Password of the User
	 * @param serviceName [required] The internal name of your cluster
	 * @param username [required] The username of the User
	 */
	public OvhTask serviceName_user_username_resetPassword_POST(String serviceName, String username, String password) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/user/{username}/resetPassword";
		StringBuilder sb = path(qPath, serviceName, username);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/user/{username}
	 * @param serviceName [required] The internal name of your cluster
	 * @param username [required] The username of the User
	 */
	public OvhUser serviceName_user_username_GET(String serviceName, String username) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/user/{username}";
		StringBuilder sb = path(qPath, serviceName, username);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cluster/hadoop/{serviceName}/user/{username}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your cluster
	 * @param username [required] The username of the User
	 */
	public void serviceName_user_username_PUT(String serviceName, String username, OvhUser body) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/user/{username}";
		StringBuilder sb = path(qPath, serviceName, username);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove this User
	 *
	 * REST: DELETE /cluster/hadoop/{serviceName}/user/{username}
	 * @param serviceName [required] The internal name of your cluster
	 * @param username [required] The username of the User
	 */
	public OvhTask serviceName_user_username_DELETE(String serviceName, String username) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/user/{username}";
		StringBuilder sb = path(qPath, serviceName, username);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cluster/hadoop/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your cluster
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cluster/hadoop/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your cluster
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/cluster/hadoop/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get the orderable node profiles and their characteristics
	 *
	 * REST: GET /cluster/hadoop/orderableNodeProfiles
	 */
	public ArrayList<OvhNodeBillingProfile> orderableNodeProfiles_GET() throws IOException {
		String qPath = "/cluster/hadoop/orderableNodeProfiles";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}

	/**
	 * Get informations about the order of one cluster
	 *
	 * REST: GET /cluster/hadoop/orderInformations
	 */
	public OvhOrderInformations orderInformations_GET() throws IOException {
		String qPath = "/cluster/hadoop/orderInformations";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOrderInformations.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /cluster/hadoop
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/cluster/hadoop";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
