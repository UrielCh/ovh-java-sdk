package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.license.OvhActionType;
import net.minidev.ovh.api.license.OvhCloudLinuxOrderConfiguration;
import net.minidev.ovh.api.license.OvhTask;
import net.minidev.ovh.api.license.OvhTaskStateEnum;
import net.minidev.ovh.api.license.cloudlinux.OvhCloudLinux;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/license/cloudLinux
 * version:1.0
 */
public class ApiOvhLicensecloudLinux extends ApiOvhBase {
	public ApiOvhLicensecloudLinux(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/cloudLinux/{serviceName}/serviceInfos
	 * @param serviceName [required] The name of your CloudLinux license
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/license/cloudLinux/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/cloudLinux/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The name of your CloudLinux license
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/license/cloudLinux/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/cloudLinux/{serviceName}
	 * @param serviceName [required] The name of your CloudLinux license
	 */
	public OvhCloudLinux serviceName_GET(String serviceName) throws IOException {
		String qPath = "/license/cloudLinux/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCloudLinux.class);
	}

	/**
	 * Tasks linked to this license
	 *
	 * REST: GET /license/cloudLinux/{serviceName}/tasks
	 * @param status [required] Filter the value of status property (=)
	 * @param action [required] Filter the value of action property (=)
	 * @param serviceName [required] The name of your CloudLinux license
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, OvhActionType action, OvhTaskStateEnum status) throws IOException {
		String qPath = "/license/cloudLinux/{serviceName}/tasks";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "action", action);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/cloudLinux/{serviceName}/tasks/{taskId}
	 * @param serviceName [required] The name of your CloudLinux license
	 * @param taskId [required] This Task id
	 */
	public OvhTask serviceName_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/license/cloudLinux/{serviceName}/tasks/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /license/cloudLinux/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The name of your CloudLinux license
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/license/cloudLinux/{serviceName}/confirmTermination";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /license/cloudLinux/{serviceName}/terminate
	 * @param serviceName [required] The name of your CloudLinux license
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/license/cloudLinux/{serviceName}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /license/cloudLinux
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/license/cloudLinux";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get the orderable CloudLinux versions
	 *
	 * REST: GET /license/cloudLinux/orderableVersions
	 * @param ip [required] Your license Ip
	 */
	public ArrayList<OvhCloudLinuxOrderConfiguration> orderableVersions_GET(String ip) throws IOException {
		String qPath = "/license/cloudLinux/orderableVersions";
		qPath = query(qPath, "ip", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhCloudLinuxOrderConfiguration>> t3 = new TypeReference<ArrayList<OvhCloudLinuxOrderConfiguration>>() {};
}
