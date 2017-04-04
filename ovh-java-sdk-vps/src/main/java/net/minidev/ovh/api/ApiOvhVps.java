package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.complextype.OvhUnitAndValues;
import net.minidev.ovh.api.dedicated.server.OvhBackupFtpAcl;
import net.minidev.ovh.api.nichandle.OvhCountryEnum;
import net.minidev.ovh.api.secondarydns.OvhSecondaryDNS;
import net.minidev.ovh.api.secondarydns.OvhSecondaryDNSNameServer;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.vps.OvhAutomatedBackup;
import net.minidev.ovh.api.vps.OvhBackupFtp;
import net.minidev.ovh.api.vps.OvhDatacenter;
import net.minidev.ovh.api.vps.OvhDisk;
import net.minidev.ovh.api.vps.OvhIp;
import net.minidev.ovh.api.vps.OvhModel;
import net.minidev.ovh.api.vps.OvhOption;
import net.minidev.ovh.api.vps.OvhRestoreStateEnum;
import net.minidev.ovh.api.vps.OvhRestoreTypeEnum;
import net.minidev.ovh.api.vps.OvhSnapshot;
import net.minidev.ovh.api.vps.OvhSoftware;
import net.minidev.ovh.api.vps.OvhTask;
import net.minidev.ovh.api.vps.OvhTaskStateEnum;
import net.minidev.ovh.api.vps.OvhTaskTypeEnum;
import net.minidev.ovh.api.vps.OvhTemplate;
import net.minidev.ovh.api.vps.OvhVPS;
import net.minidev.ovh.api.vps.OvhVeeam;
import net.minidev.ovh.api.vps.OvhVnc;
import net.minidev.ovh.api.vps.OvhVncProtocolEnum;
import net.minidev.ovh.api.vps.OvhVpsMonitoringPeriodEnum;
import net.minidev.ovh.api.vps.OvhVpsOptionEnum;
import net.minidev.ovh.api.vps.OvhVpsStatisticTypeEnum;
import net.minidev.ovh.api.vps.OvhVpsTimestampValue;
import net.minidev.ovh.api.vps.automatedbackup.OvhAttached;
import net.minidev.ovh.api.vps.disk.OvhStatisticTypeEnum;
import net.minidev.ovh.api.vps.ip.OvhGeolocationEnum;
import net.minidev.ovh.api.vps.ip.OvhServiceStatus;
import net.minidev.ovh.api.vps.veeam.OvhExportTypeEnum;
import net.minidev.ovh.api.vps.veeam.OvhRestorePoint;
import net.minidev.ovh.api.vps.veeam.OvhRestoredBackup;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/vps
 * version:1.0
 */
public class ApiOvhVps extends ApiOvhBase {
	public ApiOvhVps(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Return all active options for the virtual server
	 * 
	 * REST: GET /vps/{serviceName}/activeOptions
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<OvhVpsOptionEnum> serviceName_activeOptions_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/activeOptions";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhVpsOptionEnum>> t1 = new TypeReference<ArrayList<OvhVpsOptionEnum>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhVPS serviceName_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhVPS.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /vps/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public void serviceName_PUT(String serviceName, OvhVPS body) throws IOException {
		String qPath = "/vps/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/datacenter
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhDatacenter serviceName_datacenter_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/datacenter";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDatacenter.class);
	}

	/**
	 * Return all models the virtual server can be upgraded to
	 * 
	 * REST: GET /vps/{serviceName}/availableUpgrade
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<OvhModel> serviceName_availableUpgrade_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/availableUpgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhModel>> t2 = new TypeReference<ArrayList<OvhModel>>() {};

	/**
	 * Create a snapshot of the Virtual Server if the snapshot option is enabled and if there is no existing snapshot
	 * 
	 * REST: POST /vps/{serviceName}/createSnapshot
	 * @param description [required] A textual description for your snapshot
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_createSnapshot_POST(String serviceName, String description) throws IOException {
		String qPath = "/vps/{serviceName}/createSnapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Ips associated to this virtual server
	 * 
	 * REST: GET /vps/{serviceName}/ips
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> serviceName_ips_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/ips";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/ips/{ipAddress}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param ipAddress [required] The effective ip address of the Ip object
	 */
	public OvhIp serviceName_ips_ipAddress_GET(String serviceName, String ipAddress) throws IOException {
		String qPath = "/vps/{serviceName}/ips/{ipAddress}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{ipAddress}", ipAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /vps/{serviceName}/ips/{ipAddress}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param ipAddress [required] The effective ip address of the Ip object
	 */
	public void serviceName_ips_ipAddress_PUT(String serviceName, String ipAddress, OvhIp body) throws IOException {
		String qPath = "/vps/{serviceName}/ips/{ipAddress}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{ipAddress}", ipAddress);
		exec("PUT", qPath, body);
	}

	/**
	 * Release a given Ip (Additional Ip)
	 * 
	 * REST: DELETE /vps/{serviceName}/ips/{ipAddress}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param ipAddress [required] The effective ip address of the Ip object
	 */
	public void serviceName_ips_ipAddress_DELETE(String serviceName, String ipAddress) throws IOException {
		String qPath = "/vps/{serviceName}/ips/{ipAddress}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{ipAddress}", ipAddress);
		exec("DELETE", qPath);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/veeam
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhVeeam serviceName_veeam_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/veeam";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhVeeam.class);
	}

	/**
	 * Veeam restore points for the VPS
	 * 
	 * REST: GET /vps/{serviceName}/veeam/restorePoints
	 * @param creationTime [required] Filter the value of creationTime property (like)
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_veeam_restorePoints_GET(String serviceName, Date creationTime) throws IOException {
		String qPath = "/vps/{serviceName}/veeam/restorePoints";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "creationTime", creationTime);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<Long>> t4 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/veeam/restorePoints/{id}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhRestorePoint serviceName_veeam_restorePoints_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/vps/{serviceName}/veeam/restorePoints/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRestorePoint.class);
	}

	/**
	 * Creates a VPS.Task that will restore the given restorePoint
	 * 
	 * REST: POST /vps/{serviceName}/veeam/restorePoints/{id}/restore
	 * @param changePassword [required] (Full only) Change the restored VPS root password when done
	 * @param export [required] (Except full) The export method for your restore - defaults to both
	 * @param full [required] Replace your current VPS by the restorePoint
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhTask serviceName_veeam_restorePoints_id_restore_POST(String serviceName, Long id, Boolean changePassword, OvhExportTypeEnum export, Boolean full) throws IOException {
		String qPath = "/vps/{serviceName}/veeam/restorePoints/{id}/restore";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "changePassword", changePassword);
		addBody(o, "export", export);
		addBody(o, "full", full);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/veeam/restoredBackup
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhRestoredBackup serviceName_veeam_restoredBackup_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/veeam/restoredBackup";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRestoredBackup.class);
	}

	/**
	 * Creates a VPS.Task that will unmount the backup
	 * 
	 * REST: DELETE /vps/{serviceName}/veeam/restoredBackup
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_veeam_restoredBackup_DELETE(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/veeam/restoredBackup";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Return all models for the range of the virtual server
	 * 
	 * REST: GET /vps/{serviceName}/models
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<OvhModel> serviceName_models_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/models";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Reinstall the virtual server
	 * 
	 * REST: POST /vps/{serviceName}/reinstall
	 * @param sshKey [required] SSH key names to pre-install on your VPS (name from /me/sshKey)
	 * @param language [required] Distribution language. default : en
	 * @param doNotSendPassword [required] If asked, the installation password will NOT be sent (only if sshKey defined)
	 * @param softwareId [required] Id of the vps.Software type fetched in /template/{id}/software
	 * @param templateId [required] Id of the vps.Template fetched in /templates list
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_reinstall_POST(String serviceName, String[] sshKey, String language, Boolean doNotSendPassword, Long[] softwareId, Long templateId) throws IOException {
		String qPath = "/vps/{serviceName}/reinstall";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "sshKey", sshKey);
		addBody(o, "language", language);
		addBody(o, "doNotSendPassword", doNotSendPassword);
		addBody(o, "softwareId", softwareId);
		addBody(o, "templateId", templateId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks associated to this virtual server
	 * 
	 * REST: GET /vps/{serviceName}/tasks
	 * @param type [required] Filter the value of type property (=)
	 * @param state [required] Filter the value of state property (=)
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, OvhTaskStateEnum state, OvhTaskTypeEnum type) throws IOException {
		String qPath = "/vps/{serviceName}/tasks";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "state", state);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/tasks/{id}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhTask serviceName_tasks_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/vps/{serviceName}/tasks/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /vps/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/vps/{serviceName}/confirmTermination";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/distribution
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTemplate serviceName_distribution_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/distribution";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTemplate.class);
	}

	/**
	 * List available softwares for this template Id
	 * 
	 * REST: GET /vps/{serviceName}/distribution/software
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_distribution_software_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/distribution/software";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/distribution/software/{softwareId}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param softwareId [required]
	 */
	public OvhSoftware serviceName_distribution_software_softwareId_GET(String serviceName, Long softwareId) throws IOException {
		String qPath = "/vps/{serviceName}/distribution/software/{softwareId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{softwareId}", softwareId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSoftware.class);
	}

	/**
	 * Return many statistics about the virtual machine for a given period
	 * 
	 * REST: GET /vps/{serviceName}/monitoring
	 * @param period [required] The period the statistics are fetched for
	 * @param type [required] The type of statistic to be fetched
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhUnitAndValues<OvhVpsTimestampValue> serviceName_monitoring_GET(String serviceName, OvhVpsMonitoringPeriodEnum period, OvhVpsStatisticTypeEnum type) throws IOException {
		String qPath = "/vps/{serviceName}/monitoring";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "period", period);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<OvhUnitAndValues<OvhVpsTimestampValue>> t5 = new TypeReference<OvhUnitAndValues<OvhVpsTimestampValue>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/backupftp
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhBackupFtp serviceName_backupftp_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackupFtp.class);
	}

	/**
	 * Change your Backup FTP password
	 * 
	 * REST: POST /vps/{serviceName}/backupftp/password
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public net.minidev.ovh.api.dedicated.server.OvhTask serviceName_backupftp_password_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/password";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, net.minidev.ovh.api.dedicated.server.OvhTask.class);
	}

	/**
	 * Get all IP blocks that can be used in the ACL
	 * 
	 * REST: GET /vps/{serviceName}/backupftp/authorizableBlocks
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> serviceName_backupftp_authorizableBlocks_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/authorizableBlocks";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 * 
	 * REST: GET /vps/{serviceName}/backupftp/access
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> serviceName_backupftp_access_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/access";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new Backup FTP ACL
	 * 
	 * REST: POST /vps/{serviceName}/backupftp/access
	 * @param ftp [required] Wether to allow the FTP protocol for this ACL
	 * @param ipBlock [required] The IP Block specific to this ACL. It musts belong to your server.
	 * @param nfs [required] Wether to allow the NFS protocol for this ACL
	 * @param cifs [required] Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public net.minidev.ovh.api.dedicated.server.OvhTask serviceName_backupftp_access_POST(String serviceName, Boolean ftp, String ipBlock, Boolean nfs, Boolean cifs) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/access";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ftp", ftp);
		addBody(o, "ipBlock", ipBlock);
		addBody(o, "nfs", nfs);
		addBody(o, "cifs", cifs);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, net.minidev.ovh.api.dedicated.server.OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/backupftp/access/{ipBlock}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param ipBlock [required] The IP Block specific to this ACL
	 */
	public OvhBackupFtpAcl serviceName_backupftp_access_ipBlock_GET(String serviceName, String ipBlock) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/access/{ipBlock}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{ipBlock}", ipBlock);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackupFtpAcl.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /vps/{serviceName}/backupftp/access/{ipBlock}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param ipBlock [required] The IP Block specific to this ACL
	 */
	public void serviceName_backupftp_access_ipBlock_PUT(String serviceName, String ipBlock, OvhBackupFtpAcl body) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/access/{ipBlock}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{ipBlock}", ipBlock);
		exec("PUT", qPath, body);
	}

	/**
	 * Revoke this ACL
	 * 
	 * REST: DELETE /vps/{serviceName}/backupftp/access/{ipBlock}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param ipBlock [required] The IP Block specific to this ACL
	 */
	public net.minidev.ovh.api.dedicated.server.OvhTask serviceName_backupftp_access_ipBlock_DELETE(String serviceName, String ipBlock) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/access/{ipBlock}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{ipBlock}", ipBlock);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, net.minidev.ovh.api.dedicated.server.OvhTask.class);
	}

	/**
	 * Return the necessary informations to open a VNC connection to your VPS
	 * 
	 * REST: POST /vps/{serviceName}/openConsoleAccess
	 * @param protocol [required] The console protocol you want
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhVnc serviceName_openConsoleAccess_POST(String serviceName, OvhVncProtocolEnum protocol) throws IOException {
		String qPath = "/vps/{serviceName}/openConsoleAccess";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "protocol", protocol);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhVnc.class);
	}

	/**
	 * Request the machine to start
	 * 
	 * REST: POST /vps/{serviceName}/start
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_start_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/start";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Start the process in order to set the root password of the virtual machine. Be careful, in case of Cloud model, a reboot is mandatory.
	 * 
	 * REST: POST /vps/{serviceName}/setPassword
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_setPassword_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/setPassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Templates available for this virtual server
	 * 
	 * REST: GET /vps/{serviceName}/templates
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_templates_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/templates";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/templates/{id}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhTemplate serviceName_templates_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/vps/{serviceName}/templates/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTemplate.class);
	}

	/**
	 * List available softwares for this template Id
	 * 
	 * REST: GET /vps/{serviceName}/templates/{id}/software
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public ArrayList<Long> serviceName_templates_id_software_GET(String serviceName, Long id) throws IOException {
		String qPath = "/vps/{serviceName}/templates/{id}/software";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/templates/{id}/software/{softwareId}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 * @param softwareId [required]
	 */
	public OvhSoftware serviceName_templates_id_software_softwareId_GET(String serviceName, Long id, Long softwareId) throws IOException {
		String qPath = "/vps/{serviceName}/templates/{id}/software/{softwareId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		qPath = qPath.replace("{softwareId}", softwareId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSoftware.class);
	}

	/**
	 * Return the VPS console URL
	 * 
	 * REST: POST /vps/{serviceName}/getConsoleUrl
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public String serviceName_getConsoleUrl_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/getConsoleUrl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /vps/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/vps/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/secondaryDnsDomains/{domain}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param domain [required] domain on slave server
	 */
	public OvhSecondaryDNS serviceName_secondaryDnsDomains_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/vps/{serviceName}/secondaryDnsDomains/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSecondaryDNS.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /vps/{serviceName}/secondaryDnsDomains/{domain}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param domain [required] domain on slave server
	 */
	public void serviceName_secondaryDnsDomains_domain_PUT(String serviceName, String domain, OvhSecondaryDNS body) throws IOException {
		String qPath = "/vps/{serviceName}/secondaryDnsDomains/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		exec("PUT", qPath, body);
	}

	/**
	 * remove this domain
	 * 
	 * REST: DELETE /vps/{serviceName}/secondaryDnsDomains/{domain}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param domain [required] domain on slave server
	 */
	public void serviceName_secondaryDnsDomains_domain_DELETE(String serviceName, String domain) throws IOException {
		String qPath = "/vps/{serviceName}/secondaryDnsDomains/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		exec("DELETE", qPath);
	}

	/**
	 * domain name server informations
	 * 
	 * REST: GET /vps/{serviceName}/secondaryDnsDomains/{domain}/dnsServer
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param domain [required] domain on slave server
	 */
	public OvhSecondaryDNSNameServer serviceName_secondaryDnsDomains_domain_dnsServer_GET(String serviceName, String domain) throws IOException {
		String qPath = "/vps/{serviceName}/secondaryDnsDomains/{domain}/dnsServer";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSecondaryDNSNameServer.class);
	}

	/**
	 * List of secondary dns domain name
	 * 
	 * REST: GET /vps/{serviceName}/secondaryDnsDomains
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> serviceName_secondaryDnsDomains_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/secondaryDnsDomains";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * add a domain on secondary dns
	 * 
	 * REST: POST /vps/{serviceName}/secondaryDnsDomains
	 * @param domain [required] The domain to add
	 * @param ip [required]
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public void serviceName_secondaryDnsDomains_POST(String serviceName, String domain, String ip) throws IOException {
		String qPath = "/vps/{serviceName}/secondaryDnsDomains";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "ip", ip);
		exec("POST", qPath, o);
	}

	/**
	 * Get the countries you can select for your IPs geolocation
	 * 
	 * REST: GET /vps/{serviceName}/ipCountryAvailable
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<OvhGeolocationEnum> serviceName_ipCountryAvailable_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/ipCountryAvailable";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhGeolocationEnum>> t6 = new TypeReference<ArrayList<OvhGeolocationEnum>>() {};

	/**
	 * Give the status of the services of the main IP
	 * 
	 * REST: GET /vps/{serviceName}/status
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhServiceStatus serviceName_status_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/status";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServiceStatus.class);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /vps/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/vps/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t4);
	}

	/**
	 * Create a VPS.Task that will umount a restored backup on your VPS
	 * 
	 * REST: POST /vps/{serviceName}/automatedBackup/detachBackup
	 * @param restorePoint [required] restorePoint fetched in /vps/{serviceName}/automatedBackup/attachedBackup
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_automatedBackup_detachBackup_POST(String serviceName, Date restorePoint) throws IOException {
		String qPath = "/vps/{serviceName}/automatedBackup/detachBackup";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "restorePoint", restorePoint);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/automatedBackup
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhAutomatedBackup serviceName_automatedBackup_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/automatedBackup";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAutomatedBackup.class);
	}

	/**
	 * Get available Restore Points
	 * 
	 * REST: GET /vps/{serviceName}/automatedBackup/restorePoints
	 * @param state [required] The state of the restore point
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Date> serviceName_automatedBackup_restorePoints_GET(String serviceName, OvhRestoreStateEnum state) throws IOException {
		String qPath = "/vps/{serviceName}/automatedBackup/restorePoints";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<Date>> t7 = new TypeReference<ArrayList<Date>>() {};

	/**
	 * Creates a VPS.Task that will restore the given restorePoint
	 * 
	 * REST: POST /vps/{serviceName}/automatedBackup/restore
	 * @param changePassword [required] [default=0] Only with restore full on VPS Cloud 2014
	 * @param type [required] [default=file] file: Attach/export restored disk to your current VPS - full: Replace your current VPS by the given restorePoint
	 * @param restorePoint [required] Restore Point fetched in /automatedBackup/restorePoints
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_automatedBackup_restore_POST(String serviceName, Boolean changePassword, OvhRestoreTypeEnum type, Date restorePoint) throws IOException {
		String qPath = "/vps/{serviceName}/automatedBackup/restore";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "changePassword", changePassword);
		addBody(o, "type", type);
		addBody(o, "restorePoint", restorePoint);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Backup attached to your VPS
	 * 
	 * REST: GET /vps/{serviceName}/automatedBackup/attachedBackup
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<OvhAttached> serviceName_automatedBackup_attachedBackup_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/automatedBackup/attachedBackup";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhAttached>> t8 = new TypeReference<ArrayList<OvhAttached>>() {};

	/**
	 * Return many statistics about the virtual machine at that time
	 * 
	 * REST: GET /vps/{serviceName}/use
	 * @param type [required] The type of statistic to be fetched
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhUnitAndValue<Double> serviceName_use_GET(String serviceName, OvhVpsStatisticTypeEnum type) throws IOException {
		String qPath = "/vps/{serviceName}/use";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t9);
	}
	private static TypeReference<OvhUnitAndValue<Double>> t9 = new TypeReference<OvhUnitAndValue<Double>>() {};

	/**
	 * List of VPS options
	 * 
	 * REST: GET /vps/{serviceName}/option
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<OvhVpsOptionEnum> serviceName_option_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/option";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/option/{option}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param option [required] The option name
	 */
	public OvhOption serviceName_option_option_GET(String serviceName, net.minidev.ovh.api.vps.OvhVpsOptionEnum option) throws IOException {
		String qPath = "/vps/{serviceName}/option/{option}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{option}", option.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOption.class);
	}

	/**
	 * Release a given option
	 * 
	 * REST: DELETE /vps/{serviceName}/option/{option}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param option [required] The option name
	 */
	public void serviceName_option_option_DELETE(String serviceName, net.minidev.ovh.api.vps.OvhVpsOptionEnum option) throws IOException {
		String qPath = "/vps/{serviceName}/option/{option}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{option}", option.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/snapshot
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhSnapshot serviceName_snapshot_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSnapshot.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /vps/{serviceName}/snapshot
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public void serviceName_snapshot_PUT(String serviceName, OvhSnapshot body) throws IOException {
		String qPath = "/vps/{serviceName}/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Creates a vps.Task that will delete the Snapshot
	 * 
	 * REST: DELETE /vps/{serviceName}/snapshot
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_snapshot_DELETE(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Revert the Virtual Server to this snapshot
	 * 
	 * REST: POST /vps/{serviceName}/snapshot/revert
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_snapshot_revert_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/snapshot/revert";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request a reboot of the machine
	 * 
	 * REST: POST /vps/{serviceName}/reboot
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_reboot_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/reboot";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the machine to stop
	 * 
	 * REST: POST /vps/{serviceName}/stop
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_stop_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/stop";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Disks associated to this virtual server
	 * 
	 * REST: GET /vps/{serviceName}/disks
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_disks_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/disks";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /vps/{serviceName}/disks/{id}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhDisk serviceName_disks_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/vps/{serviceName}/disks/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDisk.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /vps/{serviceName}/disks/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_disks_id_PUT(String serviceName, Long id, OvhDisk body) throws IOException {
		String qPath = "/vps/{serviceName}/disks/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Return many statistics about the disk for a given period
	 * 
	 * REST: GET /vps/{serviceName}/disks/{id}/monitoring
	 * @param period [required] The period the statistics are fetched for
	 * @param type [required] The type of statistic to be fetched
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhUnitAndValues<OvhVpsTimestampValue> serviceName_disks_id_monitoring_GET(String serviceName, Long id, OvhVpsMonitoringPeriodEnum period, OvhStatisticTypeEnum type) throws IOException {
		String qPath = "/vps/{serviceName}/disks/{id}/monitoring";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		qPath = query(qPath, "period", period);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}

	/**
	 * Return many statistics about the disk at that time
	 * 
	 * REST: GET /vps/{serviceName}/disks/{id}/use
	 * @param type [required] The type of statistic to be fetched
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhUnitAndValue<Double> serviceName_disks_id_use_GET(String serviceName, Long id, OvhStatisticTypeEnum type) throws IOException {
		String qPath = "/vps/{serviceName}/disks/{id}/use";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t9);
	}

	/**
	 * Secondary nameServer available for your Server
	 * 
	 * REST: GET /vps/{serviceName}/secondaryDnsNameServerAvailable
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhSecondaryDNSNameServer serviceName_secondaryDnsNameServerAvailable_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/secondaryDnsNameServerAvailable";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSecondaryDNSNameServer.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /vps
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/vps";
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * List all the datacenters for a specific country
	 * 
	 * REST: GET /vps/datacenter
	 * @param country [required] Country targeted
	 */
	public ArrayList<String> datacenter_GET(OvhCountryEnum country) throws IOException {
		String qPath = "/vps/datacenter";
		qPath = query(qPath, "country", country);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}
}
