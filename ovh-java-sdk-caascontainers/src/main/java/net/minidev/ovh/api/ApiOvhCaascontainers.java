package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.docker.OvhSlave;
import net.minidev.ovh.api.docker.OvhStack;
import net.minidev.ovh.api.docker.framework.OvhPassword;
import net.minidev.ovh.api.docker.slave.OvhFlavor;
import net.minidev.ovh.api.docker.stack.OvhCustomSsl;
import net.minidev.ovh.api.docker.stack.OvhCustomSslMessage;
import net.minidev.ovh.api.docker.stack.OvhInputCustomSsl;
import net.minidev.ovh.api.docker.stack.OvhRegistryCredentials;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.stack.OvhFramework;
import net.minidev.ovh.api.stack.framework.OvhApplication;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/caas/containers
 * version:1.0
 */
public class ApiOvhCaascontainers extends ApiOvhBase {
	public ApiOvhCaascontainers(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /caas/containers/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your project
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/caas/containers/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /caas/containers/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal ID of your project
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/caas/containers/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Inspect the argument stack
	 * 
	 * REST: GET /caas/containers/{serviceName}
	 * @param serviceName [required] service name
	 */
	public OvhStack serviceName_GET(String serviceName) throws IOException {
		String qPath = "/caas/containers/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhStack.class);
	}

	/**
	 * Update the custom SSL certificate and private
	 * 
	 * REST: PUT /caas/containers/{serviceName}/ssl
	 * @param null [required] A custom SSL certificate associated to a Docker PaaS environment
	 * @param serviceName [required] service name
	 */
	public OvhCustomSslMessage serviceName_ssl_PUT(String serviceName, OvhInputCustomSsl body) throws IOException {
		String qPath = "/caas/containers/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("PUT", qPath, body);
		return convertTo(resp, OvhCustomSslMessage.class);
	}

	/**
	 * Delete the custom SSL certificate and private key associated to the stack
	 * 
	 * REST: DELETE /caas/containers/{serviceName}/ssl
	 * @param serviceName [required] service name
	 */
	public OvhCustomSslMessage serviceName_ssl_DELETE(String serviceName) throws IOException {
		String qPath = "/caas/containers/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhCustomSslMessage.class);
	}

	/**
	 * Inspect the custom SSL certificate and private
	 * 
	 * REST: GET /caas/containers/{serviceName}/ssl
	 * @param serviceName [required] service name
	 */
	public OvhCustomSsl serviceName_ssl_GET(String serviceName) throws IOException {
		String qPath = "/caas/containers/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCustomSsl.class);
	}

	/**
	 * List the id of the registered slave instances
	 * 
	 * REST: GET /caas/containers/{serviceName}/slaves
	 * @param serviceName [required] service name
	 */
	public ArrayList<String> serviceName_slaves_GET(String serviceName) throws IOException {
		String qPath = "/caas/containers/{serviceName}/slaves";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Inspect the argument user slave instance
	 * 
	 * REST: GET /caas/containers/{serviceName}/slaves/{slaveId}
	 * @param slaveId [required] slave id
	 * @param serviceName [required] service name
	 */
	public OvhSlave serviceName_slaves_slaveId_GET(String serviceName, String slaveId) throws IOException {
		String qPath = "/caas/containers/{serviceName}/slaves/{slaveId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{slaveId}", slaveId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSlave.class);
	}

	/**
	 * Associate the stack with some credentials to an authenticated registry.
	 * 
	 * REST: POST /caas/containers/{serviceName}/registry/credentials
	 * @param null [required] Credentials providing authentication to an external registry
	 * @param serviceName [required] service name
	 */
	public OvhRegistryCredentials serviceName_registry_credentials_POST(String serviceName, OvhInputCustomSsl body) throws IOException {
		String qPath = "/caas/containers/{serviceName}/registry/credentials";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath, body);
		return convertTo(resp, OvhRegistryCredentials.class);
	}

	/**
	 * List the registry credentials associated to the stack.
	 * 
	 * REST: GET /caas/containers/{serviceName}/registry/credentials
	 * @param serviceName [required] service name
	 */
	public ArrayList<String> serviceName_registry_credentials_GET(String serviceName) throws IOException {
		String qPath = "/caas/containers/{serviceName}/registry/credentials";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Update the registry credentials.
	 * 
	 * REST: PUT /caas/containers/{serviceName}/registry/credentials/{credentialsId}
	 * @param null [required] Credentials providing authentication to an external registry
	 * @param credentialsId [required] credentials id
	 * @param serviceName [required] service name
	 */
	public OvhRegistryCredentials serviceName_registry_credentials_credentialsId_PUT(String serviceName, String credentialsId, OvhInputCustomSsl body) throws IOException {
		String qPath = "/caas/containers/{serviceName}/registry/credentials/{credentialsId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{credentialsId}", credentialsId);
		String resp = exec("PUT", qPath, body);
		return convertTo(resp, OvhRegistryCredentials.class);
	}

	/**
	 * Inspect the image registry credentials associated to the stack
	 * 
	 * REST: GET /caas/containers/{serviceName}/registry/credentials/{credentialsId}
	 * @param credentialsId [required] credentials id
	 * @param serviceName [required] service name
	 */
	public OvhRegistryCredentials serviceName_registry_credentials_credentialsId_GET(String serviceName, String credentialsId) throws IOException {
		String qPath = "/caas/containers/{serviceName}/registry/credentials/{credentialsId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{credentialsId}", credentialsId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRegistryCredentials.class);
	}

	/**
	 * Delete the registry credentials.
	 * 
	 * REST: DELETE /caas/containers/{serviceName}/registry/credentials/{credentialsId}
	 * @param credentialsId [required] credentials id
	 * @param serviceName [required] service name
	 */
	public void serviceName_registry_credentials_credentialsId_DELETE(String serviceName, String credentialsId) throws IOException {
		String qPath = "/caas/containers/{serviceName}/registry/credentials/{credentialsId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{credentialsId}", credentialsId);
		exec("DELETE", qPath);
	}

	/**
	 * List the frameworks installed on the argument stack
	 * 
	 * REST: GET /caas/containers/{serviceName}/frameworks
	 * @param serviceName [required] service name
	 */
	public ArrayList<String> serviceName_frameworks_GET(String serviceName) throws IOException {
		String qPath = "/caas/containers/{serviceName}/frameworks";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Inspect the stack framework
	 * 
	 * REST: GET /caas/containers/{serviceName}/frameworks/{frameworkId}
	 * @param frameworkId [required] framework id
	 * @param serviceName [required] service name
	 */
	public OvhFramework serviceName_frameworks_frameworkId_GET(String serviceName, String frameworkId) throws IOException {
		String qPath = "/caas/containers/{serviceName}/frameworks/{frameworkId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frameworkId}", frameworkId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFramework.class);
	}

	/**
	 * Update the framework access password
	 * 
	 * REST: PUT /caas/containers/{serviceName}/frameworks/{frameworkId}/password
	 * @param frameworkId [required] framework id
	 * @param serviceName [required] service name
	 * @param null [required] The new framework password
	 */
	public void serviceName_frameworks_frameworkId_password_PUT(String serviceName, String frameworkId, OvhPassword body) throws IOException {
		String qPath = "/caas/containers/{serviceName}/frameworks/{frameworkId}/password";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frameworkId}", frameworkId);
		exec("PUT", qPath, body);
	}

	/**
	 * List apps in the framework
	 * 
	 * REST: GET /caas/containers/{serviceName}/frameworks/{frameworkId}/apps
	 * @param frameworkId [required] framework id
	 * @param serviceName [required] service name
	 */
	public OvhApplication serviceName_frameworks_frameworkId_apps_GET(String serviceName, String frameworkId) throws IOException {
		String qPath = "/caas/containers/{serviceName}/frameworks/{frameworkId}/apps";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frameworkId}", frameworkId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhApplication.class);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /caas/containers/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your project
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/caas/containers/{serviceName}/changeContact";
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
	 * List all the installable Mesos frameworks
	 * 
	 * REST: GET /caas/containers/{serviceName}/availableFrameworks
	 * @param serviceName [required] service name
	 */
	public ArrayList<String> serviceName_availableFrameworks_GET(String serviceName) throws IOException {
		String qPath = "/caas/containers/{serviceName}/availableFrameworks";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /caas/containers
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/caas/containers";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * List the /cloud flavors available for the Docker PaaS slaves
	 * 
	 * REST: GET /caas/containers/slaves/flavors
	 */
	public ArrayList<String> slaves_flavors_GET() throws IOException {
		String qPath = "/caas/containers/slaves/flavors";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Inspect the argument slave flavor
	 * 
	 * REST: GET /caas/containers/slaves/flavors/{flavorId}
	 * @param flavorId [required] flavor id
	 */
	public OvhFlavor slaves_flavors_flavorId_GET(String flavorId) throws IOException {
		String qPath = "/caas/containers/slaves/flavors/{flavorId}";
		qPath = qPath.replace("{flavorId}", flavorId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFlavor.class);
	}
}
