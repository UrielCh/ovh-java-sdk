package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.domain.OvhDomainFilterActionEnum;
import net.minidev.ovh.api.domain.OvhDomainFilterOperandEnum;
import net.minidev.ovh.api.domain.OvhDomainMXFilterEnum;
import net.minidev.ovh.api.domain.OvhDomainMlLanguageEnum;
import net.minidev.ovh.api.domain.OvhDomainMlLimits;
import net.minidev.ovh.api.domain.OvhDomainMlOptionsStruct;
import net.minidev.ovh.api.domain.OvhDomainQuota;
import net.minidev.ovh.api.domain.OvhDomainSummary;
import net.minidev.ovh.api.domain.OvhDomainUsageAccountStruct;
import net.minidev.ovh.api.domain.zone.OvhRecord;
import net.minidev.ovh.api.email.domain.OvhAccount;
import net.minidev.ovh.api.email.domain.OvhAccountDelegated;
import net.minidev.ovh.api.email.domain.OvhAcl;
import net.minidev.ovh.api.email.domain.OvhDelegation;
import net.minidev.ovh.api.email.domain.OvhDomainService;
import net.minidev.ovh.api.email.domain.OvhFilter;
import net.minidev.ovh.api.email.domain.OvhMailingList;
import net.minidev.ovh.api.email.domain.OvhMigrationAccount;
import net.minidev.ovh.api.email.domain.OvhMigrationCheckStruct;
import net.minidev.ovh.api.email.domain.OvhMigrationService;
import net.minidev.ovh.api.email.domain.OvhMigrationServiceType;
import net.minidev.ovh.api.email.domain.OvhModerator;
import net.minidev.ovh.api.email.domain.OvhRedirectionGlobal;
import net.minidev.ovh.api.email.domain.OvhResponder;
import net.minidev.ovh.api.email.domain.OvhResponderAccount;
import net.minidev.ovh.api.email.domain.OvhRule;
import net.minidev.ovh.api.email.domain.OvhSubscriber;
import net.minidev.ovh.api.email.domain.OvhTaskFilter;
import net.minidev.ovh.api.email.domain.OvhTaskMl;
import net.minidev.ovh.api.email.domain.OvhTaskPop;
import net.minidev.ovh.api.email.domain.OvhTaskSpecialAccount;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/email/domain
 * version:1.0
 */
public class ApiOvhEmaildomain extends ApiOvhBase {
	public ApiOvhEmaildomain(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get limits of mailing list
	 *
	 * REST: GET /email/domain/mailingListLimits
	 * @param moderatorMessage [required] If true, messages are moderate
	 */
	public OvhDomainMlLimits mailingListLimits_GET(Boolean moderatorMessage) throws IOException {
		String qPath = "/email/domain/mailingListLimits";
		StringBuilder sb = path(qPath);
		query(sb, "moderatorMessage", moderatorMessage);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomainMlLimits.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /email/domain
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/email/domain";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Delegated emails
	 *
	 * REST: GET /email/domain/delegatedAccount
	 * @param domain [required] Domain of email address
	 * @param accountName [required] Name of email address
	 */
	public ArrayList<String> delegatedAccount_GET(String accountName, String domain) throws IOException {
		String qPath = "/email/domain/delegatedAccount";
		StringBuilder sb = path(qPath);
		query(sb, "accountName", accountName);
		query(sb, "domain", domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * usage of account
	 *
	 * REST: POST /email/domain/delegatedAccount/{email}/usage
	 * @param email [required] Email
	 */
	public OvhDomainUsageAccountStruct delegatedAccount_email_usage_POST(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/usage";
		StringBuilder sb = path(qPath, email);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhDomainUsageAccountStruct.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/delegatedAccount/{email}/responder
	 * @param email [required] Email
	 */
	public OvhResponderAccount delegatedAccount_email_responder_GET(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/responder";
		StringBuilder sb = path(qPath, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResponderAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/domain/delegatedAccount/{email}/responder
	 * @param body [required] New object properties
	 * @param email [required] Email
	 */
	public void delegatedAccount_email_responder_PUT(String email, OvhResponderAccount body) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/responder";
		StringBuilder sb = path(qPath, email);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Create new responder in server
	 *
	 * REST: POST /email/domain/delegatedAccount/{email}/responder
	 * @param to [required] Date of end responder
	 * @param copy [required] If true, emails will be copy to emailToCopy address
	 * @param content [required] Content of responder
	 * @param from [required] Date of start responder
	 * @param copyTo [required] Account where copy emails
	 * @param email [required] Email
	 */
	public OvhTaskSpecialAccount delegatedAccount_email_responder_POST(String email, String content, Boolean copy, String copyTo, Date from, Date to) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/responder";
		StringBuilder sb = path(qPath, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "content", content);
		addBody(o, "copy", copy);
		addBody(o, "copyTo", copyTo);
		addBody(o, "from", from);
		addBody(o, "to", to);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Delete an existing responder in server
	 *
	 * REST: DELETE /email/domain/delegatedAccount/{email}/responder
	 * @param email [required] Email
	 */
	public OvhTaskSpecialAccount delegatedAccount_email_responder_DELETE(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/responder";
		StringBuilder sb = path(qPath, email);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Update usage of account
	 *
	 * REST: POST /email/domain/delegatedAccount/{email}/updateUsage
	 * @param email [required] Email
	 */
	public void delegatedAccount_email_updateUsage_POST(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/updateUsage";
		StringBuilder sb = path(qPath, email);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/delegatedAccount/{email}/filter/{name}/rule/{id}
	 * @param email [required] Email
	 * @param name [required] Filter name
	 * @param id [required]
	 */
	public OvhRule delegatedAccount_email_filter_name_rule_id_GET(String email, String name, Long id) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}/rule/{id}";
		StringBuilder sb = path(qPath, email, name, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRule.class);
	}

	/**
	 * Delete an existing filter
	 *
	 * REST: DELETE /email/domain/delegatedAccount/{email}/filter/{name}/rule/{id}
	 * @param email [required] Email
	 * @param name [required] Filter name
	 * @param id [required]
	 */
	public ArrayList<OvhTaskFilter> delegatedAccount_email_filter_name_rule_id_DELETE(String email, String name, Long id) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}/rule/{id}";
		StringBuilder sb = path(qPath, email, name, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhTaskFilter>> t2 = new TypeReference<ArrayList<OvhTaskFilter>>() {};

	/**
	 * Get rules
	 *
	 * REST: GET /email/domain/delegatedAccount/{email}/filter/{name}/rule
	 * @param email [required] Email
	 * @param name [required] Filter name
	 */
	public ArrayList<Long> delegatedAccount_email_filter_name_rule_GET(String email, String name) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}/rule";
		StringBuilder sb = path(qPath, email, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Create new rule for filter
	 *
	 * REST: POST /email/domain/delegatedAccount/{email}/filter/{name}/rule
	 * @param operand [required] Rule of filter
	 * @param header [required] Header to be filtered
	 * @param value [required] Rule parameter of filter
	 * @param email [required] Email
	 * @param name [required] Filter name
	 */
	public OvhTaskFilter delegatedAccount_email_filter_name_rule_POST(String email, String name, String header, OvhDomainFilterOperandEnum operand, String value) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}/rule";
		StringBuilder sb = path(qPath, email, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "header", header);
		addBody(o, "operand", operand);
		addBody(o, "value", value);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Change filter activity
	 *
	 * REST: POST /email/domain/delegatedAccount/{email}/filter/{name}/changeActivity
	 * @param activity [required] New activity
	 * @param email [required] Email
	 * @param name [required] Filter name
	 */
	public OvhTaskFilter delegatedAccount_email_filter_name_changeActivity_POST(String email, String name, Boolean activity) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}/changeActivity";
		StringBuilder sb = path(qPath, email, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "activity", activity);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Change filter priority
	 *
	 * REST: POST /email/domain/delegatedAccount/{email}/filter/{name}/changePriority
	 * @param priority [required] New priority
	 * @param email [required] Email
	 * @param name [required] Filter name
	 */
	public OvhTaskFilter delegatedAccount_email_filter_name_changePriority_POST(String email, String name, Long priority) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}/changePriority";
		StringBuilder sb = path(qPath, email, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "priority", priority);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/delegatedAccount/{email}/filter/{name}
	 * @param email [required] Email
	 * @param name [required] Filter name
	 */
	public OvhFilter delegatedAccount_email_filter_name_GET(String email, String name) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}";
		StringBuilder sb = path(qPath, email, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFilter.class);
	}

	/**
	 * Delete an existing filter
	 *
	 * REST: DELETE /email/domain/delegatedAccount/{email}/filter/{name}
	 * @param email [required] Email
	 * @param name [required] Filter name
	 */
	public ArrayList<OvhTaskFilter> delegatedAccount_email_filter_name_DELETE(String email, String name) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}";
		StringBuilder sb = path(qPath, email, name);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get filters
	 *
	 * REST: GET /email/domain/delegatedAccount/{email}/filter
	 * @param email [required] Email
	 */
	public ArrayList<String> delegatedAccount_email_filter_GET(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter";
		StringBuilder sb = path(qPath, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new filter for account
	 *
	 * REST: POST /email/domain/delegatedAccount/{email}/filter
	 * @param action [required] Action of filter
	 * @param header [required] Header to be filtered
	 * @param active [required] If true filter is active
	 * @param actionParam [required] Action parameter of filter
	 * @param value [required] Rule parameter of filter
	 * @param priority [required] Priority of filter
	 * @param name [required] Filter name
	 * @param operand [required] Rule of filter
	 * @param email [required] Email
	 */
	public OvhTaskFilter delegatedAccount_email_filter_POST(String email, OvhDomainFilterActionEnum action, String actionParam, Boolean active, String header, String name, OvhDomainFilterOperandEnum operand, Long priority, String value) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter";
		StringBuilder sb = path(qPath, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		addBody(o, "actionParam", actionParam);
		addBody(o, "active", active);
		addBody(o, "header", header);
		addBody(o, "name", name);
		addBody(o, "operand", operand);
		addBody(o, "priority", priority);
		addBody(o, "value", value);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Change mailbox password (length : [9;30], no space at begin and end, no accent)
	 *
	 * REST: POST /email/domain/delegatedAccount/{email}/changePassword
	 * @param password [required] New password
	 * @param email [required] Email
	 */
	public OvhTaskPop delegatedAccount_email_changePassword_POST(String email, String password) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/changePassword";
		StringBuilder sb = path(qPath, email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskPop.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/delegatedAccount/{email}
	 * @param email [required] Email
	 */
	public OvhAccountDelegated delegatedAccount_email_GET(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}";
		StringBuilder sb = path(qPath, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccountDelegated.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/domain/delegatedAccount/{email}
	 * @param body [required] New object properties
	 * @param email [required] Email
	 */
	public void delegatedAccount_email_PUT(String email, OvhAccountDelegated body) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}";
		StringBuilder sb = path(qPath, email);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /email/domain/{domain}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<Long> domain_changeContact_POST(String domain, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/email/domain/{domain}/changeContact";
		StringBuilder sb = path(qPath, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}

	/**
	 * Summary for this domain
	 *
	 * REST: GET /email/domain/{domain}/summary
	 * @param domain [required] Name of your domain name
	 */
	public OvhDomainSummary domain_summary_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/summary";
		StringBuilder sb = path(qPath, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomainSummary.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/task/account/{id}
	 * @param domain [required] Name of your domain name
	 * @param id [required] Id of task
	 */
	public OvhTaskPop domain_task_account_id_GET(String domain, Long id) throws IOException {
		String qPath = "/email/domain/{domain}/task/account/{id}";
		StringBuilder sb = path(qPath, domain, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTaskPop.class);
	}

	/**
	 * Get account tasks
	 *
	 * REST: GET /email/domain/{domain}/task/account
	 * @param name [required] Account name
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<Long> domain_task_account_GET(String domain, String name) throws IOException {
		String qPath = "/email/domain/{domain}/task/account";
		StringBuilder sb = path(qPath, domain);
		query(sb, "name", name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/task/redirection/{id}
	 * @param domain [required] Name of your domain name
	 * @param id [required] Id of task
	 */
	public OvhTaskSpecialAccount domain_task_redirection_id_GET(String domain, Long id) throws IOException {
		String qPath = "/email/domain/{domain}/task/redirection/{id}";
		StringBuilder sb = path(qPath, domain, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Get redirection tasks
	 *
	 * REST: GET /email/domain/{domain}/task/redirection
	 * @param account [required] Account name
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<Long> domain_task_redirection_GET(String domain, String account) throws IOException {
		String qPath = "/email/domain/{domain}/task/redirection";
		StringBuilder sb = path(qPath, domain);
		query(sb, "account", account);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/task/responder/{id}
	 * @param domain [required] Name of your domain name
	 * @param id [required] Id of task
	 */
	public OvhTaskSpecialAccount domain_task_responder_id_GET(String domain, Long id) throws IOException {
		String qPath = "/email/domain/{domain}/task/responder/{id}";
		StringBuilder sb = path(qPath, domain, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Get responder tasks
	 *
	 * REST: GET /email/domain/{domain}/task/responder
	 * @param account [required] Name of responder
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<Long> domain_task_responder_GET(String domain, String account) throws IOException {
		String qPath = "/email/domain/{domain}/task/responder";
		StringBuilder sb = path(qPath, domain);
		query(sb, "account", account);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get filter tasks
	 *
	 * REST: GET /email/domain/{domain}/task/filter
	 * @param account [required] Account name
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<Long> domain_task_filter_GET(String domain, String account) throws IOException {
		String qPath = "/email/domain/{domain}/task/filter";
		StringBuilder sb = path(qPath, domain);
		query(sb, "account", account);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/task/filter/{id}
	 * @param domain [required] Name of your domain name
	 * @param id [required] Id of task
	 */
	public OvhTaskFilter domain_task_filter_id_GET(String domain, Long id) throws IOException {
		String qPath = "/email/domain/{domain}/task/filter/{id}";
		StringBuilder sb = path(qPath, domain, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Get Mailing List tasks
	 *
	 * REST: GET /email/domain/{domain}/task/mailinglist
	 * @param account [required] Account name
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<Long> domain_task_mailinglist_GET(String domain, String account) throws IOException {
		String qPath = "/email/domain/{domain}/task/mailinglist";
		StringBuilder sb = path(qPath, domain);
		query(sb, "account", account);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/task/mailinglist/{id}
	 * @param domain [required] Name of your domain name
	 * @param id [required]
	 */
	public OvhTaskMl domain_task_mailinglist_id_GET(String domain, Long id) throws IOException {
		String qPath = "/email/domain/{domain}/task/mailinglist/{id}";
		StringBuilder sb = path(qPath, domain, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * Get mailing lists
	 *
	 * REST: GET /email/domain/{domain}/mailingList
	 * @param name [required] Mailing list name
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<String> domain_mailingList_GET(String domain, String name) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList";
		StringBuilder sb = path(qPath, domain);
		query(sb, "name", name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new mailingList
	 *
	 * REST: POST /email/domain/{domain}/mailingList
	 * @param ownerEmail [required] Owner Email
	 * @param name [required] Mailing list name
	 * @param language [required] Language of mailing list
	 * @param replyTo [required] Email to reply of mailing list
	 * @param options [required] Options of mailing list
	 * @param domain [required] Name of your domain name
	 */
	public OvhTaskMl domain_mailingList_POST(String domain, OvhDomainMlLanguageEnum language, String name, OvhDomainMlOptionsStruct options, String ownerEmail, String replyTo) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList";
		StringBuilder sb = path(qPath, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "language", language);
		addBody(o, "name", name);
		addBody(o, "options", options);
		addBody(o, "ownerEmail", ownerEmail);
		addBody(o, "replyTo", replyTo);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/mailingList/{name}/subscriber/{email}
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 * @param email [required]
	 */
	public OvhSubscriber domain_mailingList_name_subscriber_email_GET(String domain, String name, String email) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/subscriber/{email}";
		StringBuilder sb = path(qPath, domain, name, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSubscriber.class);
	}

	/**
	 * Delete existing subscriber
	 *
	 * REST: DELETE /email/domain/{domain}/mailingList/{name}/subscriber/{email}
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 * @param email [required]
	 */
	public OvhTaskMl domain_mailingList_name_subscriber_email_DELETE(String domain, String name, String email) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/subscriber/{email}";
		StringBuilder sb = path(qPath, domain, name, email);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * List of subscribers
	 *
	 * REST: GET /email/domain/{domain}/mailingList/{name}/subscriber
	 * @param email [required] Subscriber email
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 */
	public ArrayList<String> domain_mailingList_name_subscriber_GET(String domain, String name, String email) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/subscriber";
		StringBuilder sb = path(qPath, domain, name);
		query(sb, "email", email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add subscriber to mailing list
	 *
	 * REST: POST /email/domain/{domain}/mailingList/{name}/subscriber
	 * @param email [required] Email of subscriber
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 */
	public OvhTaskMl domain_mailingList_name_subscriber_POST(String domain, String name, String email) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/subscriber";
		StringBuilder sb = path(qPath, domain, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * Send moderators list and subscribers list of this mailing list by email
	 *
	 * REST: POST /email/domain/{domain}/mailingList/{name}/sendListByEmail
	 * @param email [required] Email destination
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 */
	public OvhTaskMl domain_mailingList_name_sendListByEmail_POST(String domain, String name, String email) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/sendListByEmail";
		StringBuilder sb = path(qPath, domain, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * List of moderators
	 *
	 * REST: GET /email/domain/{domain}/mailingList/{name}/moderator
	 * @param email [required] Moderator email
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 */
	public ArrayList<String> domain_mailingList_name_moderator_GET(String domain, String name, String email) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/moderator";
		StringBuilder sb = path(qPath, domain, name);
		query(sb, "email", email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add moderator to mailing list
	 *
	 * REST: POST /email/domain/{domain}/mailingList/{name}/moderator
	 * @param email [required] Email of moderator
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 */
	public OvhTaskMl domain_mailingList_name_moderator_POST(String domain, String name, String email) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/moderator";
		StringBuilder sb = path(qPath, domain, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/mailingList/{name}/moderator/{email}
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 * @param email [required]
	 */
	public OvhModerator domain_mailingList_name_moderator_email_GET(String domain, String name, String email) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/moderator/{email}";
		StringBuilder sb = path(qPath, domain, name, email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhModerator.class);
	}

	/**
	 * Delete existing moderator
	 *
	 * REST: DELETE /email/domain/{domain}/mailingList/{name}/moderator/{email}
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 * @param email [required]
	 */
	public OvhTaskMl domain_mailingList_name_moderator_email_DELETE(String domain, String name, String email) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/moderator/{email}";
		StringBuilder sb = path(qPath, domain, name, email);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/mailingList/{name}
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 */
	public OvhMailingList domain_mailingList_name_GET(String domain, String name) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}";
		StringBuilder sb = path(qPath, domain, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMailingList.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/domain/{domain}/mailingList/{name}
	 * @param body [required] New object properties
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 */
	public void domain_mailingList_name_PUT(String domain, String name, OvhMailingList body) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}";
		StringBuilder sb = path(qPath, domain, name);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete existing Mailing list
	 *
	 * REST: DELETE /email/domain/{domain}/mailingList/{name}
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 */
	public OvhTaskMl domain_mailingList_name_DELETE(String domain, String name) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}";
		StringBuilder sb = path(qPath, domain, name);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * Change mailing list options
	 *
	 * REST: POST /email/domain/{domain}/mailingList/{name}/changeOptions
	 * @param options [required] Options of mailing list
	 * @param domain [required] Name of your domain name
	 * @param name [required] Name of mailing list
	 */
	public OvhTaskMl domain_mailingList_name_changeOptions_POST(String domain, String name, OvhDomainMlOptionsStruct options) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList/{name}/changeOptions";
		StringBuilder sb = path(qPath, domain, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "options", options);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * Change MX filter, so change MX DNS records
	 *
	 * REST: POST /email/domain/{domain}/changeDnsMXFilter
	 * @param customTarget [required] Target server for custom MX
	 * @param subDomain [required] Sub domain
	 * @param mxFilter [required] New MX filter
	 * @param domain [required] Name of your domain name
	 */
	public void domain_changeDnsMXFilter_POST(String domain, String customTarget, OvhDomainMXFilterEnum mxFilter, String subDomain) throws IOException {
		String qPath = "/email/domain/{domain}/changeDnsMXFilter";
		StringBuilder sb = path(qPath, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "customTarget", customTarget);
		addBody(o, "mxFilter", mxFilter);
		addBody(o, "subDomain", subDomain);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Confirm termination of your email service
	 *
	 * REST: POST /email/domain/{domain}/confirmTermination
	 * @param commentary [required] Commentary about your termination request
	 * @param reason [required] Reason of your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param domain [required] Name of your domain name
	 */
	public String domain_confirmTermination_POST(String domain, String commentary, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/email/domain/{domain}/confirmTermination";
		StringBuilder sb = path(qPath, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "commentary", commentary);
		addBody(o, "reason", reason);
		addBody(o, "token", token);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}
	 * @param domain [required] Name of your domain name
	 */
	public OvhDomainService domain_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}";
		StringBuilder sb = path(qPath, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomainService.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/responder/{account}
	 * @param domain [required] Name of your domain name
	 * @param account [required] Name of account
	 */
	public OvhResponder domain_responder_account_GET(String domain, String account) throws IOException {
		String qPath = "/email/domain/{domain}/responder/{account}";
		StringBuilder sb = path(qPath, domain, account);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResponder.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/domain/{domain}/responder/{account}
	 * @param body [required] New object properties
	 * @param domain [required] Name of your domain name
	 * @param account [required] Name of account
	 */
	public void domain_responder_account_PUT(String domain, String account, OvhResponder body) throws IOException {
		String qPath = "/email/domain/{domain}/responder/{account}";
		StringBuilder sb = path(qPath, domain, account);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete an existing responder in server
	 *
	 * REST: DELETE /email/domain/{domain}/responder/{account}
	 * @param domain [required] Name of your domain name
	 * @param account [required] Name of account
	 */
	public OvhTaskSpecialAccount domain_responder_account_DELETE(String domain, String account) throws IOException {
		String qPath = "/email/domain/{domain}/responder/{account}";
		StringBuilder sb = path(qPath, domain, account);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Get responders
	 *
	 * REST: GET /email/domain/{domain}/responder
	 * @param account [required] Responder name
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<String> domain_responder_GET(String domain, String account) throws IOException {
		String qPath = "/email/domain/{domain}/responder";
		StringBuilder sb = path(qPath, domain);
		query(sb, "account", account);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new responder in server
	 *
	 * REST: POST /email/domain/{domain}/responder
	 * @param account [required] Account of domain
	 * @param to [required] Date of end responder
	 * @param copy [required] If false, emails will be dropped. If true and copyTo field is empty, emails will be delivered to your mailbox. If true and copyTo is set with an address, emails will be delivered to this address
	 * @param content [required] Content of responder
	 * @param copyTo [required] Account where copy emails
	 * @param from [required] Date of start responder
	 * @param domain [required] Name of your domain name
	 */
	public OvhTaskSpecialAccount domain_responder_POST(String domain, String account, String content, Boolean copy, String copyTo, Date from, Date to) throws IOException {
		String qPath = "/email/domain/{domain}/responder";
		StringBuilder sb = path(qPath, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "account", account);
		addBody(o, "content", content);
		addBody(o, "copy", copy);
		addBody(o, "copyTo", copyTo);
		addBody(o, "from", from);
		addBody(o, "to", to);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Get ACL on your domain
	 *
	 * REST: GET /email/domain/{domain}/acl
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<String> domain_acl_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/acl";
		StringBuilder sb = path(qPath, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new ACL
	 *
	 * REST: POST /email/domain/{domain}/acl
	 * @param accountId [required] Deleguates rights to
	 * @param domain [required] Name of your domain name
	 */
	public OvhAcl domain_acl_POST(String domain, String accountId) throws IOException {
		String qPath = "/email/domain/{domain}/acl";
		StringBuilder sb = path(qPath, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accountId", accountId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhAcl.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/acl/{accountId}
	 * @param domain [required] Name of your domain name
	 * @param accountId [required] OVH customer unique identifier
	 */
	public OvhAcl domain_acl_accountId_GET(String domain, String accountId) throws IOException {
		String qPath = "/email/domain/{domain}/acl/{accountId}";
		StringBuilder sb = path(qPath, domain, accountId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAcl.class);
	}

	/**
	 * Delete ACL
	 *
	 * REST: DELETE /email/domain/{domain}/acl/{accountId}
	 * @param domain [required] Name of your domain name
	 * @param accountId [required] OVH customer unique identifier
	 */
	public void domain_acl_accountId_DELETE(String domain, String accountId) throws IOException {
		String qPath = "/email/domain/{domain}/acl/{accountId}";
		StringBuilder sb = path(qPath, domain, accountId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * List all quotas for this domain
	 *
	 * REST: GET /email/domain/{domain}/quota
	 * @param domain [required] Name of your domain name
	 */
	public OvhDomainQuota domain_quota_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/quota";
		StringBuilder sb = path(qPath, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomainQuota.class);
	}

	/**
	 * Create delegation of domain with same nic than V3
	 *
	 * REST: POST /email/domain/{domain}/migrateDelegationV3toV6
	 * @param domain [required] Name of your domain name
	 */
	public void domain_migrateDelegationV3toV6_POST(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/migrateDelegationV3toV6";
		StringBuilder sb = path(qPath, domain);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get accounts
	 *
	 * REST: GET /email/domain/{domain}/account
	 * @param description [required] Account description
	 * @param accountName [required] Account name
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<String> domain_account_GET(String domain, String accountName, String description) throws IOException {
		String qPath = "/email/domain/{domain}/account";
		StringBuilder sb = path(qPath, domain);
		query(sb, "accountName", accountName);
		query(sb, "description", description);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new mailbox in server
	 *
	 * REST: POST /email/domain/{domain}/account
	 * @param accountName [required] Account name
	 * @param password [required] Account password
	 * @param size [required] Account size in bytes (default : 5000000000) (possible values : /email/domain/{domain}/allowedAccountSize )
	 * @param description [required] Description Account
	 * @param domain [required] Name of your domain name
	 */
	public OvhTaskPop domain_account_POST(String domain, String accountName, String description, String password, Long size) throws IOException {
		String qPath = "/email/domain/{domain}/account";
		StringBuilder sb = path(qPath, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accountName", accountName);
		addBody(o, "description", description);
		addBody(o, "password", password);
		addBody(o, "size", size);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskPop.class);
	}

	/**
	 * Change mailbox password (length : [9;30], no space at begin and end, no accent)
	 *
	 * REST: POST /email/domain/{domain}/account/{accountName}/changePassword
	 * @param password [required] New password
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public OvhTaskPop domain_account_accountName_changePassword_POST(String domain, String accountName, String password) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/changePassword";
		StringBuilder sb = path(qPath, domain, accountName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskPop.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public OvhAccount domain_account_accountName_GET(String domain, String accountName) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}";
		StringBuilder sb = path(qPath, domain, accountName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/domain/{domain}/account/{accountName}
	 * @param body [required] New object properties
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public void domain_account_accountName_PUT(String domain, String accountName, OvhAccount body) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}";
		StringBuilder sb = path(qPath, domain, accountName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete an existing mailbox in server
	 *
	 * REST: DELETE /email/domain/{domain}/account/{accountName}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public OvhTaskPop domain_account_accountName_DELETE(String domain, String accountName) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}";
		StringBuilder sb = path(qPath, domain, accountName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTaskPop.class);
	}

	/**
	 * usage of account
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/usage
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public OvhDomainUsageAccountStruct domain_account_accountName_usage_GET(String domain, String accountName) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/usage";
		StringBuilder sb = path(qPath, domain, accountName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomainUsageAccountStruct.class);
	}

	/**
	 * Update usage of account
	 *
	 * REST: POST /email/domain/{domain}/account/{accountName}/updateUsage
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public void domain_account_accountName_updateUsage_POST(String domain, String accountName) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/updateUsage";
		StringBuilder sb = path(qPath, domain, accountName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get migration service
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/migrate
	 * @param type [required] Type of migration service
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 *
	 * API beta
	 */
	public ArrayList<String> domain_account_accountName_migrate_GET(String domain, String accountName, OvhMigrationServiceType type) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/migrate";
		StringBuilder sb = path(qPath, domain, accountName);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param destinationServiceName [required] Service name allowed as migration destination
	 *
	 * API beta
	 */
	public OvhMigrationService domain_account_accountName_migrate_destinationServiceName_GET(String domain, String accountName, String destinationServiceName) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}";
		StringBuilder sb = path(qPath, domain, accountName, destinationServiceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMigrationService.class);
	}

	/**
	 * List of email address available for migration
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}/destinationEmailAddress
	 * @param quota [required] Account maximum size
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param destinationServiceName [required] Service name allowed as migration destination
	 *
	 * API beta
	 */
	public ArrayList<String> domain_account_accountName_migrate_destinationServiceName_destinationEmailAddress_GET(String domain, String accountName, String destinationServiceName, Long quota) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}/destinationEmailAddress";
		StringBuilder sb = path(qPath, domain, accountName, destinationServiceName);
		query(sb, "quota", quota);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}/destinationEmailAddress/{destinationEmailAddress}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param destinationServiceName [required] Service name allowed as migration destination
	 * @param destinationEmailAddress [required] Destination account name
	 *
	 * API beta
	 */
	public OvhMigrationAccount domain_account_accountName_migrate_destinationServiceName_destinationEmailAddress_destinationEmailAddress_GET(String domain, String accountName, String destinationServiceName, String destinationEmailAddress) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}/destinationEmailAddress/{destinationEmailAddress}";
		StringBuilder sb = path(qPath, domain, accountName, destinationServiceName, destinationEmailAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMigrationAccount.class);
	}

	/**
	 * Migrate account to destination account
	 *
	 * REST: POST /email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}/destinationEmailAddress/{destinationEmailAddress}/migrate
	 * @param password [required] New password used for migration
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param destinationServiceName [required] Service name allowed as migration destination
	 * @param destinationEmailAddress [required] Destination account name
	 *
	 * API beta
	 */
	public OvhTaskPop domain_account_accountName_migrate_destinationServiceName_destinationEmailAddress_destinationEmailAddress_migrate_POST(String domain, String accountName, String destinationServiceName, String destinationEmailAddress, String password) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}/destinationEmailAddress/{destinationEmailAddress}/migrate";
		StringBuilder sb = path(qPath, domain, accountName, destinationServiceName, destinationEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskPop.class);
	}

	/**
	 * Check if it's possible to migrate
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}/destinationEmailAddress/{destinationEmailAddress}/checkMigrate
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param destinationServiceName [required] Service name allowed as migration destination
	 * @param destinationEmailAddress [required] Destination account name
	 *
	 * API beta
	 */
	public OvhMigrationCheckStruct domain_account_accountName_migrate_destinationServiceName_destinationEmailAddress_destinationEmailAddress_checkMigrate_GET(String domain, String accountName, String destinationServiceName, String destinationEmailAddress) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/migrate/{destinationServiceName}/destinationEmailAddress/{destinationEmailAddress}/checkMigrate";
		StringBuilder sb = path(qPath, domain, accountName, destinationServiceName, destinationEmailAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMigrationCheckStruct.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/delegation/{accountId}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param accountId [required] OVH customer unique identifier
	 */
	public OvhDelegation domain_account_accountName_delegation_accountId_GET(String domain, String accountName, String accountId) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/delegation/{accountId}";
		StringBuilder sb = path(qPath, domain, accountName, accountId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDelegation.class);
	}

	/**
	 * Delete an existing delegation
	 *
	 * REST: DELETE /email/domain/{domain}/account/{accountName}/delegation/{accountId}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param accountId [required] OVH customer unique identifier
	 */
	public String domain_account_accountName_delegation_accountId_DELETE(String domain, String accountName, String accountId) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/delegation/{accountId}";
		StringBuilder sb = path(qPath, domain, accountName, accountId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get delegations
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/delegation
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public ArrayList<String> domain_account_accountName_delegation_GET(String domain, String accountName) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/delegation";
		StringBuilder sb = path(qPath, domain, accountName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create delegation for this account
	 *
	 * REST: POST /email/domain/{domain}/account/{accountName}/delegation
	 * @param accountId [required] OVH customer unique identifier
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public String domain_account_accountName_delegation_POST(String domain, String accountName, String accountId) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/delegation";
		StringBuilder sb = path(qPath, domain, accountName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accountId", accountId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Change filter priority
	 *
	 * REST: POST /email/domain/{domain}/account/{accountName}/filter/{name}/changePriority
	 * @param priority [required] New priority
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param name [required] Filter name
	 */
	public OvhTaskFilter domain_account_accountName_filter_name_changePriority_POST(String domain, String accountName, String name, Long priority) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter/{name}/changePriority";
		StringBuilder sb = path(qPath, domain, accountName, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "priority", priority);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Change filter activity
	 *
	 * REST: POST /email/domain/{domain}/account/{accountName}/filter/{name}/changeActivity
	 * @param activity [required] New activity
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param name [required] Filter name
	 */
	public OvhTaskFilter domain_account_accountName_filter_name_changeActivity_POST(String domain, String accountName, String name, Boolean activity) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter/{name}/changeActivity";
		StringBuilder sb = path(qPath, domain, accountName, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "activity", activity);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/filter/{name}/rule/{id}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param name [required] Filter name
	 * @param id [required]
	 */
	public OvhRule domain_account_accountName_filter_name_rule_id_GET(String domain, String accountName, String name, Long id) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter/{name}/rule/{id}";
		StringBuilder sb = path(qPath, domain, accountName, name, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRule.class);
	}

	/**
	 * Delete an existing filter
	 *
	 * REST: DELETE /email/domain/{domain}/account/{accountName}/filter/{name}/rule/{id}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param name [required] Filter name
	 * @param id [required]
	 */
	public ArrayList<OvhTaskFilter> domain_account_accountName_filter_name_rule_id_DELETE(String domain, String accountName, String name, Long id) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter/{name}/rule/{id}";
		StringBuilder sb = path(qPath, domain, accountName, name, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get rules
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/filter/{name}/rule
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param name [required] Filter name
	 */
	public ArrayList<Long> domain_account_accountName_filter_name_rule_GET(String domain, String accountName, String name) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter/{name}/rule";
		StringBuilder sb = path(qPath, domain, accountName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create new rule for filter
	 *
	 * REST: POST /email/domain/{domain}/account/{accountName}/filter/{name}/rule
	 * @param operand [required] Rule of filter
	 * @param header [required] Header to be filtered
	 * @param value [required] Rule parameter of filter
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param name [required] Filter name
	 */
	public OvhTaskFilter domain_account_accountName_filter_name_rule_POST(String domain, String accountName, String name, String header, OvhDomainFilterOperandEnum operand, String value) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter/{name}/rule";
		StringBuilder sb = path(qPath, domain, accountName, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "header", header);
		addBody(o, "operand", operand);
		addBody(o, "value", value);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/filter/{name}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param name [required] Filter name
	 */
	public OvhFilter domain_account_accountName_filter_name_GET(String domain, String accountName, String name) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter/{name}";
		StringBuilder sb = path(qPath, domain, accountName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFilter.class);
	}

	/**
	 * Delete an existing filter
	 *
	 * REST: DELETE /email/domain/{domain}/account/{accountName}/filter/{name}
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param name [required] Filter name
	 */
	public ArrayList<OvhTaskFilter> domain_account_accountName_filter_name_DELETE(String domain, String accountName, String name) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter/{name}";
		StringBuilder sb = path(qPath, domain, accountName, name);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get filters
	 *
	 * REST: GET /email/domain/{domain}/account/{accountName}/filter
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public ArrayList<String> domain_account_accountName_filter_GET(String domain, String accountName) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter";
		StringBuilder sb = path(qPath, domain, accountName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new filter for account
	 *
	 * REST: POST /email/domain/{domain}/account/{accountName}/filter
	 * @param action [required] Action of filter
	 * @param header [required] Header to be filtered
	 * @param active [required] If true filter is active
	 * @param actionParam [required] Action parameter of filter
	 * @param value [required] Rule parameter of filter
	 * @param priority [required] Priority of filter
	 * @param name [required] Filter name
	 * @param operand [required] Rule of filter
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public OvhTaskFilter domain_account_accountName_filter_POST(String domain, String accountName, OvhDomainFilterActionEnum action, String actionParam, Boolean active, String header, String name, OvhDomainFilterOperandEnum operand, Long priority, String value) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter";
		StringBuilder sb = path(qPath, domain, accountName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		addBody(o, "actionParam", actionParam);
		addBody(o, "active", active);
		addBody(o, "header", header);
		addBody(o, "name", name);
		addBody(o, "operand", operand);
		addBody(o, "priority", priority);
		addBody(o, "value", value);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Recommended domain DNS records
	 *
	 * REST: GET /email/domain/{domain}/recommendedDNSRecords
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<OvhRecord> domain_recommendedDNSRecords_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/recommendedDNSRecords";
		StringBuilder sb = path(qPath, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhRecord>> t4 = new TypeReference<ArrayList<OvhRecord>>() {};

	/**
	 * Terminate your email service
	 *
	 * REST: POST /email/domain/{domain}/terminate
	 * @param domain [required] Name of your domain name
	 */
	public String domain_terminate_POST(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/terminate";
		StringBuilder sb = path(qPath, domain);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Domain MX records
	 *
	 * REST: GET /email/domain/{domain}/dnsMXRecords
	 * @param subDomain [required] Sub domain
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<String> domain_dnsMXRecords_GET(String domain, String subDomain) throws IOException {
		String qPath = "/email/domain/{domain}/dnsMXRecords";
		StringBuilder sb = path(qPath, domain);
		query(sb, "subDomain", subDomain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Domain MX filter
	 *
	 * REST: GET /email/domain/{domain}/dnsMXFilter
	 * @param subDomain [required] Sub domain
	 * @param domain [required] Name of your domain name
	 */
	public OvhDomainMXFilterEnum domain_dnsMXFilter_GET(String domain, String subDomain) throws IOException {
		String qPath = "/email/domain/{domain}/dnsMXFilter";
		StringBuilder sb = path(qPath, domain);
		query(sb, "subDomain", subDomain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomainMXFilterEnum.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/serviceInfos
	 * @param domain [required] Name of your domain name
	 */
	public OvhService domain_serviceInfos_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/serviceInfos";
		StringBuilder sb = path(qPath, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /email/domain/{domain}/serviceInfos
	 * @param body [required] New object properties
	 * @param domain [required] Name of your domain name
	 */
	public void domain_serviceInfos_PUT(String domain, OvhService body) throws IOException {
		String qPath = "/email/domain/{domain}/serviceInfos";
		StringBuilder sb = path(qPath, domain);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /email/domain/{domain}/redirection/{id}
	 * @param domain [required] Name of your domain name
	 * @param id [required]
	 */
	public OvhRedirectionGlobal domain_redirection_id_GET(String domain, String id) throws IOException {
		String qPath = "/email/domain/{domain}/redirection/{id}";
		StringBuilder sb = path(qPath, domain, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRedirectionGlobal.class);
	}

	/**
	 * Delete an existing redirection in server
	 *
	 * REST: DELETE /email/domain/{domain}/redirection/{id}
	 * @param domain [required] Name of your domain name
	 * @param id [required]
	 */
	public OvhTaskSpecialAccount domain_redirection_id_DELETE(String domain, String id) throws IOException {
		String qPath = "/email/domain/{domain}/redirection/{id}";
		StringBuilder sb = path(qPath, domain, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Change redirection
	 *
	 * REST: POST /email/domain/{domain}/redirection/{id}/changeRedirection
	 * @param to [required] Target of account
	 * @param domain [required] Name of your domain name
	 * @param id [required]
	 */
	public OvhTaskSpecialAccount domain_redirection_id_changeRedirection_POST(String domain, String id, String to) throws IOException {
		String qPath = "/email/domain/{domain}/redirection/{id}/changeRedirection";
		StringBuilder sb = path(qPath, domain, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "to", to);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Get redirections
	 *
	 * REST: GET /email/domain/{domain}/redirection
	 * @param to [required] Email of redirection target
	 * @param from [required] Name of redirection
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<String> domain_redirection_GET(String domain, String from, String to) throws IOException {
		String qPath = "/email/domain/{domain}/redirection";
		StringBuilder sb = path(qPath, domain);
		query(sb, "from", from);
		query(sb, "to", to);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new redirection in server
	 *
	 * REST: POST /email/domain/{domain}/redirection
	 * @param to [required] Target of account
	 * @param localCopy [required] If true keep a local copy
	 * @param from [required] Name of redirection
	 * @param domain [required] Name of your domain name
	 */
	public OvhTaskSpecialAccount domain_redirection_POST(String domain, String from, Boolean localCopy, String to) throws IOException {
		String qPath = "/email/domain/{domain}/redirection";
		StringBuilder sb = path(qPath, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "from", from);
		addBody(o, "localCopy", localCopy);
		addBody(o, "to", to);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}
}
