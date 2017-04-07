package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.flavor.OvhFlavor;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/flavor
 * version:1.0
 */
public class ApiOvhFlavor extends ApiOvhBase {
	public ApiOvhFlavor(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get all possible flavor
	 *
	 * REST: GET /flavor
	 * @param region [required] Flavor region
	 * @deprecated
	 */
	public ArrayList<OvhFlavor> GET(String region) throws IOException {
		String qPath = "/flavor";
		StringBuilder sb = path(qPath);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhFlavor>> t1 = new TypeReference<ArrayList<OvhFlavor>>() {};

	/**
	 * Get details on a flavor
	 *
	 * REST: GET /flavor/{flavorId}
	 * @param flavorId [required] Flavor id
	 * @deprecated
	 */
	public OvhFlavor flavorId_GET(String flavorId) throws IOException {
		String qPath = "/flavor/{flavorId}";
		StringBuilder sb = path(qPath, flavorId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFlavor.class);
	}
}
