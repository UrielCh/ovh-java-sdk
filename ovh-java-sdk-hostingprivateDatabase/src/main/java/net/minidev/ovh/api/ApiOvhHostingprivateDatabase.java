package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhSafeKeyValue;
import net.minidev.ovh.api.hosting.privatedatabase.OvhAvailableVersionEnum;
import net.minidev.ovh.api.hosting.privatedatabase.OvhConfiguration;
import net.minidev.ovh.api.hosting.privatedatabase.OvhDatabase;
import net.minidev.ovh.api.hosting.privatedatabase.OvhDatabaseDump;
import net.minidev.ovh.api.hosting.privatedatabase.OvhDump;
import net.minidev.ovh.api.hosting.privatedatabase.OvhGrant;
import net.minidev.ovh.api.hosting.privatedatabase.OvhTask;
import net.minidev.ovh.api.hosting.privatedatabase.OvhUser;
import net.minidev.ovh.api.hosting.privatedatabase.grant.OvhGrantEnum;
import net.minidev.ovh.api.hosting.privatedatabase.task.OvhFunctionEnum;
import net.minidev.ovh.api.hosting.privatedatabase.task.OvhStatusEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/hosting/privateDatabase
 * version:1.0
 */
public class ApiOvhHostingprivateDatabase extends ApiOvhBase {
	public ApiOvhHostingprivateDatabase(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hosting/privateDatabase/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your private database
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}
	 * @param serviceName [required] The internal name of your private database
	 */
	public net.minidev.ovh.api.hosting.privatedatabase.OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, net.minidev.ovh.api.hosting.privatedatabase.OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hosting/privateDatabase/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your private database
	 */
	public void serviceName_PUT(String serviceName, net.minidev.ovh.api.hosting.privatedatabase.OvhService body) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Change the private database engine version
	 * 
	 * REST: POST /hosting/privateDatabase/{serviceName}/changeVersion
	 * @param version [required] Private database versions
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_changeVersion_POST(String serviceName, OvhAvailableVersionEnum version) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/changeVersion";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Dumps available for your private database service
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}/dump
	 * @param databaseName [required] Filter the value of databaseName property (like)
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<Long> serviceName_dump_GET(String serviceName, String databaseName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/dump";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "databaseName", databaseName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}/dump/{dumpId}
	 * @param serviceName [required] The internal name of your private database
	 * @param dumpId [required] Dump id
	 */
	public OvhDump serviceName_dump_dumpId_GET(String serviceName, Long dumpId) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/dump/{dumpId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{dumpId}", dumpId.toString());
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{dumpId}", dumpId.toString());
		String resp = exec("DELETE", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{dumpId}", dumpId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "databaseName", databaseName);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List linked webs
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}/webs
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<String> serviceName_webs_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/webs";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /hosting/privateDatabase/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t1);
	}

	/**
	 * Synchronize your informations from your private database
	 * 
	 * REST: POST /hosting/privateDatabase/{serviceName}/refresh
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_refresh_POST(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/refresh";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhAvailableVersionEnum>> t3 = new TypeReference<ArrayList<OvhAvailableVersionEnum>>() {};

	/**
	 * User allowed to connect on your databases
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}/user
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<String> serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Create a new user on your service
	 * 
	 * REST: POST /hosting/privateDatabase/{serviceName}/user
	 * @param password [required] Password for the new user ( alphanumeric and 8 characters minimum )
	 * @param userName [required] User name used to connect on your databases
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_user_POST(String serviceName, String password, String userName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "userName", userName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}/user/{userName}
	 * @param serviceName [required] The internal name of your private database
	 * @param userName [required] User name used to connect to your databases
	 */
	public OvhUser serviceName_user_userName_GET(String serviceName, String userName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/user/{userName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		String resp = exec("DELETE", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "databaseName", databaseName);
		addBody(o, "grant", grant);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		qPath = qPath.replace("{databaseName}", databaseName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		qPath = qPath.replace("{databaseName}", databaseName);
		String resp = exec("DELETE", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userName}", userName);
		qPath = qPath.replace("{databaseName}", databaseName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "grant", grant);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restart the private database
	 * 
	 * REST: POST /hosting/privateDatabase/{serviceName}/restart
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_restart_POST(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/restart";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /hosting/privateDatabase/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your private database
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/confirmTermination";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Databases linked to your private database service
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}/database
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<String> serviceName_database_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "databaseName", databaseName);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{databaseName}", databaseName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{databaseName}", databaseName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Dump available for your databases
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}/database/{databaseName}/dump
	 * @param creationDate [required] Filter the value of creationDate property (like)
	 * @param deletionDate [required] Filter the value of deletionDate property (like)
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 */
	public ArrayList<Long> serviceName_database_databaseName_dump_GET(String serviceName, String databaseName, Date creationDate, Date deletionDate) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/dump";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{databaseName}", databaseName);
		qPath = query(qPath, "creationDate", creationDate);
		qPath = query(qPath, "deletionDate", deletionDate);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{databaseName}", databaseName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "sendEmail", sendEmail);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{databaseName}", databaseName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{databaseName}", databaseName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{databaseName}", databaseName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the import in this database
	 * 
	 * REST: POST /hosting/privateDatabase/{serviceName}/database/{databaseName}/import
	 * @param documentId [required] Documents ID of the dump from /me/documents
	 * @param sendEmail [required] Send an email when the import will be done? Default: false
	 * @param flushDatabase [required] If database will be flushed before importing the dump. Default: false
	 * @param serviceName [required] The internal name of your private database
	 * @param databaseName [required] Database name
	 */
	public OvhTask serviceName_database_databaseName_import_POST(String serviceName, String databaseName, String documentId, Boolean sendEmail, Boolean flushDatabase) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/database/{databaseName}/import";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{databaseName}", databaseName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		addBody(o, "sendEmail", sendEmail);
		addBody(o, "flushDatabase", flushDatabase);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Create a new database/user and grant it
	 * 
	 * REST: POST /hosting/privateDatabase/{serviceName}/databaseWizard
	 * @param password [required] Password for the new user ( alphanumeric and 8 characters minimum )
	 * @param databaseName [required] Name of your new database
	 * @param userName [required] New user name used to connect on your database
	 * @param grant [required] Grant of the user on this database
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_databaseWizard_POST(String serviceName, String password, String databaseName, String userName, OvhGrantEnum grant) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/databaseWizard";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "databaseName", databaseName);
		addBody(o, "userName", userName);
		addBody(o, "grant", grant);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/privateDatabase/{serviceName}/config
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhConfiguration serviceName_config_GET(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/config";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhConfiguration.class);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "parameters", parameters);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhConfiguration.class);
	}

	/**
	 * Start the private database
	 * 
	 * REST: POST /hosting/privateDatabase/{serviceName}/start
	 * @param serviceName [required] The internal name of your private database
	 */
	public OvhTask serviceName_start_POST(String serviceName) throws IOException {
		String qPath = "/hosting/privateDatabase/{serviceName}/start";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /hosting/privateDatabase
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/hosting/privateDatabase";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
}
