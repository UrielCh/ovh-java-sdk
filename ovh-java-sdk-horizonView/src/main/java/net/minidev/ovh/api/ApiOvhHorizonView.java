package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.horizonview.OvhCustomerUser;
import net.minidev.ovh.api.horizonview.OvhDedicatedHorizon;
import net.minidev.ovh.api.horizonview.OvhHost;
import net.minidev.ovh.api.horizonview.OvhPool;
import net.minidev.ovh.api.horizonview.OvhStorage;
import net.minidev.ovh.api.horizonview.OvhTask;
import net.minidev.ovh.api.horizonview.OvhTaskStateEnum;
import net.minidev.ovh.api.horizonview.OvhUser;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
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
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /horizonView/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] Domain of the service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/horizonView/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /horizonView/{serviceName}
	 * @param serviceName [required] Domain of the service
	 */
	public OvhDedicatedHorizon serviceName_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDedicatedHorizon.class);
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
	 * REST: POST /horizonView/{serviceName}/terminate
	 * @param serviceName [required] Domain of the service
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Tasks associated with this Dedicated Horizon
	 * 
	 * REST: GET /horizonView/{serviceName}/task
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskStateEnum state) throws IOException {
		String qPath = "/horizonView/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /horizonView/{serviceName}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/horizonView/{serviceName}/task/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Your Cloud Desktop Infrastructure hosts
	 * 
	 * REST: GET /horizonView/{serviceName}/host
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_host_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/host";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /horizonView/{serviceName}/host/{id}
	 * @param serviceName [required] Domain of the service
	 * @param id [required] Host ids
	 */
	public OvhHost serviceName_host_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/horizonView/{serviceName}/host/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhHost.class);
	}

	/**
	 * Delete this host
	 * 
	 * REST: DELETE /horizonView/{serviceName}/host/{id}
	 * @param serviceName [required] Domain of the service
	 * @param id [required] Host ids
	 */
	public ArrayList<OvhTask> serviceName_host_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/horizonView/{serviceName}/host/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhTask>> t2 = new TypeReference<ArrayList<OvhTask>>() {};

	/**
	 * Pool associated with this Dedicated Horizon
	 * 
	 * REST: GET /horizonView/{serviceName}/accessPoint
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_accessPoint_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/accessPoint";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add new access point to create a new network
	 * 
	 * REST: POST /horizonView/{serviceName}/accessPoint
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhTask> serviceName_accessPoint_POST(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/accessPoint";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{accessPointId}", accessPointId.toString());
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{accessPointId}", accessPointId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Account to access to your pool
	 * 
	 * REST: GET /horizonView/{serviceName}/customerUser
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_customerUser_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/customerUser";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Create a new customer user 
	 * 
	 * REST: POST /horizonView/{serviceName}/customerUser
	 * @param email [required] Email for your new user in Active diRectory.
	 * @param password [required] New password for this Horizon View user. It must fits your HaaS password policy. If this field is empty, a random password will be generated and sent to your  email.
	 * @param username [required] Username for your new user in Active Directory.
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhTask> serviceName_customerUser_POST(String serviceName, String email, String password, String username) throws IOException {
		String qPath = "/horizonView/{serviceName}/customerUser";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "password", password);
		addBody(o, "username", username);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /horizonView/{serviceName}/customerUser/{username}
	 * @param serviceName [required] Domain of the service
	 * @param username [required] Customer username of your HaaS User
	 */
	public OvhCustomerUser serviceName_customerUser_username_GET(String serviceName, String username) throws IOException {
		String qPath = "/horizonView/{serviceName}/customerUser/{username}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{username}", username);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCustomerUser.class);
	}

	/**
	 * Delete this Customer User
	 * 
	 * REST: DELETE /horizonView/{serviceName}/customerUser/{username}
	 * @param serviceName [required] Domain of the service
	 * @param username [required] Customer username of your HaaS User
	 */
	public ArrayList<OvhTask> serviceName_customerUser_username_DELETE(String serviceName, String username) throws IOException {
		String qPath = "/horizonView/{serviceName}/customerUser/{username}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{username}", username);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Change Horizon View Customer  user password
	 * 
	 * REST: POST /horizonView/{serviceName}/customerUser/{username}/changePassword
	 * @param password [required] New password for this Horizon View user. It must fits your HaaS password policy. If this field is empty, a random password will be generated and sent to you by email.
	 * @param serviceName [required] Domain of the service
	 * @param username [required] Customer username of your HaaS User
	 */
	public OvhTask serviceName_customerUser_username_changePassword_POST(String serviceName, String username, String password) throws IOException {
		String qPath = "/horizonView/{serviceName}/customerUser/{username}/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{username}", username);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /horizonView/{serviceName}/user
	 * @param serviceName [required] Domain of the service
	 */
	public OvhUser serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Change horizon view user properties
	 * 
	 * REST: POST /horizonView/{serviceName}/user/changeProperties
	 * @param email [required] Change email of your admin user
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_user_changeProperties_POST(String serviceName, String email) throws IOException {
		String qPath = "/horizonView/{serviceName}/user/changeProperties";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change Horizon View user password
	 * 
	 * REST: POST /horizonView/{serviceName}/user/changePassword
	 * @param password [required] New password for this Horizon View user. It must fits your HaaS password policy. If this field is empty, a random password will be generated and sent to you by email.
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_user_changePassword_POST(String serviceName, String password) throws IOException {
		String qPath = "/horizonView/{serviceName}/user/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Your Cloud Desktop Infrastructure storages
	 * 
	 * REST: GET /horizonView/{serviceName}/storage
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_storage_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/storage";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /horizonView/{serviceName}/storage/{id}
	 * @param serviceName [required] Domain of the service
	 * @param id [required] Storage ids
	 */
	public OvhStorage serviceName_storage_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/horizonView/{serviceName}/storage/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhStorage.class);
	}

	/**
	 * Delete this storage
	 * 
	 * REST: DELETE /horizonView/{serviceName}/storage/{id}
	 * @param serviceName [required] Domain of the service
	 * @param id [required] Storage ids
	 */
	public ArrayList<OvhTask> serviceName_storage_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/horizonView/{serviceName}/storage/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /horizonView
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/horizonView";
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
}
