package net.minidev.ovh.api;

import java.io.IOException;
import java.util.HashMap;
import net.minidev.ovh.api.secret.OvhSecret;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/secret
 * version:1.0
 */
public class ApiOvhSecret extends ApiOvhBase {
	public ApiOvhSecret(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Retrieve a secret sent by email
	 *
	 * REST: POST /secret/retrieve
	 * @param id [required] The secret ID
	 */
	public OvhSecret retrieve_POST(String id) throws IOException {
		String qPath = "/secret/retrieve";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "id", id);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhSecret.class);
	}
}
