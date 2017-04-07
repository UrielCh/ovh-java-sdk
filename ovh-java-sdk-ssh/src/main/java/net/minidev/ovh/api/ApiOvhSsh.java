package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.ssh.OvhSSHKeyPair;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/ssh
 * version:1.0
 */
public class ApiOvhSsh extends ApiOvhBase {
	public ApiOvhSsh(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Delete this SSH keypair
	 *
	 * REST: DELETE /ssh/{name}
	 * @param name [required] SSH keypair name
	 * @param region [required] SSH keypair region
	 * @deprecated
	 */
	public void name_DELETE(String name, String region) throws IOException {
		String qPath = "/ssh/{name}";
		StringBuilder sb = path(qPath, name);
		query(sb, "region", region);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get one of your SSH keypair
	 *
	 * REST: GET /ssh/{name}
	 * @param name [required] SSH keypair name
	 * @param region [required] SSH keypair region
	 * @deprecated
	 */
	public OvhSSHKeyPair name_GET(String name, String region) throws IOException {
		String qPath = "/ssh/{name}";
		StringBuilder sb = path(qPath, name);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSSHKeyPair.class);
	}

	/**
	 * Get all registered SSH keypairs
	 *
	 * REST: GET /ssh
	 * @param region [required] Keypair region
	 * @deprecated
	 */
	public ArrayList<OvhSSHKeyPair> GET(String region) throws IOException {
		String qPath = "/ssh";
		StringBuilder sb = path(qPath);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhSSHKeyPair>> t1 = new TypeReference<ArrayList<OvhSSHKeyPair>>() {};

	/**
	 * Create a new SSH keypair
	 *
	 * REST: POST /ssh
	 * @param publicKey [required] SSH public key
	 * @param name [required] SSH keypair name
	 * @param region [required] Region to create keypair
	 * @deprecated
	 */
	public OvhSSHKeyPair POST(String publicKey, String name, String region) throws IOException {
		String qPath = "/ssh";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "publicKey", publicKey);
		addBody(o, "name", name);
		addBody(o, "region", region);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhSSHKeyPair.class);
	}
}
