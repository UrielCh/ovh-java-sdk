package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.license.OvhActionType;
import net.minidev.ovh.api.license.OvhChangeIpStatus;
import net.minidev.ovh.api.license.OvhOption;
import net.minidev.ovh.api.license.OvhOptionLabel;
import net.minidev.ovh.api.license.OvhPleskOrderConfiguration;
import net.minidev.ovh.api.license.OvhTask;
import net.minidev.ovh.api.license.OvhTaskStateEnum;
import net.minidev.ovh.api.license.plesk.OvhPlesk;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/license/plesk
 * version:1.0
 */
public class ApiOvhLicenseplesk extends ApiOvhBase {
	public ApiOvhLicenseplesk(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get the orderable Plesk versions and their associated compatibilities
	 *
	 * REST: GET /license/plesk/orderableVersions
	 * @param ip [required] Your license Ip
	 */
	public ArrayList<OvhPleskOrderConfiguration> orderableVersions_GET(String ip) throws IOException {
		String qPath = "/license/plesk/orderableVersions";
		StringBuilder sb = path(qPath);
		query(sb, "ip", ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhPleskOrderConfiguration>> t1 = new TypeReference<ArrayList<OvhPleskOrderConfiguration>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /license/plesk
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/license/plesk";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/plesk/{serviceName}
	 * @param serviceName [required] The name of your Plesk license
	 */
	public OvhPlesk serviceName_GET(String serviceName) throws IOException {
		String qPath = "/license/plesk/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPlesk.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/plesk/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The name of your Plesk license
	 */
	public void serviceName_PUT(String serviceName, OvhPlesk body) throws IOException {
		String qPath = "/license/plesk/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * tasks linked to this license
	 *
	 * REST: GET /license/plesk/{serviceName}/tasks
	 * @param action [required] Filter the value of action property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The name of your Plesk license
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, OvhActionType action, OvhTaskStateEnum status) throws IOException {
		String qPath = "/license/plesk/{serviceName}/tasks";
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
	 * REST: GET /license/plesk/{serviceName}/tasks/{taskId}
	 * @param serviceName [required] The name of your Plesk license
	 * @param taskId [required] This Task id
	 */
	public OvhTask serviceName_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/license/plesk/{serviceName}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/plesk/{serviceName}/option/{label}
	 * @param serviceName [required] The name of your Plesk license
	 * @param label [required] This option designation
	 */
	public OvhOption serviceName_option_label_GET(String serviceName, net.minidev.ovh.api.license.OvhOptionLabel label) throws IOException {
		String qPath = "/license/plesk/{serviceName}/option/{label}";
		StringBuilder sb = path(qPath, serviceName, label);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOption.class);
	}

	/**
	 * release this Option
	 *
	 * REST: DELETE /license/plesk/{serviceName}/option/{label}
	 * @param serviceName [required] The name of your Plesk license
	 * @param label [required] This option designation
	 */
	public OvhTask serviceName_option_label_DELETE(String serviceName, net.minidev.ovh.api.license.OvhOptionLabel label) throws IOException {
		String qPath = "/license/plesk/{serviceName}/option/{label}";
		StringBuilder sb = path(qPath, serviceName, label);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * options attached to this license
	 *
	 * REST: GET /license/plesk/{serviceName}/option
	 * @param serviceName [required] The name of your Plesk license
	 */
	public ArrayList<OvhOptionLabel> serviceName_option_GET(String serviceName) throws IOException {
		String qPath = "/license/plesk/{serviceName}/option";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhOptionLabel>> t4 = new TypeReference<ArrayList<OvhOptionLabel>>() {};

	/**
	 * Returns an array of ips where the license can be moved to
	 *
	 * REST: GET /license/plesk/{serviceName}/allowedDestinationIp
	 * @param serviceName [required] The name of your Plesk license
	 */
	public ArrayList<String> serviceName_allowedDestinationIp_GET(String serviceName) throws IOException {
		String qPath = "/license/plesk/{serviceName}/allowedDestinationIp";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /license/plesk/{serviceName}/confirmTermination
	 * @param futureUse What next after your termination request
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The name of your Plesk license
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/license/plesk/{serviceName}/confirmTermination";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "futureUse", futureUse);
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /license/plesk/{serviceName}/terminate
	 * @param serviceName [required] The name of your Plesk license
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/license/plesk/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/plesk/{serviceName}/serviceInfos
	 * @param serviceName [required] The name of your Plesk license
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/license/plesk/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/plesk/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The name of your Plesk license
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/license/plesk/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Will tell if the ip can accept the license
	 *
	 * REST: GET /license/plesk/{serviceName}/canLicenseBeMovedTo
	 * @param destinationIp [required] The Ip on which you want to move this license
	 * @param serviceName [required] The name of your Plesk license
	 */
	public OvhChangeIpStatus serviceName_canLicenseBeMovedTo_GET(String serviceName, String destinationIp) throws IOException {
		String qPath = "/license/plesk/{serviceName}/canLicenseBeMovedTo";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "destinationIp", destinationIp);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhChangeIpStatus.class);
	}

	/**
	 * Move this license to another Ip
	 *
	 * REST: POST /license/plesk/{serviceName}/changeIp
	 * @param destinationIp [required] The Ip on which you want to move this license
	 * @param serviceName [required] The name of your Plesk license
	 */
	public OvhTask serviceName_changeIp_POST(String serviceName, String destinationIp) throws IOException {
		String qPath = "/license/plesk/{serviceName}/changeIp";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destinationIp", destinationIp);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}
}
