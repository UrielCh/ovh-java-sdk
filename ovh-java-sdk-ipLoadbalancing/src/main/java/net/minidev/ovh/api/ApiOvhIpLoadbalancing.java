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
import net.minidev.ovh.api.iploadbalancing.OvhDefinedRoute;
import net.minidev.ovh.api.iploadbalancing.OvhInstancesState;
import net.minidev.ovh.api.iploadbalancing.OvhIp;
import net.minidev.ovh.api.iploadbalancing.OvhProbeTypeEnum;
import net.minidev.ovh.api.iploadbalancing.OvhProxyProtocolVersionEnum;
import net.minidev.ovh.api.iploadbalancing.OvhProxyTypeEnum;
import net.minidev.ovh.api.iploadbalancing.OvhRouteAvailableAction;
import net.minidev.ovh.api.iploadbalancing.OvhRouteAvailableRule;
import net.minidev.ovh.api.iploadbalancing.OvhRouteHttpAction;
import net.minidev.ovh.api.iploadbalancing.OvhRouteRuleMatchesEnum;
import net.minidev.ovh.api.iploadbalancing.OvhRouteTcpAction;
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
import net.minidev.ovh.api.iploadbalancing.routehttp.OvhRouteHttp;
import net.minidev.ovh.api.iploadbalancing.routerule.OvhRouteRule;
import net.minidev.ovh.api.iploadbalancing.routetcp.OvhRouteTcp;
import net.minidev.ovh.api.iploadbalancing.ssl.OvhSsl;
import net.minidev.ovh.api.iploadbalancing.task.OvhTask;
import net.minidev.ovh.api.iploadbalancing.zone.OvhIpZone;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
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
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * List of available zones you can attach a server to your iplb from
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/availableServerZones
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @deprecated
	 */
	public ArrayList<String> serviceName_availableServerZones_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/availableServerZones";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhIp serviceName_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIp.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public void serviceName_PUT(String serviceName, OvhIp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Frontends for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/frontend
	 * @param zone [required] Filter the value of zone property (=)
	 * @param defaultBackendId [required] Filter the value of defaultBackendId property (=)
	 * @param port [required] Filter the value of port property (like)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @deprecated
	 */
	public ArrayList<Long> serviceName_frontend_GET(String serviceName, Long defaultBackendId, String port, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "defaultBackendId", defaultBackendId);
		query(sb, "port", port);
		query(sb, "zone", zone);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
	 * @deprecated
	 */
	public OvhFrontend serviceName_frontend_POST(String serviceName, Long defaultSslId, Boolean disabled, Boolean ssl, String zone, String[] dedicatedIpfo, String[] httpHeader, String[] allowedSource, Boolean hsts, String port, String redirectLocation, Long defaultBackendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend";
		StringBuilder sb = path(qPath, serviceName);
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
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhFrontend.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/frontend/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your frontend
	 * @deprecated
	 */
	public OvhFrontend serviceName_frontend_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFrontend.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/frontend/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your frontend
	 * @deprecated
	 */
	public void serviceName_frontend_id_PUT(String serviceName, Long id, OvhFrontend body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a frontend
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/frontend/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your frontend
	 * @deprecated
	 */
	public void serviceName_frontend_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/frontend/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Zone for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/zone
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_zone_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/zone";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/zone/{name}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param name [required] Name of your zone
	 *
	 * API beta
	 */
	public OvhIpZone serviceName_zone_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/zone/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIpZone.class);
	}

	/**
	 * Delete a zone
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/zone/{name}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param name [required] Name of your zone
	 *
	 * API beta
	 */
	public void serviceName_zone_name_DELETE(String serviceName, String name) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/zone/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * List all failover ip routed to this IPLB
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/failover
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_failover_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/failover";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Backends for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/backend
	 * @param zone [required] Filter the value of zone property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @deprecated
	 */
	public ArrayList<Long> serviceName_backend_GET(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "zone", zone);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
	 * @deprecated
	 */
	public OvhBackend serviceName_backend_POST(String serviceName, OvhBalanceEnum balance, String zone, OvhProxyTypeEnum type, OvhProbeTypeEnum probe, Long port, OvhStickinessEnum stickiness) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "balance", balance);
		addBody(o, "zone", zone);
		addBody(o, "type", type);
		addBody(o, "probe", probe);
		addBody(o, "port", port);
		addBody(o, "stickiness", stickiness);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/backend/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @deprecated
	 */
	public OvhBackend serviceName_backend_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/backend/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @deprecated
	 */
	public void serviceName_backend_id_PUT(String serviceName, Long id, OvhBackend body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a backend
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/backend/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @deprecated
	 */
	public void serviceName_backend_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Backend/Servers links
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/backend/{id}/server
	 * @param cookie [required] Filter the value of cookie property (like)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @deprecated
	 */
	public ArrayList<Long> serviceName_backend_id_server_GET(String serviceName, Long id, String cookie) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server";
		StringBuilder sb = path(qPath, serviceName, id);
		query(sb, "cookie", cookie);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
	 * @param weight [required] Set weight on that server [0..255]. 0 if null
	 * @param backup [required] Set server as backup. Set to 'false' if null
	 * @param probe [required] Enable/disable probe. Set to 'false' if null
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @deprecated
	 */
	public OvhBackendServer serviceName_backend_id_server_POST(String serviceName, Long id, Boolean ssl, String cookie, Long port, OvhProxyProtocolVersionEnum proxyProtocolVersion, Long serverId, String chain, Long weight, Boolean backup, Boolean probe) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server";
		StringBuilder sb = path(qPath, serviceName, id);
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
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackendServer.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @param linkId [required] Id of your backend/server link
	 * @deprecated
	 */
	public OvhBackendServer serviceName_backend_id_server_linkId_GET(String serviceName, Long id, Long linkId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}";
		StringBuilder sb = path(qPath, serviceName, id, linkId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackendServer.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @param linkId [required] Id of your backend/server link
	 * @deprecated
	 */
	public void serviceName_backend_id_server_linkId_PUT(String serviceName, Long id, Long linkId, OvhBackendServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}";
		StringBuilder sb = path(qPath, serviceName, id, linkId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a server from a backend
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your backend
	 * @param linkId [required] Id of your backend/server link
	 * @deprecated
	 */
	public void serviceName_backend_id_server_linkId_DELETE(String serviceName, Long id, Long linkId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/backend/{id}/server/{linkId}";
		StringBuilder sb = path(qPath, serviceName, id, linkId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Ip subnet used by OVH to nat requests on your IPLB to your backends. You must ensure that your backends are not part of a network that overlap with this one
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/natIp
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_natIp_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/natIp";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_http_frontend_GET(String serviceName, Long defaultFarmId, String port, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "defaultFarmId", defaultFarmId);
		query(sb, "port", port);
		query(sb, "zone", zone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new http frontend on your IP Load Balancing
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/http/frontend
	 * @param defaultSslId [required] Default ssl served to your customer
	 * @param disabled [required] Disable your frontend. Set to 'false' if null
	 * @param ssl [required] SSL deciphering. Set to 'false' if null
	 * @param zone [required] Zone of your frontend. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param dedicatedIpfo [required] Only attach frontend on these ip. No restriction if null
	 * @param httpHeader [required] Add header to your frontend. Useful variables admitted : %ci <=> client_ip, %cp <=> client_port
	 * @param allowedSource [required] Restrict IP Load Balancing access to these ip block. No restriction if null
	 * @param hsts [required] HTTP Strict Transport Security. Set to 'false' if null
	 * @param port [required] Listening port(s) of your server. Supported format: '\d+(,\d+)+' or '\d+-\d+'.
	 * @param redirectLocation [required] HTTP redirection (Ex : http://www.ovh.com)
	 * @param defaultFarmId [required] Default HTTP Farm of your frontend
	 * @param displayName [required] Human readable name for your frontend, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhFrontendHttp serviceName_http_frontend_POST(String serviceName, Long defaultSslId, Boolean disabled, Boolean ssl, String zone, String[] dedicatedIpfo, String[] httpHeader, String[] allowedSource, Boolean hsts, String port, String redirectLocation, Long defaultFarmId, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend";
		StringBuilder sb = path(qPath, serviceName);
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
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhFrontendHttp.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/http/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 *
	 * API beta
	 */
	public OvhFrontendHttp serviceName_http_frontend_frontendId_GET(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend/{frontendId}";
		StringBuilder sb = path(qPath, serviceName, frontendId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFrontendHttp.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/http/frontend/{frontendId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 *
	 * API beta
	 */
	public void serviceName_http_frontend_frontendId_PUT(String serviceName, Long frontendId, OvhFrontendHttp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend/{frontendId}";
		StringBuilder sb = path(qPath, serviceName, frontendId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete an HTTP frontend
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/http/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 *
	 * API beta
	 */
	public void serviceName_http_frontend_frontendId_DELETE(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/frontend/{frontendId}";
		StringBuilder sb = path(qPath, serviceName, frontendId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * HTTP routes for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/http/route
	 * @param frontendId [required] Filter the value of frontendId property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_http_route_GET(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "frontendId", frontendId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new HTTP route to your frontend
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/http/route
	 * @param action [required] Action triggered when all rules match
	 * @param weight [required] Route priority ([0..255]). 0 if null. Highest priority routes are evaluated first. Only the first matching route will trigger an action
	 * @param frontendId [required] Route traffic for this frontend
	 * @param displayName [required] Human readable name for your route, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhRouteHttp serviceName_http_route_POST(String serviceName, OvhRouteHttpAction action, Long weight, Long frontendId, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		addBody(o, "weight", weight);
		addBody(o, "frontendId", frontendId);
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhRouteHttp.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/http/route/{routeId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public OvhRouteHttp serviceName_http_route_routeId_GET(String serviceName, Long routeId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route/{routeId}";
		StringBuilder sb = path(qPath, serviceName, routeId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRouteHttp.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/http/route/{routeId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public void serviceName_http_route_routeId_PUT(String serviceName, Long routeId, OvhRouteHttp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route/{routeId}";
		StringBuilder sb = path(qPath, serviceName, routeId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete this HTTP route
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/http/route/{routeId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public void serviceName_http_route_routeId_DELETE(String serviceName, Long routeId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route/{routeId}";
		StringBuilder sb = path(qPath, serviceName, routeId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * HTTP routes for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/http/route/{routeId}/rule
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_http_route_routeId_rule_GET(String serviceName, Long routeId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route/{routeId}/rule";
		StringBuilder sb = path(qPath, serviceName, routeId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new rule to your route
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/http/route/{routeId}/rule
	 * @param pattern [required] Value to match against this match. Interpretation if this field depends on the match and field
	 * @param match [required] Matching operator. Not all operators are available for all fields. See "/availableRules"
	 * @param subField [required] Name of sub-field, if applicable. This may be a Cookie or Header name for instance
	 * @param negate [required] Invert the matching operator effect
	 * @param field [required] Name of the field to match like "protocol" or "host". See "/ipLoadbalancing/{serviceName}/route/availableRules" for a list of available rules
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public OvhRouteRule serviceName_http_route_routeId_rule_POST(String serviceName, Long routeId, String pattern, OvhRouteRuleMatchesEnum match, String subField, Boolean negate, String field) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route/{routeId}/rule";
		StringBuilder sb = path(qPath, serviceName, routeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "pattern", pattern);
		addBody(o, "match", match);
		addBody(o, "subField", subField);
		addBody(o, "negate", negate);
		addBody(o, "field", field);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhRouteRule.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/http/route/{routeId}/rule/{ruleId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 * @param ruleId [required] Id of your rule
	 *
	 * API beta
	 */
	public OvhRouteRule serviceName_http_route_routeId_rule_ruleId_GET(String serviceName, Long routeId, Long ruleId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route/{routeId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, serviceName, routeId, ruleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRouteRule.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/http/route/{routeId}/rule/{ruleId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 * @param ruleId [required] Id of your rule
	 *
	 * API beta
	 */
	public void serviceName_http_route_routeId_rule_ruleId_PUT(String serviceName, Long routeId, Long ruleId, OvhRouteRule body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route/{routeId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, serviceName, routeId, ruleId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete this rule from the route
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/http/route/{routeId}/rule/{ruleId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 * @param ruleId [required] Id of your rule
	 *
	 * API beta
	 */
	public void serviceName_http_route_routeId_rule_ruleId_DELETE(String serviceName, Long routeId, Long ruleId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/route/{routeId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, serviceName, routeId, ruleId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * HTTP Farm for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/http/farm
	 * @param zone [required] Filter the value of zone property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_http_farm_GET(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "zone", zone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new HTTP Farm on your IP Load Balancing
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/http/farm
	 * @param balance [required] Load balancing algorithm. 'roundrobin' if null
	 * @param zone [required] Zone of your farm
	 * @param probe [required] Probe used to determine if a backend is alive and can handle requests
	 * @param port [required] Port attached to your farm ([1..65535]). Inherited from frontend if null
	 * @param stickiness [required] Stickiness type. No stickiness if null
	 * @param displayName [required] Human readable name for your backend, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhBackendHttp serviceName_http_farm_POST(String serviceName, OvhBalanceHTTPEnum balance, String zone, OvhBackendProbe probe, Long port, OvhStickinessHTTPEnum stickiness, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "balance", balance);
		addBody(o, "zone", zone);
		addBody(o, "probe", probe);
		addBody(o, "port", port);
		addBody(o, "stickiness", stickiness);
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackendHttp.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/http/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public OvhBackendHttp serviceName_http_farm_farmId_GET(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}";
		StringBuilder sb = path(qPath, serviceName, farmId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackendHttp.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/http/farm/{farmId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public void serviceName_http_farm_farmId_PUT(String serviceName, Long farmId, OvhBackendHttp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}";
		StringBuilder sb = path(qPath, serviceName, farmId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete an HTTP Farm
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/http/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public void serviceName_http_farm_farmId_DELETE(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}";
		StringBuilder sb = path(qPath, serviceName, farmId);
		exec(qPath, "DELETE", sb.toString(), null);
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
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_http_farm_farmId_server_GET(String serviceName, Long farmId, String address, String cookie, OvhBackendCustomerServerStatusEnum status) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server";
		StringBuilder sb = path(qPath, serviceName, farmId);
		query(sb, "address", address);
		query(sb, "cookie", cookie);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a server to an HTTP Farm
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/http/farm/{farmId}/server
	 * @param ssl [required] SSL ciphering. Probes will also be sent ciphered. Set to 'false' if null
	 * @param status [required] Enable or disable your server
	 * @param cookie [required] Set the cookie value used when 'cookie' stickiness is set in the farm. Auto generate the cookie if none provided and required.
	 * @param port [required] Port attached to your server ([1..65535]). Inherited from farm if null
	 * @param proxyProtocolVersion [required] Disabled if null. Send PROXY protocol header. Requires a compatible server.
	 * @param chain [required] Certificate chain. Allow server certificate verification (Avoid man-in-the-middle attacks)
	 * @param weight [required] Server priority ([0..255]. 0 if null. Servers with higher weight get more requests.
	 * @param address [required] Address of your server
	 * @param backup [required] Set server as backup. Set to 'false' if null
	 * @param probe [required] Enable/disable probe. Set to 'false' if null
	 * @param displayName [required] Human readable name for your server, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public OvhBackendHTTPServer serviceName_http_farm_farmId_server_POST(String serviceName, Long farmId, Boolean ssl, OvhBackendCustomerServerStatusEnum status, String cookie, Long port, OvhProxyProtocolVersionEnum proxyProtocolVersion, String chain, Long weight, String address, Boolean backup, Boolean probe, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server";
		StringBuilder sb = path(qPath, serviceName, farmId);
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
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackendHTTPServer.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 *
	 * API beta
	 */
	public OvhBackendHTTPServer serviceName_http_farm_farmId_server_serverId_GET(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}";
		StringBuilder sb = path(qPath, serviceName, farmId, serverId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackendHTTPServer.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 *
	 * API beta
	 */
	public void serviceName_http_farm_farmId_server_serverId_PUT(String serviceName, Long farmId, Long serverId, OvhBackendHTTPServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}";
		StringBuilder sb = path(qPath, serviceName, farmId, serverId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a server from an HTTP Farm
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 *
	 * API beta
	 */
	public void serviceName_http_farm_farmId_server_serverId_DELETE(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/http/farm/{farmId}/server/{serverId}";
		StringBuilder sb = path(qPath, serviceName, farmId, serverId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get the effective state of your IPLB instances on IPLB servers
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/instancesState
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<OvhInstancesState> serviceName_instancesState_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/instancesState";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhInstancesState>> t3 = new TypeReference<ArrayList<OvhInstancesState>>() {};

	/**
	 * Apply the configuration to your iplb
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/refresh
	 * @param zone [required] The zone(s) of your iplb
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhTask serviceName_refresh_POST(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/refresh";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zone", zone);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Order a free certificate. We order and deliver it for you
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/freeCertificate
	 * @param fqdn [required] The FQDN for which you want a free certificate. A DCV (Domain Control Validation) http request will be made to http://your_domain.abc, make sure this domain exists and resolves to your iplb ip before ordering
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhTask serviceName_freeCertificate_POST(String serviceName, String[] fqdn) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/freeCertificate";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "fqdn", fqdn);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_udp_frontend_GET(String serviceName, Long defaultFarmId, String port, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "defaultFarmId", defaultFarmId);
		query(sb, "port", port);
		query(sb, "zone", zone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new UDP frontend on your IP Load Balancing
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/udp/frontend
	 * @param disabled [required] Disable your frontend. Set to 'false' if null
	 * @param defaultFarmId [required] Default UDP Farm of your frontend
	 * @param zone [required] Zone of your frontend. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param dedicatedIpfo [required] Only attach frontend on these ip. No restriction if null
	 * @param port [required] Listening port(s) of your server. Supported format: '\d+(,\d+)+' or '\d+-\d+'.
	 * @param displayName [required] Human readable name for your frontend, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhFrontendUdp serviceName_udp_frontend_POST(String serviceName, Boolean disabled, Long defaultFarmId, String zone, String[] dedicatedIpfo, String port, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "disabled", disabled);
		addBody(o, "defaultFarmId", defaultFarmId);
		addBody(o, "zone", zone);
		addBody(o, "dedicatedIpfo", dedicatedIpfo);
		addBody(o, "port", port);
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhFrontendUdp.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 *
	 * API beta
	 */
	public OvhFrontendUdp serviceName_udp_frontend_frontendId_GET(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}";
		StringBuilder sb = path(qPath, serviceName, frontendId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFrontendUdp.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 *
	 * API beta
	 */
	public void serviceName_udp_frontend_frontendId_PUT(String serviceName, Long frontendId, OvhFrontendUdp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}";
		StringBuilder sb = path(qPath, serviceName, frontendId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete an UDP frontend
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 *
	 * API beta
	 */
	public void serviceName_udp_frontend_frontendId_DELETE(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/frontend/{frontendId}";
		StringBuilder sb = path(qPath, serviceName, frontendId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * UDP Farm for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/farm
	 * @param zone [required] Filter the value of zone property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_udp_farm_GET(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "zone", zone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new UDP Farm on your IP Load Balancing
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/udp/farm
	 * @param zone [required] Zone of your farm
	 * @param port [required] Port attached to your farm ([1..65535]). Inherited from frontend if null
	 * @param displayName [required] Human readable name for your backend, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhBackendUdp serviceName_udp_farm_POST(String serviceName, String zone, Long port, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zone", zone);
		addBody(o, "port", port);
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackendUdp.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public OvhBackendUdp serviceName_udp_farm_farmId_GET(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}";
		StringBuilder sb = path(qPath, serviceName, farmId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackendUdp.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/udp/farm/{farmId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public void serviceName_udp_farm_farmId_PUT(String serviceName, Long farmId, OvhBackendUdp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}";
		StringBuilder sb = path(qPath, serviceName, farmId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete an UDP Farm
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/udp/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public void serviceName_udp_farm_farmId_DELETE(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}";
		StringBuilder sb = path(qPath, serviceName, farmId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * UDP Farm's Servers
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server
	 * @param status [required] Filter the value of status property (=)
	 * @param address [required] Filter the value of address property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_udp_farm_farmId_server_GET(String serviceName, Long farmId, String address, OvhBackendCustomerServerStatusEnum status) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server";
		StringBuilder sb = path(qPath, serviceName, farmId);
		query(sb, "address", address);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a server to an UDP Farm
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server
	 * @param status [required] Enable or disable your server
	 * @param address [required] Address of your server
	 * @param port [required] Port attached to your server ([1..65535]). Inherited from farm if null
	 * @param displayName [required] Human readable name for your server, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public OvhBackendServer serviceName_udp_farm_farmId_server_POST(String serviceName, Long farmId, OvhBackendCustomerServerStatusEnum status, String address, Long port, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server";
		StringBuilder sb = path(qPath, serviceName, farmId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "status", status);
		addBody(o, "address", address);
		addBody(o, "port", port);
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackendServer.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 *
	 * API beta
	 */
	public OvhBackendUDPServer serviceName_udp_farm_farmId_server_serverId_GET(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}";
		StringBuilder sb = path(qPath, serviceName, farmId, serverId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackendUDPServer.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 *
	 * API beta
	 */
	public void serviceName_udp_farm_farmId_server_serverId_PUT(String serviceName, Long farmId, Long serverId, OvhBackendUDPServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}";
		StringBuilder sb = path(qPath, serviceName, farmId, serverId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a server from an UDP Farm
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 *
	 * API beta
	 */
	public void serviceName_udp_farm_farmId_server_serverId_DELETE(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/udp/farm/{farmId}/server/{serverId}";
		StringBuilder sb = path(qPath, serviceName, farmId, serverId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Available route actions
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/availableRouteActions
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<OvhRouteAvailableAction> serviceName_availableRouteActions_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/availableRouteActions";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhRouteAvailableAction>> t4 = new TypeReference<ArrayList<OvhRouteAvailableAction>>() {};

	/**
	 * Servers for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/server
	 * @param status [required] Filter the value of status property (=)
	 * @param zone [required] Filter the value of zone property (=)
	 * @param address [required] Filter the value of address property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @deprecated
	 */
	public ArrayList<Long> serviceName_server_GET(String serviceName, String address, OvhCustomerServerStatusEnum status, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "address", address);
		query(sb, "status", status);
		query(sb, "zone", zone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new server on your iplb
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/server
	 * @param status [required] Status of your server
	 * @param address [required] Address of your server
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @deprecated
	 */
	public OvhCustomerServer serviceName_server_POST(String serviceName, OvhCustomerServerStatusEnum status, String address) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "status", status);
		addBody(o, "address", address);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhCustomerServer.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/server/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your server
	 * @deprecated
	 */
	public OvhCustomerServer serviceName_server_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCustomerServer.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/server/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your server
	 * @deprecated
	 */
	public void serviceName_server_id_PUT(String serviceName, Long id, OvhCustomerServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a server
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/server/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your server
	 * @deprecated
	 */
	public void serviceName_server_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/server/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Available route match rules
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/availableRouteRules
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<OvhRouteAvailableRule> serviceName_availableRouteRules_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/availableRouteRules";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhRouteAvailableRule>> t5 = new TypeReference<ArrayList<OvhRouteAvailableRule>>() {};

	/**
	 * List of servers you can attach to your iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/allowedServers
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @deprecated
	 */
	public ArrayList<net.minidev.ovh.api.ip.OvhIp> serviceName_allowedServers_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/allowedServers";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<net.minidev.ovh.api.ip.OvhIp>> t6 = new TypeReference<ArrayList<net.minidev.ovh.api.ip.OvhIp>>() {};

	/**
	 * Available farm types
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/availableFarmType
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_availableFarmType_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/availableFarmType";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_ssl_GET(String serviceName, String fingerprint, String serial, OvhSslTypeEnum type) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/ssl";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "fingerprint", fingerprint);
		query(sb, "serial", serial);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new custom SSL certificate on your IP Load Balancing
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/ssl
	 * @param chain [required] Certificate chain
	 * @param certificate [required] Certificate
	 * @param key [required] Certificate key
	 * @param displayName [required] Human readable name for your ssl certificate, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhSsl serviceName_ssl_POST(String serviceName, String chain, String certificate, String key, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/ssl";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "chain", chain);
		addBody(o, "certificate", certificate);
		addBody(o, "key", key);
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/ssl/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your SSL certificate
	 *
	 * API beta
	 */
	public OvhSsl serviceName_ssl_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/ssl/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/ssl/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your SSL certificate
	 *
	 * API beta
	 */
	public void serviceName_ssl_id_PUT(String serviceName, Long id, OvhSsl body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/ssl/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a custom SSL certificate
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/ssl/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of your SSL certificate
	 *
	 * API beta
	 */
	public void serviceName_ssl_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/ssl/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * List of defined frontends, and whether they are HTTP, TCP or UDP
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/definedFrontends
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<OvhDefinedFrontend> serviceName_definedFrontends_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/definedFrontends";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhDefinedFrontend>> t7 = new TypeReference<ArrayList<OvhDefinedFrontend>>() {};

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/confirmTermination";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_tcp_frontend_GET(String serviceName, Long defaultFarmId, String port, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "defaultFarmId", defaultFarmId);
		query(sb, "port", port);
		query(sb, "zone", zone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new TCP frontend on your IP Load Balancing
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/tcp/frontend
	 * @param defaultSslId [required] Default ssl served to your customer
	 * @param disabled [required] Disable your frontend. Set to 'false' if null
	 * @param ssl [required] SSL deciphering. Set to 'false' if null
	 * @param zone [required] Zone of your frontend. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param dedicatedIpfo [required] Only attach frontend on these ip. No restriction if null
	 * @param allowedSource [required] Restrict IP Load Balancing access to these ip block. No restriction if null
	 * @param port [required] Listening port(s) of your server. Supported format: '\d+(,\d+)+' or '\d+-\d+'.
	 * @param defaultFarmId [required] Default TCP Farm of your frontend
	 * @param displayName [required] Human readable name for your frontend, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhFrontendTcp serviceName_tcp_frontend_POST(String serviceName, Long defaultSslId, Boolean disabled, Boolean ssl, String zone, String[] dedicatedIpfo, String[] allowedSource, String port, Long defaultFarmId, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "defaultSslId", defaultSslId);
		addBody(o, "disabled", disabled);
		addBody(o, "ssl", ssl);
		addBody(o, "zone", zone);
		addBody(o, "dedicatedIpfo", dedicatedIpfo);
		addBody(o, "allowedSource", allowedSource);
		addBody(o, "port", port);
		addBody(o, "defaultFarmId", defaultFarmId);
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhFrontendTcp.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 *
	 * API beta
	 */
	public OvhFrontendTcp serviceName_tcp_frontend_frontendId_GET(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}";
		StringBuilder sb = path(qPath, serviceName, frontendId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFrontendTcp.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 *
	 * API beta
	 */
	public void serviceName_tcp_frontend_frontendId_PUT(String serviceName, Long frontendId, OvhFrontendTcp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}";
		StringBuilder sb = path(qPath, serviceName, frontendId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete an TCP frontend
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param frontendId [required] Id of your frontend
	 *
	 * API beta
	 */
	public void serviceName_tcp_frontend_frontendId_DELETE(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/frontend/{frontendId}";
		StringBuilder sb = path(qPath, serviceName, frontendId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * TCP routes for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/route
	 * @param frontendId [required] Filter the value of frontendId property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_tcp_route_GET(String serviceName, Long frontendId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "frontendId", frontendId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new TCP route to your frontend
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/tcp/route
	 * @param action [required] Action triggered when all rules match
	 * @param weight [required] Route priority ([0..255]). 0 if null. Highest priority routes are evaluated first. Only the first matching route will trigger an action
	 * @param frontendId [required] Route traffic for this frontend
	 * @param displayName [required] Human readable name for your route, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhRouteTcp serviceName_tcp_route_POST(String serviceName, OvhRouteTcpAction action, Long weight, Long frontendId, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		addBody(o, "weight", weight);
		addBody(o, "frontendId", frontendId);
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhRouteTcp.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/route/{routeId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public OvhRouteTcp serviceName_tcp_route_routeId_GET(String serviceName, Long routeId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route/{routeId}";
		StringBuilder sb = path(qPath, serviceName, routeId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRouteTcp.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/tcp/route/{routeId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public void serviceName_tcp_route_routeId_PUT(String serviceName, Long routeId, OvhRouteTcp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route/{routeId}";
		StringBuilder sb = path(qPath, serviceName, routeId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete this TCP route
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/tcp/route/{routeId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public void serviceName_tcp_route_routeId_DELETE(String serviceName, Long routeId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route/{routeId}";
		StringBuilder sb = path(qPath, serviceName, routeId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * HTTP routes for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_tcp_route_routeId_rule_GET(String serviceName, Long routeId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule";
		StringBuilder sb = path(qPath, serviceName, routeId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new rule to your route
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule
	 * @param pattern [required] Value to match against this match. Interpretation if this field depends on the match and field
	 * @param match [required] Matching operator. Not all operators are available for all fields. See "/availableRules"
	 * @param subField [required] Name of sub-field, if applicable. This may be a Cookie or Header name for instance
	 * @param negate [required] Invert the matching operator effect
	 * @param field [required] Name of the field to match like "protocol" or "host". See "/ipLoadbalancing/{serviceName}/route/availableRules" for a list of available rules
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 *
	 * API beta
	 */
	public OvhRouteRule serviceName_tcp_route_routeId_rule_POST(String serviceName, Long routeId, String pattern, OvhRouteRuleMatchesEnum match, String subField, Boolean negate, String field) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule";
		StringBuilder sb = path(qPath, serviceName, routeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "pattern", pattern);
		addBody(o, "match", match);
		addBody(o, "subField", subField);
		addBody(o, "negate", negate);
		addBody(o, "field", field);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhRouteRule.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule/{ruleId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 * @param ruleId [required] Id of your rule
	 *
	 * API beta
	 */
	public OvhRouteRule serviceName_tcp_route_routeId_rule_ruleId_GET(String serviceName, Long routeId, Long ruleId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, serviceName, routeId, ruleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRouteRule.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule/{ruleId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 * @param ruleId [required] Id of your rule
	 *
	 * API beta
	 */
	public void serviceName_tcp_route_routeId_rule_ruleId_PUT(String serviceName, Long routeId, Long ruleId, OvhRouteRule body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, serviceName, routeId, ruleId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete this rule from the route
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule/{ruleId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param routeId [required] Id of your route
	 * @param ruleId [required] Id of your rule
	 *
	 * API beta
	 */
	public void serviceName_tcp_route_routeId_rule_ruleId_DELETE(String serviceName, Long routeId, Long ruleId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/route/{routeId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, serviceName, routeId, ruleId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * TCP Farm for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/farm
	 * @param zone [required] Filter the value of zone property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_tcp_farm_GET(String serviceName, String zone) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "zone", zone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new TCP Farm on your IP Load Balancing
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/tcp/farm
	 * @param balance [required] Load balancing algorithm. 'roundrobin' if null
	 * @param zone [required] Zone of your farm
	 * @param probe [required] Probe used to determine if a backend is alive and can handle requests
	 * @param port [required] Port attached to your farm ([1..65535]). Inherited from frontend if null
	 * @param stickiness [required] Stickiness type. No stickiness if null
	 * @param displayName [required] Human readable name for your backend, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public OvhBackendTcp serviceName_tcp_farm_POST(String serviceName, OvhBalanceTCPEnum balance, String zone, OvhBackendProbe probe, Long port, OvhStickinessTCPEnum stickiness, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "balance", balance);
		addBody(o, "zone", zone);
		addBody(o, "probe", probe);
		addBody(o, "port", port);
		addBody(o, "stickiness", stickiness);
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackendTcp.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public OvhBackendTcp serviceName_tcp_farm_farmId_GET(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}";
		StringBuilder sb = path(qPath, serviceName, farmId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackendTcp.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public void serviceName_tcp_farm_farmId_PUT(String serviceName, Long farmId, OvhBackendTcp body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}";
		StringBuilder sb = path(qPath, serviceName, farmId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a TCP Farm
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public void serviceName_tcp_farm_farmId_DELETE(String serviceName, Long farmId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}";
		StringBuilder sb = path(qPath, serviceName, farmId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * TCP Farm's Servers
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server
	 * @param status [required] Filter the value of status property (=)
	 * @param address [required] Filter the value of address property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_tcp_farm_farmId_server_GET(String serviceName, Long farmId, String address, OvhBackendCustomerServerStatusEnum status) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server";
		StringBuilder sb = path(qPath, serviceName, farmId);
		query(sb, "address", address);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a server to a TCP Farm
	 *
	 * REST: POST /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server
	 * @param ssl [required] SSL ciphering. Probes will also be sent ciphered. Set to 'false' if null
	 * @param status [required] Enable or disable your server
	 * @param port [required] Port attached to your server ([1..65535]). Inherited from farm if null
	 * @param proxyProtocolVersion [required] Disabled if null. Send PROXY protocol header. Requires a compatible server.
	 * @param chain [required] Certificate chain. Allow server certificate verification (Avoid man-in-the-middle attacks)
	 * @param weight [required] Server priority ([0..255]. 0 if null. Servers with higher weight get more requests.
	 * @param address [required] Address of your server
	 * @param backup [required] Set server as backup. Set to 'false' if null
	 * @param probe [required] Enable/disable probe. Set to 'false' if null
	 * @param displayName [required] Human readable name for your server, this field is for you
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 *
	 * API beta
	 */
	public OvhBackendServer serviceName_tcp_farm_farmId_server_POST(String serviceName, Long farmId, Boolean ssl, OvhBackendCustomerServerStatusEnum status, Long port, OvhProxyProtocolVersionEnum proxyProtocolVersion, String chain, Long weight, String address, Boolean backup, Boolean probe, String displayName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server";
		StringBuilder sb = path(qPath, serviceName, farmId);
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
		addBody(o, "displayName", displayName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackendServer.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 *
	 * API beta
	 */
	public OvhBackendTCPServer serviceName_tcp_farm_farmId_server_serverId_GET(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}";
		StringBuilder sb = path(qPath, serviceName, farmId, serverId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackendTCPServer.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 *
	 * API beta
	 */
	public void serviceName_tcp_farm_farmId_server_serverId_PUT(String serviceName, Long farmId, Long serverId, OvhBackendTCPServer body) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}";
		StringBuilder sb = path(qPath, serviceName, farmId, serverId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a server from a TCP Farm
	 *
	 * REST: DELETE /ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param farmId [required] Id of your farm
	 * @param serverId [required] Id of your server
	 *
	 * API beta
	 */
	public void serviceName_tcp_farm_farmId_server_serverId_DELETE(String serviceName, Long farmId, Long serverId) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/tcp/farm/{farmId}/server/{serverId}";
		StringBuilder sb = path(qPath, serviceName, farmId, serverId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Task for this iplb
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/task
	 * @param action [required] Filter the value of action property (=)
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskActionEnum action) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "action", action);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/task/{id}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param id [required] Id of the operation
	 *
	 * API beta
	 */
	public OvhTask serviceName_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/task/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of defined routes, and whether they are HTTP or TCP
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/definedRoutes
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<OvhDefinedRoute> serviceName_definedRoutes_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/definedRoutes";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhDefinedRoute>> t8 = new TypeReference<ArrayList<OvhDefinedRoute>>() {};

	/**
	 * List of defined farms, and whether they are HTTP, TCP or UDP
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/definedFarms
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<OvhDefinedBackend> serviceName_definedFarms_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/definedFarms";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhDefinedBackend>> t9 = new TypeReference<ArrayList<OvhDefinedBackend>>() {};

	/**
	 * Available frontend type
	 *
	 * REST: GET /ipLoadbalancing/{serviceName}/availableFrontendType
	 * @param serviceName [required] The internal name of your IP load balancing
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_availableFrontendType_GET(String serviceName) throws IOException {
		String qPath = "/ipLoadbalancing/{serviceName}/availableFrontendType";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * List available services
	 *
	 * REST: GET /ipLoadbalancing
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/ipLoadbalancing";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * List of zone available for an IP load balancing
	 *
	 * REST: GET /ipLoadbalancing/availableZones
	 *
	 * API beta
	 */
	public ArrayList<String> availableZones_GET() throws IOException {
		String qPath = "/ipLoadbalancing/availableZones";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
