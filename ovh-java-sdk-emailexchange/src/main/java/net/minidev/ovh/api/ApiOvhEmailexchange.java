package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.email.exchange.OvhAccount;
import net.minidev.ovh.api.email.exchange.OvhDailyLicense;
import net.minidev.ovh.api.email.exchange.OvhDeviceActiveSyncStateEnum;
import net.minidev.ovh.api.email.exchange.OvhDisclaimer;
import net.minidev.ovh.api.email.exchange.OvhDisclaimerAttributeEnum;
import net.minidev.ovh.api.email.exchange.OvhDomain;
import net.minidev.ovh.api.email.exchange.OvhDomainTypeEnum;
import net.minidev.ovh.api.email.exchange.OvhExchangeAccountAlias;
import net.minidev.ovh.api.email.exchange.OvhExchangeAccountDiagnosis;
import net.minidev.ovh.api.email.exchange.OvhExchangeAccountFullAccess;
import net.minidev.ovh.api.email.exchange.OvhExchangeAccountProtocol;
import net.minidev.ovh.api.email.exchange.OvhExchangeAccountSendAs;
import net.minidev.ovh.api.email.exchange.OvhExchangeAccountSendOnBehalfTo;
import net.minidev.ovh.api.email.exchange.OvhExchangeDistributionGroupManager;
import net.minidev.ovh.api.email.exchange.OvhExchangeDistributionGroupMember;
import net.minidev.ovh.api.email.exchange.OvhExchangeDistributionGroupSendAs;
import net.minidev.ovh.api.email.exchange.OvhExchangeDistributionGroupSendOnBehalfTo;
import net.minidev.ovh.api.email.exchange.OvhExchangeExternalContact;
import net.minidev.ovh.api.email.exchange.OvhExchangeMailingListAlias;
import net.minidev.ovh.api.email.exchange.OvhExchangePublicFolderPermission;
import net.minidev.ovh.api.email.exchange.OvhExchangeResourceAccountDelegate;
import net.minidev.ovh.api.email.exchange.OvhExchangeService;
import net.minidev.ovh.api.email.exchange.OvhExchangeServiceActiveSyncNotification;
import net.minidev.ovh.api.email.exchange.OvhExchangeServiceDevice;
import net.minidev.ovh.api.email.exchange.OvhExchangeServiceProtocol;
import net.minidev.ovh.api.email.exchange.OvhExchangeSharedAccountFullAccess;
import net.minidev.ovh.api.email.exchange.OvhExchangeSharedAccountSendAs;
import net.minidev.ovh.api.email.exchange.OvhExchangeSharedAccountSendOnBehalfTo;
import net.minidev.ovh.api.email.exchange.OvhExport;
import net.minidev.ovh.api.email.exchange.OvhExportUrl;
import net.minidev.ovh.api.email.exchange.OvhLanguageEnum;
import net.minidev.ovh.api.email.exchange.OvhMailingFilterEnum;
import net.minidev.ovh.api.email.exchange.OvhMailingList;
import net.minidev.ovh.api.email.exchange.OvhMailingListDepartRestrictionEnum;
import net.minidev.ovh.api.email.exchange.OvhMailingListJoinRestrictionEnum;
import net.minidev.ovh.api.email.exchange.OvhObjectStateEnum;
import net.minidev.ovh.api.email.exchange.OvhOutlookUrl;
import net.minidev.ovh.api.email.exchange.OvhOutlookVersionEnum;
import net.minidev.ovh.api.email.exchange.OvhOutlookVersions;
import net.minidev.ovh.api.email.exchange.OvhOvhLicenceEnum;
import net.minidev.ovh.api.email.exchange.OvhPublicFolder;
import net.minidev.ovh.api.email.exchange.OvhPublicFolderQuota;
import net.minidev.ovh.api.email.exchange.OvhPublicFolderRightTypeEnum;
import net.minidev.ovh.api.email.exchange.OvhPublicFolderTypeEnum;
import net.minidev.ovh.api.email.exchange.OvhResourceAccount;
import net.minidev.ovh.api.email.exchange.OvhResourceTypeEnum;
import net.minidev.ovh.api.email.exchange.OvhServer;
import net.minidev.ovh.api.email.exchange.OvhSharedAccount;
import net.minidev.ovh.api.email.exchange.OvhSharedAccountQuota;
import net.minidev.ovh.api.email.exchange.OvhSpamAndVirusConfiguration;
import net.minidev.ovh.api.email.exchange.OvhTask;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/email/exchange
 * version:1.0
 */
public class ApiOvhEmailexchange extends ApiOvhBase {
	public ApiOvhEmailexchange(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /email/exchange
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/email/exchange";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * List available services
	 * 
	 * REST: GET /email/exchange/{organizationName}/service
	 * @param organizationName [required] The internal name of your exchange organization
	 */
	public ArrayList<String> organizationName_service_GET(String organizationName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service";
		qPath = qPath.replace("{organizationName}", organizationName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/serviceInfos
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhService organizationName_service_exchangeService_serviceInfos_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/serviceInfos";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/serviceInfos
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public void organizationName_service_exchangeService_serviceInfos_PUT(String organizationName, String exchangeService, OvhService body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/serviceInfos";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/protocol
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhExchangeServiceProtocol organizationName_service_exchangeService_protocol_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/protocol";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeServiceProtocol.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/protocol
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public void organizationName_service_exchangeService_protocol_PUT(String organizationName, String exchangeService, OvhExchangeServiceProtocol body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/protocol";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		exec("PUT", qPath, body);
	}

	/**
	 * Exchange account id subscribed to ActiveSync quarantine notifications
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/protocol/activeSyncMailNotification
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<Long> organizationName_service_exchangeService_protocol_activeSyncMailNotification_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/protocol/activeSyncMailNotification";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Subscribe new address to ActiveSync quarantine notifications
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/protocol/activeSyncMailNotification
	 * @param notifiedAccountId [required] Exchange Account Id
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_protocol_activeSyncMailNotification_POST(String organizationName, String exchangeService, Long notifiedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/protocol/activeSyncMailNotification";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "notifiedAccountId", notifiedAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/protocol/activeSyncMailNotification/{notifiedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param notifiedAccountId [required] Notified Account Id
	 */
	public OvhExchangeServiceActiveSyncNotification organizationName_service_exchangeService_protocol_activeSyncMailNotification_notifiedAccountId_GET(String organizationName, String exchangeService, Long notifiedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/protocol/activeSyncMailNotification/{notifiedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{notifiedAccountId}", notifiedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeServiceActiveSyncNotification.class);
	}

	/**
	 * Unubscribe address from ActiveSync quarantine notifications
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/protocol/activeSyncMailNotification/{notifiedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param notifiedAccountId [required] Notified Account Id
	 */
	public OvhTask organizationName_service_exchangeService_protocol_activeSyncMailNotification_notifiedAccountId_DELETE(String organizationName, String exchangeService, Long notifiedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/protocol/activeSyncMailNotification/{notifiedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{notifiedAccountId}", notifiedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhExchangeService organizationName_service_exchangeService_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public void organizationName_service_exchangeService_PUT(String organizationName, String exchangeService, OvhExchangeService body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		exec("PUT", qPath, body);
	}

	/**
	 * Shared accounts associated to this exchange service
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount
	 * @param sharedEmailAddress [required] Filter the value of sharedEmailAddress property (like)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> organizationName_service_exchangeService_sharedAccount_GET(String organizationName, String exchangeService, String sharedEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "sharedEmailAddress", sharedEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new shared mailbox in exchange server
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount
	 * @param initials [required] Shared account initials
	 * @param firstName [required] Shared account first name
	 * @param quota [required] Shared account maximum size
	 * @param hiddenFromGAL [required] Hide the shared account in Global Address List
	 * @param sharedEmailAddress [required] Shared account email address
	 * @param lastName [required] Shared account last name
	 * @param mailingFilter [required] Enable mailing filtrering
	 * @param displayName [required] Shared account display name
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_sharedAccount_POST(String organizationName, String exchangeService, String initials, String firstName, Long quota, Boolean hiddenFromGAL, String sharedEmailAddress, String lastName, OvhMailingFilterEnum[] mailingFilter, String displayName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "initials", initials);
		addBody(o, "firstName", firstName);
		addBody(o, "quota", quota);
		addBody(o, "hiddenFromGAL", hiddenFromGAL);
		addBody(o, "sharedEmailAddress", sharedEmailAddress);
		addBody(o, "lastName", lastName);
		addBody(o, "mailingFilter", mailingFilter);
		addBody(o, "displayName", displayName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public OvhSharedAccount organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_GET(String organizationName, String exchangeService, String sharedEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSharedAccount.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public void organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_PUT(String organizationName, String exchangeService, String sharedEmailAddress, OvhSharedAccount body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete existing shared mailbox in exchange server
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public OvhTask organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_DELETE(String organizationName, String exchangeService, String sharedEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Pending task for this mailbox
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/tasks
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public ArrayList<Long> organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_tasks_GET(String organizationName, String exchangeService, String sharedEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/tasks";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/tasks/{id}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 * @param id [required] Task id
	 */
	public OvhTask organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_tasks_id_GET(String organizationName, String exchangeService, String sharedEmailAddress, Long id) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/tasks/{id}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * SendOnBehalfTo granted users for this shared mailbox
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendOnBehalfTo
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public ArrayList<Long> organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_sendOnBehalfTo_GET(String organizationName, String exchangeService, String sharedEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendOnBehalfTo";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow another user to Send On Behalf To mails from this shared mailbox
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendOnBehalfTo
	 * @param allowAccountId [required] Account id to allow to send On Behalf To mails from this shared mailbox
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public OvhTask organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_sendOnBehalfTo_POST(String organizationName, String exchangeService, String sharedEmailAddress, Long allowAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendOnBehalfTo";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendOnBehalfTo/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhExchangeSharedAccountSendOnBehalfTo organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_sendOnBehalfTo_allowedAccountId_GET(String organizationName, String exchangeService, String sharedEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendOnBehalfTo/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeSharedAccountSendOnBehalfTo.class);
	}

	/**
	 * Delete allowed user for SendOnBehalfTo
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendOnBehalfTo/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhTask organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_sendOnBehalfTo_allowedAccountId_DELETE(String organizationName, String exchangeService, String sharedEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendOnBehalfTo/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Full access granted users for this shared mailbox
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/fullAccess
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public ArrayList<Long> organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_fullAccess_GET(String organizationName, String exchangeService, String sharedEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/fullAccess";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow full access to a user
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/fullAccess
	 * @param allowedAccountId [required] User to give full access
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public OvhTask organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_fullAccess_POST(String organizationName, String exchangeService, String sharedEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/fullAccess";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowedAccountId", allowedAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/fullAccess/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 * @param allowedAccountId [required] Account id to give full access
	 */
	public OvhExchangeSharedAccountFullAccess organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_fullAccess_allowedAccountId_GET(String organizationName, String exchangeService, String sharedEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/fullAccess/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeSharedAccountFullAccess.class);
	}

	/**
	 * Revoke full access
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/fullAccess/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 * @param allowedAccountId [required] Account id to give full access
	 */
	public OvhTask organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_fullAccess_allowedAccountId_DELETE(String organizationName, String exchangeService, String sharedEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/fullAccess/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Send as granted users for this shared mailbox
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendAs
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public ArrayList<Long> organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_sendAs_GET(String organizationName, String exchangeService, String sharedEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendAs";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow another user to send mails from this shared mailbox
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendAs
	 * @param allowAccountId [required] Account id to allow to send mails from this shared mailbox
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 */
	public OvhTask organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_sendAs_POST(String organizationName, String exchangeService, String sharedEmailAddress, Long allowAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendAs";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendAs/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 * @param allowedAccountId [required] Account id to give send as
	 */
	public OvhExchangeSharedAccountSendAs organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_sendAs_allowedAccountId_GET(String organizationName, String exchangeService, String sharedEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendAs/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeSharedAccountSendAs.class);
	}

	/**
	 * Delete allowed user for sendAs
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendAs/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param sharedEmailAddress [required] Default email for this shared mailbox
	 * @param allowedAccountId [required] Account id to give send as
	 */
	public OvhTask organizationName_service_exchangeService_sharedAccount_sharedEmailAddress_sendAs_allowedAccountId_DELETE(String organizationName, String exchangeService, String sharedEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccount/{sharedEmailAddress}/sendAs/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{sharedEmailAddress}", sharedEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get public folder quota usage in total available space
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/publicFolderQuota
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhPublicFolderQuota organizationName_service_exchangeService_publicFolderQuota_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolderQuota";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPublicFolderQuota.class);
	}

	/**
	 * Get DCV emails if your ssl will expire in next 30 days
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/dcvEmails
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> organizationName_service_exchangeService_dcvEmails_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/dcvEmails";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param domainName [required] Domain name
	 */
	public OvhDomain organizationName_service_exchangeService_domain_domainName_GET(String organizationName, String exchangeService, String domainName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param domainName [required] Domain name
	 */
	public void organizationName_service_exchangeService_domain_domainName_PUT(String organizationName, String exchangeService, String domainName, OvhDomain body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{domainName}", domainName);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete existing domain in exchange services
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param domainName [required] Domain name
	 */
	public OvhTask organizationName_service_exchangeService_domain_domainName_DELETE(String organizationName, String exchangeService, String domainName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get diclaimer attributes to substitute with Active Directory properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimerAttribute
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param domainName [required] Domain name
	 */
	public ArrayList<OvhDisclaimerAttributeEnum> organizationName_service_exchangeService_domain_domainName_disclaimerAttribute_GET(String organizationName, String exchangeService, String domainName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimerAttribute";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhDisclaimerAttributeEnum>> t3 = new TypeReference<ArrayList<OvhDisclaimerAttributeEnum>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimer
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param domainName [required] Domain name
	 */
	public OvhDisclaimer organizationName_service_exchangeService_domain_domainName_disclaimer_GET(String organizationName, String exchangeService, String domainName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimer";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDisclaimer.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimer
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param domainName [required] Domain name
	 */
	public void organizationName_service_exchangeService_domain_domainName_disclaimer_PUT(String organizationName, String exchangeService, String domainName, OvhDisclaimer body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimer";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{domainName}", domainName);
		exec("PUT", qPath, body);
	}

	/**
	 * Create organization disclaimer of each email
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimer
	 * @param outsideOnly [required] Activate the disclaimer only for external emails
	 * @param content [required] Signature, added at the bottom of your organization emails
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param domainName [required] Domain name
	 */
	public OvhTask organizationName_service_exchangeService_domain_domainName_disclaimer_POST(String organizationName, String exchangeService, String domainName, Boolean outsideOnly, String content) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimer";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{domainName}", domainName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "outsideOnly", outsideOnly);
		addBody(o, "content", content);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Delete existing organization disclaimer
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimer
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param domainName [required] Domain name
	 */
	public OvhTask organizationName_service_exchangeService_domain_domainName_disclaimer_DELETE(String organizationName, String exchangeService, String domainName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain/{domainName}/disclaimer";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{domainName}", domainName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Domains associated to this service
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/domain
	 * @param main [required] Filter the value of main property (like)
	 * @param state [required] Filter the value of state property (=)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> organizationName_service_exchangeService_domain_GET(String organizationName, String exchangeService, Boolean main, OvhObjectStateEnum state) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "main", main);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new domain in exchange services
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/domain
	 * @param mxRelay [required] If specified, emails to not existing address will be redirected to that domain
	 * @param configureAutodiscover [required] If you host domain in OVH we can configure autodiscover record automatically
	 * @param organization2010 [required] If specified, indicates which organization this newly created domain will be part of (Exchange 2010 only)
	 * @param name [required] Domain to install on server
	 * @param type [required] Type of domain that You want to install
	 * @param configureMx [required] If you host domain in OVH we can configure mx record automatically
	 * @param main [required] This newly created domain will be an organization (Exchange 2010 only)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_domain_POST(String organizationName, String exchangeService, String mxRelay, Boolean configureAutodiscover, String organization2010, String name, OvhDomainTypeEnum type, Boolean configureMx, Boolean main) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/domain";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "mxRelay", mxRelay);
		addBody(o, "configureAutodiscover", configureAutodiscover);
		addBody(o, "organization2010", organization2010);
		addBody(o, "name", name);
		addBody(o, "type", type);
		addBody(o, "configureMx", configureMx);
		addBody(o, "main", main);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Renew SSL if it will expire in next 30 days
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/renewSSL
	 * @param dcv [required] DCV email require for order ssl varification process
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_renewSSL_POST(String organizationName, String exchangeService, String dcv) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/renewSSL";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dcv", dcv);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Public folders associated to this service
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/publicFolder
	 * @param path [required] Filter the value of path property (like)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> organizationName_service_exchangeService_publicFolder_GET(String organizationName, String exchangeService, String path) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "path", path);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create organization public folder
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/publicFolder
	 * @param quota [required] Quota for public folder in MB
	 * @param anonymousPermission [required] [default=none] Access right for the guest users
	 * @param type [required] Type for public folder
	 * @param path [required] Path for public folder
	 * @param defaultPermission [required] [default=none] Default access right
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_publicFolder_POST(String organizationName, String exchangeService, Long quota, OvhPublicFolderRightTypeEnum anonymousPermission, OvhPublicFolderTypeEnum type, String path, OvhPublicFolderRightTypeEnum defaultPermission) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quota", quota);
		addBody(o, "anonymousPermission", anonymousPermission);
		addBody(o, "type", type);
		addBody(o, "path", path);
		addBody(o, "defaultPermission", defaultPermission);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param path [required] Path for public folder
	 */
	public OvhPublicFolder organizationName_service_exchangeService_publicFolder_path_GET(String organizationName, String exchangeService, String path) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{path}", path);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPublicFolder.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param path [required] Path for public folder
	 */
	public void organizationName_service_exchangeService_publicFolder_path_PUT(String organizationName, String exchangeService, String path, OvhPublicFolder body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{path}", path);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete existing organization public folder
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param path [required] Path for public folder
	 */
	public OvhTask organizationName_service_exchangeService_publicFolder_path_DELETE(String organizationName, String exchangeService, String path) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{path}", path);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Public folder permission
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param path [required] Path for public folder
	 */
	public ArrayList<Long> organizationName_service_exchangeService_publicFolder_path_permission_GET(String organizationName, String exchangeService, String path) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{path}", path);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Create public folder permission
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission
	 * @param allowedAccountId [required] Account id to have access to public folder
	 * @param accessRights [required] Access rights to be set for the account
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param path [required] Path for public folder
	 */
	public OvhTask organizationName_service_exchangeService_publicFolder_path_permission_POST(String organizationName, String exchangeService, String path, Long allowedAccountId, OvhPublicFolderRightTypeEnum accessRights) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{path}", path);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowedAccountId", allowedAccountId);
		addBody(o, "accessRights", accessRights);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param path [required] Path for public folder
	 * @param allowedAccountId [required] Account id
	 */
	public OvhExchangePublicFolderPermission organizationName_service_exchangeService_publicFolder_path_permission_allowedAccountId_GET(String organizationName, String exchangeService, String path, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{path}", path);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangePublicFolderPermission.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission/{allowedAccountId}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param path [required] Path for public folder
	 * @param allowedAccountId [required] Account id
	 */
	public void organizationName_service_exchangeService_publicFolder_path_permission_allowedAccountId_PUT(String organizationName, String exchangeService, String path, Long allowedAccountId, OvhExchangePublicFolderPermission body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{path}", path);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete existing permission from public folder
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param path [required] Path for public folder
	 * @param allowedAccountId [required] Account id
	 */
	public OvhTask organizationName_service_exchangeService_publicFolder_path_permission_allowedAccountId_DELETE(String organizationName, String exchangeService, String path, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/publicFolder/{path}/permission/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{path}", path);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/server
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhServer organizationName_service_exchangeService_server_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/server";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServer.class);
	}

	/**
	 * Accounts associated to this exchange service
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account
	 * @param primaryEmailAddress [required] Filter the value of primaryEmailAddress property (like)
	 * @param accountLicense [required] Filter the value of accountLicense property (=)
	 * @param id [required] Filter the value of id property (like)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> organizationName_service_exchangeService_account_GET(String organizationName, String exchangeService, OvhOvhLicenceEnum accountLicense, Long id, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "accountLicense", accountLicense);
		qPath = query(qPath, "id", id);
		qPath = query(qPath, "primaryEmailAddress", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new mailbox in exchange server
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account
	 * @param initials [required] Account initials
	 * @param firstName [required] Account first name
	 * @param hiddenFromGAL [required] Hide the account in Global Address List
	 * @param license [required] Exchange license
	 * @param login [required] Account login
	 * @param password [required] Account password
	 * @param domain [required] Email domain
	 * @param spamAndVirusConfiguration [required] Antispam and Antivirus configuration
	 * @param SAMAccountName [required] SAM account name (exchange 2010 login)
	 * @param mailingFilter [required] Enable mailing filtrering
	 * @param lastName [required] Account last name
	 * @param outlookLicense [required] Buy outlook license
	 * @param displayName [required] Account display name
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_account_POST(String organizationName, String exchangeService, String initials, String firstName, Boolean hiddenFromGAL, OvhOvhLicenceEnum license, String login, String password, String domain, OvhSpamAndVirusConfiguration spamAndVirusConfiguration, String SAMAccountName, OvhMailingFilterEnum[] mailingFilter, String lastName, Boolean outlookLicense, String displayName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "initials", initials);
		addBody(o, "firstName", firstName);
		addBody(o, "hiddenFromGAL", hiddenFromGAL);
		addBody(o, "license", license);
		addBody(o, "login", login);
		addBody(o, "password", password);
		addBody(o, "domain", domain);
		addBody(o, "spamAndVirusConfiguration", spamAndVirusConfiguration);
		addBody(o, "SAMAccountName", SAMAccountName);
		addBody(o, "mailingFilter", mailingFilter);
		addBody(o, "lastName", lastName);
		addBody(o, "outlookLicense", outlookLicense);
		addBody(o, "displayName", displayName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/protocol
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhExchangeAccountProtocol organizationName_service_exchangeService_account_primaryEmailAddress_protocol_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/protocol";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeAccountProtocol.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/protocol
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public void organizationName_service_exchangeService_account_primaryEmailAddress_protocol_PUT(String organizationName, String exchangeService, String primaryEmailAddress, OvhExchangeAccountProtocol body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/protocol";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhAccount organizationName_service_exchangeService_account_primaryEmailAddress_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public void organizationName_service_exchangeService_account_primaryEmailAddress_PUT(String organizationName, String exchangeService, String primaryEmailAddress, OvhAccount body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete existing mailbox in exchange server
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_DELETE(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Pending task for this mailbox
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/tasks
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public ArrayList<Long> organizationName_service_exchangeService_account_primaryEmailAddress_tasks_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/tasks";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/tasks/{id}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 * @param id [required] Task id
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_tasks_id_GET(String organizationName, String exchangeService, String primaryEmailAddress, Long id) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/tasks/{id}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change mailbox password
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/changePassword
	 * @param password [required] new password
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_changePassword_POST(String organizationName, String exchangeService, String primaryEmailAddress, String password) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/changePassword";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Terminate account at expiration date
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/terminate
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public String organizationName_service_exchangeService_account_primaryEmailAddress_terminate_POST(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/terminate";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/exportURL
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhExportUrl organizationName_service_exchangeService_account_primaryEmailAddress_exportURL_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/exportURL";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExportUrl.class);
	}

	/**
	 * Generate temporary url to PST file
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/exportURL
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_exportURL_POST(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/exportURL";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/diagnostics
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhExchangeAccountDiagnosis organizationName_service_exchangeService_account_primaryEmailAddress_diagnostics_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/diagnostics";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeAccountDiagnosis.class);
	}

	/**
	 * Create new diagnosis request
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/diagnostics
	 * @param password [required] Account password
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_diagnostics_POST(String organizationName, String exchangeService, String primaryEmailAddress, String password) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/diagnostics";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * SendOnBehalfTo granted users for this mailbox
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendOnBehalfTo
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public ArrayList<Long> organizationName_service_exchangeService_account_primaryEmailAddress_sendOnBehalfTo_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendOnBehalfTo";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow another user to Send On Behalf To mails from this mailbox
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendOnBehalfTo
	 * @param allowAccountId [required] Account id to allow to send On Behalf To mails from this mailbox
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_sendOnBehalfTo_POST(String organizationName, String exchangeService, String primaryEmailAddress, Long allowAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendOnBehalfTo";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendOnBehalfTo/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhExchangeAccountSendOnBehalfTo organizationName_service_exchangeService_account_primaryEmailAddress_sendOnBehalfTo_allowedAccountId_GET(String organizationName, String exchangeService, String primaryEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendOnBehalfTo/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeAccountSendOnBehalfTo.class);
	}

	/**
	 * Delete allowed user for SendOnBehalfTo
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendOnBehalfTo/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_sendOnBehalfTo_allowedAccountId_DELETE(String organizationName, String exchangeService, String primaryEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendOnBehalfTo/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Full access granted users for this mailbox
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/fullAccess
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public ArrayList<Long> organizationName_service_exchangeService_account_primaryEmailAddress_fullAccess_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/fullAccess";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow full access to a user
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/fullAccess
	 * @param allowedAccountId [required] User to give full access
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_fullAccess_POST(String organizationName, String exchangeService, String primaryEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/fullAccess";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowedAccountId", allowedAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/fullAccess/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give full access
	 */
	public OvhExchangeAccountFullAccess organizationName_service_exchangeService_account_primaryEmailAddress_fullAccess_allowedAccountId_GET(String organizationName, String exchangeService, String primaryEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/fullAccess/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeAccountFullAccess.class);
	}

	/**
	 * Revoke full access
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/fullAccess/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give full access
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_fullAccess_allowedAccountId_DELETE(String organizationName, String exchangeService, String primaryEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/fullAccess/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/export
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhExport organizationName_service_exchangeService_account_primaryEmailAddress_export_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/export";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExport.class);
	}

	/**
	 * Request PST file for the account
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/export
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_export_POST(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/export";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Remove request of PST file
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/export
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_export_DELETE(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/export";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/outlookURL
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhOutlookUrl organizationName_service_exchangeService_account_primaryEmailAddress_outlookURL_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/outlookURL";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOutlookUrl.class);
	}

	/**
	 * Generate outlook url
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/outlookURL
	 * @param language [required] Language of outlook
	 * @param version [required] Version of outlook
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_outlookURL_POST(String organizationName, String exchangeService, String primaryEmailAddress, OvhLanguageEnum language, OvhOutlookVersionEnum version) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/outlookURL";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "language", language);
		addBody(o, "version", version);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Aliases associated to this mailbox
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/alias
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public ArrayList<String> organizationName_service_exchangeService_account_primaryEmailAddress_alias_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/alias";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new alias
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/alias
	 * @param alias [required] Alias
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_alias_POST(String organizationName, String exchangeService, String primaryEmailAddress, String alias) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/alias";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "alias", alias);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/alias/{alias}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 * @param alias [required] Alias
	 */
	public OvhExchangeAccountAlias organizationName_service_exchangeService_account_primaryEmailAddress_alias_alias_GET(String organizationName, String exchangeService, String primaryEmailAddress, String alias) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/alias/{alias}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		qPath = qPath.replace("{alias}", alias);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeAccountAlias.class);
	}

	/**
	 * Delete existing alias
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/alias/{alias}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 * @param alias [required] Alias
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_alias_alias_DELETE(String organizationName, String exchangeService, String primaryEmailAddress, String alias) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/alias/{alias}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		qPath = qPath.replace("{alias}", alias);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Send as granted users for this mailbox
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendAs
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public ArrayList<Long> organizationName_service_exchangeService_account_primaryEmailAddress_sendAs_GET(String organizationName, String exchangeService, String primaryEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendAs";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow another user to send mails from this mailbox
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendAs
	 * @param allowAccountId [required] Account id to allow to send mails from this mailbox
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_sendAs_POST(String organizationName, String exchangeService, String primaryEmailAddress, Long allowAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendAs";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendAs/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send as
	 */
	public OvhExchangeAccountSendAs organizationName_service_exchangeService_account_primaryEmailAddress_sendAs_allowedAccountId_GET(String organizationName, String exchangeService, String primaryEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendAs/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeAccountSendAs.class);
	}

	/**
	 * Delete allowed user for sendAs
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendAs/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param primaryEmailAddress [required] Default email for this mailbox
	 * @param allowedAccountId [required] Account id to give send as
	 */
	public OvhTask organizationName_service_exchangeService_account_primaryEmailAddress_sendAs_allowedAccountId_DELETE(String organizationName, String exchangeService, String primaryEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/account/{primaryEmailAddress}/sendAs/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{primaryEmailAddress}", primaryEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Pending actions
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/task
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<Long> organizationName_service_exchangeService_task_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/task";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/task/{id}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param id [required] Task id
	 */
	public OvhTask organizationName_service_exchangeService_task_id_GET(String organizationName, String exchangeService, Long id) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/task/{id}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of your ActiveSync devices registered on this Exchange service
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/device
	 * @param identity [required] Filter the value of identity property (like)
	 * @param IMEI [required] Filter the value of IMEI property (like)
	 * @param deviceState [required] Filter the value of deviceState property (=)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> organizationName_service_exchangeService_device_GET(String organizationName, String exchangeService, String IMEI, OvhDeviceActiveSyncStateEnum deviceState, String identity) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/device";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "IMEI", IMEI);
		qPath = query(qPath, "deviceState", deviceState);
		qPath = query(qPath, "identity", identity);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/device/{identity}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param identity [required] Exchange identity
	 */
	public OvhExchangeServiceDevice organizationName_service_exchangeService_device_identity_GET(String organizationName, String exchangeService, String identity) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/device/{identity}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{identity}", identity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeServiceDevice.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/device/{identity}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param identity [required] Exchange identity
	 */
	public void organizationName_service_exchangeService_device_identity_PUT(String organizationName, String exchangeService, String identity, OvhExchangeServiceDevice body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/device/{identity}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{identity}", identity);
		exec("PUT", qPath, body);
	}

	/**
	 * Executes a factory reset on the device. THIS OPERATION CANNOT BE REVERSED, ALL DATA ON THE DEVICE WILL BE LOST.
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/device/{identity}/clearDevice
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param identity [required] Exchange identity
	 */
	public OvhTask organizationName_service_exchangeService_device_identity_clearDevice_POST(String organizationName, String exchangeService, String identity) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/device/{identity}/clearDevice";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{identity}", identity);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get active licenses for specific period of time
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/license
	 * @param license [required] License type
	 * @param toDate [required] Get active licenses until date
	 * @param fromDate [required] Get active licenses since date
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<OvhDailyLicense> organizationName_service_exchangeService_license_GET(String organizationName, String exchangeService, Date fromDate, OvhOvhLicenceEnum license, Date toDate) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/license";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "fromDate", fromDate);
		qPath = query(qPath, "license", license);
		qPath = query(qPath, "toDate", toDate);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhDailyLicense>> t4 = new TypeReference<ArrayList<OvhDailyLicense>>() {};

	/**
	 * External contacts for this service
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/externalContact
	 * @param firstName [required] Filter the value of firstName property (like)
	 * @param id [required] Filter the value of id property (like)
	 * @param lastName [required] Filter the value of lastName property (like)
	 * @param displayName [required] Filter the value of displayName property (like)
	 * @param externalEmailAddress [required] Filter the value of externalEmailAddress property (like)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> organizationName_service_exchangeService_externalContact_GET(String organizationName, String exchangeService, String displayName, String externalEmailAddress, String firstName, Long id, String lastName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/externalContact";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "displayName", displayName);
		qPath = query(qPath, "externalEmailAddress", externalEmailAddress);
		qPath = query(qPath, "firstName", firstName);
		qPath = query(qPath, "id", id);
		qPath = query(qPath, "lastName", lastName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * create new external contact
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/externalContact
	 * @param initials [required] Contact initials
	 * @param firstName [required] Contact first name
	 * @param hiddenFromGAL [required] Hide the contact in Global Address List
	 * @param organization2010 [required] Indicates to which organization this newly created external contact will belongs (Exchange 2010 only)
	 * @param lastName [required] Contact last name
	 * @param displayName [required] Contact display name
	 * @param externalEmailAddress [required] Contact email address
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_externalContact_POST(String organizationName, String exchangeService, String initials, String firstName, Boolean hiddenFromGAL, String organization2010, String lastName, String displayName, String externalEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/externalContact";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "initials", initials);
		addBody(o, "firstName", firstName);
		addBody(o, "hiddenFromGAL", hiddenFromGAL);
		addBody(o, "organization2010", organization2010);
		addBody(o, "lastName", lastName);
		addBody(o, "displayName", displayName);
		addBody(o, "externalEmailAddress", externalEmailAddress);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/externalContact/{externalEmailAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param externalEmailAddress [required] Contact email
	 */
	public OvhExchangeExternalContact organizationName_service_exchangeService_externalContact_externalEmailAddress_GET(String organizationName, String exchangeService, String externalEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/externalContact/{externalEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{externalEmailAddress}", externalEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeExternalContact.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/externalContact/{externalEmailAddress}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param externalEmailAddress [required] Contact email
	 */
	public void organizationName_service_exchangeService_externalContact_externalEmailAddress_PUT(String organizationName, String exchangeService, String externalEmailAddress, OvhExchangeExternalContact body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/externalContact/{externalEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{externalEmailAddress}", externalEmailAddress);
		exec("PUT", qPath, body);
	}

	/**
	 * delete external contact
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/externalContact/{externalEmailAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param externalEmailAddress [required] Contact email
	 */
	public OvhTask organizationName_service_exchangeService_externalContact_externalEmailAddress_DELETE(String organizationName, String exchangeService, String externalEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/externalContact/{externalEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{externalEmailAddress}", externalEmailAddress);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Show available outlooks
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/outlookAvailability
	 * @param outlookLanguage [required] Language version of outlook
	 * @param outlookVersion [required] OS version of outlook
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<OvhOutlookVersions> organizationName_service_exchangeService_outlookAvailability_GET(String organizationName, String exchangeService, OvhLanguageEnum outlookLanguage, OvhOutlookVersionEnum outlookVersion) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/outlookAvailability";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "outlookLanguage", outlookLanguage);
		qPath = query(qPath, "outlookVersion", outlookVersion);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhOutlookVersions>> t5 = new TypeReference<ArrayList<OvhOutlookVersions>>() {};

	/**
	 * Update spam and virus flags on all active accounts
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/updateFlagsOnAllAccounts
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public void organizationName_service_exchangeService_updateFlagsOnAllAccounts_POST(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/updateFlagsOnAllAccounts";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		exec("POST", qPath);
	}

	/**
	 * Mailing list for this service
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList
	 * @param mailingListAddress [required] Filter the value of mailingListAddress property (like)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> organizationName_service_exchangeService_mailingList_GET(String organizationName, String exchangeService, String mailingListAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "mailingListAddress", mailingListAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add mailing list
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/mailingList
	 * @param joinRestriction [required] Join restriction policy
	 * @param departRestriction [required] Depart restriction policy
	 * @param hiddenFromGAL [required] If true mailing list is hiddend in Global Address List
	 * @param mailingListAddress [required] The mailing list address
	 * @param senderAuthentification [required] If true sender has to authenticate
	 * @param maxSendSize [required] Maximum send email size in MB
	 * @param maxReceiveSize [required] Maximum receive email size in MB
	 * @param displayName [required] Name displayed in Global Access List
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_POST(String organizationName, String exchangeService, OvhMailingListJoinRestrictionEnum joinRestriction, OvhMailingListDepartRestrictionEnum departRestriction, Boolean hiddenFromGAL, String mailingListAddress, Boolean senderAuthentification, Long maxSendSize, Long maxReceiveSize, String displayName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "joinRestriction", joinRestriction);
		addBody(o, "departRestriction", departRestriction);
		addBody(o, "hiddenFromGAL", hiddenFromGAL);
		addBody(o, "mailingListAddress", mailingListAddress);
		addBody(o, "senderAuthentification", senderAuthentification);
		addBody(o, "maxSendSize", maxSendSize);
		addBody(o, "maxReceiveSize", maxReceiveSize);
		addBody(o, "displayName", displayName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public OvhMailingList organizationName_service_exchangeService_mailingList_mailingListAddress_GET(String organizationName, String exchangeService, String mailingListAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhMailingList.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public void organizationName_service_exchangeService_mailingList_mailingListAddress_PUT(String organizationName, String exchangeService, String mailingListAddress, OvhMailingList body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete mailing list
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_DELETE(String organizationName, String exchangeService, String mailingListAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Mailing list account member
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/account
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public ArrayList<Long> organizationName_service_exchangeService_mailingList_mailingListAddress_member_account_GET(String organizationName, String exchangeService, String mailingListAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/account";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add new mailing list member
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/account
	 * @param memberContactId [required] Member contact id
	 * @param memberAccountId [required] Member account id
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_member_account_POST(String organizationName, String exchangeService, String mailingListAddress, Long memberContactId, Long memberAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/account";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "memberContactId", memberContactId);
		addBody(o, "memberAccountId", memberAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/account/{memberAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param memberAccountId [required] Member account id
	 */
	public OvhExchangeDistributionGroupMember organizationName_service_exchangeService_mailingList_mailingListAddress_member_account_memberAccountId_GET(String organizationName, String exchangeService, String mailingListAddress, Long memberAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/account/{memberAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{memberAccountId}", memberAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeDistributionGroupMember.class);
	}

	/**
	 * Delete mailing list member
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/account/{memberAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param memberAccountId [required] Member account id
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_member_account_memberAccountId_DELETE(String organizationName, String exchangeService, String mailingListAddress, Long memberAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/account/{memberAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{memberAccountId}", memberAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Mailing list contact member
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/contact
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public ArrayList<Long> organizationName_service_exchangeService_mailingList_mailingListAddress_member_contact_GET(String organizationName, String exchangeService, String mailingListAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/contact";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add new mailing list member
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/contact
	 * @param memberContactId [required] Member contact id
	 * @param memberAccountId [required] Member account id
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_member_contact_POST(String organizationName, String exchangeService, String mailingListAddress, Long memberContactId, Long memberAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/contact";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "memberContactId", memberContactId);
		addBody(o, "memberAccountId", memberAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/contact/{memberContactId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param memberContactId [required] Member account id
	 */
	public OvhExchangeDistributionGroupMember organizationName_service_exchangeService_mailingList_mailingListAddress_member_contact_memberContactId_GET(String organizationName, String exchangeService, String mailingListAddress, Long memberContactId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/contact/{memberContactId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{memberContactId}", memberContactId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeDistributionGroupMember.class);
	}

	/**
	 * Delete mailing list member
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/contact/{memberContactId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param memberContactId [required] Member account id
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_member_contact_memberContactId_DELETE(String organizationName, String exchangeService, String mailingListAddress, Long memberContactId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/member/contact/{memberContactId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{memberContactId}", memberContactId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * sendOnBehalfTo
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendOnBehalfTo
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public ArrayList<Long> organizationName_service_exchangeService_mailingList_mailingListAddress_sendOnBehalfTo_GET(String organizationName, String exchangeService, String mailingListAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendOnBehalfTo";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow another user to Send aso mails from this mailing list
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendOnBehalfTo
	 * @param allowAccountId [required] Account id to allow to send as mails from this mailing list
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_sendOnBehalfTo_POST(String organizationName, String exchangeService, String mailingListAddress, Long allowAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendOnBehalfTo";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendOnBehalfTo/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhExchangeDistributionGroupSendOnBehalfTo organizationName_service_exchangeService_mailingList_mailingListAddress_sendOnBehalfTo_allowedAccountId_GET(String organizationName, String exchangeService, String mailingListAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendOnBehalfTo/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeDistributionGroupSendOnBehalfTo.class);
	}

	/**
	 * Delete allowed user for SendOnBehalfTo
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendOnBehalfTo/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_sendOnBehalfTo_allowedAccountId_DELETE(String organizationName, String exchangeService, String mailingListAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendOnBehalfTo/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Aliases associated to this mailingList
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/alias
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public ArrayList<String> organizationName_service_exchangeService_mailingList_mailingListAddress_alias_GET(String organizationName, String exchangeService, String mailingListAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/alias";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new alias
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/alias
	 * @param alias [required] Alias
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_alias_POST(String organizationName, String exchangeService, String mailingListAddress, String alias) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/alias";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "alias", alias);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/alias/{alias}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param alias [required] Alias
	 */
	public OvhExchangeMailingListAlias organizationName_service_exchangeService_mailingList_mailingListAddress_alias_alias_GET(String organizationName, String exchangeService, String mailingListAddress, String alias) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/alias/{alias}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{alias}", alias);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeMailingListAlias.class);
	}

	/**
	 * Delete existing alias
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/alias/{alias}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param alias [required] Alias
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_alias_alias_DELETE(String organizationName, String exchangeService, String mailingListAddress, String alias) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/alias/{alias}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{alias}", alias);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Mailing list account manager
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/manager/account
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public ArrayList<Long> organizationName_service_exchangeService_mailingList_mailingListAddress_manager_account_GET(String organizationName, String exchangeService, String mailingListAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/manager/account";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add new mailing list manager
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/manager/account
	 * @param managerAccountId [required] Manager account id
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_manager_account_POST(String organizationName, String exchangeService, String mailingListAddress, Long managerAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/manager/account";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "managerAccountId", managerAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/manager/account/{managerAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param managerAccountId [required] Manager account id
	 */
	public OvhExchangeDistributionGroupManager organizationName_service_exchangeService_mailingList_mailingListAddress_manager_account_managerAccountId_GET(String organizationName, String exchangeService, String mailingListAddress, Long managerAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/manager/account/{managerAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{managerAccountId}", managerAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeDistributionGroupManager.class);
	}

	/**
	 * Delete mailing list manager
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/manager/account/{managerAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param managerAccountId [required] Manager account id
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_manager_account_managerAccountId_DELETE(String organizationName, String exchangeService, String mailingListAddress, Long managerAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/manager/account/{managerAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{managerAccountId}", managerAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * sendAs
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendAs
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public ArrayList<Long> organizationName_service_exchangeService_mailingList_mailingListAddress_sendAs_GET(String organizationName, String exchangeService, String mailingListAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendAs";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Allow another user to Send aso mails from this mailing list
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendAs
	 * @param allowAccountId [required] Account id to allow to send as mails from this mailing list
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_sendAs_POST(String organizationName, String exchangeService, String mailingListAddress, Long allowAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendAs";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowAccountId", allowAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendAs/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhExchangeDistributionGroupSendAs organizationName_service_exchangeService_mailingList_mailingListAddress_sendAs_allowedAccountId_GET(String organizationName, String exchangeService, String mailingListAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendAs/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeDistributionGroupSendAs.class);
	}

	/**
	 * Delete allowed user for SendAs
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendAs/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param mailingListAddress [required] The mailing list address
	 * @param allowedAccountId [required] Account id to give send on behalf to
	 */
	public OvhTask organizationName_service_exchangeService_mailingList_mailingListAddress_sendAs_allowedAccountId_DELETE(String organizationName, String exchangeService, String mailingListAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/mailingList/{mailingListAddress}/sendAs/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{mailingListAddress}", mailingListAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Activate Sharepoint infra connected to this exchange service
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/activateSharepoint
	 * @param primaryEmailAddress [required] primary email address of a user that will be admin of sharepoint (You will not be able to change it!)
	 * @param subDomain [required] sub domain that will be used for Your sharepoint infra (You will not be able to change it!)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_activateSharepoint_POST(String organizationName, String exchangeService, String primaryEmailAddress, String subDomain) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/activateSharepoint";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "primaryEmailAddress", primaryEmailAddress);
		addBody(o, "subDomain", subDomain);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get shared account quota usage in total available space
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/sharedAccountQuota
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhSharedAccountQuota organizationName_service_exchangeService_sharedAccountQuota_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/sharedAccountQuota";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSharedAccountQuota.class);
	}

	/**
	 * Update device list
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/updateDeviceList
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_updateDeviceList_POST(String organizationName, String exchangeService) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/updateDeviceList";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Resource account associated to this service
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/resourceAccount
	 * @param resourceEmailAddress [required] Filter the value of resourceEmailAddress property (like)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> organizationName_service_exchangeService_resourceAccount_GET(String organizationName, String exchangeService, String resourceEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/resourceAccount";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "resourceEmailAddress", resourceEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * create new resource account in exchange server
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/resourceAccount
	 * @param resourceEmailAddress [required] resource address
	 * @param allowConflict [required] resource can be scheduled by more than one person during the same time period
	 * @param type [required] field of your reservation
	 * @param capacity [required] number of the same equipment or capacity of a room
	 * @param displayName [required] resource account display name
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhTask organizationName_service_exchangeService_resourceAccount_POST(String organizationName, String exchangeService, String resourceEmailAddress, Boolean allowConflict, OvhResourceTypeEnum type, Long capacity, String displayName) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/resourceAccount";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "resourceEmailAddress", resourceEmailAddress);
		addBody(o, "allowConflict", allowConflict);
		addBody(o, "type", type);
		addBody(o, "capacity", capacity);
		addBody(o, "displayName", displayName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param resourceEmailAddress [required] resource as email
	 */
	public OvhResourceAccount organizationName_service_exchangeService_resourceAccount_resourceEmailAddress_GET(String organizationName, String exchangeService, String resourceEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{resourceEmailAddress}", resourceEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResourceAccount.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}
	 * @param null [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param resourceEmailAddress [required] resource as email
	 */
	public void organizationName_service_exchangeService_resourceAccount_resourceEmailAddress_PUT(String organizationName, String exchangeService, String resourceEmailAddress, OvhResourceAccount body) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{resourceEmailAddress}", resourceEmailAddress);
		exec("PUT", qPath, body);
	}

	/**
	 * delete existing resource account in exchange server
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param resourceEmailAddress [required] resource as email
	 */
	public OvhTask organizationName_service_exchangeService_resourceAccount_resourceEmailAddress_DELETE(String organizationName, String exchangeService, String resourceEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{resourceEmailAddress}", resourceEmailAddress);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Resource account manager
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}/delegate
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param resourceEmailAddress [required] resource as email
	 */
	public ArrayList<Long> organizationName_service_exchangeService_resourceAccount_resourceEmailAddress_delegate_GET(String organizationName, String exchangeService, String resourceEmailAddress) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}/delegate";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{resourceEmailAddress}", resourceEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * add new resource account delegate in exchange server
	 * 
	 * REST: POST /email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}/delegate
	 * @param allowedAccountId [required] delegate's account id
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param resourceEmailAddress [required] resource as email
	 */
	public OvhTask organizationName_service_exchangeService_resourceAccount_resourceEmailAddress_delegate_POST(String organizationName, String exchangeService, String resourceEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}/delegate";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{resourceEmailAddress}", resourceEmailAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "allowedAccountId", allowedAccountId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}/delegate/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param resourceEmailAddress [required] resource as email
	 * @param allowedAccountId [required] delegate's account id
	 */
	public OvhExchangeResourceAccountDelegate organizationName_service_exchangeService_resourceAccount_resourceEmailAddress_delegate_allowedAccountId_GET(String organizationName, String exchangeService, String resourceEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}/delegate/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{resourceEmailAddress}", resourceEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExchangeResourceAccountDelegate.class);
	}

	/**
	 * delete existing resource account delegate in exchange server
	 * 
	 * REST: DELETE /email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}/delegate/{allowedAccountId}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param resourceEmailAddress [required] resource as email
	 * @param allowedAccountId [required] delegate's account id
	 */
	public OvhTask organizationName_service_exchangeService_resourceAccount_resourceEmailAddress_delegate_allowedAccountId_DELETE(String organizationName, String exchangeService, String resourceEmailAddress, Long allowedAccountId) throws IOException {
		String qPath = "/email/exchange/{organizationName}/service/{exchangeService}/resourceAccount/{resourceEmailAddress}/delegate/{allowedAccountId}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{resourceEmailAddress}", resourceEmailAddress);
		qPath = qPath.replace("{allowedAccountId}", allowedAccountId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}
}
