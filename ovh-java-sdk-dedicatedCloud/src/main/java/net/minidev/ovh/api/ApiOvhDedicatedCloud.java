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
import net.minidev.ovh.api.dedicatedcloud.OvhFiler;
import net.minidev.ovh.api.dedicatedcloud.OvhHds;
import net.minidev.ovh.api.dedicatedcloud.OvhHipaa;
import net.minidev.ovh.api.dedicatedcloud.OvhHost;
import net.minidev.ovh.api.dedicatedcloud.OvhIp;
import net.minidev.ovh.api.dedicatedcloud.OvhIpCountriesEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhNsx;
import net.minidev.ovh.api.dedicatedcloud.OvhOptionCompatibility;
import net.minidev.ovh.api.dedicatedcloud.OvhPasswordPolicy;
import net.minidev.ovh.api.dedicatedcloud.OvhPciDss;
import net.minidev.ovh.api.dedicatedcloud.OvhResourceNewPrices;
import net.minidev.ovh.api.dedicatedcloud.OvhRestorePoint;
import net.minidev.ovh.api.dedicatedcloud.OvhRight;
import net.minidev.ovh.api.dedicatedcloud.OvhRobot;
import net.minidev.ovh.api.dedicatedcloud.OvhTask;
import net.minidev.ovh.api.dedicatedcloud.OvhTaskStateEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhUser;
import net.minidev.ovh.api.dedicatedcloud.OvhVlan;
import net.minidev.ovh.api.dedicatedcloud.OvhVm;
import net.minidev.ovh.api.dedicatedcloud.OvhVrops;
import net.minidev.ovh.api.dedicatedcloud.backup.OvhBackupDaysEnum;
import net.minidev.ovh.api.dedicatedcloud.backup.OvhOfferTypeEnum;
import net.minidev.ovh.api.dedicatedcloud.filer.OvhHourlyConsumption;
import net.minidev.ovh.api.dedicatedcloud.filer.OvhProfile;
import net.minidev.ovh.api.dedicatedcloud.right.OvhNetworkRoleEnum;
import net.minidev.ovh.api.dedicatedcloud.right.OvhRightEnum;
import net.minidev.ovh.api.dedicatedcloud.right.OvhVmNetworkRoleEnum;
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
	 */
	public void serviceName_PUT(String serviceName, OvhDedicatedCloud body) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
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
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Add a new Datacenter in your Private Cloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter
	 * @param commercialRangeName [required] The commercial range of this new datacenter. You can see what commercial ranges are orderable on this API section : /dedicatedCloud/commercialRange/
	 * @param vrackName [required] Name of the Vrack link to the new datacenter.
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
	 * List available filers in a given Private Cloud Datacenter
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public ArrayList<OvhProfile> serviceName_datacenter_datacenterId_orderableFilerProfiles_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhProfile>> t2 = new TypeReference<ArrayList<OvhProfile>>() {};

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
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
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
	 * Hourly consumption associated with this Filer
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/hourlyConsumption
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param filerId [required] Filer Id
	 */
	public OvhHourlyConsumption serviceName_datacenter_datacenterId_filer_filerId_hourlyConsumption_GET(String serviceName, Long datacenterId, Long filerId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/filer/{filerId}/hourlyConsumption";
		StringBuilder sb = path(qPath, serviceName, datacenterId, filerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHourlyConsumption.class);
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
	 * Hourly consumption associated with this host.
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/hourlyConsumption
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param hostId [required] Id of the host
	 */
	public net.minidev.ovh.api.dedicatedcloud.host.OvhHourlyConsumption serviceName_datacenter_datacenterId_host_hostId_hourlyConsumption_GET(String serviceName, Long datacenterId, Long hostId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/host/{hostId}/hourlyConsumption";
		StringBuilder sb = path(qPath, serviceName, datacenterId, hostId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.dedicatedcloud.host.OvhHourlyConsumption.class);
	}

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
	 * Enable backup solution on this virtual Machine
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/enable
	 * @param backupDays [required] Backup offer type
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
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
	 * Restore point associated to this Backup Job
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 */
	public ArrayList<Long> serviceName_datacenter_datacenterId_vm_vmId_backupJob_restorePoints_GET(String serviceName, Long datacenterId, Long vmId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints/{restorePointId}
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 * @param restorePointId [required] Id of the restore point.
	 */
	public OvhRestorePoint serviceName_datacenter_datacenterId_vm_vmId_backupJob_restorePoints_restorePointId_GET(String serviceName, Long datacenterId, Long vmId, Long restorePointId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/restorePoints/{restorePointId}";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId, restorePointId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRestorePoint.class);
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
	 * Disable backup solution on this virtual Machine
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/disable
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 * @param vmId [required] Id of the virtual machine.
	 */
	public OvhTask serviceName_datacenter_datacenterId_vm_vmId_backupJob_disable_POST(String serviceName, Long datacenterId, Long vmId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/vm/{vmId}/backupJob/disable";
		StringBuilder sb = path(qPath, serviceName, datacenterId, vmId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
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
	 * List available hosts in a given Private Cloud Datacenter
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public ArrayList<net.minidev.ovh.api.dedicatedcloud.host.OvhProfile> serviceName_datacenter_datacenterId_orderableHostProfiles_GET(String serviceName, Long datacenterId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<net.minidev.ovh.api.dedicatedcloud.host.OvhProfile>> t3 = new TypeReference<ArrayList<net.minidev.ovh.api.dedicatedcloud.host.OvhProfile>>() {};

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
	 * Enable backup solution on a Private Cloud
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup/enable
	 * @param backupOffer [required] Backup offer type
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
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
	 * @param restorePointInReport [required] RestorePoint number on mail report
	 * @param backupOffer [required] Backup offer type
	 * @param fullDayInReport [required] Full day on mail report
	 * @param mailAddress [required] Unique additional email address for backup daily report
	 * @param scheduleHour [required] Schedule hour for start backup. UTC Timezone
	 * @param diskSizeInReport [required] Disk size on mail report
	 * @param backupSizeInReport [required] Backup size on day on email report
	 * @param backupDurationInReport [required] Duration on email report
	 * @param serviceName [required] Domain of the service
	 * @param datacenterId [required]
	 */
	public OvhTask serviceName_datacenter_datacenterId_backup_changeProperties_POST(String serviceName, Long datacenterId, Boolean restorePointInReport, OvhOfferTypeEnum backupOffer, Boolean fullDayInReport, String mailAddress, Date scheduleHour, Boolean diskSizeInReport, Boolean backupSizeInReport, Boolean backupDurationInReport) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/datacenter/{datacenterId}/backup/changeProperties";
		StringBuilder sb = path(qPath, serviceName, datacenterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "restorePointInReport", restorePointInReport);
		addBody(o, "backupOffer", backupOffer);
		addBody(o, "fullDayInReport", fullDayInReport);
		addBody(o, "mailAddress", mailAddress);
		addBody(o, "scheduleHour", scheduleHour);
		addBody(o, "diskSizeInReport", diskSizeInReport);
		addBody(o, "backupSizeInReport", backupSizeInReport);
		addBody(o, "backupDurationInReport", backupDurationInReport);
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
	 * Check if Hipaa option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hipaa/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 */
	public OvhOptionCompatibility serviceName_hipaa_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hipaa/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
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
	 * Enable Hipaa option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/hipaa/enable
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_hipaa_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hipaa/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if Hipaa option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hipaa/canBeEnabled
	 * @param serviceName [required] Domain of the service
	 */
	public OvhOptionCompatibility serviceName_hipaa_canBeEnabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hipaa/canBeEnabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Disable Hipaa option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/hipaa/disable
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_hipaa_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hipaa/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
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
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<String>> t4 = new TypeReference<ArrayList<String>>() {};

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
	 * Tasks associated with this Filer
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/ip/{network}/task
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
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
	 * Check if Nsx option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/nsx/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 */
	public OvhOptionCompatibility serviceName_nsx_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/nsx/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
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
	 */
	public OvhTask serviceName_nsx_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/nsx/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if Nsx option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/nsx/canBeEnabled
	 * @param serviceName [required] Domain of the service
	 */
	public OvhOptionCompatibility serviceName_nsx_canBeEnabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/nsx/canBeEnabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Disable Nsx option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/nsx/disable
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_nsx_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/nsx/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
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
	 * Get the name of the commercial ranges compliant with your Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/commercialRange/compliance
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_commercialRange_compliance_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/commercialRange/compliance";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
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
		return convertTo(resp, t4);
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
	 * Tasks associated with this Filer
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/filer/{filerId}/task
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
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
	 * Hourly consumption associated with this Filer
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/filer/{filerId}/hourlyConsumption
	 * @param serviceName [required] Domain of the service
	 * @param filerId [required] Filer Id
	 */
	public OvhHourlyConsumption serviceName_filer_filerId_hourlyConsumption_GET(String serviceName, Long filerId) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/filer/{filerId}/hourlyConsumption";
		StringBuilder sb = path(qPath, serviceName, filerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHourlyConsumption.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
	public OvhTask serviceName_allowedNetwork_POST(String serviceName, String network, String description) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/allowedNetwork";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "network", network);
		addBody(o, "description", description);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
	 * Tasks associated with this Filer
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/allowedNetwork/{networkAccessId}/task
	 * @param name [required] Filter the value of name property (like)
	 * @param state [required] Filter the value of state property (=)
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
	 * @param firstName [required] First name of the user
	 * @param canAddRessource [required] Is this User able to add ressources in the Datacenter he has access ? (default is no right to add ressource)
	 * @param name [required] Name of the user (login)
	 * @param vmNetworkRole [required] Determine how this user will be able to act on this Private Cloud VM Nertwork
	 * @param email [required] The user email. If this field is empty, user informations will be sent to the dedicatedCloud administrator contact.
	 * @param password [required] The user password. It must fits your Private Cloud password policy. If this field is empty, a random password will be generated and sent by email.
	 * @param right [required] Determine what kind of access the User will have in all Datacenters of your Private Cloud (default is disabled)
	 * @param lastName [required] Last name of the user
	 * @param nsxRight [required] Is this User able to access nsx interface (requires NSX option)
	 * @param phoneNumber [required] Mobile phone number of the user
	 * @param tokenValidator [required] Defines if the user can confirm security tokens (if a compatible option is enabled)
	 * @param networkRole [required] Determine how this user will be able to act on this Private Cloud v(x)Lans
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_user_POST(String serviceName, String firstName, Boolean canAddRessource, String name, OvhVmNetworkRoleEnum vmNetworkRole, String email, String password, OvhRightEnum right, String lastName, Boolean nsxRight, String phoneNumber, Boolean tokenValidator, OvhNetworkRoleEnum networkRole) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "firstName", firstName);
		addBody(o, "canAddRessource", canAddRessource);
		addBody(o, "name", name);
		addBody(o, "vmNetworkRole", vmNetworkRole);
		addBody(o, "email", email);
		addBody(o, "password", password);
		addBody(o, "right", right);
		addBody(o, "lastName", lastName);
		addBody(o, "nsxRight", nsxRight);
		addBody(o, "phoneNumber", phoneNumber);
		addBody(o, "tokenValidator", tokenValidator);
		addBody(o, "networkRole", networkRole);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
	 * Change Private Cloud user properties
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/user/{userId}/changeProperties
	 * @param firstName [required] First name of the user
	 * @param fullAdminRo [required] Defines if the user is a full admin in readonly
	 * @param canManageIpFailOvers [required] Defines if the user can manage ip failovers
	 * @param email [required] Email address of the user
	 * @param nsxRight [required] Is this User able to access nsx interface (requires NSX option)
	 * @param lastName [required] Last name of the user
	 * @param canManageNetwork [required] Defines if the user can manage the network
	 * @param phoneNumber [required] Mobile phone number of the user in international format (+prefix.number)
	 * @param tokenValidator [required] Defines if the user can confirm security tokens (if a compatible option is enabled)
	 * @param serviceName [required] Domain of the service
	 * @param userId [required]
	 */
	public OvhTask serviceName_user_userId_changeProperties_POST(String serviceName, Long userId, String firstName, Boolean fullAdminRo, Boolean canManageIpFailOvers, String email, Boolean nsxRight, String lastName, Boolean canManageNetwork, String phoneNumber, Boolean tokenValidator) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/user/{userId}/changeProperties";
		StringBuilder sb = path(qPath, serviceName, userId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "firstName", firstName);
		addBody(o, "fullAdminRo", fullAdminRo);
		addBody(o, "canManageIpFailOvers", canManageIpFailOvers);
		addBody(o, "email", email);
		addBody(o, "nsxRight", nsxRight);
		addBody(o, "lastName", lastName);
		addBody(o, "canManageNetwork", canManageNetwork);
		addBody(o, "phoneNumber", phoneNumber);
		addBody(o, "tokenValidator", tokenValidator);
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
	 * Robots that can run on this Private Cloud
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/robot
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_robot_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/robot";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
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
	 * Check if PCI-DSS option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/pcidss/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 */
	public OvhOptionCompatibility serviceName_pcidss_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/pcidss/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
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
	 * Enable PCI-DSS option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/pcidss/enable
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_pcidss_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/pcidss/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if PCI-DSS option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/pcidss/canBeEnabled
	 * @param serviceName [required] Domain of the service
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
	 */
	public OvhTask serviceName_pcidss_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/pcidss/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] Domain of the service
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/confirmTermination";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
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
	 * Check if vRealize Operations option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vrops/canBeDisabled
	 * @param serviceName [required] Domain of the service
	 */
	public OvhOptionCompatibility serviceName_vrops_canBeDisabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrops/canBeDisabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
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
	 * Enable vRealize Operations option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/vrops/enable
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_vrops_enable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrops/enable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if vRealize Operations option can be enabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vrops/canBeEnabled
	 * @param serviceName [required] Domain of the service
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
	 */
	public OvhTask serviceName_vrops_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrops/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
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
	 * This Private Cloud vrack
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/vrack
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<String> serviceName_vrack_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/vrack";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
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
	 * Get the countries you can select in /order/dedicatedCloud/{serviceName}/ip
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/orderableIpCountries
	 * @param serviceName [required] Domain of the service
	 */
	public ArrayList<OvhIpCountriesEnum> serviceName_orderableIpCountries_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/orderableIpCountries";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhIpCountriesEnum>> t5 = new TypeReference<ArrayList<OvhIpCountriesEnum>>() {};

	/**
	 * Check if Hds option can be disabled
	 *
	 * REST: GET /dedicatedCloud/{serviceName}/hds/canBeDisabled
	 * @param serviceName [required] Domain of the service
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
	 */
	public OvhOptionCompatibility serviceName_hds_canBeEnabled_GET(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hds/canBeEnabled";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOptionCompatibility.class);
	}

	/**
	 * Disable Hds option
	 *
	 * REST: POST /dedicatedCloud/{serviceName}/hds/disable
	 * @param serviceName [required] Domain of the service
	 */
	public OvhTask serviceName_hds_disable_POST(String serviceName) throws IOException {
		String qPath = "/dedicatedCloud/{serviceName}/hds/disable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
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
		return convertTo(resp, t4);
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
		return convertTo(resp, t4);
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
}
