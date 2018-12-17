package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhSafeKeyValue;
import net.minidev.ovh.api.contact.OvhFormCharacteristic;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/contact
 * version:1.0
 */
public class ApiOvhContact extends ApiOvhBase {
	public ApiOvhContact(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Send form following characteristics of /contact/form
	 *
	 * REST: POST /contact/form/send
	 * @param form [required] Form informations
	 * @param type [required] Form type
	 */
	public void form_send_POST(OvhSafeKeyValue<String>[] form, String type) throws IOException {
		String qPath = "/contact/form/send";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "form", form);
		addBody(o, "type", type);
		execN(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get form characteristics
	 *
	 * REST: GET /contact/form
	 */
	public ArrayList<OvhFormCharacteristic> form_GET() throws IOException {
		String qPath = "/contact/form";
		StringBuilder sb = path(qPath);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhFormCharacteristic>> t1 = new TypeReference<ArrayList<OvhFormCharacteristic>>() {};
}
