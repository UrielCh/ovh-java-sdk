package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.iploadbalancing.OvhBackendCustomerServerStatusEnum;
import net.minidev.ovh.api.iploadbalancing.OvhBackendProbe;
import net.minidev.ovh.api.iploadbalancing.OvhBalanceEnum;
import net.minidev.ovh.api.iploadbalancing.OvhBalanceHTTPEnum;
import net.minidev.ovh.api.iploadbalancing.OvhBalanceTCPEnum;
import net.minidev.ovh.api.iploadbalancing.OvhCustomerServerStatusEnum;
import net.minidev.ovh.api.iploadbalancing.OvhDefinedBackend;
import net.minidev.ovh.api.iploadbalancing.OvhDefinedFrontend;
import net.minidev.ovh.api.iploadbalancing.OvhInstancesState;
import net.minidev.ovh.api.iploadbalancing.OvhIp;
import net.minidev.ovh.api.iploadbalancing.OvhProbeTypeEnum;
import net.minidev.ovh.api.iploadbalancing.OvhProxyProtocolVersionEnum;
import net.minidev.ovh.api.iploadbalancing.OvhProxyTypeEnum;
import net.minidev.ovh.api.iploadbalancing.OvhSslTypeEnum;
import net.minidev.ovh.api.iploadbalancing.OvhStickinessEnum;
import net.minidev.ovh.api.iploadbalancing.OvhStickinessHTTPEnum;
import net.minidev.ovh.api.iploadbalancing.OvhStickinessTCPEnum;
import net.minidev.ovh.api.iploadbalancing.OvhTaskActionEnum;
import net.minidev.ovh.api.iploadbalancing.backend.OvhBackend;
import net.minidev.ovh.api.iploadbalancing.backendcustomerserver.OvhBackendServer;
import net.minidev.ovh.api.iploadbalancing.backendhttp.OvhBackendHttp;
import net.minidev.ovh.api.iploadbalancing.backendhttpcustomerserver.OvhBackendHTTPServer;
import net.minidev.ovh.api.iploadbalancing.backendtcp.OvhBackendTcp;
import net.minidev.ovh.api.iploadbalancing.backendtcpcustomerserver.OvhBackendTCPServer;
import net.minidev.ovh.api.iploadbalancing.backendudp.OvhBackendUdp;
import net.minidev.ovh.api.iploadbalancing.backendudpcustomerserver.OvhBackendUDPServer;
import net.minidev.ovh.api.iploadbalancing.customerserver.OvhCustomerServer;
import net.minidev.ovh.api.iploadbalancing.frontend.OvhFrontend;
import net.minidev.ovh.api.iploadbalancing.frontendhttp.OvhFrontendHttp;
import net.minidev.ovh.api.iploadbalancing.frontendtcp.OvhFrontendTcp;
import net.minidev.ovh.api.iploadbalancing.frontendudp.OvhFrontendUdp;
import net.minidev.ovh.api.iploadbalancing.ssl.OvhSsl;
import net.minidev.ovh.api.iploadbalancing.task.OvhTask;
import net.minidev.ovh.api.iploadbalancing.zone.OvhIpZone;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/ipLoadbalancing
 * version:1.0
 */
public class ApiOvhIpLoadbalancing extends ApiOvhBase {
	public ApiOvhIpLoadbalancing(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * List of available zones you can attach a server to your iplb from
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/availableServerZones
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> serviceName_availableServerZones_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/availableServerZones";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhIp serviceName_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public void serviceName_PUT(String serviceName, OvhIp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Frontends for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/frontend
	 * @param zone [required] Filter the value of zone property (=)
	 * @param defaultBackendId [required] Filter the value of defaultBackendId property (=)
	 * @param port [required] Filter the value of port property (like)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_frontend_GET(String serviceName, Long defaultBackendId, String port, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "defaultBackendId", defaultBackendId);
		qPath = query(qPath, "port", port);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Add a new frontend on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/frontend
	 * @param defaultSslId [required] Default ssl served to your customer
	 * @param disabled [required] Disable your frontend. Set to 'false' if null
	 * @param ssl [required] SSL deciphering. Set to 'false' if null
	 * @param zone [required] Zone of your frontend. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param dedicatedIpfo [required] Only attach frontend on these ip. No restriction if null
	 * @param httpHeader [required] Add header to your frontend. Useful variables admitted : %ci <=> client_ip, %cp <=> client_port
	 * @param allowedSource [required] Restrict iplb access to these ip block. No restriction if null
	 * @param hsts [required] HTTP Strict Transport Security. Set to 'false' if null
	 * @param port [required] Port(s) attached to your frontend. A numerical port, a dash-delimited ports range or comma-delimited ports
	 * @param redirectLocation [required] HTTP redirection (Ex : http://www.ovh.com)
	 * @param defaultBackendId [required] Default Backend of your frontend
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhFrontend serviceName_frontend_POST(String serviceName, Long defaultSslId, Boolean disabled, Boolean ssl, String zone, String[] dedicatedIpfo, String[] httpHeader, String[] allowedSource, Boolean hsts, String port, String redirectLocation, Long defaultBackendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "defaultSslId", defaultSslId);
		addBody(o, "disabled", disabled);
		addBody(o, "ssl", ssl);
		addBody(o, "zone", zone);
		addBody(o, "dedicatedIpfo", dedicatedIpfo);
		addBody(o, "httpHeader", httpHeader);
		addBody(o, "allowedSource", allowedSource);
		addBody(o, "hsts", hsts);
		addBody(o, "port", port);
		addBody(o, "redirectLocation", redirectLocation);
		addBody(o, "defaultBackendId", defaultBackendId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhFrontend.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/frontend/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your frontend
	 */
	public OvhFrontend serviceName_frontend_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFrontend.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/frontend/{id}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your frontend
	 */
	public void serviceName_frontend_id_PUT(String serviceName, Long id, OvhFrontend body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a frontend
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/frontend/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your frontend
	 */
	public void serviceName_frontend_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Zone for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/zone
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> serviceName_zone_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/zone";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/zone/{name}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param name [required] Name of your zone
	 */
	public OvhIpZone serviceName_zone_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/zone/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIpZone.class);
	}

	/**
	 * Delete a zone
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/zone/{name}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param name [required] Name of your zone
	 */
	public void serviceName_zone_name_DELETE(String serviceName, String name) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/zone/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		exec("DELETE", qPath);
	}

	/**
	 * List all failover ip routed to this IPLB
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/failover
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> serviceName_failover_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/failover";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Backends for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/backend
	 * @param zone [required] Filter the value of zone property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_backend_GET(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new backend on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/backend
	 * @param balance [required] Load balancing algorithm. 'roundrobin' if null
	 * @param zone [required] Zone of your backend.
	 * @param type [required] Type of your backend
	 * @param probe [required] Probe type. 'tcp' if null
	 * @param port [required] Port attached to your backend [1..65535]. Inherited from frontend if null
	 * @param stickiness [required] Stickiness type. No stickiness if null
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhBackend serviceName_backend_POST(String serviceName, OvhBalanceEnum balance, String zone, OvhProxyTypeEnum type, OvhProbeTypeEnum probe, Long port, OvhStickinessEnum stickiness) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "balance", balance);
		addBody(o, "zone", zone);
		addBody(o, "type", type);
		addBody(o, "probe", probe);
		addBody(o, "port", port);
		addBody(o, "stickiness", stickiness);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/backend/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 */
	public OvhBackend serviceName_backend_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/backend/{id}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 */
	public void serviceName_backend_id_PUT(String serviceName, Long id, OvhBackend body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a backend
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/backend/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 */
	public void serviceName_backend_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Backend/Servers links
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/backend/{id}/server
	 * @param cookie [required] Filter the value of cookie property (like)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 */
	public ArrayList<Long> serviceName_backend_id_server_GET(String serviceName, Long id, String cookie) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		qPath = query(qPath, "cookie", cookie);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a server to a backend
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/backend/{id}/server
	 * @param ssl [required] SSL ciphering. Probes will also be sent ciphered. Set to 'false' if null
	 * @param cookie [required] Set the cookie value used when 'cookie' stickiness is set in backend
	 * @param port [required] Port attached to your server [1..65535]. Inherited from backend if null
	 * @param proxyProtocolVersion [required] Enforce use of the PROXY protocol version over any connection established to this server (disabled if null)
	 * @param serverId [required] Id of your server
	 * @param chain [required] Certificate chain. Allow server certificate verification (Avoid man-in-the-middle attacks)
	 * @param weight [required] Set weight on that server [1..256]. 1 if null
	 * @param backup [required] Set server as backup. Set to 'false' if null
	 * @param probe [required] Enable/disable probe. Set to 'false' if null
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 */
	public OvhBackendServer serviceName_backend_id_server_POST(String serviceName, Long id, Boolean ssl, String cookie, Long port, OvhProxyProtocolVersionEnum proxyProtocolVersion, Long serverId, String chain, Long weight, Boolean backup, Boolean probe) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ssl", ssl);
		addBody(o, "cookie", cookie);
		addBody(o, "port", port);
		addBody(o, "proxyProtocolVersion", proxyProtocolVersion);
		addBody(o, "serverId", serverId);
		addBody(o, "chain", chain);
		addBody(o, "weight", weight);
		addBody(o, "backup", backup);
		addBody(o, "probe", probe);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhBackendServer.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @param linkId [required] Id of your backend/server link
	 */
	public OvhBackendServer serviceName_backend_id_server_linkId_GET(String serviceName, Long id, Long linkId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		qPath = qPath.replace("{linkId}", linkId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackendServer.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @param linkId [required] Id of your backend/server link
	 */
	public void serviceName_backend_id_server_linkId_PUT(String serviceName, Long id, Long linkId, OvhBackendServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		qPath = qPath.replace("{linkId}", linkId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a server from a backend
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @param linkId [required] Id of your backend/server link
	 */
	public void serviceName_backend_id_server_linkId_DELETE(String serviceName, Long id, Long linkId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		qPath = qPath.replace("{linkId}", linkId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Terminate your service
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Ip subnet used by OVH to nat requests on your IPLB to your backends. You must ensure that your backends are not part of a network that overlap with this one
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/natIp
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> serviceName_natIp_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/natIp";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t2);
	}

	/**
	 * HTTP frontends for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/http/frontend
	 * @param defaultFarmId [required] Filter the value of defaultFarmId property (=)
	 * @param zone [required] Filter the value of zone property (=)
	 * @param port [required] Filter the value of port property (like)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_http_frontend_GET(String serviceName, Long defaultFarmId, String port, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "defaultFarmId", defaultFarmId);
		qPath = query(qPath, "port", port);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new http frontend on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/http/frontend
	 * @param defaultSslId [required] Default ssl served to your customer
	 * @param disabled [required] Disable your frontend. Set to 'false' if null
	 * @param ssl [required] SSL deciphering. Set to 'false' if null
	 * @param zone [required] Zone of your frontend. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param dedicatedIpfo [required] Only attach frontend on these ip. No restriction if null
	 * @param httpHeader [required] Add header to your frontend. Useful variables admitted : %ci <=> client_ip, %cp <=> client_port
	 * @param allowedSource [required] Restrict iplb access to these ip block. No restriction if null
	 * @param hsts [required] HTTP Strict Transport Security. Set to 'false' if null
	 * @param port [required] Port(s) attached to your frontend.
	 * @param redirectLocation [required] HTTP redirection (Ex : http://www.ovh.com)
	 * @param defaultFarmId [required] Default HTTP Farm of your frontend
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhFrontendHttp serviceName_http_frontend_POST(String serviceName, Long defaultSslId, Boolean disabled, Boolean ssl, String zone, String[] dedicatedIpfo, String[] httpHeader, String[] allowedSource, Boolean hsts, String port, String redirectLocation, Long defaultFarmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "defaultSslId", defaultSslId);
		addBody(o, "disabled", disabled);
		addBody(o, "ssl", ssl);
		addBody(o, "zone", zone);
		addBody(o, "dedicatedIpfo", dedicatedIpfo);
		addBody(o, "httpHeader", httpHeader);
		addBody(o, "allowedSource", allowedSource);
		addBody(o, "hsts", hsts);
		addBody(o, "port", port);
		addBody(o, "redirectLocation", redirectLocation);
		addBody(o, "defaultFarmId", defaultFarmId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhFrontendHttp.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/http/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 */
	public OvhFrontendHttp serviceName_http_frontend_frontendId_GET(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend/{frontendId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frontendId}", frontendId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFrontendHttp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/http/frontend/{frontendId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 */
	public void serviceName_http_frontend_frontendId_PUT(String serviceName, Long frontendId, OvhFrontendHttp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend/{frontendId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frontendId}", frontendId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete an HTTP frontend
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/http/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 */
	public void serviceName_http_frontend_frontendId_DELETE(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend/{frontendId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frontendId}", frontendId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * HTTP Farm for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/http/farm
	 * @param zone [required] Filter the value of zone property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_http_farm_GET(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new HTTP Farm on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/http/farm
	 * @param balance [required] Load balancing algorithm. 'roundrobin' if null
	 * @param zone [required] Zone of your farm
	 * @param probe [required] Probe used to determine if a backend is alive and can handle requests
	 * @param port [required] Port attached to your farm ([1..65535]). Inherited from frontend if null
	 * @param stickiness [required] Stickiness type. No stickiness if null
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhBackendHttp serviceName_http_farm_POST(String serviceName, OvhBalanceHTTPEnum balance, String zone, OvhBackendProbe probe, Long port, OvhStickinessHTTPEnum stickiness) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "balance", balance);
		addBody(o, "zone", zone);
		addBody(o, "probe", probe);
		addBody(o, "port", port);
		addBody(o, "stickiness", stickiness);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhBackendHttp.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/http/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public OvhBackendHttp serviceName_http_farm_farmId_GET(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackendHttp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/http/farm/{farmId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public void serviceName_http_farm_farmId_PUT(String serviceName, Long farmId, OvhBackendHttp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete an HTTP Farm
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/http/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public void serviceName_http_farm_farmId_DELETE(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * HTTP Farm's Servers
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/http/farm/{farmId}/server
	 * @param status [required] Filter the value of status property (=)
	 * @param cookie [required] Filter the value of cookie property (like)
	 * @param address [required] Filter the value of address property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public ArrayList<Long> serviceName_http_farm_farmId_server_GET(String serviceName, Long farmId, String address, String cookie, OvhBackendCustomerServerStatusEnum status) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = query(qPath, "address", address);
		qPath = query(qPath, "cookie", cookie);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a server to an HTTP Farm
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/http/farm/{farmId}/server
	 * @param ssl [required] SSL ciphering. Probes will also be sent ciphered. Set to 'false' if null
	 * @param status [required] Status attached to your server
	 * @param cookie [required] Set the cookie value used when 'cookie' stickiness is set in the farm
	 * @param port [required] Port attached to your server ([1..65535]). Inherited from farm if null
	 * @param proxyProtocolVersion [required] Enforce use of the PROXY protocol version over any connection established to this server (disabled if null)
	 * @param chain [required] Certificate chain. Allow server certificate verification (Avoid man-in-the-middle attacks)
	 * @param weight [required] Set weight on that server [1..256]. 1 if null
	 * @param address [required] Address of your server
	 * @param backup [required] Set server as backup. Set to 'false' if null
	 * @param probe [required] Enable/disable probe. Set to 'false' if null
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public OvhBackendHTTPServer serviceName_http_farm_farmId_server_POST(String serviceName, Long farmId, Boolean ssl, OvhBackendCustomerServerStatusEnum status, String cookie, Long port, OvhProxyProtocolVersionEnum proxyProtocolVersion, String chain, Long weight, String address, Boolean backup, Boolean probe) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ssl", ssl);
		addBody(o, "status", status);
		addBody(o, "cookie", cookie);
		addBody(o, "port", port);
		addBody(o, "proxyProtocolVersion", proxyProtocolVersion);
		addBody(o, "chain", chain);
		addBody(o, "weight", weight);
		addBody(o, "address", address);
		addBody(o, "backup", backup);
		addBody(o, "probe", probe);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhBackendHTTPServer.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 */
	public OvhBackendHTTPServer serviceName_http_farm_farmId_server_serverId_GET(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = qPath.replace("{serverId}", serverId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackendHTTPServer.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 */
	public void serviceName_http_farm_farmId_server_serverId_PUT(String serviceName, Long farmId, Long serverId, OvhBackendHTTPServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = qPath.replace("{serverId}", serverId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a server from an HTTP Farm
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 */
	public void serviceName_http_farm_farmId_server_serverId_DELETE(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = qPath.replace("{serverId}", serverId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get the effective state of your IPLB instances on IPLB servers
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/instancesState
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<OvhInstancesState> serviceName_instancesState_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/instancesState";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhInstancesState>> t3 = new TypeReference<ArrayList<OvhInstancesState>>() {};

	/**
	 * Apply the configuration to your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/refresh
	 * @param zone [required] The zone(s) of your iplb
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhTask serviceName_refresh_POST(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/refresh";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zone", zone);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Order a free certificate. We order and deliver it for you
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/freeCertificate
	 * @param fqdn [required] The FQDN for which you want a free certificate. A DCV (Domain Control Validation) http request will be made to http://your_domain.abc, make sure this domain exists and resolves to your iplb ip before ordering
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhTask serviceName_freeCertificate_POST(String serviceName, String[] fqdn) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/freeCertificate";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "fqdn", fqdn);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * UDP frontends for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/frontend
	 * @param defaultFarmId [required] Filter the value of defaultFarmId property (=)
	 * @param zone [required] Filter the value of zone property (=)
	 * @param port [required] Filter the value of port property (like)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_udp_frontend_GET(String serviceName, Long defaultFarmId, String port, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "defaultFarmId", defaultFarmId);
		qPath = query(qPath, "port", port);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new UDP frontend on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/udp/frontend
	 * @param disabled [required] Disable your frontend. Set to 'false' if null
	 * @param defaultFarmId [required] Default UDP Farm of your frontend
	 * @param zone [required] Zone of your frontend. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param dedicatedIpfo [required] Only attach frontend on these ip. No restriction if null
	 * @param port [required] Port attached to your frontend.
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhFrontendUdp serviceName_udp_frontend_POST(String serviceName, Boolean disabled, Long defaultFarmId, String zone, String[] dedicatedIpfo, String port) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "disabled", disabled);
		addBody(o, "defaultFarmId", defaultFarmId);
		addBody(o, "zone", zone);
		addBody(o, "dedicatedIpfo", dedicatedIpfo);
		addBody(o, "port", port);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhFrontendUdp.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 */
	public OvhFrontendUdp serviceName_udp_frontend_frontendId_GET(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frontendId}", frontendId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFrontendUdp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 */
	public void serviceName_udp_frontend_frontendId_PUT(String serviceName, Long frontendId, OvhFrontendUdp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frontendId}", frontendId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete an UDP frontend
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 */
	public void serviceName_udp_frontend_frontendId_DELETE(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frontendId}", frontendId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * UDP Farm for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/farm
	 * @param zone [required] Filter the value of zone property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_udp_farm_GET(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new UDP Farm on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/udp/farm
	 * @param zone [required] Zone of your farm
	 * @param port [required] Port attached to your farm ([1..65535]). Inherited from frontend if null
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhBackendUdp serviceName_udp_farm_POST(String serviceName, String zone, Long port) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zone", zone);
		addBody(o, "port", port);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhBackendUdp.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public OvhBackendUdp serviceName_udp_farm_farmId_GET(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackendUdp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/udp/farm/{farmId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public void serviceName_udp_farm_farmId_PUT(String serviceName, Long farmId, OvhBackendUdp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete an UDP Farm
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/udp/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public void serviceName_udp_farm_farmId_DELETE(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * UDP Farm's Servers
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server
	 * @param status [required] Filter the value of status property (=)
	 * @param address [required] Filter the value of address property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public ArrayList<Long> serviceName_udp_farm_farmId_server_GET(String serviceName, Long farmId, String address, OvhBackendCustomerServerStatusEnum status) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = query(qPath, "address", address);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a server to an UDP Farm
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server
	 * @param status [required] Status attached to your server
	 * @param address [required] Address of your server
	 * @param port [required] Port attached to your server ([1..65535]). Inherited from farm if null
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public OvhBackendServer serviceName_udp_farm_farmId_server_POST(String serviceName, Long farmId, OvhBackendCustomerServerStatusEnum status, String address, Long port) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "status", status);
		addBody(o, "address", address);
		addBody(o, "port", port);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhBackendServer.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 */
	public OvhBackendUDPServer serviceName_udp_farm_farmId_server_serverId_GET(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = qPath.replace("{serverId}", serverId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackendUDPServer.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 */
	public void serviceName_udp_farm_farmId_server_serverId_PUT(String serviceName, Long farmId, Long serverId, OvhBackendUDPServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = qPath.replace("{serverId}", serverId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a server from an UDP Farm
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 */
	public void serviceName_udp_farm_farmId_server_serverId_DELETE(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = qPath.replace("{serverId}", serverId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Servers for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/server
	 * @param status [required] Filter the value of status property (=)
	 * @param zone [required] Filter the value of zone property (=)
	 * @param address [required] Filter the value of address property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_server_GET(String serviceName, String address, OvhCustomerServerStatusEnum status, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "address", address);
		qPath = query(qPath, "status", status);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new server on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/server
	 * @param status [required] Status of your server
	 * @param address [required] Address of your server
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhCustomerServer serviceName_server_POST(String serviceName, OvhCustomerServerStatusEnum status, String address) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "status", status);
		addBody(o, "address", address);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhCustomerServer.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/server/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your server
	 */
	public OvhCustomerServer serviceName_server_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCustomerServer.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/server/{id}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your server
	 */
	public void serviceName_server_id_PUT(String serviceName, Long id, OvhCustomerServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a server
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/server/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your server
	 */
	public void serviceName_server_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * List of servers you can attach to your iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/allowedServers
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<net.minidev.ovh.api.ip.OvhIp> serviceName_allowedServers_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/allowedServers";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<net.minidev.ovh.api.ip.OvhIp>> t4 = new TypeReference<ArrayList<net.minidev.ovh.api.ip.OvhIp>>() {};

	/**
	 * Available farm types
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/availableFarmType
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> serviceName_availableFarmType_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/availableFarmType";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Ssl for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/ssl
	 * @param serial [required] Filter the value of serial property (like)
	 * @param fingerprint [required] Filter the value of fingerprint property (like)
	 * @param type [required] Filter the value of type property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_ssl_GET(String serviceName, String fingerprint, String serial, OvhSslTypeEnum type) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "fingerprint", fingerprint);
		qPath = query(qPath, "serial", serial);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new ssl certificate on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/ssl
	 * @param chain [required] Certificate chain
	 * @param certificate [required] Certificate
	 * @param key [required] Certificate key
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhSsl serviceName_ssl_POST(String serviceName, String chain, String certificate, String key) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "chain", chain);
		addBody(o, "certificate", certificate);
		addBody(o, "key", key);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/ssl/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your ssl certificate
	 */
	public OvhSsl serviceName_ssl_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/ssl/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Delete a ssl certificate
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/ssl/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your ssl certificate
	 */
	public void serviceName_ssl_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/ssl/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * List of defined frontends, and whether they are HTTP, TCP or UDP
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/definedFrontends
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<OvhDefinedFrontend> serviceName_definedFrontends_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/definedFrontends";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhDefinedFrontend>> t5 = new TypeReference<ArrayList<OvhDefinedFrontend>>() {};

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/confirmTermination";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * TCP frontends for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/frontend
	 * @param defaultFarmId [required] Filter the value of defaultFarmId property (=)
	 * @param zone [required] Filter the value of zone property (=)
	 * @param port [required] Filter the value of port property (like)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_tcp_frontend_GET(String serviceName, Long defaultFarmId, String port, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "defaultFarmId", defaultFarmId);
		qPath = query(qPath, "port", port);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new TCP frontend on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/tcp/frontend
	 * @param defaultSslId [required] Default ssl served to your customer
	 * @param disabled [required] Disable your frontend. Set to 'false' if null
	 * @param ssl [required] SSL deciphering. Set to 'false' if null
	 * @param zone [required] Zone of your frontend. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param dedicatedIpfo [required] Only attach frontend on these ip. No restriction if null
	 * @param allowedSource [required] Restrict iplb access to these ip block. No restriction if null
	 * @param port [required] Port(s) attached to your frontend. A numerical port, a dash-delimited ports range or comma-delimited ports
	 * @param defaultFarmId [required] Default TCP Farm of your frontend
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhFrontendTcp serviceName_tcp_frontend_POST(String serviceName, Long defaultSslId, Boolean disabled, Boolean ssl, String zone, String[] dedicatedIpfo, String[] allowedSource, String port, Long defaultFarmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "defaultSslId", defaultSslId);
		addBody(o, "disabled", disabled);
		addBody(o, "ssl", ssl);
		addBody(o, "zone", zone);
		addBody(o, "dedicatedIpfo", dedicatedIpfo);
		addBody(o, "allowedSource", allowedSource);
		addBody(o, "port", port);
		addBody(o, "defaultFarmId", defaultFarmId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhFrontendTcp.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 */
	public OvhFrontendTcp serviceName_tcp_frontend_frontendId_GET(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frontendId}", frontendId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFrontendTcp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 */
	public void serviceName_tcp_frontend_frontendId_PUT(String serviceName, Long frontendId, OvhFrontendTcp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frontendId}", frontendId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete an TCP frontend
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 */
	public void serviceName_tcp_frontend_frontendId_DELETE(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{frontendId}", frontendId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * TCP Farm for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/farm
	 * @param zone [required] Filter the value of zone property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_tcp_farm_GET(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new TCP Farm on your iplb
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/tcp/farm
	 * @param balance [required] Load balancing algorithm. 'roundrobin' if null
	 * @param zone [required] Zone of your farm
	 * @param probe [required] Probe used to determine if a backend is alive and can handle requests
	 * @param port [required] Port attached to your farm ([1..65535]). Inherited from frontend if null
	 * @param stickiness [required] Stickiness type. No stickiness if null
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhBackendTcp serviceName_tcp_farm_POST(String serviceName, OvhBalanceTCPEnum balance, String zone, OvhBackendProbe probe, Long port, OvhStickinessTCPEnum stickiness) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "balance", balance);
		addBody(o, "zone", zone);
		addBody(o, "probe", probe);
		addBody(o, "port", port);
		addBody(o, "stickiness", stickiness);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhBackendTcp.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public OvhBackendTcp serviceName_tcp_farm_farmId_GET(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackendTcp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public void serviceName_tcp_farm_farmId_PUT(String serviceName, Long farmId, OvhBackendTcp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a TCP Farm
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public void serviceName_tcp_farm_farmId_DELETE(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * TCP Farm's Servers
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server
	 * @param status [required] Filter the value of status property (=)
	 * @param address [required] Filter the value of address property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public ArrayList<Long> serviceName_tcp_farm_farmId_server_GET(String serviceName, Long farmId, String address, OvhBackendCustomerServerStatusEnum status) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = query(qPath, "address", address);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a server to a TCP Farm
	 * 
	 * REST: POST /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server
	 * @param ssl [required] SSL ciphering. Probes will also be sent ciphered. Set to 'false' if null
	 * @param status [required] Status attached to your server
	 * @param port [required] Port attached to your server ([1..65535]). Inherited from farm if null
	 * @param proxyProtocolVersion [required] Enforce use of the PROXY protocol version over any connection established to this server (disabled if null)
	 * @param chain [required] Certificate chain. Allow server certificate verification (Avoid man-in-the-middle attacks)
	 * @param weight [required] Set weight on that server ([1..256]). 1 if null
	 * @param address [required] Address of your server
	 * @param backup [required] Set server as backup. Set to 'false' if null
	 * @param probe [required] Enable/disable probe. Set to 'false' if null
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 */
	public OvhBackendServer serviceName_tcp_farm_farmId_server_POST(String serviceName, Long farmId, Boolean ssl, OvhBackendCustomerServerStatusEnum status, Long port, OvhProxyProtocolVersionEnum proxyProtocolVersion, String chain, Long weight, String address, Boolean backup, Boolean probe) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ssl", ssl);
		addBody(o, "status", status);
		addBody(o, "port", port);
		addBody(o, "proxyProtocolVersion", proxyProtocolVersion);
		addBody(o, "chain", chain);
		addBody(o, "weight", weight);
		addBody(o, "address", address);
		addBody(o, "backup", backup);
		addBody(o, "probe", probe);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhBackendServer.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 */
	public OvhBackendTCPServer serviceName_tcp_farm_farmId_server_serverId_GET(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = qPath.replace("{serverId}", serverId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackendTCPServer.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 */
	public void serviceName_tcp_farm_farmId_server_serverId_PUT(String serviceName, Long farmId, Long serverId, OvhBackendTCPServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = qPath.replace("{serverId}", serverId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a server from a TCP Farm
	 * 
	 * REST: DELETE /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 */
	public void serviceName_tcp_farm_farmId_server_serverId_DELETE(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{farmId}", farmId.toString());
		qPath = qPath.replace("{serverId}", serverId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Task for this iplb
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/task
	 * @param action [required] Filter the value of action property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskActionEnum action) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "action", action);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/task/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of the task
	 */
	public OvhTask serviceName_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/task/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of defined farms, and whether they are HTTP, TCP or UDP
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/definedFarms
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<OvhDefinedBackend> serviceName_definedFarms_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/definedFarms";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhDefinedBackend>> t6 = new TypeReference<ArrayList<OvhDefinedBackend>>() {};

	/**
	 * Available frontend type
	 * 
	 * REST: GET /ipLoadbalancing/{serviceName}/availableFrontendType
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> serviceName_availableFrontendType_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/availableFrontendType";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /ipLoadbalancing
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/ipLoadbalancing";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * List of zone available for an IP load balancing
	 * 
	 * REST: GET /ipLoadbalancing/availableZones
	 */
	public ArrayList<String> availableZones_GET() throws IOException {
		String qPath = "/ipLoadbalancing/availableZones";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
}
