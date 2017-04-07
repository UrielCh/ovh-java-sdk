package net.minidev.ovh.api;

import java.io.IOException;
import java.util.HashMap;
import net.minidev.ovh.api.launch.OvhAccount;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/launch
 * version:1.0
 */
public class ApiOvhLaunch extends ApiOvhBase {
	public ApiOvhLaunch(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Create a new account
	 *
	 * REST: POST /launch
	 * @param email [required] Account email
	 * @param password [required] Account password
	 * @param code [required] Sponsor code
	 * @param applicationKey [required] Application key to log user with
	 * @deprecated
	 */
	public OvhAccount POST(String email, String password, String code, String applicationKey) throws IOException {
		String qPath = "/launch";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "password", password);
		addBody(o, "code", code);
		addBody(o, "applicationKey", applicationKey);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhAccount.class);
	}
}
