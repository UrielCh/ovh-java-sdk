package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.kube.OvhCluster;
import net.minidev.ovh.api.kube.OvhKubeconfig;
import net.minidev.ovh.api.kube.OvhNode;
import net.minidev.ovh.api.kube.OvhPublicCloudProject;
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
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

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
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhNode>> t2 = new TypeReference<ArrayList<OvhNode>>() {};

	/**
	 * Deploy a node for your cluster on Public Cloud
	 *
	 * REST: POST /kube/{serviceName}/publiccloud/node
	 * @param flavorName [required] Public Cloud flavor name
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public OvhNode serviceName_publiccloud_node_POST(String serviceName, String flavorName) throws IOException {
		String qPath = "/kube/{serviceName}/publiccloud/node";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flavorName", flavorName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNode.class);
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
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhPublicCloudProject>> t3 = new TypeReference<ArrayList<OvhPublicCloudProject>>() {};

	/**
	 * Reset cluster: all Kubernetes data will be erased (pods, services, configuration, etc), your nodes will be deleted
	 *
	 * REST: POST /kube/{serviceName}/reset
	 * @param serviceName [required] Cluster ID
	 *
	 * API beta
	 */
	public void serviceName_reset_POST(String serviceName) throws IOException {
		String qPath = "/kube/{serviceName}/reset";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
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
}
