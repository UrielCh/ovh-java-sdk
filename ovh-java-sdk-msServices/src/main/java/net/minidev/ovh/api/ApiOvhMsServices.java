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
	 *
	 * API beta
	 */
	public OvhActiveDirectoryOrganizationalUnit serviceName_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhActiveDirectoryOrganizationalUnit.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /msServices/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public void serviceName_PUT(String serviceName, OvhActiveDirectoryOrganizationalUnit body) throws IOException {
		String qPath = "/msServices/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * active directory UPN suffix
	 *
	 * REST: GET /msServices/{serviceName}/upnSuffix
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_upnSuffix_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/upnSuffix";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Create new UPN suffix
	 *
	 * REST: POST /msServices/{serviceName}/upnSuffix
	 * @param suffix [required] UPN suffix to create
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public OvhTask serviceName_upnSuffix_POST(String serviceName, String suffix) throws IOException {
		String qPath = "/msServices/{serviceName}/upnSuffix";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "suffix", suffix);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/upnSuffix/{suffix}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param suffix [required] UPN suffix
	 *
	 * API beta
	 */
	public OvhUpnSuffix serviceName_upnSuffix_suffix_GET(String serviceName, String suffix) throws IOException {
		String qPath = "/msServices/{serviceName}/upnSuffix/{suffix}";
		StringBuilder sb = path(qPath, serviceName, suffix);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhUpnSuffix.class);
	}

	/**
	 * Delete existing UPN suffix
	 *
	 * REST: DELETE /msServices/{serviceName}/upnSuffix/{suffix}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param suffix [required] UPN suffix
	 *
	 * API beta
	 */
	public OvhTask serviceName_upnSuffix_suffix_DELETE(String serviceName, String suffix) throws IOException {
		String qPath = "/msServices/{serviceName}/upnSuffix/{suffix}";
		StringBuilder sb = path(qPath, serviceName, suffix);
		String resp = exec("DELETE", sb.toString());
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/account/{userPrincipalName}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhAccount serviceName_account_userPrincipalName_GET(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /msServices/{serviceName}/account/{userPrincipalName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public void serviceName_account_userPrincipalName_PUT(String serviceName, String userPrincipalName, OvhAccount body) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/account/{userPrincipalName}/sharepoint
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhSharepointInformation serviceName_account_userPrincipalName_sharepoint_GET(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sharepoint";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSharepointInformation.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /msServices/{serviceName}/account/{userPrincipalName}/sharepoint
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public void serviceName_account_userPrincipalName_sharepoint_PUT(String serviceName, String userPrincipalName, OvhSharepointInformation body) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sharepoint";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * On-demand MySite clearance
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/sharepoint/clearSpace
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhSharepointTask serviceName_account_userPrincipalName_sharepoint_clearSpace_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sharepoint/clearSpace";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhSharepointTask.class);
	}

	/**
	 * Configure sharepoint account to be operational
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/sharepoint/configure
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhSharepointTask serviceName_account_userPrincipalName_sharepoint_configure_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sharepoint/configure";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhSharepointTask.class);
	}

	/**
	 * Change account password
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/changePassword
	 * @param password [required] new password
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhTask serviceName_account_userPrincipalName_changePassword_POST(String serviceName, String userPrincipalName, String password) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/changePassword";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/account/{userPrincipalName}/exchange
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhExchangeInformation serviceName_account_userPrincipalName_exchange_GET(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/exchange";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhExchangeInformation.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /msServices/{serviceName}/account/{userPrincipalName}/exchange
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public void serviceName_account_userPrincipalName_exchange_PUT(String serviceName, String userPrincipalName, OvhExchangeInformation body) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/exchange";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Configure mailbox to be operational
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/exchange/configure
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhExchangeTask serviceName_account_userPrincipalName_exchange_configure_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/exchange/configure";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhExchangeTask.class);
	}

	/**
	 * Accounts associated to this Active Directory service
	 *
	 * REST: GET /msServices/{serviceName}/account
	 * @param id [required] Filter the value of id property (like)
	 * @param userPrincipalName [required] Filter the value of userPrincipalName property (like)
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_account_GET(String serviceName, Long id, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "id", id);
		query(sb, "userPrincipalName", userPrincipalName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/sharepoint
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public OvhSharepointService serviceName_sharepoint_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSharepointService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /msServices/{serviceName}/sharepoint
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public void serviceName_sharepoint_PUT(String serviceName, OvhSharepointService body) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint";
		StringBuilder sb = path(qPath, serviceName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Restore administrator rights
	 *
	 * REST: POST /msServices/{serviceName}/sharepoint/restoreAdminRights
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public OvhSharepointTask serviceName_sharepoint_restoreAdminRights_POST(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/restoreAdminRights";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhSharepointTask.class);
	}

	/**
	 * Pending actions
	 *
	 * REST: GET /msServices/{serviceName}/sharepoint/task
	 * @param function [required] Filter the value of function property (like)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_sharepoint_task_GET(String serviceName, String function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/sharepoint/task/{id}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param id [required] Task id
	 *
	 * API beta
	 */
	public OvhSharepointTask serviceName_sharepoint_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/task/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSharepointTask.class);
	}

	/**
	 * Get active licenses for specific period of time
	 *
	 * REST: GET /msServices/{serviceName}/sharepoint/license
	 * @param period [required] Period of time used to determine sharepoint account license statistics
	 * @param license [required] License type
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public ArrayList<OvhSharepointDailyLicense> serviceName_sharepoint_license_GET(String serviceName, OvhSharepointLicenseEnum license, OvhLicensePeriodEnum period) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/license";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "license", license);
		query(sb, "period", period);
		String resp = exec("GET", sb.toString());
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
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskFunctionEnum function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/msServices/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/task/{id}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param id [required] Task id
	 *
	 * API beta
	 */
	public OvhTask serviceName_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/msServices/{serviceName}/task/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/exchange
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public OvhExchangeService serviceName_exchange_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/exchange";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhExchangeService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /msServices/{serviceName}/exchange
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public void serviceName_exchange_PUT(String serviceName, OvhExchangeService body) throws IOException {
		String qPath = "/msServices/{serviceName}/exchange";
		StringBuilder sb = path(qPath, serviceName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Pending actions
	 *
	 * REST: GET /msServices/{serviceName}/exchange/task
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_exchange_task_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/exchange/task";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/exchange/task/{id}
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param id [required] Task id
	 *
	 * API beta
	 */
	public OvhExchangeTask serviceName_exchange_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/msServices/{serviceName}/exchange/task/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhExchangeTask.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /msServices
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/msServices";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}
}
