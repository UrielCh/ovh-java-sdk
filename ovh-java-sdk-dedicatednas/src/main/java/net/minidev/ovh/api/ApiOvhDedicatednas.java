package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.dedicated.OvhTaskStatusEnum;
import net.minidev.ovh.api.dedicated.nas.OvhAccess;
import net.minidev.ovh.api.dedicated.nas.OvhNas;
import net.minidev.ovh.api.dedicated.nas.OvhPartition;
import net.minidev.ovh.api.dedicated.nas.OvhQuota;
import net.minidev.ovh.api.dedicated.nastask.OvhTask;
import net.minidev.ovh.api.dedicated.storage.OvhProtocolEnum;
import net.minidev.ovh.api.dedicated.storage.OvhTaskFunctionEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/dedicated/nas
 * version:1.0
 */
public class ApiOvhDedicatednas extends ApiOvhBase {
	public ApiOvhDedicatednas(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dedicated/nas
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dedicated/nas";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/nas/{serviceName}/task/{taskId}
	 * @param serviceName [required] The internal name of your storage
	 * @param taskId [required] id of the task
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * View task list
	 *
	 * REST: GET /dedicated/nas/{serviceName}/task
	 * @param status [required] Filter the value of status property (=)
	 * @param operation [required] Filter the value of operation property (=)
	 * @param serviceName [required] The internal name of your storage
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskFunctionEnum operation, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "operation", operation);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/nas/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your storage
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/nas/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your storage
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/nas/{serviceName}
	 * @param serviceName [required] The internal name of your storage
	 */
	public OvhNas serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNas.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/nas/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your storage
	 */
	public void serviceName_PUT(String serviceName, OvhNas body) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * get ACL for this partition
	 *
	 * REST: GET /dedicated/nas/{serviceName}/partition/{partitionName}/access
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 */
	public ArrayList<String> serviceName_partition_partitionName_access_GET(String serviceName, String partitionName) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}/access";
		StringBuilder sb = path(qPath, serviceName, partitionName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add an Acl to this  partition
	 *
	 * REST: POST /dedicated/nas/{serviceName}/partition/{partitionName}/access
	 * @param ip [required] Ip to add
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 */
	public OvhTask serviceName_partition_partitionName_access_POST(String serviceName, String partitionName, String ip) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}/access";
		StringBuilder sb = path(qPath, serviceName, partitionName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/nas/{serviceName}/partition/{partitionName}/access/{ip}
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 * @param ip [required] the ip in root on storage
	 */
	public OvhAccess serviceName_partition_partitionName_access_ip_GET(String serviceName, String partitionName, String ip) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}/access/{ip}";
		StringBuilder sb = path(qPath, serviceName, partitionName, ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAccess.class);
	}

	/**
	 * Delete a given snapshot
	 *
	 * REST: DELETE /dedicated/nas/{serviceName}/partition/{partitionName}/access/{ip}
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 * @param ip [required] the ip in root on storage
	 */
	public OvhTask serviceName_partition_partitionName_access_ip_DELETE(String serviceName, String partitionName, String ip) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}/access/{ip}";
		StringBuilder sb = path(qPath, serviceName, partitionName, ip);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/nas/{serviceName}/partition/{partitionName}
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 */
	public OvhPartition serviceName_partition_partitionName_GET(String serviceName, String partitionName) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}";
		StringBuilder sb = path(qPath, serviceName, partitionName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPartition.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/nas/{serviceName}/partition/{partitionName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 */
	public void serviceName_partition_partitionName_PUT(String serviceName, String partitionName, OvhPartition body) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}";
		StringBuilder sb = path(qPath, serviceName, partitionName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete this partition
	 *
	 * REST: DELETE /dedicated/nas/{serviceName}/partition/{partitionName}
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 */
	public OvhTask serviceName_partition_partitionName_DELETE(String serviceName, String partitionName) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}";
		StringBuilder sb = path(qPath, serviceName, partitionName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/nas/{serviceName}/partition/{partitionName}/quota/{uid}
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 * @param uid [required] the uid to set quota on
	 */
	public OvhQuota serviceName_partition_partitionName_quota_uid_GET(String serviceName, String partitionName, Long uid) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}/quota/{uid}";
		StringBuilder sb = path(qPath, serviceName, partitionName, uid);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhQuota.class);
	}

	/**
	 * Delete a given quota
	 *
	 * REST: DELETE /dedicated/nas/{serviceName}/partition/{partitionName}/quota/{uid}
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 * @param uid [required] the uid to set quota on
	 */
	public OvhTask serviceName_partition_partitionName_quota_uid_DELETE(String serviceName, String partitionName, Long uid) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}/quota/{uid}";
		StringBuilder sb = path(qPath, serviceName, partitionName, uid);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get quota for this partition
	 *
	 * REST: GET /dedicated/nas/{serviceName}/partition/{partitionName}/quota
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 */
	public ArrayList<Long> serviceName_partition_partitionName_quota_GET(String serviceName, String partitionName) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}/quota";
		StringBuilder sb = path(qPath, serviceName, partitionName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Set a new quota
	 *
	 * REST: POST /dedicated/nas/{serviceName}/partition/{partitionName}/quota
	 * @param uid [required] the uid to set quota on
	 * @param size [required] the size to set in MB
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 */
	public OvhTask serviceName_partition_partitionName_quota_POST(String serviceName, String partitionName, Long size, Long uid) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}/quota";
		StringBuilder sb = path(qPath, serviceName, partitionName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "size", size);
		addBody(o, "uid", uid);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get all IPs that can be used in the ACL
	 *
	 * REST: GET /dedicated/nas/{serviceName}/partition/{partitionName}/authorizableIps
	 * @param serviceName [required] The internal name of your storage
	 * @param partitionName [required] the given name of partition
	 */
	public ArrayList<String> serviceName_partition_partitionName_authorizableIps_GET(String serviceName, String partitionName) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition/{partitionName}/authorizableIps";
		StringBuilder sb = path(qPath, serviceName, partitionName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get partition list
	 *
	 * REST: GET /dedicated/nas/{serviceName}/partition
	 * @param serviceName [required] The internal name of your storage
	 */
	public ArrayList<String> serviceName_partition_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a  new partition
	 *
	 * REST: POST /dedicated/nas/{serviceName}/partition
	 * @param partitionName [required] Partition name
	 * @param protocol [required]
	 * @param size [required] Partition size
	 * @param serviceName [required] The internal name of your storage
	 */
	public OvhTask serviceName_partition_POST(String serviceName, String partitionName, OvhProtocolEnum protocol, Long size) throws IOException {
		String qPath = "/dedicated/nas/{serviceName}/partition";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "partitionName", partitionName);
		addBody(o, "protocol", protocol);
		addBody(o, "size", size);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}
}
