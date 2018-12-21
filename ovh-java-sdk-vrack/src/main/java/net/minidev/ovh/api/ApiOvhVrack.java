package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.dedicated.server.OvhMrtgPeriodEnum;
import net.minidev.ovh.api.dedicated.server.OvhMrtgTimestampValue;
import net.minidev.ovh.api.dedicated.server.OvhMrtgTypeEnum;
import net.minidev.ovh.api.services.OvhNonExpiringService;
import net.minidev.ovh.api.vrack.OvhAllowedDedicatedServerInterfaces;
import net.minidev.ovh.api.vrack.OvhAllowedServices;
import net.minidev.ovh.api.vrack.OvhCloudProject;
import net.minidev.ovh.api.vrack.OvhDedicatedCloud;
import net.minidev.ovh.api.vrack.OvhDedicatedConnect;
import net.minidev.ovh.api.vrack.OvhDedicatedServer;
import net.minidev.ovh.api.vrack.OvhDedicatedServerInterface;
import net.minidev.ovh.api.vrack.OvhIp;
import net.minidev.ovh.api.vrack.OvhIplb;
import net.minidev.ovh.api.vrack.OvhLegacyVrack;
import net.minidev.ovh.api.vrack.OvhPccDatacenter;
import net.minidev.ovh.api.vrack.OvhTask;
import net.minidev.ovh.api.vrack.OvhVrack;
import net.minidev.ovh.api.vrack.OvhVrackZoneEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/vrack
 * version:1.0
 */
public class ApiOvhVrack extends ApiOvhBase {
	public ApiOvhVrack(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /vrack
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/vrack";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Retrieve vrack traffic graph values
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedServer/{dedicatedServer}/mrtg
	 * @param type [required] mrtg type
	 * @param period [required] mrtg period
	 * @param serviceName [required] The internal name of your vrack
	 * @param dedicatedServer [required] Dedicated Server
	 * @deprecated
	 */
	public ArrayList<OvhMrtgTimestampValue> serviceName_dedicatedServer_dedicatedServer_mrtg_GET(String serviceName, String dedicatedServer, OvhMrtgPeriodEnum period, OvhMrtgTypeEnum type) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServer/{dedicatedServer}/mrtg";
		StringBuilder sb = path(qPath, serviceName, dedicatedServer);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhMrtgTimestampValue>> t2 = new TypeReference<ArrayList<OvhMrtgTimestampValue>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedServer/{dedicatedServer}
	 * @param serviceName [required] The internal name of your vrack
	 * @param dedicatedServer [required] Dedicated Server
	 */
	public OvhDedicatedServer serviceName_dedicatedServer_dedicatedServer_GET(String serviceName, String dedicatedServer) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServer/{dedicatedServer}";
		StringBuilder sb = path(qPath, serviceName, dedicatedServer);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDedicatedServer.class);
	}

	/**
	 * remove this server from this vrack
	 *
	 * REST: DELETE /vrack/{serviceName}/dedicatedServer/{dedicatedServer}
	 * @param serviceName [required] The internal name of your vrack
	 * @param dedicatedServer [required] Dedicated Server
	 */
	public OvhTask serviceName_dedicatedServer_dedicatedServer_DELETE(String serviceName, String dedicatedServer) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServer/{dedicatedServer}";
		StringBuilder sb = path(qPath, serviceName, dedicatedServer);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * vrack for dedicated server
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedServer
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<String> serviceName_dedicatedServer_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServer";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * add a dedicated server to this vrack
	 *
	 * REST: POST /vrack/{serviceName}/dedicatedServer
	 * @param dedicatedServer [required] Dedicated server to add
	 * @param serviceName [required] The internal name of your vrack
	 */
	public OvhTask serviceName_dedicatedServer_POST(String serviceName, String dedicatedServer) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServer";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dedicatedServer", dedicatedServer);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * vrack tasks
	 *
	 * REST: GET /vrack/{serviceName}/task
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/task/{taskId}
	 * @param serviceName [required] The internal name of your vrack
	 * @param taskId [required]
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/vrack/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your vrack
	 *
	 * API beta
	 */
	public OvhNonExpiringService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNonExpiringService.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedConnect/{name}
	 * @param serviceName [required] The internal name of your vrack
	 * @param name [required] A name for your dedicatedConnect link
	 */
	public OvhDedicatedConnect serviceName_dedicatedConnect_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedConnect/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDedicatedConnect.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /vrack/{serviceName}/dedicatedConnect/{name}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your vrack
	 * @param name [required] A name for your dedicatedConnect link
	 */
	public void serviceName_dedicatedConnect_name_PUT(String serviceName, String name, OvhDedicatedConnect body) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedConnect/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * vrack dedicated connect
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedConnect
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<String> serviceName_dedicatedConnect_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedConnect";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/ip/{ip}
	 * @param serviceName [required] The internal name of your vrack
	 * @param ip [required] Your IP block
	 */
	public OvhIp serviceName_ip_ip_GET(String serviceName, String ip) throws IOException {
		String qPath = "/vrack/{serviceName}/ip/{ip}";
		StringBuilder sb = path(qPath, serviceName, ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIp.class);
	}

	/**
	 * remove this IP block from this vrack
	 *
	 * REST: DELETE /vrack/{serviceName}/ip/{ip}
	 * @param serviceName [required] The internal name of your vrack
	 * @param ip [required] Your IP block
	 */
	public OvhTask serviceName_ip_ip_DELETE(String serviceName, String ip) throws IOException {
		String qPath = "/vrack/{serviceName}/ip/{ip}";
		StringBuilder sb = path(qPath, serviceName, ip);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Zone available to announce your block
	 *
	 * REST: GET /vrack/{serviceName}/ip/{ip}/availableZone
	 * @param serviceName [required] The internal name of your vrack
	 * @param ip [required] Your IP block
	 */
	public ArrayList<OvhVrackZoneEnum> serviceName_ip_ip_availableZone_GET(String serviceName, String ip) throws IOException {
		String qPath = "/vrack/{serviceName}/ip/{ip}/availableZone";
		StringBuilder sb = path(qPath, serviceName, ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhVrackZoneEnum>> t4 = new TypeReference<ArrayList<OvhVrackZoneEnum>>() {};

	/**
	 * Announce IP to zone for vrack
	 *
	 * REST: POST /vrack/{serviceName}/ip/{ip}/announceInZone
	 * @param zone [required] Zone to announce in
	 * @param serviceName [required] The internal name of your vrack
	 * @param ip [required] Your IP block
	 */
	public OvhTask serviceName_ip_ip_announceInZone_POST(String serviceName, String ip, OvhVrackZoneEnum zone) throws IOException {
		String qPath = "/vrack/{serviceName}/ip/{ip}/announceInZone";
		StringBuilder sb = path(qPath, serviceName, ip);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zone", zone);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * vrack for IP blocks
	 *
	 * REST: GET /vrack/{serviceName}/ip
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<String> serviceName_ip_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/ip";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * add an IP block to this vrack
	 *
	 * REST: POST /vrack/{serviceName}/ip
	 * @param block [required] Your IP block
	 * @param serviceName [required] The internal name of your vrack
	 */
	public OvhTask serviceName_ip_POST(String serviceName, String block) throws IOException {
		String qPath = "/vrack/{serviceName}/ip";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "block", block);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/legacyVrack/{legacyVrack}
	 * @param serviceName [required] The internal name of your vrack
	 * @param legacyVrack [required] your legacy vrack service
	 */
	public OvhLegacyVrack serviceName_legacyVrack_legacyVrack_GET(String serviceName, String legacyVrack) throws IOException {
		String qPath = "/vrack/{serviceName}/legacyVrack/{legacyVrack}";
		StringBuilder sb = path(qPath, serviceName, legacyVrack);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhLegacyVrack.class);
	}

	/**
	 * remove this legacy vrack (vrackXXXX) from this vrack (pn-XXXX)
	 *
	 * REST: DELETE /vrack/{serviceName}/legacyVrack/{legacyVrack}
	 * @param serviceName [required] The internal name of your vrack
	 * @param legacyVrack [required] your legacy vrack service
	 */
	public OvhTask serviceName_legacyVrack_legacyVrack_DELETE(String serviceName, String legacyVrack) throws IOException {
		String qPath = "/vrack/{serviceName}/legacyVrack/{legacyVrack}";
		StringBuilder sb = path(qPath, serviceName, legacyVrack);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * vrack for legacy vrack
	 *
	 * REST: GET /vrack/{serviceName}/legacyVrack
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<String> serviceName_legacyVrack_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/legacyVrack";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * add a legacy vrack (vrackXXXX) to this vrack (pn-XXXX)
	 *
	 * REST: POST /vrack/{serviceName}/legacyVrack
	 * @param legacyVrack [required]
	 * @param serviceName [required] The internal name of your vrack
	 */
	public OvhTask serviceName_legacyVrack_POST(String serviceName, String legacyVrack) throws IOException {
		String qPath = "/vrack/{serviceName}/legacyVrack";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "legacyVrack", legacyVrack);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * vrack for dedicated server interface
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedServerInterface
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<String> serviceName_dedicatedServerInterface_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServerInterface";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * add a dedicated server interface to this vrack
	 *
	 * REST: POST /vrack/{serviceName}/dedicatedServerInterface
	 * @param dedicatedServerInterface [required] Dedicated server interface to add
	 * @param serviceName [required] The internal name of your vrack
	 */
	public OvhTask serviceName_dedicatedServerInterface_POST(String serviceName, String dedicatedServerInterface) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServerInterface";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dedicatedServerInterface", dedicatedServerInterface);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedServerInterface/{dedicatedServerInterface}
	 * @param serviceName [required] The internal name of your vrack
	 * @param dedicatedServerInterface [required] Dedicated Server Interface
	 */
	public OvhDedicatedServerInterface serviceName_dedicatedServerInterface_dedicatedServerInterface_GET(String serviceName, String dedicatedServerInterface) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServerInterface/{dedicatedServerInterface}";
		StringBuilder sb = path(qPath, serviceName, dedicatedServerInterface);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDedicatedServerInterface.class);
	}

	/**
	 * remove this server interface from this vrack
	 *
	 * REST: DELETE /vrack/{serviceName}/dedicatedServerInterface/{dedicatedServerInterface}
	 * @param serviceName [required] The internal name of your vrack
	 * @param dedicatedServerInterface [required] Dedicated Server Interface
	 */
	public OvhTask serviceName_dedicatedServerInterface_dedicatedServerInterface_DELETE(String serviceName, String dedicatedServerInterface) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServerInterface/{dedicatedServerInterface}";
		StringBuilder sb = path(qPath, serviceName, dedicatedServerInterface);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * vrack for ipLoadbalancing
	 *
	 * REST: GET /vrack/{serviceName}/ipLoadbalancing
	 * @param serviceName [required] The internal name of your vrack
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_ipLoadbalancing_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/ipLoadbalancing";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * add an ipLoadbalancing to this vrack
	 *
	 * REST: POST /vrack/{serviceName}/ipLoadbalancing
	 * @param ipLoadbalancing [required] Your ipLoadbalancing
	 * @param serviceName [required] The internal name of your vrack
	 *
	 * API beta
	 */
	public OvhTask serviceName_ipLoadbalancing_POST(String serviceName, String ipLoadbalancing) throws IOException {
		String qPath = "/vrack/{serviceName}/ipLoadbalancing";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipLoadbalancing", ipLoadbalancing);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/ipLoadbalancing/{ipLoadbalancing}
	 * @param serviceName [required] The internal name of your vrack
	 * @param ipLoadbalancing [required] Your ipLoadbalancing
	 *
	 * API beta
	 */
	public OvhIplb serviceName_ipLoadbalancing_ipLoadbalancing_GET(String serviceName, String ipLoadbalancing) throws IOException {
		String qPath = "/vrack/{serviceName}/ipLoadbalancing/{ipLoadbalancing}";
		StringBuilder sb = path(qPath, serviceName, ipLoadbalancing);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIplb.class);
	}

	/**
	 * remove this ipLoadbalancing from this vrack
	 *
	 * REST: DELETE /vrack/{serviceName}/ipLoadbalancing/{ipLoadbalancing}
	 * @param serviceName [required] The internal name of your vrack
	 * @param ipLoadbalancing [required] Your ipLoadbalancing
	 *
	 * API beta
	 */
	public OvhTask serviceName_ipLoadbalancing_ipLoadbalancing_DELETE(String serviceName, String ipLoadbalancing) throws IOException {
		String qPath = "/vrack/{serviceName}/ipLoadbalancing/{ipLoadbalancing}";
		StringBuilder sb = path(qPath, serviceName, ipLoadbalancing);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/cloudProject/{project}
	 * @param serviceName [required] The internal name of your vrack
	 * @param project [required] publicCloud project
	 */
	public OvhCloudProject serviceName_cloudProject_project_GET(String serviceName, String project) throws IOException {
		String qPath = "/vrack/{serviceName}/cloudProject/{project}";
		StringBuilder sb = path(qPath, serviceName, project);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCloudProject.class);
	}

	/**
	 * remove this publicCloud project from this vrack
	 *
	 * REST: DELETE /vrack/{serviceName}/cloudProject/{project}
	 * @param serviceName [required] The internal name of your vrack
	 * @param project [required] publicCloud project
	 */
	public OvhTask serviceName_cloudProject_project_DELETE(String serviceName, String project) throws IOException {
		String qPath = "/vrack/{serviceName}/cloudProject/{project}";
		StringBuilder sb = path(qPath, serviceName, project);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * vrack for publicCloud project
	 *
	 * REST: GET /vrack/{serviceName}/cloudProject
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<String> serviceName_cloudProject_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/cloudProject";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * add a publicCloud project to this vrack
	 *
	 * REST: POST /vrack/{serviceName}/cloudProject
	 * @param project [required] publicCloud project to add
	 * @param serviceName [required] The internal name of your vrack
	 */
	public OvhTask serviceName_cloudProject_POST(String serviceName, String project) throws IOException {
		String qPath = "/vrack/{serviceName}/cloudProject";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "project", project);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Details for all dedicated server interfaces in this vrack
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedServerInterfaceDetails
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<OvhAllowedDedicatedServerInterfaces> serviceName_dedicatedServerInterfaceDetails_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedServerInterfaceDetails";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhAllowedDedicatedServerInterfaces>> t5 = new TypeReference<ArrayList<OvhAllowedDedicatedServerInterfaces>>() {};

	/**
	 * vrack dedicated cloud (VmNetwork)
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedCloud
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<String> serviceName_dedicatedCloud_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedCloud";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * add a dedicatedCloud (VmNetwork) to this vrack
	 *
	 * REST: POST /vrack/{serviceName}/dedicatedCloud
	 * @param dedicatedCloud [required]
	 * @param serviceName [required] The internal name of your vrack
	 */
	public OvhTask serviceName_dedicatedCloud_POST(String serviceName, String dedicatedCloud) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedCloud";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dedicatedCloud", dedicatedCloud);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedCloud/{dedicatedCloud}
	 * @param serviceName [required] The internal name of your vrack
	 * @param dedicatedCloud [required] your dedicated cloud service
	 */
	public OvhDedicatedCloud serviceName_dedicatedCloud_dedicatedCloud_GET(String serviceName, String dedicatedCloud) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedCloud/{dedicatedCloud}";
		StringBuilder sb = path(qPath, serviceName, dedicatedCloud);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDedicatedCloud.class);
	}

	/**
	 * remove this dedicatedCloud (VmNetwork) from this vrack
	 *
	 * REST: DELETE /vrack/{serviceName}/dedicatedCloud/{dedicatedCloud}
	 * @param serviceName [required] The internal name of your vrack
	 * @param dedicatedCloud [required] your dedicated cloud service
	 */
	public OvhTask serviceName_dedicatedCloud_dedicatedCloud_DELETE(String serviceName, String dedicatedCloud) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedCloud/{dedicatedCloud}";
		StringBuilder sb = path(qPath, serviceName, dedicatedCloud);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * vrack dedicated cloud datacenter
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedCloudDatacenter
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<String> serviceName_dedicatedCloudDatacenter_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedCloudDatacenter";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedCloudDatacenter/{datacenter}
	 * @param serviceName [required] The internal name of your vrack
	 * @param datacenter [required] Your dedicatedCloud datacenter name
	 */
	public OvhPccDatacenter serviceName_dedicatedCloudDatacenter_datacenter_GET(String serviceName, String datacenter) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedCloudDatacenter/{datacenter}";
		StringBuilder sb = path(qPath, serviceName, datacenter);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPccDatacenter.class);
	}

	/**
	 * Move your dedicatedCloud datacenter from a Vrack to another
	 *
	 * REST: POST /vrack/{serviceName}/dedicatedCloudDatacenter/{datacenter}/move
	 * @param targetServiceName [required] The internal name of your target vrack
	 * @param serviceName [required] The internal name of your vrack
	 * @param datacenter [required] Your dedicatedCloud datacenter name
	 */
	public OvhTask serviceName_dedicatedCloudDatacenter_datacenter_move_POST(String serviceName, String datacenter, String targetServiceName) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedCloudDatacenter/{datacenter}/move";
		StringBuilder sb = path(qPath, serviceName, datacenter);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "targetServiceName", targetServiceName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Vracks allowed for your dedicatedCloud datacenter
	 *
	 * REST: GET /vrack/{serviceName}/dedicatedCloudDatacenter/{datacenter}/allowedVrack
	 * @param serviceName [required] The internal name of your vrack
	 * @param datacenter [required] Your dedicatedCloud datacenter name
	 */
	public ArrayList<String> serviceName_dedicatedCloudDatacenter_datacenter_allowedVrack_GET(String serviceName, String datacenter) throws IOException {
		String qPath = "/vrack/{serviceName}/dedicatedCloudDatacenter/{datacenter}/allowedVrack";
		StringBuilder sb = path(qPath, serviceName, datacenter);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * List all services allowed in this vrack
	 *
	 * REST: GET /vrack/{serviceName}/allowedServices
	 * @param serviceName [required] The internal name of your vrack
	 */
	public OvhAllowedServices serviceName_allowedServices_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}/allowedServices";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAllowedServices.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vrack/{serviceName}
	 * @param serviceName [required] The internal name of your vrack
	 */
	public OvhVrack serviceName_GET(String serviceName) throws IOException {
		String qPath = "/vrack/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVrack.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /vrack/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your vrack
	 */
	public void serviceName_PUT(String serviceName, OvhVrack body) throws IOException {
		String qPath = "/vrack/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}
}
