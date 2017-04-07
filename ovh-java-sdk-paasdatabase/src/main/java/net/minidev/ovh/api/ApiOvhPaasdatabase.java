package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhSafeKeyValue;
import net.minidev.ovh.api.paas.database.OvhDump;
import net.minidev.ovh.api.paas.database.OvhImage;
import net.minidev.ovh.api.paas.database.OvhInstance;
import net.minidev.ovh.api.paas.database.OvhInstanceConfiguration;
import net.minidev.ovh.api.paas.database.OvhInstanceDatabase;
import net.minidev.ovh.api.paas.database.OvhInstanceDatabaseDump;
import net.minidev.ovh.api.paas.database.OvhInstanceDatabaseExtension;
import net.minidev.ovh.api.paas.database.OvhInstanceGrant;
import net.minidev.ovh.api.paas.database.OvhInstanceUser;
import net.minidev.ovh.api.paas.database.OvhInstanceWhitelist;
import net.minidev.ovh.api.paas.database.OvhOffer;
import net.minidev.ovh.api.paas.database.OvhRegion;
import net.minidev.ovh.api.paas.database.OvhTask;
import net.minidev.ovh.api.paas.database.dump.OvhStatus;
import net.minidev.ovh.api.paas.database.instance.OvhData;
import net.minidev.ovh.api.paas.database.instance.OvhParameters;
import net.minidev.ovh.api.paas.database.instance.grant.OvhType;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/paas/database
 * version:1.0
 */
public class ApiOvhPaasdatabase extends ApiOvhBase {
	public ApiOvhPaasdatabase(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/serviceInfos
	 * @param serviceName [required] Your database project's name
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/paas/database/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /paas/database/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Your database project's name
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/paas/database/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}
	 * @param serviceName [required] Your database project's name
	 *
	 * API beta
	 */
	public net.minidev.ovh.api.paas.database.OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/paas/database/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.paas.database.OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /paas/database/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] Your database project's name
	 *
	 * API beta
	 */
	public void serviceName_PUT(String serviceName, net.minidev.ovh.api.paas.database.OvhService body) throws IOException {
		String qPath = "/paas/database/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Dumps linked to your project
	 *
	 * REST: GET /paas/database/{serviceName}/dump
	 * @param instanceId [required] Filter the value of instanceId property (=)
	 * @param creationDate [required] Filter the value of creationDate property (<)
	 * @param databaseName [required] Filter the value of databaseName property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param expirationDate [required] Filter the value of expirationDate property (<)
	 * @param serviceName [required] Your database project's name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_dump_GET(String serviceName, Date creationDate, String databaseName, Date expirationDate, String instanceId, OvhStatus status) throws IOException {
		String qPath = "/paas/database/{serviceName}/dump";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "creationDate", creationDate);
		query(sb, "databaseName", databaseName);
		query(sb, "expirationDate", expirationDate);
		query(sb, "instanceId", instanceId);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/dump/{dumpId}
	 * @param serviceName [required] Your database project's name
	 * @param dumpId [required] Dump id
	 *
	 * API beta
	 */
	public OvhDump serviceName_dump_dumpId_GET(String serviceName, String dumpId) throws IOException {
		String qPath = "/paas/database/{serviceName}/dump/{dumpId}";
		StringBuilder sb = path(qPath, serviceName, dumpId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDump.class);
	}

	/**
	 * Delete the dump
	 *
	 * REST: DELETE /paas/database/{serviceName}/dump/{dumpId}
	 * @param serviceName [required] Your database project's name
	 * @param dumpId [required] Dump id
	 *
	 * API beta
	 */
	public OvhDump serviceName_dump_dumpId_DELETE(String serviceName, String dumpId) throws IOException {
		String qPath = "/paas/database/{serviceName}/dump/{dumpId}";
		StringBuilder sb = path(qPath, serviceName, dumpId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhDump.class);
	}

	/**
	 * Request the restore from this dump
	 *
	 * REST: POST /paas/database/{serviceName}/dump/{dumpId}/restore
	 * @param instanceId [required] The instanceId where you want to restore this dump
	 * @param databaseName [required] The databaseName where you want to restore this dump
	 * @param serviceName [required] Your database project's name
	 * @param dumpId [required] Dump id
	 *
	 * API beta
	 */
	public OvhDump serviceName_dump_dumpId_restore_POST(String serviceName, String dumpId, String instanceId, String databaseName) throws IOException {
		String qPath = "/paas/database/{serviceName}/dump/{dumpId}/restore";
		StringBuilder sb = path(qPath, serviceName, dumpId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceId", instanceId);
		addBody(o, "databaseName", databaseName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhDump.class);
	}

	/**
	 * Tasks linked your project
	 *
	 * REST: GET /paas/database/{serviceName}/task
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] Your database project's name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_task_GET(String serviceName, String function, net.minidev.ovh.api.paas.database.task.OvhStatus status) throws IOException {
		String qPath = "/paas/database/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/task/{taskId}
	 * @param serviceName [required] Your database project's name
	 * @param taskId [required] Task id
	 *
	 * API beta
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, String taskId) throws IOException {
		String qPath = "/paas/database/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Instances linked to your project
	 *
	 * REST: GET /paas/database/{serviceName}/instance
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] Your database project's name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_instance_GET(String serviceName, net.minidev.ovh.api.paas.database.instance.OvhStatus status) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new instance
	 *
	 * REST: POST /paas/database/{serviceName}/instance
	 * @param parameters [required] Array of instance creation parameters
	 * @param serviceName [required] Your database project's name
	 *
	 * API beta
	 */
	public ArrayList<OvhData> serviceName_instance_POST(String serviceName, OvhParameters[] parameters) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "parameters", parameters);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhData>> t2 = new TypeReference<ArrayList<OvhData>>() {};

	/**
	 * Restart the instance
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/restart
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstance serviceName_instance_instanceId_restart_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/restart";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhInstance.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstance serviceName_instance_instanceId_GET(String serviceName, String instanceId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstance.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /paas/database/{serviceName}/instance/{instanceId}
	 * @param body [required] New object properties
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public void serviceName_instance_instanceId_PUT(String serviceName, String instanceId, OvhInstance body) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete instance
	 *
	 * REST: DELETE /paas/database/{serviceName}/instance/{instanceId}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstance serviceName_instance_instanceId_DELETE(String serviceName, String instanceId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhInstance.class);
	}

	/**
	 * Stop the instance
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/stop
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstance serviceName_instance_instanceId_stop_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/stop";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhInstance.class);
	}

	/**
	 * The whitelist configuration (used to access to your instance)
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/whitelist
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_instance_instanceId_whitelist_GET(String serviceName, String instanceId, net.minidev.ovh.api.paas.database.instance.whitelist.OvhStatus status) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/whitelist";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new IP whitelist
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/whitelist
	 * @param ip [required] The IP to whitelist in your instance
	 * @param name [required] Custom name for your Whitelisted IP
	 * @param service [required] Authorize this IP to access service port
	 * @param sftp [required] Authorize this IP to access sftp port
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstanceWhitelist serviceName_instance_instanceId_whitelist_POST(String serviceName, String instanceId, String ip, String name, Boolean service, Boolean sftp) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/whitelist";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		addBody(o, "name", name);
		addBody(o, "service", service);
		addBody(o, "sftp", sftp);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceWhitelist.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/whitelist/{ip}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param ip [required] The whitelisted IP in your instance
	 *
	 * API beta
	 */
	public OvhInstanceWhitelist serviceName_instance_instanceId_whitelist_ip_GET(String serviceName, String instanceId, String ip) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/whitelist/{ip}";
		StringBuilder sb = path(qPath, serviceName, instanceId, ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceWhitelist.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /paas/database/{serviceName}/instance/{instanceId}/whitelist/{ip}
	 * @param body [required] New object properties
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param ip [required] The whitelisted IP in your instance
	 *
	 * API beta
	 */
	public void serviceName_instance_instanceId_whitelist_ip_PUT(String serviceName, String instanceId, String ip, OvhInstanceWhitelist body) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/whitelist/{ip}";
		StringBuilder sb = path(qPath, serviceName, instanceId, ip);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete ain IP whitelist
	 *
	 * REST: DELETE /paas/database/{serviceName}/instance/{instanceId}/whitelist/{ip}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param ip [required] The whitelisted IP in your instance
	 *
	 * API beta
	 */
	public OvhInstanceWhitelist serviceName_instance_instanceId_whitelist_ip_DELETE(String serviceName, String instanceId, String ip) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/whitelist/{ip}";
		StringBuilder sb = path(qPath, serviceName, instanceId, ip);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhInstanceWhitelist.class);
	}

	/**
	 * Databases available in your instance
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/database
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_instance_instanceId_database_GET(String serviceName, String instanceId, net.minidev.ovh.api.paas.database.instance.database.OvhStatus status) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new database on your instance
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/database
	 * @param databaseName [required] Name of your new database
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstanceDatabase serviceName_instance_instanceId_database_POST(String serviceName, String instanceId, String databaseName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "databaseName", databaseName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceDatabase.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 *
	 * API beta
	 */
	public OvhInstanceDatabase serviceName_instance_instanceId_database_databaseName_GET(String serviceName, String instanceId, String databaseName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceDatabase.class);
	}

	/**
	 * Delete the database
	 *
	 * REST: DELETE /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 *
	 * API beta
	 */
	public OvhInstanceDatabase serviceName_instance_instanceId_database_databaseName_DELETE(String serviceName, String instanceId, String databaseName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhInstanceDatabase.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/extension/{extensionName}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 * @param extensionName [required] Extension name
	 *
	 * API beta
	 */
	public OvhInstanceDatabaseExtension serviceName_instance_instanceId_database_databaseName_extension_extensionName_GET(String serviceName, String instanceId, String databaseName, String extensionName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/extension/{extensionName}";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName, extensionName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceDatabaseExtension.class);
	}

	/**
	 * Enable an extension on a database
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/extension/{extensionName}/enable
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 * @param extensionName [required] Extension name
	 *
	 * API beta
	 */
	public OvhInstanceDatabaseExtension serviceName_instance_instanceId_database_databaseName_extension_extensionName_enable_POST(String serviceName, String instanceId, String databaseName, String extensionName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/extension/{extensionName}/enable";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName, extensionName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhInstanceDatabaseExtension.class);
	}

	/**
	 * Disable an extension from a database
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/extension/{extensionName}/disable
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 * @param extensionName [required] Extension name
	 *
	 * API beta
	 */
	public OvhInstanceDatabaseExtension serviceName_instance_instanceId_database_databaseName_extension_extensionName_disable_POST(String serviceName, String instanceId, String databaseName, String extensionName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/extension/{extensionName}/disable";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName, extensionName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhInstanceDatabaseExtension.class);
	}

	/**
	 * Extensions linked to your database
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/extension
	 * @param status [required] Filter the value of status property (=)
	 * @param extensionName [required] Filter the value of extensionName property (like)
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_instance_instanceId_database_databaseName_extension_GET(String serviceName, String instanceId, String databaseName, String extensionName, net.minidev.ovh.api.paas.database.instance.database.extension.OvhStatus status) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/extension";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName);
		query(sb, "extensionName", extensionName);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Dump available for your database
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump
	 * @param creationDate [required] Filter the value of creationDate property (<)
	 * @param status [required] Filter the value of status property (=)
	 * @param expirationDate [required] Filter the value of expirationDate property (<)
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_instance_instanceId_database_databaseName_dump_GET(String serviceName, String instanceId, String databaseName, Date creationDate, Date expirationDate, OvhStatus status) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName);
		query(sb, "creationDate", creationDate);
		query(sb, "expirationDate", expirationDate);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Request the dump of this database
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump
	 * @param email [required] Email used when the dump will be available ? ( Default: null, can be nic-adm or nic-tech )
	 * @param name [required] A description name for your dump
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 *
	 * API beta
	 */
	public OvhInstanceDatabaseDump serviceName_instance_instanceId_database_databaseName_dump_POST(String serviceName, String instanceId, String databaseName, String email, String name) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceDatabaseDump.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump/{dumpId}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 * @param dumpId [required] Dump id
	 *
	 * API beta
	 */
	public OvhInstanceDatabaseDump serviceName_instance_instanceId_database_databaseName_dump_dumpId_GET(String serviceName, String instanceId, String databaseName, String dumpId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump/{dumpId}";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName, dumpId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceDatabaseDump.class);
	}

	/**
	 * Delete dump before expiration date
	 *
	 * REST: DELETE /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump/{dumpId}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 * @param dumpId [required] Dump id
	 *
	 * API beta
	 */
	public OvhInstanceDatabaseDump serviceName_instance_instanceId_database_databaseName_dump_dumpId_DELETE(String serviceName, String instanceId, String databaseName, String dumpId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump/{dumpId}";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName, dumpId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhInstanceDatabaseDump.class);
	}

	/**
	 * Request the restore of this dump
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump/{dumpId}/restore
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param databaseName [required] Database name
	 * @param dumpId [required] Dump id
	 *
	 * API beta
	 */
	public OvhInstanceDatabaseDump serviceName_instance_instanceId_database_databaseName_dump_dumpId_restore_POST(String serviceName, String instanceId, String databaseName, String dumpId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/database/{databaseName}/dump/{dumpId}/restore";
		StringBuilder sb = path(qPath, serviceName, instanceId, databaseName, dumpId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhInstanceDatabaseDump.class);
	}

	/**
	 * Resize the instance (by migrating the offer)
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/resize
	 * @param offerName [required] Name of the new offer you want to resize your instance to
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstance serviceName_instance_instanceId_resize_POST(String serviceName, String instanceId, String offerName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/resize";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "offerName", offerName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstance.class);
	}

	/**
	 * Change the ftp password of the instance
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/changeSftpPassword
	 * @param password [required] The new password ( alphanumeric, 8 characters minimum and 31 max )
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstance serviceName_instance_instanceId_changeSftpPassword_POST(String serviceName, String instanceId, String password) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/changeSftpPassword";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstance.class);
	}

	/**
	 * Users allowed to connect on a databases of an instance
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/user
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_instance_instanceId_user_GET(String serviceName, String instanceId, net.minidev.ovh.api.paas.database.instance.user.OvhStatus status) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/user";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new user on your databases
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/user
	 * @param password [required] Password for this new user ( alphanumeric, 8 characters minimum and 31 max )
	 * @param userName [required] User name used to connect on your databases
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstanceUser serviceName_instance_instanceId_user_POST(String serviceName, String instanceId, String password, String userName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/user";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "userName", userName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceUser.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/user/{userName}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param userName [required] User name used to connect to your databases
	 *
	 * API beta
	 */
	public OvhInstanceUser serviceName_instance_instanceId_user_userName_GET(String serviceName, String instanceId, String userName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/user/{userName}";
		StringBuilder sb = path(qPath, serviceName, instanceId, userName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceUser.class);
	}

	/**
	 * Delete a user
	 *
	 * REST: DELETE /paas/database/{serviceName}/instance/{instanceId}/user/{userName}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param userName [required] User name used to connect to your databases
	 *
	 * API beta
	 */
	public OvhInstanceUser serviceName_instance_instanceId_user_userName_DELETE(String serviceName, String instanceId, String userName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/user/{userName}";
		StringBuilder sb = path(qPath, serviceName, instanceId, userName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhInstanceUser.class);
	}

	/**
	 * Request a password change for a user
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/user/{userName}/changePassword
	 * @param password [required] The new password ( alphanumeric, 8 characters minimum and 31 max )
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param userName [required] User name used to connect to your databases
	 *
	 * API beta
	 */
	public OvhInstanceUser serviceName_instance_instanceId_user_userName_changePassword_POST(String serviceName, String instanceId, String userName, String password) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/user/{userName}/changePassword";
		StringBuilder sb = path(qPath, serviceName, instanceId, userName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceUser.class);
	}

	/**
	 * Upgrade the instance with a new image
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/upgrade
	 * @param imageName [required] Name of the new image that you want for your instance to use
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstance serviceName_instance_instanceId_upgrade_POST(String serviceName, String instanceId, String imageName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/upgrade";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "imageName", imageName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstance.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/configuration
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstanceConfiguration serviceName_instance_instanceId_configuration_GET(String serviceName, String instanceId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/configuration";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceConfiguration.class);
	}

	/**
	 * Update the instance configuration
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/configuration/update
	 * @param parameters [required] Array of instance configuration parameters
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstanceConfiguration serviceName_instance_instanceId_configuration_update_POST(String serviceName, String instanceId, OvhSafeKeyValue<String>[] parameters) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/configuration/update";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "parameters", parameters);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceConfiguration.class);
	}

	/**
	 * Start the instance
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/start
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstance serviceName_instance_instanceId_start_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/start";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhInstance.class);
	}

	/**
	 * Grants of sql users on your sql databases
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/grant
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_instance_instanceId_grant_GET(String serviceName, String instanceId, net.minidev.ovh.api.paas.database.instance.grant.OvhStatus status) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/grant";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a grant on a database
	 *
	 * REST: POST /paas/database/{serviceName}/instance/{instanceId}/grant
	 * @param databaseName [required] Database's name for this grant
	 * @param grantType [required] Grant type
	 * @param userName [required] User name to grant
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 *
	 * API beta
	 */
	public OvhInstanceGrant serviceName_instance_instanceId_grant_POST(String serviceName, String instanceId, String databaseName, OvhType grantType, String userName) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/grant";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "databaseName", databaseName);
		addBody(o, "grantType", grantType);
		addBody(o, "userName", userName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceGrant.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/{serviceName}/instance/{instanceId}/grant/{grantId}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param grantId [required] Grant id
	 *
	 * API beta
	 */
	public OvhInstanceGrant serviceName_instance_instanceId_grant_grantId_GET(String serviceName, String instanceId, String grantId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/grant/{grantId}";
		StringBuilder sb = path(qPath, serviceName, instanceId, grantId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceGrant.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /paas/database/{serviceName}/instance/{instanceId}/grant/{grantId}
	 * @param body [required] New object properties
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param grantId [required] Grant id
	 *
	 * API beta
	 */
	public void serviceName_instance_instanceId_grant_grantId_PUT(String serviceName, String instanceId, String grantId, OvhInstanceGrant body) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/grant/{grantId}";
		StringBuilder sb = path(qPath, serviceName, instanceId, grantId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a grant on a database
	 *
	 * REST: DELETE /paas/database/{serviceName}/instance/{instanceId}/grant/{grantId}
	 * @param serviceName [required] Your database project's name
	 * @param instanceId [required] Instance uuid
	 * @param grantId [required] Grant id
	 *
	 * API beta
	 */
	public OvhInstanceGrant serviceName_instance_instanceId_grant_grantId_DELETE(String serviceName, String instanceId, String grantId) throws IOException {
		String qPath = "/paas/database/{serviceName}/instance/{instanceId}/grant/{grantId}";
		StringBuilder sb = path(qPath, serviceName, instanceId, grantId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhInstanceGrant.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /paas/database
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/paas/database";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Name of all available offers
	 *
	 * REST: GET /paas/database/offer
	 * @param status [required] Filter the value of status property (=)
	 *
	 * API beta
	 */
	public ArrayList<String> offer_GET(net.minidev.ovh.api.paas.database.offer.OvhStatus status) throws IOException {
		String qPath = "/paas/database/offer";
		StringBuilder sb = path(qPath);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/offer/{offerName}
	 * @param offerName [required] Offer name
	 *
	 * API beta
	 */
	public OvhOffer offer_offerName_GET(String offerName) throws IOException {
		String qPath = "/paas/database/offer/{offerName}";
		StringBuilder sb = path(qPath, offerName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOffer.class);
	}

	/**
	 * Name of all available regions
	 *
	 * REST: GET /paas/database/region
	 * @param status [required] Filter the value of status property (=)
	 *
	 * API beta
	 */
	public ArrayList<String> region_GET(net.minidev.ovh.api.paas.database.region.OvhStatus status) throws IOException {
		String qPath = "/paas/database/region";
		StringBuilder sb = path(qPath);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/region/{regionName}
	 * @param regionName [required] Region name
	 *
	 * API beta
	 */
	public OvhRegion region_regionName_GET(String regionName) throws IOException {
		String qPath = "/paas/database/region/{regionName}";
		StringBuilder sb = path(qPath, regionName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRegion.class);
	}

	/**
	 * Name of all available images
	 *
	 * REST: GET /paas/database/image
	 * @param status [required] Filter the value of status property (=)
	 * @param type [required] Filter the value of type property (=)
	 *
	 * API beta
	 */
	public ArrayList<String> image_GET(net.minidev.ovh.api.paas.database.image.OvhStatus status, net.minidev.ovh.api.paas.database.image.OvhType type) throws IOException {
		String qPath = "/paas/database/image";
		StringBuilder sb = path(qPath);
		query(sb, "status", status);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /paas/database/image/{imageName}
	 * @param imageName [required] Image name
	 *
	 * API beta
	 */
	public OvhImage image_imageName_GET(String imageName) throws IOException {
		String qPath = "/paas/database/image/{imageName}";
		StringBuilder sb = path(qPath, imageName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhImage.class);
	}
}
