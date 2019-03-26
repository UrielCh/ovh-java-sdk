package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.freefax.OvhBalanceInformations;
import net.minidev.ovh.api.freefax.OvhFreefaxProperties;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.telephony.OvhVoicefaxRoutingEnum;
import net.minidev.ovh.api.telephony.OvhVoicemailNumbers;
import net.minidev.ovh.api.telephony.OvhVoicemailProperties;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/freefax
 * version:1.0
 */
public class ApiOvhFreefax extends ApiOvhBase {
	public ApiOvhFreefax(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /freefax/{serviceName}
	 * @param serviceName [required] Freefax number
	 */
	public OvhFreefaxProperties serviceName_GET(String serviceName) throws IOException {
		String qPath = "/freefax/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFreefaxProperties.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /freefax/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] Freefax number
	 */
	public void serviceName_PUT(String serviceName, OvhFreefaxProperties body) throws IOException {
		String qPath = "/freefax/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get the status of the voicemail. Available only if the line has fax capabilities
	 *
	 * REST: GET /freefax/{serviceName}/voicemail/routing
	 * @param serviceName [required] Freefax number
	 */
	public OvhVoicefaxRoutingEnum serviceName_voicemail_routing_GET(String serviceName) throws IOException {
		String qPath = "/freefax/{serviceName}/voicemail/routing";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoicefaxRoutingEnum.class);
	}

	/**
	 * Get number for internal and external voicemail
	 *
	 * REST: GET /freefax/{serviceName}/voicemail/voicemailNumbers
	 * @param serviceName [required] Freefax number
	 */
	public OvhVoicemailNumbers serviceName_voicemail_voicemailNumbers_GET(String serviceName) throws IOException {
		String qPath = "/freefax/{serviceName}/voicemail/voicemailNumbers";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoicemailNumbers.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /freefax/{serviceName}/voicemail
	 * @param serviceName [required] Freefax number
	 */
	public OvhVoicemailProperties serviceName_voicemail_GET(String serviceName) throws IOException {
		String qPath = "/freefax/{serviceName}/voicemail";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoicemailProperties.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /freefax/{serviceName}/voicemail
	 * @param body [required] New object properties
	 * @param serviceName [required] Freefax number
	 */
	public void serviceName_voicemail_PUT(String serviceName, OvhVoicemailProperties body) throws IOException {
		String qPath = "/freefax/{serviceName}/voicemail";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Change the voicemail password. It must be 4 digit
	 *
	 * REST: POST /freefax/{serviceName}/voicemail/changePassword
	 * @param password [required] The password
	 * @param serviceName [required] Freefax number
	 */
	public void serviceName_voicemail_changePassword_POST(String serviceName, String password) throws IOException {
		String qPath = "/freefax/{serviceName}/voicemail/changePassword";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Disable/Enable voicemail. Available only if the line has fax capabilities
	 *
	 * REST: POST /freefax/{serviceName}/voicemail/changeRouting
	 * @param routing [required] Activate or Desactivate voicemail on the line
	 * @param serviceName [required] Freefax number
	 */
	public void serviceName_voicemail_changeRouting_POST(String serviceName, OvhVoicefaxRoutingEnum routing) throws IOException {
		String qPath = "/freefax/{serviceName}/voicemail/changeRouting";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "routing", routing);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Generates a new password for your fax account
	 *
	 * REST: POST /freefax/{serviceName}/changePassword
	 * @param serviceName [required] Freefax number
	 */
	public String serviceName_changePassword_POST(String serviceName) throws IOException {
		String qPath = "/freefax/{serviceName}/changePassword";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Main service attached to freefax
	 *
	 * REST: GET /freefax/{serviceName}/mainService
	 * @param serviceName [required] Freefax number
	 */
	public String serviceName_mainService_GET(String serviceName) throws IOException {
		String qPath = "/freefax/{serviceName}/mainService";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /freefax/{serviceName}/serviceInfos
	 * @param serviceName [required] Freefax number
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/freefax/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /freefax/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Freefax number
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/freefax/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * List available services
	 *
	 * REST: GET /freefax
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/freefax";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get the credit balance and the remaining pages available for all our freefax
	 *
	 * REST: GET /freefax/credits
	 */
	public OvhBalanceInformations credits_GET() throws IOException {
		String qPath = "/freefax/credits";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBalanceInformations.class);
	}
}
