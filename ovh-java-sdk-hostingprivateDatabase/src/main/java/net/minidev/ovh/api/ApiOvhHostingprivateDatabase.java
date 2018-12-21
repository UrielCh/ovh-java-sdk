package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhSafeKeyValue;
import net.minidev.ovh.api.hosting.privatedatabase.OvhAvailableOrderCapacities;
import net.minidev.ovh.api.hosting.privatedatabase.OvhAvailableVersionEnum;
import net.minidev.ovh.api.hosting.privatedatabase.OvhConfiguration;
import net.minidev.ovh.api.hosting.privatedatabase.OvhDatabase;
import net.minidev.ovh.api.hosting.privatedatabase.OvhDatabaseDump;
import net.minidev.ovh.api.hosting.privatedatabase.OvhDatabaseExtension;
import net.minidev.ovh.api.hosting.privatedatabase.OvhDump;
import net.minidev.ovh.api.hosting.privatedatabase.OvhGrant;
import net.minidev.ovh.api.hosting.privatedatabase.OvhOfferEnum;
import net.minidev.ovh.api.hosting.privatedatabase.OvhOom;
import net.minidev.ovh.api.hosting.privatedatabase.OvhService;
import net.minidev.ovh.api.hosting.privatedatabase.OvhTask;
import net.minidev.ovh.api.hosting.privatedatabase.OvhTemporaryLogsLink;
import net.minidev.ovh.api.hosting.privatedatabase.OvhUser;
import net.minidev.ovh.api.hosting.privatedatabase.OvhWhitelist;
import net.minidev.ovh.api.hosting.privatedatabase.database.extension.OvhStatus;
import net.minidev.ovh.api.hosting.privatedatabase.grant.OvhGrantEnum;
import net.minidev.ovh.api.hosting.privatedatabase.task.OvhFunctionEnum;
import net.minidev.ovh.api.hosting.privatedatabase.task.OvhStatusEnum;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/hosting/privateDatabase
 * version:1.0
 */
public class ApiOvhHostingprivateDatabase extends ApiOvhBase {
	public ApiOvhHostingprivateDatabase(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get available order capacitie
	 *
	 * REST: GET /hosting/privateDatabase/availableOrderCapacities
	 * @param offer [required] Offer available order capacities to choose
	 */
	public OvhAvailableOrderCapacities availableOrderCapacities_GET(OvhOfferEnum offer) throws IOException {
		String qPath = "/hosting/privateDatabase/availableOrderCapacities";
		StringBuilder sb = path(qPath);
		query(sb, "offer", offer);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAvailableOrderCapacities.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /hosting/privateDatabase
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/hosting/privateDatabase";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Start the private database
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/start
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_start_POST(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/start";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/confirmTermination
	 * @param futureUse What next after your termination request
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your private database
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/confirmTermination";
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
	 * Dumps available for your private database service
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/dump
	 * @param orphan [required] Filter the value of orphan property (=)
	 * @param databaseName [required] Filter the value of databaseName property (like)
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<Long> serviceName_dump_GET(String serviceName, String databaseName, Boolean orphan) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/dump";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "databaseName", databaseName);
		query(sb, "orphan", orphan);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/dump/{dumpId}
	 * @param serviceName [required] The internal name of your private database
	 * @param dumpId [required] Dump id
	 */
	public OvhDump serviceName_dump_dumpId_GET(String serviceName, Long dumpId) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/dump/{dumpId}";
		StringBuilder sb = path(qPath, serviceName, dumpId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDump.class);
	}

	/**
	 * Delete dump before expiration date
	 *
	 * REST: DELETE /hosting/privateDatabase/{serviceName}/dump/{dumpId}
	 * @param serviceName [required] The internal name of your private database
	 * @param dumpId [required] Dump id
	 */
	public OvhTask serviceName_dump_dumpId_DELETE(String serviceName, Long dumpId) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/dump/{dumpId}";
		StringBuilder sb = path(qPath, serviceName, dumpId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the restore from this dump
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/dump/{dumpId}/restore
	 * @param databaseName [required] The database where you want to restore this dump
	 * @param serviceName [required] The internal name of your private database
	 * @param dumpId [required] Dump id
	 */
	public OvhTask serviceName_dump_dumpId_restore_POST(String serviceName, Long dumpId, String databaseName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/dump/{dumpId}/restore";
		StringBuilder sb = path(qPath, serviceName, dumpId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "databaseName", databaseName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/whitelist/{ip}
	 * @param serviceName [required] The internal name of your private database
	 * @param ip [required] The whitelisted IP in your instance
	 */
	public OvhWhitelist serviceName_whitelist_ip_GET(String serviceName, String ip) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/whitelist/{ip}";
		StringBuilder sb = path(qPath, serviceName, ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhWhitelist.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/privateDatabase/{serviceName}/whitelist/{ip}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your private database
	 * @param ip [required] The whitelisted IP in your instance
	 */
	public void serviceName_whitelist_ip_PUT(String serviceName, String ip, OvhWhitelist body) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/whitelist/{ip}";
		StringBuilder sb = path(qPath, serviceName, ip);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete ain IP whitelist
	 *
	 * REST: DELETE /hosting/privateDatabase/{serviceName}/whitelist/{ip}
	 * @param serviceName [required] The internal name of your private database
	 * @param ip [required] The whitelisted IP in your instance
	 */
	public OvhTask serviceName_whitelist_ip_DELETE(String serviceName, String ip) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/whitelist/{ip}";
		StringBuilder sb = path(qPath, serviceName, ip);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Whitelist allowed on your privatesql
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/whitelist
	 * @param ip [required] Filter the value of ip property (contains or equals)
	 * @param service [required] Filter the value of service property (=)
	 * @param sftp [required] Filter the value of sftp property (=)
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<String> serviceName_whitelist_GET(String serviceName, String ip, Boolean service, Boolean sftp) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/whitelist";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "ip", ip);
		query(sb, "service", service);
		query(sb, "sftp", sftp);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new IP whitelist
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/whitelist
	 * @param service [required] Authorize this IP to access service port
	 * @param ip [required] The IP to whitelist in your instance
	 * @param name [required] Custom name for your Whitelisted IP
	 * @param sftp [required] Authorize this IP to access sftp port
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_whitelist_POST(String serviceName, String ip, String name, Boolean service, Boolean sftp) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/whitelist";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		addBody(o, "name", name);
		addBody(o, "service", service);
		addBody(o, "sftp", sftp);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of privatesql OOM kill
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/oom
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<OvhOom> serviceName_oom_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/oom";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhOom>> t3 = new TypeReference<ArrayList<OvhOom>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/user/{userName}
	 * @param serviceName [required] The internal name of your private database
	 * @param userName [required] User name used to connect to your databases
	 */
	public OvhUser serviceName_user_userName_GET(String serviceName, String userName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user/{userName}";
		StringBuilder sb = path(qPath, serviceName, userName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Delete a user
	 *
	 * REST: DELETE /hosting/privateDatabase/{serviceName}/user/{userName}
	 * @param serviceName [required] The internal name of your private database
	 * @param userName [required] User name used to connect to your databases
	 */
	public OvhTask serviceName_user_userName_DELETE(String serviceName, String userName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user/{userName}";
		StringBuilder sb = path(qPath, serviceName, userName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request a change password for a user
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/user/{userName}/changePassword
	 * @param password [required] The new user password ( alphanumeric and 8 characters minimum )
	 * @param serviceName [required] The internal name of your private database
	 * @param userName [required] User name used to connect to your databases
	 */
	public OvhTask serviceName_user_userName_changePassword_POST(String serviceName, String userName, String password) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user/{userName}/changePassword";
		StringBuilder sb = path(qPath, serviceName, userName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * User grant's on your databases
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/user/{userName}/grant
	 * @param serviceName [required] The internal name of your private database
	 * @param userName [required] User name used to connect to your databases
	 */
	public ArrayList<String> serviceName_user_userName_grant_GET(String serviceName, String userName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user/{userName}/grant";
		StringBuilder sb = path(qPath, serviceName, userName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add grant on a database
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/user/{userName}/grant
	 * @param databaseName [required] Database name where add grant
	 * @param grant [required] Grant you want set on the database for this user
	 * @param serviceName [required] The internal name of your private database
	 * @param userName [required] User name used to connect to your databases
	 */
	public OvhTask serviceName_user_userName_grant_POST(String serviceName, String userName, String databaseName, OvhGrantEnum grant) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user/{userName}/grant";
		StringBuilder sb = path(qPath, serviceName, userName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "databaseName", databaseName);
		addBody(o, "grant", grant);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Update user grant
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/user/{userName}/grant/{databaseName}/update
	 * @param grant [required] Grant you want set on the database for this user
	 * @param serviceName [required] The internal name of your private database
	 * @param userName [required] User name used to connect to your databases
	 * @param databaseName [required] Database name where grant is set
	 */
	public OvhTask serviceName_user_userName_grant_databaseName_update_POST(String serviceName, String userName, String databaseName, OvhGrantEnum grant) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user/{userName}/grant/{databaseName}/update";
		StringBuilder sb = path(qPath, serviceName, userName, databaseName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "grant", grant);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/user/{userName}/grant/{databaseName}
	 * @param serviceName [required] The internal name of your private database
	 * @param userName [required] User name used to connect to your databases
	 * @param databaseName [required] Database name where grant is set
	 */
	public OvhGrant serviceName_user_userName_grant_databaseName_GET(String serviceName, String userName, String databaseName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user/{userName}/grant/{databaseName}";
		StringBuilder sb = path(qPath, serviceName, userName, databaseName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhGrant.class);
	}

	/**
	 * Delete a grant on a database
	 *
	 * REST: DELETE /hosting/privateDatabase/{serviceName}/user/{userName}/grant/{databaseName}
	 * @param serviceName [required] The internal name of your private database
	 * @param userName [required] User name used to connect to your databases
	 * @param databaseName [required] Database name where grant is set
	 */
	public OvhTask serviceName_user_userName_grant_databaseName_DELETE(String serviceName, String userName, String databaseName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user/{userName}/grant/{databaseName}";
		StringBuilder sb = path(qPath, serviceName, userName, databaseName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * User allowed to connect on your databases
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/user
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<String> serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new user on your service
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/user
	 * @param userName [required] User name used to connect on your databases
	 * @param password [required] Password for the new user ( alphanumeric and 8 characters minimum )
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_user_POST(String serviceName, String password, String userName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "userName", userName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the availables versions for this private database
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/availableVersions
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<OvhAvailableVersionEnum> serviceName_availableVersions_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/availableVersions";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhAvailableVersionEnum>> t4 = new TypeReference<ArrayList<OvhAvailableVersionEnum>>() {};

	/**
	 * Change the private database engine version
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/changeVersion
	 * @param version [required] Private database versions
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_changeVersion_POST(String serviceName, OvhAvailableVersionEnum version) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/changeVersion";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change your ftp admin password
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/changeFtpPassword
	 * @param password [required] New ftp admin password ( alphanumeric and 8 characters minimum )
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_changeFtpPassword_POST(String serviceName, String password) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/changeFtpPassword";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Generate a temporary url to retrieve instance logs
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/generateTemporaryLogsLink
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTemporaryLogsLink serviceName_generateTemporaryLogsLink_POST(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/generateTemporaryLogsLink";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTemporaryLogsLink.class);
	}

	/**
	 * Tasks attached to your private database service
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/tasks
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, OvhFunctionEnum function, OvhStatusEnum status) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/tasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/tasks/{id}
	 * @param serviceName [required] The internal name of your private database
	 * @param id [required] The id of the task
	 */
	public OvhTask serviceName_tasks_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/tasks/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Databases linked to your private database service
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/database
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<String> serviceName_database_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new database on your private database service
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/database
	 * @param databaseName [required] Name of your new database
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_database_POST(String serviceName, String databaseName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "databaseName", databaseName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/database/{databaseName}
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 */
	public OvhDatabase serviceName_database_databaseName_GET(String serviceName, String databaseName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}";
		StringBuilder sb = path(qPath, serviceName, databaseName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDatabase.class);
	}

	/**
	 * Delete the database
	 *
	 * REST: DELETE /hosting/privateDatabase/{serviceName}/database/{databaseName}
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 */
	public OvhTask serviceName_database_databaseName_DELETE(String serviceName, String databaseName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}";
		StringBuilder sb = path(qPath, serviceName, databaseName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the restore from this dump
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/database/{databaseName}/dump/{id}/restore
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 * @param id [required] Dump id
	 */
	public OvhTask serviceName_database_databaseName_dump_id_restore_POST(String serviceName, String databaseName, Long id) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/dump/{id}/restore";
		StringBuilder sb = path(qPath, serviceName, databaseName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/database/{databaseName}/dump/{id}
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 * @param id [required] Dump id
	 */
	public OvhDatabaseDump serviceName_database_databaseName_dump_id_GET(String serviceName, String databaseName, Long id) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/dump/{id}";
		StringBuilder sb = path(qPath, serviceName, databaseName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDatabaseDump.class);
	}

	/**
	 * Delete dump before expiration date
	 *
	 * REST: DELETE /hosting/privateDatabase/{serviceName}/database/{databaseName}/dump/{id}
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 * @param id [required] Dump id
	 */
	public OvhTask serviceName_database_databaseName_dump_id_DELETE(String serviceName, String databaseName, Long id) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/dump/{id}";
		StringBuilder sb = path(qPath, serviceName, databaseName, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Dump available for your databases
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/database/{databaseName}/dump
	 * @param deletionDate [required] Filter the value of deletionDate property (like)
	 * @param creationDate [required] Filter the value of creationDate property (like)
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 */
	public ArrayList<Long> serviceName_database_databaseName_dump_GET(String serviceName, String databaseName, Date creationDate, Date deletionDate) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/dump";
		StringBuilder sb = path(qPath, serviceName, databaseName);
		query(sb, "creationDate", creationDate);
		query(sb, "deletionDate", deletionDate);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Request the dump of this database ( an email will be send with a link available 30 days )
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/database/{databaseName}/dump
	 * @param sendEmail [required] Send an email when dump will be available? Default: false
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 */
	public OvhTask serviceName_database_databaseName_dump_POST(String serviceName, String databaseName, Boolean sendEmail) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/dump";
		StringBuilder sb = path(qPath, serviceName, databaseName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "sendEmail", sendEmail);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Extensions linked to your database
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/database/{databaseName}/extension
	 * @param extensionName [required] Filter the value of extensionName property (like)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 */
	public ArrayList<String> serviceName_database_databaseName_extension_GET(String serviceName, String databaseName, String extensionName, OvhStatus status) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/extension";
		StringBuilder sb = path(qPath, serviceName, databaseName);
		query(sb, "extensionName", extensionName);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Disable an extension from a database
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/database/{databaseName}/extension/{extensionName}/disable
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 * @param extensionName [required] Extension name
	 */
	public OvhTask serviceName_database_databaseName_extension_extensionName_disable_POST(String serviceName, String databaseName, String extensionName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/extension/{extensionName}/disable";
		StringBuilder sb = path(qPath, serviceName, databaseName, extensionName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/database/{databaseName}/extension/{extensionName}
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 * @param extensionName [required] Extension name
	 */
	public OvhDatabaseExtension serviceName_database_databaseName_extension_extensionName_GET(String serviceName, String databaseName, String extensionName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/extension/{extensionName}";
		StringBuilder sb = path(qPath, serviceName, databaseName, extensionName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDatabaseExtension.class);
	}

	/**
	 * Enable an extension on a database
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/database/{databaseName}/extension/{extensionName}/enable
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 * @param extensionName [required] Extension name
	 */
	public OvhTask serviceName_database_databaseName_extension_extensionName_enable_POST(String serviceName, String databaseName, String extensionName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/extension/{extensionName}/enable";
		StringBuilder sb = path(qPath, serviceName, databaseName, extensionName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the import in this database
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/database/{databaseName}/import
	 * @param flushDatabase [required] If database will be flushed before importing the dump. Default: false
	 * @param documentId [required] Documents ID of the dump from /me/documents
	 * @param sendEmail [required] Send an email when the import will be done? Default: false
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 */
	public OvhTask serviceName_database_databaseName_import_POST(String serviceName, String databaseName, String documentId, Boolean flushDatabase, Boolean sendEmail) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/import";
		StringBuilder sb = path(qPath, serviceName, databaseName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		addBody(o, "flushDatabase", flushDatabase);
		addBody(o, "sendEmail", sendEmail);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Stop the private database
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/stop
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_stop_POST(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/stop";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/privateDatabase/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your private database
	 */
	public void serviceName_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your private database
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/privateDatabase/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your private database
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, net.minidev.ovh.api.services.OvhService body) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Restart the private database
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/restart
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_restart_POST(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/restart";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Synchronize your informations from your private database
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/refresh
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_refresh_POST(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/refresh";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your private database
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Update the configuration
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/config/update
	 * @param parameters [required] Array of instance configuration parameters
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhConfiguration serviceName_config_update_POST(String serviceName, OvhSafeKeyValue<String>[] parameters) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/config/update";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "parameters", parameters);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhConfiguration.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/config
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhConfiguration serviceName_config_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/config";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhConfiguration.class);
	}

	/**
	 * Create a new database/user and grant it
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/databaseWizard
	 * @param databaseName [required] Name of your new database
	 * @param password [required] Password for the new user ( alphanumeric and 8 characters minimum )
	 * @param userName [required] New user name used to connect on your database
	 * @param grant [required] Grant of the user on this database
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_databaseWizard_POST(String serviceName, String databaseName, OvhGrantEnum grant, String password, String userName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/databaseWizard";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "databaseName", databaseName);
		addBody(o, "grant", grant);
		addBody(o, "password", password);
		addBody(o, "userName", userName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /hosting/privateDatabase/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * List linked webs
	 *
	 * REST: GET /hosting/privateDatabase/{serviceName}/webs
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<String> serviceName_webs_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/webs";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
