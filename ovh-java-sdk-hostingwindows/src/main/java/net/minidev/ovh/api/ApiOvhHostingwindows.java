package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/hosting/windows
 * version:1.0
 */
public class ApiOvhHostingwindows extends ApiOvhBase {
	public ApiOvhHostingwindows(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/windows/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your hosting
	 * @deprecated
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hosting/windows/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/windows/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @deprecated
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/hosting/windows/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/windows/{serviceName}
	 * @param serviceName [required] The internal name of your hosting
	 * @deprecated
	 */
	public net.minidev.ovh.api.hosting.windows.OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/hosting/windows/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, net.minidev.ovh.api.hosting.windows.OvhService.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /hosting/windows/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your hosting
	 * @deprecated
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/hosting/windows/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /hosting/windows
	 * @deprecated
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/hosting/windows";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};
}
