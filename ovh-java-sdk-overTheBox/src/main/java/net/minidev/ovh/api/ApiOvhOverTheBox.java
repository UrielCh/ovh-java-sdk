package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.overthebox.OvhActionStatusEnum;
import net.minidev.ovh.api.overthebox.OvhAvailableDeviceAction;
import net.minidev.ovh.api.overthebox.OvhAvailableMigrationOffer;
import net.minidev.ovh.api.overthebox.OvhBackup;
import net.minidev.ovh.api.overthebox.OvhDevice;
import net.minidev.ovh.api.overthebox.OvhDeviceAction;
import net.minidev.ovh.api.overthebox.OvhDeviceForRegistration;
import net.minidev.ovh.api.overthebox.OvhRemoteAccess;
import net.minidev.ovh.api.overthebox.OvhTask;
import net.minidev.ovh.api.overthebox.OvhTaskStatusEnum;
import net.minidev.ovh.api.overthebox.OvhTemporaryLogsLink;
import net.minidev.ovh.api.price.overthebox.OvhOfferEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/overTheBox
 * version:1.0
 */
public class ApiOvhOverTheBox extends ApiOvhBase {
	public ApiOvhOverTheBox(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get the list of devices connected from the same IP address
	 *
	 * REST: POST /overTheBox/devices
	 */
	public ArrayList<OvhDeviceForRegistration> devices_POST() throws IOException {
		String qPath = "/overTheBox/devices";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhDeviceForRegistration>> t1 = new TypeReference<ArrayList<OvhDeviceForRegistration>>() {};

	/**
	 * Link a device to this service
	 *
	 * REST: POST /overTheBox/{serviceName}/linkDevice
	 * @param deviceId [required] The id of the device
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public void serviceName_linkDevice_POST(String serviceName, String deviceId) throws IOException {
		String qPath = "/overTheBox/{serviceName}/linkDevice";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "deviceId", deviceId);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Cancel the resiliation of the Service
	 *
	 * REST: POST /overTheBox/{serviceName}/cancelResiliation
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public void serviceName_cancelResiliation_POST(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/cancelResiliation";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * List available release channels for this service
	 *
	 * REST: GET /overTheBox/{serviceName}/availableReleaseChannels
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public ArrayList<String> serviceName_availableReleaseChannels_GET(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/availableReleaseChannels";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /overTheBox/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /overTheBox/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/overTheBox/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /overTheBox/{serviceName}
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public net.minidev.ovh.api.overthebox.OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.overthebox.OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /overTheBox/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public void serviceName_PUT(String serviceName, net.minidev.ovh.api.overthebox.OvhService body) throws IOException {
		String qPath = "/overTheBox/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Resiliate a service
	 *
	 * REST: DELETE /overTheBox/{serviceName}
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public void serviceName_DELETE(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Authorize the remote access
	 *
	 * REST: POST /overTheBox/{serviceName}/remoteAccesses/{remoteAccessId}/authorize
	 * @param serviceName [required] The internal name of your overTheBox offer
	 * @param remoteAccessId [required] The id of the remote access
	 */
	public void serviceName_remoteAccesses_remoteAccessId_authorize_POST(String serviceName, String remoteAccessId) throws IOException {
		String qPath = "/overTheBox/{serviceName}/remoteAccesses/{remoteAccessId}/authorize";
		StringBuilder sb = path(qPath, serviceName, remoteAccessId);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /overTheBox/{serviceName}/remoteAccesses/{remoteAccessId}
	 * @param serviceName [required] The internal name of your overTheBox offer
	 * @param remoteAccessId [required] The id of the remote access
	 */
	public OvhRemoteAccess serviceName_remoteAccesses_remoteAccessId_GET(String serviceName, String remoteAccessId) throws IOException {
		String qPath = "/overTheBox/{serviceName}/remoteAccesses/{remoteAccessId}";
		StringBuilder sb = path(qPath, serviceName, remoteAccessId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRemoteAccess.class);
	}

	/**
	 * Delete a remote access
	 *
	 * REST: DELETE /overTheBox/{serviceName}/remoteAccesses/{remoteAccessId}
	 * @param serviceName [required] The internal name of your overTheBox offer
	 * @param remoteAccessId [required] The id of the remote access
	 */
	public void serviceName_remoteAccesses_remoteAccessId_DELETE(String serviceName, String remoteAccessId) throws IOException {
		String qPath = "/overTheBox/{serviceName}/remoteAccesses/{remoteAccessId}";
		StringBuilder sb = path(qPath, serviceName, remoteAccessId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * List of remote accesses for the service
	 *
	 * REST: GET /overTheBox/{serviceName}/remoteAccesses
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public ArrayList<String> serviceName_remoteAccesses_GET(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/remoteAccesses";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create a new remote access for the service
	 *
	 * REST: POST /overTheBox/{serviceName}/remoteAccesses
	 * @param exposedPort [required] The port that the device will expose
	 * @param expirationDate [required] The expirationDate of the remote access (default 1 day)
	 * @param allowedIp [required] IP block from which the remote access will be allowed (the default value is the IP from which the call is made)
	 * @param publicKey [required] The remote user public key authorized on the device (for SSH purpose)
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public OvhRemoteAccess serviceName_remoteAccesses_POST(String serviceName, Long exposedPort, Date expirationDate, String allowedIp, String publicKey) throws IOException {
		String qPath = "/overTheBox/{serviceName}/remoteAccesses";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "exposedPort", exposedPort);
		addBody(o, "expirationDate", expirationDate);
		addBody(o, "allowedIp", allowedIp);
		addBody(o, "publicKey", publicKey);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhRemoteAccess.class);
	}

	/**
	 * List of backups for this service
	 *
	 * REST: GET /overTheBox/{serviceName}/backups
	 * @param serviceName [required] The internal name of your overTheBox offer
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_backups_GET(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/backups";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /overTheBox/{serviceName}/backups/{backupId}
	 * @param serviceName [required] The internal name of your overTheBox offer
	 * @param backupId [required] The id of the backup
	 *
	 * API beta
	 */
	public OvhBackup serviceName_backups_backupId_GET(String serviceName, String backupId) throws IOException {
		String qPath = "/overTheBox/{serviceName}/backups/{backupId}";
		StringBuilder sb = path(qPath, serviceName, backupId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackup.class);
	}

	/**
	 * List all available offers one can migrate to
	 *
	 * REST: GET /overTheBox/{serviceName}/migration/offers
	 * @param serviceName [required] The internal name of your overTheBox offer
	 *
	 * API beta
	 */
	public ArrayList<OvhAvailableMigrationOffer> serviceName_migration_offers_GET(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/migration/offers";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhAvailableMigrationOffer>> t3 = new TypeReference<ArrayList<OvhAvailableMigrationOffer>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /overTheBox/{serviceName}/device
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public OvhDevice serviceName_device_GET(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/device";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDevice.class);
	}

	/**
	 * Unlink a device from a service
	 *
	 * REST: DELETE /overTheBox/{serviceName}/device
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public void serviceName_device_DELETE(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/device";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /overTheBox/{serviceName}/device/actions/{actionId}
	 * @param serviceName [required] The internal name of your overTheBox offer
	 * @param actionId [required] The id of the action
	 */
	public OvhDeviceAction serviceName_device_actions_actionId_GET(String serviceName, String actionId) throws IOException {
		String qPath = "/overTheBox/{serviceName}/device/actions/{actionId}";
		StringBuilder sb = path(qPath, serviceName, actionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDeviceAction.class);
	}

	/**
	 * List of actions scheduled for this device
	 *
	 * REST: GET /overTheBox/{serviceName}/device/actions
	 * @param status [required] Filter the value of status property (=)
	 * @param name [required] Filter the value of name property (=)
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public ArrayList<String> serviceName_device_actions_GET(String serviceName, String name, OvhActionStatusEnum status) throws IOException {
		String qPath = "/overTheBox/{serviceName}/device/actions";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "name", name);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create a device action on the device
	 *
	 * REST: POST /overTheBox/{serviceName}/device/actions
	 * @param name [required] Name of the action
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public OvhDeviceAction serviceName_device_actions_POST(String serviceName, String name) throws IOException {
		String qPath = "/overTheBox/{serviceName}/device/actions";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhDeviceAction.class);
	}

	/**
	 * Create an action to generate a backup
	 *
	 * REST: POST /overTheBox/{serviceName}/device/backup
	 * @param serviceName [required] The internal name of your overTheBox offer
	 *
	 * API beta
	 */
	public OvhDeviceAction serviceName_device_backup_POST(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/device/backup";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhDeviceAction.class);
	}

	/**
	 * Create a group of actions to restore a given backup
	 *
	 * REST: POST /overTheBox/{serviceName}/device/restoreBackup
	 * @param backupId [required] The id of the backup to restore
	 * @param serviceName [required] The internal name of your overTheBox offer
	 *
	 * API beta
	 */
	public ArrayList<OvhDeviceAction> serviceName_device_restoreBackup_POST(String serviceName, String backupId) throws IOException {
		String qPath = "/overTheBox/{serviceName}/device/restoreBackup";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backupId", backupId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhDeviceAction>> t4 = new TypeReference<ArrayList<OvhDeviceAction>>() {};

	/**
	 * Generate a temporary url to retrieve device logs
	 *
	 * REST: POST /overTheBox/{serviceName}/device/logs
	 * @param serviceName [required] The internal name of your overTheBox offer
	 *
	 * API beta
	 */
	public OvhTemporaryLogsLink serviceName_device_logs_POST(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/device/logs";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTemporaryLogsLink.class);
	}

	/**
	 * List the available device actions
	 *
	 * REST: GET /overTheBox/{serviceName}/device/availableActions
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public ArrayList<OvhAvailableDeviceAction> serviceName_device_availableActions_GET(String serviceName) throws IOException {
		String qPath = "/overTheBox/{serviceName}/device/availableActions";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhAvailableDeviceAction>> t5 = new TypeReference<ArrayList<OvhAvailableDeviceAction>>() {};

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /overTheBox/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/overTheBox/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<Long>> t6 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /overTheBox/{serviceName}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your overTheBox offer
	 * @param taskId [required] The id of the task
	 */
	public OvhTask serviceName_tasks_taskId_GET(String serviceName, String taskId) throws IOException {
		String qPath = "/overTheBox/{serviceName}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of tasks scheduled for this service
	 *
	 * REST: GET /overTheBox/{serviceName}/tasks
	 * @param name [required] Filter the value of name property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your overTheBox offer
	 */
	public ArrayList<String> serviceName_tasks_GET(String serviceName, String name, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/overTheBox/{serviceName}/tasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "name", name);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * List available services
	 *
	 * REST: GET /overTheBox
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/overTheBox";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * List the available offers for the new call
	 *
	 * REST: GET /overTheBox/availableOffers
	 */
	public ArrayList<OvhOfferEnum> availableOffers_GET() throws IOException {
		String qPath = "/overTheBox/availableOffers";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhOfferEnum>> t7 = new TypeReference<ArrayList<OvhOfferEnum>>() {};
}
