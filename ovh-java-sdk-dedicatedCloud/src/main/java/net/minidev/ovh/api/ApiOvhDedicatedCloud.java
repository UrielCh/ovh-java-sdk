package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.dedicatedcloud.OvhAllowedNetwork;
import net.minidev.ovh.api.dedicatedcloud.OvhBackup;
import net.minidev.ovh.api.dedicatedcloud.OvhBackupJob;
import net.minidev.ovh.api.dedicatedcloud.OvhCapabilities;
import net.minidev.ovh.api.dedicatedcloud.OvhCommercialRange;
import net.minidev.ovh.api.dedicatedcloud.OvhDatacenter;
import net.minidev.ovh.api.dedicatedcloud.OvhDedicatedCloud;
import net.minidev.ovh.api.dedicatedcloud.OvhFederation;
import net.minidev.ovh.api.dedicatedcloud.OvhFederationAccessNetwork;
import net.minidev.ovh.api.dedicatedcloud.OvhFiler;
import net.minidev.ovh.api.dedicatedcloud.OvhHcx;
import net.minidev.ovh.api.dedicatedcloud.OvhHds;
import net.minidev.ovh.api.dedicatedcloud.OvhHipaa;
import net.minidev.ovh.api.dedicatedcloud.OvhHost;
import net.minidev.ovh.api.dedicatedcloud.OvhHostProfile;
import net.minidev.ovh.api.dedicatedcloud.OvhHostStockProfile;
import net.minidev.ovh.api.dedicatedcloud.OvhIp;
import net.minidev.ovh.api.dedicatedcloud.OvhIpCountriesEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhIpDetails;
import net.minidev.ovh.api.dedicatedcloud.OvhNsx;
import net.minidev.ovh.api.dedicatedcloud.OvhObjectRight;
import net.minidev.ovh.api.dedicatedcloud.OvhOptionCompatibility;
import net.minidev.ovh.api.dedicatedcloud.OvhOs;
import net.minidev.ovh.api.dedicatedcloud.OvhPasswordPolicy;
import net.minidev.ovh.api.dedicatedcloud.OvhPccStockProfile;
import net.minidev.ovh.api.dedicatedcloud.OvhPccZone;
import net.minidev.ovh.api.dedicatedcloud.OvhPciDss;
import net.minidev.ovh.api.dedicatedcloud.OvhResourceNewPrices;
import net.minidev.ovh.api.dedicatedcloud.OvhRestorePoint;
import net.minidev.ovh.api.dedicatedcloud.OvhRight;
import net.minidev.ovh.api.dedicatedcloud.OvhRobot;
import net.minidev.ovh.api.dedicatedcloud.OvhServicePack;
import net.minidev.ovh.api.dedicatedcloud.OvhTask;
import net.minidev.ovh.api.dedicatedcloud.OvhTaskStateEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhTwoFAWhitelist;
import net.minidev.ovh.api.dedicatedcloud.OvhUser;
import net.minidev.ovh.api.dedicatedcloud.OvhUserAccessPolicyEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhUserLogoutPolicyEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhVMEncryption;
import net.minidev.ovh.api.dedicatedcloud.OvhVMEncryptionAccessNetwork;
import net.minidev.ovh.api.dedicatedcloud.OvhVendor;
import net.minidev.ovh.api.dedicatedcloud.OvhVendorObjectTypeEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhVlan;
import net.minidev.ovh.api.dedicatedcloud.OvhVm;
import net.minidev.ovh.api.dedicatedcloud.OvhVrops;
import net.minidev.ovh.api.dedicatedcloud.OvhZpoolStockProfile;
import net.minidev.ovh.api.dedicatedcloud.backup.OvhBackupDaysEnum;
import net.minidev.ovh.api.dedicatedcloud.backup.OvhOfferTypeEnum;
import net.minidev.ovh.api.dedicatedcloud.filer.OvhHourlyConsumption;
import net.minidev.ovh.api.dedicatedcloud.host.OvhProfile;
import net.minidev.ovh.api.dedicatedcloud.right.OvhNetworkRoleEnum;
import net.minidev.ovh.api.dedicatedcloud.right.OvhRightEnum;
import net.minidev.ovh.api.dedicatedcloud.right.OvhUserObjectRightTypeEnum;
import net.minidev.ovh.api.dedicatedcloud.right.OvhVmNetworkRoleEnum;
import net.minidev.ovh.api.dedicatedcloud.vendor.OvhOvhId;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/dedicatedCloud
 * version:1.0
 */
public class ApiOvhDedicatedCloud extends ApiOvhBase {
	public ApiOvhDedicatedCloud(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Disable Hds option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/hds/disable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_hds_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hds/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hds
	 * @param serviceName [required] Domain of the service
	 */
	public OvhHds serviceName_hds_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hds";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHds.class);
	}

	/**
	 * Enable Hds option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/hds/enable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_hds_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hds/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if Hds option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hds/canBeEnabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_hds_canBeEnabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hds/canBeEnabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Check if Hds option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hds/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_hds_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hds/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/serviceInfos
	 * @param serviceName [required] Domain of the service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicatedCloud/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Domain of the service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hcx
	 * @param serviceName [required] Domain of the service
	 */
	public OvhHcx serviceName_hcx_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hcx";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHcx.class);
	}

	/**
	 * Disable VMware Hybrid Cloud Extension option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/hcx/disable
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_hcx_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hcx/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if VMware Hybrid Cloud Extension option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hcx/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public Boolean serviceName_hcx_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hcx/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Check if VMware Hybrid Cloud Extension option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hcx/canBeEnabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public Boolean serviceName_hcx_canBeEnabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hcx/canBeEnabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Enable VMware Hybrid Cloud Extension option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/hcx/enable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_hcx_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hcx/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}
	 * @param serviceName [required] Domain of the service
	 * @param networkAccessId [required]
	 */
	public OvhAllowedNetwork serviceName_allowedNetwork_networkAccessId_GET(String serviceName, Long networkAccessId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}";
		StringBuilder sb = path(qPath, serviceName, networkAccessId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAllowedNetwork.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}
	 * @param body [required] New object properties
	 * @param serviceName [required] Domain of the service
	 * @param networkAccessId [required]
	 */
	public void serviceName_allowedNetwork_networkAccessId_PUT(String serviceName, Long networkAccessId, OvhAllowedNetwork body) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}";
		StringBuilder sb = path(qPath, serviceName, networkAccessId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove this network from your Private Cloud
	 *
	 * REST: DELETE /dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}
	 * @param serviceName [required] Domain of the service
	 * @param networkAccessId [required]
	 */
	public OvhTask serviceName_allowedNetwork_networkAccessId_DELETE(String serviceName, Long networkAccessId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}";
		StringBuilder sb = path(qPath, serviceName, networkAccessId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param networkAccessId [required]
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_allowedNetwork_networkAccessId_task_taskId_GET(String serviceName, Long networkAccessId, Long taskId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, networkAccessId, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restart task in error.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}/task/{taskId}/resetTaskState
	 * @param reason [required] Reason of task restart
	 * @param serviceName [required] Domain of the service
	 * @param networkAccessId [required]
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_allowedNetwork_networkAccessId_task_taskId_resetTaskState_POST(String serviceName, Long networkAccessId, Long taskId, String reason) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}/task/{taskId}/resetTaskState";
		StringBuilder sb = path(qPath, serviceName, networkAccessId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change the execution date of a maintenance. Works only if task type is maintenance and if it has not started yet.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}/task/{taskId}/changeMaintenanceExecutionDate
	 * @param executionDate [required] The new execution date
	 * @param serviceName [required] Domain of the service
	 * @param networkAccessId [required]
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_allowedNetwork_networkAccessId_task_taskId_changeMaintenanceExecutionDate_POST(String serviceName, Long networkAccessId, Long taskId, Date executionDate) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}/task/{taskId}/changeMaintenanceExecutionDate";
		StringBuilder sb = path(qPath, serviceName, networkAccessId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "executionDate", executionDate);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated with this allowed network
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}/task
	 * @param state [required] Filter the value of state property (=)
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] Domain of the service
	 * @param networkAccessId [required]
	 */
	public ArrayList<Long> serviceName_allowedNetwork_networkAccessId_task_GET(String serviceName, Long networkAccessId, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}/task";
		StringBuilder sb = path(qPath, serviceName, networkAccessId);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Networks allowed to access to this Private Cloud management interface
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/allowedNetwork
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_allowedNetwork_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new Allowed network for your dedicatedCloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/allowedNetwork
	 * @param network [required] Network name, e.g. 123.100.200.0/32
	 * @param description [required] Description for your ACL
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_allowedNetwork_POST(String serviceName, String description, String network) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "network", network);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List details about this IP Block
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/ip/{network}/details
	 * @param serviceName [required] Domain of the service
	 * @param network [required] IP ex: 213.186.33.34/24
	 */
	public ArrayList<OvhIpDetails> serviceName_ip_network_details_GET(String serviceName, String network) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/ip/{network}/details";
		StringBuilder sb = path(qPath, serviceName, network);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhIpDetails>> t2 = new TypeReference<ArrayList<OvhIpDetails>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/ip/{network}
	 * @param serviceName [required] Domain of the service
	 * @param network [required] IP ex: 213.186.33.34/24
	 */
	public OvhIp serviceName_ip_network_GET(String serviceName, String network) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/ip/{network}";
		StringBuilder sb = path(qPath, serviceName, network);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIp.class);
	}

	/**
	 * Change the execution date of a maintenance. Works only if task type is maintenance and if it has not started yet.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/ip/{network}/task/{taskId}/changeMaintenanceExecutionDate
	 * @param executionDate [required] The new execution date
	 * @param serviceName [required] Domain of the service
	 * @param network [required] IP ex: 213.186.33.34/24
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_ip_network_task_taskId_changeMaintenanceExecutionDate_POST(String serviceName, String network, Long taskId, Date executionDate) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/ip/{network}/task/{taskId}/changeMaintenanceExecutionDate";
		StringBuilder sb = path(qPath, serviceName, network, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "executionDate", executionDate);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restart task in error.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/ip/{network}/task/{taskId}/resetTaskState
	 * @param reason [required] Reason of task restart
	 * @param serviceName [required] Domain of the service
	 * @param network [required] IP ex: 213.186.33.34/24
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_ip_network_task_taskId_resetTaskState_POST(String serviceName, String network, Long taskId, String reason) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/ip/{network}/task/{taskId}/resetTaskState";
		StringBuilder sb = path(qPath, serviceName, network, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/ip/{network}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param network [required] IP ex: 213.186.33.34/24
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_ip_network_task_taskId_GET(String serviceName, String network, Long taskId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/ip/{network}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, network, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated with this IP Block
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/ip/{network}/task
	 * @param state [required] Filter the value of state property (=)
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] Domain of the service
	 * @param network [required] IP ex: 213.186.33.34/24
	 */
	public ArrayList<Long> serviceName_ip_network_task_GET(String serviceName, String network, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/ip/{network}/task";
		StringBuilder sb = path(qPath, serviceName, network);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Ip Blocks attached to this Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/ip
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_ip_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/ip";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/capabilities
	 * @param serviceName [required] Domain of the service
	 */
	public OvhCapabilities serviceName_capabilities_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/capabilities";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCapabilities.class);
	}

	/**
	 * Private Cloud vlans
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vlan
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_vlan_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vlan";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vlan/{vlanId}
	 * @param serviceName [required] Domain of the service
	 * @param vlanId [required]
	 */
	public OvhVlan serviceName_vlan_vlanId_GET(String serviceName, Long vlanId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vlan/{vlanId}";
		StringBuilder sb = path(qPath, serviceName, vlanId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVlan.class);
	}

	/**
	 * Order a new hourly Filer mounted in every Datacenter of a given Private Cloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/orderNewFilerHourly
	 * @param name [required] Filer profile you want to order
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_orderNewFilerHourly_POST(String serviceName, String name) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/orderNewFilerHourly";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}
	 * @param serviceName [required] Domain of the service
	 */
	public OvhDedicatedCloud serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDedicatedCloud.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicatedCloud/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public void serviceName_PUT(String serviceName, OvhDedicatedCloud body) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * VM Encryption KMS linked to this Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vmEncryption/kms
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_vmEncryption_kms_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vmEncryption/kms";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a new option user access
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/vmEncryption/kms
	 * @param description [required] Description of your option access network
	 * @param ip [required] IP address of the remote service, e.g. 123.100.200.0
	 * @param sslThumbprint [required] SSL thumbprint of the remote service, e.g. A7:61:68:...:61:91:2F
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_vmEncryption_kms_POST(String serviceName, String description, String ip, String sslThumbprint) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vmEncryption/kms";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "ip", ip);
		addBody(o, "sslThumbprint", sslThumbprint);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change option user access properties
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/vmEncryption/kms/{kmsId}/changeProperties
	 * @param description [required] Description of your option access network
	 * @param sslThumbprint [required] SSL thumbprint of the remote service, e.g. A7:61:68:...:61:91:2F
	 * @param serviceName [required] Domain of the service
	 * @param kmsId [required] Id of the VM Encryption KMS
	 */
	public OvhTask serviceName_vmEncryption_kms_kmsId_changeProperties_POST(String serviceName, Long kmsId, String description, String sslThumbprint) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vmEncryption/kms/{kmsId}/changeProperties";
		StringBuilder sb = path(qPath, serviceName, kmsId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "sslThumbprint", sslThumbprint);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vmEncryption/kms/{kmsId}
	 * @param serviceName [required] Domain of the service
	 * @param kmsId [required] Id of the VM Encryption KMS
	 */
	public OvhVMEncryptionAccessNetwork serviceName_vmEncryption_kms_kmsId_GET(String serviceName, Long kmsId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vmEncryption/kms/{kmsId}";
		StringBuilder sb = path(qPath, serviceName, kmsId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVMEncryptionAccessNetwork.class);
	}

	/**
	 * Remove an option user access
	 *
	 * REST: DELETE /dedicatedCloud/{serviceName}/vmEncryption/kms/{kmsId}
	 * @param serviceName [required] Domain of the service
	 * @param kmsId [required] Id of the VM Encryption KMS
	 */
	public OvhTask serviceName_vmEncryption_kms_kmsId_DELETE(String serviceName, Long kmsId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vmEncryption/kms/{kmsId}";
		StringBuilder sb = path(qPath, serviceName, kmsId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vmEncryption
	 * @param serviceName [required] Domain of the service
	 */
	public OvhVMEncryption serviceName_vmEncryption_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vmEncryption";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVMEncryption.class);
	}

	/**
	 * Enable vRealize Operations option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/vrops/enable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_vrops_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrops/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if vRealize Operations option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vrops/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_vrops_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrops/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Check if vRealize Operations option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vrops/canBeEnabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_vrops_canBeEnabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrops/canBeEnabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Disable vRealize Operations option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/vrops/disable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_vrops_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrops/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vrops
	 * @param serviceName [required] Domain of the service
	 */
	public OvhVrops serviceName_vrops_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrops";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVrops.class);
	}

	/**
	 * Update this Private Cloud properties.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/changeProperties
	 * @param userSessionTimeout [required] The timeout (in seconds) for the user sessions on the Private Cloud management interface. 0 value disable the timeout
	 * @param userLimitConcurrentSession [required] The maximum amount of connected users allowed on the Private Cloud management interface
	 * @param userLogoutPolicy [required] Logout policy of your Private Cloud
	 * @param sslV3 [required] Enable SSL v3 support. Warning: this option is not recommended as it was recognized as a security breach. If this is enabled, we advise you to enable the filtered User access policy
	 * @param userAccessPolicy [required] Access policy of your Private Cloud: opened to every IPs or filtered
	 * @param description [required] Description of your Private Cloud
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_changeProperties_POST(String serviceName, String description, Boolean sslV3, OvhUserAccessPolicyEnum userAccessPolicy, Long userLimitConcurrentSession, OvhUserLogoutPolicyEnum userLogoutPolicy, Long userSessionTimeout) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/changeProperties";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "sslV3", sslV3);
		addBody(o, "userAccessPolicy", userAccessPolicy);
		addBody(o, "userLimitConcurrentSession", userLimitConcurrentSession);
		addBody(o, "userLogoutPolicy", userLogoutPolicy);
		addBody(o, "userSessionTimeout", userSessionTimeout);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Active Directories linked to this Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/federation/activeDirectory
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_federation_activeDirectory_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/federation/activeDirectory";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a new option user access
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/federation/activeDirectory
	 * @param baseDnForGroups [required] Active Directory base DN for groups, e.g. dc=example,dc=com
	 * @param username [required] Active Directory username, e.g. jdoe@example.com
	 * @param baseDnForUsers [required] Active Directory base DN for users, e.g. dc=example,dc=com
	 * @param domainAlias [required] Active Directory NetBIOS name, e.g. example
	 * @param ip [required] IP address of the remote service, e.g. 123.100.200.0
	 * @param domainName [required] Active Directory domain name, e.g. example.com
	 * @param password [required] Active Directory password
	 * @param description [required] Description of your option access network
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_federation_activeDirectory_POST(String serviceName, String baseDnForGroups, String baseDnForUsers, String description, String domainAlias, String domainName, String ip, String password, String username) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/federation/activeDirectory";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "baseDnForGroups", baseDnForGroups);
		addBody(o, "baseDnForUsers", baseDnForUsers);
		addBody(o, "description", description);
		addBody(o, "domainAlias", domainAlias);
		addBody(o, "domainName", domainName);
		addBody(o, "ip", ip);
		addBody(o, "password", password);
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Grant Active Directory user
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/federation/activeDirectory/{activeDirectoryId}/grantActiveDirectoryUser
	 * @param username [required] Active Directory username, e.g. jdoe@example.com
	 * @param serviceName [required] Domain of the service
	 * @param activeDirectoryId [required] Id of the Active Directory
	 */
	public OvhTask serviceName_federation_activeDirectory_activeDirectoryId_grantActiveDirectoryUser_POST(String serviceName, Long activeDirectoryId, String username) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/federation/activeDirectory/{activeDirectoryId}/grantActiveDirectoryUser";
		StringBuilder sb = path(qPath, serviceName, activeDirectoryId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change Active Directory properties
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/federation/activeDirectory/{activeDirectoryId}/changeProperties
	 * @param password [required] Active Directory password
	 * @param description [required] Description of your option access network
	 * @param username [required] Active Directory username, e.g. jdoe@example.com
	 * @param serviceName [required] Domain of the service
	 * @param activeDirectoryId [required] Id of the Active Directory
	 */
	public OvhTask serviceName_federation_activeDirectory_activeDirectoryId_changeProperties_POST(String serviceName, Long activeDirectoryId, String description, String password, String username) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/federation/activeDirectory/{activeDirectoryId}/changeProperties";
		StringBuilder sb = path(qPath, serviceName, activeDirectoryId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "password", password);
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/federation/activeDirectory/{activeDirectoryId}
	 * @param serviceName [required] Domain of the service
	 * @param activeDirectoryId [required] Id of the Active Directory
	 */
	public OvhFederationAccessNetwork serviceName_federation_activeDirectory_activeDirectoryId_GET(String serviceName, Long activeDirectoryId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/federation/activeDirectory/{activeDirectoryId}";
		StringBuilder sb = path(qPath, serviceName, activeDirectoryId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFederationAccessNetwork.class);
	}

	/**
	 * Remove an option user access
	 *
	 * REST: DELETE /dedicatedCloud/{serviceName}/federation/activeDirectory/{activeDirectoryId}
	 * @param serviceName [required] Domain of the service
	 * @param activeDirectoryId [required] Id of the Active Directory
	 */
	public OvhTask serviceName_federation_activeDirectory_activeDirectoryId_DELETE(String serviceName, Long activeDirectoryId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/federation/activeDirectory/{activeDirectoryId}";
		StringBuilder sb = path(qPath, serviceName, activeDirectoryId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/federation
	 * @param serviceName [required] Domain of the service
	 */
	public OvhFederation serviceName_federation_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/federation";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFederation.class);
	}

	/**
	 * Filers mounted on all Datacenters of your Private Cloud Vsphere
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/filer
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_filer_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/filer";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Hourly consumption associated with this Filer
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/filer/{filerId}/hourlyConsumption
	 * @param serviceName [required] Domain of the service
	 * @param filerId [required] Filer Id
	 * @deprecated
	 */
	public OvhHourlyConsumption serviceName_filer_filerId_hourlyConsumption_GET(String serviceName, Long filerId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/filer/{filerId}/hourlyConsumption";
		StringBuilder sb = path(qPath, serviceName, filerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHourlyConsumption.class);
	}

	/**
	 * Tasks associated with this Filer
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/filer/{filerId}/task
	 * @param state [required] Filter the value of state property (=)
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] Domain of the service
	 * @param filerId [required] Filer Id
	 */
	public ArrayList<Long> serviceName_filer_filerId_task_GET(String serviceName, Long filerId, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/filer/{filerId}/task";
		StringBuilder sb = path(qPath, serviceName, filerId);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Change the execution date of a maintenance. Works only if task type is maintenance and if it has not started yet.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/filer/{filerId}/task/{taskId}/changeMaintenanceExecutionDate
	 * @param executionDate [required] The new execution date
	 * @param serviceName [required] Domain of the service
	 * @param filerId [required] Filer Id
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_filer_filerId_task_taskId_changeMaintenanceExecutionDate_POST(String serviceName, Long filerId, Long taskId, Date executionDate) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/filer/{filerId}/task/{taskId}/changeMaintenanceExecutionDate";
		StringBuilder sb = path(qPath, serviceName, filerId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "executionDate", executionDate);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restart task in error.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/filer/{filerId}/task/{taskId}/resetTaskState
	 * @param reason [required] Reason of task restart
	 * @param serviceName [required] Domain of the service
	 * @param filerId [required] Filer Id
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_filer_filerId_task_taskId_resetTaskState_POST(String serviceName, Long filerId, Long taskId, String reason) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/filer/{filerId}/task/{taskId}/resetTaskState";
		StringBuilder sb = path(qPath, serviceName, filerId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/filer/{filerId}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param filerId [required] Filer Id
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_filer_filerId_task_taskId_GET(String serviceName, Long filerId, Long taskId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/filer/{filerId}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, filerId, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/filer/{filerId}
	 * @param serviceName [required] Domain of the service
	 * @param filerId [required] Filer Id
	 */
	public OvhFiler serviceName_filer_filerId_GET(String serviceName, Long filerId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/filer/{filerId}";
		StringBuilder sb = path(qPath, serviceName, filerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFiler.class);
	}

	/**
	 * Remove the filer from your Private Cloud.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/filer/{filerId}/remove
	 * @param serviceName [required] Domain of the service
	 * @param filerId [required] Filer Id
	 */
	public OvhTask serviceName_filer_filerId_remove_POST(String serviceName, Long filerId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/filer/{filerId}/remove";
		StringBuilder sb = path(qPath, serviceName, filerId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Service Pack compliant with the current Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/servicePacks
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_servicePacks_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/servicePacks";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/servicePacks/{name}
	 * @param serviceName [required] Domain of the service
	 * @param name [required] Name of the Service Pack
	 */
	public OvhServicePack serviceName_servicePacks_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/servicePacks/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServicePack.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param filerId [required] Filer Id
	 */
	public OvhFiler serviceName_datacenter_datacenterId_filer_filerId_GET(String serviceName, Long datacenterId, Long filerId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId, filerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFiler.class);
	}

	/**
	 * Remove the filer from your Private Cloud.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/remove
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param filerId [required] Filer Id
	 */
	public OvhTask serviceName_datacenter_datacenterId_filer_filerId_remove_POST(String serviceName, Long datacenterId, Long filerId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/remove";
		StringBuilder sb = path(qPath, serviceName, datacenterId, filerId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated with this Filer
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/task
	 * @param state [required] Filter the value of state property (=)
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param filerId [required] Filer Id
	 */
	public ArrayList<Long> serviceName_datacenter_datacenterId_filer_filerId_task_GET(String serviceName, Long datacenterId, Long filerId, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/task";
		StringBuilder sb = path(qPath, serviceName, datacenterId, filerId);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Change the execution date of a maintenance. Works only if task type is maintenance and if it has not started yet.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/task/{taskId}/changeMaintenanceExecutionDate
	 * @param executionDate [required] The new execution date
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param filerId [required] Filer Id
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_datacenter_datacenterId_filer_filerId_task_taskId_changeMaintenanceExecutionDate_POST(String serviceName, Long datacenterId, Long filerId, Long taskId, Date executionDate) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/task/{taskId}/changeMaintenanceExecutionDate";
		StringBuilder sb = path(qPath, serviceName, datacenterId, filerId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "executionDate", executionDate);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param filerId [required] Filer Id
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_datacenter_datacenterId_filer_filerId_task_taskId_GET(String serviceName, Long datacenterId, Long filerId, Long taskId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId, filerId, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restart task in error.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/task/{taskId}/resetTaskState
	 * @param reason [required] Reason of task restart
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param filerId [required] Filer Id
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_datacenter_datacenterId_filer_filerId_task_taskId_resetTaskState_POST(String serviceName, Long datacenterId, Long filerId, Long taskId, String reason) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/task/{taskId}/resetTaskState";
		StringBuilder sb = path(qPath, serviceName, datacenterId, filerId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Hourly consumption associated with this Filer
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/hourlyConsumption
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param filerId [required] Filer Id
	 * @deprecated
	 */
	public OvhHourlyConsumption serviceName_datacenter_datacenterId_filer_filerId_hourlyConsumption_GET(String serviceName, Long datacenterId, Long filerId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/hourlyConsumption";
		StringBuilder sb = path(qPath, serviceName, datacenterId, filerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHourlyConsumption.class);
	}

	/**
	 * Filers associated with this Datacenter
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public ArrayList<Long> serviceName_datacenter_datacenterId_filer_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Tasks associated with this Datacenter
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/task
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public ArrayList<Long> serviceName_datacenter_datacenterId_task_GET(String serviceName, Long datacenterId, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/task";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Restart task in error.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/task/{taskId}/resetTaskState
	 * @param reason [required] Reason of task restart
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_datacenter_datacenterId_task_taskId_resetTaskState_POST(String serviceName, Long datacenterId, Long taskId, String reason) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/task/{taskId}/resetTaskState";
		StringBuilder sb = path(qPath, serviceName, datacenterId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_datacenter_datacenterId_task_taskId_GET(String serviceName, Long datacenterId, Long taskId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change the execution date of a maintenance. Works only if task type is maintenance and if it has not started yet.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/task/{taskId}/changeMaintenanceExecutionDate
	 * @param executionDate [required] The new execution date
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_datacenter_datacenterId_task_taskId_changeMaintenanceExecutionDate_POST(String serviceName, Long datacenterId, Long taskId, Date executionDate) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/task/{taskId}/changeMaintenanceExecutionDate";
		StringBuilder sb = path(qPath, serviceName, datacenterId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "executionDate", executionDate);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Virtual machiness associated with this Datacenter
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_datacenter_datacenterId_vm_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Restore this restore point
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/restoreBackup
	 * @param restorePointId [required] Id of the restorePoint you want to restore
	 * @param filerId [required] Id of the filer where we should restore this Backup
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 *
	 * API beta
	 */
	public OvhTask serviceName_datacenter_datacenterId_vm_vmId_restoreBackup_POST(String serviceName, Long datacenterId, Long vmId, Long filerId, Long restorePointId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/restoreBackup";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "filerId", filerId);
		addBody(o, "restorePointId", restorePointId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Edit backup on this virtual Machine
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/editBackup
	 * @param backupDays [required] List of days your Virtual Machine will be backuped
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 *
	 * API beta
	 */
	public OvhTask serviceName_datacenter_datacenterId_vm_vmId_editBackup_POST(String serviceName, Long datacenterId, Long vmId, OvhBackupDaysEnum[] backupDays) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/editBackup";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backupDays", backupDays);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Enable backup on this virtual Machine
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/enableBackup
	 * @param backupDays [required] List of days your Virtual Machine will be backuped
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 *
	 * API beta
	 */
	public OvhTask serviceName_datacenter_datacenterId_vm_vmId_enableBackup_POST(String serviceName, Long datacenterId, Long vmId, OvhBackupDaysEnum[] backupDays) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/enableBackup";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backupDays", backupDays);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Disable backup on this virtual Machine
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/disableBackup
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 *
	 * API beta
	 */
	public OvhTask serviceName_datacenter_datacenterId_vm_vmId_disableBackup_POST(String serviceName, Long datacenterId, Long vmId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/disableBackup";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 *
	 * API beta
	 */
	public OvhVm serviceName_datacenter_datacenterId_vm_vmId_GET(String serviceName, Long datacenterId, Long vmId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVm.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 * @deprecated
	 */
	public OvhBackupJob serviceName_datacenter_datacenterId_vm_vmId_backupJob_GET(String serviceName, Long datacenterId, Long vmId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupJob.class);
	}

	/**
	 * Edit a backup job
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob
	 * @param backupDays [required] List of days your Virtual Machine will be backuped
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 * @deprecated
	 */
	public OvhTask serviceName_datacenter_datacenterId_vm_vmId_backupJob_POST(String serviceName, Long datacenterId, Long vmId, OvhBackupDaysEnum[] backupDays) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backupDays", backupDays);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restore this restore point
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints/{restorePointId}/restore
	 * @param filerId [required] Id of the filer where we should restore this Backup.
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 * @param restorePointId [required] Id of the restore point.
	 * @deprecated
	 */
	public OvhTask serviceName_datacenter_datacenterId_vm_vmId_backupJob_restorePoints_restorePointId_restore_POST(String serviceName, Long datacenterId, Long vmId, Long restorePointId, Long filerId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints/{restorePointId}/restore";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId, restorePointId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "filerId", filerId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints/{restorePointId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 * @param restorePointId [required] Id of the restore point.
	 * @deprecated
	 */
	public OvhRestorePoint serviceName_datacenter_datacenterId_vm_vmId_backupJob_restorePoints_restorePointId_GET(String serviceName, Long datacenterId, Long vmId, Long restorePointId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints/{restorePointId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId, restorePointId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRestorePoint.class);
	}

	/**
	 * Restore point associated to this Backup Job
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 * @deprecated
	 */
	public ArrayList<Long> serviceName_datacenter_datacenterId_vm_vmId_backupJob_restorePoints_GET(String serviceName, Long datacenterId, Long vmId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Disable backup solution on this virtual Machine
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/disable
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 * @deprecated
	 */
	public OvhTask serviceName_datacenter_datacenterId_vm_vmId_backupJob_disable_POST(String serviceName, Long datacenterId, Long vmId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/disable";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Enable backup solution on this virtual Machine
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/enable
	 * @param backupDays [required] Backup offer type
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 * @deprecated
	 */
	public OvhTask serviceName_datacenter_datacenterId_vm_vmId_backupJob_enable_POST(String serviceName, Long datacenterId, Long vmId, OvhBackupDaysEnum[] backupDays) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/enable";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backupDays", backupDays);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available hosts in a given Private Cloud Datacenter
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public ArrayList<OvhProfile> serviceName_datacenter_datacenterId_orderableHostProfiles_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhProfile>> t4 = new TypeReference<ArrayList<OvhProfile>>() {};

	/**
	 * Hosts associated with this Datacenter
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public ArrayList<Long> serviceName_datacenter_datacenterId_host_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Hourly consumption associated with this host.
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/hourlyConsumption
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param hostId [required] Id of the host
	 * @deprecated
	 */
	public net.minidev.ovh.api.dedicatedcloud.host.OvhHourlyConsumption serviceName_datacenter_datacenterId_host_hostId_hourlyConsumption_GET(String serviceName, Long datacenterId, Long hostId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/hourlyConsumption";
		StringBuilder sb = path(qPath, serviceName, datacenterId, hostId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.dedicatedcloud.host.OvhHourlyConsumption.class);
	}

	/**
	 * Add a spare host to your Private Cloud.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/addHostSpare
	 * @param reason [required] Reason of spare add
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param hostId [required] Id of the host
	 */
	public OvhTask serviceName_datacenter_datacenterId_host_hostId_addHostSpare_POST(String serviceName, Long datacenterId, Long hostId, String reason) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/addHostSpare";
		StringBuilder sb = path(qPath, serviceName, datacenterId, hostId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated with this Host
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/task
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param hostId [required] Id of the host
	 */
	public ArrayList<Long> serviceName_datacenter_datacenterId_host_hostId_task_GET(String serviceName, Long datacenterId, Long hostId, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/task";
		StringBuilder sb = path(qPath, serviceName, datacenterId, hostId);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Restart task in error.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/task/{taskId}/resetTaskState
	 * @param reason [required] Reason of task restart
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param hostId [required] Id of the host
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_datacenter_datacenterId_host_hostId_task_taskId_resetTaskState_POST(String serviceName, Long datacenterId, Long hostId, Long taskId, String reason) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/task/{taskId}/resetTaskState";
		StringBuilder sb = path(qPath, serviceName, datacenterId, hostId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param hostId [required] Id of the host
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_datacenter_datacenterId_host_hostId_task_taskId_GET(String serviceName, Long datacenterId, Long hostId, Long taskId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId, hostId, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change the execution date of a maintenance. Works only if task type is maintenance and if it has not started yet.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/task/{taskId}/changeMaintenanceExecutionDate
	 * @param executionDate [required] The new execution date
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param hostId [required] Id of the host
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_datacenter_datacenterId_host_hostId_task_taskId_changeMaintenanceExecutionDate_POST(String serviceName, Long datacenterId, Long hostId, Long taskId, Date executionDate) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/task/{taskId}/changeMaintenanceExecutionDate";
		StringBuilder sb = path(qPath, serviceName, datacenterId, hostId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "executionDate", executionDate);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Remove the host from your Private Cloud.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/remove
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param hostId [required] Id of the host
	 */
	public OvhTask serviceName_datacenter_datacenterId_host_hostId_remove_POST(String serviceName, Long datacenterId, Long hostId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/remove";
		StringBuilder sb = path(qPath, serviceName, datacenterId, hostId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param hostId [required] Id of the host
	 */
	public OvhHost serviceName_datacenter_datacenterId_host_hostId_GET(String serviceName, Long datacenterId, Long hostId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId, hostId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHost.class);
	}

	/**
	 * Order a new hourly Filer in a given Datacenter
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderNewFilerHourly
	 * @param name [required] Filer profile you want to order
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public OvhTask serviceName_datacenter_datacenterId_orderNewFilerHourly_POST(String serviceName, Long datacenterId, String name) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderNewFilerHourly";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available filers in a given Private Cloud Datacenter
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public ArrayList<net.minidev.ovh.api.dedicatedcloud.filer.OvhProfile> serviceName_datacenter_datacenterId_orderableFilerProfiles_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<net.minidev.ovh.api.dedicatedcloud.filer.OvhProfile>> t5 = new TypeReference<ArrayList<net.minidev.ovh.api.dedicatedcloud.filer.OvhProfile>>() {};

	/**
	 * Disable Single site Zerto
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zertoSingle/disable
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 *
	 * API beta
	 */
	public OvhTask serviceName_datacenter_datacenterId_disasterRecovery_zertoSingle_disable_POST(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zertoSingle/disable";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Configure vpn between your OVH Private Cloud and your onsite infrastructure
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zertoSingle/configureVpn
	 * @param preSharedKey [required] Pre-Shared Key to secure data transfer between both sites
	 * @param remoteEndpointPublicIp [required] Your onsite endpoint public IP for the secured replication data tunnel
	 * @param remoteVraNetwork [required] Internal zerto subnet of your onsite infrastructure (ip/cidr)
	 * @param remoteZvmInternalIp [required] Internal ZVM ip of your onsite infrastructure
	 * @param remoteEndpointInternalIp [required] Your onsite endpoint internal IP for the secured replication data tunnel
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 *
	 * API beta
	 */
	public OvhTask serviceName_datacenter_datacenterId_disasterRecovery_zertoSingle_configureVpn_POST(String serviceName, Long datacenterId, String preSharedKey, String remoteEndpointInternalIp, String remoteEndpointPublicIp, String remoteVraNetwork, String remoteZvmInternalIp) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zertoSingle/configureVpn";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "preSharedKey", preSharedKey);
		addBody(o, "remoteEndpointInternalIp", remoteEndpointInternalIp);
		addBody(o, "remoteEndpointPublicIp", remoteEndpointPublicIp);
		addBody(o, "remoteVraNetwork", remoteVraNetwork);
		addBody(o, "remoteZvmInternalIp", remoteZvmInternalIp);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the default localVraNetwork subnet suggested by OVH
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zertoSingle/defaultLocalVraNetwork
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public String serviceName_datacenter_datacenterId_disasterRecovery_zertoSingle_defaultLocalVraNetwork_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zertoSingle/defaultLocalVraNetwork";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Enable Zerto replication between your OVH Private Cloud and your onsite infrastructure
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zertoSingle/enable
	 * @param localVraNetwork [required] Internal zerto subnet for your OVH Private Cloud (ip/cidr)
	 * @param remoteVraNetwork [required] Internal zerto subnet of your onsite infrastructure (ip/cidr)
	 * @param ovhEndpointIp [required] Your OVH Private Cloud public IP for the secured replication data tunnel endpoint
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @deprecated
	 */
	public OvhTask serviceName_datacenter_datacenterId_disasterRecovery_zertoSingle_enable_POST(String serviceName, Long datacenterId, String localVraNetwork, String ovhEndpointIp, String remoteVraNetwork) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zertoSingle/enable";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "localVraNetwork", localVraNetwork);
		addBody(o, "ovhEndpointIp", ovhEndpointIp);
		addBody(o, "remoteVraNetwork", remoteVraNetwork);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the current state of Zerto deployment on your dedicated Cloud.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zerto/state
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 *
	 * API beta
	 */
	public net.minidev.ovh.api.dedicatedcloud.disasterrecovery.OvhProfile serviceName_datacenter_datacenterId_disasterRecovery_zerto_state_POST(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zerto/state";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.dedicatedcloud.disasterrecovery.OvhProfile.class);
	}

	/**
	 * Generate a new password for Zerto Self Service Portal and receive it by email.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zerto/generateZsspPassword
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 *
	 * API beta
	 */
	public OvhTask serviceName_datacenter_datacenterId_disasterRecovery_zerto_generateZsspPassword_POST(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zerto/generateZsspPassword";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Enable Zerto replication between 2 OVH dedicated Clouds
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zerto/enable
	 * @param secondaryEndpointIp [required] Your secondary OVH Private Cloud public IP for the secured replication data tunnel endpoint
	 * @param secondaryDatacenterId [required] Your secondary datacenter id
	 * @param secondaryServiceName [required] Your secondary OVH Private Cloud
	 * @param primaryEndpointIp [required] Your primary OVH Private Cloud public IP for the secured replication data tunnel endpoint
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @deprecated
	 */
	public OvhTask serviceName_datacenter_datacenterId_disasterRecovery_zerto_enable_POST(String serviceName, Long datacenterId, String primaryEndpointIp, Long secondaryDatacenterId, String secondaryEndpointIp, String secondaryServiceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zerto/enable";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "primaryEndpointIp", primaryEndpointIp);
		addBody(o, "secondaryDatacenterId", secondaryDatacenterId);
		addBody(o, "secondaryEndpointIp", secondaryEndpointIp);
		addBody(o, "secondaryServiceName", secondaryServiceName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Disable Zerto
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zerto/disable
	 * @param secondaryDatacenterId [required] Your secondary datacenter id
	 * @param secondaryServiceName [required] Your secondary dedicatedCloud
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 *
	 * API beta
	 */
	public OvhTask serviceName_datacenter_datacenterId_disasterRecovery_zerto_disable_POST(String serviceName, Long datacenterId, Long secondaryDatacenterId, String secondaryServiceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/disasterRecovery/zerto/disable";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "secondaryDatacenterId", secondaryDatacenterId);
		addBody(o, "secondaryServiceName", secondaryServiceName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Enable backup solution on a Private Cloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup/enable
	 * @param backupOffer [required] Backup offer type
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @deprecated
	 */
	public OvhTask serviceName_datacenter_datacenterId_backup_enable_POST(String serviceName, Long datacenterId, OvhOfferTypeEnum backupOffer) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup/enable";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backupOffer", backupOffer);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Edit the backup on a Private Cloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup/changeProperties
	 * @param mailAddress [required] Unique additional email address for backup daily report
	 * @param scheduleHour [required] Schedule hour for start backup. UTC Timezone
	 * @param backupOffer [required] Backup offer type
	 * @param fullDayInReport [required] Full day on mail report
	 * @param backupDurationInReport [required] Duration on email report
	 * @param restorePointInReport [required] RestorePoint number on mail report
	 * @param diskSizeInReport [required] Disk size on mail report
	 * @param backupSizeInReport [required] Backup size on day on email report
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public OvhTask serviceName_datacenter_datacenterId_backup_changeProperties_POST(String serviceName, Long datacenterId, Boolean backupDurationInReport, OvhOfferTypeEnum backupOffer, Boolean backupSizeInReport, Boolean diskSizeInReport, Boolean fullDayInReport, String mailAddress, Boolean restorePointInReport, Date scheduleHour) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup/changeProperties";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backupDurationInReport", backupDurationInReport);
		addBody(o, "backupOffer", backupOffer);
		addBody(o, "backupSizeInReport", backupSizeInReport);
		addBody(o, "diskSizeInReport", diskSizeInReport);
		addBody(o, "fullDayInReport", fullDayInReport);
		addBody(o, "mailAddress", mailAddress);
		addBody(o, "restorePointInReport", restorePointInReport);
		addBody(o, "scheduleHour", scheduleHour);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Disable backup solution on a Private Cloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup/disable
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public OvhTask serviceName_datacenter_datacenterId_backup_disable_POST(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup/disable";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public OvhBackup serviceName_datacenter_datacenterId_backup_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackup.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public OvhDatacenter serviceName_datacenter_datacenterId_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDatacenter.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicatedCloud/{serviceName}/datacenter/{datacenterId}
	 * @param body [required] New object properties
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public void serviceName_datacenter_datacenterId_PUT(String serviceName, Long datacenterId, OvhDatacenter body) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove this Datacenter from your Private Cloud. (It has to be empty in order to be removable)
	 *
	 * REST: DELETE /dedicatedCloud/{serviceName}/datacenter/{datacenterId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public OvhTask serviceName_datacenter_datacenterId_DELETE(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Order a new hourly Host in a given Datacenter
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderNewHostHourly
	 * @param name [required] Host profile you want to order
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public OvhTask serviceName_datacenter_datacenterId_orderNewHostHourly_POST(String serviceName, Long datacenterId, String name) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderNewHostHourly";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Datacenters associated with this Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_datacenter_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a new Datacenter in your Private Cloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter
	 * @param vrackName [required] Name of the Vrack link to the new datacenter.
	 * @param commercialRangeName [required] The commercial range of this new datacenter. You can see what commercial ranges are orderable on this API section : /dedicatedCloud/commercialRange/
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_datacenter_POST(String serviceName, String commercialRangeName, String vrackName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "commercialRangeName", commercialRangeName);
		addBody(o, "vrackName", vrackName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Disable Nsx option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/nsx/disable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_nsx_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/nsx/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/nsx
	 * @param serviceName [required] Domain of the service
	 */
	public OvhNsx serviceName_nsx_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/nsx";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNsx.class);
	}

	/**
	 * Enable Nsx option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/nsx/enable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_nsx_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/nsx/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if Nsx option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/nsx/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_nsx_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/nsx/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Check if Nsx option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/nsx/canBeEnabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_nsx_canBeEnabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/nsx/canBeEnabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Get filtered tasks associated with this Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/globalTasks
	 * @param hostId [required] Filter the tasks by host Id
	 * @param datacenterId [required] Filter the tasks by datacenter Id
	 * @param executionDate_to [required] Filter the tasks by execution date (<=)
	 * @param orderId [required] Filter the tasks by order Id
	 * @param lastModificationDate_from [required] Filter the tasks by last modification date (>=)
	 * @param lastModificationDate_to [required] Filter the tasks by last modification date (<=)
	 * @param userId [required] Filter the tasks by user Id
	 * @param endDate_from [required] Filter the tasks by end date (>=)
	 * @param parentTaskId [required] Filter the tasks by parent task Id
	 * @param endDate_to [required] Filter the tasks by end date (<=)
	 * @param name [required] Filter the tasks by name
	 * @param networkAccessId [required] Filter the tasks by network access Id
	 * @param state [required] Filter the tasks by state
	 * @param filerId [required] Filter the tasks by filer Id
	 * @param executionDate_from [required] Filter the tasks by execution date (>=)
	 * @param vlanId [required] Filter the tasks by vlan Id
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_globalTasks_GET(String serviceName, Long datacenterId, Date endDate_from, Date endDate_to, Date executionDate_from, Date executionDate_to, Long filerId, Long hostId, Date lastModificationDate_from, Date lastModificationDate_to, String name, Long networkAccessId, Long orderId, Long parentTaskId, OvhTaskStateEnum[] state, Long userId, Long vlanId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/globalTasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "datacenterId", datacenterId);
		query(sb, "endDate.from", endDate_from);
		query(sb, "endDate.to", endDate_to);
		query(sb, "executionDate.from", executionDate_from);
		query(sb, "executionDate.to", executionDate_to);
		query(sb, "filerId", filerId);
		query(sb, "hostId", hostId);
		query(sb, "lastModificationDate.from", lastModificationDate_from);
		query(sb, "lastModificationDate.to", lastModificationDate_to);
		query(sb, "name", name);
		query(sb, "networkAccessId", networkAccessId);
		query(sb, "orderId", orderId);
		query(sb, "parentTaskId", parentTaskId);
		query(sb, "state", state);
		query(sb, "userId", userId);
		query(sb, "vlanId", vlanId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vrack/{vrack}
	 * @param serviceName [required] Domain of the service
	 * @param vrack [required] vrack name
	 */
	public net.minidev.ovh.api.vrack.OvhDedicatedCloud serviceName_vrack_vrack_GET(String serviceName, String vrack) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrack/{vrack}";
		StringBuilder sb = path(qPath, serviceName, vrack);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.vrack.OvhDedicatedCloud.class);
	}

	/**
	 * remove this dedicatedCloud (VmNetwork) from this vrack
	 *
	 * REST: DELETE /dedicatedCloud/{serviceName}/vrack/{vrack}
	 * @param serviceName [required] Domain of the service
	 * @param vrack [required] vrack name
	 */
	public net.minidev.ovh.api.vrack.OvhTask serviceName_vrack_vrack_DELETE(String serviceName, String vrack) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrack/{vrack}";
		StringBuilder sb = path(qPath, serviceName, vrack);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.vrack.OvhTask.class);
	}

	/**
	 * This Private Cloud vrack
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vrack
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_vrack_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrack";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get the name of the commercial ranges orderable in your Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/commercialRange/orderable
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_commercialRange_orderable_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/commercialRange/orderable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get the name of the commercial ranges compliant with your Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/commercialRange/compliance
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_commercialRange_compliance_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/commercialRange/compliance";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/changeContact
	 * @param contactAdmin [required] The contact to set as admin contact
	 * @param contactTech [required] The contact to set as tech contact
	 * @param contactBilling [required] The contact to set as billing contact
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}

	/**
	 * Get the countries you can select in /order/dedicatedCloud/{serviceName}/ip
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/orderableIpCountries
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhIpCountriesEnum> serviceName_orderableIpCountries_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/orderableIpCountries";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhIpCountriesEnum>> t6 = new TypeReference<ArrayList<OvhIpCountriesEnum>>() {};

	/**
	 * Get the current password policy for your Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/passwordPolicy
	 * @param serviceName [required] Domain of the service
	 */
	public OvhPasswordPolicy serviceName_passwordPolicy_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/passwordPolicy";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPasswordPolicy.class);
	}

	/**
	 * Check if Hipaa option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hipaa/canBeEnabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_hipaa_canBeEnabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hipaa/canBeEnabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Check if Hipaa option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hipaa/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_hipaa_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hipaa/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Enable Hipaa option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/hipaa/enable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_hipaa_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hipaa/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hipaa
	 * @param serviceName [required] Domain of the service
	 */
	public OvhHipaa serviceName_hipaa_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hipaa";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHipaa.class);
	}

	/**
	 * Disable Hipaa option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/hipaa/disable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_hipaa_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hipaa/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Reset all triggered alarms on PCC
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/resetTriggeredAlarm
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_resetTriggeredAlarm_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/resetTriggeredAlarm";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Ip allowed to bypass the two factor authentication on this Private Cloud management interface
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/twoFAWhitelist
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_twoFAWhitelist_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/twoFAWhitelist";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a whitelisted ip on the two factor authentication
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/twoFAWhitelist
	 * @param description [required] Description of the exception
	 * @param ip [required] IP address of the remote service, e.g. 123.100.200.0
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_twoFAWhitelist_POST(String serviceName, String description, String ip) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/twoFAWhitelist";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "ip", ip);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/twoFAWhitelist/{id}
	 * @param serviceName [required] Domain of the service
	 * @param id [required] Id of the trusted IP
	 */
	public OvhTwoFAWhitelist serviceName_twoFAWhitelist_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/twoFAWhitelist/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTwoFAWhitelist.class);
	}

	/**
	 * Remove a whitelisted ip on the two factor authentication
	 *
	 * REST: DELETE /dedicatedCloud/{serviceName}/twoFAWhitelist/{id}
	 * @param serviceName [required] Domain of the service
	 * @param id [required] Id of the trusted IP
	 */
	public OvhTask serviceName_twoFAWhitelist_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/twoFAWhitelist/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change Private Cloud Two facter authentication whitelist properties
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/twoFAWhitelist/{id}/changeProperties
	 * @param description [required] Description of your whitelist
	 * @param serviceName [required] Domain of the service
	 * @param id [required] Id of the trusted IP
	 */
	public OvhTask serviceName_twoFAWhitelist_id_changeProperties_POST(String serviceName, Long id, String description) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/twoFAWhitelist/{id}/changeProperties";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restart task in error.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/task/{taskId}/resetTaskState
	 * @param reason [required] Reason of task restart
	 * @param serviceName [required] Domain of the service
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_task_taskId_resetTaskState_POST(String serviceName, Long taskId, String reason) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/task/{taskId}/resetTaskState";
		StringBuilder sb = path(qPath, serviceName, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change the execution date of a maintenance. Works only if task type is maintenance and if it has not started yet.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/task/{taskId}/changeMaintenanceExecutionDate
	 * @param executionDate [required] The new execution date
	 * @param serviceName [required] Domain of the service
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_task_taskId_changeMaintenanceExecutionDate_POST(String serviceName, Long taskId, Date executionDate) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/task/{taskId}/changeMaintenanceExecutionDate";
		StringBuilder sb = path(qPath, serviceName, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "executionDate", executionDate);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated with this Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/task
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get the new Prices for your Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/newPrices
	 * @param serviceName [required] Domain of the service
	 */
	public OvhResourceNewPrices serviceName_newPrices_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/newPrices";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResourceNewPrices.class);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/terminate
	 * @param serviceName [required] Domain of the service
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Enable PCI-DSS option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/pcidss/enable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_pcidss_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/pcidss/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if PCI-DSS option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/pcidss/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_pcidss_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/pcidss/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Check if PCI-DSS option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/pcidss/canBeEnabled
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhOptionCompatibility serviceName_pcidss_canBeEnabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/pcidss/canBeEnabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Disable PCI-DSS option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/pcidss/disable
	 * @param serviceName [required] Domain of the service
	 * @deprecated
	 */
	public OvhTask serviceName_pcidss_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/pcidss/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/pcidss
	 * @param serviceName [required] Domain of the service
	 */
	public OvhPciDss serviceName_pcidss_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/pcidss";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPciDss.class);
	}

	/**
	 * Private Cloud users
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/user
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_user_GET(String serviceName, String name) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "name", name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new User in your Private Cloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/user
	 * @param lastName [required] Last name of the user
	 * @param email [required] The user email. If this field is empty, user informations will be sent to the dedicatedCloud administrator contact.
	 * @param receiveAlerts [required] Defines if the user receives technical alerts
	 * @param firstName [required] First name of the user
	 * @param name [required] Name of the user (login)
	 * @param tokenValidator [required] Defines if the user can confirm security tokens (if a compatible option is enabled)
	 * @param networkRole [required] Determine how this user will be able to act on this Private Cloud v(x)Lans
	 * @param canAddRessource [required] Is this User able to add ressources in the Datacenter he has access ? (default is no right to add ressource)
	 * @param vmNetworkRole [required] Determine how this user will be able to act on this Private Cloud VM Network
	 * @param phoneNumber [required] Mobile phone number of the user
	 * @param expirationDate [required] Date of removal of the user.
	 * @param nsxRight [required] Is this User able to access nsx interface (requires NSX option)
	 * @param right [required] Determine what kind of access the User will have in all Datacenters of your Private Cloud (default is disabled)
	 * @param password [required] The user password. It must fits your Private Cloud password policy. If this field is empty, a random password will be generated and sent by email.
	 * @param canManageRights [required] Is this user able to manage the users rights
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_user_POST(String serviceName, Boolean canAddRessource, Boolean canManageRights, String email, Date expirationDate, String firstName, String lastName, String name, OvhNetworkRoleEnum networkRole, Boolean nsxRight, String password, String phoneNumber, Boolean receiveAlerts, OvhRightEnum right, Boolean tokenValidator, OvhVmNetworkRoleEnum vmNetworkRole) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "canAddRessource", canAddRessource);
		addBody(o, "canManageRights", canManageRights);
		addBody(o, "email", email);
		addBody(o, "expirationDate", expirationDate);
		addBody(o, "firstName", firstName);
		addBody(o, "lastName", lastName);
		addBody(o, "name", name);
		addBody(o, "networkRole", networkRole);
		addBody(o, "nsxRight", nsxRight);
		addBody(o, "password", password);
		addBody(o, "phoneNumber", phoneNumber);
		addBody(o, "receiveAlerts", receiveAlerts);
		addBody(o, "right", right);
		addBody(o, "tokenValidator", tokenValidator);
		addBody(o, "vmNetworkRole", vmNetworkRole);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * User rights in a given Datacenters
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/user/{userId}/right
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public ArrayList<Long> serviceName_user_userId_right_GET(String serviceName, Long userId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/right";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/user/{userId}/right/{rightId}
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 * @param rightId [required]
	 */
	public OvhRight serviceName_user_userId_right_rightId_GET(String serviceName, Long userId, Long rightId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/right/{rightId}";
		StringBuilder sb = path(qPath, serviceName, userId, rightId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRight.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicatedCloud/{serviceName}/user/{userId}/right/{rightId}
	 * @param body [required] New object properties
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 * @param rightId [required]
	 */
	public void serviceName_user_userId_right_rightId_PUT(String serviceName, Long userId, Long rightId, OvhRight body) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/right/{rightId}";
		StringBuilder sb = path(qPath, serviceName, userId, rightId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/user/{userId}/objectRight/{objectRightId}
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 * @param objectRightId [required]
	 */
	public OvhObjectRight serviceName_user_userId_objectRight_objectRightId_GET(String serviceName, Long userId, Long objectRightId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/objectRight/{objectRightId}";
		StringBuilder sb = path(qPath, serviceName, userId, objectRightId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhObjectRight.class);
	}

	/**
	 * Remove an object right from user in datacenter on Private Cloud
	 *
	 * REST: DELETE /dedicatedCloud/{serviceName}/user/{userId}/objectRight/{objectRightId}
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 * @param objectRightId [required]
	 */
	public OvhTask serviceName_user_userId_objectRight_objectRightId_DELETE(String serviceName, Long userId, Long objectRightId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/objectRight/{objectRightId}";
		StringBuilder sb = path(qPath, serviceName, userId, objectRightId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * User rights on an object
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/user/{userId}/objectRight
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public ArrayList<Long> serviceName_user_userId_objectRight_GET(String serviceName, Long userId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/objectRight";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a new object right to user in datacenter on Private Cloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/user/{userId}/objectRight
	 * @param vmwareObjectId [required] The VMware MoRef of the object
	 * @param type [required] Type of the object
	 * @param right [required] User access on the VMware object
	 * @param propagate [required] Right propagation on children objects
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public OvhTask serviceName_user_userId_objectRight_POST(String serviceName, Long userId, Boolean propagate, OvhRightEnum right, OvhUserObjectRightTypeEnum type, String vmwareObjectId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/objectRight";
		StringBuilder sb = path(qPath, serviceName, userId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "propagate", propagate);
		addBody(o, "right", right);
		addBody(o, "type", type);
		addBody(o, "vmwareObjectId", vmwareObjectId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change Private Cloud user password
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/user/{userId}/changePassword
	 * @param password [required] New password for this Private Cloud user. It must fits your Private Cloud password policy. If this field is empty, a random password will be generated and sent by email.
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public OvhTask serviceName_user_userId_changePassword_POST(String serviceName, Long userId, String password) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/changePassword";
		StringBuilder sb = path(qPath, serviceName, userId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Enable the given Private Cloud user
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/user/{userId}/enable
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public OvhTask serviceName_user_userId_enable_POST(String serviceName, Long userId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/enable";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/user/{userId}
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public OvhUser serviceName_user_userId_GET(String serviceName, Long userId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Remove a given user from your Private Cloud
	 *
	 * REST: DELETE /dedicatedCloud/{serviceName}/user/{userId}
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public OvhTask serviceName_user_userId_DELETE(String serviceName, Long userId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Disable the given Private Cloud user
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/user/{userId}/disable
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public OvhTask serviceName_user_userId_disable_POST(String serviceName, Long userId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/disable";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated with this User
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/user/{userId}/task
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public ArrayList<Long> serviceName_user_userId_task_GET(String serviceName, Long userId, String name, OvhTaskStateEnum state) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/task";
		StringBuilder sb = path(qPath, serviceName, userId);
		query(sb, "name", name);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Restart task in error.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/user/{userId}/task/{taskId}/resetTaskState
	 * @param reason [required] Reason of task restart
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_user_userId_task_taskId_resetTaskState_POST(String serviceName, Long userId, Long taskId, String reason) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/task/{taskId}/resetTaskState";
		StringBuilder sb = path(qPath, serviceName, userId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/user/{userId}/task/{taskId}
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_user_userId_task_taskId_GET(String serviceName, Long userId, Long taskId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, userId, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change the execution date of a maintenance. Works only if task type is maintenance and if it has not started yet.
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/user/{userId}/task/{taskId}/changeMaintenanceExecutionDate
	 * @param executionDate [required] The new execution date
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 * @param taskId [required] Task id
	 */
	public OvhTask serviceName_user_userId_task_taskId_changeMaintenanceExecutionDate_POST(String serviceName, Long userId, Long taskId, Date executionDate) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/task/{taskId}/changeMaintenanceExecutionDate";
		StringBuilder sb = path(qPath, serviceName, userId, taskId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "executionDate", executionDate);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change Private Cloud user properties
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/user/{userId}/changeProperties
	 * @param canManageIpFailOvers [required] Defines if the user can manage ip failovers
	 * @param tokenValidator [required] Defines if the user can confirm security tokens (if a compatible option is enabled)
	 * @param firstName [required] First name of the user
	 * @param receiveAlerts [required] Defines if the user receives technical alerts
	 * @param lastName [required] Last name of the user
	 * @param canManageNetwork [required] Defines if the user can manage the network
	 * @param email [required] Email address of the user
	 * @param canManageRights [required] Defines if the user can manage the users rights
	 * @param phoneNumber [required] Mobile phone number of the user in international format (+prefix.number)
	 * @param nsxRight [required] Is this User able to access nsx interface (requires NSX option)
	 * @param fullAdminRo [required] Defines if the user is a full admin in readonly
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public OvhTask serviceName_user_userId_changeProperties_POST(String serviceName, Long userId, Boolean canManageIpFailOvers, Boolean canManageNetwork, Boolean canManageRights, String email, String firstName, Boolean fullAdminRo, String lastName, Boolean nsxRight, String phoneNumber, Boolean receiveAlerts, Boolean tokenValidator) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/changeProperties";
		StringBuilder sb = path(qPath, serviceName, userId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "canManageIpFailOvers", canManageIpFailOvers);
		addBody(o, "canManageNetwork", canManageNetwork);
		addBody(o, "canManageRights", canManageRights);
		addBody(o, "email", email);
		addBody(o, "firstName", firstName);
		addBody(o, "fullAdminRo", fullAdminRo);
		addBody(o, "lastName", lastName);
		addBody(o, "nsxRight", nsxRight);
		addBody(o, "phoneNumber", phoneNumber);
		addBody(o, "receiveAlerts", receiveAlerts);
		addBody(o, "tokenValidator", tokenValidator);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get ovh id from object type
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/vendor/ovhId
	 * @param objectType [required] object type
	 * @param vendorId [required] object type id
	 * @param serviceName [required] Domain of the service
	 */
	public OvhOvhId serviceName_vendor_ovhId_POST(String serviceName, OvhVendorObjectTypeEnum objectType, String vendorId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vendor/ovhId";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "objectType", objectType);
		addBody(o, "vendorId", vendorId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhId.class);
	}

	/**
	 * Get available object types
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/vendor/objectType
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_vendor_objectType_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vendor/objectType";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vendor
	 * @param serviceName [required] Domain of the service
	 */
	public OvhVendor serviceName_vendor_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vendor";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVendor.class);
	}

	/**
	 * Robots that can run on this Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/robot
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_robot_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/robot";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/robot/{name}
	 * @param serviceName [required] Domain of the service
	 * @param name [required] The name of this robot
	 */
	public OvhRobot serviceName_robot_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/robot/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRobot.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] Domain of the service
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/confirmTermination";
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
	 * Upgrade your hypervisor to the next released version
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/upgradeHypervisor
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_upgradeHypervisor_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/upgradeHypervisor";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of commercial Ranges available in a Dedicated Cloud
	 *
	 * REST: GET /dedicatedCloud/commercialRange
	 */
	public ArrayList<String> commercialRange_GET() throws IOException {
		String qPath = "/dedicatedCloud/commercialRange";
		StringBuilder sb = path(qPath);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/commercialRange/{commercialRangeName}
	 * @param commercialRangeName [required] The name of this commercial range
	 */
	public OvhCommercialRange commercialRange_commercialRangeName_GET(String commercialRangeName) throws IOException {
		String qPath = "/dedicatedCloud/commercialRange/{commercialRangeName}";
		StringBuilder sb = path(qPath, commercialRangeName);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCommercialRange.class);
	}

	/**
	 * List of locations available in a Dedicated Cloud
	 *
	 * REST: GET /dedicatedCloud/location
	 */
	public ArrayList<String> location_GET() throws IOException {
		String qPath = "/dedicatedCloud/location";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Offered hypervisor version
	 *
	 * REST: GET /dedicatedCloud/location/{pccZone}/hypervisor
	 * @param pccZone [required] Name of pccZone
	 */
	public ArrayList<String> location_pccZone_hypervisor_GET(String pccZone) throws IOException {
		String qPath = "/dedicatedCloud/location/{pccZone}/hypervisor";
		StringBuilder sb = path(qPath, pccZone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/location/{pccZone}/hypervisor/{shortName}
	 * @param pccZone [required] Name of pccZone
	 * @param shortName [required] Short name of hypervisor
	 */
	public OvhOs location_pccZone_hypervisor_shortName_GET(String pccZone, String shortName) throws IOException {
		String qPath = "/dedicatedCloud/location/{pccZone}/hypervisor/{shortName}";
		StringBuilder sb = path(qPath, pccZone, shortName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOs.class);
	}

	/**
	 * Available zpool stock
	 *
	 * REST: GET /dedicatedCloud/location/{pccZone}/stock/zpool
	 * @param profileFilter [required] Profile filter
	 * @param pccZone [required] Name of pccZone
	 */
	public ArrayList<OvhZpoolStockProfile> location_pccZone_stock_zpool_GET(String pccZone, String profileFilter) throws IOException {
		String qPath = "/dedicatedCloud/location/{pccZone}/stock/zpool";
		StringBuilder sb = path(qPath, pccZone);
		query(sb, "profileFilter", profileFilter);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhZpoolStockProfile>> t7 = new TypeReference<ArrayList<OvhZpoolStockProfile>>() {};

	/**
	 * Available PCC stock
	 *
	 * REST: GET /dedicatedCloud/location/{pccZone}/stock/pcc
	 * @param pccZone [required] Name of pccZone
	 */
	public ArrayList<OvhPccStockProfile> location_pccZone_stock_pcc_GET(String pccZone) throws IOException {
		String qPath = "/dedicatedCloud/location/{pccZone}/stock/pcc";
		StringBuilder sb = path(qPath, pccZone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhPccStockProfile>> t8 = new TypeReference<ArrayList<OvhPccStockProfile>>() {};

	/**
	 * Available host stock
	 *
	 * REST: GET /dedicatedCloud/location/{pccZone}/stock/host
	 * @param minYear [required] Minimum reference year
	 * @param pccZone [required] Name of pccZone
	 */
	public ArrayList<OvhHostStockProfile> location_pccZone_stock_host_GET(String pccZone, Long minYear) throws IOException {
		String qPath = "/dedicatedCloud/location/{pccZone}/stock/host";
		StringBuilder sb = path(qPath, pccZone);
		query(sb, "minYear", minYear);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhHostStockProfile>> t9 = new TypeReference<ArrayList<OvhHostStockProfile>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/location/{pccZone}
	 * @param pccZone [required] Name of pccZone
	 */
	public OvhPccZone location_pccZone_GET(String pccZone) throws IOException {
		String qPath = "/dedicatedCloud/location/{pccZone}";
		StringBuilder sb = path(qPath, pccZone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPccZone.class);
	}

	/**
	 * Offered host profile
	 *
	 * REST: GET /dedicatedCloud/location/{pccZone}/hostProfile
	 * @param pccZone [required] Name of pccZone
	 */
	public ArrayList<Long> location_pccZone_hostProfile_GET(String pccZone) throws IOException {
		String qPath = "/dedicatedCloud/location/{pccZone}/hostProfile";
		StringBuilder sb = path(qPath, pccZone);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/location/{pccZone}/hostProfile/{id}
	 * @param pccZone [required] Name of pccZone
	 * @param id [required] Id of Host profile
	 */
	public OvhHostProfile location_pccZone_hostProfile_id_GET(String pccZone, Long id) throws IOException {
		String qPath = "/dedicatedCloud/location/{pccZone}/hostProfile/{id}";
		StringBuilder sb = path(qPath, pccZone, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHostProfile.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dedicatedCloud
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dedicatedCloud";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
}
