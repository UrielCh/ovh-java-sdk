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
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/deskaas
 * version:1.0
 */
public class ApiOvhDeskaas extends ApiOvhBase {
	public ApiOvhDeskaas(ApiOvhCore core) {
		super(core);
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
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "newReference", newReference);
		addBody(o, "planCode", planCode);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the current password policy for your Desktop As A Service
	 *
	 * REST: GET /deskaas/{serviceName}/passwordPolicy
	 * @param serviceName [required] Domain of the service
	 */
	public OvhPasswordPolicy serviceName_passwordPolicy_GET(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/passwordPolicy";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPasswordPolicy.class);
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
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /deskaas/{serviceName}/changeContact
	 * @param contactAdmin [required] The contact to set as admin contact
	 * @param contactTech [required] The contact to set as tech contact
	 * @param contactBilling [required] The contact to set as billing contact
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/deskaas/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}

	/**
	 * Reboot the Operating system of the Cloud Desktop.
	 *
	 * REST: POST /deskaas/{serviceName}/reboot
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_reboot_POST(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/reboot";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /deskaas/{serviceName}
	 * @param serviceName [required] Domain of the service
	 */
	public OvhDeskaas serviceName_GET(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDeskaas.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /deskaas/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] Domain of the service
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/deskaas/{serviceName}/confirmTermination";
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
	 * Change the Virtual Desktop alias
	 *
	 * REST: POST /deskaas/{serviceName}/changeAlias
	 * @param alias [required] New alias of Desktop As A Service
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_changeAlias_POST(String serviceName, String alias) throws IOException {
		String qPath = "/deskaas/{serviceName}/changeAlias";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "alias", alias);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Refresh the Operating system of the Desktop As A Service. All your personnal data are kept.
	 *
	 * REST: POST /deskaas/{serviceName}/refresh
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_refresh_POST(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/refresh";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /deskaas/{serviceName}/serviceInfos
	 * @param serviceName [required] Domain of the service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /deskaas/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Domain of the service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/deskaas/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * New console access
	 *
	 * REST: POST /deskaas/{serviceName}/console
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_console_POST(String serviceName) throws IOException {
		String qPath = "/deskaas/{serviceName}/console";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /deskaas
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/deskaas";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};
}
