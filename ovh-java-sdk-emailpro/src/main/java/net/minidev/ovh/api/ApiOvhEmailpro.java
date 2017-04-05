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
import net.minidev.ovh.api.email.pro.OvhTask;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/email/pro
 * version:1.0
 */
public class ApiOvhEmailpro extends ApiOvhBase {
	public ApiOvhEmailpro(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /email/pro
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/email/pro";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/serviceInfos
	 * @param service [required] The internal name of your pro organization
	 */
	public OvhService service_serviceInfos_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}/serviceInfos";
		qPath = qPath.replace("{service}", service);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/serviceInfos
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 */
	public void service_serviceInfos_PUT(String service, OvhService body) throws IOException {
		String qPath = "/email/pro/{service}/serviceInfos";
		qPath = qPath.replace("{service}", service);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}
	 * @param service [required] The internal name of your pro organization
	 */
	public net.minidev.ovh.api.email.pro.OvhService service_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}";
		qPath = qPath.replace("{service}", service);
		String resp = exec("GET", qPath);
		return convertTo(resp, net.minidev.ovh.api.email.pro.OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 */
	public void service_PUT(String service, net.minidev.ovh.api.email.pro.OvhService body) throws IOException {
		String qPath = "/email/pro/{service}";
		qPath = qPath.replace("{service}", service);
		exec("PUT", qPath, body);
	}

	/**
	 * Accounts associated to this pro service
	 *
	 * REST: GET /email/pro/{service}/account
	 * @param primaryEmailAddress [required] Filter the value of primaryEmailAddress property (like)
	 * @param id [required] Filter the value of id property (like)
	 * @param service [required] The internal name of your pro organization
	 */
	public ArrayList<String> service_account_GET(String service, Long id, String primaryEmailAddress) throws IOException {
		String qPath = "/email/pro/{service}/account";
		qPath = qPath.replace("{service}", service);
		qPath = query(qPath, "id", id);
		qPath = query(qPath, "primaryEmailAddress", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public OvhAccount service_account_email_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/account/{email}
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public void service_account_email_PUT(String service, String email, OvhAccount body) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete existing mailbox in pro server
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public OvhTask service_account_email_DELETE(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Pending task for this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/tasks
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public ArrayList<Long> service_account_email_tasks_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/tasks";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/tasks/{id}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param id [required] Task id
	 */
	public OvhTask service_account_email_tasks_id_GET(String service, String email, Long id) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/tasks/{id}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change mailbox password
	 *
	 * REST: POST /email/pro/{service}/account/{email}/changePassword
	 * @param password [required] new password
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public OvhTask service_account_email_changePassword_POST(String service, String email, String password) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/changePassword";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Terminate account at expiration date
	 *
	 * REST: POST /email/pro/{service}/account/{email}/terminate
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public String service_account_email_terminate_POST(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/terminate";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/diagnostics
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public OvhAccountDiagnosis service_account_email_diagnostics_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/diagnostics";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccountDiagnosis.class);
	}

	/**
	 * Create new diagnosis request
	 *
	 * REST: POST /email/pro/{service}/account/{email}/diagnostics
	 * @param password [required] Account password
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public OvhTask service_account_email_diagnostics_POST(String service, String email, String password) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/diagnostics";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * SendOnBehalfTo granted users for this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/sendOnBehalfTo
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public ArrayList<Long> service_account_email_sendOnBehalfTo_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendOnBehalfTo";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow another user to Send On Behalf To mails from this mailbox
	 *
	 * REST: POST /email/pro/{service}/account/{email}/sendOnBehalfTo
	 * @param allowAccountId [required] Account id to allow to send On Behalf To mails from this mailbox
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public OvhTask service_account_email_sendOnBehalfTo_POST(String service, String email, Long allowAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendOnBehalfTo";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/sendOnBehalfTo/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhAccountSendOnBehalfTo service_account_email_sendOnBehalfTo_allowedAccountId_GET(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendOnBehalfTo/{allowedAccountId}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccountSendOnBehalfTo.class);
	}

	/**
	 * Delete allowed user for SendOnBehalfTo
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}/sendOnBehalfTo/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhTask service_account_email_sendOnBehalfTo_allowedAccountId_DELETE(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendOnBehalfTo/{allowedAccountId}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Full access granted users for this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/fullAccess
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public ArrayList<Long> service_account_email_fullAccess_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/fullAccess";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow full access to a user
	 *
	 * REST: POST /email/pro/{service}/account/{email}/fullAccess
	 * @param allowedAccountId [required] User to give full access
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public OvhTask service_account_email_fullAccess_POST(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/fullAccess";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowedAccountId", allowedAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/fullAccess/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give full access
	 */
	public OvhAccountFullAccess service_account_email_fullAccess_allowedAccountId_GET(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/fullAccess/{allowedAccountId}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccountFullAccess.class);
	}

	/**
	 * Revoke full access
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}/fullAccess/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give full access
	 */
	public OvhTask service_account_email_fullAccess_allowedAccountId_DELETE(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/fullAccess/{allowedAccountId}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Aliases associated to this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/alias
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public ArrayList<String> service_account_email_alias_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/alias";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new alias
	 *
	 * REST: POST /email/pro/{service}/account/{email}/alias
	 * @param alias [required] Alias
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public OvhTask service_account_email_alias_POST(String service, String email, String alias) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/alias";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "alias", alias);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/alias/{alias}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param alias [required] Alias
	 */
	public OvhAccountAlias service_account_email_alias_alias_GET(String service, String email, String alias) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/alias/{alias}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{alias}", alias);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccountAlias.class);
	}

	/**
	 * Delete existing alias
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}/alias/{alias}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param alias [required] Alias
	 */
	public OvhTask service_account_email_alias_alias_DELETE(String service, String email, String alias) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/alias/{alias}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{alias}", alias);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Send as granted users for this mailbox
	 *
	 * REST: GET /email/pro/{service}/account/{email}/sendAs
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public ArrayList<Long> service_account_email_sendAs_GET(String service, String email) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendAs";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow another user to send mails from this mailbox
	 *
	 * REST: POST /email/pro/{service}/account/{email}/sendAs
	 * @param allowAccountId [required] Account id to allow to send mails from this mailbox
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 */
	public OvhTask service_account_email_sendAs_POST(String service, String email, Long allowAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendAs";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/account/{email}/sendAs/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send as
	 */
	public OvhAccountSendAs service_account_email_sendAs_allowedAccountId_GET(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendAs/{allowedAccountId}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccountSendAs.class);
	}

	/**
	 * Delete allowed user for sendAs
	 *
	 * REST: DELETE /email/pro/{service}/account/{email}/sendAs/{allowedAccountId}
	 * @param service [required] The internal name of your pro organization
	 * @param email [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send as
	 */
	public OvhTask service_account_email_sendAs_allowedAccountId_DELETE(String service, String email, Long allowedAccountId) throws IOException {
		String qPath = "/email/pro/{service}/account/{email}/sendAs/{allowedAccountId}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Pending actions
	 *
	 * REST: GET /email/pro/{service}/task
	 * @param service [required] The internal name of your pro organization
	 */
	public ArrayList<Long> service_task_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}/task";
		qPath = qPath.replace("{service}", service);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/task/{id}
	 * @param service [required] The internal name of your pro organization
	 * @param id [required] Task id
	 */
	public OvhTask service_task_id_GET(String service, Long id) throws IOException {
		String qPath = "/email/pro/{service}/task/{id}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * External contacts for this service
	 *
	 * REST: GET /email/pro/{service}/externalContact
	 * @param firstName [required] Filter the value of firstName property (like)
	 * @param id [required] Filter the value of id property (like)
	 * @param lastName [required] Filter the value of lastName property (like)
	 * @param displayName [required] Filter the value of displayName property (like)
	 * @param externalEmailAddress [required] Filter the value of externalEmailAddress property (like)
	 * @param service [required] The internal name of your pro organization
	 */
	public ArrayList<String> service_externalContact_GET(String service, String displayName, String externalEmailAddress, String firstName, Long id, String lastName) throws IOException {
		String qPath = "/email/pro/{service}/externalContact";
		qPath = qPath.replace("{service}", service);
		qPath = query(qPath, "displayName", displayName);
		qPath = query(qPath, "externalEmailAddress", externalEmailAddress);
		qPath = query(qPath, "firstName", firstName);
		qPath = query(qPath, "id", id);
		qPath = query(qPath, "lastName", lastName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * create new external contact
	 *
	 * REST: POST /email/pro/{service}/externalContact
	 * @param initials [required] Contact initials
	 * @param firstName [required] Contact first name
	 * @param hiddenFromGAL [required] Hide the contact in Global Address List
	 * @param lastName [required] Contact last name
	 * @param displayName [required] Contact display name
	 * @param externalEmailAddress [required] Contact email address
	 * @param service [required] The internal name of your pro organization
	 */
	public OvhTask service_externalContact_POST(String service, String initials, String firstName, Boolean hiddenFromGAL, String lastName, String displayName, String externalEmailAddress) throws IOException {
		String qPath = "/email/pro/{service}/externalContact";
		qPath = qPath.replace("{service}", service);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "initials", initials);
		addBody(o, "firstName", firstName);
		addBody(o, "hiddenFromGAL", hiddenFromGAL);
		addBody(o, "lastName", lastName);
		addBody(o, "displayName", displayName);
		addBody(o, "externalEmailAddress", externalEmailAddress);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/externalContact/{externalEmailAddress}
	 * @param service [required] The internal name of your pro organization
	 * @param externalEmailAddress [required] Contact email
	 */
	public OvhExternalContact service_externalContact_externalEmailAddress_GET(String service, String externalEmailAddress) throws IOException {
		String qPath = "/email/pro/{service}/externalContact/{externalEmailAddress}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{externalEmailAddress}", externalEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExternalContact.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/externalContact/{externalEmailAddress}
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 * @param externalEmailAddress [required] Contact email
	 */
	public void service_externalContact_externalEmailAddress_PUT(String service, String externalEmailAddress, OvhExternalContact body) throws IOException {
		String qPath = "/email/pro/{service}/externalContact/{externalEmailAddress}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{externalEmailAddress}", externalEmailAddress);
		exec("PUT", qPath, body);
	}

	/**
	 * delete external contact
	 *
	 * REST: DELETE /email/pro/{service}/externalContact/{externalEmailAddress}
	 * @param service [required] The internal name of your pro organization
	 * @param externalEmailAddress [required] Contact email
	 */
	public OvhTask service_externalContact_externalEmailAddress_DELETE(String service, String externalEmailAddress) throws IOException {
		String qPath = "/email/pro/{service}/externalContact/{externalEmailAddress}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{externalEmailAddress}", externalEmailAddress);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/domain/{domainName}
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 */
	public OvhDomain service_domain_domainName_GET(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/domain/{domainName}
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 */
	public void service_domain_domainName_PUT(String service, String domainName, OvhDomain body) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{domainName}", domainName);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete existing domain in pro services
	 *
	 * REST: DELETE /email/pro/{service}/domain/{domainName}
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 */
	public OvhTask service_domain_domainName_DELETE(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get diclaimer attributes to substitute with Active Directory properties
	 *
	 * REST: GET /email/pro/{service}/domain/{domainName}/disclaimerAttribute
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 */
	public ArrayList<OvhDisclaimerAttributeEnum> service_domain_domainName_disclaimerAttribute_GET(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimerAttribute";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhDisclaimerAttributeEnum>> t3 = new TypeReference<ArrayList<OvhDisclaimerAttributeEnum>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/domain/{domainName}/disclaimer
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 */
	public OvhDisclaimer service_domain_domainName_disclaimer_GET(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimer";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDisclaimer.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/pro/{service}/domain/{domainName}/disclaimer
	 * @param body [required] New object properties
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 */
	public void service_domain_domainName_disclaimer_PUT(String service, String domainName, OvhDisclaimer body) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimer";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{domainName}", domainName);
		exec("PUT", qPath, body);
	}

	/**
	 * Create organization disclaimer of each email
	 *
	 * REST: POST /email/pro/{service}/domain/{domainName}/disclaimer
	 * @param outsideOnly [required] Activate the disclaimer only for external emails
	 * @param content [required] Signature, added at the bottom of your organization emails
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 */
	public OvhTask service_domain_domainName_disclaimer_POST(String service, String domainName, Boolean outsideOnly, String content) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimer";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{domainName}", domainName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "outsideOnly", outsideOnly);
		addBody(o, "content", content);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Delete existing organization disclaimer
	 *
	 * REST: DELETE /email/pro/{service}/domain/{domainName}/disclaimer
	 * @param service [required] The internal name of your pro organization
	 * @param domainName [required] Domain name
	 */
	public OvhTask service_domain_domainName_disclaimer_DELETE(String service, String domainName) throws IOException {
		String qPath = "/email/pro/{service}/domain/{domainName}/disclaimer";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Domains associated to this service
	 *
	 * REST: GET /email/pro/{service}/domain
	 * @param state [required] Filter the value of state property (=)
	 * @param service [required] The internal name of your pro organization
	 */
	public ArrayList<String> service_domain_GET(String service, OvhObjectStateEnum state) throws IOException {
		String qPath = "/email/pro/{service}/domain";
		qPath = qPath.replace("{service}", service);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new domain in pro services
	 *
	 * REST: POST /email/pro/{service}/domain
	 * @param mxRelay [required] If specified, emails to not existing address will be redirected to that domain
	 * @param configureAutodiscover [required] If you host domain in OVH we can configure autodiscover record automatically
	 * @param name [required] Domain to install on server
	 * @param type [required] Type of domain that You want to install
	 * @param configureMx [required] If you host domain in OVH we can configure mx record automatically
	 * @param service [required] The internal name of your pro organization
	 */
	public OvhTask service_domain_POST(String service, String mxRelay, Boolean configureAutodiscover, String name, OvhDomainTypeEnum type, Boolean configureMx) throws IOException {
		String qPath = "/email/pro/{service}/domain";
		qPath = qPath.replace("{service}", service);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "mxRelay", mxRelay);
		addBody(o, "configureAutodiscover", configureAutodiscover);
		addBody(o, "name", name);
		addBody(o, "type", type);
		addBody(o, "configureMx", configureMx);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Update spam and virus flags on all active accounts
	 *
	 * REST: POST /email/pro/{service}/updateFlagsOnAllAccounts
	 * @param service [required] The internal name of your pro organization
	 */
	public void service_updateFlagsOnAllAccounts_POST(String service) throws IOException {
		String qPath = "/email/pro/{service}/updateFlagsOnAllAccounts";
		qPath = qPath.replace("{service}", service);
		exec("POST", qPath);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/pro/{service}/server
	 * @param service [required] The internal name of your pro organization
	 */
	public OvhServer service_server_GET(String service) throws IOException {
		String qPath = "/email/pro/{service}/server";
		qPath = qPath.replace("{service}", service);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServer.class);
	}
}
