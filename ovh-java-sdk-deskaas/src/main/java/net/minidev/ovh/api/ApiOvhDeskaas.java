package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.deskaas.OvhDeskaas;
import net.minidev.ovh.api.deskaas.OvhPasswordPolicy;
import net.minidev.ovh.api.deskaas.OvhTask;
import net.minidev.ovh.api.deskaas.OvhTaskStateEnum;
import net.minidev.ovh.api.deskaas.OvhUser;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/deskaas
 * version:1.0
 */
public class ApiOvhDeskaas extends ApiOvhBase {
	public ApiOvhDeskaas(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /deskaas/{serviceName}/serviceInfos
	 * @param serviceName [required] Domain of the service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /deskaas/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] Domain of the service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/deskaas/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get the current password policy for your Desktop As A Service
	 * 
	 * REST: GET /deskaas/{serviceName}/passwordPolicy
	 * @param serviceName [required] Domain of the service
	 */
	public OvhPasswordPolicy serviceName_passwordPolicy_GET(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/passwordPolicy";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPasswordPolicy.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /deskaas/{serviceName}
	 * @param serviceName [required] Domain of the service
	 */
	public OvhDeskaas serviceName_GET(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDeskaas.class);
	}

	/**
	 * Reboot the Operating system of the Cloud Desktop.
	 * 
	 * REST: POST /deskaas/{serviceName}/reboot
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_reboot_POST(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/reboot";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * New console access
	 * 
	 * REST: POST /deskaas/{serviceName}/console
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_console_POST(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/console";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Terminate your service
	 * 
	 * REST: POST /deskaas/{serviceName}/terminate
	 * @param serviceName [required] Domain of the service
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /deskaas/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] Domain of the service
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/deskaas/{serviceName}/confirmTermination";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Tasks associated with this Desktop As A Service
	 * 
	 * REST: GET /deskaas/{serviceName}/task
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskStateEnum state) throws IOException {
		String qPath = "/deskaas/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /deskaas/{serviceName}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/deskaas/{serviceName}/task/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /deskaas/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/deskaas/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t1);
	}

	/**
	 * Refresh the Operating system of the Desktop As A Service. All your personnal data are kept.
	 * 
	 * REST: POST /deskaas/{serviceName}/refresh
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_refresh_POST(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/refresh";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /deskaas/{serviceName}/user
	 * @param serviceName [required] Domain of the service
	 */
	public OvhUser serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Change Desktop As A Service user properties
	 * 
	 * REST: POST /deskaas/{serviceName}/user/changeProperties
	 * @param email [required]
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_user_changeProperties_POST(String serviceName, String email) throws IOException {
		String qPath = "/deskaas/{serviceName}/user/changeProperties";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change Desktop As A Service user password
	 * 
	 * REST: POST /deskaas/{serviceName}/user/changePassword
	 * @param password [required] New password for this Desktop As A Service user. It must fits your Desktop As A Service password policy. If this field is empty, a random password will be generated and sent by email.
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_user_changePassword_POST(String serviceName, String password) throws IOException {
		String qPath = "/deskaas/{serviceName}/user/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated with this User
	 * 
	 * REST: GET /deskaas/{serviceName}/user/task
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_user_task_GET(String serviceName, OvhTaskStateEnum state) throws IOException {
		String qPath = "/deskaas/{serviceName}/user/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /deskaas/{serviceName}/user/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_user_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/deskaas/{serviceName}/user/task/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change the Virtual Desktop alias
	 * 
	 * REST: POST /deskaas/{serviceName}/changeAlias
	 * @param alias [required] New alias of Desktop As A Service
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_changeAlias_POST(String serviceName, String alias) throws IOException {
		String qPath = "/deskaas/{serviceName}/changeAlias";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "alias", alias);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Upgrading the Desktop As A Service to another profile. The Virtual Desktop will not be available during upgrade and has to be restarted. You cannot downgrade a Virtual Desktop
	 * 
	 * REST: POST /deskaas/{serviceName}/upgrade
	 * @param newReference [required] New reference of Desktop As A Service
	 * @param planCode [required] New plan of Desktop As A Service
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_upgrade_POST(String serviceName, String newReference, String planCode) throws IOException {
		String qPath = "/deskaas/{serviceName}/upgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "newReference", newReference);
		addBody(o, "planCode", planCode);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /deskaas
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/deskaas";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};
}
