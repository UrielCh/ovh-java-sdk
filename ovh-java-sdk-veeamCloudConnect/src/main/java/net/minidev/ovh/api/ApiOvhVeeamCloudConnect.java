package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.veeamcloudconnect.OvhAccount;
import net.minidev.ovh.api.veeamcloudconnect.OvhBackupRepository;
import net.minidev.ovh.api.veeamcloudconnect.OvhOffer;
import net.minidev.ovh.api.veeamcloudconnect.OvhOfferCapabilities;
import net.minidev.ovh.api.veeamcloudconnect.OvhTask;
import net.minidev.ovh.api.veeamcloudconnect.OvhTaskStateEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/veeamCloudConnect
 * version:1.0
 */
public class ApiOvhVeeamCloudConnect extends ApiOvhBase {
	public ApiOvhVeeamCloudConnect(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List the possible upgrades on your Veeam Cloud Connect account
	 *
	 * REST: GET /veeamCloudConnect/{serviceName}/orderableUpgrade
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhOffer> serviceName_orderableUpgrade_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/orderableUpgrade";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhOffer>> t1 = new TypeReference<ArrayList<OvhOffer>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /veeamCloudConnect/{serviceName}/serviceInfos
	 * @param serviceName [required] Domain of the service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /veeamCloudConnect/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Domain of the service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /veeamCloudConnect/{serviceName}
	 * @param serviceName [required] Domain of the service
	 */
	public OvhAccount serviceName_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /veeamCloudConnect/{serviceName}/backupRepository/{inventoryName}
	 * @param serviceName [required] Domain of the service
	 * @param inventoryName [required] The inventory name of your backup repository
	 */
	public OvhBackupRepository serviceName_backupRepository_inventoryName_GET(String serviceName, String inventoryName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/backupRepository/{inventoryName}";
		StringBuilder sb = path(qPath, serviceName, inventoryName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupRepository.class);
	}

	/**
	 * Delete this backup Repository.
	 *
	 * REST: DELETE /veeamCloudConnect/{serviceName}/backupRepository/{inventoryName}
	 * @param serviceName [required] Domain of the service
	 * @param inventoryName [required] The inventory name of your backup repository
	 */
	public ArrayList<OvhTask> serviceName_backupRepository_inventoryName_DELETE(String serviceName, String inventoryName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/backupRepository/{inventoryName}";
		StringBuilder sb = path(qPath, serviceName, inventoryName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhTask>> t2 = new TypeReference<ArrayList<OvhTask>>() {};

	/**
	 * Change your quota
	 *
	 * REST: POST /veeamCloudConnect/{serviceName}/backupRepository/{inventoryName}/upgradeQuota
	 * @param newQuota [required] my new quota in GB
	 * @param serviceName [required] Domain of the service
	 * @param inventoryName [required] The inventory name of your backup repository
	 */
	public ArrayList<OvhTask> serviceName_backupRepository_inventoryName_upgradeQuota_POST(String serviceName, String inventoryName, Long newQuota) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/backupRepository/{inventoryName}/upgradeQuota";
		StringBuilder sb = path(qPath, serviceName, inventoryName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "newQuota", newQuota);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}

	/**
	 * Veeam Backup Repository linked to this Veeam Cloud Connect account
	 *
	 * REST: GET /veeamCloudConnect/{serviceName}/backupRepository
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_backupRepository_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/backupRepository";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Add a new Backup Repository to your professional account
	 *
	 * REST: POST /veeamCloudConnect/{serviceName}/backupRepository
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhTask> serviceName_backupRepository_POST(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/backupRepository";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Show capabilities of your current offer
	 *
	 * REST: GET /veeamCloudConnect/{serviceName}/capabilities
	 * @param serviceName [required] Domain of the service
	 */
	public OvhOfferCapabilities serviceName_capabilities_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/capabilities";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfferCapabilities.class);
	}

	/**
	 * Tasks associated with Cloud Tenant
	 *
	 * REST: GET /veeamCloudConnect/{serviceName}/task
	 * @param state [required] Filter the value of state property (=)
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<Long>> t4 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /veeamCloudConnect/{serviceName}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param taskId [required]
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /veeamCloudConnect
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/veeamCloudConnect";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
}
