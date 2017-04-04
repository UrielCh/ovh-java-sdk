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
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/veeamCloudConnect
 * version:1.0
 */
public class ApiOvhVeeamCloudConnect extends ApiOvhBase {
	public ApiOvhVeeamCloudConnect(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /veeamCloudConnect/{serviceName}/serviceInfos
	 * @param serviceName [required] Domain of the service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /veeamCloudConnect/{serviceName}
	 * @param serviceName [required] Domain of the service
	 */
	public OvhAccount serviceName_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * List the possible upgrades on your Veeam Cloud Connect account
	 * 
	 * REST: GET /veeamCloudConnect/{serviceName}/orderableUpgrade
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhOffer> serviceName_orderableUpgrade_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/orderableUpgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhOffer>> t1 = new TypeReference<ArrayList<OvhOffer>>() {};

	/**
	 * Veeam Backup Repository linked to this Veeam Cloud Connect account
	 * 
	 * REST: GET /veeamCloudConnect/{serviceName}/backupRepository
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_backupRepository_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/backupRepository";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Add a new Backup Repository to your professional account
	 * 
	 * REST: POST /veeamCloudConnect/{serviceName}/backupRepository
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhTask> serviceName_backupRepository_POST(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/backupRepository";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhTask>> t3 = new TypeReference<ArrayList<OvhTask>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /veeamCloudConnect/{serviceName}/backupRepository/{inventoryName}
	 * @param serviceName [required] Domain of the service
	 * @param inventoryName [required] The inventory name of your backup repository
	 */
	public OvhBackupRepository serviceName_backupRepository_inventoryName_GET(String serviceName, String inventoryName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/backupRepository/{inventoryName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inventoryName}", inventoryName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inventoryName}", inventoryName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t3);
	}

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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inventoryName}", inventoryName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "newQuota", newQuota);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t3);
	}

	/**
	 * Show capabilities of your current offer
	 * 
	 * REST: GET /veeamCloudConnect/{serviceName}/capabilities
	 * @param serviceName [required] Domain of the service
	 */
	public OvhOfferCapabilities serviceName_capabilities_GET(String serviceName) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/capabilities";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOfferCapabilities.class);
	}

	/**
	 * Tasks associated with Cloud Tenant
	 * 
	 * REST: GET /veeamCloudConnect/{serviceName}/task
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/veeamCloudConnect/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /veeamCloudConnect
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/veeamCloudConnect";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
}
