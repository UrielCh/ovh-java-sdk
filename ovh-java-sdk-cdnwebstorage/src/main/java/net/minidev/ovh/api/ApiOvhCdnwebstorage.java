package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.cdn.webstorage.OvhAccount;
import net.minidev.ovh.api.cdn.webstorage.OvhAccountCredentials;
import net.minidev.ovh.api.cdn.webstorage.OvhStatsDataType;
import net.minidev.ovh.api.cdn.webstorage.OvhStatsPeriodEnum;
import net.minidev.ovh.api.cdn.webstorage.OvhStatsTypeEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/cdn/webstorage
 * version:1.0
 */
public class ApiOvhCdnwebstorage extends ApiOvhBase {
	public ApiOvhCdnwebstorage(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/webstorage/{serviceName}
	 * @param serviceName [required] The internal name of your CDN Static offer
	 */
	public OvhAccount serviceName_GET(String serviceName) throws IOException {
		String qPath = "/cdn/webstorage/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Gives for customer credentials to accesss swift account
	 *
	 * REST: GET /cdn/webstorage/{serviceName}/credentials
	 * @param serviceName [required] The internal name of your CDN Static offer
	 */
	public OvhAccountCredentials serviceName_credentials_GET(String serviceName) throws IOException {
		String qPath = "/cdn/webstorage/{serviceName}/credentials";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccountCredentials.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cdn/webstorage/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your CDN Static offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/cdn/webstorage/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cdn/webstorage/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your CDN Static offer
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/cdn/webstorage/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Return stats about bandwidth consumption
	 *
	 * REST: GET /cdn/webstorage/{serviceName}/statistics
	 * @param type [required]
	 * @param period [required]
	 * @param serviceName [required] The internal name of your CDN Static offer
	 */
	public ArrayList<OvhStatsDataType> serviceName_statistics_GET(String serviceName, OvhStatsPeriodEnum period, OvhStatsTypeEnum type) throws IOException {
		String qPath = "/cdn/webstorage/{serviceName}/statistics";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhStatsDataType>> t1 = new TypeReference<ArrayList<OvhStatsDataType>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /cdn/webstorage
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/cdn/webstorage";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};
}
