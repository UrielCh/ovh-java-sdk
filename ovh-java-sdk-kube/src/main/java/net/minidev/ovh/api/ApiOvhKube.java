package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.kube.OvhCluster;
import net.minidev.ovh.api.kube.OvhKubeconfig;
import net.minidev.ovh.api.kube.OvhNode;
import net.minidev.ovh.api.kube.OvhPublicCloudProject;
import net.minidev.ovh.api.kube.OvhResetWorkerNodesPolicy;
import net.minidev.ovh.api.kube.OvhUpdatePolicy;
import net.minidev.ovh.api.kube.OvhVersion;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/kube
 * version:1.0
 */
public class ApiOvhKube extends ApiOvhBase {
	public ApiOvhKube(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /kube/{serviceName}/changeContact
	 * @param contactAdmin [required] The contact to set as admin contact
	 * @param contactTech [required] The contact to set as tech contact
	 * @param contactBilling [required] The contact to set as billing contact
	 * @param serviceName [required] Your managed Kubernetes cluster ID
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/kube/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Reset cluster: all Kubernetes data will be erased (pods, services, configuration, etc), nodes will be either deleted or reinstalled
	 *
	 * REST: POST /kube/{serviceName}/reset
	 * @param serviceName [required] Cluster ID
	 * @param version [required] Kubernetes version to use after reset, by default it keeps the current version
	 * @param workerNodesPolicy [required] Worker nodes reset policy, default is delete
	 *
	 * API beta
	 */
	public void serviceName_reset_POST(String serviceName, OvhVersion version, OvhResetWorkerNodesPolicy workerNodesPolicy) throws IOException {
		String qPath = "/kube/{serviceName}/reset";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		addBody(o, "workerNodesPolicy", workerNodesPolicy);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /kube/{serviceName}/serviceInfos
	 * @param serviceName [required] Your managed Kubernetes cluster ID
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/kube/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /kube/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Your managed Kubernetes cluster ID
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/kube/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get information about your managed Kubernetes cluster
	 *
	 * REST: GET /kube/{serviceName}
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public OvhCluster serviceName_GET(String serviceName) throws IOException {
		String qPath = "/kube/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCluster.class);
	}

	/**
	 * Update information about your managed Kubernetes cluster
	 *
	 * REST: PUT /kube/{serviceName}
	 * @param serviceName [required] Cluster ID
	 * @param name [required] Cluster new name
	 *
	 * API beta
	 */
	public void serviceName_PUT(String serviceName, String name) throws IOException {
		String qPath = "/kube/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		exec(qPath, "PUT", sb.toString(), o);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /kube/{serviceName}/terminate
	 * @param serviceName [required] Your managed Kubernetes cluster ID
	 *
	 * API beta
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/kube/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Change the update policy of your cluster
	 *
	 * REST: PUT /kube/{serviceName}/updatePolicy
	 * @param serviceName [required] Cluster ID
	 * @param updatePolicy [required] Update policy
	 *
	 * API beta
	 */
	public void serviceName_updatePolicy_PUT(String serviceName, OvhUpdatePolicy updatePolicy) throws IOException {
		String qPath = "/kube/{serviceName}/updatePolicy";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "updatePolicy", updatePolicy);
		exec(qPath, "PUT", sb.toString(), o);
	}

	/**
	 * Get kubeconfig file
	 *
	 * REST: GET /kube/{serviceName}/kubeconfig
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public OvhKubeconfig serviceName_config_GET(String serviceName) throws IOException {
		String qPath = "/kube/{serviceName}/kubeconfig";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhKubeconfig.class);
	}

	/**
	 * List your Public Cloud projects linked to your cluster
	 *
	 * REST: GET /kube/{serviceName}/publiccloud/project
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public ArrayList<OvhPublicCloudProject> serviceName_publiccloud_project_GET(String serviceName) throws IOException {
		String qPath = "/kube/{serviceName}/publiccloud/project";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhPublicCloudProject>> t2 = new TypeReference<ArrayList<OvhPublicCloudProject>>() {};

	/**
	 * List your nodes on Public Cloud
	 *
	 * REST: GET /kube/{serviceName}/publiccloud/node
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public ArrayList<OvhNode> serviceName_publiccloud_node_GET(String serviceName) throws IOException {
		String qPath = "/kube/{serviceName}/publiccloud/node";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhNode>> t3 = new TypeReference<ArrayList<OvhNode>>() {};

	/**
	 * Deploy a node for your cluster on Public Cloud
	 *
	 * REST: POST /kube/{serviceName}/publiccloud/node
	 * @param flavorName [required] Public Cloud flavor name
	 * @param name [required] Node name
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public OvhNode serviceName_publiccloud_node_POST(String serviceName, String flavorName, String name) throws IOException {
		String qPath = "/kube/{serviceName}/publiccloud/node";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flavorName", flavorName);
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNode.class);
	}

	/**
	 * Delete a node on your cluster
	 *
	 * REST: DELETE /kube/{serviceName}/publiccloud/node/{nodeId}
	 * @param nodeId [required] Node ID
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public void serviceName_publiccloud_node_nodeId_DELETE(String serviceName, String nodeId) throws IOException {
		String qPath = "/kube/{serviceName}/publiccloud/node/{nodeId}";
		StringBuilder sb = path(qPath, serviceName, nodeId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get information on a specific node on your cluster
	 *
	 * REST: GET /kube/{serviceName}/publiccloud/node/{nodeId}
	 * @param nodeId [required] Node ID
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public OvhNode serviceName_publiccloud_node_nodeId_GET(String serviceName, String nodeId) throws IOException {
		String qPath = "/kube/{serviceName}/publiccloud/node/{nodeId}";
		StringBuilder sb = path(qPath, serviceName, nodeId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNode.class);
	}

	/**
	 * Update cluster to the latest patch version
	 *
	 * REST: POST /kube/{serviceName}/update
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public void serviceName_update_POST(String serviceName) throws IOException {
		String qPath = "/kube/{serviceName}/update";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /kube/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] Your managed Kubernetes cluster ID
	 *
	 * API beta
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/kube/{serviceName}/confirmTermination";
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
	 * List available services
	 *
	 * REST: GET /kube
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/kube";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<String>> t4 = new TypeReference<ArrayList<String>>() {};
}
