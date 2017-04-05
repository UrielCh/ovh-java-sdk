package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.alldom.OvhAllDom;
import net.minidev.ovh.api.alldom.OvhAllDomDomain;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/allDom
 * version:1.0
 */
public class ApiOvhAllDom extends ApiOvhBase {
	public ApiOvhAllDom(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /allDom/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your allDom
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/allDom/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /allDom/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your allDom
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/allDom/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /allDom/{serviceName}
	 * @param serviceName [required] The internal name of your allDom
	 */
	public OvhAllDom serviceName_GET(String serviceName) throws IOException {
		String qPath = "/allDom/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAllDom.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /allDom/{serviceName}/domain/{domain}
	 * @param serviceName [required] The internal name of your allDom
	 * @param domain [required] Domain name
	 */
	public OvhAllDomDomain serviceName_domain_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/allDom/{serviceName}/domain/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAllDomDomain.class);
	}

	/**
	 * Domains attached to this allDom
	 *
	 * REST: GET /allDom/{serviceName}/domain
	 * @param domain [required] Filter the value of domain property (like)
	 * @param serviceName [required] The internal name of your allDom
	 */
	public ArrayList<String> serviceName_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/allDom/{serviceName}/domain";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "domain", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /allDom
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/allDom";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
}
