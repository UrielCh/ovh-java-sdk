package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.servicelist.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/service
 * version:1.0
 */
public class ApiOvhService extends ApiOvhBase {
	public ApiOvhService(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /service/{serviceId}
	 * @param serviceId [required] The internal ID of your service
	 *
	 * API beta
	 */
	public OvhService serviceId_GET(Long serviceId) throws IOException {
		String qPath = "/service/{serviceId}";
		StringBuilder sb = path(qPath, serviceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /service/{serviceId}
	 * @param body [required] New object properties
	 * @param serviceId [required] The internal ID of your service
	 *
	 * API beta
	 */
	public void serviceId_PUT(Long serviceId, OvhService body) throws IOException {
		String qPath = "/service/{serviceId}";
		StringBuilder sb = path(qPath, serviceId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Suspend the service. The service won't be accessible, but you will still be charged for it
	 *
	 * REST: POST /service/{serviceId}/suspend
	 * @param serviceId [required] The internal ID of your service
	 *
	 * API beta
	 */
	public void serviceId_suspend_POST(Long serviceId) throws IOException {
		String qPath = "/service/{serviceId}/suspend";
		StringBuilder sb = path(qPath, serviceId);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Reopen a suspended service
	 *
	 * REST: POST /service/{serviceId}/reopen
	 * @param serviceId [required] The internal ID of your service
	 *
	 * API beta
	 */
	public void serviceId_reopen_POST(Long serviceId) throws IOException {
		String qPath = "/service/{serviceId}/reopen";
		StringBuilder sb = path(qPath, serviceId);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * List available services
	 *
	 * REST: GET /service
	 *
	 * API beta
	 */
	public ArrayList<Long> GET() throws IOException {
		String qPath = "/service";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};
}
