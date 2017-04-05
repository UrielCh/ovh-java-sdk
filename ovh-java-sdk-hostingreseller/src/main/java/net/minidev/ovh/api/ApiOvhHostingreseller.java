package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.hosting.reseller.OvhProduct;
import net.minidev.ovh.api.reseller.OvhPleskLanguageTypeEnum;
import net.minidev.ovh.api.reseller.OvhSnapshot;
import net.minidev.ovh.api.reseller.OvhTask;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/hosting/reseller
 * version:1.0
 */
public class ApiOvhHostingreseller extends ApiOvhBase {
	public ApiOvhHostingreseller(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/reseller/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your reseller service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/reseller/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your reseller service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/reseller/{serviceName}
	 * @param serviceName [required] The internal name of your reseller service
	 */
	public OvhProduct serviceName_GET(String serviceName) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhProduct.class);
	}

	/**
	 * Restart instance
	 *
	 * REST: POST /hosting/reseller/{serviceName}/reboot
	 * @param serviceName [required] The internal name of your reseller service
	 * @param hard [required] Force a hard reboot
	 */
	public String serviceName_reboot_POST(String serviceName, Boolean hard) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/reboot";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "hard", hard);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Reinstall instance
	 *
	 * REST: POST /hosting/reseller/{serviceName}/reinstall
	 * @param serviceName [required] The internal name of your reseller service
	 */
	public String serviceName_reinstall_POST(String serviceName) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/reinstall";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Change language of the Plesk instance
	 *
	 * REST: POST /hosting/reseller/{serviceName}/language
	 * @param serviceName [required] The internal name of your reseller service
	 * @param language [required] Locale value
	 */
	public String serviceName_language_POST(String serviceName, OvhPleskLanguageTypeEnum language) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/language";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "language", language);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get reset instance password url
	 *
	 * REST: GET /hosting/reseller/{serviceName}/resetPasswordUrl
	 * @param serviceName [required] The internal name of your reseller service
	 */
	public String serviceName_resetPasswordUrl_GET(String serviceName) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/resetPasswordUrl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get list of tasks
	 *
	 * REST: GET /hosting/reseller/{serviceName}/task
	 * @param serviceName [required] The internal name of your reseller service
	 */
	public ArrayList<OvhTask> serviceName_task_GET(String serviceName) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhTask>> t1 = new TypeReference<ArrayList<OvhTask>>() {};

	/**
	 * Get task information given its id
	 *
	 * REST: GET /hosting/reseller/{serviceName}/task/{taskId}
	 * @param serviceName [required] The internal name of your reseller service
	 * @param taskId [required] Task id to retrieve
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, String taskId) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/task/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Set new reverse to ip
	 *
	 * REST: POST /hosting/reseller/{serviceName}/reverse
	 * @param serviceName [required] The internal name of your reseller service
	 * @param reverse [required] Domain to set the ip reverse
	 */
	public String serviceName_reverse_POST(String serviceName, String reverse) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/reverse";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reverse", reverse);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /hosting/reseller/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your reseller service
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Change user email
	 *
	 * REST: POST /hosting/reseller/{serviceName}/email
	 * @param serviceName [required] The internal name of your reseller service
	 * @param email [required] New email
	 */
	public String serviceName_email_POST(String serviceName, String email) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/email";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Detail of a snapshot
	 *
	 * REST: GET /hosting/reseller/{serviceName}/snapshot/{snapshotId}
	 * @param serviceName [required] The internal name of your reseller service
	 * @param snapshotId [required] Snapshot targeted
	 */
	public OvhSnapshot serviceName_snapshot_snapshotId_GET(String serviceName, String snapshotId) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/snapshot/{snapshotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{snapshotId}", snapshotId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSnapshot.class);
	}

	/**
	 * Restore a snapshot
	 *
	 * REST: POST /hosting/reseller/{serviceName}/snapshot/{snapshotId}/restore
	 * @param serviceName [required] The internal name of your reseller service
	 * @param snapshotId [required] Snapshot to restore
	 */
	public String serviceName_snapshot_snapshotId_restore_POST(String serviceName, String snapshotId) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/snapshot/{snapshotId}/restore";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{snapshotId}", snapshotId);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List instance's current snapshots
	 *
	 * REST: GET /hosting/reseller/{serviceName}/snapshot
	 * @param serviceName [required] The internal name of your reseller service
	 */
	public ArrayList<OvhSnapshot> serviceName_snapshot_GET(String serviceName) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhSnapshot>> t3 = new TypeReference<ArrayList<OvhSnapshot>>() {};

	/**
	 * Make manual snapshot
	 *
	 * REST: POST /hosting/reseller/{serviceName}/snapshot
	 * @param serviceName [required] The internal name of your reseller service
	 */
	public String serviceName_snapshot_POST(String serviceName) throws IOException {
		String qPath = "/hosting/reseller/{serviceName}/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /hosting/reseller
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/hosting/reseller";
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<String>> t4 = new TypeReference<ArrayList<String>>() {};
}
