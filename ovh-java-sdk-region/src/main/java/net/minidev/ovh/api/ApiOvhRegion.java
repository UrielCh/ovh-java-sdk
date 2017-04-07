package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/region
 * version:1.0
 */
public class ApiOvhRegion extends ApiOvhBase {
	public ApiOvhRegion(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get all available regions
	 *
	 * REST: GET /region
	 * @deprecated
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/region";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};
}
