package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.monitoring.OvhBackend;
import net.minidev.ovh.api.monitoring.OvhConfig;
import net.minidev.ovh.api.monitoring.OvhFirewallConfig;
import net.minidev.ovh.api.monitoring.OvhNscaConfig;
import net.minidev.ovh.api.monitoring.OvhResource;
import net.minidev.ovh.api.monitoring.OvhTestConfigResult;
import net.minidev.ovh.api.monitoring.OvhTimezoneConfig;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/paas/monitoring
 * version:1.0
 */
public class ApiOvhPaasmonitoring extends ApiOvhBase {
	public ApiOvhPaasmonitoring(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/monitoring/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your monitoring instance
	 * @beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /paas/monitoring/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your monitoring instance
	 * @beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Get a specific monitoring service.
	 *
	 * REST: GET /paas/monitoring/{serviceName}
	 * @param serviceName [required] service name
	 * @beta
	 */
	public net.minidev.ovh.api.monitoring.OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, net.minidev.ovh.api.monitoring.OvhService.class);
	}

	/**
	 * Deploy a specific monitoring service.
	 *
	 * REST: POST /paas/monitoring/{serviceName}/deploy
	 * @param serviceName [required] service name
	 * @param body [required] A Shinken-based monitoring service
	 * @beta
	 */
	public net.minidev.ovh.api.monitoring.OvhService serviceName_deploy_POST(String serviceName, net.minidev.ovh.api.monitoring.OvhService body) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/deploy";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("POST", sb.toString(), body);
		return convertTo(resp, net.minidev.ovh.api.monitoring.OvhService.class);
	}

	/**
	 * Get all backends.
	 *
	 * REST: GET /paas/monitoring/{serviceName}/backend
	 * @param serviceName [required] service name
	 * @beta
	 */
	public ArrayList<String> serviceName_backend_GET(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/backend";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get a specific backend.
	 *
	 * REST: GET /paas/monitoring/{serviceName}/backend/{backendId}
	 * @param backendId [required] backend id
	 * @param serviceName [required] service name
	 * @beta
	 */
	public OvhBackend serviceName_backend_backendId_GET(String serviceName, String backendId) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/backend/{backendId}";
		StringBuilder sb = path(qPath, serviceName, backendId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /paas/monitoring/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal ID of your monitoring instance
	 * @beta
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/confirmTermination";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /paas/monitoring/{serviceName}/terminate
	 * @param serviceName [required] The internal ID of your monitoring instance
	 * @beta
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, String.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /paas/monitoring/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your monitoring instance
	 * @beta
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Apply the resources of a monitoring service.
	 *
	 * REST: POST /paas/monitoring/{serviceName}/resource/apply
	 * @param serviceName [required] service name
	 * @beta
	 */
	public void serviceName_resource_apply_POST(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource/apply";
		StringBuilder sb = path(qPath, serviceName);
		exec("POST", sb.toString());
	}

	/**
	 * Get all resources of the specified type of resources.
	 *
	 * REST: GET /paas/monitoring/{serviceName}/resource
	 * @param serviceName [required] service name
	 * @beta
	 */
	public ArrayList<String> serviceName_resource_GET(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Test the validity of a monitoring service resources.
	 *
	 * REST: POST /paas/monitoring/{serviceName}/resource/test
	 * @param serviceName [required] service name
	 * @beta
	 */
	public OvhTestConfigResult serviceName_resource_test_POST(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource/test";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhTestConfigResult.class);
	}

	/**
	 * Get all resources of the specified type of resources.
	 *
	 * REST: GET /paas/monitoring/{serviceName}/resource/{resourceType}
	 * @param resourceType [required] resource type
	 * @param serviceName [required] service name
	 * @beta
	 */
	public ArrayList<String> serviceName_resource_resourceType_GET(String serviceName, String resourceType) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource/{resourceType}";
		StringBuilder sb = path(qPath, serviceName, resourceType);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Add a new resource to a monitoring service.
	 *
	 * REST: POST /paas/monitoring/{serviceName}/resource/{resourceType}
	 * @param resourceType [required] resource type
	 * @param serviceName [required] service name
	 * @param body [required] Shinken resource (e.g. Host, Service, Contact, etc)
	 * @beta
	 */
	public OvhResource serviceName_resource_resourceType_POST(String serviceName, String resourceType, OvhResource body) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource/{resourceType}";
		StringBuilder sb = path(qPath, serviceName, resourceType);
		String resp = exec("POST", sb.toString(), body);
		return convertTo(resp, OvhResource.class);
	}

	/**
	 * Delete all resources of the specified type.
	 *
	 * REST: DELETE /paas/monitoring/{serviceName}/resource/{resourceType}
	 * @param resourceType [required] resource type
	 * @param serviceName [required] service name
	 * @beta
	 */
	public void serviceName_resource_resourceType_DELETE(String serviceName, String resourceType) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource/{resourceType}";
		StringBuilder sb = path(qPath, serviceName, resourceType);
		exec("DELETE", sb.toString());
	}

	/**
	 * Get a specific resource.
	 *
	 * REST: GET /paas/monitoring/{serviceName}/resource/{resourceType}/{resourceId}
	 * @param resourceType [required] resource type
	 * @param resourceId [required] resource id
	 * @param serviceName [required] service name
	 * @beta
	 */
	public OvhResource serviceName_resource_resourceType_resourceId_GET(String serviceName, String resourceType, String resourceId) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource/{resourceType}/{resourceId}";
		StringBuilder sb = path(qPath, serviceName, resourceType, resourceId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhResource.class);
	}

	/**
	 * Update a resource of a monitoring service.
	 *
	 * REST: PUT /paas/monitoring/{serviceName}/resource/{resourceType}/{resourceId}
	 * @param resourceType [required] resource type
	 * @param resourceId [required] resource id
	 * @param serviceName [required] service name
	 * @param body [required] Shinken resource (e.g. Host, Service, Contact, etc)
	 * @beta
	 */
	public OvhResource serviceName_resource_resourceType_resourceId_PUT(String serviceName, String resourceType, String resourceId, OvhResource body) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource/{resourceType}/{resourceId}";
		StringBuilder sb = path(qPath, serviceName, resourceType, resourceId);
		String resp = exec("PUT", sb.toString(), body);
		return convertTo(resp, OvhResource.class);
	}

	/**
	 * Remove a resource of a monitoring service.
	 *
	 * REST: DELETE /paas/monitoring/{serviceName}/resource/{resourceType}/{resourceId}
	 * @param resourceType [required] resource type
	 * @param resourceId [required] resource id
	 * @param serviceName [required] service name
	 * @beta
	 */
	public void serviceName_resource_resourceType_resourceId_DELETE(String serviceName, String resourceType, String resourceId) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource/{resourceType}/{resourceId}";
		StringBuilder sb = path(qPath, serviceName, resourceType, resourceId);
		exec("DELETE", sb.toString());
	}

	/**
	 * Post at once all the resources of a type.
	 *
	 * REST: POST /paas/monitoring/{serviceName}/resource/{resourceType}/batch
	 * @param resourceType [required] resource type
	 * @param serviceName [required] service name
	 * @param body [required] Batch of resource configuration sets
	 * @beta
	 */
	public void serviceName_resource_resourceType_batch_POST(String serviceName, String resourceType, OvhConfig[] body) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/resource/{resourceType}/batch";
		StringBuilder sb = path(qPath, serviceName, resourceType);
		exec("POST", sb.toString(), body);
	}

	/**
	 * Get the timezone configuration of a monitoring service.
	 *
	 * REST: GET /paas/monitoring/{serviceName}/config/timezone
	 * @param serviceName [required] service name
	 * @beta
	 */
	public OvhTimezoneConfig serviceName_config_timezone_GET(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/config/timezone";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhTimezoneConfig.class);
	}

	/**
	 * Update the NSCA configuration of a monitoring service.
	 *
	 * REST: PUT /paas/monitoring/{serviceName}/config/timezone
	 * @param serviceName [required] service name
	 * @param body [required] Configuration of the timezone
	 * @beta
	 */
	public OvhTimezoneConfig serviceName_config_timezone_PUT(String serviceName, OvhTimezoneConfig body) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/config/timezone";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("PUT", sb.toString(), body);
		return convertTo(resp, OvhTimezoneConfig.class);
	}

	/**
	 * Get the firewall configuration of a monitoring service.
	 *
	 * REST: GET /paas/monitoring/{serviceName}/config/firewall
	 * @param serviceName [required] service name
	 * @beta
	 */
	public OvhFirewallConfig serviceName_config_firewall_GET(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/config/firewall";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhFirewallConfig.class);
	}

	/**
	 * Update the NSCA configuration of a monitoring service.
	 *
	 * REST: PUT /paas/monitoring/{serviceName}/config/firewall
	 * @param serviceName [required] service name
	 * @param body [required] Configuration of the firewall
	 * @beta
	 */
	public OvhFirewallConfig serviceName_config_firewall_PUT(String serviceName, OvhFirewallConfig body) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/config/firewall";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("PUT", sb.toString(), body);
		return convertTo(resp, OvhFirewallConfig.class);
	}

	/**
	 * Get the NSCA configuration of a monitoring service.
	 *
	 * REST: GET /paas/monitoring/{serviceName}/config/nsca
	 * @param serviceName [required] service name
	 * @beta
	 */
	public OvhNscaConfig serviceName_config_nsca_GET(String serviceName) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/config/nsca";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhNscaConfig.class);
	}

	/**
	 * Update the NSCA configuration of a monitoring service.
	 *
	 * REST: PUT /paas/monitoring/{serviceName}/config/nsca
	 * @param serviceName [required] service name
	 * @param body [required] Configuration for the NSCA receiver
	 * @beta
	 */
	public OvhNscaConfig serviceName_config_nsca_PUT(String serviceName, OvhNscaConfig body) throws IOException {
		String qPath = "/paas/monitoring/{serviceName}/config/nsca";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("PUT", sb.toString(), body);
		return convertTo(resp, OvhNscaConfig.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /paas/monitoring
	 * @beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/paas/monitoring";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}
}
