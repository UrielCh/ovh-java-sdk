package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.license.OvhActionType;
import net.minidev.ovh.api.license.OvhOption;
import net.minidev.ovh.api.license.OvhOptionLabel;
import net.minidev.ovh.api.license.OvhTask;
import net.minidev.ovh.api.license.OvhTaskStateEnum;
import net.minidev.ovh.api.license.OvhWindowsOrderConfiguration;
import net.minidev.ovh.api.license.OvhWindowsSqlVersionEnum;
import net.minidev.ovh.api.license.windows.OvhWindows;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/license/windows
 * version:1.0
 */
public class ApiOvhLicensewindows extends ApiOvhBase {
	public ApiOvhLicensewindows(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get the orderable Windows versions
	 *
	 * REST: GET /license/windows/orderableVersions
	 * @param ip [required] Your license Ip
	 */
	public ArrayList<OvhWindowsOrderConfiguration> orderableVersions_GET(String ip) throws IOException {
		String qPath = "/license/windows/orderableVersions";
		StringBuilder sb = path(qPath);
		query(sb, "ip", ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhWindowsOrderConfiguration>> t1 = new TypeReference<ArrayList<OvhWindowsOrderConfiguration>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/windows/{serviceName}/serviceInfos
	 * @param serviceName [required] The name of your Windows license
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/license/windows/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/windows/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The name of your Windows license
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/license/windows/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /license/windows/{serviceName}/terminate
	 * @param serviceName [required] The name of your Windows license
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/license/windows/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Link your own sql server license to this Windows license
	 *
	 * REST: POST /license/windows/{serviceName}/sqlServer
	 * @param licenseId [required] Your license serial number
	 * @param version [required] Your license version
	 * @param serviceName [required] The name of your Windows license
	 */
	public OvhTask serviceName_sqlServer_POST(String serviceName, String licenseId, OvhWindowsSqlVersionEnum version) throws IOException {
		String qPath = "/license/windows/{serviceName}/sqlServer";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "licenseId", licenseId);
		addBody(o, "version", version);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/windows/{serviceName}
	 * @param serviceName [required] The name of your Windows license
	 */
	public OvhWindows serviceName_GET(String serviceName) throws IOException {
		String qPath = "/license/windows/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhWindows.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/windows/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The name of your Windows license
	 */
	public void serviceName_PUT(String serviceName, OvhWindows body) throws IOException {
		String qPath = "/license/windows/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /license/windows/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The name of your Windows license
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/license/windows/{serviceName}/confirmTermination";
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
	 * options attached to this license
	 *
	 * REST: GET /license/windows/{serviceName}/option
	 * @param serviceName [required] The name of your Windows license
	 */
	public ArrayList<OvhOptionLabel> serviceName_option_GET(String serviceName) throws IOException {
		String qPath = "/license/windows/{serviceName}/option";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhOptionLabel>> t2 = new TypeReference<ArrayList<OvhOptionLabel>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/windows/{serviceName}/option/{label}
	 * @param serviceName [required] The name of your Windows license
	 * @param label [required] This option designation
	 */
	public OvhOption serviceName_option_label_GET(String serviceName, net.minidev.ovh.api.license.OvhOptionLabel label) throws IOException {
		String qPath = "/license/windows/{serviceName}/option/{label}";
		StringBuilder sb = path(qPath, serviceName, label);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOption.class);
	}

	/**
	 * release this Option
	 *
	 * REST: DELETE /license/windows/{serviceName}/option/{label}
	 * @param serviceName [required] The name of your Windows license
	 * @param label [required] This option designation
	 */
	public OvhTask serviceName_option_label_DELETE(String serviceName, net.minidev.ovh.api.license.OvhOptionLabel label) throws IOException {
		String qPath = "/license/windows/{serviceName}/option/{label}";
		StringBuilder sb = path(qPath, serviceName, label);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * tasks linked to this license
	 *
	 * REST: GET /license/windows/{serviceName}/tasks
	 * @param action [required] Filter the value of action property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The name of your Windows license
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, OvhActionType action, OvhTaskStateEnum status) throws IOException {
		String qPath = "/license/windows/{serviceName}/tasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "action", action);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/windows/{serviceName}/tasks/{taskId}
	 * @param serviceName [required] The name of your Windows license
	 * @param taskId [required] This Task id
	 */
	public OvhTask serviceName_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/license/windows/{serviceName}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /license/windows
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/license/windows";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<String>> t4 = new TypeReference<ArrayList<String>>() {};
}
