package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.msservices.OvhAccount;
import net.minidev.ovh.api.msservices.OvhActiveDirectoryOrganizationalUnit;
import net.minidev.ovh.api.msservices.OvhActiveDirectorySyncClientUrl;
import net.minidev.ovh.api.msservices.OvhExchangeInformation;
import net.minidev.ovh.api.msservices.OvhExchangeService;
import net.minidev.ovh.api.msservices.OvhExchangeTask;
import net.minidev.ovh.api.msservices.OvhLicensePeriodEnum;
import net.minidev.ovh.api.msservices.OvhMfaInformation;
import net.minidev.ovh.api.msservices.OvhSharepointDailyLicense;
import net.minidev.ovh.api.msservices.OvhSharepointInformation;
import net.minidev.ovh.api.msservices.OvhSharepointLicenseEnum;
import net.minidev.ovh.api.msservices.OvhSharepointService;
import net.minidev.ovh.api.msservices.OvhSharepointServiceInfo;
import net.minidev.ovh.api.msservices.OvhSharepointTask;
import net.minidev.ovh.api.msservices.OvhSyncDailyLicense;
import net.minidev.ovh.api.msservices.OvhSyncInformation;
import net.minidev.ovh.api.msservices.OvhSyncLicenseEnum;
import net.minidev.ovh.api.msservices.OvhSyncService;
import net.minidev.ovh.api.msservices.OvhTask;
import net.minidev.ovh.api.msservices.OvhTaskFunctionEnum;
import net.minidev.ovh.api.msservices.OvhTaskStatusEnum;
import net.minidev.ovh.api.msservices.OvhUpnSuffix;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/msServices
 * version:1.0
 */
public class ApiOvhMsServices extends ApiOvhBase {
	public ApiOvhMsServices(ApiOvhCore core) {
		super(core);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		String resp = exec(qPath, "POST", sb.toString(), o);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
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
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/account/{userPrincipalName}/sync
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhSyncInformation serviceName_account_userPrincipalName_sync_GET(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sync";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSyncInformation.class);
	}

	/**
	 * Create new sync account
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/sync
	 * @param license [required] Sync account license
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhTask serviceName_account_userPrincipalName_sync_POST(String serviceName, String userPrincipalName, OvhSyncLicenseEnum license) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sync";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "license", license);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Delete sync account
	 *
	 * REST: DELETE /msServices/{serviceName}/account/{userPrincipalName}/sync
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhTask serviceName_account_userPrincipalName_sync_DELETE(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sync";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Configure sync account to be operational
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/sync/configure
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhTask serviceName_account_userPrincipalName_sync_configure_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/sync/configure";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Enable Mfa (enabled by default when created)
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/mfa/enable
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhTask serviceName_account_userPrincipalName_mfa_enable_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/mfa/enable";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/account/{userPrincipalName}/mfa
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhMfaInformation serviceName_account_userPrincipalName_mfa_GET(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/mfa";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMfaInformation.class);
	}

	/**
	 * Create Multi Factor Authentication for this account
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/mfa
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhTask serviceName_account_userPrincipalName_mfa_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/mfa";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Delete Multi Factor Authentication feature for this account
	 *
	 * REST: DELETE /msServices/{serviceName}/account/{userPrincipalName}/mfa
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhTask serviceName_account_userPrincipalName_mfa_DELETE(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/mfa";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Reset Multi Factor Authentication status for this account
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/mfa/reset
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhTask serviceName_account_userPrincipalName_mfa_reset_POST(String serviceName, String userPrincipalName) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/mfa/reset";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Disable Multi Factor Authentication for a period of time
	 *
	 * REST: POST /msServices/{serviceName}/account/{userPrincipalName}/mfa/disable
	 * @param period [required] Multi Factor Authentication disable period in hours
	 * @param serviceName [required] The internal name of your Active Directory organization
	 * @param userPrincipalName [required] User Principal Name
	 *
	 * API beta
	 */
	public OvhTask serviceName_account_userPrincipalName_mfa_disable_POST(String serviceName, String userPrincipalName, Long period) throws IOException {
		String qPath = "/msServices/{serviceName}/account/{userPrincipalName}/mfa/disable";
		StringBuilder sb = path(qPath, serviceName, userPrincipalName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "period", period);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		exec(qPath, "PUT", sb.toString(), body);
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
		String resp = exec(qPath, "POST", sb.toString(), null);
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
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhSharepointTask.class);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		exec(qPath, "PUT", sb.toString(), body);
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
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhExchangeTask.class);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		exec(qPath, "PUT", sb.toString(), body);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		exec(qPath, "PUT", sb.toString(), body);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

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
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhExchangeTask.class);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Detects billing transition status for the service
	 *
	 * REST: GET /msServices/{serviceName}/exchange/billingMigrated
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public Boolean serviceName_exchange_billingMigrated_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/exchange/billingMigrated";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Pending actions
	 *
	 * REST: GET /msServices/{serviceName}/sharepoint/task
	 * @param status [required] Filter the value of status property (=)
	 * @param function [required] Filter the value of function property (like)
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_sharepoint_task_GET(String serviceName, String function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

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
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSharepointTask.class);
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
		String resp = exec(qPath, "POST", sb.toString(), null);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhSharepointDailyLicense>> t3 = new TypeReference<ArrayList<OvhSharepointDailyLicense>>() {};

	/**
	 * Detects billing transition status for the service
	 *
	 * REST: GET /msServices/{serviceName}/sharepoint/billingMigrated
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public Boolean serviceName_sharepoint_billingMigrated_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/sharepoint/billingMigrated";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Change account password
	 *
	 * REST: POST /msServices/{serviceName}/sync/changePassword
	 * @param password [required] new password
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public OvhTask serviceName_sync_changePassword_POST(String serviceName, String password) throws IOException {
		String qPath = "/msServices/{serviceName}/sync/changePassword";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/sync
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public OvhSyncService serviceName_sync_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/sync";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSyncService.class);
	}

	/**
	 * Delete sync service
	 *
	 * REST: DELETE /msServices/{serviceName}/sync
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public OvhTask serviceName_sync_DELETE(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/sync";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/{serviceName}/sync/clientSoftwareURL
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public OvhActiveDirectorySyncClientUrl serviceName_sync_clientSoftwareURL_GET(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/sync/clientSoftwareURL";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhActiveDirectorySyncClientUrl.class);
	}

	/**
	 * Generate temporary link to ADSync software executable
	 *
	 * REST: POST /msServices/{serviceName}/sync/clientSoftwareURL
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public OvhTask serviceName_sync_clientSoftwareURL_POST(String serviceName) throws IOException {
		String qPath = "/msServices/{serviceName}/sync/clientSoftwareURL";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get active licenses for specific period of time
	 *
	 * REST: GET /msServices/{serviceName}/sync/license
	 * @param period [required] Period of time used to determine sync account license statistics
	 * @param license [required] License type
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public ArrayList<OvhSyncDailyLicense> serviceName_sync_license_GET(String serviceName, OvhSyncLicenseEnum license, OvhLicensePeriodEnum period) throws IOException {
		String qPath = "/msServices/{serviceName}/sync/license";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "license", license);
		query(sb, "period", period);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhSyncDailyLicense>> t4 = new TypeReference<ArrayList<OvhSyncDailyLicense>>() {};

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
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Pending actions
	 *
	 * REST: GET /msServices/{serviceName}/task
	 * @param status [required] Filter the value of status property (=)
	 * @param function [required] Filter the value of function property (=)
	 * @param serviceName [required] The internal name of your Active Directory organization
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskFunctionEnum function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/msServices/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * List available services
	 *
	 * REST: GET /msServices/sharepoint
	 *
	 * API beta
	 */
	public ArrayList<String> sharepoint_GET() throws IOException {
		String qPath = "/msServices/sharepoint";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/sharepoint/{domain}
	 * @param domain [required] Sharepoint customer's service
	 *
	 * API beta
	 */
	public OvhSharepointServiceInfo sharepoint_domain_GET(String domain) throws IOException {
		String qPath = "/msServices/sharepoint/{domain}";
		StringBuilder sb = path(qPath, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSharepointServiceInfo.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /msServices/sharepoint/{domain}/serviceInfos
	 * @param domain [required] Sharepoint customer's service
	 *
	 * API beta
	 */
	public OvhService sharepoint_domain_serviceInfos_GET(String domain) throws IOException {
		String qPath = "/msServices/sharepoint/{domain}/serviceInfos";
		StringBuilder sb = path(qPath, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /msServices/sharepoint/{domain}/serviceInfos
	 * @param body [required] New object properties
	 * @param domain [required] Sharepoint customer's service
	 *
	 * API beta
	 */
	public void sharepoint_domain_serviceInfos_PUT(String domain, OvhService body) throws IOException {
		String qPath = "/msServices/sharepoint/{domain}/serviceInfos";
		StringBuilder sb = path(qPath, domain);
		exec(qPath, "PUT", sb.toString(), body);
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
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
