package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import net.minidev.ovh.api.hpcspot.OvhAccount;
import net.minidev.ovh.api.hpcspot.OvhConsumption;
import net.minidev.ovh.api.hpcspot.OvhConsumptionTypeEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/hpcspot
 * version:1.0
 */
public class ApiOvhHpcspot extends ApiOvhBase {
	public ApiOvhHpcspot(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hpcspot/{serviceName}
	 * @param serviceName [required] The internal name of your HPC Spot account
	 */
	public OvhAccount serviceName_GET(String serviceName) throws IOException {
		String qPath = "/hpcspot/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hpcspot/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your HPC Spot account
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hpcspot/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hpcspot/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your HPC Spot account
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/hpcspot/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hpcspot/{serviceName}/consumption/{id}
	 * @param serviceName [required] The internal name of your HPC Spot account
	 * @param id [required] ID of the detail
	 */
	public OvhConsumption serviceName_consumption_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hpcspot/{serviceName}/consumption/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhConsumption.class);
	}

	/**
	 * Details of the consumption of your account
	 *
	 * REST: GET /hpcspot/{serviceName}/consumption
	 * @param type [required] Filter the value of type property (=)
	 * @param hpcspotItemEndDate_from [required] Filter the value of hpcspotItemEndDate property (>=)
	 * @param hpcspotItemEndDate_to [required] Filter the value of hpcspotItemEndDate property (<=)
	 * @param orderId [required] Filter the value of orderId property (=)
	 * @param hpcspotItemId [required] Filter the value of hpcspotItemId property (=)
	 * @param serviceName [required] The internal name of your HPC Spot account
	 */
	public ArrayList<Long> serviceName_consumption_GET(String serviceName, Date hpcspotItemEndDate_from, Date hpcspotItemEndDate_to, Long hpcspotItemId, Long orderId, OvhConsumptionTypeEnum type) throws IOException {
		String qPath = "/hpcspot/{serviceName}/consumption";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "hpcspotItemEndDate.from", hpcspotItemEndDate_from);
		query(sb, "hpcspotItemEndDate.to", hpcspotItemEndDate_to);
		query(sb, "hpcspotItemId", hpcspotItemId);
		query(sb, "orderId", orderId);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /hpcspot
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/hpcspot";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};
}
