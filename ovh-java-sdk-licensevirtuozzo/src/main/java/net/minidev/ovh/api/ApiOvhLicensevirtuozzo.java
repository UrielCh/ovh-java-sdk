package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.license.OvhActionType;
import net.minidev.ovh.api.license.OvhChangeIpStatus;
import net.minidev.ovh.api.license.OvhOption;
import net.minidev.ovh.api.license.OvhOptionLabel;
import net.minidev.ovh.api.license.OvhTask;
import net.minidev.ovh.api.license.OvhTaskStateEnum;
import net.minidev.ovh.api.license.OvhVirtuozzoOrderConfiguration;
import net.minidev.ovh.api.license.virtuozzo.OvhVirtuozzo;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/license/virtuozzo
 * version:1.0
 */
public class ApiOvhLicensevirtuozzo extends ApiOvhBase {
	public ApiOvhLicensevirtuozzo(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /license/virtuozzo/{serviceName}/serviceInfos
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /license/virtuozzo/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /license/virtuozzo/{serviceName}
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public OvhVirtuozzo serviceName_GET(String serviceName) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhVirtuozzo.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /license/virtuozzo/{serviceName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public void serviceName_PUT(String serviceName, OvhVirtuozzo body) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * tasks linked to this license
	 * 
	 * REST: GET /license/virtuozzo/{serviceName}/tasks
	 * @param status [required] Filter the value of status property (=)
	 * @param action [required] Filter the value of action property (=)
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, OvhActionType action, OvhTaskStateEnum status) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/tasks";
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
	 * REST: GET /license/virtuozzo/{serviceName}/tasks/{taskId}
	 * @param serviceName [required] The name of your Virtuozzo license
	 * @param taskId [required] This Task id
	 */
	public OvhTask serviceName_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/tasks/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Returns an array of ips where the license can be moved to
	 * 
	 * REST: GET /license/virtuozzo/{serviceName}/allowedDestinationIp
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public ArrayList<String> serviceName_allowedDestinationIp_GET(String serviceName) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/allowedDestinationIp";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /license/virtuozzo/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/confirmTermination";
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
	 * REST: POST /license/virtuozzo/{serviceName}/terminate
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Will tell if the ip can accept the license
	 * 
	 * REST: GET /license/virtuozzo/{serviceName}/canLicenseBeMovedTo
	 * @param destinationIp [required] The Ip on which you want to move this license
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public OvhChangeIpStatus serviceName_canLicenseBeMovedTo_GET(String serviceName, String destinationIp) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/canLicenseBeMovedTo";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "destinationIp", destinationIp);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhChangeIpStatus.class);
	}

	/**
	 * Move this license to another Ip
	 * 
	 * REST: POST /license/virtuozzo/{serviceName}/changeIp
	 * @param destinationIp [required] The Ip on which you want to move this license
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public OvhTask serviceName_changeIp_POST(String serviceName, String destinationIp) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/changeIp";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destinationIp", destinationIp);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Options linked to this license
	 * 
	 * REST: GET /license/virtuozzo/{serviceName}/option
	 * @param label [required] Filter the value of label property (=)
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public ArrayList<OvhOptionLabel> serviceName_option_GET(String serviceName, OvhOptionLabel label) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/option";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "label", label);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhOptionLabel>> t3 = new TypeReference<ArrayList<OvhOptionLabel>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /license/virtuozzo/{serviceName}/option/{label}
	 * @param serviceName [required] The name of your Virtuozzo license
	 * @param label [required] This option designation
	 */
	public OvhOption serviceName_option_label_GET(String serviceName, net.minidev.ovh.api.license.OvhOptionLabel label) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/option/{label}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{label}", label.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOption.class);
	}

	/**
	 * release this Option
	 * 
	 * REST: DELETE /license/virtuozzo/{serviceName}/option/{label}
	 * @param serviceName [required] The name of your Virtuozzo license
	 * @param label [required] This option designation
	 */
	public OvhTask serviceName_option_label_DELETE(String serviceName, net.minidev.ovh.api.license.OvhOptionLabel label) throws IOException {
		String qPath = "/license/virtuozzo/{serviceName}/option/{label}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{label}", label.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /license/virtuozzo
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/license/virtuozzo";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get the orderable Virtuozzo versions
	 * 
	 * REST: GET /license/virtuozzo/orderableVersions
	 * @param ip [required] Your license Ip
	 */
	public ArrayList<OvhVirtuozzoOrderConfiguration> orderableVersions_GET(String ip) throws IOException {
		String qPath = "/license/virtuozzo/orderableVersions";
		qPath = query(qPath, "ip", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhVirtuozzoOrderConfiguration>> t4 = new TypeReference<ArrayList<OvhVirtuozzoOrderConfiguration>>() {};
}
