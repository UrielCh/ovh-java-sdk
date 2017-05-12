package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.horizonview.OvhCustomerUser;
import net.minidev.ovh.api.horizonview.OvhDatacenter;
import net.minidev.ovh.api.horizonview.OvhDedicatedHorizon;
import net.minidev.ovh.api.horizonview.OvhPool;
import net.minidev.ovh.api.horizonview.OvhTask;
import net.minidev.ovh.api.horizonview.OvhTaskStateEnum;
import net.minidev.ovh.api.horizonview.OvhUser;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/horizonView
 * version:1.0
 */
public class ApiOvhHorizonView extends ApiOvhBase {
	public ApiOvhHorizonView(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /horizonView/{serviceName}/serviceInfos
	 * @param serviceName [required] Domain of the service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /horizonView/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Domain of the service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/horizonView/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /horizonView/{serviceName}/dedicatedHorizon
	 * @param serviceName [required] Domain of the service
	 */
	public OvhDedicatedHorizon serviceName_dedicatedHorizon_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDedicatedHorizon.class);
	}

	/**
	 * Account to access to your pool
	 *
	 * REST: GET /horizonView/{serviceName}/dedicatedHorizon/customerUser
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_dedicatedHorizon_customerUser_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/customerUser";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Create a new customer user
	 *
	 * REST: POST /horizonView/{serviceName}/dedicatedHorizon/customerUser
	 * @param email [required] Email for your new user in Active diRectory.
	 * @param password [required] New password for this Horizon View user. It must fits your HaaS password policy. If this field is empty, a random password will be generated and sent to your  email.
	 * @param username [required] Username for your new user in Active Directory.
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhTask> serviceName_dedicatedHorizon_customerUser_POST(String serviceName, String email, String password, String username) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/customerUser";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "password", password);
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhTask>> t2 = new TypeReference<ArrayList<OvhTask>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /horizonView/{serviceName}/dedicatedHorizon/customerUser/{username}
	 * @param serviceName [required] Domain of the service
	 * @param username [required] Customer username of your HaaS User
	 */
	public OvhCustomerUser serviceName_dedicatedHorizon_customerUser_username_GET(String serviceName, String username) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/customerUser/{username}";
		StringBuilder sb = path(qPath, serviceName, username);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCustomerUser.class);
	}

	/**
	 * Delete this Customer User
	 *
	 * REST: DELETE /horizonView/{serviceName}/dedicatedHorizon/customerUser/{username}
	 * @param serviceName [required] Domain of the service
	 * @param username [required] Customer username of your HaaS User
	 */
	public ArrayList<OvhTask> serviceName_dedicatedHorizon_customerUser_username_DELETE(String serviceName, String username) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/customerUser/{username}";
		StringBuilder sb = path(qPath, serviceName, username);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Change Horizon View Customer  user password
	 *
	 * REST: POST /horizonView/{serviceName}/dedicatedHorizon/customerUser/{username}/changePassword
	 * @param password [required] New password for this Horizon View user. It must fits your HaaS password policy. If this field is empty, a random password will be generated and sent to you by email.
	 * @param serviceName [required] Domain of the service
	 * @param username [required] Customer username of your HaaS User
	 */
	public OvhTask serviceName_dedicatedHorizon_customerUser_username_changePassword_POST(String serviceName, String username, String password) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/customerUser/{username}/changePassword";
		StringBuilder sb = path(qPath, serviceName, username);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /horizonView/{serviceName}/dedicatedHorizon/user
	 * @param serviceName [required] Domain of the service
	 */
	public OvhUser serviceName_dedicatedHorizon_user_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/user";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Change horizon view user properties
	 *
	 * REST: POST /horizonView/{serviceName}/dedicatedHorizon/user/changeProperties
	 * @param email [required] Change email of your admin user
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_dedicatedHorizon_user_changeProperties_POST(String serviceName, String email) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/user/changeProperties";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change Horizon View user password
	 *
	 * REST: POST /horizonView/{serviceName}/dedicatedHorizon/user/changePassword
	 * @param password [required] New password for this Horizon View user. It must fits your HaaS password policy. If this field is empty, a random password will be generated and sent to you by email.
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_dedicatedHorizon_user_changePassword_POST(String serviceName, String password) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/user/changePassword";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated with this Dedicated Horizon
	 *
	 * REST: GET /horizonView/{serviceName}/dedicatedHorizon/task
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_dedicatedHorizon_task_GET(String serviceName, OvhTaskStateEnum state) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /horizonView/{serviceName}/dedicatedHorizon/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_dedicatedHorizon_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /horizonView/{serviceName}
	 * @param serviceName [required] Domain of the service
	 */
	public OvhDatacenter serviceName_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDatacenter.class);
	}

	/**
	 * Pool associated with this Datacenter
	 *
	 * REST: GET /horizonView/{serviceName}/accessPoint
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_accessPoint_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/accessPoint";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Add new access point to create a new network
	 *
	 * REST: POST /horizonView/{serviceName}/accessPoint
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhTask> serviceName_accessPoint_POST(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/accessPoint";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /horizonView/{serviceName}/accessPoint/{accessPointId}
	 * @param serviceName [required] Domain of the service
	 * @param accessPointId [required] Pool id
	 */
	public OvhPool serviceName_accessPoint_accessPointId_GET(String serviceName, Long accessPointId) throws IOException {
		String qPath = "/horizonView/{serviceName}/accessPoint/{accessPointId}";
		StringBuilder sb = path(qPath, serviceName, accessPointId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPool.class);
	}

	/**
	 * Delete this access point
	 *
	 * REST: DELETE /horizonView/{serviceName}/accessPoint/{accessPointId}
	 * @param serviceName [required] Domain of the service
	 * @param accessPointId [required] Pool id
	 */
	public ArrayList<OvhTask> serviceName_accessPoint_accessPointId_DELETE(String serviceName, Long accessPointId) throws IOException {
		String qPath = "/horizonView/{serviceName}/accessPoint/{accessPointId}";
		StringBuilder sb = path(qPath, serviceName, accessPointId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /horizonView/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] Domain of the service
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/horizonView/{serviceName}/confirmTermination";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /horizonView/{serviceName}/terminate
	 * @param serviceName [required] Domain of the service
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /horizonView
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/horizonView";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
