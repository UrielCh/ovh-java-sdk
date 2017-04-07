package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.dedicated.OvhTaskStatusEnum;
import net.minidev.ovh.api.dedicated.housing.OvhApcOrderable;
import net.minidev.ovh.api.dedicated.housing.OvhHousing;
import net.minidev.ovh.api.dedicated.housing.OvhTaskFunctionEnum;
import net.minidev.ovh.api.dedicated.server.OvhBackupFtp;
import net.minidev.ovh.api.dedicated.server.OvhBackupFtpAcl;
import net.minidev.ovh.api.dedicated.server.OvhTask;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/dedicated/housing
 * version:1.0
 */
public class ApiOvhDedicatedhousing extends ApiOvhBase {
	public ApiOvhDedicatedhousing(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/housing/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/housing/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/housing/{serviceName}
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public OvhHousing serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHousing.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/housing/{serviceName}/features/backupFTP
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public OvhBackupFtp serviceName_features_backupFTP_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupFtp.class);
	}

	/**
	 * Create a new Backup FTP space
	 *
	 * REST: POST /dedicated/housing/{serviceName}/features/backupFTP
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public OvhTask serviceName_features_backupFTP_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Terminate your Backup FTP service, ALL DATA WILL BE PERMANENTLY DELETED
	 *
	 * REST: DELETE /dedicated/housing/{serviceName}/features/backupFTP
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public OvhTask serviceName_features_backupFTP_DELETE(String serviceName) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change your Backup FTP password
	 *
	 * REST: POST /dedicated/housing/{serviceName}/features/backupFTP/password
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public OvhTask serviceName_features_backupFTP_password_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP/password";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get all IP blocks that can be used in the ACL
	 *
	 * REST: GET /dedicated/housing/{serviceName}/features/backupFTP/authorizableBlocks
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public ArrayList<String> serviceName_features_backupFTP_authorizableBlocks_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP/authorizableBlocks";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 *
	 * REST: GET /dedicated/housing/{serviceName}/features/backupFTP/access
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public ArrayList<String> serviceName_features_backupFTP_access_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP/access";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new Backup FTP ACL
	 *
	 * REST: POST /dedicated/housing/{serviceName}/features/backupFTP/access
	 * @param ftp [required] Wether to allow the FTP protocol for this ACL
	 * @param ipBlock [required] The IP Block specific to this ACL. It musts belong to your server.
	 * @param nfs [required] Wether to allow the NFS protocol for this ACL
	 * @param cifs [required] Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public OvhTask serviceName_features_backupFTP_access_POST(String serviceName, Boolean ftp, String ipBlock, Boolean nfs, Boolean cifs) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP/access";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ftp", ftp);
		addBody(o, "ipBlock", ipBlock);
		addBody(o, "nfs", nfs);
		addBody(o, "cifs", cifs);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/housing/{serviceName}/features/backupFTP/access/{ipBlock}
	 * @param serviceName [required] The internal name of your Housing bay
	 * @param ipBlock [required] The IP Block specific to this ACL
	 */
	public OvhBackupFtpAcl serviceName_features_backupFTP_access_ipBlock_GET(String serviceName, String ipBlock) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP/access/{ipBlock}";
		StringBuilder sb = path(qPath, serviceName, ipBlock);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupFtpAcl.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/housing/{serviceName}/features/backupFTP/access/{ipBlock}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your Housing bay
	 * @param ipBlock [required] The IP Block specific to this ACL
	 */
	public void serviceName_features_backupFTP_access_ipBlock_PUT(String serviceName, String ipBlock, OvhBackupFtpAcl body) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP/access/{ipBlock}";
		StringBuilder sb = path(qPath, serviceName, ipBlock);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Revoke this ACL
	 *
	 * REST: DELETE /dedicated/housing/{serviceName}/features/backupFTP/access/{ipBlock}
	 * @param serviceName [required] The internal name of your Housing bay
	 * @param ipBlock [required] The IP Block specific to this ACL
	 */
	public OvhTask serviceName_features_backupFTP_access_ipBlock_DELETE(String serviceName, String ipBlock) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/features/backupFTP/access/{ipBlock}";
		StringBuilder sb = path(qPath, serviceName, ipBlock);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Is an APC orderable for this housing bay
	 *
	 * REST: GET /dedicated/housing/{serviceName}/orderable/APC
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public OvhApcOrderable serviceName_orderable_APC_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/orderable/APC";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhApcOrderable.class);
	}

	/**
	 * View task list
	 *
	 * REST: GET /dedicated/housing/{serviceName}/task
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskFunctionEnum function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/housing/{serviceName}/task/{taskId}
	 * @param serviceName [required] The internal name of your Housing bay
	 * @param taskId [required] the id of the task
	 */
	public net.minidev.ovh.api.dedicated.housing.OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.dedicated.housing.OvhTask.class);
	}

	/**
	 * this action stop the task progression if it's possible
	 *
	 * REST: POST /dedicated/housing/{serviceName}/task/{taskId}/cancel
	 * @param serviceName [required] The internal name of your Housing bay
	 * @param taskId [required] the id of the task
	 */
	public void serviceName_task_taskId_cancel_POST(String serviceName, Long taskId) throws IOException {
		String qPath = "/dedicated/housing/{serviceName}/task/{taskId}/cancel";
		StringBuilder sb = path(qPath, serviceName, taskId);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dedicated/housing
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dedicated/housing";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
