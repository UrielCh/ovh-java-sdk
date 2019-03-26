package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.ssl.OvhCertificate;
import net.minidev.ovh.api.ssl.OvhOperation;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/ssl
 * version:1.0
 */
public class ApiOvhSsl extends ApiOvhBase {
	public ApiOvhSsl(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ssl/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your SSL service
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/ssl/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /ssl/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SSL service
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/ssl/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /ssl/{serviceName}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your SSL service
	 * @param taskId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/ssl/{serviceName}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Tasks associated to this ssl
	 *
	 * REST: GET /ssl/{serviceName}/tasks
	 * @param serviceName [required] The internal name of your SSL service
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName) throws IOException {
		String qPath = "/ssl/{serviceName}/tasks";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /ssl/{serviceName}
	 * @param serviceName [required] The internal name of your SSL service
	 *
	 * API beta
	 */
	public OvhCertificate serviceName_GET(String serviceName) throws IOException {
		String qPath = "/ssl/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCertificate.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /ssl
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/ssl";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};
}
