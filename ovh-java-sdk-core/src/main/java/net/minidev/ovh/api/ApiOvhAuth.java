package net.minidev.ovh.api;

import java.io.IOException;
import java.util.HashMap;
import net.minidev.ovh.api.api.OvhCredential;
import net.minidev.ovh.api.auth.OvhAccessRule;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/auth
 * version:1.0
 */
public class ApiOvhAuth extends ApiOvhBase {
	public ApiOvhAuth(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get the current credential details
	 *
	 * REST: GET /auth/currentCredential
	 */
	public OvhCredential currentCredential_GET() throws IOException {
		String qPath = "/auth/currentCredential";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCredential.class);
	}

	/**
	 * Expire current credential
	 *
	 * REST: POST /auth/logout
	 */
	public void logout_POST() throws IOException {
		String qPath = "/auth/logout";
		StringBuilder sb = path(qPath);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Request a new credential for your application
	 *
	 * REST: POST /auth/credential
	 * @param accessRules [required] Access required for your application
	 * @param redirection [required] Where you want to redirect the user after sucessfull authentication
	 */
	public net.minidev.ovh.api.auth.OvhCredential credential_POST(OvhAccessRule[] accessRules, String redirection) throws IOException {
		String qPath = "/auth/credential";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accessRules", accessRules);
		addBody(o, "redirection", redirection);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.auth.OvhCredential.class);
	}

	/**
	 * Get the current time of the OVH servers, since UNIX epoch
	 *
	 * REST: GET /auth/time
	 */
	public Long time_GET() throws IOException {
		String qPath = "/auth/time";
		StringBuilder sb = path(qPath);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Long.class);
	}
}
