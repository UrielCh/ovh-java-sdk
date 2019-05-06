package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.license.OvhActionType;
import net.minidev.ovh.api.license.OvhChangeIpStatus;
import net.minidev.ovh.api.license.OvhTask;
import net.minidev.ovh.api.license.OvhTaskStateEnum;
import net.minidev.ovh.api.license.OvhWorkLightOrderConfiguration;
import net.minidev.ovh.api.license.worklight.OvhWorkLight;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/license/worklight
 * version:1.0
 */
public class ApiOvhLicenseworklight extends ApiOvhBase {
	public ApiOvhLicenseworklight(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /license/worklight
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/license/worklight";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Returns an array of ips where the license can be moved to
	 *
	 * REST: GET /license/worklight/{serviceName}/allowedDestinationIp
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public ArrayList<String> serviceName_allowedDestinationIp_GET(String serviceName) throws IOException {
		String qPath = "/license/worklight/{serviceName}/allowedDestinationIp";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /license/worklight/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/license/worklight/{serviceName}/confirmTermination";
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
	 * Will tell if the ip can accept the license
	 *
	 * REST: GET /license/worklight/{serviceName}/canLicenseBeMovedTo
	 * @param destinationIp [required] The Ip on which you want to move this license
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public OvhChangeIpStatus serviceName_canLicenseBeMovedTo_GET(String serviceName, String destinationIp) throws IOException {
		String qPath = "/license/worklight/{serviceName}/canLicenseBeMovedTo";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "destinationIp", destinationIp);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhChangeIpStatus.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/worklight/{serviceName}
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public OvhWorkLight serviceName_GET(String serviceName) throws IOException {
		String qPath = "/license/worklight/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhWorkLight.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/worklight/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public void serviceName_PUT(String serviceName, OvhWorkLight body) throws IOException {
		String qPath = "/license/worklight/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /license/worklight/{serviceName}/terminate
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/license/worklight/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Tasks linked to this license
	 *
	 * REST: GET /license/worklight/{serviceName}/tasks
	 * @param action [required] Filter the value of action property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, OvhActionType action, OvhTaskStateEnum status) throws IOException {
		String qPath = "/license/worklight/{serviceName}/tasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "action", action);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/worklight/{serviceName}/tasks/{taskId}
	 * @param serviceName [required] The name of your WorkLight license
	 * @param taskId [required] This Task id
	 */
	public OvhTask serviceName_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/license/worklight/{serviceName}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Move this license to another Ip
	 *
	 * REST: POST /license/worklight/{serviceName}/changeIp
	 * @param destinationIp [required] The Ip on which you want to move this license
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public OvhTask serviceName_changeIp_POST(String serviceName, String destinationIp) throws IOException {
		String qPath = "/license/worklight/{serviceName}/changeIp";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destinationIp", destinationIp);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/worklight/{serviceName}/serviceInfos
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/license/worklight/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/worklight/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/license/worklight/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get the orderable WorkLight versions
	 *
	 * REST: GET /license/worklight/orderableVersions
	 * @param ip [required] Your license Ip
	 */
	public ArrayList<OvhWorkLightOrderConfiguration> orderableVersions_GET(String ip) throws IOException {
		String qPath = "/license/worklight/orderableVersions";
		StringBuilder sb = path(qPath);
		query(sb, "ip", ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhWorkLightOrderConfiguration>> t3 = new TypeReference<ArrayList<OvhWorkLightOrderConfiguration>>() {};
}
