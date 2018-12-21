package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.cloud.OvhAcl;
import net.minidev.ovh.api.cloud.OvhAclTypeEnum;
import net.minidev.ovh.api.cloud.OvhAlerting;
import net.minidev.ovh.api.cloud.OvhAlertingAlert;
import net.minidev.ovh.api.cloud.OvhAlertingDelayEnum;
import net.minidev.ovh.api.cloud.OvhBackup;
import net.minidev.ovh.api.cloud.OvhCredit;
import net.minidev.ovh.api.cloud.OvhIPLoadbalancing;
import net.minidev.ovh.api.cloud.OvhPrice;
import net.minidev.ovh.api.cloud.OvhProject;
import net.minidev.ovh.api.cloud.OvhRegion;
import net.minidev.ovh.api.cloud.OvhVrack;
import net.minidev.ovh.api.cloud.authentication.OvhToken;
import net.minidev.ovh.api.cloud.flavor.OvhFlavor;
import net.minidev.ovh.api.cloud.forecast.OvhProjectForecast;
import net.minidev.ovh.api.cloud.image.OvhImage;
import net.minidev.ovh.api.cloud.image.OvhOSTypeEnum;
import net.minidev.ovh.api.cloud.instance.OvhApplicationAccess;
import net.minidev.ovh.api.cloud.instance.OvhInstance;
import net.minidev.ovh.api.cloud.instance.OvhInstanceDetail;
import net.minidev.ovh.api.cloud.instance.OvhInstanceMetrics;
import net.minidev.ovh.api.cloud.instance.OvhInstanceVnc;
import net.minidev.ovh.api.cloud.instance.OvhMetricsPeriod;
import net.minidev.ovh.api.cloud.instance.OvhMetricsType;
import net.minidev.ovh.api.cloud.instance.OvhNetworkBulkParams;
import net.minidev.ovh.api.cloud.instance.OvhNetworkParams;
import net.minidev.ovh.api.cloud.instance.OvhRebootTypeEnum;
import net.minidev.ovh.api.cloud.instance.OvhRescueAdminPassword;
import net.minidev.ovh.api.cloud.instancegroup.OvhInstanceGroup;
import net.minidev.ovh.api.cloud.instancegroup.OvhInstanceGroupTypeEnum;
import net.minidev.ovh.api.cloud.instanceinterface.OvhInterface;
import net.minidev.ovh.api.cloud.ip.OvhCloudIp;
import net.minidev.ovh.api.cloud.ip.OvhFailoverIp;
import net.minidev.ovh.api.cloud.migration.OvhMigration;
import net.minidev.ovh.api.cloud.network.OvhNetwork;
import net.minidev.ovh.api.cloud.network.OvhSubnet;
import net.minidev.ovh.api.cloud.order.OvhOrder;
import net.minidev.ovh.api.cloud.pca.OvhFunctionTypeEnum;
import net.minidev.ovh.api.cloud.pca.OvhTaskStateEnum;
import net.minidev.ovh.api.cloud.pca.OvhTaskTypeEnum;
import net.minidev.ovh.api.cloud.project.OvhBill;
import net.minidev.ovh.api.cloud.project.OvhNewProject;
import net.minidev.ovh.api.cloud.project.OvhNewProjectInfo;
import net.minidev.ovh.api.cloud.project.OvhProjectUsage;
import net.minidev.ovh.api.cloud.quota.OvhQuotas;
import net.minidev.ovh.api.cloud.sshkey.OvhSshKey;
import net.minidev.ovh.api.cloud.sshkey.OvhSshKeyDetail;
import net.minidev.ovh.api.cloud.stack.OvhStack;
import net.minidev.ovh.api.cloud.storage.OvhContainer;
import net.minidev.ovh.api.cloud.storage.OvhContainerAccess;
import net.minidev.ovh.api.cloud.storage.OvhContainerDetail;
import net.minidev.ovh.api.cloud.storage.OvhContainerObjectTempURL;
import net.minidev.ovh.api.cloud.storage.OvhRightEnum;
import net.minidev.ovh.api.cloud.storage.OvhTypeEnum;
import net.minidev.ovh.api.cloud.usage.OvhUsageCurrent;
import net.minidev.ovh.api.cloud.usage.OvhUsageForecast;
import net.minidev.ovh.api.cloud.usage.OvhUsageHistory;
import net.minidev.ovh.api.cloud.usage.OvhUsageHistoryDetail;
import net.minidev.ovh.api.cloud.user.OvhOpenrc;
import net.minidev.ovh.api.cloud.user.OvhOpenrcVersionEnum;
import net.minidev.ovh.api.cloud.user.OvhRclone;
import net.minidev.ovh.api.cloud.user.OvhRoleEnum;
import net.minidev.ovh.api.cloud.user.OvhUser;
import net.minidev.ovh.api.cloud.user.OvhUserDetail;
import net.minidev.ovh.api.cloud.volume.OvhSnapshot;
import net.minidev.ovh.api.cloud.volume.OvhVolume;
import net.minidev.ovh.api.cloud.volume.OvhVolumeTypeEnum;
import net.minidev.ovh.api.nichandle.OvhOvhSubsidiaryEnum;
import net.minidev.ovh.api.pca.OvhAccount;
import net.minidev.ovh.api.pca.OvhBilling;
import net.minidev.ovh.api.pca.OvhFile;
import net.minidev.ovh.api.pca.OvhSession;
import net.minidev.ovh.api.pca.OvhTask;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/cloud
 * version:1.0
 */
public class ApiOvhCloud extends ApiOvhBase {
	public ApiOvhCloud(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get all cloud pending orders
	 *
	 * REST: GET /cloud/order
	 * @param planCode [required] Order plan code
	 *
	 * API beta
	 */
	public ArrayList<OvhOrder> order_GET(String planCode) throws IOException {
		String qPath = "/cloud/order";
		StringBuilder sb = path(qPath);
		query(sb, "planCode", planCode);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhOrder>> t1 = new TypeReference<ArrayList<OvhOrder>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /cloud/{serviceName}/pca
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @deprecated
	 */
	public ArrayList<String> serviceName_pca_GET(String serviceName) throws IOException {
		String qPath = "/cloud/{serviceName}/pca";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * cloud Archives billing items
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/billing
	 * @param billed [required] Filter the value of billed property (=)
	 * @param date_from [required] Filter the value of date property (>=)
	 * @param date_to [required] Filter the value of date property (<=)
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @deprecated
	 */
	public ArrayList<Long> serviceName_pca_pcaServiceName_billing_GET(String serviceName, String pcaServiceName, Boolean billed, Date date_from, Date date_to) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/billing";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName);
		query(sb, "billed", billed);
		query(sb, "date.from", date_from);
		query(sb, "date.to", date_to);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/billing/{billingId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param billingId [required] Billing id
	 * @deprecated
	 */
	public OvhBilling serviceName_pca_pcaServiceName_billing_billingId_GET(String serviceName, String pcaServiceName, Long billingId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/billing/{billingId}";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName, billingId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBilling.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param taskId [required] Task ID
	 * @deprecated
	 */
	public OvhTask serviceName_pca_pcaServiceName_tasks_taskId_GET(String serviceName, String pcaServiceName, String taskId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * cloud archives tasks for account
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/tasks
	 * @param function [required] Filter the value of function property (=)
	 * @param todoDate_to [required] Filter the value of todoDate property (<=)
	 * @param todoDate_from [required] Filter the value of todoDate property (>=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @deprecated
	 */
	public ArrayList<String> serviceName_pca_pcaServiceName_tasks_GET(String serviceName, String pcaServiceName, OvhFunctionTypeEnum function, OvhTaskStateEnum status, Date todoDate_from, Date todoDate_to) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/tasks";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName);
		query(sb, "function", function);
		query(sb, "status", status);
		query(sb, "todoDate.from", todoDate_from);
		query(sb, "todoDate.to", todoDate_to);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create a cloud archives task
	 *
	 * REST: POST /cloud/{serviceName}/pca/{pcaServiceName}/tasks
	 * @param taskFunction [required] cloud archives task type
	 * @param sessionId [required] cloud archives session identifier
	 * @param fileIds [required] cloud archives file identifiers
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @deprecated
	 */
	public OvhTask serviceName_pca_pcaServiceName_tasks_POST(String serviceName, String pcaServiceName, String[] fileIds, String sessionId, OvhTaskTypeEnum taskFunction) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/tasks";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "fileIds", fileIds);
		addBody(o, "sessionId", sessionId);
		addBody(o, "taskFunction", taskFunction);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/serviceInfos
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @deprecated
	 */
	public OvhService serviceName_pca_pcaServiceName_serviceInfos_GET(String serviceName, String pcaServiceName) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cloud/{serviceName}/pca/{pcaServiceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @deprecated
	 */
	public void serviceName_pca_pcaServiceName_serviceInfos_PUT(String serviceName, String pcaServiceName, OvhService body) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @deprecated
	 */
	public OvhAccount serviceName_pca_pcaServiceName_GET(String serviceName, String pcaServiceName) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cloud/{serviceName}/pca/{pcaServiceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @deprecated
	 */
	public void serviceName_pca_pcaServiceName_PUT(String serviceName, String pcaServiceName, OvhAccount body) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * cloud archives sessions for account
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/sessions
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @deprecated
	 */
	public ArrayList<String> serviceName_pca_pcaServiceName_sessions_GET(String serviceName, String pcaServiceName, String name) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName);
		query(sb, "name", name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create a restore task for session
	 *
	 * REST: POST /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/restore
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 * @deprecated
	 */
	public OvhTask serviceName_pca_pcaServiceName_sessions_sessionId_restore_POST(String serviceName, String pcaServiceName, String sessionId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/restore";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName, sessionId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 * @deprecated
	 */
	public OvhSession serviceName_pca_pcaServiceName_sessions_sessionId_GET(String serviceName, String pcaServiceName, String sessionId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName, sessionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSession.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 * @deprecated
	 */
	public void serviceName_pca_pcaServiceName_sessions_sessionId_PUT(String serviceName, String pcaServiceName, String sessionId, OvhSession body) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName, sessionId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Create a delete task for all files in session
	 *
	 * REST: DELETE /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 * @deprecated
	 */
	public OvhTask serviceName_pca_pcaServiceName_sessions_sessionId_DELETE(String serviceName, String pcaServiceName, String sessionId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName, sessionId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * cloud archives files in session
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/files
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 * @deprecated
	 */
	public ArrayList<String> serviceName_pca_pcaServiceName_sessions_sessionId_files_GET(String serviceName, String pcaServiceName, String sessionId, String name) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/files";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName, sessionId);
		query(sb, "name", name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/files/{fileId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 * @param fileId [required] File id
	 * @deprecated
	 */
	public OvhFile serviceName_pca_pcaServiceName_sessions_sessionId_files_fileId_GET(String serviceName, String pcaServiceName, String sessionId, String fileId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/files/{fileId}";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName, sessionId, fileId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFile.class);
	}

	/**
	 * View account current total sessions usage (bytes)
	 *
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/usage
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @deprecated
	 */
	public Long serviceName_pca_pcaServiceName_usage_GET(String serviceName, String pcaServiceName) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/usage";
		StringBuilder sb = path(qPath, serviceName, pcaServiceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Long.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /cloud
	 * @deprecated
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/cloud";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get volumes
	 *
	 * REST: GET /cloud/project/{serviceName}/volume
	 * @param region [required] Volume region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhVolume> project_serviceName_volume_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhVolume>> t4 = new TypeReference<ArrayList<OvhVolume>>() {};

	/**
	 * Create a volume
	 *
	 * REST: POST /cloud/project/{serviceName}/volume
	 * @param description [required] Volume description
	 * @param imageId [required] Id of image to create a bootable volume
	 * @param name [required] Volume name
	 * @param region [required] Volume region
	 * @param serviceName [required] Project id
	 * @param size [required] Volume size (in GiB)
	 * @param snapshotId [required] Source snapshot id
	 * @param type [required] Volume type
	 */
	public OvhVolume project_serviceName_volume_POST(String serviceName, String description, String imageId, String name, String region, Long size, String snapshotId, OvhVolumeTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "imageId", imageId);
		addBody(o, "name", name);
		addBody(o, "region", region);
		addBody(o, "size", size);
		addBody(o, "snapshotId", snapshotId);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Delete a volume snapshot
	 *
	 * REST: DELETE /cloud/project/{serviceName}/volume/snapshot/{snapshotId}
	 * @param serviceName [required] Project id
	 * @param snapshotId [required] Snapshot id
	 */
	public void project_serviceName_volume_snapshot_snapshotId_DELETE(String serviceName, String snapshotId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/snapshot/{snapshotId}";
		StringBuilder sb = path(qPath, serviceName, snapshotId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get volume snapshot details
	 *
	 * REST: GET /cloud/project/{serviceName}/volume/snapshot/{snapshotId}
	 * @param serviceName [required] Project id
	 * @param snapshotId [required] Snapshot id
	 */
	public OvhSnapshot project_serviceName_volume_snapshot_snapshotId_GET(String serviceName, String snapshotId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/snapshot/{snapshotId}";
		StringBuilder sb = path(qPath, serviceName, snapshotId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSnapshot.class);
	}

	/**
	 * Get volume snapshots
	 *
	 * REST: GET /cloud/project/{serviceName}/volume/snapshot
	 * @param region [required] Snapshots region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhSnapshot> project_serviceName_volume_snapshot_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/snapshot";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhSnapshot>> t5 = new TypeReference<ArrayList<OvhSnapshot>>() {};

	/**
	 * Attach a volume on an instance
	 *
	 * REST: POST /cloud/project/{serviceName}/volume/{volumeId}/attach
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_attach_POST(String serviceName, String volumeId, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}/attach";
		StringBuilder sb = path(qPath, serviceName, volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceId", instanceId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Detach a volume from an instance
	 *
	 * REST: POST /cloud/project/{serviceName}/volume/{volumeId}/detach
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_detach_POST(String serviceName, String volumeId, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}/detach";
		StringBuilder sb = path(qPath, serviceName, volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceId", instanceId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Extend a volume
	 *
	 * REST: POST /cloud/project/{serviceName}/volume/{volumeId}/upsize
	 * @param serviceName [required] Service name
	 * @param size [required] New volume size (in GiB) (must be greater than current one)
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_upsize_POST(String serviceName, String volumeId, Long size) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}/upsize";
		StringBuilder sb = path(qPath, serviceName, volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "size", size);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Delete a volume
	 *
	 * REST: DELETE /cloud/project/{serviceName}/volume/{volumeId}
	 * @param serviceName [required] Project id
	 * @param volumeId [required] Volume id
	 */
	public void project_serviceName_volume_volumeId_DELETE(String serviceName, String volumeId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}";
		StringBuilder sb = path(qPath, serviceName, volumeId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get volume details
	 *
	 * REST: GET /cloud/project/{serviceName}/volume/{volumeId}
	 * @param serviceName [required] Project id
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_GET(String serviceName, String volumeId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}";
		StringBuilder sb = path(qPath, serviceName, volumeId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Update a volume
	 *
	 * REST: PUT /cloud/project/{serviceName}/volume/{volumeId}
	 * @param description [required] Volume description
	 * @param name [required] Volume name
	 * @param serviceName [required] Project id
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_PUT(String serviceName, String volumeId, String description, String name) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}";
		StringBuilder sb = path(qPath, serviceName, volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "name", name);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Snapshot a volume
	 *
	 * REST: POST /cloud/project/{serviceName}/volume/{volumeId}/snapshot
	 * @param description [required] Snapshot description
	 * @param name [required] Snapshot name
	 * @param serviceName [required] Service name
	 * @param volumeId [required] Volume id
	 */
	public OvhSnapshot project_serviceName_volume_volumeId_snapshot_POST(String serviceName, String volumeId, String description, String name) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}/snapshot";
		StringBuilder sb = path(qPath, serviceName, volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhSnapshot.class);
	}

	/**
	 * Get public networks
	 *
	 * REST: GET /cloud/project/{serviceName}/network/public
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhNetwork> project_serviceName_network_public_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/public";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhNetwork>> t6 = new TypeReference<ArrayList<OvhNetwork>>() {};

	/**
	 * Delete private network
	 *
	 * REST: DELETE /cloud/project/{serviceName}/network/private/{networkId}
	 * @param networkId [required] Network id
	 * @param serviceName [required] Project name
	 */
	public void project_serviceName_network_private_networkId_DELETE(String serviceName, String networkId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}";
		StringBuilder sb = path(qPath, serviceName, networkId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get private network
	 *
	 * REST: GET /cloud/project/{serviceName}/network/private/{networkId}
	 * @param networkId [required] Network id
	 * @param serviceName [required] Service name
	 */
	public OvhNetwork project_serviceName_network_private_networkId_GET(String serviceName, String networkId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}";
		StringBuilder sb = path(qPath, serviceName, networkId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNetwork.class);
	}

	/**
	 * Rename private network
	 *
	 * REST: PUT /cloud/project/{serviceName}/network/private/{networkId}
	 * @param name [required] name
	 * @param networkId [required] Network id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_network_private_networkId_PUT(String serviceName, String networkId, String name) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}";
		StringBuilder sb = path(qPath, serviceName, networkId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		exec(qPath, "PUT", sb.toString(), o);
	}

	/**
	 * Activate private network in a new region
	 *
	 * REST: POST /cloud/project/{serviceName}/network/private/{networkId}/region
	 * @param networkId [required] Network id
	 * @param region [required] Region to active on your network
	 * @param serviceName [required] Service name
	 */
	public OvhNetwork project_serviceName_network_private_networkId_region_POST(String serviceName, String networkId, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}/region";
		StringBuilder sb = path(qPath, serviceName, networkId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "region", region);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNetwork.class);
	}

	/**
	 * Delete a network subnet
	 *
	 * REST: DELETE /cloud/project/{serviceName}/network/private/{networkId}/subnet/{subnetId}
	 * @param networkId [required] Network id
	 * @param serviceName [required] Project id
	 * @param subnetId [required] Subnet id
	 */
	public void project_serviceName_network_private_networkId_subnet_subnetId_DELETE(String serviceName, String networkId, String subnetId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}/subnet/{subnetId}";
		StringBuilder sb = path(qPath, serviceName, networkId, subnetId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get network subnets
	 *
	 * REST: GET /cloud/project/{serviceName}/network/private/{networkId}/subnet
	 * @param networkId [required] Network id
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhSubnet> project_serviceName_network_private_networkId_subnet_GET(String serviceName, String networkId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}/subnet";
		StringBuilder sb = path(qPath, serviceName, networkId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhSubnet>> t7 = new TypeReference<ArrayList<OvhSubnet>>() {};

	/**
	 * Create a new network subnet
	 *
	 * REST: POST /cloud/project/{serviceName}/network/private/{networkId}/subnet
	 * @param dhcp [required] Enable DHCP
	 * @param end [required] Last IP for this region (eg: 192.168.1.24)
	 * @param network [required] Global network with cidr (eg: 192.168.1.0/24)
	 * @param networkId [required] Network id
	 * @param noGateway [required] Set to true if you don't want to set a default gateway IP
	 * @param region [required] Region where this subnet will be created
	 * @param serviceName [required] Project name
	 * @param start [required] First IP for this region (eg: 192.168.1.12)
	 */
	public OvhSubnet project_serviceName_network_private_networkId_subnet_POST(String serviceName, String networkId, Boolean dhcp, String end, String network, Boolean noGateway, String region, String start) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}/subnet";
		StringBuilder sb = path(qPath, serviceName, networkId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dhcp", dhcp);
		addBody(o, "end", end);
		addBody(o, "network", network);
		addBody(o, "noGateway", noGateway);
		addBody(o, "region", region);
		addBody(o, "start", start);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhSubnet.class);
	}

	/**
	 * Get private networks
	 *
	 * REST: GET /cloud/project/{serviceName}/network/private
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhNetwork> project_serviceName_network_private_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}

	/**
	 * Create a new network
	 *
	 * REST: POST /cloud/project/{serviceName}/network/private
	 * @param name [required] Network name
	 * @param regions [required] Region where to activate private network. No parameters means all region
	 * @param serviceName [required] Project name
	 * @param vlanId [required] Vland id, between 0 and 4000. 0 value means no vlan.
	 */
	public OvhNetwork project_serviceName_network_private_POST(String serviceName, String name, String[] regions, Long vlanId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "regions", regions);
		addBody(o, "vlanId", vlanId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNetwork.class);
	}

	/**
	 * Get your project consumption
	 *
	 * REST: GET /cloud/project/{serviceName}/consumption
	 * @param from [required] Get usage from
	 * @param to [required] Get usage to
	 * @param serviceName [required] The project id
	 */
	public OvhProjectUsage project_serviceName_consumption_GET(String serviceName, Date from, Date to) throws IOException {
		String qPath = "/cloud/project/{serviceName}/consumption";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "from", from);
		query(sb, "to", to);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhProjectUsage.class);
	}

	/**
	 * Get the linked vRack on your project
	 *
	 * REST: GET /cloud/project/{serviceName}/vrack
	 * @param serviceName [required] Public Cloud project
	 */
	public OvhVrack project_serviceName_vrack_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/vrack";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVrack.class);
	}

	/**
	 * Get storage containers
	 *
	 * REST: GET /cloud/project/{serviceName}/storage
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhContainer> project_serviceName_storage_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhContainer>> t8 = new TypeReference<ArrayList<OvhContainer>>() {};

	/**
	 * Create container
	 *
	 * REST: POST /cloud/project/{serviceName}/storage
	 * @param archive [required] Archive container flag
	 * @param containerName [required] Container name
	 * @param region [required] Region
	 * @param serviceName [required] Service name
	 */
	public OvhContainer project_serviceName_storage_POST(String serviceName, Boolean archive, String containerName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "archive", archive);
		addBody(o, "containerName", containerName);
		addBody(o, "region", region);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhContainer.class);
	}

	/**
	 * Access to storage API
	 *
	 * REST: GET /cloud/project/{serviceName}/storage/access
	 * @param serviceName [required] Service name
	 * @deprecated
	 */
	public OvhContainerAccess project_serviceName_storage_access_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/access";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhContainerAccess.class);
	}

	/**
	 * Access to storage API
	 *
	 * REST: POST /cloud/project/{serviceName}/storage/access
	 * @param serviceName [required] Service name
	 */
	public OvhContainerAccess project_serviceName_storage_access_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/access";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhContainerAccess.class);
	}

	/**
	 * Create openstack user with only access to this container
	 *
	 * REST: POST /cloud/project/{serviceName}/storage/{containerId}/user
	 * @param containerId [required] Container ID
	 * @param description [required] User description
	 * @param right [required] User right (all, read, write)
	 * @param serviceName [required] Service name
	 */
	public OvhUserDetail project_serviceName_storage_containerId_user_POST(String serviceName, String containerId, String description, OvhRightEnum right) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}/user";
		StringBuilder sb = path(qPath, serviceName, containerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "right", right);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhUserDetail.class);
	}

	/**
	 * Get a public temporary URL to access to one of your object
	 *
	 * REST: POST /cloud/project/{serviceName}/storage/{containerId}/publicUrl
	 * @param containerId [required] Container ID
	 * @param expirationDate [required] Temporary URL expiration
	 * @param objectName [required] Object name
	 * @param serviceName [required] Service name
	 */
	public OvhContainerObjectTempURL project_serviceName_storage_containerId_publicUrl_POST(String serviceName, String containerId, Date expirationDate, String objectName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}/publicUrl";
		StringBuilder sb = path(qPath, serviceName, containerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "expirationDate", expirationDate);
		addBody(o, "objectName", objectName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhContainerObjectTempURL.class);
	}

	/**
	 * Delete container
	 *
	 * REST: DELETE /cloud/project/{serviceName}/storage/{containerId}
	 * @param containerId [required] Container id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_storage_containerId_DELETE(String serviceName, String containerId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}";
		StringBuilder sb = path(qPath, serviceName, containerId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get storage container
	 *
	 * REST: GET /cloud/project/{serviceName}/storage/{containerId}
	 * @param containerId [required] Container id
	 * @param serviceName [required] Service name
	 */
	public OvhContainerDetail project_serviceName_storage_containerId_GET(String serviceName, String containerId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}";
		StringBuilder sb = path(qPath, serviceName, containerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhContainerDetail.class);
	}

	/**
	 * Update your storage container
	 *
	 * REST: PUT /cloud/project/{serviceName}/storage/{containerId}
	 * @param containerId [required] Container id
	 * @param containerType [required] Container type
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_storage_containerId_PUT(String serviceName, String containerId, OvhTypeEnum containerType) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}";
		StringBuilder sb = path(qPath, serviceName, containerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "containerType", containerType);
		exec(qPath, "PUT", sb.toString(), o);
	}

	/**
	 * Delete CORS support on your container
	 *
	 * REST: DELETE /cloud/project/{serviceName}/storage/{containerId}/cors
	 * @param containerId [required] Container id
	 * @param origin [required] Delete this origin
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_storage_containerId_cors_DELETE(String serviceName, String containerId, String origin) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}/cors";
		StringBuilder sb = path(qPath, serviceName, containerId);
		query(sb, "origin", origin);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Add CORS support on your container
	 *
	 * REST: POST /cloud/project/{serviceName}/storage/{containerId}/cors
	 * @param containerId [required] Container id
	 * @param origin [required] Allow this origin
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_storage_containerId_cors_POST(String serviceName, String containerId, String origin) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}/cors";
		StringBuilder sb = path(qPath, serviceName, containerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "origin", origin);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Deploy your container files as a static web site
	 *
	 * REST: POST /cloud/project/{serviceName}/storage/{containerId}/static
	 * @param containerId [required] Container id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_storage_containerId_static_POST(String serviceName, String containerId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}/static";
		StringBuilder sb = path(qPath, serviceName, containerId);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Request more quota on your /cloud project
	 *
	 * REST: POST /cloud/project/{serviceName}/unleash
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_unleash_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/unleash";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get flavors
	 *
	 * REST: GET /cloud/project/{serviceName}/flavor
	 * @param region [required] Flavor region
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhFlavor> project_serviceName_flavor_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/flavor";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhFlavor>> t9 = new TypeReference<ArrayList<OvhFlavor>>() {};

	/**
	 * Get flavor
	 *
	 * REST: GET /cloud/project/{serviceName}/flavor/{flavorId}
	 * @param flavorId [required] Flavor id
	 * @param serviceName [required] Service name
	 */
	public OvhFlavor project_serviceName_flavor_flavorId_GET(String serviceName, String flavorId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/flavor/{flavorId}";
		StringBuilder sb = path(qPath, serviceName, flavorId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFlavor.class);
	}

	/**
	 * Get stack
	 *
	 * REST: GET /cloud/project/{serviceName}/stack/{stackId}
	 * @param serviceName [required] Project id
	 * @param stackId [required] Stack uuid
	 *
	 * API beta
	 */
	public OvhStack project_serviceName_stack_stackId_GET(String serviceName, String stackId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/stack/{stackId}";
		StringBuilder sb = path(qPath, serviceName, stackId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhStack.class);
	}

	/**
	 * Get OVH playground session with a stack installed to use the openstack terminal
	 *
	 * REST: POST /cloud/project/{serviceName}/stack/{stackId}/client
	 * @param serviceName [required] Project id
	 * @param stackId [required] Stack uuid
	 *
	 * API beta
	 */
	public net.minidev.ovh.api.cloud.openstackclient.OvhSession project_serviceName_stack_stackId_client_POST(String serviceName, String stackId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/stack/{stackId}/client";
		StringBuilder sb = path(qPath, serviceName, stackId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.cloud.openstackclient.OvhSession.class);
	}

	/**
	 * Get stacks
	 *
	 * REST: GET /cloud/project/{serviceName}/stack
	 * @param serviceName [required] Project id
	 *
	 * API beta
	 */
	public ArrayList<OvhStack> project_serviceName_stack_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/stack";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t10);
	}
	private static TypeReference<ArrayList<OvhStack>> t10 = new TypeReference<ArrayList<OvhStack>>() {};

	/**
	 * Get project quotas
	 *
	 * REST: GET /cloud/project/{serviceName}/quota
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhQuotas> project_serviceName_quota_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/quota";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}
	private static TypeReference<ArrayList<OvhQuotas>> t11 = new TypeReference<ArrayList<OvhQuotas>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/project/{serviceName}/serviceInfos
	 * @param serviceName [required] The project id
	 */
	public OvhService project_serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cloud/project/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/cloud/project/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get VNC access to your instance
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/vnc
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Project id
	 */
	public OvhInstanceVnc project_serviceName_instance_instanceId_vnc_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/vnc";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhInstanceVnc.class);
	}

	/**
	 * Active monthly billing on instance
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/activeMonthlyBilling
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public OvhInstanceDetail project_serviceName_instance_instanceId_activeMonthlyBilling_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/activeMonthlyBilling";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Migrate your instance to another flavor
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/resize
	 * @param flavorId [required] Flavor id
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public OvhInstanceDetail project_serviceName_instance_instanceId_resize_POST(String serviceName, String instanceId, String flavorId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/resize";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flavorId", flavorId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Get interfaces
	 *
	 * REST: GET /cloud/project/{serviceName}/instance/{instanceId}/interface
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhInterface> project_serviceName_instance_instanceId_interface_GET(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/interface";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}
	private static TypeReference<ArrayList<OvhInterface>> t12 = new TypeReference<ArrayList<OvhInterface>>() {};

	/**
	 * Create interface on an instance and attached it to a network
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/interface
	 * @param instanceId [required] Instance id
	 * @param ip [required] Static ip (Can only be defined for private networks)
	 * @param networkId [required] Network id
	 * @param serviceName [required] Service name
	 */
	public OvhInterface project_serviceName_instance_instanceId_interface_POST(String serviceName, String instanceId, String ip, String networkId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/interface";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		addBody(o, "networkId", networkId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInterface.class);
	}

	/**
	 * Delete an interface
	 *
	 * REST: DELETE /cloud/project/{serviceName}/instance/{instanceId}/interface/{interfaceId}
	 * @param instanceId [required] Instance id
	 * @param interfaceId [required] Interface id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_instance_instanceId_interface_interfaceId_DELETE(String serviceName, String instanceId, String interfaceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/interface/{interfaceId}";
		StringBuilder sb = path(qPath, serviceName, instanceId, interfaceId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get interface
	 *
	 * REST: GET /cloud/project/{serviceName}/instance/{instanceId}/interface/{interfaceId}
	 * @param instanceId [required] Instance id
	 * @param interfaceId [required] Interface id
	 * @param serviceName [required] Service name
	 */
	public OvhInterface project_serviceName_instance_instanceId_interface_interfaceId_GET(String serviceName, String instanceId, String interfaceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/interface/{interfaceId}";
		StringBuilder sb = path(qPath, serviceName, instanceId, interfaceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInterface.class);
	}

	/**
	 * Return initial credentials of applications installed from public image
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/applicationAccess
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Project id
	 */
	public OvhApplicationAccess project_serviceName_instance_instanceId_applicationAccess_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/applicationAccess";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhApplicationAccess.class);
	}

	/**
	 * Resume a suspended instance
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/resume
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_instance_instanceId_resume_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/resume";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Enable or disable rescue mode
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/rescueMode
	 * @param imageId [required] Image to boot on
	 * @param instanceId [required] Instance id
	 * @param rescue [required] Enable rescue mode
	 * @param serviceName [required] Service name
	 */
	public OvhRescueAdminPassword project_serviceName_instance_instanceId_rescueMode_POST(String serviceName, String instanceId, String imageId, Boolean rescue) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/rescueMode";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "imageId", imageId);
		addBody(o, "rescue", rescue);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhRescueAdminPassword.class);
	}

	/**
	 * Delete an instance
	 *
	 * REST: DELETE /cloud/project/{serviceName}/instance/{instanceId}
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Project name
	 */
	public void project_serviceName_instance_instanceId_DELETE(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get instance
	 *
	 * REST: GET /cloud/project/{serviceName}/instance/{instanceId}
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Project id
	 */
	public OvhInstanceDetail project_serviceName_instance_instanceId_GET(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Alter an instance
	 *
	 * REST: PUT /cloud/project/{serviceName}/instance/{instanceId}
	 * @param instanceId [required] Instance id
	 * @param instanceName [required] Instance new name
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_instance_instanceId_PUT(String serviceName, String instanceId, String instanceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceName", instanceName);
		exec(qPath, "PUT", sb.toString(), o);
	}

	/**
	 * Reboot an instance
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/reboot
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 * @param type [required] Reboot type (default soft)
	 */
	public void project_serviceName_instance_instanceId_reboot_POST(String serviceName, String instanceId, OvhRebootTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/reboot";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "type", type);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Return many statistics about the virtual machine for a given period
	 *
	 * REST: GET /cloud/project/{serviceName}/instance/{instanceId}/monitoring
	 * @param instanceId [required] Instance id
	 * @param period [required] The period the statistics are fetched for
	 * @param serviceName [required] Project id
	 * @param type [required] The type of statistic to be fetched
	 */
	public OvhInstanceMetrics project_serviceName_instance_instanceId_monitoring_GET(String serviceName, String instanceId, OvhMetricsPeriod period, OvhMetricsType type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/monitoring";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceMetrics.class);
	}

	/**
	 * Snapshot an instance
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/snapshot
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 * @param snapshotName [required] Snapshot name
	 */
	public void project_serviceName_instance_instanceId_snapshot_POST(String serviceName, String instanceId, String snapshotName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/snapshot";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "snapshotName", snapshotName);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Reinstall an instance
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/reinstall
	 * @param imageId [required] Image to reinstall
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public OvhInstanceDetail project_serviceName_instance_instanceId_reinstall_POST(String serviceName, String instanceId, String imageId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/reinstall";
		StringBuilder sb = path(qPath, serviceName, instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "imageId", imageId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Get the detail of a group
	 *
	 * REST: GET /cloud/project/{serviceName}/instance/group
	 * @param region [required] Instance region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhInstanceGroup> project_serviceName_instance_group_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/group";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t13);
	}
	private static TypeReference<ArrayList<OvhInstanceGroup>> t13 = new TypeReference<ArrayList<OvhInstanceGroup>>() {};

	/**
	 * Create a group
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/group
	 * @param name [required] instance group name
	 * @param region [required] Instance region
	 * @param serviceName [required] Project name
	 * @param type [required] Instance group type
	 */
	public OvhInstanceGroup project_serviceName_instance_group_POST(String serviceName, String name, String region, OvhInstanceGroupTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/group";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "region", region);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceGroup.class);
	}

	/**
	 * Delete a group
	 *
	 * REST: DELETE /cloud/project/{serviceName}/instance/group/{groupId}
	 * @param groupId [required] Group id
	 * @param serviceName [required] Project name
	 */
	public void project_serviceName_instance_group_groupId_DELETE(String serviceName, String groupId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/group/{groupId}";
		StringBuilder sb = path(qPath, serviceName, groupId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get all groups
	 *
	 * REST: GET /cloud/project/{serviceName}/instance/group/{groupId}
	 * @param groupId [required] Instance group id
	 * @param region [required] Instance region
	 * @param serviceName [required] Project id
	 */
	public OvhInstanceGroup project_serviceName_instance_group_groupId_GET(String serviceName, String groupId, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/group/{groupId}";
		StringBuilder sb = path(qPath, serviceName, groupId);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstanceGroup.class);
	}

	/**
	 * Create multiple instances
	 *
	 * REST: POST /cloud/project/{serviceName}/instance/bulk
	 * @param flavorId [required] Instance flavor id
	 * @param groupId [required] Start instance in group
	 * @param imageId [required] Instance image id
	 * @param monthlyBilling [required] Active monthly billing
	 * @param name [required] Instance name
	 * @param networks [required] Create network interfaces
	 * @param number [required] Number of instances you want to create
	 * @param region [required] Instance region
	 * @param serviceName [required] Project name
	 * @param sshKeyId [required] SSH keypair id
	 * @param userData [required] Configuration information or scripts to use upon launch
	 * @param volumeId [required] Specify a volume id to boot from it
	 */
	public ArrayList<OvhInstance> project_serviceName_instance_bulk_POST(String serviceName, String flavorId, String groupId, String imageId, Boolean monthlyBilling, String name, OvhNetworkBulkParams[] networks, Long number, String region, String sshKeyId, String userData, String volumeId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/bulk";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flavorId", flavorId);
		addBody(o, "groupId", groupId);
		addBody(o, "imageId", imageId);
		addBody(o, "monthlyBilling", monthlyBilling);
		addBody(o, "name", name);
		addBody(o, "networks", networks);
		addBody(o, "number", number);
		addBody(o, "region", region);
		addBody(o, "sshKeyId", sshKeyId);
		addBody(o, "userData", userData);
		addBody(o, "volumeId", volumeId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t14);
	}
	private static TypeReference<ArrayList<OvhInstance>> t14 = new TypeReference<ArrayList<OvhInstance>>() {};

	/**
	 * Get instances
	 *
	 * REST: GET /cloud/project/{serviceName}/instance
	 * @param region [required] Instance region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhInstance> project_serviceName_instance_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t14);
	}

	/**
	 * Create a new instance
	 *
	 * REST: POST /cloud/project/{serviceName}/instance
	 * @param flavorId [required] Instance flavor id
	 * @param groupId [required] Start instance in group
	 * @param imageId [required] Instance image id
	 * @param monthlyBilling [required] Active monthly billing
	 * @param name [required] Instance name
	 * @param networks [required] Create network interfaces
	 * @param region [required] Instance region
	 * @param serviceName [required] Project name
	 * @param sshKeyId [required] SSH keypair id
	 * @param userData [required] Configuration information or scripts to use upon launch
	 * @param volumeId [required] Specify a volume id to boot from it
	 */
	public OvhInstanceDetail project_serviceName_instance_POST(String serviceName, String flavorId, String groupId, String imageId, Boolean monthlyBilling, String name, OvhNetworkParams[] networks, String region, String sshKeyId, String userData, String volumeId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flavorId", flavorId);
		addBody(o, "groupId", groupId);
		addBody(o, "imageId", imageId);
		addBody(o, "monthlyBilling", monthlyBilling);
		addBody(o, "name", name);
		addBody(o, "networks", networks);
		addBody(o, "region", region);
		addBody(o, "sshKeyId", sshKeyId);
		addBody(o, "userData", userData);
		addBody(o, "volumeId", volumeId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/project/{serviceName}/alerting/{id}
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 */
	public OvhAlerting project_serviceName_alerting_id_GET(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAlerting.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cloud/project/{serviceName}/alerting/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 */
	public void project_serviceName_alerting_id_PUT(String serviceName, String id, OvhAlerting body) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete alerting
	 *
	 * REST: DELETE /cloud/project/{serviceName}/alerting/{id}
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 */
	public void project_serviceName_alerting_id_DELETE(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * See alerts
	 *
	 * REST: GET /cloud/project/{serviceName}/alerting/{id}/alert
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 */
	public ArrayList<Long> project_serviceName_alerting_id_alert_GET(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}/alert";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/project/{serviceName}/alerting/{id}/alert/{alertId}
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 * @param alertId [required] Alert id
	 */
	public OvhAlertingAlert project_serviceName_alerting_id_alert_alertId_GET(String serviceName, String id, Long alertId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}/alert/{alertId}";
		StringBuilder sb = path(qPath, serviceName, id, alertId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAlertingAlert.class);
	}

	/**
	 * Manage alerts on your consumption
	 *
	 * REST: GET /cloud/project/{serviceName}/alerting
	 * @param serviceName [required] The project id
	 */
	public ArrayList<String> project_serviceName_alerting_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add new alert
	 *
	 * REST: POST /cloud/project/{serviceName}/alerting
	 * @param delay [required] Delay between alerts in seconds
	 * @param monthlyThreshold [required] Monthly threshold for this alerting in currency
	 * @param email [required] Email to contact
	 * @param serviceName [required] The project id
	 */
	public OvhAlerting project_serviceName_alerting_POST(String serviceName, OvhAlertingDelayEnum delay, String email, Long monthlyThreshold) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "delay", delay);
		addBody(o, "email", email);
		addBody(o, "monthlyThreshold", monthlyThreshold);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhAlerting.class);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /cloud/project/{serviceName}/terminate
	 * @param serviceName [required] The project id
	 */
	public String project_serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get your credit
	 *
	 * REST: GET /cloud/project/{serviceName}/credit
	 * @param serviceName [required] The project id
	 */
	public ArrayList<Long> project_serviceName_credit_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/credit";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Add credit to your project
	 *
	 * REST: POST /cloud/project/{serviceName}/credit
	 * @param code [required] Voucher code
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_credit_POST(String serviceName, String code) throws IOException {
		String qPath = "/cloud/project/{serviceName}/credit";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/project/{serviceName}/credit/{id}
	 * @param serviceName [required] The project id
	 * @param id [required] Credit id
	 */
	public OvhCredit project_serviceName_credit_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/credit/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCredit.class);
	}

	/**
	 * Get snapshots
	 *
	 * REST: GET /cloud/project/{serviceName}/snapshot
	 * @param flavorType [required] Get compatible snapshots with flavor type
	 * @param region [required] Region
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhImage> project_serviceName_snapshot_GET(String serviceName, String flavorType, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/snapshot";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "flavorType", flavorType);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t15);
	}
	private static TypeReference<ArrayList<OvhImage>> t15 = new TypeReference<ArrayList<OvhImage>>() {};

	/**
	 * Delete a snapshot
	 *
	 * REST: DELETE /cloud/project/{serviceName}/snapshot/{snapshotId}
	 * @param serviceName [required] Project id
	 * @param snapshotId [required] Snapshot id
	 */
	public OvhImage project_serviceName_snapshot_snapshotId_DELETE(String serviceName, String snapshotId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/snapshot/{snapshotId}";
		StringBuilder sb = path(qPath, serviceName, snapshotId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * Get snapshot details
	 *
	 * REST: GET /cloud/project/{serviceName}/snapshot/{snapshotId}
	 * @param serviceName [required] Project id
	 * @param snapshotId [required] Snapshot id
	 */
	public OvhImage project_serviceName_snapshot_snapshotId_GET(String serviceName, String snapshotId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/snapshot/{snapshotId}";
		StringBuilder sb = path(qPath, serviceName, snapshotId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * List your automated backups
	 *
	 * REST: GET /cloud/project/{serviceName}/region/{regionName}/workflow/backup
	 * @param regionName [required] Public Cloud region
	 * @param serviceName [required] Public Cloud project
	 *
	 * API beta
	 */
	public ArrayList<OvhBackup> project_serviceName_region_regionName_workflow_backup_GET(String serviceName, String regionName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/region/{regionName}/workflow/backup";
		StringBuilder sb = path(qPath, serviceName, regionName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t16);
	}
	private static TypeReference<ArrayList<OvhBackup>> t16 = new TypeReference<ArrayList<OvhBackup>>() {};

	/**
	 * Create a new automated backup
	 *
	 * REST: POST /cloud/project/{serviceName}/region/{regionName}/workflow/backup
	 * @param cron [required] Unix Cron pattern (eg: '* * * * *')
	 * @param instanceId [required] Instance ID to backup
	 * @param maxExecutionCount [required] Number of execution to process before ending the job. Null value means that the job will never end.
	 * @param name [required] Name of your backup job
	 * @param regionName [required] Public Cloud region
	 * @param rotation [required] Number of backup to keep
	 * @param serviceName [required] Public Cloud project
	 *
	 * API beta
	 */
	public OvhBackup project_serviceName_region_regionName_workflow_backup_POST(String serviceName, String regionName, String cron, String instanceId, Long maxExecutionCount, String name, Long rotation) throws IOException {
		String qPath = "/cloud/project/{serviceName}/region/{regionName}/workflow/backup";
		StringBuilder sb = path(qPath, serviceName, regionName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cron", cron);
		addBody(o, "instanceId", instanceId);
		addBody(o, "maxExecutionCount", maxExecutionCount);
		addBody(o, "name", name);
		addBody(o, "rotation", rotation);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackup.class);
	}

	/**
	 * Delete a backup workflow process
	 *
	 * REST: DELETE /cloud/project/{serviceName}/region/{regionName}/workflow/backup/{backupWorkflowId}
	 * @param backupWorkflowId [required] ID of your backup workflow
	 * @param regionName [required] Public Cloud region
	 * @param serviceName [required] Public Cloud project
	 *
	 * API beta
	 */
	public void project_serviceName_region_regionName_workflow_backup_backupWorkflowId_DELETE(String serviceName, String regionName, String backupWorkflowId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/region/{regionName}/workflow/backup/{backupWorkflowId}";
		StringBuilder sb = path(qPath, serviceName, regionName, backupWorkflowId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get details about a backup workflow process
	 *
	 * REST: GET /cloud/project/{serviceName}/region/{regionName}/workflow/backup/{backupWorkflowId}
	 * @param backupWorkflowId [required] ID of your backup workflow
	 * @param regionName [required] Public Cloud region
	 * @param serviceName [required] Public Cloud project
	 *
	 * API beta
	 */
	public OvhBackup project_serviceName_region_regionName_workflow_backup_backupWorkflowId_GET(String serviceName, String regionName, String backupWorkflowId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/region/{regionName}/workflow/backup/{backupWorkflowId}";
		StringBuilder sb = path(qPath, serviceName, regionName, backupWorkflowId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackup.class);
	}

	/**
	 * Get information about your region
	 *
	 * REST: GET /cloud/project/{serviceName}/region/{regionName}
	 * @param regionName [required] Public Cloud region
	 * @param serviceName [required] Public Cloud project
	 */
	public OvhRegion project_serviceName_region_regionName_GET(String serviceName, String regionName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/region/{regionName}";
		StringBuilder sb = path(qPath, serviceName, regionName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRegion.class);
	}

	/**
	 * List your regions
	 *
	 * REST: GET /cloud/project/{serviceName}/region
	 * @param serviceName [required] Public Cloud project
	 */
	public ArrayList<String> project_serviceName_region_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/region";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /cloud/project/{serviceName}/confirmTermination
	 * @param futureUse What next after your termination request
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The project id
	 */
	public String project_serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/cloud/project/{serviceName}/confirmTermination";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "commentary", commentary);
		addBody(o, "futureUse", futureUse);
		addBody(o, "reason", reason);
		addBody(o, "token", token);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get OVH playground session to use the openstack terminal
	 *
	 * REST: POST /cloud/project/{serviceName}/openstackClient
	 * @param serviceName [required] Project id
	 *
	 * API beta
	 */
	public net.minidev.ovh.api.cloud.openstackclient.OvhSession project_serviceName_openstackClient_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/openstackClient";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.cloud.openstackclient.OvhSession.class);
	}

	/**
	 * Cancel project creation
	 *
	 * REST: POST /cloud/project/{serviceName}/cancel
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_cancel_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/cancel";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get all users
	 *
	 * REST: GET /cloud/project/{serviceName}/user
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhUser> project_serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t17);
	}
	private static TypeReference<ArrayList<OvhUser>> t17 = new TypeReference<ArrayList<OvhUser>>() {};

	/**
	 * Create user
	 *
	 * REST: POST /cloud/project/{serviceName}/user
	 * @param description [required] User description
	 * @param role [required] Openstack keystone role name
	 * @param serviceName [required] Service name
	 */
	public OvhUserDetail project_serviceName_user_POST(String serviceName, String description, OvhRoleEnum role) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "role", role);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhUserDetail.class);
	}

	/**
	 * Get rclone configuration file
	 *
	 * REST: GET /cloud/project/{serviceName}/user/{userId}/rclone
	 * @param region [required] Region
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhRclone project_serviceName_user_userId_rclone_GET(String serviceName, Long userId, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}/rclone";
		StringBuilder sb = path(qPath, serviceName, userId);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRclone.class);
	}

	/**
	 * Regenerate user password
	 *
	 * REST: POST /cloud/project/{serviceName}/user/{userId}/regeneratePassword
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhUserDetail project_serviceName_user_userId_regeneratePassword_POST(String serviceName, Long userId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}/regeneratePassword";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhUserDetail.class);
	}

	/**
	 * Delete user
	 *
	 * REST: DELETE /cloud/project/{serviceName}/user/{userId}
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public void project_serviceName_user_userId_DELETE(String serviceName, Long userId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}";
		StringBuilder sb = path(qPath, serviceName, userId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get user details
	 *
	 * REST: GET /cloud/project/{serviceName}/user/{userId}
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhUser project_serviceName_user_userId_GET(String serviceName, Long userId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Get token for user
	 *
	 * REST: POST /cloud/project/{serviceName}/user/{userId}/token
	 * @param password [required] User password
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhToken project_serviceName_user_userId_token_POST(String serviceName, Long userId, String password) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}/token";
		StringBuilder sb = path(qPath, serviceName, userId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhToken.class);
	}

	/**
	 * Get RC file of OpenStack
	 *
	 * REST: GET /cloud/project/{serviceName}/user/{userId}/openrc
	 * @param region [required] Region
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 * @param version [required] Identity API version
	 */
	public OvhOpenrc project_serviceName_user_userId_openrc_GET(String serviceName, Long userId, String region, OvhOpenrcVersionEnum version) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}/openrc";
		StringBuilder sb = path(qPath, serviceName, userId);
		query(sb, "region", region);
		query(sb, "version", version);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOpenrc.class);
	}

	/**
	 * Get your project bills
	 *
	 * REST: GET /cloud/project/{serviceName}/bill
	 * @param from [required] Get bills from
	 * @param to [required] Get bills to
	 * @param serviceName [required] The project id
	 */
	public ArrayList<OvhBill> project_serviceName_bill_GET(String serviceName, Date from, Date to) throws IOException {
		String qPath = "/cloud/project/{serviceName}/bill";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "from", from);
		query(sb, "to", to);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t18);
	}
	private static TypeReference<ArrayList<OvhBill>> t18 = new TypeReference<ArrayList<OvhBill>>() {};

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /cloud/project/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The project id
	 */
	public ArrayList<Long> project_serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/cloud/project/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}

	/**
	 * Renew the import of your load balancing IP into Openstack
	 *
	 * REST: POST /cloud/project/{serviceName}/ipLoadbalancing/{id}/renew
	 * @param redirection [required] Where you want to redirect the user after sucessfull authentication. Useful variables admitted: %project <=> project ID, %id <=> ID of load balancing ip, %iplb <=> IPLB service name
	 * @param serviceName [required] The project id
	 * @param id [required] ID of your load balancing ip import
	 *
	 * API beta
	 */
	public OvhIPLoadbalancing project_serviceName_ipLoadbalancing_id_renew_POST(String serviceName, String id, String redirection) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ipLoadbalancing/{id}/renew";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "redirection", redirection);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhIPLoadbalancing.class);
	}

	/**
	 * Validate the import of your load balancing IP into OpenStack
	 *
	 * REST: POST /cloud/project/{serviceName}/ipLoadbalancing/{id}/validate
	 * @param serviceName [required] The project id
	 * @param id [required] ID of your load balancing ip import
	 *
	 * API beta
	 */
	public void project_serviceName_ipLoadbalancing_id_validate_POST(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ipLoadbalancing/{id}/validate";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/project/{serviceName}/ipLoadbalancing/{id}
	 * @param serviceName [required] The project id
	 * @param id [required] ID of your load balancing ip import
	 *
	 * API beta
	 */
	public OvhIPLoadbalancing project_serviceName_ipLoadbalancing_id_GET(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ipLoadbalancing/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIPLoadbalancing.class);
	}

	/**
	 * Delete the import of your load balancing IP into OpenStack. This does not delete the IP LB but close the access of it from OpenStack
	 *
	 * REST: DELETE /cloud/project/{serviceName}/ipLoadbalancing/{id}
	 * @param serviceName [required] The project id
	 * @param id [required] ID of your load balancing ip import
	 *
	 * API beta
	 */
	public void project_serviceName_ipLoadbalancing_id_DELETE(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ipLoadbalancing/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Managed imported IP LB in OpenStack
	 *
	 * REST: GET /cloud/project/{serviceName}/ipLoadbalancing
	 * @param serviceName [required] The project id
	 *
	 * API beta
	 */
	public ArrayList<String> project_serviceName_ipLoadbalancing_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ipLoadbalancing";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Import an existing IP LB into OpenStack
	 *
	 * REST: POST /cloud/project/{serviceName}/ipLoadbalancing
	 * @param ipLoadbalancingServiceName [required] Service name of the IP LB to import
	 * @param redirection [required] Where you want to redirect the user after sucessfull authentication. Useful variables admitted: %project <=> project ID, %id <=> ID of load balancing ip, %iplb <=> IPLB service name
	 * @param serviceName [required] The project id
	 *
	 * API beta
	 */
	public OvhIPLoadbalancing project_serviceName_ipLoadbalancing_POST(String serviceName, String ipLoadbalancingServiceName, String redirection) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ipLoadbalancing";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipLoadbalancingServiceName", ipLoadbalancingServiceName);
		addBody(o, "redirection", redirection);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhIPLoadbalancing.class);
	}

	/**
	 * Get SSH keys
	 *
	 * REST: GET /cloud/project/{serviceName}/sshkey
	 * @param region [required] Region
	 * @param serviceName [required] Project name
	 */
	public ArrayList<OvhSshKey> project_serviceName_sshkey_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/sshkey";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t19);
	}
	private static TypeReference<ArrayList<OvhSshKey>> t19 = new TypeReference<ArrayList<OvhSshKey>>() {};

	/**
	 * Create SSH key
	 *
	 * REST: POST /cloud/project/{serviceName}/sshkey
	 * @param name [required] SSH key name
	 * @param publicKey [required] SSH public key
	 * @param region [required] Region to create SSH key
	 * @param serviceName [required] Project name
	 */
	public OvhSshKeyDetail project_serviceName_sshkey_POST(String serviceName, String name, String publicKey, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/sshkey";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "publicKey", publicKey);
		addBody(o, "region", region);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhSshKeyDetail.class);
	}

	/**
	 * Delete SSH key
	 *
	 * REST: DELETE /cloud/project/{serviceName}/sshkey/{keyId}
	 * @param keyId [required] SSH key id
	 * @param serviceName [required] Project name
	 */
	public void project_serviceName_sshkey_keyId_DELETE(String serviceName, String keyId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/sshkey/{keyId}";
		StringBuilder sb = path(qPath, serviceName, keyId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get SSH key
	 *
	 * REST: GET /cloud/project/{serviceName}/sshkey/{keyId}
	 * @param keyId [required] SSH key id
	 * @param serviceName [required] Project name
	 */
	public OvhSshKeyDetail project_serviceName_sshkey_keyId_GET(String serviceName, String keyId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/sshkey/{keyId}";
		StringBuilder sb = path(qPath, serviceName, keyId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSshKeyDetail.class);
	}

	/**
	 * Get usage forecast
	 *
	 * REST: GET /cloud/project/{serviceName}/usage/forecast
	 * @param serviceName [required] Service name
	 */
	public OvhUsageForecast project_serviceName_usage_forecast_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/usage/forecast";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUsageForecast.class);
	}

	/**
	 * Usage information on your project
	 *
	 * REST: GET /cloud/project/{serviceName}/usage/history
	 * @param from [required] Filter results having date superior to from
	 * @param serviceName [required] Service name
	 * @param to [required] Filter results having date inferior to
	 */
	public ArrayList<OvhUsageHistory> project_serviceName_usage_history_GET(String serviceName, Date from, Date to) throws IOException {
		String qPath = "/cloud/project/{serviceName}/usage/history";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "from", from);
		query(sb, "to", to);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t20);
	}
	private static TypeReference<ArrayList<OvhUsageHistory>> t20 = new TypeReference<ArrayList<OvhUsageHistory>>() {};

	/**
	 * Usage information details
	 *
	 * REST: GET /cloud/project/{serviceName}/usage/history/{usageId}
	 * @param serviceName [required] Service name
	 * @param usageId [required] Usage id
	 */
	public OvhUsageHistoryDetail project_serviceName_usage_history_usageId_GET(String serviceName, String usageId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/usage/history/{usageId}";
		StringBuilder sb = path(qPath, serviceName, usageId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUsageHistoryDetail.class);
	}

	/**
	 * Get current usage
	 *
	 * REST: GET /cloud/project/{serviceName}/usage/current
	 * @param serviceName [required] Service name
	 */
	public OvhUsageCurrent project_serviceName_usage_current_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/usage/current";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUsageCurrent.class);
	}

	/**
	 * Do not expire the project, and retain it. You will have to pay for the resources you will use after using this call
	 *
	 * REST: POST /cloud/project/{serviceName}/retain
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_retain_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/retain";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get image
	 *
	 * REST: GET /cloud/project/{serviceName}/image/{imageId}
	 * @param imageId [required] Image id
	 * @param serviceName [required] Project id
	 */
	public OvhImage project_serviceName_image_imageId_GET(String serviceName, String imageId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/image/{imageId}";
		StringBuilder sb = path(qPath, serviceName, imageId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * Get images
	 *
	 * REST: GET /cloud/project/{serviceName}/image
	 * @param flavorType [required] Get compatible images with flavor type
	 * @param osType [required] Image OS
	 * @param region [required] Image region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhImage> project_serviceName_image_GET(String serviceName, String flavorType, OvhOSTypeEnum osType, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/image";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "flavorType", flavorType);
		query(sb, "osType", osType);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t15);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/project/{serviceName}
	 * @param serviceName [required] The project id
	 */
	public OvhProject project_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhProject.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /cloud/project/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_PUT(String serviceName, OvhProject body) throws IOException {
		String qPath = "/cloud/project/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get your consumption forecast
	 *
	 * REST: GET /cloud/project/{serviceName}/forecast
	 * @param serviceName [required] Service name
	 * @param toDate [required] Forecast until date
	 */
	public OvhProjectForecast project_serviceName_forecast_GET(String serviceName, Date toDate) throws IOException {
		String qPath = "/cloud/project/{serviceName}/forecast";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "toDate", toDate);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhProjectForecast.class);
	}

	/**
	 * Get planned migrations
	 *
	 * REST: GET /cloud/project/{serviceName}/migration
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public ArrayList<OvhMigration> project_serviceName_migration_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/migration";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t21);
	}
	private static TypeReference<ArrayList<OvhMigration>> t21 = new TypeReference<ArrayList<OvhMigration>>() {};

	/**
	 * Get planned migration
	 *
	 * REST: GET /cloud/project/{serviceName}/migration/{migrationId}
	 * @param migrationId [required] Migration id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhMigration project_serviceName_migration_migrationId_GET(String serviceName, String migrationId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/migration/{migrationId}";
		StringBuilder sb = path(qPath, serviceName, migrationId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMigration.class);
	}

	/**
	 * Update planned migration
	 *
	 * REST: PUT /cloud/project/{serviceName}/migration/{migrationId}
	 * @param date [required] Migration date (RFC3339)
	 * @param migrationId [required] Migration id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhMigration project_serviceName_migration_migrationId_PUT(String serviceName, String migrationId, Date date) throws IOException {
		String qPath = "/cloud/project/{serviceName}/migration/{migrationId}";
		StringBuilder sb = path(qPath, serviceName, migrationId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "date", date);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhMigration.class);
	}

	/**
	 * Get ACL on your cloud project
	 *
	 * REST: GET /cloud/project/{serviceName}/acl
	 * @param type [required] Filter the value of type property (=)
	 * @param serviceName [required] The project id
	 */
	public ArrayList<String> project_serviceName_acl_GET(String serviceName, OvhAclTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/acl";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create new ACL
	 *
	 * REST: POST /cloud/project/{serviceName}/acl
	 * @param type [required] Acl type
	 * @param accountId [required] Deleguates rights to
	 * @param serviceName [required] The project id
	 */
	public OvhAcl project_serviceName_acl_POST(String serviceName, String accountId, OvhAclTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/acl";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accountId", accountId);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhAcl.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /cloud/project/{serviceName}/acl/{accountId}
	 * @param serviceName [required] The project id
	 * @param accountId [required] OVH customer unique identifier
	 */
	public OvhAcl project_serviceName_acl_accountId_GET(String serviceName, String accountId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/acl/{accountId}";
		StringBuilder sb = path(qPath, serviceName, accountId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAcl.class);
	}

	/**
	 * Delete ACL
	 *
	 * REST: DELETE /cloud/project/{serviceName}/acl/{accountId}
	 * @param serviceName [required] The project id
	 * @param accountId [required] OVH customer unique identifier
	 */
	public void project_serviceName_acl_accountId_DELETE(String serviceName, String accountId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/acl/{accountId}";
		StringBuilder sb = path(qPath, serviceName, accountId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get failover ips
	 *
	 * REST: GET /cloud/project/{serviceName}/ip/failover
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhFailoverIp> project_serviceName_ip_failover_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ip/failover";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t22);
	}
	private static TypeReference<ArrayList<OvhFailoverIp>> t22 = new TypeReference<ArrayList<OvhFailoverIp>>() {};

	/**
	 * Get failover ip
	 *
	 * REST: GET /cloud/project/{serviceName}/ip/failover/{id}
	 * @param id [required] Ip id
	 * @param serviceName [required] Project id
	 */
	public OvhFailoverIp project_serviceName_ip_failover_id_GET(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ip/failover/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFailoverIp.class);
	}

	/**
	 * Attach failover ip to an instance
	 *
	 * REST: POST /cloud/project/{serviceName}/ip/failover/{id}/attach
	 * @param id [required] Ip id
	 * @param instanceId [required] Attach failover ip to instance
	 * @param serviceName [required] Project id
	 */
	public OvhFailoverIp project_serviceName_ip_failover_id_attach_POST(String serviceName, String id, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ip/failover/{id}/attach";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceId", instanceId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhFailoverIp.class);
	}

	/**
	 * Get ips
	 *
	 * REST: GET /cloud/project/{serviceName}/ip
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhCloudIp> project_serviceName_ip_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ip";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t23);
	}
	private static TypeReference<ArrayList<OvhCloudIp>> t23 = new TypeReference<ArrayList<OvhCloudIp>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /cloud/project
	 */
	public ArrayList<String> project_GET() throws IOException {
		String qPath = "/cloud/project";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get information about a cloud project creation
	 *
	 * REST: GET /cloud/createProjectInfo
	 * @param voucher [required] Voucher code
	 */
	public OvhNewProjectInfo createProjectInfo_GET(String voucher) throws IOException {
		String qPath = "/cloud/createProjectInfo";
		StringBuilder sb = path(qPath);
		query(sb, "voucher", voucher);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNewProjectInfo.class);
	}

	/**
	 * Get services prices for a subsidiary
	 *
	 * REST: GET /cloud/subsidiaryPrice
	 * @param ovhSubsidiary [required] OVH subsidiary
	 * @param region [required] Region
	 * @param flavorId [required] OVH cloud flavor id
	 */
	public OvhPrice subsidiaryPrice_GET(String flavorId, OvhOvhSubsidiaryEnum ovhSubsidiary, String region) throws IOException {
		String qPath = "/cloud/subsidiaryPrice";
		StringBuilder sb = path(qPath);
		query(sb, "flavorId", flavorId);
		query(sb, "ovhSubsidiary", ovhSubsidiary);
		query(sb, "region", region);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get services prices
	 *
	 * REST: GET /cloud/price
	 * @param region [required] Region
	 * @param flavorId [required] OVH cloud flavor id
	 * @deprecated
	 */
	public OvhPrice price_GET(String flavorId, String region) throws IOException {
		String qPath = "/cloud/price";
		StringBuilder sb = path(qPath);
		query(sb, "flavorId", flavorId);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Start a new cloud project
	 *
	 * REST: POST /cloud/createProject
	 * @param credit [required] Amount of cloud credit to purchase. Unit is base currency.
	 * @param voucher [required] Voucher code
	 * @param description [required] Project description
	 */
	public OvhNewProject createProject_POST(Long credit, String description, String voucher) throws IOException {
		String qPath = "/cloud/createProject";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "credit", credit);
		addBody(o, "description", description);
		addBody(o, "voucher", voucher);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNewProject.class);
	}
}
