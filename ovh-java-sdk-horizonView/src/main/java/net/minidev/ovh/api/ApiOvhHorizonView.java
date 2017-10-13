package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.horizonview.OvhCustomerNetwork;
import net.minidev.ovh.api.horizonview.OvhCustomerUser;
import net.minidev.ovh.api.horizonview.OvhDatacenter;
import net.minidev.ovh.api.horizonview.OvhDedicatedHorizon;
import net.minidev.ovh.api.horizonview.OvhDomainTrust;
import net.minidev.ovh.api.horizonview.OvhPool;
import net.minidev.ovh.api.horizonview.OvhPoolType;
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
	 * Disable the View Storage Accelerator option on VCenter
	 *
	 * REST: POST /horizonView/{serviceName}/dedicatedHorizon/disableStorageAccelerator
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_dedicatedHorizon_disableStorageAccelerator_POST(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/disableStorageAccelerator";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
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
	 * Enable the View Storage Accelerator option on VCenter
	 *
	 * REST: POST /horizonView/{serviceName}/dedicatedHorizon/enableStorageAccelerator
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_dedicatedHorizon_enableStorageAccelerator_POST(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/dedicatedHorizon/enableStorageAccelerator";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * You can reach from the Desktops your private network
	 *
	 * REST: GET /horizonView/{serviceName}/customerNetwork
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_customerNetwork_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/customerNetwork";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Add a new network
	 *
	 * REST: POST /horizonView/{serviceName}/customerNetwork
	 * @param network [required] The private network you want to reach.
	 * @param name [required] Name your network
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhTask> serviceName_customerNetwork_POST(String serviceName, String network, String name) throws IOException {
		String qPath = "/horizonView/{serviceName}/customerNetwork";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "network", network);
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /horizonView/{serviceName}/customerNetwork/{customerNetworkId}
	 * @param serviceName [required] Domain of the service
	 * @param customerNetworkId [required] Customer Network id
	 */
	public OvhCustomerNetwork serviceName_customerNetwork_customerNetworkId_GET(String serviceName, Long customerNetworkId) throws IOException {
		String qPath = "/horizonView/{serviceName}/customerNetwork/{customerNetworkId}";
		StringBuilder sb = path(qPath, serviceName, customerNetworkId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCustomerNetwork.class);
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
	 * @param vrouterPoolPublicIp [required] You need to use a public Ip if you want to deploy a public pool.
	 * @param privateVlan [required] You can customize your pool by choosing its private Vlan ID. (smaller than 4095)
	 * @param privateBlock [required] You can customize your pool by choosing the private network (Ex : 10.0.0.0/16)
	 * @param poolType [required] The type of pool you want to deploy.
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhTask> serviceName_accessPoint_POST(String serviceName, String vrouterPoolPublicIp, Long privateVlan, String privateBlock, OvhPoolType poolType) throws IOException {
		String qPath = "/horizonView/{serviceName}/accessPoint";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "vrouterPoolPublicIp", vrouterPoolPublicIp);
		addBody(o, "privateVlan", privateVlan);
		addBody(o, "privateBlock", privateBlock);
		addBody(o, "poolType", poolType);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * Link an existing private network to your Access Point
	 *
	 * REST: POST /horizonView/{serviceName}/accessPoint/{accessPointId}/customerNetwork
	 * @param network [required] The customer network you want to route on your pool
	 * @param serviceName [required] Domain of the service
	 * @param accessPointId [required] Pool id
	 */
	public OvhTask serviceName_accessPoint_accessPointId_customerNetwork_POST(String serviceName, Long accessPointId, String network) throws IOException {
		String qPath = "/horizonView/{serviceName}/accessPoint/{accessPointId}/customerNetwork";
		StringBuilder sb = path(qPath, serviceName, accessPointId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "network", network);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List private networks linked to your Access Point
	 *
	 * REST: GET /horizonView/{serviceName}/accessPoint/{accessPointId}/customerNetwork
	 * @param serviceName [required] Domain of the service
	 * @param accessPointId [required] Pool id
	 */
	public ArrayList<String> serviceName_accessPoint_accessPointId_customerNetwork_GET(String serviceName, Long accessPointId) throws IOException {
		String qPath = "/horizonView/{serviceName}/accessPoint/{accessPointId}/customerNetwork";
		StringBuilder sb = path(qPath, serviceName, accessPointId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
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
	 * Get this object properties
	 *
	 * REST: GET /horizonView/{serviceName}/domainTrust/{domainTrustId}
	 * @param serviceName [required] Domain of the service
	 * @param domainTrustId [required] Domain trust id
	 */
	public OvhDomainTrust serviceName_domainTrust_domainTrustId_GET(String serviceName, Long domainTrustId) throws IOException {
		String qPath = "/horizonView/{serviceName}/domainTrust/{domainTrustId}";
		StringBuilder sb = path(qPath, serviceName, domainTrustId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomainTrust.class);
	}

	/**
	 * Change Horizon View user password
	 *
	 * REST: POST /horizonView/{serviceName}/domainTrust/{domainTrustId}/createTrust
	 * @param serviceAccountPassword [required] Password of the horizonUI service account
	 * @param passphrase [required] Shared passphrase to create the Active Directory trust
	 * @param serviceName [required] Domain of the service
	 * @param domainTrustId [required] Domain trust id
	 */
	public OvhTask serviceName_domainTrust_domainTrustId_createTrust_POST(String serviceName, Long domainTrustId, String serviceAccountPassword, String passphrase) throws IOException {
		String qPath = "/horizonView/{serviceName}/domainTrust/{domainTrustId}/createTrust";
		StringBuilder sb = path(qPath, serviceName, domainTrustId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "serviceAccountPassword", serviceAccountPassword);
		addBody(o, "passphrase", passphrase);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Add a Domain Controller for this domain.
	 *
	 * REST: POST /horizonView/{serviceName}/domainTrust/{domainTrustId}/addDomainController
	 * @param domain [required] Name of your Domain Controller (example : domain.local)
	 * @param domainControllerIp [required] IP of your Domain Controller
	 * @param serviceName [required] Domain of the service
	 * @param domainTrustId [required] Domain trust id
	 */
	public OvhTask serviceName_domainTrust_domainTrustId_addDomainController_POST(String serviceName, Long domainTrustId, String domain, String domainControllerIp) throws IOException {
		String qPath = "/horizonView/{serviceName}/domainTrust/{domainTrustId}/addDomainController";
		StringBuilder sb = path(qPath, serviceName, domainTrustId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "domainControllerIp", domainControllerIp);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Add a child domain for this domain.
	 *
	 * REST: POST /horizonView/{serviceName}/domainTrust/{domainTrustId}/addChildDomain
	 * @param activeDirectoryIP [required] IP of your Active Directory
	 * @param domain [required] Name of your private domain
	 * @param passphrase [required] Shared passphrase to create the Active Directory trust
	 * @param serviceName [required] Domain of the service
	 * @param domainTrustId [required] Domain trust id
	 */
	public OvhTask serviceName_domainTrust_domainTrustId_addChildDomain_POST(String serviceName, Long domainTrustId, String activeDirectoryIP, String domain, String passphrase) throws IOException {
		String qPath = "/horizonView/{serviceName}/domainTrust/{domainTrustId}/addChildDomain";
		StringBuilder sb = path(qPath, serviceName, domainTrustId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "activeDirectoryIP", activeDirectoryIP);
		addBody(o, "domain", domain);
		addBody(o, "passphrase", passphrase);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Add a domain user to add your desktop in your Active Directory
	 *
	 * REST: POST /horizonView/{serviceName}/domainTrust/{domainTrustId}/addDomainUserOnComposer
	 * @param password [required] Password of the user
	 * @param domain [required] Name of your Domain (example : domain.local)
	 * @param username [required] Name of the User who is going to add the Desktop in your Active Directory
	 * @param serviceName [required] Domain of the service
	 * @param domainTrustId [required] Domain trust id
	 */
	public OvhTask serviceName_domainTrust_domainTrustId_addDomainUserOnComposer_POST(String serviceName, Long domainTrustId, String password, String domain, String username) throws IOException {
		String qPath = "/horizonView/{serviceName}/domainTrust/{domainTrustId}/addDomainUserOnComposer";
		StringBuilder sb = path(qPath, serviceName, domainTrustId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "domain", domain);
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List all Active Directories linked to your CDI Active Directory
	 *
	 * REST: GET /horizonView/{serviceName}/domainTrust
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_domainTrust_GET(String serviceName) throws IOException {
		String qPath = "/horizonView/{serviceName}/domainTrust";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Link your Active Directory to your CDI Active Directory
	 *
	 * REST: POST /horizonView/{serviceName}/domainTrust
	 * @param activeDirectoryIP [required] IP of your Active Directory
	 * @param domain [required] Domain of your active directory (for example domain.local)
	 * @param dns1 [required] IP of your first DNS
	 * @param dns2 [required] IP of your second DNS
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhTask> serviceName_domainTrust_POST(String serviceName, String activeDirectoryIP, String domain, String dns1, String dns2) throws IOException {
		String qPath = "/horizonView/{serviceName}/domainTrust";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "activeDirectoryIP", activeDirectoryIP);
		addBody(o, "domain", domain);
		addBody(o, "dns1", dns1);
		addBody(o, "dns2", dns2);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
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
