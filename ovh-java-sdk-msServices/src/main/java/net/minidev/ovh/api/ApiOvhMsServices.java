package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.msservices.OvhAccount;
import net.minidev.ovh.api.msservices.OvhActiveDirectoryOrganizationalUnit;
import net.minidev.ovh.api.msservices.OvhExchangeInformation;
import net.minidev.ovh.api.msservices.OvhExchangeService;
import net.minidev.ovh.api.msservices.OvhExchangeTask;
import net.minidev.ovh.api.msservices.OvhLicensePeriodEnum;
import net.minidev.ovh.api.msservices.OvhSharepointDailyLicense;
import net.minidev.ovh.api.msservices.OvhSharepointInformation;
import net.minidev.ovh.api.msservices.OvhSharepointLicenseEnum;
import net.minidev.ovh.api.msservices.OvhSharepointService;
import net.minidev.ovh.api.msservices.OvhSharepointTask;
import net.minidev.ovh.api.msservices.OvhTask;
import net.minidev.ovh.api.msservices.OvhTaskFunctionEnum;
import net.minidev.ovh.api.msservices.OvhTaskStatusEnum;
import net.minidev.ovh.api.msservices.OvhUpnSuffix;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/msServices
 * version:1.0
 */
public class ApiOvhMsServices extends ApiOvhBase {
	public ApiOvhMsServices(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public OvhActiveDirectoryOrganizationalUnit serviceName_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhActiveDirectoryOrganizationalUnit.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /msServices/{serviceName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public void serviceName_PUT(String serviceName, OvhActiveDirectoryOrganizationalUnit body) throws IOException {
		String qPath = "/msServices/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * active directory UPN suffix
	 * 
	 * REST: GET /msServices/{serviceName}/upnSuffix
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public ArrayList<String> serviceName_upnSuffix_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/upnSuffix";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Create new UPN suffix
	 * 
	 * REST: POST /msServices/{serviceName}/upnSuffix
	 * @param suffix [required] UPN suffix to create
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public OvhTask serviceName_upnSuffix_POST(String serviceName, String suffix) throws IOException {
		String qPath = "/msServices/{serviceName}/upnSuffix";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "suffix", suffix);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}/upnSuffix/{suffix}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param suffix [required] UPN suffix
	 */
	public OvhUpnSuffix serviceName_upnSuffix_suffix_GET(String serviceName, String suffix) throws IOException {
		String qPath = "/msServices/{serviceName}/upnSuffix/{suffix}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{suffix}", suffix);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUpnSuffix.class);
	}

	/**
	 * Delete existing UPN suffix
	 * 
	 * REST: DELETE /msServices/{serviceName}/upnSuffix/{suffix}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param suffix [required] UPN suffix
	 */
	public OvhTask serviceName_upnSuffix_suffix_DELETE(String serviceName, String suffix) throws IOException {
		String qPath = "/msServices/{serviceName}/upnSuffix/{suffix}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{suffix}", suffix);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}/account/{userPrincipalName}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public OvhAccount serviceName_account_userPrincipalName_GET(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /msServices/{serviceName}/account/{userPrincipalName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public void serviceName_account_userPrincipalName_PUT(String serviceName, String userPrincipalName, OvhAccount body) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}/account/{userPrincipalName}/sharepoint
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public OvhSharepointInformation serviceName_account_userPrincipalName_sharepoint_GET(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sharepoint";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSharepointInformation.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /msServices/{serviceName}/account/{userPrincipalName}/sharepoint
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public void serviceName_account_userPrincipalName_sharepoint_PUT(String serviceName, String userPrincipalName, OvhSharepointInformation body) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sharepoint";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		exec("PUT", qPath, body);
	}

	/**
	 * On-demand MySite clearance
	 * 
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/sharepoint/clearSpace
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public OvhSharepointTask serviceName_account_userPrincipalName_sharepoint_clearSpace_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sharepoint/clearSpace";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhSharepointTask.class);
	}

	/**
	 * Configure sharepoint account to be operational
	 * 
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/sharepoint/configure
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public OvhSharepointTask serviceName_account_userPrincipalName_sharepoint_configure_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sharepoint/configure";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhSharepointTask.class);
	}

	/**
	 * Change account password
	 * 
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/changePassword
	 * @param password [required] new password
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public OvhTask serviceName_account_userPrincipalName_changePassword_POST(String serviceName, String userPrincipalName, String password) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}/account/{userPrincipalName}/exchange
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public OvhExchangeInformation serviceName_account_userPrincipalName_exchange_GET(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/exchange";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeInformation.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /msServices/{serviceName}/account/{userPrincipalName}/exchange
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public void serviceName_account_userPrincipalName_exchange_PUT(String serviceName, String userPrincipalName, OvhExchangeInformation body) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/exchange";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		exec("PUT", qPath, body);
	}

	/**
	 * Configure mailbox to be operational
	 * 
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/exchange/configure
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 */
	public OvhExchangeTask serviceName_account_userPrincipalName_exchange_configure_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/exchange/configure";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userPrincipalName}", userPrincipalName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhExchangeTask.class);
	}

	/**
	 * Accounts associated to this Active Directory service
	 * 
	 * REST: GET /msServices/{serviceName}/account
	 * @param id [required] Filter the value of id property (like)
	 * @param userPrincipalName [required] Filter the value of userPrincipalName property (like)
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public ArrayList<String> serviceName_account_GET(String serviceName, Long id, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "id", id);
		qPath = query(qPath, "userPrincipalName", userPrincipalName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}/sharepoint
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public OvhSharepointService serviceName_sharepoint_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSharepointService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /msServices/{serviceName}/sharepoint
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public void serviceName_sharepoint_PUT(String serviceName, OvhSharepointService body) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Restore administrator rights
	 * 
	 * REST: POST /msServices/{serviceName}/sharepoint/restoreAdminRights
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public OvhSharepointTask serviceName_sharepoint_restoreAdminRights_POST(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/restoreAdminRights";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhSharepointTask.class);
	}

	/**
	 * Pending actions
	 * 
	 * REST: GET /msServices/{serviceName}/sharepoint/task
	 * @param function [required] Filter the value of function property (like)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public ArrayList<Long> serviceName_sharepoint_task_GET(String serviceName, String function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}/sharepoint/task/{id}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param id [required] Task id
	 */
	public OvhSharepointTask serviceName_sharepoint_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/task/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSharepointTask.class);
	}

	/**
	 * Get active licenses for specific period of time
	 * 
	 * REST: GET /msServices/{serviceName}/sharepoint/license
	 * @param period [required] Period of time used to determine sharepoint account license statistics
	 * @param license [required] License type
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public ArrayList<OvhSharepointDailyLicense> serviceName_sharepoint_license_GET(String serviceName, OvhSharepointLicenseEnum license, OvhLicensePeriodEnum period) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/license";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "license", license);
		qPath = query(qPath, "period", period);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhSharepointDailyLicense>> t3 = new TypeReference<ArrayList<OvhSharepointDailyLicense>>() {};

	/**
	 * Pending actions
	 * 
	 * REST: GET /msServices/{serviceName}/task
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskFunctionEnum function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/msServices/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}/task/{id}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param id [required] Task id
	 */
	public OvhTask serviceName_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/msServices/{serviceName}/task/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}/exchange
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public OvhExchangeService serviceName_exchange_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/exchange";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /msServices/{serviceName}/exchange
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public void serviceName_exchange_PUT(String serviceName, OvhExchangeService body) throws IOException {
		String qPath = "/msServices/{serviceName}/exchange";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Pending actions
	 * 
	 * REST: GET /msServices/{serviceName}/exchange/task
	 * @param serviceName [required] The internal name of your Active Directory organization
	 */
	public ArrayList<Long> serviceName_exchange_task_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/exchange/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /msServices/{serviceName}/exchange/task/{id}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param id [required] Task id
	 */
	public OvhExchangeTask serviceName_exchange_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/msServices/{serviceName}/exchange/task/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeTask.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /msServices
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/msServices";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
}
