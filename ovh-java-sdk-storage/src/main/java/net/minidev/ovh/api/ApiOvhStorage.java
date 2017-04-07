package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.storage.OvhContainer;
import net.minidev.ovh.api.storage.OvhContainerDetail;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/storage
 * version:1.0
 */
public class ApiOvhStorage extends ApiOvhBase {
	public ApiOvhStorage(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get all your storage containers
	 *
	 * REST: GET /storage
	 * @param region [required] Container region
	 * @deprecated
	 */
	public ArrayList<OvhContainer> GET(String region) throws IOException {
		String qPath = "/storage";
		StringBuilder sb = path(qPath);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhContainer>> t1 = new TypeReference<ArrayList<OvhContainer>>() {};

	/**
	 * Create a new container
	 *
	 * REST: POST /storage
	 * @param name [required] Container name
	 * @param region [required] Container region
	 * @deprecated
	 */
	public OvhContainerDetail POST(String name, String region) throws IOException {
		String qPath = "/storage";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "region", region);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhContainerDetail.class);
	}

	/**
	 * Get details on your container
	 *
	 * REST: GET /storage/{name}
	 * @param name [required] Container name
	 * @param limit [required] Returns only *limit* objects
	 * @param start [required] Return objects with object name greater than *start*
	 * @param region [required] Container region
	 * @deprecated
	 */
	public OvhContainerDetail name_GET(String name, int limit, String region, String start) throws IOException {
		String qPath = "/storage/{name}";
		StringBuilder sb = path(qPath, name);
		query(sb, "limit", limit);
		query(sb, "region", region);
		query(sb, "start", start);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhContainerDetail.class);
	}

	/**
	 * Deploy your container files as a static web site
	 *
	 * REST: POST /storage/{name}/static
	 * @param name [required] Container name
	 * @param region [required] Container region
	 * @deprecated
	 */
	public OvhContainerDetail name_static_POST(String name, String region) throws IOException {
		String qPath = "/storage/{name}/static";
		StringBuilder sb = path(qPath, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "region", region);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhContainerDetail.class);
	}

	/**
	 * Add CORS support on your container
	 *
	 * REST: POST /storage/{name}/cors
	 * @param name [required] Container name
	 * @param region [required] Container region
	 * @param origin [required] Allow this origin
	 * @deprecated
	 */
	public void name_cors_POST(String name, String region, String origin) throws IOException {
		String qPath = "/storage/{name}/cors";
		StringBuilder sb = path(qPath, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "region", region);
		addBody(o, "origin", origin);
		exec(qPath, "POST", sb.toString(), o);
	}
}
