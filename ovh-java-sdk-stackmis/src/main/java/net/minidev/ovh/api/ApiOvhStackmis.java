package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.stack.mis.OvhProduct;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/stack/mis
 * version:1.0
 */
public class ApiOvhStackmis extends ApiOvhBase {
	public ApiOvhStackmis(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /stack/mis/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your MIS service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/stack/mis/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /stack/mis/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your MIS service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/stack/mis/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /stack/mis/{serviceName}
	 * @param serviceName [required] The internal name of your MIS service
	 */
	public OvhProduct serviceName_GET(String serviceName) throws IOException {
		String qPath = "/stack/mis/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhProduct.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /stack/mis
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/stack/mis";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};
}
