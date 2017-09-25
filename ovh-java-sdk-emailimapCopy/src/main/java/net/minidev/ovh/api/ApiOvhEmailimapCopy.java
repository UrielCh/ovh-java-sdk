package net.minidev.ovh.api;

import java.io.IOException;
import java.util.HashMap;
import net.minidev.ovh.api.imapcopy.OvhStructImapCopy;
import net.minidev.ovh.api.imapcopy.OvhTask;
import net.minidev.ovh.api.imapcopy.OvhTaskIds;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/email/imapCopy
 * version:1.0
 */
public class ApiOvhEmailimapCopy extends ApiOvhBase {
	public ApiOvhEmailimapCopy(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Copy messages between two mailboxes
	 *
	 * REST: POST /email/imapCopy
	 * @param to [required] Where you want to put messages
	 * @param from [required] Where you have messages
	 * @deprecated
	 */
	public OvhTaskIds POST(OvhStructImapCopy to, OvhStructImapCopy from) throws IOException {
		String qPath = "/email/imapCopy";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "to", to);
		addBody(o, "from", from);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTaskIds.class);
	}

	/**
	 * get information of task
	 *
	 * REST: GET /email/imapCopy/task
	 * @param id [required] Id of task
	 * @param secretKey [required] Secret key of task
	 * @deprecated
	 */
	public OvhTask task_GET(Long id, String secretKey) throws IOException {
		String qPath = "/email/imapCopy/task";
		StringBuilder sb = path(qPath);
		query(sb, "id", id);
		query(sb, "secretKey", secretKey);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}
}
