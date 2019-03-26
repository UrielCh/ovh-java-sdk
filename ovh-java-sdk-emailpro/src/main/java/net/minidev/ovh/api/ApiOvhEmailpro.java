package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.email.pro.OvhAccount;
import net.minidev.ovh.api.email.pro.OvhAccountAlias;
import net.minidev.ovh.api.email.pro.OvhAccountDiagnosis;
import net.minidev.ovh.api.email.pro.OvhAccountFullAccess;
import net.minidev.ovh.api.email.pro.OvhAccountSendAs;
import net.minidev.ovh.api.email.pro.OvhAccountSendOnBehalfTo;
import net.minidev.ovh.api.email.pro.OvhDisclaimer;
import net.minidev.ovh.api.email.pro.OvhDisclaimerAttributeEnum;
import net.minidev.ovh.api.email.pro.OvhDomain;
import net.minidev.ovh.api.email.pro.OvhDomainTypeEnum;
import net.minidev.ovh.api.email.pro.OvhExternalContact;
import net.minidev.ovh.api.email.pro.OvhObjectStateEnum;
import net.minidev.ovh.api.email.pro.OvhServer;
import net.minidev.ovh.api.email.pro.OvhService;
import net.minidev.ovh.api.email.pro.OvhTask;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/email/pro
 * version:1.0
 */
public class ApiOvhEmailpro extends ApiOvhBase {
	public ApiOvhEmailpro(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/task/{id}
	 * @param service [required] The internal name of your pro organization
	 * @param id [required] Task id
	 *
	 * API beta
	 */
	public OvhTask service_task_id_GET(String service, Long id) throws IOException {
		String qPath = "/email/pro/{service}/task/{id}";
		StringBuilder sb = path(qPath, service, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Pending actions
	 *
	 * REST: GET /email/pro/{service}/task
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public ArrayList<Long> service_task_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}/task";
		StringBuilder sb = path(qPath, service);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/externalContact/{externalEmailAddress}
	 * @param service [required] The internal name of your pro organization
	 * @param externalEmailAddress [required] Contact email
	 *
	 * API beta
	 */
	public OvhExternalContact service_externalContact_externalEmailAddress_GET(String service, String externalEmailAddress) throws IOException {
		String qPath = "/email/pro/{service}/externalContact/{externalEmailAddress}";
		StringBuilder sb = path(qPath, service, externalEmailAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhExternalContact.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/externalContact/{externalEmailAddress}
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 * @param externalEmailAddress [required] Contact email
	 *
	 * API beta
	 */
	public void service_externalContact_externalEmailAddress_PUT(String service, String externalEmailAddress, OvhExternalContact body) throws IOException {
		String qPath = "/email/pro/{service}/externalContact/{externalEmailAddress}";
		StringBuilder sb = path(qPath, service, externalEmailAddress);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * delete external contact
	 *
	 * REST: DELETE /email/pro/{service}/externalContact/{externalEmailAddress}
	 * @param service [required] The internal name of your pro organization
	 * @param externalEmailAddress [required] Contact email
	 *
	 * API beta
	 */
	public OvhTask service_externalContact_externalEmailAddress_DELETE(String service, String externalEmailAddress) throws IOException {
		String qPath = "/email/pro/{service}/externalContact/{externalEmailAddress}";
		StringBuilder sb = path(qPath, service, externalEmailAddress);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * External contacts for this service
	 *
	 * REST: GET /email/pro/{service}/externalContact
	 * @param id [required] Filter the value of id property (like)
	 * @param displayName [required] Filter the value of displayName property (like)
	 * @param lastName [required] Filter the value of lastName property (like)
	 * @param firstName [required] Filter the value of firstName property (like)
	 * @param externalEmailAddress [required] Filter the value of externalEmailAddress property (like)
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public ArrayList<String> service_externalContact_GET(String service, String displayName, String externalEmailAddress, String firstName, Long id, String lastName) throws IOException {
		String qPath = "/email/pro/{service}/externalContact";
		StringBuilder sb = path(qPath, service);
		query(sb, "displayName", displayName);
		query(sb, "externalEmailAddress", externalEmailAddress);
		query(sb, "firstName", firstName);
		query(sb, "id", id);
		query(sb, "lastName", lastName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * create new external contact
	 *
	 * REST: POST /email/pro/{service}/externalContact
	 * @param displayName [required] Contact display name
	 * @param hiddenFromGAL [required] Hide the contact in Global Address List
	 * @param externalEmailAddress [required] Contact email address
	 * @param initials [required] Contact initials
	 * @param firstName [required] Contact first name
	 * @param lastName [required] Contact last name
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public OvhTask service_externalContact_POST(String service, String displayName, String externalEmailAddress, String firstName, Boolean hiddenFromGAL, String initials, String lastName) throws IOException {
		String qPath = "/email/pro/{service}/externalContact";
		StringBuilder sb = path(qPath, service);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "displayName", displayName);
		addBody(o, "externalEmailAddress", externalEmailAddress);
		addBody(o, "firstName", firstName);
		addBody(o, "hiddenFromGAL", hiddenFromGAL);
		addBody(o, "initials", initials);
		addBody(o, "lastName", lastName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Detects billing transition status for the service
	 *
	 * REST: GET /email/pro/{service}/billingMigrated
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public Boolean service_billingMigrated_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}/billingMigrated";
		StringBuilder sb = path(qPath, service);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Update spam and virus flags on all active accounts
	 *
	 * REST: POST /email/pro/{service}/updateFlagsOnAllAccounts
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public void service_updateFlagsOnAllAccounts_POST(String service) throws IOException {
		String qPath = "/email/pro/{service}/updateFlagsOnAllAccounts";
		StringBuilder sb = path(qPath, service);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public OvhService service_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}";
		StringBuilder sb = path(qPath, service);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public void service_PUT(String service, OvhService body) throws IOException {
		String qPath = "/email/pro/{service}";
		StringBuilder sb = path(qPath, service);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/server
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public OvhServer service_server_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}/server";
		StringBuilder sb = path(qPath, service);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServer.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/serviceInfos
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public net.minidev.ovh.api.services.OvhService service_serviceInfos_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}/serviceInfos";
		StringBuilder sb = path(qPath, service);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/serviceInfos
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public void service_serviceInfos_PUT(String service, net.minidev.ovh.api.services.OvhService body) throws IOException {
		String qPath = "/email/pro/{service}/serviceInfos";
		StringBuilder sb = path(qPath, service);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Accounts associated to this pro service
	 *
	 * REST: GET /email/pro/{service}/account
	 * @param primaryEmailAddress [required] Filter the value of primaryEmailAddress property (like)
	 * @param id [required] Filter the value of id property (like)
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public ArrayList<String> service_account_GET(String service, Long id, String primaryEmailAddress) throws IOException {
		String qPath = "/email/pro/{service}/account";
		StringBuilder sb = path(qPath, service);
		query(sb, "id", id);
		query(sb, "primaryEmailAddress", primaryEmailAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Full access granted users for this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/fullAccess
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public ArrayList<Long> service_account_email_fullAccess_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/fullAccess";
		StringBuilder sb = path(qPath, service, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Allow full access to a user
	 *
	 * REST: POST /email/pro/{service}/account/{email}/fullAccess
	 * @param allowedAccountId [required] User to give full access
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public OvhTask service_account_email_fullAccess_POST(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/fullAccess";
		StringBuilder sb = path(qPath, service, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowedAccountId", allowedAccountId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/fullAccess/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give full access
	 *
	 * API beta
	 */
	public OvhAccountFullAccess service_account_email_fullAccess_allowedAccountId_GET(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/fullAccess/{allowedAccountId}";
		StringBuilder sb = path(qPath, service, email, allowedAccountId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccountFullAccess.class);
	}

	/**
	 * Revoke full access
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}/fullAccess/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give full access
	 *
	 * API beta
	 */
	public OvhTask service_account_email_fullAccess_allowedAccountId_DELETE(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/fullAccess/{allowedAccountId}";
		StringBuilder sb = path(qPath, service, email, allowedAccountId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/tasks/{id}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param id [required] Task id
	 *
	 * API beta
	 */
	public OvhTask service_account_email_tasks_id_GET(String service, String email, Long id) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/tasks/{id}";
		StringBuilder sb = path(qPath, service, email, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Pending task for this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/tasks
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public ArrayList<Long> service_account_email_tasks_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/tasks";
		StringBuilder sb = path(qPath, service, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public OvhAccount service_account_email_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}";
		StringBuilder sb = path(qPath, service, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/account/{email}
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public void service_account_email_PUT(String service, String email, OvhAccount body) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}";
		StringBuilder sb = path(qPath, service, email);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete existing mailbox in pro server
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public OvhTask service_account_email_DELETE(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}";
		StringBuilder sb = path(qPath, service, email);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/diagnostics
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public OvhAccountDiagnosis service_account_email_diagnostics_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/diagnostics";
		StringBuilder sb = path(qPath, service, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccountDiagnosis.class);
	}

	/**
	 * Create new diagnosis request
	 *
	 * REST: POST /email/pro/{service}/account/{email}/diagnostics
	 * @param password [required] Account password
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public OvhTask service_account_email_diagnostics_POST(String service, String email, String password) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/diagnostics";
		StringBuilder sb = path(qPath, service, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/alias/{alias}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param alias [required] Alias
	 *
	 * API beta
	 */
	public OvhAccountAlias service_account_email_alias_alias_GET(String service, String email, String alias) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/alias/{alias}";
		StringBuilder sb = path(qPath, service, email, alias);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccountAlias.class);
	}

	/**
	 * Delete existing alias
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}/alias/{alias}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param alias [required] Alias
	 *
	 * API beta
	 */
	public OvhTask service_account_email_alias_alias_DELETE(String service, String email, String alias) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/alias/{alias}";
		StringBuilder sb = path(qPath, service, email, alias);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Aliases associated to this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/alias
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public ArrayList<String> service_account_email_alias_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/alias";
		StringBuilder sb = path(qPath, service, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create new alias
	 *
	 * REST: POST /email/pro/{service}/account/{email}/alias
	 * @param alias [required] Alias
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public OvhTask service_account_email_alias_POST(String service, String email, String alias) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/alias";
		StringBuilder sb = path(qPath, service, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "alias", alias);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change mailbox password
	 *
	 * REST: POST /email/pro/{service}/account/{email}/changePassword
	 * @param password [required] new password
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public OvhTask service_account_email_changePassword_POST(String service, String email, String password) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/changePassword";
		StringBuilder sb = path(qPath, service, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/sendOnBehalfTo/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 *
	 * API beta
	 */
	public OvhAccountSendOnBehalfTo service_account_email_sendOnBehalfTo_allowedAccountId_GET(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendOnBehalfTo/{allowedAccountId}";
		StringBuilder sb = path(qPath, service, email, allowedAccountId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccountSendOnBehalfTo.class);
	}

	/**
	 * Delete allowed user for SendOnBehalfTo
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}/sendOnBehalfTo/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 *
	 * API beta
	 */
	public OvhTask service_account_email_sendOnBehalfTo_allowedAccountId_DELETE(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendOnBehalfTo/{allowedAccountId}";
		StringBuilder sb = path(qPath, service, email, allowedAccountId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * SendOnBehalfTo granted users for this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/sendOnBehalfTo
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public ArrayList<Long> service_account_email_sendOnBehalfTo_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendOnBehalfTo";
		StringBuilder sb = path(qPath, service, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Allow another user to Send On Behalf To mails from this mailbox
	 *
	 * REST: POST /email/pro/{service}/account/{email}/sendOnBehalfTo
	 * @param allowAccountId [required] Account id to allow to send On Behalf To mails from this mailbox
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public OvhTask service_account_email_sendOnBehalfTo_POST(String service, String email, Long allowAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendOnBehalfTo";
		StringBuilder sb = path(qPath, service, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Send as granted users for this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/sendAs
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public ArrayList<Long> service_account_email_sendAs_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendAs";
		StringBuilder sb = path(qPath, service, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Allow another user to send mails from this mailbox
	 *
	 * REST: POST /email/pro/{service}/account/{email}/sendAs
	 * @param allowAccountId [required] Account id to allow to send mails from this mailbox
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public OvhTask service_account_email_sendAs_POST(String service, String email, Long allowAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendAs";
		StringBuilder sb = path(qPath, service, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/sendAs/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send as
	 *
	 * API beta
	 */
	public OvhAccountSendAs service_account_email_sendAs_allowedAccountId_GET(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendAs/{allowedAccountId}";
		StringBuilder sb = path(qPath, service, email, allowedAccountId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccountSendAs.class);
	}

	/**
	 * Delete allowed user for sendAs
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}/sendAs/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send as
	 *
	 * API beta
	 */
	public OvhTask service_account_email_sendAs_allowedAccountId_DELETE(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendAs/{allowedAccountId}";
		StringBuilder sb = path(qPath, service, email, allowedAccountId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Terminate account at expiration date
	 *
	 * REST: POST /email/pro/{service}/account/{email}/terminate
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 *
	 * API beta
	 */
	public String service_account_email_terminate_POST(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/terminate";
		StringBuilder sb = path(qPath, service, email);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Domains associated to this service
	 *
	 * REST: GET /email/pro/{service}/domain
	 * @param state [required] Filter the value of state property (=)
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public ArrayList<String> service_domain_GET(String service, OvhObjectStateEnum state) throws IOException {
		String qPath = "/email/pro/{service}/domain";
		StringBuilder sb = path(qPath, service);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create new domain in pro services
	 *
	 * REST: POST /email/pro/{service}/domain
	 * @param mxRelay [required] If specified, emails to not existing address will be redirected to that domain
	 * @param configureAutodiscover [required] If you host domain in OVH we can configure autodiscover record automatically
	 * @param configureMx [required] If you host domain in OVH we can configure mx record automatically
	 * @param name [required] Domain to install on server
	 * @param type [required] Type of domain that You want to install
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public OvhTask service_domain_POST(String service, Boolean configureAutodiscover, Boolean configureMx, String mxRelay, String name, OvhDomainTypeEnum type) throws IOException {
		String qPath = "/email/pro/{service}/domain";
		StringBuilder sb = path(qPath, service);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "configureAutodiscover", configureAutodiscover);
		addBody(o, "configureMx", configureMx);
		addBody(o, "mxRelay", mxRelay);
		addBody(o, "name", name);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/domain/{domainName}/disclaimer
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 *
	 * API beta
	 */
	public OvhDisclaimer service_domain_domainName_disclaimer_GET(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimer";
		StringBuilder sb = path(qPath, service, domainName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDisclaimer.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/domain/{domainName}/disclaimer
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 *
	 * API beta
	 */
	public void service_domain_domainName_disclaimer_PUT(String service, String domainName, OvhDisclaimer body) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimer";
		StringBuilder sb = path(qPath, service, domainName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Create organization disclaimer of each email
	 *
	 * REST: POST /email/pro/{service}/domain/{domainName}/disclaimer
	 * @param content [required] Signature, added at the bottom of your organization emails
	 * @param outsideOnly [required] Activate the disclaimer only for external emails
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 *
	 * API beta
	 */
	public OvhTask service_domain_domainName_disclaimer_POST(String service, String domainName, String content, Boolean outsideOnly) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimer";
		StringBuilder sb = path(qPath, service, domainName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "content", content);
		addBody(o, "outsideOnly", outsideOnly);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Delete existing organization disclaimer
	 *
	 * REST: DELETE /email/pro/{service}/domain/{domainName}/disclaimer
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 *
	 * API beta
	 */
	public OvhTask service_domain_domainName_disclaimer_DELETE(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimer";
		StringBuilder sb = path(qPath, service, domainName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get diclaimer attributes to substitute with Active Directory properties
	 *
	 * REST: GET /email/pro/{service}/domain/{domainName}/disclaimerAttribute
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 *
	 * API beta
	 */
	public ArrayList<OvhDisclaimerAttributeEnum> service_domain_domainName_disclaimerAttribute_GET(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimerAttribute";
		StringBuilder sb = path(qPath, service, domainName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhDisclaimerAttributeEnum>> t3 = new TypeReference<ArrayList<OvhDisclaimerAttributeEnum>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/domain/{domainName}
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 *
	 * API beta
	 */
	public OvhDomain service_domain_domainName_GET(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}";
		StringBuilder sb = path(qPath, service, domainName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/domain/{domainName}
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 *
	 * API beta
	 */
	public void service_domain_domainName_PUT(String service, String domainName, OvhDomain body) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}";
		StringBuilder sb = path(qPath, service, domainName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete existing domain in pro services
	 *
	 * REST: DELETE /email/pro/{service}/domain/{domainName}
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 *
	 * API beta
	 */
	public OvhTask service_domain_domainName_DELETE(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}";
		StringBuilder sb = path(qPath, service, domainName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Emailpro billing plan
	 *
	 * REST: GET /email/pro/{service}/billingPlan
	 * @param service [required] The internal name of your pro organization
	 *
	 * API beta
	 */
	public String service_billingPlan_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}/billingPlan";
		StringBuilder sb = path(qPath, service);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /email/pro
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/email/pro";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
}
