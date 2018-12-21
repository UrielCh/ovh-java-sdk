package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.cdnanycast.OvhAnycast;
import net.minidev.ovh.api.cdnanycast.OvhBackend;
import net.minidev.ovh.api.cdnanycast.OvhCacheRule;
import net.minidev.ovh.api.cdnanycast.OvhCacheRuleCacheTypeEnum;
import net.minidev.ovh.api.cdnanycast.OvhCacheRuleFileTypeEnum;
import net.minidev.ovh.api.cdnanycast.OvhDomain;
import net.minidev.ovh.api.cdnanycast.OvhLogsURL;
import net.minidev.ovh.api.cdnanycast.OvhPop;
import net.minidev.ovh.api.cdnanycast.OvhSsl;
import net.minidev.ovh.api.cdnanycast.OvhStatsDataType;
import net.minidev.ovh.api.cdnanycast.OvhStatsPeriodEnum;
import net.minidev.ovh.api.cdnanycast.OvhStatsTypeEnum;
import net.minidev.ovh.api.cdnanycast.OvhStatsValueEnum;
import net.minidev.ovh.api.cdnanycast.OvhTask;
import net.minidev.ovh.api.cdnanycast.OvhTaskFunctionEnum;
import net.minidev.ovh.api.cdnanycast.OvhTaskStateEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/cdn/dedicated
 * version:1.0
 */
public class ApiOvhCdndedicated extends ApiOvhBase {
	public ApiOvhCdndedicated(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /cdn/dedicated
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/cdn/dedicated";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * List of CDN Pops
	 *
	 * REST: GET /cdn/dedicated/pops
	 */
	public ArrayList<String> pops_GET() throws IOException {
		String qPath = "/cdn/dedicated/pops";
		StringBuilder sb = path(qPath);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/pops/{name}
	 * @param name [required] Name of the pop
	 */
	public OvhPop pops_name_GET(String name) throws IOException {
		String qPath = "/cdn/dedicated/pops/{name}";
		StringBuilder sb = path(qPath, name);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPop.class);
	}

	/**
	 * Generate URL to real time logs
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/logs
	 * @param serviceName [required] The internal name of your CDN offer
	 *
	 * API beta
	 */
	public OvhLogsURL serviceName_logs_POST(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/logs";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhLogsURL.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/{serviceName}
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhAnycast serviceName_GET(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAnycast.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cdn/dedicated/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Return quota history
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/quota
	 * @param period [required]
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<OvhStatsDataType> serviceName_quota_GET(String serviceName, OvhStatsPeriodEnum period) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/quota";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "period", period);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhStatsDataType>> t3 = new TypeReference<ArrayList<OvhStatsDataType>>() {};

	/**
	 * Domains associated to this anycast
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<String> serviceName_domains_GET(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a domain on CDN
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/domains
	 * @param domain [required] domain name to add on CDN
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhDomain serviceName_domains_POST(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Flush all cache
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/domains/{domain}/flush
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhTask serviceName_domains_domain_flush_POST(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/flush";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Return stats about a domain
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/statistics
	 * @param type [required]
	 * @param value [required]
	 * @param period [required]
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public ArrayList<OvhStatsDataType> serviceName_domains_domain_statistics_GET(String serviceName, String domain, OvhStatsPeriodEnum period, OvhStatsTypeEnum type, OvhStatsValueEnum value) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/statistics";
		StringBuilder sb = path(qPath, serviceName, domain);
		query(sb, "period", period);
		query(sb, "type", type);
		query(sb, "value", value);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public OvhCacheRule serviceName_domains_domain_cacheRules_cacheRuleId_GET(String serviceName, String domain, Long cacheRuleId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}";
		StringBuilder sb = path(qPath, serviceName, domain, cacheRuleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCacheRule.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public void serviceName_domains_domain_cacheRules_cacheRuleId_PUT(String serviceName, String domain, Long cacheRuleId, OvhCacheRule body) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}";
		StringBuilder sb = path(qPath, serviceName, domain, cacheRuleId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove cache rule
	 *
	 * REST: DELETE /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public OvhTask serviceName_domains_domain_cacheRules_cacheRuleId_DELETE(String serviceName, String domain, Long cacheRuleId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}";
		StringBuilder sb = path(qPath, serviceName, domain, cacheRuleId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 * @param taskId [required]
	 */
	public OvhTask serviceName_domains_domain_cacheRules_cacheRuleId_tasks_taskId_GET(String serviceName, String domain, Long cacheRuleId, Long taskId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, domain, cacheRuleId, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Task associated to the cache rule
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/tasks
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public ArrayList<Long> serviceName_domains_domain_cacheRules_cacheRuleId_tasks_GET(String serviceName, String domain, Long cacheRuleId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/tasks";
		StringBuilder sb = path(qPath, serviceName, domain, cacheRuleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Flush the cache
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/flush
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public OvhTask serviceName_domains_domain_cacheRules_cacheRuleId_flush_POST(String serviceName, String domain, Long cacheRuleId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/flush";
		StringBuilder sb = path(qPath, serviceName, domain, cacheRuleId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Cache rules associated to the domain
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules
	 * @param fileMatch [required] Filter the value of fileMatch property (like)
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public ArrayList<Long> serviceName_domains_domain_cacheRules_GET(String serviceName, String domain, String fileMatch) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules";
		StringBuilder sb = path(qPath, serviceName, domain);
		query(sb, "fileMatch", fileMatch);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a cache rule to a domain
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules
	 * @param cacheType [required] Type of cache rule to add to the domain
	 * @param ttl [required] ttl for cache rule to add to the domain
	 * @param fileType [required] File type for cache rule to add to the domain
	 * @param fileMatch [required] File match for cache rule to add to the domain
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhCacheRule serviceName_domains_domain_cacheRules_POST(String serviceName, String domain, OvhCacheRuleCacheTypeEnum cacheType, String fileMatch, OvhCacheRuleFileTypeEnum fileType, Long ttl) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules";
		StringBuilder sb = path(qPath, serviceName, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cacheType", cacheType);
		addBody(o, "fileMatch", fileMatch);
		addBody(o, "fileType", fileType);
		addBody(o, "ttl", ttl);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhCacheRule.class);
	}

	/**
	 * Task associated to the domain
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/tasks
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public ArrayList<Long> serviceName_domains_domain_tasks_GET(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/tasks";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param taskId [required]
	 */
	public OvhTask serviceName_domains_domain_tasks_taskId_GET(String serviceName, String domain, Long taskId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, domain, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/backends/{ip}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param ip [required]
	 */
	public OvhBackend serviceName_domains_domain_backends_ip_GET(String serviceName, String domain, String ip) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/backends/{ip}";
		StringBuilder sb = path(qPath, serviceName, domain, ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Remove a backend IP
	 *
	 * REST: DELETE /cdn/dedicated/{serviceName}/domains/{domain}/backends/{ip}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param ip [required]
	 */
	public String serviceName_domains_domain_backends_ip_DELETE(String serviceName, String domain, String ip) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/backends/{ip}";
		StringBuilder sb = path(qPath, serviceName, domain, ip);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Backend associated to the domain
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/backends
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public ArrayList<String> serviceName_domains_domain_backends_GET(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/backends";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a backend IP
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/domains/{domain}/backends
	 * @param ip [required] IP to add to backends list
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhBackend serviceName_domains_domain_backends_POST(String serviceName, String domain, String ip) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/backends";
		StringBuilder sb = path(qPath, serviceName, domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhDomain serviceName_domains_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cdn/dedicated/{serviceName}/domains/{domain}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public void serviceName_domains_domain_PUT(String serviceName, String domain, OvhDomain body) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove a domain from the CDN
	 *
	 * REST: DELETE /cdn/dedicated/{serviceName}/domains/{domain}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhTask serviceName_domains_domain_DELETE(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Generate URL to real time logs
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/domains/{domain}/logs
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 *
	 * API beta
	 */
	public OvhLogsURL serviceName_domains_domain_logs_POST(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/logs";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhLogsURL.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/ssl
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhSsl serviceName_ssl_GET(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Add a SSL on CDN or Generate a Lets Encrypt certificate
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/ssl
	 * @param name [required] ssl name to add on CDN
	 * @param chain [required] certificate chain (empty for lets encrypt generation)
	 * @param certificate [required] certificate (empty for lets encrypt generation)
	 * @param key [required] certificate key (empty for lets encrypt generation)
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhSsl serviceName_ssl_POST(String serviceName, String certificate, String chain, String key, String name) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "certificate", certificate);
		addBody(o, "chain", chain);
		addBody(o, "key", key);
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Remove SSL of the CDN
	 *
	 * REST: DELETE /cdn/dedicated/{serviceName}/ssl
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhTask serviceName_ssl_DELETE(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Task associated to the ssl
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/ssl/tasks
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<Long> serviceName_ssl_tasks_GET(String serviceName, OvhTaskFunctionEnum function, OvhTaskStateEnum status) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl/tasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/dedicated/{serviceName}/ssl/tasks/{taskId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param taskId [required]
	 */
	public OvhTask serviceName_ssl_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Update an existing SSL with a custom certificate
	 *
	 * REST: POST /cdn/dedicated/{serviceName}/ssl/update
	 * @param certificate [required] certificate
	 * @param key [required] certificate key
	 * @param chain [required] certificate chain
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhTask serviceName_ssl_update_POST(String serviceName, String certificate, String chain, String key) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl/update";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "certificate", certificate);
		addBody(o, "chain", chain);
		addBody(o, "key", key);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}
}
