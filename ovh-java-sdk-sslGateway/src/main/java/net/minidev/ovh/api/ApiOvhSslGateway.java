package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.sslgateway.OvhDomain;
import net.minidev.ovh.api.sslgateway.OvhEligibilityStatus;
import net.minidev.ovh.api.sslgateway.OvhNatIps;
import net.minidev.ovh.api.sslgateway.OvhServer;
import net.minidev.ovh.api.sslgateway.OvhSslGateway;
import net.minidev.ovh.api.sslgateway.OvhTask;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/sslGateway
 * version:1.0
 */
public class ApiOvhSslGateway extends ApiOvhBase {
	public ApiOvhSslGateway(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /sslGateway/{serviceName}/changeContact
	 * @param contactAdmin [required] The contact to set as admin contact
	 * @param contactTech [required] The contact to set as tech contact
	 * @param contactBilling [required] The contact to set as billing contact
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/sslGateway/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /sslGateway/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sslGateway/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/sslGateway/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Renew your SSL certificates
	 *
	 * REST: POST /sslGateway/{serviceName}/renewCertificate
	 * @param domain [required] Domain on which you want to renew certificate
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_renewCertificate_POST(String serviceName, String domain) throws IOException {
		String qPath = "/sslGateway/{serviceName}/renewCertificate";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Terminate your service
	 *
	 * REST: POST /sslGateway/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sslGateway/{serviceName}/domain/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your domain
	 *
	 * API beta
	 */
	public OvhDomain serviceName_domain_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/domain/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Detach a domain from your SSL Gateway
	 *
	 * REST: DELETE /sslGateway/{serviceName}/domain/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your domain
	 *
	 * API beta
	 */
	public void serviceName_domain_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/domain/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Domains attached to your SSL Gateway
	 *
	 * REST: GET /sslGateway/{serviceName}/domain
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_domain_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/domain";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Attach a new domain to your SSL Gateway
	 *
	 * REST: POST /sslGateway/{serviceName}/domain
	 * @param domain [required] Domain to attach
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public OvhDomain serviceName_domain_POST(String serviceName, String domain) throws IOException {
		String qPath = "/sslGateway/{serviceName}/domain";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Servers attached to your SSL Gateway
	 *
	 * REST: GET /sslGateway/{serviceName}/server
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_server_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a new server to your SSL Gateway
	 *
	 * REST: POST /sslGateway/{serviceName}/server
	 * @param port [required] Port of your server
	 * @param address [required] IPv4 address of your server
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public OvhServer serviceName_server_POST(String serviceName, String address, Long port) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "address", address);
		addBody(o, "port", port);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhServer.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sslGateway/{serviceName}/server/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your server
	 *
	 * API beta
	 */
	public OvhServer serviceName_server_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServer.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sslGateway/{serviceName}/server/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your server
	 *
	 * API beta
	 */
	public void serviceName_server_id_PUT(String serviceName, Long id, OvhServer body) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove a server
	 *
	 * REST: DELETE /sslGateway/{serviceName}/server/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your server
	 *
	 * API beta
	 */
	public void serviceName_server_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Task for this SSL Gateway
	 *
	 * REST: GET /sslGateway/{serviceName}/task
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sslGateway/{serviceName}/task/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of the task
	 *
	 * API beta
	 */
	public OvhTask serviceName_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/task/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Ip subnet used by OVH to nat requests to your SSL Gateway backends.
	 *
	 * REST: GET /sslGateway/{serviceName}/natIp
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public ArrayList<OvhNatIps> serviceName_natIp_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/natIp";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhNatIps>> t3 = new TypeReference<ArrayList<OvhNatIps>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /sslGateway/{serviceName}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public OvhSslGateway serviceName_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSslGateway.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sslGateway/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public void serviceName_PUT(String serviceName, OvhSslGateway body) throws IOException {
		String qPath = "/sslGateway/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /sslGateway/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your SSL Gateway
	 *
	 * API beta
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/sslGateway/{serviceName}/confirmTermination";
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
	 * Check domain eligibility. Return list of eligible IP(s) for this domain.
	 *
	 * REST: GET /sslGateway/eligibility
	 * @param domain [required] domain to check eligibility for SSL Gateway offer
	 *
	 * API beta
	 */
	public OvhEligibilityStatus eligibility_GET(String domain) throws IOException {
		String qPath = "/sslGateway/eligibility";
		StringBuilder sb = path(qPath);
		query(sb, "domain", domain);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEligibilityStatus.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /sslGateway
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/sslGateway";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * List of zone available for an SSL Gateway
	 *
	 * REST: GET /sslGateway/availableZones
	 *
	 * API beta
	 */
	public ArrayList<String> availableZones_GET() throws IOException {
		String qPath = "/sslGateway/availableZones";
		StringBuilder sb = path(qPath);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
}
