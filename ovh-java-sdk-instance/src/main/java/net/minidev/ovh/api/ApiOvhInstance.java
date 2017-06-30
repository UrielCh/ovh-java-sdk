package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.instance.OvhInstance;
import net.minidev.ovh.api.instance.OvhInstanceDetail;
import net.minidev.ovh.api.instance.OvhInstanceVNC;
import net.minidev.ovh.api.instance.OvhQuota;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/instance
 * version:1.0
 */
public class ApiOvhInstance extends ApiOvhBase {
	public ApiOvhInstance(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get all your instance
	 *
	 * REST: GET /instance
	 * @param region [required] Instance region
	 * @deprecated
	 */
	public ArrayList<OvhInstance> GET(String region) throws IOException {
		String qPath = "/instance";
		StringBuilder sb = path(qPath);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhInstance>> t1 = new TypeReference<ArrayList<OvhInstance>>() {};

	/**
	 * Create a new instance
	 *
	 * REST: POST /instance
	 * @param flavorId [required] Instance flavor id
	 * @param imageId [required] Instance image id
	 * @param name [required] Instance name
	 * @param region [required] Instance region
	 * @param sshKeyName [required] SSH keypair name
	 * @deprecated
	 */
	public OvhInstanceDetail POST(String flavorId, String imageId, String name, String region, String sshKeyName) throws IOException {
		String qPath = "/instance";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flavorId", flavorId);
		addBody(o, "imageId", imageId);
		addBody(o, "name", name);
		addBody(o, "region", region);
		addBody(o, "sshKeyName", sshKeyName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Get allowed quotas
	 *
	 * REST: GET /instance/quota
	 * @param region [required] Quota region
	 * @deprecated
	 */
	public OvhQuota quota_GET(String region) throws IOException {
		String qPath = "/instance/quota";
		StringBuilder sb = path(qPath);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhQuota.class);
	}

	/**
	 * Get details on your instance
	 *
	 * REST: GET /instance/{instanceId}
	 * @param instanceId [required] Instance id
	 * @deprecated
	 */
	public OvhInstanceDetail instanceId_GET(String instanceId) throws IOException {
		String qPath = "/instance/{instanceId}";
		StringBuilder sb = path(qPath, instanceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Delete an instance
	 *
	 * REST: DELETE /instance/{instanceId}
	 * @param instanceId [required] Instance id
	 * @deprecated
	 */
	public void instanceId_DELETE(String instanceId) throws IOException {
		String qPath = "/instance/{instanceId}";
		StringBuilder sb = path(qPath, instanceId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Alter an instance
	 *
	 * REST: PUT /instance/{instanceId}
	 * @param instanceId [required] Instance id
	 * @param name [required] New instance name
	 * @deprecated
	 */
	public void instanceId_PUT(String instanceId, String name) throws IOException {
		String qPath = "/instance/{instanceId}";
		StringBuilder sb = path(qPath, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		exec(qPath, "PUT", sb.toString(), o);
	}

	/**
	 * Get VNC access to your instance
	 *
	 * REST: GET /instance/{instanceId}/vnc
	 * @param instanceId [required] Instance id
	 * @deprecated
	 */
	public OvhInstanceVNC instanceId_vnc_GET(String instanceId) throws IOException {
		String qPath = "/instance/{instanceId}/vnc";
		StringBuilder sb = path(qPath, instanceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceVNC.class);
	}
}
