package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.dnssec.OvhKey;
import net.minidev.ovh.api.dnssec.OvhKeyFlagEnum;
import net.minidev.ovh.api.dnssec.OvhKeyStatusEnum;
import net.minidev.ovh.api.domain.OvhCurrentNameServer;
import net.minidev.ovh.api.domain.OvhDnssecKey;
import net.minidev.ovh.api.domain.OvhDomain;
import net.minidev.ovh.api.domain.OvhDomainNs;
import net.minidev.ovh.api.domain.OvhDomainNsStatus;
import net.minidev.ovh.api.domain.OvhGlueRecord;
import net.minidev.ovh.api.domain.OvhOperationStatusEnum;
import net.minidev.ovh.api.domain.OvhOwo;
import net.minidev.ovh.api.domain.OvhRule;
import net.minidev.ovh.api.domain.OvhTask;
import net.minidev.ovh.api.domain.OvhWhoisObfuscatorFieldsEnum;
import net.minidev.ovh.api.domain.data.OvhAfnicCorporationTrademarkContact;
import net.minidev.ovh.api.domain.data.OvhAssociationContact;
import net.minidev.ovh.api.domain.data.OvhProContact;
import net.minidev.ovh.api.domain.data.OvhSmd;
import net.minidev.ovh.api.domain.data.claimnotice.OvhClaimNotice;
import net.minidev.ovh.api.domain.zone.OvhDnssec;
import net.minidev.ovh.api.domain.zone.OvhDynHostLogin;
import net.minidev.ovh.api.domain.zone.OvhDynHostRecord;
import net.minidev.ovh.api.domain.zone.OvhRecord;
import net.minidev.ovh.api.domain.zone.OvhRedirection;
import net.minidev.ovh.api.domain.zone.OvhSoa;
import net.minidev.ovh.api.domain.zone.OvhZone;
import net.minidev.ovh.api.nichandle.OvhCountryEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.zone.OvhNamedResolutionFieldTypeEnum;
import net.minidev.ovh.api.zone.OvhRedirectionTypeEnum;
import net.minidev.ovh.api.zone.OvhResetRecord;
import net.minidev.ovh.api.zone.OvhStatus;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/domain
 * version:1.0
 */
public class ApiOvhDomain extends ApiOvhBase {
	public ApiOvhDomain(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your domain
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/domain/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /domain/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your domain
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/domain/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/{serviceName}
	 * @param serviceName [required] The internal name of your domain
	 */
	public OvhDomain serviceName_GET(String serviceName) throws IOException {
		String qPath = "/domain/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /domain/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your domain
	 */
	public void serviceName_PUT(String serviceName, OvhDomain body) throws IOException {
		String qPath = "/domain/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Return authInfo code if the domain is unlocked
	 * 
	 * REST: GET /domain/{serviceName}/authInfo
	 * @param serviceName [required] The internal name of your domain
	 */
	public String serviceName_authInfo_GET(String serviceName) throws IOException {
		String qPath = "/domain/{serviceName}/authInfo";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Activate the DNS zone for this domain
	 * 
	 * REST: POST /domain/{serviceName}/activateZone
	 * @param minimized [required] Create only mandatory records
	 * @param serviceName [required] The internal name of your domain
	 */
	public void serviceName_activateZone_POST(String serviceName, Boolean minimized) throws IOException {
		String qPath = "/domain/{serviceName}/activateZone";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "minimized", minimized);
		exec("POST", qPath, o);
	}

	/**
	 * Domain pending tasks
	 * 
	 * REST: GET /domain/{serviceName}/task
	 * @param function [required] Filter the value of function property (like)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your domain
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, String function, OvhOperationStatusEnum status) throws IOException {
		String qPath = "/domain/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/{serviceName}/task/{id}
	 * @param serviceName [required] The internal name of your domain
	 * @param id [required] Id of the object
	 */
	public OvhTask serviceName_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/domain/{serviceName}/task/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Relaunch the task
	 * 
	 * REST: POST /domain/{serviceName}/task/{id}/relaunch
	 * @param serviceName [required] The internal name of your domain
	 * @param id [required] Id of the object
	 */
	public void serviceName_task_id_relaunch_POST(String serviceName, Long id) throws IOException {
		String qPath = "/domain/{serviceName}/task/{id}/relaunch";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("POST", qPath);
	}

	/**
	 * Accelerate the task
	 * 
	 * REST: POST /domain/{serviceName}/task/{id}/accelerate
	 * @param serviceName [required] The internal name of your domain
	 * @param id [required] Id of the object
	 */
	public void serviceName_task_id_accelerate_POST(String serviceName, Long id) throws IOException {
		String qPath = "/domain/{serviceName}/task/{id}/accelerate";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("POST", qPath);
	}

	/**
	 * Cancel the task
	 * 
	 * REST: POST /domain/{serviceName}/task/{id}/cancel
	 * @param serviceName [required] The internal name of your domain
	 * @param id [required] Id of the object
	 */
	public void serviceName_task_id_cancel_POST(String serviceName, Long id) throws IOException {
		String qPath = "/domain/{serviceName}/task/{id}/cancel";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("POST", qPath);
	}

	/**
	 * List of whois obfuscators
	 * 
	 * REST: GET /domain/{serviceName}/owo
	 * @param field [required] Filter the value of field property (=)
	 * @param serviceName [required] The internal name of your domain
	 */
	public ArrayList<OvhWhoisObfuscatorFieldsEnum> serviceName_owo_GET(String serviceName, OvhWhoisObfuscatorFieldsEnum field) throws IOException {
		String qPath = "/domain/{serviceName}/owo";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "field", field);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhWhoisObfuscatorFieldsEnum>> t2 = new TypeReference<ArrayList<OvhWhoisObfuscatorFieldsEnum>>() {};

	/**
	 * Add whois obfuscators
	 * 
	 * REST: POST /domain/{serviceName}/owo
	 * @param fields [required] Fields to obfuscate
	 * @param serviceName [required] The internal name of your domain
	 */
	public ArrayList<OvhWhoisObfuscatorFieldsEnum> serviceName_owo_POST(String serviceName, OvhWhoisObfuscatorFieldsEnum[] fields) throws IOException {
		String qPath = "/domain/{serviceName}/owo";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "fields", fields);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/{serviceName}/owo/{field}
	 * @param serviceName [required] The internal name of your domain
	 * @param field [required] Obfuscated field
	 */
	public OvhOwo serviceName_owo_field_GET(String serviceName, net.minidev.ovh.api.domain.OvhWhoisObfuscatorFieldsEnum field) throws IOException {
		String qPath = "/domain/{serviceName}/owo/{field}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{field}", field.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOwo.class);
	}

	/**
	 * Delete a whois obfuscator
	 * 
	 * REST: DELETE /domain/{serviceName}/owo/{field}
	 * @param serviceName [required] The internal name of your domain
	 * @param field [required] Obfuscated field
	 */
	public void serviceName_owo_field_DELETE(String serviceName, net.minidev.ovh.api.domain.OvhWhoisObfuscatorFieldsEnum field) throws IOException {
		String qPath = "/domain/{serviceName}/owo/{field}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{field}", field.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /domain/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your domain
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/domain/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t1);
	}

	/**
	 * Schedule an outgoing transfer task for this domain (.uk only)
	 * 
	 * REST: POST /domain/{serviceName}/ukOutgoingTransfer
	 * @param tag [required] Tag of the new registrar
	 * @param serviceName [required] The internal name of your domain
	 */
	public OvhTask serviceName_ukOutgoingTransfer_POST(String serviceName, String tag) throws IOException {
		String qPath = "/domain/{serviceName}/ukOutgoingTransfer";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "tag", tag);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of glue record
	 * 
	 * REST: GET /domain/{serviceName}/glueRecord
	 * @param host [required] Filter the value of host property (like)
	 * @param serviceName [required] The internal name of your domain
	 */
	public ArrayList<String> serviceName_glueRecord_GET(String serviceName, String host) throws IOException {
		String qPath = "/domain/{serviceName}/glueRecord";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "host", host);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Create a glue record
	 * 
	 * REST: POST /domain/{serviceName}/glueRecord
	 * @param ips [required] Ips of the glue record
	 * @param host [required] Host of the glue record
	 * @param serviceName [required] The internal name of your domain
	 */
	public OvhTask serviceName_glueRecord_POST(String serviceName, String[] ips, String host) throws IOException {
		String qPath = "/domain/{serviceName}/glueRecord";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ips", ips);
		addBody(o, "host", host);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/{serviceName}/glueRecord/{host}
	 * @param serviceName [required] The internal name of your domain
	 * @param host [required] Host of the glue record
	 */
	public OvhGlueRecord serviceName_glueRecord_host_GET(String serviceName, String host) throws IOException {
		String qPath = "/domain/{serviceName}/glueRecord/{host}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{host}", host);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhGlueRecord.class);
	}

	/**
	 * Delete the glue record
	 * 
	 * REST: DELETE /domain/{serviceName}/glueRecord/{host}
	 * @param serviceName [required] The internal name of your domain
	 * @param host [required] Host of the glue record
	 */
	public OvhTask serviceName_glueRecord_host_DELETE(String serviceName, String host) throws IOException {
		String qPath = "/domain/{serviceName}/glueRecord/{host}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{host}", host);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Update the glue record
	 * 
	 * REST: POST /domain/{serviceName}/glueRecord/{host}/update
	 * @param ips [required] Ips of the glue record
	 * @param serviceName [required] The internal name of your domain
	 * @param host [required] Host of the glue record
	 */
	public OvhTask serviceName_glueRecord_host_update_POST(String serviceName, String host, String[] ips) throws IOException {
		String qPath = "/domain/{serviceName}/glueRecord/{host}/update";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{host}", host);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ips", ips);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of domain's DS Records
	 * 
	 * REST: GET /domain/{serviceName}/dsRecord
	 * @param flags [required] Filter the value of flags property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your domain
	 */
	public ArrayList<Long> serviceName_dsRecord_GET(String serviceName, OvhKeyFlagEnum flags, OvhKeyStatusEnum status) throws IOException {
		String qPath = "/domain/{serviceName}/dsRecord";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "flags", flags);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Update DS records
	 * 
	 * REST: POST /domain/{serviceName}/dsRecord
	 * @param keys [required] New Keys
	 * @param serviceName [required] The internal name of your domain
	 */
	public OvhTask serviceName_dsRecord_POST(String serviceName, OvhKey[] keys) throws IOException {
		String qPath = "/domain/{serviceName}/dsRecord";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "keys", keys);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/{serviceName}/dsRecord/{id}
	 * @param serviceName [required] The internal name of your domain
	 * @param id [required] Id of the object
	 */
	public OvhDnssecKey serviceName_dsRecord_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/domain/{serviceName}/dsRecord/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDnssecKey.class);
	}

	/**
	 * Update DNS servers
	 * 
	 * REST: POST /domain/{serviceName}/nameServers/update
	 * @param nameServers [required] New name servers
	 * @param serviceName [required] The internal name of your domain
	 */
	public OvhTask serviceName_nameServers_update_POST(String serviceName, OvhDomainNs[] nameServers) throws IOException {
		String qPath = "/domain/{serviceName}/nameServers/update";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "nameServers", nameServers);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of current name servers
	 * 
	 * REST: GET /domain/{serviceName}/nameServer
	 * @param serviceName [required] The internal name of your domain
	 */
	public ArrayList<Long> serviceName_nameServer_GET(String serviceName) throws IOException {
		String qPath = "/domain/{serviceName}/nameServer";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add new name server
	 * 
	 * REST: POST /domain/{serviceName}/nameServer
	 * @param nameServer [required] New name server
	 * @param serviceName [required] The internal name of your domain
	 */
	public OvhTask serviceName_nameServer_POST(String serviceName, OvhDomainNs[] nameServer) throws IOException {
		String qPath = "/domain/{serviceName}/nameServer";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "nameServer", nameServer);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/{serviceName}/nameServer/{id}
	 * @param serviceName [required] The internal name of your domain
	 * @param id [required] Id of the object
	 */
	public OvhCurrentNameServer serviceName_nameServer_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/domain/{serviceName}/nameServer/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCurrentNameServer.class);
	}

	/**
	 * Delete a name server
	 * 
	 * REST: DELETE /domain/{serviceName}/nameServer/{id}
	 * @param serviceName [required] The internal name of your domain
	 * @param id [required] Id of the object
	 */
	public OvhTask serviceName_nameServer_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/domain/{serviceName}/nameServer/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get name server status
	 * 
	 * REST: POST /domain/{serviceName}/nameServer/{id}/status
	 * @param serviceName [required] The internal name of your domain
	 * @param id [required] Id of the object
	 */
	public OvhDomainNsStatus serviceName_nameServer_id_status_POST(String serviceName, Long id) throws IOException {
		String qPath = "/domain/{serviceName}/nameServer/{id}/status";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhDomainNsStatus.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /domain
	 * @param whoisOwner Filter the value of whoisOwner property (=)
	 */
	public ArrayList<String> GET(String whoisOwner) throws IOException {
		String qPath = "/domain";
		qPath = query(qPath, "whoisOwner", whoisOwner);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /domain/zone
	 */
	public ArrayList<String> zone_GET() throws IOException {
		String qPath = "/domain/zone";
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/zone/{zoneName}/serviceInfos
	 * @param zoneName [required] The internal name of your zone
	 */
	public OvhService zone_zoneName_serviceInfos_GET(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}/serviceInfos";
		qPath = qPath.replace("{zoneName}", zoneName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /domain/zone/{zoneName}/serviceInfos
	 * @param body [required] New object properties
	 * @param zoneName [required] The internal name of your zone
	 */
	public void zone_zoneName_serviceInfos_PUT(String zoneName, OvhService body) throws IOException {
		String qPath = "/domain/zone/{zoneName}/serviceInfos";
		qPath = qPath.replace("{zoneName}", zoneName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/zone/{zoneName}
	 * @param zoneName [required] The internal name of your zone
	 */
	public OvhZone zone_zoneName_GET(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}";
		qPath = qPath.replace("{zoneName}", zoneName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhZone.class);
	}

	/**
	 * Zone status
	 * 
	 * REST: GET /domain/zone/{zoneName}/status
	 * @param zoneName [required] The internal name of your zone
	 */
	public OvhStatus zone_zoneName_status_GET(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}/status";
		qPath = qPath.replace("{zoneName}", zoneName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhStatus.class);
	}

	/**
	 * Terminate your service
	 * 
	 * REST: POST /domain/zone/{zoneName}/terminate
	 * @param zoneName [required] The internal name of your zone
	 */
	public String zone_zoneName_terminate_POST(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}/terminate";
		qPath = qPath.replace("{zoneName}", zoneName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Redirections
	 * 
	 * REST: GET /domain/zone/{zoneName}/redirection
	 * @param subDomain [required] Filter the value of subDomain property (like)
	 * @param zoneName [required] The internal name of your zone
	 */
	public ArrayList<Long> zone_zoneName_redirection_GET(String zoneName, String subDomain) throws IOException {
		String qPath = "/domain/zone/{zoneName}/redirection";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = query(qPath, "subDomain", subDomain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new redirection (Don't forget to refresh the zone)
	 * 
	 * REST: POST /domain/zone/{zoneName}/redirection
	 * @param keywords [required] Keywords for invisible redirection
	 * @param target [required] Target of the redirection
	 * @param title [required] Title for invisible redirection
	 * @param type [required] Redirection type
	 * @param subDomain [required] subdomain to redirect
	 * @param description [required] Desciption for invisible redirection
	 * @param zoneName [required] The internal name of your zone
	 */
	public OvhRedirection zone_zoneName_redirection_POST(String zoneName, String keywords, String target, String title, OvhRedirectionTypeEnum type, String subDomain, String description) throws IOException {
		String qPath = "/domain/zone/{zoneName}/redirection";
		qPath = qPath.replace("{zoneName}", zoneName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "keywords", keywords);
		addBody(o, "target", target);
		addBody(o, "title", title);
		addBody(o, "type", type);
		addBody(o, "subDomain", subDomain);
		addBody(o, "description", description);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhRedirection.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/zone/{zoneName}/redirection/{id}
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public OvhRedirection zone_zoneName_redirection_id_GET(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/redirection/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRedirection.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /domain/zone/{zoneName}/redirection/{id}
	 * @param body [required] New object properties
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public void zone_zoneName_redirection_id_PUT(String zoneName, Long id, OvhRedirection body) throws IOException {
		String qPath = "/domain/zone/{zoneName}/redirection/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a redirection (Don't forget to refresh the zone)
	 * 
	 * REST: DELETE /domain/zone/{zoneName}/redirection/{id}
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public void zone_zoneName_redirection_id_DELETE(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/redirection/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /domain/zone/{zoneName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param zoneName [required] The internal name of your zone
	 */
	public ArrayList<Long> zone_zoneName_changeContact_POST(String zoneName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/domain/zone/{zoneName}/changeContact";
		qPath = qPath.replace("{zoneName}", zoneName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t1);
	}

	/**
	 * Records of the zone
	 * 
	 * REST: GET /domain/zone/{zoneName}/record
	 * @param fieldType [required] Filter the value of fieldType property (like)
	 * @param subDomain [required] Filter the value of subDomain property (like)
	 * @param zoneName [required] The internal name of your zone
	 */
	public ArrayList<Long> zone_zoneName_record_GET(String zoneName, OvhNamedResolutionFieldTypeEnum fieldType, String subDomain) throws IOException {
		String qPath = "/domain/zone/{zoneName}/record";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = query(qPath, "fieldType", fieldType);
		qPath = query(qPath, "subDomain", subDomain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new DNS record (Don't forget to refresh the zone)
	 * 
	 * REST: POST /domain/zone/{zoneName}/record
	 * @param target [required] Resource record target
	 * @param ttl [required] Resource record ttl
	 * @param fieldType [required] Resource record Name
	 * @param subDomain [required] Resource record subdomain
	 * @param zoneName [required] The internal name of your zone
	 */
	public OvhRecord zone_zoneName_record_POST(String zoneName, String target, Long ttl, OvhNamedResolutionFieldTypeEnum fieldType, String subDomain) throws IOException {
		String qPath = "/domain/zone/{zoneName}/record";
		qPath = qPath.replace("{zoneName}", zoneName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "target", target);
		addBody(o, "ttl", ttl);
		addBody(o, "fieldType", fieldType);
		addBody(o, "subDomain", subDomain);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhRecord.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/zone/{zoneName}/record/{id}
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public OvhRecord zone_zoneName_record_id_GET(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/record/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRecord.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /domain/zone/{zoneName}/record/{id}
	 * @param body [required] New object properties
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public void zone_zoneName_record_id_PUT(String zoneName, Long id, OvhRecord body) throws IOException {
		String qPath = "/domain/zone/{zoneName}/record/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a DNS record (Don't forget to refresh the zone)
	 * 
	 * REST: DELETE /domain/zone/{zoneName}/record/{id}
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public void zone_zoneName_record_id_DELETE(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/record/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Reset the DNS zone
	 * 
	 * REST: POST /domain/zone/{zoneName}/reset
	 * @param DnsRecords [required] Records that will be set after reset
	 * @param minimized [required] Create only mandatory records
	 * @param zoneName [required] The internal name of your zone
	 */
	public void zone_zoneName_reset_POST(String zoneName, OvhResetRecord[] DnsRecords, Boolean minimized) throws IOException {
		String qPath = "/domain/zone/{zoneName}/reset";
		qPath = qPath.replace("{zoneName}", zoneName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "DnsRecords", DnsRecords);
		addBody(o, "minimized", minimized);
		exec("POST", qPath, o);
	}

	/**
	 * Apply zone modification on DNS servers
	 * 
	 * REST: POST /domain/zone/{zoneName}/refresh
	 * @param zoneName [required] The internal name of your zone
	 */
	public void zone_zoneName_refresh_POST(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}/refresh";
		qPath = qPath.replace("{zoneName}", zoneName);
		exec("POST", qPath);
	}

	/**
	 * Export zone
	 * 
	 * REST: GET /domain/zone/{zoneName}/export
	 * @param zoneName [required] The internal name of your zone
	 */
	public String zone_zoneName_export_GET(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}/export";
		qPath = qPath.replace("{zoneName}", zoneName);
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/zone/{zoneName}/soa
	 * @param zoneName [required] The internal name of your zone
	 */
	public OvhSoa zone_zoneName_soa_GET(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}/soa";
		qPath = qPath.replace("{zoneName}", zoneName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSoa.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /domain/zone/{zoneName}/soa
	 * @param body [required] New object properties
	 * @param zoneName [required] The internal name of your zone
	 */
	public void zone_zoneName_soa_PUT(String zoneName, OvhSoa body) throws IOException {
		String qPath = "/domain/zone/{zoneName}/soa";
		qPath = qPath.replace("{zoneName}", zoneName);
		exec("PUT", qPath, body);
	}

	/**
	 * Domain pending tasks
	 * 
	 * REST: GET /domain/zone/{zoneName}/task
	 * @param function [required] Filter the value of function property (like)
	 * @param status [required] Filter the value of status property (=)
	 * @param zoneName [required] The internal name of your zone
	 */
	public ArrayList<Long> zone_zoneName_task_GET(String zoneName, String function, OvhOperationStatusEnum status) throws IOException {
		String qPath = "/domain/zone/{zoneName}/task";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/zone/{zoneName}/task/{id}
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public net.minidev.ovh.api.domain.zone.OvhTask zone_zoneName_task_id_GET(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/task/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, net.minidev.ovh.api.domain.zone.OvhTask.class);
	}

	/**
	 * Relaunch the task
	 * 
	 * REST: POST /domain/zone/{zoneName}/task/{id}/relaunch
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public void zone_zoneName_task_id_relaunch_POST(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/task/{id}/relaunch";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		exec("POST", qPath);
	}

	/**
	 * Accelerate the task
	 * 
	 * REST: POST /domain/zone/{zoneName}/task/{id}/accelerate
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public void zone_zoneName_task_id_accelerate_POST(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/task/{id}/accelerate";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		exec("POST", qPath);
	}

	/**
	 * Cancel the task
	 * 
	 * REST: POST /domain/zone/{zoneName}/task/{id}/cancel
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public void zone_zoneName_task_id_cancel_POST(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/task/{id}/cancel";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		exec("POST", qPath);
	}

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /domain/zone/{zoneName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param zoneName [required] The internal name of your zone
	 */
	public String zone_zoneName_confirmTermination_POST(String zoneName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/domain/zone/{zoneName}/confirmTermination";
		qPath = qPath.replace("{zoneName}", zoneName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Import zone
	 * 
	 * REST: POST /domain/zone/{zoneName}/import
	 * @param zoneFile [required] Zone file that will be imported
	 * @param zoneName [required] The internal name of your zone
	 */
	public net.minidev.ovh.api.domain.zone.OvhTask zone_zoneName_import_POST(String zoneName, String zoneFile) throws IOException {
		String qPath = "/domain/zone/{zoneName}/import";
		qPath = qPath.replace("{zoneName}", zoneName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zoneFile", zoneFile);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, net.minidev.ovh.api.domain.zone.OvhTask.class);
	}

	/**
	 * DynHost' records
	 * 
	 * REST: GET /domain/zone/{zoneName}/dynHost/record
	 * @param subDomain [required] Filter the value of subDomain property (like)
	 * @param zoneName [required] The internal name of your zone
	 */
	public ArrayList<Long> zone_zoneName_dynHost_record_GET(String zoneName, String subDomain) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/record";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = query(qPath, "subDomain", subDomain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new DynHost record (Don't forget to refresh the zone)
	 * 
	 * REST: POST /domain/zone/{zoneName}/dynHost/record
	 * @param ip [required] Ip address of the DynHost record
	 * @param subDomain [required] Subdomain of the DynHost record
	 * @param zoneName [required] The internal name of your zone
	 */
	public OvhDynHostRecord zone_zoneName_dynHost_record_POST(String zoneName, String ip, String subDomain) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/record";
		qPath = qPath.replace("{zoneName}", zoneName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		addBody(o, "subDomain", subDomain);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhDynHostRecord.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/zone/{zoneName}/dynHost/record/{id}
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public OvhDynHostRecord zone_zoneName_dynHost_record_id_GET(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/record/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDynHostRecord.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /domain/zone/{zoneName}/dynHost/record/{id}
	 * @param body [required] New object properties
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public void zone_zoneName_dynHost_record_id_PUT(String zoneName, Long id, OvhDynHostRecord body) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/record/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a DynHost record (Don't forget to refresh the zone)
	 * 
	 * REST: DELETE /domain/zone/{zoneName}/dynHost/record/{id}
	 * @param zoneName [required] The internal name of your zone
	 * @param id [required] Id of the object
	 */
	public void zone_zoneName_dynHost_record_id_DELETE(String zoneName, Long id) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/record/{id}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * DynHost' logins
	 * 
	 * REST: GET /domain/zone/{zoneName}/dynHost/login
	 * @param subDomain [required] Filter the value of subDomain property (like)
	 * @param login [required] Filter the value of login property (like)
	 * @param zoneName [required] The internal name of your zone
	 */
	public ArrayList<String> zone_zoneName_dynHost_login_GET(String zoneName, String login, String subDomain) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/login";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = query(qPath, "login", login);
		qPath = query(qPath, "subDomain", subDomain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new DynHost login
	 * 
	 * REST: POST /domain/zone/{zoneName}/dynHost/login
	 * @param password [required] Password of the login
	 * @param loginSuffix [required] Suffix that will be concatenated to the zoneName to create the login
	 * @param subDomain [required] Subdomain that the login will be allowed to update (use * to allow all)
	 * @param zoneName [required] The internal name of your zone
	 */
	public OvhDynHostLogin zone_zoneName_dynHost_login_POST(String zoneName, String password, String loginSuffix, String subDomain) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/login";
		qPath = qPath.replace("{zoneName}", zoneName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "loginSuffix", loginSuffix);
		addBody(o, "subDomain", subDomain);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhDynHostLogin.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/zone/{zoneName}/dynHost/login/{login}
	 * @param zoneName [required] The internal name of your zone
	 * @param login [required] Login
	 */
	public OvhDynHostLogin zone_zoneName_dynHost_login_login_GET(String zoneName, String login) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/login/{login}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{login}", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDynHostLogin.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /domain/zone/{zoneName}/dynHost/login/{login}
	 * @param body [required] New object properties
	 * @param zoneName [required] The internal name of your zone
	 * @param login [required] Login
	 */
	public void zone_zoneName_dynHost_login_login_PUT(String zoneName, String login, OvhDynHostLogin body) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/login/{login}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{login}", login);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a DynHost login
	 * 
	 * REST: DELETE /domain/zone/{zoneName}/dynHost/login/{login}
	 * @param zoneName [required] The internal name of your zone
	 * @param login [required] Login
	 */
	public void zone_zoneName_dynHost_login_login_DELETE(String zoneName, String login) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/login/{login}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{login}", login);
		exec("DELETE", qPath);
	}

	/**
	 * Change password of the DynHost login
	 * 
	 * REST: POST /domain/zone/{zoneName}/dynHost/login/{login}/changePassword
	 * @param password [required] New password of the DynHost login
	 * @param zoneName [required] The internal name of your zone
	 * @param login [required] Login
	 */
	public void zone_zoneName_dynHost_login_login_changePassword_POST(String zoneName, String login, String password) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dynHost/login/{login}/changePassword";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{login}", login);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		exec("POST", qPath, o);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /domain/zone/{zoneName}/dnssec
	 * @param zoneName [required] The internal name of your zone
	 */
	public OvhDnssec zone_zoneName_dnssec_GET(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dnssec";
		qPath = qPath.replace("{zoneName}", zoneName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDnssec.class);
	}

	/**
	 * Enable Dnssec
	 * 
	 * REST: POST /domain/zone/{zoneName}/dnssec
	 * @param zoneName [required] The internal name of your zone
	 */
	public void zone_zoneName_dnssec_POST(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dnssec";
		qPath = qPath.replace("{zoneName}", zoneName);
		exec("POST", qPath);
	}

	/**
	 * Disable Dnssec
	 * 
	 * REST: DELETE /domain/zone/{zoneName}/dnssec
	 * @param zoneName [required] The internal name of your zone
	 */
	public void zone_zoneName_dnssec_DELETE(String zoneName) throws IOException {
		String qPath = "/domain/zone/{zoneName}/dnssec";
		qPath = qPath.replace("{zoneName}", zoneName);
		exec("DELETE", qPath);
	}

	/**
	 * List all the extensions for a specific country
	 * 
	 * REST: GET /domain/data/extension
	 * @param country [required] Country targeted
	 */
	public ArrayList<String> data_extension_GET(OvhCountryEnum country) throws IOException {
		String qPath = "/domain/data/extension";
		qPath = query(qPath, "country", country);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Retrieve all association information according to Afnic
	 * 
	 * REST: GET /domain/data/afnicAssociationInformation
	 */
	public ArrayList<Long> data_afnicAssociationInformation_GET() throws IOException {
		String qPath = "/domain/data/afnicAssociationInformation";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Post a new association information according to Afnic
	 * 
	 * REST: POST /domain/data/afnicAssociationInformation
	 * @param declarationDate [required] Date of the declaration of the association
	 * @param publicationDate [required] Date of the publication of the declaration of the association
	 * @param publicationNumber [required] Number of the publication of the declaration of the association
	 * @param publicationPageNumber [required] Page number of the publication of the declaration of the association
	 * @param contactId [required] Contact ID related to the association contact information
	 */
	public OvhAssociationContact data_afnicAssociationInformation_POST(Date declarationDate, Date publicationDate, String publicationNumber, String publicationPageNumber, Long contactId) throws IOException {
		String qPath = "/domain/data/afnicAssociationInformation";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "declarationDate", declarationDate);
		addBody(o, "publicationDate", publicationDate);
		addBody(o, "publicationNumber", publicationNumber);
		addBody(o, "publicationPageNumber", publicationPageNumber);
		addBody(o, "contactId", contactId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhAssociationContact.class);
	}

	/**
	 * Retrieve an association information according to Afnic
	 * 
	 * REST: GET /domain/data/afnicAssociationInformation/{associationInformationId}
	 * @param associationInformationId [required] Association Information ID
	 */
	public OvhAssociationContact data_afnicAssociationInformation_associationInformationId_GET(Long associationInformationId) throws IOException {
		String qPath = "/domain/data/afnicAssociationInformation/{associationInformationId}";
		qPath = qPath.replace("{associationInformationId}", associationInformationId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAssociationContact.class);
	}

	/**
	 * Retrieve information about a SMD file
	 * 
	 * REST: GET /domain/data/smd/{smdId}
	 * @param smdId [required] SMD ID
	 */
	public OvhSmd data_smd_smdId_GET(Long smdId) throws IOException {
		String qPath = "/domain/data/smd/{smdId}";
		qPath = qPath.replace("{smdId}", smdId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSmd.class);
	}

	/**
	 * Modify an existing SMD file
	 * 
	 * REST: PUT /domain/data/smd/{smdId}
	 * @param smdId [required] SMD ID
	 * @param data [required] SMD content file
	 */
	public OvhSmd data_smd_smdId_PUT(Long smdId, String data) throws IOException {
		String qPath = "/domain/data/smd/{smdId}";
		qPath = qPath.replace("{smdId}", smdId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "data", data);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhSmd.class);
	}

	/**
	 * Delete a SMD file
	 * 
	 * REST: DELETE /domain/data/smd/{smdId}
	 * @param smdId [required] SMD ID
	 */
	public void data_smd_smdId_DELETE(Long smdId) throws IOException {
		String qPath = "/domain/data/smd/{smdId}";
		qPath = qPath.replace("{smdId}", smdId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * List all your SMD files
	 * 
	 * REST: GET /domain/data/smd
	 * @param protectedLabels_label [required] Filter the value of protectedLabels.label property (=)
	 */
	public ArrayList<Long> data_smd_GET(String protectedLabels_label) throws IOException {
		String qPath = "/domain/data/smd";
		qPath = query(qPath, "protectedLabels.label", protectedLabels_label);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Post a new SMD file
	 * 
	 * REST: POST /domain/data/smd
	 * @param data [required] SMD content file
	 */
	public OvhSmd data_smd_POST(String data) throws IOException {
		String qPath = "/domain/data/smd";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "data", data);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSmd.class);
	}

	/**
	 * Retrieve all your Pro Contact
	 * 
	 * REST: GET /domain/data/proContact
	 */
	public ArrayList<Long> data_proContact_GET() throws IOException {
		String qPath = "/domain/data/proContact";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Post new information about .pro contact information
	 * 
	 * REST: POST /domain/data/proContact
	 * @param jobDescription [required] Description of your job
	 * @param authority [required] Authority that certify your profesional status
	 * @param authorityWebsite [required] Website of the authority that certify your profesional status
	 * @param licenseNumber [required] License number given by the authority
	 * @param contactId [required] Contact ID that refer to that .pro information
	 */
	public OvhProContact data_proContact_POST(String jobDescription, String authority, String authorityWebsite, String licenseNumber, Long contactId) throws IOException {
		String qPath = "/domain/data/proContact";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "jobDescription", jobDescription);
		addBody(o, "authority", authority);
		addBody(o, "authorityWebsite", authorityWebsite);
		addBody(o, "licenseNumber", licenseNumber);
		addBody(o, "contactId", contactId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhProContact.class);
	}

	/**
	 * Retrieve information about a Pro Contact
	 * 
	 * REST: GET /domain/data/proContact/{proContactId}
	 * @param proContactId [required] ProContact ID
	 */
	public OvhProContact data_proContact_proContactId_GET(Long proContactId) throws IOException {
		String qPath = "/domain/data/proContact/{proContactId}";
		qPath = qPath.replace("{proContactId}", proContactId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhProContact.class);
	}

	/**
	 * Retrieve claim notices associated to a domain
	 * 
	 * REST: GET /domain/data/claimNotice
	 * @param domain [required] Domain name
	 */
	public OvhClaimNotice data_claimNotice_GET(String domain) throws IOException {
		String qPath = "/domain/data/claimNotice";
		qPath = query(qPath, "domain", domain);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhClaimNotice.class);
	}

	/**
	 * Retrieve all corporation trademark information according to Afnic
	 * 
	 * REST: GET /domain/data/afnicCorporationTrademarkInformation
	 */
	public ArrayList<Long> data_afnicCorporationTrademarkInformation_GET() throws IOException {
		String qPath = "/domain/data/afnicCorporationTrademarkInformation";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Post a new corporation trademark information according to Afnic
	 * 
	 * REST: POST /domain/data/afnicCorporationTrademarkInformation
	 * @param inpiNumber [required] Number of the Inpi declaration
	 * @param inpiTrademarkOwner [required] Owner of the trademark
	 * @param contactId [required] Contact ID related to the Inpi additional information
	 */
	public OvhAfnicCorporationTrademarkContact data_afnicCorporationTrademarkInformation_POST(String inpiNumber, String inpiTrademarkOwner, Long contactId) throws IOException {
		String qPath = "/domain/data/afnicCorporationTrademarkInformation";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "inpiNumber", inpiNumber);
		addBody(o, "inpiTrademarkOwner", inpiTrademarkOwner);
		addBody(o, "contactId", contactId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhAfnicCorporationTrademarkContact.class);
	}

	/**
	 * Retrieve a corporation trademark information according to Afnic
	 * 
	 * REST: GET /domain/data/afnicCorporationTrademarkInformation/{afnicCorporationTrademarkId}
	 * @param afnicCorporationTrademarkId [required] Corporation Inpi Information ID
	 */
	public OvhAfnicCorporationTrademarkContact data_afnicCorporationTrademarkInformation_afnicCorporationTrademarkId_GET(Long afnicCorporationTrademarkId) throws IOException {
		String qPath = "/domain/data/afnicCorporationTrademarkInformation/{afnicCorporationTrademarkId}";
		qPath = qPath.replace("{afnicCorporationTrademarkId}", afnicCorporationTrademarkId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAfnicCorporationTrademarkContact.class);
	}

	/**
	 * List all the rules for a specific cartId/itemId
	 * 
	 * REST: GET /domain/rules
	 * @param cartId [required] Cart ID concerned for the rules
	 * @param itemId [required] Item ID concerned for the rules
	 */
	public OvhRule rules_GET(String cartId, Long itemId) throws IOException {
		String qPath = "/domain/rules";
		qPath = query(qPath, "cartId", cartId);
		qPath = query(qPath, "itemId", itemId);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhRule.class);
	}
}
