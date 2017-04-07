package net.minidev.ovh.api;

import java.io.IOException;
import net.minidev.ovh.api.api.OvhToken;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/token
 * version:1.0
 */
public class ApiOvhToken extends ApiOvhBase {
	public ApiOvhToken(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get valid token to use Openstack API
	 *
	 * REST: GET /token
	 * @param project_id [required]
	 * @deprecated
	 */
	public OvhToken GET(String project_id) throws IOException {
		String qPath = "/token";
		StringBuilder sb = path(qPath);
		query(sb, "project_id", project_id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhToken.class);
	}
}
