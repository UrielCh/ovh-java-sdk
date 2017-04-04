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
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/email/domain
 * version:1.0
 */
public class ApiOvhEmaildomain extends ApiOvhBase {
	public ApiOvhEmaildomain(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/domain/{domain}/serviceInfos
	 * @param domain [required] Name of your domain name
	 */
	public OvhService domain_serviceInfos_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/serviceInfos";
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		exec("PUT", qPath, body);
	}

	/**
	 * List all quotas for this domain
	 * 
	 * REST: GET /email/domain/{domain}/quota
	 * @param domain [required] Name of your domain name
	 */
	public OvhDomainQuota domain_quota_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/quota";
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDomainQuota.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/domain/{domain}
	 * @param domain [required] Name of your domain name
	 */
	public OvhDomainService domain_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}";
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDomainService.class);
	}

	/**
	 * Terminate your email service
	 * 
	 * REST: POST /email/domain/{domain}/terminate
	 * @param domain [required] Name of your domain name
	 */
	public String domain_terminate_POST(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/terminate";
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "from", from);
		qPath = query(qPath, "to", to);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Create new redirection in server
	 * 
	 * REST: POST /email/domain/{domain}/redirection
	 * @param to [required] Target of account
	 * @param localCopy [required] If true keep a local copy
	 * @param from [required] Name of redirection
	 * @param domain [required] Name of your domain name
	 */
	public OvhTaskSpecialAccount domain_redirection_POST(String domain, String to, Boolean localCopy, String from) throws IOException {
		String qPath = "/email/domain/{domain}/redirection";
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "to", to);
		addBody(o, "localCopy", localCopy);
		addBody(o, "from", from);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTaskSpecialAccount.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{id}", id);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{id}", id);
		String resp = exec("DELETE", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{id}", id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "to", to);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTaskSpecialAccount.class);
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
	public ArrayList<Long> domain_changeContact_POST(String domain, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/email/domain/{domain}/changeContact";
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Summary for this domain
	 * 
	 * REST: GET /email/domain/{domain}/summary
	 * @param domain [required] Name of your domain name
	 */
	public OvhDomainSummary domain_summary_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/summary";
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDomainSummary.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "account", account);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new responder in server
	 * 
	 * REST: POST /email/domain/{domain}/responder
	 * @param copy [required] If true, emails will be copy to emailToCopy address
	 * @param copyTo [required] Account where copy emails
	 * @param to [required] Date of end responder
	 * @param from [required] Date of start responder
	 * @param account [required] Account of domain
	 * @param content [required] Content of responder
	 * @param domain [required] Name of your domain name
	 */
	public OvhTaskSpecialAccount domain_responder_POST(String domain, Boolean copy, String copyTo, Date to, Date from, String account, String content) throws IOException {
		String qPath = "/email/domain/{domain}/responder";
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "copy", copy);
		addBody(o, "copyTo", copyTo);
		addBody(o, "to", to);
		addBody(o, "from", from);
		addBody(o, "account", account);
		addBody(o, "content", content);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTaskSpecialAccount.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{account}", account);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{account}", account);
		exec("PUT", qPath, body);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{account}", account);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Recommended domain DNS records
	 * 
	 * REST: GET /email/domain/{domain}/recommendedDNSRecords
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<OvhRecord> domain_recommendedDNSRecords_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/recommendedDNSRecords";
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhRecord>> t3 = new TypeReference<ArrayList<OvhRecord>>() {};

	/**
	 * Domain MX filter
	 * 
	 * REST: GET /email/domain/{domain}/dnsMXFilter
	 * @param subDomain [required] Sub domain
	 * @param domain [required] Name of your domain name
	 */
	public OvhDomainMXFilterEnum domain_dnsMXFilter_GET(String domain, String subDomain) throws IOException {
		String qPath = "/email/domain/{domain}/dnsMXFilter";
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "subDomain", subDomain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDomainMXFilterEnum.class);
	}

	/**
	 * Get ACL on your domain
	 * 
	 * REST: GET /email/domain/{domain}/acl
	 * @param domain [required] Name of your domain name
	 */
	public ArrayList<String> domain_acl_GET(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/acl";
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accountId", accountId);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountId}", accountId);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountId}", accountId);
		exec("DELETE", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "accountName", accountName);
		qPath = query(qPath, "description", description);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new mailbox in server
	 * 
	 * REST: POST /email/domain/{domain}/account
	 * @param password [required] Account password
	 * @param description [required] Description Account
	 * @param size [required] Account size in bytes (default : 5000000000) (possible values : /email/domain/{domain}/allowedAccountSize )
	 * @param accountName [required] Account name
	 * @param domain [required] Name of your domain name
	 */
	public OvhTaskPop domain_account_POST(String domain, String password, String description, Long size, String accountName) throws IOException {
		String qPath = "/email/domain/{domain}/account";
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "description", description);
		addBody(o, "size", size);
		addBody(o, "accountName", accountName);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		exec("POST", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		exec("PUT", qPath, body);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTaskPop.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new filter for account
	 * 
	 * REST: POST /email/domain/{domain}/account/{accountName}/filter
	 * @param priority [required] Priority of filter
	 * @param value [required] Rule parameter of filter
	 * @param active [required] If true filter is active
	 * @param operand [required] Rule of filter
	 * @param name [required] Filter name
	 * @param actionParam [required] Action parameter of filter
	 * @param action [required] Action of filter
	 * @param header [required] Header to be filtered
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 */
	public OvhTaskFilter domain_account_accountName_filter_POST(String domain, String accountName, Long priority, String value, Boolean active, OvhDomainFilterOperandEnum operand, String name, String actionParam, OvhDomainFilterActionEnum action, String header) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter";
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "priority", priority);
		addBody(o, "value", value);
		addBody(o, "active", active);
		addBody(o, "operand", operand);
		addBody(o, "name", name);
		addBody(o, "actionParam", actionParam);
		addBody(o, "action", action);
		addBody(o, "header", header);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhTaskFilter>> t4 = new TypeReference<ArrayList<OvhTaskFilter>>() {};

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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "activity", activity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTaskFilter.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Create new rule for filter
	 * 
	 * REST: POST /email/domain/{domain}/account/{accountName}/filter/{name}/rule
	 * @param value [required] Rule parameter of filter
	 * @param operand [required] Rule of filter
	 * @param header [required] Header to be filtered
	 * @param domain [required] Name of your domain name
	 * @param accountName [required] Name of account
	 * @param name [required] Filter name
	 */
	public OvhTaskFilter domain_account_accountName_filter_name_rule_POST(String domain, String accountName, String name, String value, OvhDomainFilterOperandEnum operand, String header) throws IOException {
		String qPath = "/email/domain/{domain}/account/{accountName}/filter/{name}/rule";
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "value", value);
		addBody(o, "operand", operand);
		addBody(o, "header", header);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t4);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "priority", priority);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTaskFilter.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTaskPop.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accountId", accountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{accountId}", accountId);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{accountName}", accountName);
		qPath = qPath.replace("{accountId}", accountId);
		String resp = exec("DELETE", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "subDomain", subDomain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "account", account);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTaskSpecialAccount.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "account", account);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTaskFilter.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "name", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTaskPop.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "account", account);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTaskMl.class);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "account", account);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTaskSpecialAccount.class);
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
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "commentary", commentary);
		addBody(o, "reason", reason);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Create delegation of domain with same nic than V3
	 * 
	 * REST: POST /email/domain/{domain}/migrateDelegationV3toV6
	 * @param domain [required] Name of your domain name
	 */
	public void domain_migrateDelegationV3toV6_POST(String domain) throws IOException {
		String qPath = "/email/domain/{domain}/migrateDelegationV3toV6";
		qPath = qPath.replace("{domain}", domain);
		exec("POST", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "name", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new mailingList
	 * 
	 * REST: POST /email/domain/{domain}/mailingList
	 * @param replyTo [required] Email to reply of mailing list
	 * @param options [required] Options of mailing list
	 * @param language [required] Language of mailing list
	 * @param name [required] Mailing list name
	 * @param ownerEmail [required] Owner Email
	 * @param domain [required] Name of your domain name
	 */
	public OvhTaskMl domain_mailingList_POST(String domain, String replyTo, OvhDomainMlOptionsStruct options, OvhDomainMlLanguageEnum language, String name, String ownerEmail) throws IOException {
		String qPath = "/email/domain/{domain}/mailingList";
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "replyTo", replyTo);
		addBody(o, "options", options);
		addBody(o, "language", language);
		addBody(o, "name", name);
		addBody(o, "ownerEmail", ownerEmail);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		exec("PUT", qPath, body);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		String resp = exec("DELETE", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "options", options);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		qPath = query(qPath, "email", email);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{email}", email);
		String resp = exec("DELETE", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		qPath = query(qPath, "email", email);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{email}", email);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTaskMl.class);
	}

	/**
	 * Change MX filter, so change MX DNS records
	 * 
	 * REST: POST /email/domain/{domain}/changeDnsMXFilter
	 * @param mxFilter [required] New MX filter
	 * @param subDomain [required] Sub domain
	 * @param customTarget [required] Target server for custom MX
	 * @param domain [required] Name of your domain name
	 */
	public void domain_changeDnsMXFilter_POST(String domain, OvhDomainMXFilterEnum mxFilter, String subDomain, String customTarget) throws IOException {
		String qPath = "/email/domain/{domain}/changeDnsMXFilter";
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "mxFilter", mxFilter);
		addBody(o, "subDomain", subDomain);
		addBody(o, "customTarget", customTarget);
		exec("POST", qPath, o);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /email/domain
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/email/domain";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Delegated emails
	 * 
	 * REST: GET /email/domain/delegatedAccount
	 * @param domain [required] Domain of email address
	 * @param accountName [required] Name of email address
	 */
	public ArrayList<String> delegatedAccount_GET(String accountName, String domain) throws IOException {
		String qPath = "/email/domain/delegatedAccount";
		qPath = query(qPath, "accountName", accountName);
		qPath = query(qPath, "domain", domain);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{email}", email);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhDomainUsageAccountStruct.class);
	}

	/**
	 * Update usage of account
	 * 
	 * REST: POST /email/domain/delegatedAccount/{email}/updateUsage
	 * @param email [required] Email
	 */
	public void delegatedAccount_email_updateUsage_POST(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/updateUsage";
		qPath = qPath.replace("{email}", email);
		exec("POST", qPath);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/domain/delegatedAccount/{email}
	 * @param email [required] Email
	 */
	public OvhAccountDelegated delegatedAccount_email_GET(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}";
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{email}", email);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/domain/delegatedAccount/{email}/responder
	 * @param email [required] Email
	 */
	public OvhResponderAccount delegatedAccount_email_responder_GET(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/responder";
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{email}", email);
		exec("PUT", qPath, body);
	}

	/**
	 * Create new responder in server
	 * 
	 * REST: POST /email/domain/delegatedAccount/{email}/responder
	 * @param copy [required] If true, emails will be copy to emailToCopy address
	 * @param copyTo [required] Account where copy emails
	 * @param to [required] Date of end responder
	 * @param from [required] Date of start responder
	 * @param content [required] Content of responder
	 * @param email [required] Email
	 */
	public OvhTaskSpecialAccount delegatedAccount_email_responder_POST(String email, Boolean copy, String copyTo, Date to, Date from, String content) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/responder";
		qPath = qPath.replace("{email}", email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "copy", copy);
		addBody(o, "copyTo", copyTo);
		addBody(o, "to", to);
		addBody(o, "from", from);
		addBody(o, "content", content);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{email}", email);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTaskSpecialAccount.class);
	}

	/**
	 * Get filters
	 * 
	 * REST: GET /email/domain/delegatedAccount/{email}/filter
	 * @param email [required] Email
	 */
	public ArrayList<String> delegatedAccount_email_filter_GET(String email) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter";
		qPath = qPath.replace("{email}", email);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new filter for account
	 * 
	 * REST: POST /email/domain/delegatedAccount/{email}/filter
	 * @param priority [required] Priority of filter
	 * @param value [required] Rule parameter of filter
	 * @param active [required] If true filter is active
	 * @param operand [required] Rule of filter
	 * @param name [required] Filter name
	 * @param actionParam [required] Action parameter of filter
	 * @param action [required] Action of filter
	 * @param header [required] Header to be filtered
	 * @param email [required] Email
	 */
	public OvhTaskFilter delegatedAccount_email_filter_POST(String email, Long priority, String value, Boolean active, OvhDomainFilterOperandEnum operand, String name, String actionParam, OvhDomainFilterActionEnum action, String header) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter";
		qPath = qPath.replace("{email}", email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "priority", priority);
		addBody(o, "value", value);
		addBody(o, "active", active);
		addBody(o, "operand", operand);
		addBody(o, "name", name);
		addBody(o, "actionParam", actionParam);
		addBody(o, "action", action);
		addBody(o, "header", header);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{name}", name);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t4);
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
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "activity", activity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTaskFilter.class);
	}

	/**
	 * Get rules
	 * 
	 * REST: GET /email/domain/delegatedAccount/{email}/filter/{name}/rule
	 * @param email [required] Email
	 * @param name [required] Filter name
	 */
	public ArrayList<Long> delegatedAccount_email_filter_name_rule_GET(String email, String name) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}/rule";
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Create new rule for filter
	 * 
	 * REST: POST /email/domain/delegatedAccount/{email}/filter/{name}/rule
	 * @param value [required] Rule parameter of filter
	 * @param operand [required] Rule of filter
	 * @param header [required] Header to be filtered
	 * @param email [required] Email
	 * @param name [required] Filter name
	 */
	public OvhTaskFilter delegatedAccount_email_filter_name_rule_POST(String email, String name, String value, OvhDomainFilterOperandEnum operand, String header) throws IOException {
		String qPath = "/email/domain/delegatedAccount/{email}/filter/{name}/rule";
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "value", value);
		addBody(o, "operand", operand);
		addBody(o, "header", header);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTaskFilter.class);
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
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t4);
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
		qPath = qPath.replace("{email}", email);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "priority", priority);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{email}", email);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTaskPop.class);
	}

	/**
	 * Get limits of mailing list
	 * 
	 * REST: GET /email/domain/mailingListLimits
	 * @param moderatorMessage [required] If true, messages are moderate
	 */
	public OvhDomainMlLimits mailingListLimits_GET(Boolean moderatorMessage) throws IOException {
		String qPath = "/email/domain/mailingListLimits";
		qPath = query(qPath, "moderatorMessage", moderatorMessage);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhDomainMlLimits.class);
	}
}
