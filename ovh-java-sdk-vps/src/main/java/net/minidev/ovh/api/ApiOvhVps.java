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
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
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
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/vps
 * version:1.0
 */
public class ApiOvhVps extends ApiOvhBase {
	public ApiOvhVps(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List all the datacenters for a specific country
	 *
	 * REST: GET /vps/datacenter
	 * @param country [required] Country targeted
	 */
	public ArrayList<String> datacenter_GET(OvhCountryEnum country) throws IOException {
		String qPath = "/vps/datacenter";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Return all models the virtual server can be upgraded to
	 *
	 * REST: GET /vps/{serviceName}/availableUpgrade
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<OvhModel> serviceName_availableUpgrade_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/availableUpgrade";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhModel>> t2 = new TypeReference<ArrayList<OvhModel>>() {};

	/**
	 * Return all active options for the virtual server
	 *
	 * REST: GET /vps/{serviceName}/activeOptions
	 * @param serviceName [required] The internal name of your VPS offer
	 * @deprecated
	 */
	public ArrayList<OvhVpsOptionEnum> serviceName_activeOptions_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/activeOptions";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhVpsOptionEnum>> t3 = new TypeReference<ArrayList<OvhVpsOptionEnum>>() {};

	/**
	 * Create a snapshot of the Virtual Server if the snapshot option is enabled and if there is no existing snapshot
	 *
	 * REST: POST /vps/{serviceName}/createSnapshot
	 * @param description [required] A textual description for your snapshot
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_createSnapshot_POST(String serviceName, String description) throws IOException {
		String qPath = "/vps/{serviceName}/createSnapshot";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		String resp = exec(qPath, "POST", sb.toString(), o);
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
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhAttached>> t4 = new TypeReference<ArrayList<OvhAttached>>() {};

	/**
	 * Get available Restore Points
	 *
	 * REST: GET /vps/{serviceName}/automatedBackup/restorePoints
	 * @param state [required] The state of the restore point
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Date> serviceName_automatedBackup_restorePoints_GET(String serviceName, OvhRestoreStateEnum state) throws IOException {
		String qPath = "/vps/{serviceName}/automatedBackup/restorePoints";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "state", state);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<Date>> t5 = new TypeReference<ArrayList<Date>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/automatedBackup
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhAutomatedBackup serviceName_automatedBackup_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/automatedBackup";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAutomatedBackup.class);
	}

	/**
	 * Creates a VPS.Task that will restore the given restorePoint
	 *
	 * REST: POST /vps/{serviceName}/automatedBackup/restore
	 * @param restorePoint [required] Restore Point fetched in /automatedBackup/restorePoints
	 * @param type [required] file: Attach/export restored disk to your current VPS - full: Replace your current VPS by the given restorePoint
	 * @param changePassword [required] Only with restore full on VPS Cloud 2014
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_automatedBackup_restore_POST(String serviceName, Boolean changePassword, Date restorePoint, OvhRestoreTypeEnum type) throws IOException {
		String qPath = "/vps/{serviceName}/automatedBackup/restore";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "changePassword", changePassword);
		addBody(o, "restorePoint", restorePoint);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
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
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "restorePoint", restorePoint);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Secondary nameServer available for your Server
	 *
	 * REST: GET /vps/{serviceName}/secondaryDnsNameServerAvailable
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhSecondaryDNSNameServer serviceName_secondaryDnsNameServerAvailable_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/secondaryDnsNameServerAvailable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSecondaryDNSNameServer.class);
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
		StringBuilder sb = path(qPath, serviceName, softwareId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSoftware.class);
	}

	/**
	 * List available softwares for this template Id
	 *
	 * REST: GET /vps/{serviceName}/distribution/software
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_distribution_software_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/distribution/software";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<Long>> t6 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/distribution
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTemplate serviceName_distribution_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/distribution";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTemplate.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get the countries you can select for your IPs geolocation
	 *
	 * REST: GET /vps/{serviceName}/ipCountryAvailable
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<OvhGeolocationEnum> serviceName_ipCountryAvailable_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/ipCountryAvailable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhGeolocationEnum>> t7 = new TypeReference<ArrayList<OvhGeolocationEnum>>() {};

	/**
	 * Change your Backup FTP password
	 *
	 * REST: POST /vps/{serviceName}/backupftp/password
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public net.minidev.ovh.api.dedicated.server.OvhTask serviceName_backupftp_password_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/password";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/backupftp
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhBackupFtp serviceName_backupftp_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupFtp.class);
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
		StringBuilder sb = path(qPath, serviceName, ipBlock);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName, ipBlock);
		exec(qPath, "PUT", sb.toString(), body);
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
		StringBuilder sb = path(qPath, serviceName, ipBlock);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.dedicated.server.OvhTask.class);
	}

	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 *
	 * REST: GET /vps/{serviceName}/backupftp/access
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> serviceName_backupftp_access_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/access";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new Backup FTP ACL
	 *
	 * REST: POST /vps/{serviceName}/backupftp/access
	 * @param ftp [required] Wether to allow the FTP protocol for this ACL
	 * @param cifs [required] Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param nfs [required] Wether to allow the NFS protocol for this ACL
	 * @param ipBlock [required] The IP Block specific to this ACL. It musts belong to your server.
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public net.minidev.ovh.api.dedicated.server.OvhTask serviceName_backupftp_access_POST(String serviceName, Boolean cifs, Boolean ftp, String ipBlock, Boolean nfs) throws IOException {
		String qPath = "/vps/{serviceName}/backupftp/access";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cifs", cifs);
		addBody(o, "ftp", ftp);
		addBody(o, "ipBlock", ipBlock);
		addBody(o, "nfs", nfs);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, net.minidev.ovh.api.dedicated.server.OvhTask.class);
	}

	/**
	 * Request a reboot of the machine
	 *
	 * REST: POST /vps/{serviceName}/reboot
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_reboot_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/reboot";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhVPS serviceName_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
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
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "protocol", protocol);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVnc.class);
	}

	/**
	 * Reinstall the virtual server
	 *
	 * REST: POST /vps/{serviceName}/reinstall
	 * @param templateId [required] Id of the vps.Template fetched in /templates list
	 * @param sshKey [required] SSH key names to pre-install on your VPS (name from /me/sshKey)
	 * @param doNotSendPassword [required] If asked, the installation password will NOT be sent (only if sshKey defined)
	 * @param softwareId [required] Id of the vps.Software type fetched in /template/{id}/software
	 * @param language [required] Distribution language. default : en
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_reinstall_POST(String serviceName, Boolean doNotSendPassword, String language, Long[] softwareId, String[] sshKey, Long templateId) throws IOException {
		String qPath = "/vps/{serviceName}/reinstall";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "doNotSendPassword", doNotSendPassword);
		addBody(o, "language", language);
		addBody(o, "softwareId", softwareId);
		addBody(o, "sshKey", sshKey);
		addBody(o, "templateId", templateId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the machine to start
	 *
	 * REST: POST /vps/{serviceName}/start
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_start_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/start";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /vps/{serviceName}/changeContact
	 * @param contactAdmin [required] The contact to set as admin contact
	 * @param contactTech [required] The contact to set as tech contact
	 * @param contactBilling [required] The contact to set as billing contact
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/vps/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t6);
	}

	/**
	 * Start the process in order to set the root password of the virtual machine. Be careful, in case of Cloud model, a reboot is mandatory.
	 *
	 * REST: POST /vps/{serviceName}/setPassword
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_setPassword_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/setPassword";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
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
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
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
		StringBuilder sb = path(qPath, serviceName, id, softwareId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSoftware.class);
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
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTemplate.class);
	}

	/**
	 * Templates available for this virtual server
	 *
	 * REST: GET /vps/{serviceName}/templates
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_templates_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/templates";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/datacenter
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhDatacenter serviceName_datacenter_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/datacenter";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDatacenter.class);
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
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
	}
	private static TypeReference<OvhUnitAndValues<OvhVpsTimestampValue>> t8 = new TypeReference<OvhUnitAndValues<OvhVpsTimestampValue>>() {};

	/**
	 * Give the status of the services of the main IP
	 *
	 * REST: GET /vps/{serviceName}/status
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhServiceStatus serviceName_status_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/status";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceStatus.class);
	}

	/**
	 * Request the machine to stop
	 *
	 * REST: POST /vps/{serviceName}/stop
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_stop_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/stop";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of VPS options
	 *
	 * REST: GET /vps/{serviceName}/option
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<OvhVpsOptionEnum> serviceName_option_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/option";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
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
		StringBuilder sb = path(qPath, serviceName, option);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName, option);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Tasks associated to this virtual server
	 *
	 * REST: GET /vps/{serviceName}/tasks
	 * @param state [required] Filter the value of state property (=)
	 * @param type [required] Filter the value of type property (=)
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, OvhTaskStateEnum state, OvhTaskTypeEnum type) throws IOException {
		String qPath = "/vps/{serviceName}/tasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "state", state);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
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
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/snapshot
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhSnapshot serviceName_snapshot_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/snapshot";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Creates a vps.Task that will delete the Snapshot
	 *
	 * REST: DELETE /vps/{serviceName}/snapshot
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhTask serviceName_snapshot_DELETE(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/snapshot";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Return the VPS console URL
	 *
	 * REST: POST /vps/{serviceName}/getConsoleUrl
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public String serviceName_getConsoleUrl_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/getConsoleUrl";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /vps/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/vps/{serviceName}/confirmTermination";
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
	 * Ips associated to this virtual server
	 *
	 * REST: GET /vps/{serviceName}/ips
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> serviceName_ips_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/ips";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/ips/{ipAddress}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param ipAddress [required] The effective ip address of the Ip object
	 */
	public OvhIp serviceName_ips_ipAddress_GET(String serviceName, String ipAddress) throws IOException {
		String qPath = "/vps/{serviceName}/ips/{ipAddress}";
		StringBuilder sb = path(qPath, serviceName, ipAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName, ipAddress);
		exec(qPath, "PUT", sb.toString(), body);
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
		StringBuilder sb = path(qPath, serviceName, ipAddress);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Return many statistics about the virtual machine at that time
	 *
	 * REST: GET /vps/{serviceName}/use
	 * @param type [required] The type of statistic to be fetched
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhUnitAndValue<Double> serviceName_use_GET(String serviceName, OvhVpsStatisticTypeEnum type) throws IOException {
		String qPath = "/vps/{serviceName}/use";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}
	private static TypeReference<OvhUnitAndValue<Double>> t9 = new TypeReference<OvhUnitAndValue<Double>>() {};

	/**
	 * List of secondary dns domain name
	 *
	 * REST: GET /vps/{serviceName}/secondaryDnsDomains
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> serviceName_secondaryDnsDomains_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/secondaryDnsDomains";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
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
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "ip", ip);
		exec(qPath, "POST", sb.toString(), o);
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
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSecondaryDNSNameServer.class);
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
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName, domain);
		exec(qPath, "PUT", sb.toString(), body);
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
		StringBuilder sb = path(qPath, serviceName, domain);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Disks associated to this virtual server
	 *
	 * REST: GET /vps/{serviceName}/disks
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<Long> serviceName_disks_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/disks";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
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
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Return many statistics about the disk for a given period
	 *
	 * REST: GET /vps/{serviceName}/disks/{id}/monitoring
	 * @param type [required] The type of statistic to be fetched
	 * @param period [required] The period the statistics are fetched for
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhUnitAndValues<OvhVpsTimestampValue> serviceName_disks_id_monitoring_GET(String serviceName, Long id, OvhVpsMonitoringPeriodEnum period, OvhStatisticTypeEnum type) throws IOException {
		String qPath = "/vps/{serviceName}/disks/{id}/monitoring";
		StringBuilder sb = path(qPath, serviceName, id);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
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
		StringBuilder sb = path(qPath, serviceName, id);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/veeam/restoredBackup
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhRestoredBackup serviceName_veeam_restoredBackup_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/veeam/restoredBackup";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
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
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/veeam
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public OvhVeeam serviceName_veeam_GET(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/veeam";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVeeam.class);
	}

	/**
	 * Creates a VPS.Task that will restore the given restorePoint
	 *
	 * REST: POST /vps/{serviceName}/veeam/restorePoints/{id}/restore
	 * @param export [required] (Except full) The export method for your restore - defaults to both
	 * @param changePassword [required] (Full only) Change the restored VPS root password when done
	 * @param full [required] Replace your current VPS by the restorePoint
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhTask serviceName_veeam_restorePoints_id_restore_POST(String serviceName, Long id, Boolean changePassword, OvhExportTypeEnum export, Boolean full) throws IOException {
		String qPath = "/vps/{serviceName}/veeam/restorePoints/{id}/restore";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "changePassword", changePassword);
		addBody(o, "export", export);
		addBody(o, "full", full);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /vps/{serviceName}/veeam/restorePoints/{id}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param id [required] Id of the object
	 */
	public OvhRestorePoint serviceName_veeam_restorePoints_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/vps/{serviceName}/veeam/restorePoints/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRestorePoint.class);
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
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "creationTime", creationTime);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /vps/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/vps/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /vps
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/vps";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
