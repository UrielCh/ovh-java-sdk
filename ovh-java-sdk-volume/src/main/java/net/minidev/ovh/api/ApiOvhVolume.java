package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.volume.OvhVolume;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/volume
 * version:1.0
 */
public class ApiOvhVolume extends ApiOvhBase {
	public ApiOvhVolume(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Delete a volume
	 *
	 * REST: DELETE /volume/{volumeId}
	 * @param volumeId [required] Volume id
	 * @deprecated
	 */
	public void volumeId_DELETE(String volumeId) throws IOException {
		String qPath = "/volume/{volumeId}";
		StringBuilder sb = path(qPath, volumeId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get details on your volume
	 *
	 * REST: GET /volume/{volumeId}
	 * @param volumeId [required] Volume id
	 * @deprecated
	 */
	public OvhVolume volumeId_GET(String volumeId) throws IOException {
		String qPath = "/volume/{volumeId}";
		StringBuilder sb = path(qPath, volumeId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Get all your volume
	 *
	 * REST: GET /volume
	 * @param region [required] Volume region
	 * @deprecated
	 */
	public ArrayList<OvhVolume> GET(String region) throws IOException {
		String qPath = "/volume";
		StringBuilder sb = path(qPath);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhVolume>> t1 = new TypeReference<ArrayList<OvhVolume>>() {};

	/**
	 * Create a new volume
	 *
	 * REST: POST /volume
	 * @param size [required] Volume size (in GiB)
	 * @param name [required] Volume name
	 * @param description [required] Volume description
	 * @param type [required] Volume type (classic or high-speed)
	 * @param region [required] Volume region
	 * @deprecated
	 */
	public OvhVolume POST(int size, String name, String description, String type, String region) throws IOException {
		String qPath = "/volume";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "size", size);
		addBody(o, "name", name);
		addBody(o, "description", description);
		addBody(o, "type", type);
		addBody(o, "region", region);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Attach a volume to an instance
	 *
	 * REST: POST /volume/{volumeId}/attach
	 * @param volumeId [required] Volume id
	 * @param instanceId [required] Instance id
	 * @deprecated
	 */
	public OvhVolume volumeId_attach_POST(String volumeId, String instanceId) throws IOException {
		String qPath = "/volume/{volumeId}/attach";
		StringBuilder sb = path(qPath, volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceId", instanceId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Detach a volume from an instance
	 *
	 * REST: POST /volume/{volumeId}/detach
	 * @param volumeId [required] Volume id
	 * @param instanceId [required] Instance id
	 * @deprecated
	 */
	public OvhVolume volumeId_detach_POST(String volumeId, String instanceId) throws IOException {
		String qPath = "/volume/{volumeId}/detach";
		StringBuilder sb = path(qPath, volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceId", instanceId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVolume.class);
	}
}
