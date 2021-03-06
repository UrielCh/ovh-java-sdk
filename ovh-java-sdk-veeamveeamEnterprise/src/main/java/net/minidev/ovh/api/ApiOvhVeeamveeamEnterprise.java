package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.veeam.veeamenterprise.OvhAccount;
import net.minidev.ovh.api.veeam.veeamenterprise.OvhTask;
import net.minidev.ovh.api.veeamenterprise.OvhTaskStateEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/veeam/veeamEnterprise
 * version:1.0
 */
public class ApiOvhVeeamveeamEnterprise extends ApiOvhBase {
	public ApiOvhVeeamveeamEnterprise(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Register Veeam Backup Server to Veeam Enterprise
	 *
	 * REST: POST /veeam/veeamEnterprise/{serviceName}/register
	 * @param ip [required] Your Veeam Backup And Replication Server IP
	 * @param port [required] Your Veeam Backup And Replication Server Port
	 * @param username [required] Your Veeam Backup And Replication username
	 * @param password [required] Your Veeam Backup And Replication associated password
	 * @param serviceName [required] Domain of the service
	 *
	 * API beta
	 */
	public ArrayList<OvhTask> serviceName_register_POST(String serviceName, String ip, String password, Long port, String username) throws IOException {
		String qPath = "/veeam/veeamEnterprise/{serviceName}/register";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		addBody(o, "password", password);
		addBody(o, "port", port);
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhTask>> t1 = new TypeReference<ArrayList<OvhTask>>() {};

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /veeam/veeamEnterprise/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] Domain of the service
	 *
	 * API beta
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/veeam/veeamEnterprise/{serviceName}/confirmTermination";
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
	 * Terminate your service
	 *
	 * REST: POST /veeam/veeamEnterprise/{serviceName}/terminate
	 * @param serviceName [required] Domain of the service
	 *
	 * API beta
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/veeam/veeamEnterprise/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Update Veeam enterprise configuration
	 *
	 * REST: POST /veeam/veeamEnterprise/{serviceName}/update
	 * @param username [required] Your Veeam Backup And Replication username
	 * @param password [required] Your Veeam Backup And Replication associated password
	 * @param ip [required] Your Veeam Backup And Replication Server IP
	 * @param port [required] Your Veeam Backup And Replication Server Port
	 * @param serviceName [required] Domain of the service
	 *
	 * API beta
	 */
	public ArrayList<OvhTask> serviceName_update_POST(String serviceName, String ip, String password, Long port, String username) throws IOException {
		String qPath = "/veeam/veeamEnterprise/{serviceName}/update";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		addBody(o, "password", password);
		addBody(o, "port", port);
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /veeam/veeamEnterprise/{serviceName}/serviceInfos
	 * @param serviceName [required] Domain of the service
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/veeam/veeamEnterprise/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /veeam/veeamEnterprise/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Domain of the service
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/veeam/veeamEnterprise/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Tasks associated with Veeam Enterprise
	 *
	 * REST: GET /veeam/veeamEnterprise/{serviceName}/task
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/veeam/veeamEnterprise/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /veeam/veeamEnterprise/{serviceName}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param taskId [required] Task id
	 *
	 * API beta
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/veeam/veeamEnterprise/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /veeam/veeamEnterprise/{serviceName}
	 * @param serviceName [required] Domain of the service
	 *
	 * API beta
	 */
	public OvhAccount serviceName_GET(String serviceName) throws IOException {
		String qPath = "/veeam/veeamEnterprise/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /veeam/veeamEnterprise
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/veeam/veeamEnterprise";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};
}
