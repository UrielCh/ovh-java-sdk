package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.cdn.website.OvhBackend;
import net.minidev.ovh.api.cdn.website.OvhDomain;
import net.minidev.ovh.api.cdn.website.OvhStatsDataType;
import net.minidev.ovh.api.cdn.website.OvhStatsPeriodEnum;
import net.minidev.ovh.api.cdn.website.OvhStatsTypeEnum;
import net.minidev.ovh.api.cdn.website.OvhStatsValueEnum;
import net.minidev.ovh.api.cdn.website.OvhTask;
import net.minidev.ovh.api.cdn.website.OvhWebsite;
import net.minidev.ovh.api.cdn.website.OvhZone;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/cdn/website
 * version:1.0
 */
public class ApiOvhCdnwebsite extends ApiOvhBase {
	public ApiOvhCdnwebsite(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /cdn/website
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/cdn/website";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/website/{serviceName}/zone
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public OvhZone serviceName_zone_GET(String serviceName) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhZone.class);
	}

	/**
	 * Configure a zone on CDN
	 *
	 * REST: POST /cdn/website/{serviceName}/zone
	 * @param zone [required] zone DNS name to add on CDN
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public OvhZone serviceName_zone_POST(String serviceName, String zone) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zone", zone);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhZone.class);
	}

	/**
	 * Remove a zone from the CDN
	 *
	 * REST: DELETE /cdn/website/{serviceName}/zone
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public OvhTask serviceName_zone_DELETE(String serviceName) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Task associated to this backend
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/backends/{ipv4}/tasks
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param ipv4 [required]
	 */
	public ArrayList<Long> serviceName_zone_backends_ipv4_tasks_GET(String serviceName, String ipv4) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/backends/{ipv4}/tasks";
		StringBuilder sb = path(qPath, serviceName, ipv4);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/backends/{ipv4}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param ipv4 [required]
	 * @param taskId [required]
	 */
	public OvhTask serviceName_zone_backends_ipv4_tasks_taskId_GET(String serviceName, String ipv4, Long taskId) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/backends/{ipv4}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, ipv4, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/backends/{ipv4}
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param ipv4 [required]
	 */
	public OvhBackend serviceName_zone_backends_ipv4_GET(String serviceName, String ipv4) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/backends/{ipv4}";
		StringBuilder sb = path(qPath, serviceName, ipv4);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Remove a backend from the zone
	 *
	 * REST: DELETE /cdn/website/{serviceName}/zone/backends/{ipv4}
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param ipv4 [required]
	 */
	public OvhTask serviceName_zone_backends_ipv4_DELETE(String serviceName, String ipv4) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/backends/{ipv4}";
		StringBuilder sb = path(qPath, serviceName, ipv4);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Backend associated to this zone
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/backends
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public ArrayList<String> serviceName_zone_backends_GET(String serviceName) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/backends";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Configure a backend on the zone
	 *
	 * REST: POST /cdn/website/{serviceName}/zone/backends
	 * @param ipv4 [required] ip to configure on the zone
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public OvhTask serviceName_zone_backends_POST(String serviceName, String ipv4) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/backends";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipv4", ipv4);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Task associated to this zone
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/tasks
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public ArrayList<Long> serviceName_zone_tasks_GET(String serviceName) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/tasks";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/tasks/{taskId}
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param taskId [required]
	 */
	public OvhTask serviceName_zone_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/domains/{domain}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param domain [required]
	 * @param taskId [required]
	 */
	public OvhTask serviceName_zone_domains_domain_tasks_taskId_GET(String serviceName, String domain, Long taskId) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/domains/{domain}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, domain, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Task associated to this domain
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/domains/{domain}/tasks
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param domain [required]
	 */
	public ArrayList<Long> serviceName_zone_domains_domain_tasks_GET(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/domains/{domain}/tasks";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get statistics about request on CDN, bandwidth value in Bytes
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/domains/{domain}/statistics
	 * @param value [required]
	 * @param period [required]
	 * @param type [required]
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param domain [required]
	 */
	public ArrayList<OvhStatsDataType> serviceName_zone_domains_domain_statistics_GET(String serviceName, String domain, OvhStatsPeriodEnum period, OvhStatsTypeEnum type, OvhStatsValueEnum value) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/domains/{domain}/statistics";
		StringBuilder sb = path(qPath, serviceName, domain);
		query(sb, "period", period);
		query(sb, "type", type);
		query(sb, "value", value);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhStatsDataType>> t3 = new TypeReference<ArrayList<OvhStatsDataType>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/domains/{domain}
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param domain [required]
	 */
	public OvhDomain serviceName_zone_domains_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/domains/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Remove a domain from the CDN
	 *
	 * REST: DELETE /cdn/website/{serviceName}/zone/domains/{domain}
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param domain [required]
	 */
	public OvhTask serviceName_zone_domains_domain_DELETE(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/domains/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Flush all cache
	 *
	 * REST: POST /cdn/website/{serviceName}/zone/domains/{domain}/flush
	 * @param serviceName [required] The internal name of your CDN Website offer
	 * @param domain [required]
	 */
	public OvhTask serviceName_zone_domains_domain_flush_POST(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/domains/{domain}/flush";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Domain associated to this zone
	 *
	 * REST: GET /cdn/website/{serviceName}/zone/domains
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public ArrayList<String> serviceName_zone_domains_GET(String serviceName) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/domains";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Configure a domain on CDN
	 *
	 * REST: POST /cdn/website/{serviceName}/zone/domains
	 * @param domain [required] domain to add on CDN
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public OvhDomain serviceName_zone_domains_POST(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/website/{serviceName}/zone/domains";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/website/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/cdn/website/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cdn/website/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/cdn/website/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/website/{serviceName}
	 * @param serviceName [required] The internal name of your CDN Website offer
	 */
	public OvhWebsite serviceName_GET(String serviceName) throws IOException {
		String qPath = "/cdn/website/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhWebsite.class);
	}
}
