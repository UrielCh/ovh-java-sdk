package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.reference.OvhCountryEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.sms.OvhAccount;
import net.minidev.ovh.api.sms.OvhBlacklist;
import net.minidev.ovh.api.sms.OvhCharsetEnum;
import net.minidev.ovh.api.sms.OvhChatAccess;
import net.minidev.ovh.api.sms.OvhClassEnum;
import net.minidev.ovh.api.sms.OvhCodingEnum;
import net.minidev.ovh.api.sms.OvhDocumentWayTypeEnum;
import net.minidev.ovh.api.sms.OvhException;
import net.minidev.ovh.api.sms.OvhHlr;
import net.minidev.ovh.api.sms.OvhHlrLookupNumber;
import net.minidev.ovh.api.sms.OvhIncoming;
import net.minidev.ovh.api.sms.OvhJob;
import net.minidev.ovh.api.sms.OvhOutgoing;
import net.minidev.ovh.api.sms.OvhPackOffer;
import net.minidev.ovh.api.sms.OvhPackQuantityEnum;
import net.minidev.ovh.api.sms.OvhPhonebook;
import net.minidev.ovh.api.sms.OvhPhonebookContact;
import net.minidev.ovh.api.sms.OvhPriorityEnum;
import net.minidev.ovh.api.sms.OvhPttDetails;
import net.minidev.ovh.api.sms.OvhReceiver;
import net.minidev.ovh.api.sms.OvhReceiversAsynchronousCleanReport;
import net.minidev.ovh.api.sms.OvhSender;
import net.minidev.ovh.api.sms.OvhSenderAvailable;
import net.minidev.ovh.api.sms.OvhSenderRefererEnum;
import net.minidev.ovh.api.sms.OvhSmsSendingReport;
import net.minidev.ovh.api.sms.OvhTask;
import net.minidev.ovh.api.sms.OvhTemplateControl;
import net.minidev.ovh.api.sms.OvhTypeTemplateEnum;
import net.minidev.ovh.api.sms.OvhUser;
import net.minidev.ovh.api.sms.OvhVirtualNumber;
import net.minidev.ovh.api.sms.OvhVirtualNumberGenericService;
import net.minidev.ovh.api.sms.OvhVirtualNumberJob;
import net.minidev.ovh.api.telephony.OvhContactsExportFormatsEnum;
import net.minidev.ovh.api.telephony.OvhPcsFile;
import net.minidev.ovh.api.telephony.OvhTaskStatusEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/sms
 * version:1.0
 */
public class ApiOvhSms extends ApiOvhBase {
	public ApiOvhSms(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/sms/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public OvhAccount serviceName_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public void serviceName_PUT(String serviceName, OvhAccount body) throws IOException {
		String qPath = "/sms/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Describe filter exceptions in sms sending from a specific receiver.
	 *
	 * REST: GET /sms/{serviceName}/exceptions
	 * @param receiver [required] The receiver number to check
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<OvhException> serviceName_exceptions_GET(String serviceName, String receiver) throws IOException {
		String qPath = "/sms/{serviceName}/exceptions";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "receiver", receiver);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhException>> t1 = new TypeReference<ArrayList<OvhException>>() {};

	/**
	 * Virtual numbers associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<String> serviceName_virtualNumbers_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Sms sent associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers/{number}/outgoing
	 * @param receiver [required] Filter the value of receiver property (=)
	 * @param differedDelivery [required] Filter the value of differedDelivery property (=)
	 * @param deliveryReceipt [required] Filter the value of deliveryReceipt property (=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param ptt [required] Filter the value of ptt property (=)
	 * @param sender [required] Filter the value of sender property (=)
	 * @param tag [required] Filter the value of tag property (=)
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 */
	public ArrayList<Long> serviceName_virtualNumbers_number_outgoing_GET(String serviceName, String number, Date creationDatetime_from, Date creationDatetime_to, Long deliveryReceipt, Long differedDelivery, Long ptt, String receiver, String sender, String tag) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/outgoing";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = query(qPath, "creationDatetime.from", creationDatetime_from);
		qPath = query(qPath, "creationDatetime.to", creationDatetime_to);
		qPath = query(qPath, "deliveryReceipt", deliveryReceipt);
		qPath = query(qPath, "differedDelivery", differedDelivery);
		qPath = query(qPath, "ptt", ptt);
		qPath = query(qPath, "receiver", receiver);
		qPath = query(qPath, "sender", sender);
		qPath = query(qPath, "tag", tag);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers/{number}/outgoing/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 * @param id [required] Id of the object
	 */
	public OvhOutgoing serviceName_virtualNumbers_number_outgoing_id_GET(String serviceName, String number, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/outgoing/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOutgoing.class);
	}

	/**
	 * Delete the sms outgoing history given
	 *
	 * REST: DELETE /sms/{serviceName}/virtualNumbers/{number}/outgoing/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 * @param id [required] Id of the object
	 */
	public void serviceName_virtualNumbers_number_outgoing_id_DELETE(String serviceName, String number, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/outgoing/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers/{number}/outgoing/{id}/hlr
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 * @param id [required] Id of the object
	 */
	public OvhHlr serviceName_virtualNumbers_number_outgoing_id_hlr_GET(String serviceName, String number, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/outgoing/{id}/hlr";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhHlr.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers/{number}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 */
	public OvhVirtualNumber serviceName_virtualNumbers_number_GET(String serviceName, String number) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhVirtualNumber.class);
	}

	/**
	 * Sms in pending associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers/{number}/jobs
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 */
	public ArrayList<Long> serviceName_virtualNumbers_number_jobs_GET(String serviceName, String number) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/jobs";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add one or several sending jobs
	 *
	 * REST: POST /sms/{serviceName}/virtualNumbers/{number}/jobs
	 * @param priority [required] [default=high] The priority of the message
	 * @param validityPeriod [required] [default=2880] The maximum time -in minute(s)- before the message is dropped
	 * @param receivers [required] The receivers list
	 * @param charset [required] [default=UTF-8] The sms coding
	 * @param coding [required] [default=7bit] The sms coding
	 * @param message [required] The sms message
	 * @param differedPeriod [required] [default=0] The time -in minute(s)- to wait before sending the message
	 * @param receiversSlotId [required] The receivers document slot id
	 * @param tag [required] The identifier group tag
	 * @param receiversDocumentUrl [required] The receivers document url link in csv format
	 * @param _class [required] [default=phoneDisplay] The sms class
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 */
	public OvhSmsSendingReport serviceName_virtualNumbers_number_jobs_POST(String serviceName, String number, OvhPriorityEnum priority, Long validityPeriod, String[] receivers, OvhCharsetEnum charset, OvhCodingEnum coding, String message, Long differedPeriod, String receiversSlotId, String tag, String receiversDocumentUrl, OvhClassEnum _class) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/jobs";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "priority", priority);
		addBody(o, "validityPeriod", validityPeriod);
		addBody(o, "receivers", receivers);
		addBody(o, "charset", charset);
		addBody(o, "coding", coding);
		addBody(o, "message", message);
		addBody(o, "differedPeriod", differedPeriod);
		addBody(o, "receiversSlotId", receiversSlotId);
		addBody(o, "tag", tag);
		addBody(o, "receiversDocumentUrl", receiversDocumentUrl);
		addBody(o, "class", _class);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSmsSendingReport.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers/{number}/jobs/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 * @param id [required] Id of the object
	 */
	public OvhVirtualNumberJob serviceName_virtualNumbers_number_jobs_id_GET(String serviceName, String number, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/jobs/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhVirtualNumberJob.class);
	}

	/**
	 * Delete the sms job given (stop sending)
	 *
	 * REST: DELETE /sms/{serviceName}/virtualNumbers/{number}/jobs/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 * @param id [required] Id of the object
	 */
	public void serviceName_virtualNumbers_number_jobs_id_DELETE(String serviceName, String number, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/jobs/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers/{number}/chatAccess
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 */
	public OvhChatAccess serviceName_virtualNumbers_number_chatAccess_GET(String serviceName, String number) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/chatAccess";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhChatAccess.class);
	}

	/**
	 * Create a new web access for this ressource
	 *
	 * REST: POST /sms/{serviceName}/virtualNumbers/{number}/chatAccess
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 */
	public OvhChatAccess serviceName_virtualNumbers_number_chatAccess_POST(String serviceName, String number) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/chatAccess";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhChatAccess.class);
	}

	/**
	 * Delete the given web access
	 *
	 * REST: DELETE /sms/{serviceName}/virtualNumbers/{number}/chatAccess
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 */
	public void serviceName_virtualNumbers_number_chatAccess_DELETE(String serviceName, String number) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/chatAccess";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		exec("DELETE", qPath);
	}

	/**
	 * Sms received associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers/{number}/incoming
	 * @param sender [required] Filter the value of sender property (=)
	 * @param tag [required] Filter the value of tag property (=)
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 */
	public ArrayList<Long> serviceName_virtualNumbers_number_incoming_GET(String serviceName, String number, Date creationDatetime_from, Date creationDatetime_to, String sender, String tag) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/incoming";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = query(qPath, "creationDatetime.from", creationDatetime_from);
		qPath = query(qPath, "creationDatetime.to", creationDatetime_to);
		qPath = query(qPath, "sender", sender);
		qPath = query(qPath, "tag", tag);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/virtualNumbers/{number}/incoming/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 * @param id [required] Id of the object
	 */
	public OvhIncoming serviceName_virtualNumbers_number_incoming_id_GET(String serviceName, String number, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/incoming/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIncoming.class);
	}

	/**
	 * Delete the sms incoming history given
	 *
	 * REST: DELETE /sms/{serviceName}/virtualNumbers/{number}/incoming/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The virtual number
	 * @param id [required] Id of the object
	 */
	public void serviceName_virtualNumbers_number_incoming_id_DELETE(String serviceName, String number, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/virtualNumbers/{number}/incoming/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get the /me/document id generated
	 *
	 * REST: GET /sms/{serviceName}/document
	 * @param tag [required] Select sms with a specific identifier group tag
	 * @param wayType [required] specify outgoing or incoming sms
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public String serviceName_document_GET(String serviceName, Date creationDatetime_from, Date creationDatetime_to, String tag, OvhDocumentWayTypeEnum wayType) throws IOException {
		String qPath = "/sms/{serviceName}/document";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "creationDatetime.from", creationDatetime_from);
		qPath = query(qPath, "creationDatetime.to", creationDatetime_to);
		qPath = query(qPath, "tag", tag);
		qPath = query(qPath, "wayType", wayType);
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/senders/{sender}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param sender [required] The sms sender
	 */
	public OvhSender serviceName_senders_sender_GET(String serviceName, String sender) throws IOException {
		String qPath = "/sms/{serviceName}/senders/{sender}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{sender}", sender);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSender.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/{serviceName}/senders/{sender}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param sender [required] The sms sender
	 */
	public void serviceName_senders_sender_PUT(String serviceName, String sender, OvhSender body) throws IOException {
		String qPath = "/sms/{serviceName}/senders/{sender}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{sender}", sender);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete the sms sender given
	 *
	 * REST: DELETE /sms/{serviceName}/senders/{sender}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param sender [required] The sms sender
	 */
	public void serviceName_senders_sender_DELETE(String serviceName, String sender) throws IOException {
		String qPath = "/sms/{serviceName}/senders/{sender}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{sender}", sender);
		exec("DELETE", qPath);
	}

	/**
	 * Validate a given sender with an activation code.
	 *
	 * REST: POST /sms/{serviceName}/senders/{sender}/validate
	 * @param code [required] The validation code
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param sender [required] The sms sender
	 */
	public void serviceName_senders_sender_validate_POST(String serviceName, String sender, String code) throws IOException {
		String qPath = "/sms/{serviceName}/senders/{sender}/validate";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{sender}", sender);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", qPath, o);
	}

	/**
	 * Senders allowed associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/senders
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<String> serviceName_senders_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/senders";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Create the sms sender given
	 *
	 * REST: POST /sms/{serviceName}/senders
	 * @param sender [required] The sender (alpha or phone number)
	 * @param reason [required] Message seen by the moderator
	 * @param description [required] Sender description
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public String serviceName_senders_POST(String serviceName, String sender, String reason, String description) throws IOException {
		String qPath = "/sms/{serviceName}/senders";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "sender", sender);
		addBody(o, "reason", reason);
		addBody(o, "description", description);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Users associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/users
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<String> serviceName_users_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/users";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Create a new user for an sms account
	 *
	 * REST: POST /sms/{serviceName}/users
	 * @param password [required] The sms password
	 * @param login [required] The sms login
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public void serviceName_users_POST(String serviceName, String password, String login) throws IOException {
		String qPath = "/sms/{serviceName}/users";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "login", login);
		exec("POST", qPath, o);
	}

	/**
	 * Sms sent associated to the sms user
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/outgoing
	 * @param receiver [required] Filter the value of receiver property (=)
	 * @param differedDelivery [required] Filter the value of differedDelivery property (=)
	 * @param deliveryReceipt [required] Filter the value of deliveryReceipt property (=)
	 * @param ptt [required] Filter the value of ptt property (=)
	 * @param sender [required] Filter the value of sender property (=)
	 * @param tag [required] Filter the value of tag property (=)
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public ArrayList<Long> serviceName_users_login_outgoing_GET(String serviceName, String login, Long deliveryReceipt, Long differedDelivery, Long ptt, String receiver, String sender, String tag) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/outgoing";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = query(qPath, "deliveryReceipt", deliveryReceipt);
		qPath = query(qPath, "differedDelivery", differedDelivery);
		qPath = query(qPath, "ptt", ptt);
		qPath = query(qPath, "receiver", receiver);
		qPath = query(qPath, "sender", sender);
		qPath = query(qPath, "tag", tag);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/outgoing/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param id [required] Id of the object
	 */
	public OvhOutgoing serviceName_users_login_outgoing_id_GET(String serviceName, String login, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/outgoing/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOutgoing.class);
	}

	/**
	 * Delete the sms outgoing history given
	 *
	 * REST: DELETE /sms/{serviceName}/users/{login}/outgoing/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param id [required] Id of the object
	 */
	public void serviceName_users_login_outgoing_id_DELETE(String serviceName, String login, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/outgoing/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/outgoing/{id}/hlr
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param id [required] Id of the object
	 */
	public OvhHlr serviceName_users_login_outgoing_id_hlr_GET(String serviceName, String login, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/outgoing/{id}/hlr";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhHlr.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/users/{login}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public OvhUser serviceName_users_login_GET(String serviceName, String login) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/{serviceName}/users/{login}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public void serviceName_users_login_PUT(String serviceName, String login, OvhUser body) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete the sms user given
	 *
	 * REST: DELETE /sms/{serviceName}/users/{login}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public void serviceName_users_login_DELETE(String serviceName, String login) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		exec("DELETE", qPath);
	}

	/**
	 * Sms in pending associated to the sms user
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/jobs
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public ArrayList<Long> serviceName_users_login_jobs_GET(String serviceName, String login) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/jobs";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add one or several sending jobs
	 *
	 * REST: POST /sms/{serviceName}/users/{login}/jobs
	 * @param noStopClause [required] Do not display STOP clause in the message, this requires that this is not an advertising message
	 * @param priority [required] [default=high] The priority of the message
	 * @param validityPeriod [required] [default=2880] The maximum time -in minute(s)- before the message is dropped
	 * @param senderForResponse [required] Set the flag to send a special sms which can be reply by the receiver (smsResponse).
	 * @param receivers [required] The receivers list
	 * @param charset [required] [default=UTF-8] The sms coding
	 * @param coding [required] [default=7bit] The sms coding
	 * @param message [required] The sms message
	 * @param differedPeriod [required] [default=0] The time -in minute(s)- to wait before sending the message
	 * @param receiversSlotId [required] The receivers document slot id
	 * @param sender [required] The sender
	 * @param tag [required] The identifier group tag
	 * @param receiversDocumentUrl [required] The receivers document url link in csv format
	 * @param _class [required] [default=phoneDisplay] The sms class
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public OvhSmsSendingReport serviceName_users_login_jobs_POST(String serviceName, String login, Boolean noStopClause, OvhPriorityEnum priority, Long validityPeriod, Boolean senderForResponse, String[] receivers, OvhCharsetEnum charset, OvhCodingEnum coding, String message, Long differedPeriod, String receiversSlotId, String sender, String tag, String receiversDocumentUrl, OvhClassEnum _class) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/jobs";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "noStopClause", noStopClause);
		addBody(o, "priority", priority);
		addBody(o, "validityPeriod", validityPeriod);
		addBody(o, "senderForResponse", senderForResponse);
		addBody(o, "receivers", receivers);
		addBody(o, "charset", charset);
		addBody(o, "coding", coding);
		addBody(o, "message", message);
		addBody(o, "differedPeriod", differedPeriod);
		addBody(o, "receiversSlotId", receiversSlotId);
		addBody(o, "sender", sender);
		addBody(o, "tag", tag);
		addBody(o, "receiversDocumentUrl", receiversDocumentUrl);
		addBody(o, "class", _class);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSmsSendingReport.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/jobs/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param id [required] Id of the object
	 */
	public OvhJob serviceName_users_login_jobs_id_GET(String serviceName, String login, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/jobs/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhJob.class);
	}

	/**
	 * Delete the sms job given (stop sending)
	 *
	 * REST: DELETE /sms/{serviceName}/users/{login}/jobs/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param id [required] Id of the object
	 */
	public void serviceName_users_login_jobs_id_DELETE(String serviceName, String login, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/jobs/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Receivers preloaded from text or csv document file
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/receivers
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public ArrayList<Long> serviceName_users_login_receivers_GET(String serviceName, String login) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/receivers";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add a new document of csv receivers
	 *
	 * REST: POST /sms/{serviceName}/users/{login}/receivers
	 * @param documentId [required] ID of the /me/document file you want to import
	 * @param csvUrl [required] URL of the file you want to import
	 * @param slotId [required] Slot number id used to handle the document
	 * @param autoUpdate [required] Download file from URL before sending to contacts (works only with csvUrl and not document ID)
	 * @param description [required] Description name of the document
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public OvhReceiver serviceName_users_login_receivers_POST(String serviceName, String login, String documentId, String csvUrl, Long slotId, Boolean autoUpdate, String description) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/receivers";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		addBody(o, "csvUrl", csvUrl);
		addBody(o, "slotId", slotId);
		addBody(o, "autoUpdate", autoUpdate);
		addBody(o, "description", description);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhReceiver.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/receivers/{slotId}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param slotId [required] Slot number id
	 */
	public OvhReceiver serviceName_users_login_receivers_slotId_GET(String serviceName, String login, Long slotId) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/receivers/{slotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{slotId}", slotId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhReceiver.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/{serviceName}/users/{login}/receivers/{slotId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param slotId [required] Slot number id
	 */
	public void serviceName_users_login_receivers_slotId_PUT(String serviceName, String login, Long slotId, OvhReceiver body) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/receivers/{slotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{slotId}", slotId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete the document from the slot
	 *
	 * REST: DELETE /sms/{serviceName}/users/{login}/receivers/{slotId}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param slotId [required] Slot number id
	 */
	public void serviceName_users_login_receivers_slotId_DELETE(String serviceName, String login, Long slotId) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/receivers/{slotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{slotId}", slotId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get the document data container
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/receivers/{slotId}/csv
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param slotId [required] Slot number id
	 */
	public String serviceName_users_login_receivers_slotId_csv_GET(String serviceName, String login, Long slotId) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/receivers/{slotId}/csv";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{slotId}", slotId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Clean the invalid and inactive receivers in the document by requesting HLR on each receiver. A report is sent by e-mail at the end of the operation.
	 *
	 * REST: POST /sms/{serviceName}/users/{login}/receivers/{slotId}/clean
	 * @param freemium [required] Limit checks to syntaxical validation
	 * @param priceOnly [required] Only get action's price in credits without executing it
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param slotId [required] Slot number id
	 */
	public OvhReceiversAsynchronousCleanReport serviceName_users_login_receivers_slotId_clean_POST(String serviceName, String login, Long slotId, Boolean freemium, Boolean priceOnly) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/receivers/{slotId}/clean";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{slotId}", slotId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "freemium", freemium);
		addBody(o, "priceOnly", priceOnly);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhReceiversAsynchronousCleanReport.class);
	}

	/**
	 * Get the /me/document id generated
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/document
	 * @param tag [required] Select sms with a specific identifier group tag
	 * @param wayType [required] specify outgoing or incoming sms
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public String serviceName_users_login_document_GET(String serviceName, String login, Date creationDatetime_from, Date creationDatetime_to, String tag, OvhDocumentWayTypeEnum wayType) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/document";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = query(qPath, "creationDatetime.from", creationDatetime_from);
		qPath = query(qPath, "creationDatetime.to", creationDatetime_to);
		qPath = query(qPath, "tag", tag);
		qPath = query(qPath, "wayType", wayType);
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Sms received associated to the sms user
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/incoming
	 * @param sender [required] Filter the value of sender property (=)
	 * @param tag [required] Filter the value of tag property (=)
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 */
	public ArrayList<Long> serviceName_users_login_incoming_GET(String serviceName, String login, String sender, String tag) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/incoming";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = query(qPath, "sender", sender);
		qPath = query(qPath, "tag", tag);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/users/{login}/incoming/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param id [required] Id of the object
	 */
	public OvhIncoming serviceName_users_login_incoming_id_GET(String serviceName, String login, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/incoming/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIncoming.class);
	}

	/**
	 * Delete the sms incoming history given
	 *
	 * REST: DELETE /sms/{serviceName}/users/{login}/incoming/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param login [required] The sms user login
	 * @param id [required] Id of the object
	 */
	public void serviceName_users_login_incoming_id_DELETE(String serviceName, String login, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/users/{login}/incoming/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * The senders that are attached to your personal informations or OVH services and that can be automatically validated
	 *
	 * REST: GET /sms/{serviceName}/sendersAvailableForValidation
	 * @param referer [required] Information type
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<OvhSenderAvailable> serviceName_sendersAvailableForValidation_GET(String serviceName, OvhSenderRefererEnum referer) throws IOException {
		String qPath = "/sms/{serviceName}/sendersAvailableForValidation";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "referer", referer);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhSenderAvailable>> t4 = new TypeReference<ArrayList<OvhSenderAvailable>>() {};

	/**
	 * Template pattern filled up for moderation (Needed to send in US country)
	 *
	 * REST: GET /sms/{serviceName}/templatesControl
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<String> serviceName_templatesControl_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/templatesControl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Create the sms template control given
	 *
	 * REST: POST /sms/{serviceName}/templatesControl
	 * @param reason [required] Message seen by the moderator
	 * @param name [required] Name of the template
	 * @param activity [required] Specify the kind of template
	 * @param description [required] Template description
	 * @param message [required] Message pattern to be moderated. Use "#VALUE#" format for dynamic text area.
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public void serviceName_templatesControl_POST(String serviceName, String reason, String name, OvhTypeTemplateEnum activity, String description, String message) throws IOException {
		String qPath = "/sms/{serviceName}/templatesControl";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "name", name);
		addBody(o, "activity", activity);
		addBody(o, "description", description);
		addBody(o, "message", message);
		exec("POST", qPath, o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/templatesControl/{name}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param name [required] Name of the template
	 */
	public OvhTemplateControl serviceName_templatesControl_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/sms/{serviceName}/templatesControl/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTemplateControl.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/{serviceName}/templatesControl/{name}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param name [required] Name of the template
	 */
	public void serviceName_templatesControl_name_PUT(String serviceName, String name, OvhTemplateControl body) throws IOException {
		String qPath = "/sms/{serviceName}/templatesControl/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete the sms template control
	 *
	 * REST: DELETE /sms/{serviceName}/templatesControl/{name}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param name [required] Name of the template
	 */
	public void serviceName_templatesControl_name_DELETE(String serviceName, String name) throws IOException {
		String qPath = "/sms/{serviceName}/templatesControl/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		exec("DELETE", qPath);
	}

	/**
	 * Attempt a new validation after moderation refusal
	 *
	 * REST: POST /sms/{serviceName}/templatesControl/{name}/relaunchValidation
	 * @param description [required] Template description
	 * @param message [required] Message pattern to be moderated. Use "#VALUE#" format for dynamic text area
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param name [required] Name of the template
	 */
	public void serviceName_templatesControl_name_relaunchValidation_POST(String serviceName, String name, String description, String message) throws IOException {
		String qPath = "/sms/{serviceName}/templatesControl/{name}/relaunchValidation";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "message", message);
		exec("POST", qPath, o);
	}

	/**
	 * Numbers blacklisted associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/blacklists
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<String> serviceName_blacklists_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/blacklists";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/blacklists/{number}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The sms number blacklisted
	 */
	public OvhBlacklist serviceName_blacklists_number_GET(String serviceName, String number) throws IOException {
		String qPath = "/sms/{serviceName}/blacklists/{number}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBlacklist.class);
	}

	/**
	 * Delete the blacklisted sms number given
	 *
	 * REST: DELETE /sms/{serviceName}/blacklists/{number}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param number [required] The sms number blacklisted
	 */
	public void serviceName_blacklists_number_DELETE(String serviceName, String number) throws IOException {
		String qPath = "/sms/{serviceName}/blacklists/{number}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		exec("DELETE", qPath);
	}

	/**
	 * Sms in pending associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/jobs
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<Long> serviceName_jobs_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/jobs";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add one or several sending jobs
	 *
	 * REST: POST /sms/{serviceName}/jobs
	 * @param noStopClause [required] Do not display STOP clause in the message, this requires that this is not an advertising message
	 * @param priority [required] [default=high] The priority of the message
	 * @param validityPeriod [required] [default=2880] The maximum time -in minute(s)- before the message is dropped
	 * @param senderForResponse [required] Set the flag to send a special sms which can be reply by the receiver (smsResponse).
	 * @param receivers [required] The receivers list
	 * @param charset [required] [default=UTF-8] The sms coding
	 * @param coding [required] [default=7bit] The sms coding
	 * @param message [required] The sms message
	 * @param differedPeriod [required] [default=0] The time -in minute(s)- to wait before sending the message
	 * @param receiversSlotId [required] The receivers document slot id
	 * @param sender [required] The sender
	 * @param tag [required] The identifier group tag
	 * @param receiversDocumentUrl [required] The receivers document url link in csv format
	 * @param _class [required] [default=phoneDisplay] The sms class
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public OvhSmsSendingReport serviceName_jobs_POST(String serviceName, Boolean noStopClause, OvhPriorityEnum priority, Long validityPeriod, Boolean senderForResponse, String[] receivers, OvhCharsetEnum charset, OvhCodingEnum coding, String message, Long differedPeriod, String receiversSlotId, String sender, String tag, String receiversDocumentUrl, OvhClassEnum _class) throws IOException {
		String qPath = "/sms/{serviceName}/jobs";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "noStopClause", noStopClause);
		addBody(o, "priority", priority);
		addBody(o, "validityPeriod", validityPeriod);
		addBody(o, "senderForResponse", senderForResponse);
		addBody(o, "receivers", receivers);
		addBody(o, "charset", charset);
		addBody(o, "coding", coding);
		addBody(o, "message", message);
		addBody(o, "differedPeriod", differedPeriod);
		addBody(o, "receiversSlotId", receiversSlotId);
		addBody(o, "sender", sender);
		addBody(o, "tag", tag);
		addBody(o, "receiversDocumentUrl", receiversDocumentUrl);
		addBody(o, "class", _class);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSmsSendingReport.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/jobs/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param id [required] Id of the object
	 */
	public OvhJob serviceName_jobs_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/jobs/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhJob.class);
	}

	/**
	 * Delete the sms job given (stop sending)
	 *
	 * REST: DELETE /sms/{serviceName}/jobs/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_jobs_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/jobs/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Sms received associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/incoming
	 * @param sender [required] Filter the value of sender property (=)
	 * @param tag [required] Filter the value of tag property (=)
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<Long> serviceName_incoming_GET(String serviceName, Date creationDatetime_from, Date creationDatetime_to, String sender, String tag) throws IOException {
		String qPath = "/sms/{serviceName}/incoming";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "creationDatetime.from", creationDatetime_from);
		qPath = query(qPath, "creationDatetime.to", creationDatetime_to);
		qPath = query(qPath, "sender", sender);
		qPath = query(qPath, "tag", tag);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/incoming/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param id [required] Id of the object
	 */
	public OvhIncoming serviceName_incoming_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/incoming/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIncoming.class);
	}

	/**
	 * Delete the sms incoming history given
	 *
	 * REST: DELETE /sms/{serviceName}/incoming/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_incoming_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/incoming/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Describe SMS offers available.
	 *
	 * REST: GET /sms/{serviceName}/seeOffers
	 * @param countryDestination [required] Filter to have the country destination
	 * @param countryCurrencyPrice [required] Filter to have the currency country prices
	 * @param quantity [required] Sms pack offer quantity
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<OvhPackOffer> serviceName_seeOffers_GET(String serviceName, OvhCountryEnum countryCurrencyPrice, net.minidev.ovh.api.sms.OvhCountryEnum countryDestination, OvhPackQuantityEnum quantity) throws IOException {
		String qPath = "/sms/{serviceName}/seeOffers";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "countryCurrencyPrice", countryCurrencyPrice);
		qPath = query(qPath, "countryDestination", countryDestination);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhPackOffer>> t5 = new TypeReference<ArrayList<OvhPackOffer>>() {};

	/**
	 * Sms sent associated to the sms account
	 *
	 * REST: GET /sms/{serviceName}/outgoing
	 * @param receiver [required] Filter the value of receiver property (=)
	 * @param differedDelivery [required] Filter the value of differedDelivery property (=)
	 * @param deliveryReceipt [required] Filter the value of deliveryReceipt property (=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param ptt [required] Filter the value of ptt property (=)
	 * @param sender [required] Filter the value of sender property (=)
	 * @param tag [required] Filter the value of tag property (=)
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<Long> serviceName_outgoing_GET(String serviceName, Date creationDatetime_from, Date creationDatetime_to, Long deliveryReceipt, Long differedDelivery, Long ptt, String receiver, String sender, String tag) throws IOException {
		String qPath = "/sms/{serviceName}/outgoing";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "creationDatetime.from", creationDatetime_from);
		qPath = query(qPath, "creationDatetime.to", creationDatetime_to);
		qPath = query(qPath, "deliveryReceipt", deliveryReceipt);
		qPath = query(qPath, "differedDelivery", differedDelivery);
		qPath = query(qPath, "ptt", ptt);
		qPath = query(qPath, "receiver", receiver);
		qPath = query(qPath, "sender", sender);
		qPath = query(qPath, "tag", tag);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/outgoing/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param id [required] Id of the object
	 */
	public OvhOutgoing serviceName_outgoing_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/outgoing/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOutgoing.class);
	}

	/**
	 * Delete the sms outgoing history given
	 *
	 * REST: DELETE /sms/{serviceName}/outgoing/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_outgoing_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/outgoing/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/outgoing/{id}/hlr
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param id [required] Id of the object
	 */
	public OvhHlr serviceName_outgoing_id_hlr_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/outgoing/{id}/hlr";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhHlr.class);
	}

	/**
	 * Home Location Register informations. Give informations about a given cellular phone.
	 *
	 * REST: GET /sms/{serviceName}/hlr
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<Long> serviceName_hlr_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/hlr";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add one or several sending hlr lookup request
	 *
	 * REST: POST /sms/{serviceName}/hlr
	 * @param receivers [required] The receivers
	 * @param receiversDocumentUrl [required] The receivers document url link in csv format
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public OvhSmsSendingReport serviceName_hlr_POST(String serviceName, String[] receivers, String receiversDocumentUrl) throws IOException {
		String qPath = "/sms/{serviceName}/hlr";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "receivers", receivers);
		addBody(o, "receiversDocumentUrl", receiversDocumentUrl);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSmsSendingReport.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/hlr/{id}/operator
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param id [required] HLR id
	 */
	public OvhHlr serviceName_hlr_id_operator_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/hlr/{id}/operator";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhHlr.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/hlr/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param id [required] HLR id
	 */
	public OvhHlrLookupNumber serviceName_hlr_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/hlr/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhHlrLookupNumber.class);
	}

	/**
	 * Receivers preloaded from text or csv document file
	 *
	 * REST: GET /sms/{serviceName}/receivers
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<Long> serviceName_receivers_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/receivers";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add a new document of csv receivers
	 *
	 * REST: POST /sms/{serviceName}/receivers
	 * @param documentId [required] ID of the /me/document file you want to import
	 * @param csvUrl [required] URL of the file you want to import
	 * @param slotId [required] Slot number id used to handle the document
	 * @param autoUpdate [required] Download file from URL before sending to contacts (works only with csvUrl and not document ID)
	 * @param description [required] Description name of the document
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public OvhReceiver serviceName_receivers_POST(String serviceName, String documentId, String csvUrl, Long slotId, Boolean autoUpdate, String description) throws IOException {
		String qPath = "/sms/{serviceName}/receivers";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		addBody(o, "csvUrl", csvUrl);
		addBody(o, "slotId", slotId);
		addBody(o, "autoUpdate", autoUpdate);
		addBody(o, "description", description);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhReceiver.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/receivers/{slotId}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param slotId [required] Slot number id
	 */
	public OvhReceiver serviceName_receivers_slotId_GET(String serviceName, Long slotId) throws IOException {
		String qPath = "/sms/{serviceName}/receivers/{slotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{slotId}", slotId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhReceiver.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/{serviceName}/receivers/{slotId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param slotId [required] Slot number id
	 */
	public void serviceName_receivers_slotId_PUT(String serviceName, Long slotId, OvhReceiver body) throws IOException {
		String qPath = "/sms/{serviceName}/receivers/{slotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{slotId}", slotId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete the document from the slot
	 *
	 * REST: DELETE /sms/{serviceName}/receivers/{slotId}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param slotId [required] Slot number id
	 */
	public void serviceName_receivers_slotId_DELETE(String serviceName, Long slotId) throws IOException {
		String qPath = "/sms/{serviceName}/receivers/{slotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{slotId}", slotId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get the document data container
	 *
	 * REST: GET /sms/{serviceName}/receivers/{slotId}/csv
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param slotId [required] Slot number id
	 */
	public String serviceName_receivers_slotId_csv_GET(String serviceName, Long slotId) throws IOException {
		String qPath = "/sms/{serviceName}/receivers/{slotId}/csv";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{slotId}", slotId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Clean the invalid and inactive receivers in the document by requesting HLR on each receiver. A report is sent by e-mail at the end of the operation.
	 *
	 * REST: POST /sms/{serviceName}/receivers/{slotId}/clean
	 * @param freemium [required] Limit checks to syntaxical validation
	 * @param priceOnly [required] Only get action's price in credits without executing it
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param slotId [required] Slot number id
	 */
	public OvhReceiversAsynchronousCleanReport serviceName_receivers_slotId_clean_POST(String serviceName, Long slotId, Boolean freemium, Boolean priceOnly) throws IOException {
		String qPath = "/sms/{serviceName}/receivers/{slotId}/clean";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{slotId}", slotId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "freemium", freemium);
		addBody(o, "priceOnly", priceOnly);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhReceiversAsynchronousCleanReport.class);
	}

	/**
	 * Operations on a SMS service
	 *
	 * REST: GET /sms/{serviceName}/task
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/sms/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/task/{taskId}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param taskId [required]
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/sms/{serviceName}/task/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Return phonebooks associated to this account
	 *
	 * REST: GET /sms/{serviceName}/phonebooks
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<String> serviceName_phonebooks_GET(String serviceName) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a phonebook. Return the bookKey.
	 *
	 * REST: POST /sms/{serviceName}/phonebooks
	 * @param name [required] Name of the wanted phonebook
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public String serviceName_phonebooks_POST(String serviceName, String name) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Phonebook contacts
	 *
	 * REST: GET /sms/{serviceName}/phonebooks/{bookKey}/phonebookContact
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public ArrayList<Long> serviceName_phonebooks_bookKey_phonebookContact_GET(String serviceName, String bookKey) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}/phonebookContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Create a phonebook contact. Return identifier of the phonebook contact.
	 *
	 * REST: POST /sms/{serviceName}/phonebooks/{bookKey}/phonebookContact
	 * @param homeMobile [required] Home mobile phone number of the contact
	 * @param workMobile [required] Mobile phone office number of the contact
	 * @param group [required] Group name of the phonebook
	 * @param name [required] Name of the contact
	 * @param homePhone [required] Home landline phone number of the contact
	 * @param workPhone [required] Landline phone office number of the contact
	 * @param surname [required] Contact surname
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public Long serviceName_phonebooks_bookKey_phonebookContact_POST(String serviceName, String bookKey, String homeMobile, String workMobile, String group, String name, String homePhone, String workPhone, String surname) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}/phonebookContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "homeMobile", homeMobile);
		addBody(o, "workMobile", workMobile);
		addBody(o, "group", group);
		addBody(o, "name", name);
		addBody(o, "homePhone", homePhone);
		addBody(o, "workPhone", workPhone);
		addBody(o, "surname", surname);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, Long.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/phonebooks/{bookKey}/phonebookContact/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 * @param id [required] Contact identifier
	 */
	public OvhPhonebookContact serviceName_phonebooks_bookKey_phonebookContact_id_GET(String serviceName, String bookKey, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}/phonebookContact/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPhonebookContact.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/{serviceName}/phonebooks/{bookKey}/phonebookContact/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 * @param id [required] Contact identifier
	 */
	public void serviceName_phonebooks_bookKey_phonebookContact_id_PUT(String serviceName, String bookKey, Long id, OvhPhonebookContact body) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}/phonebookContact/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a phonebook contact
	 *
	 * REST: DELETE /sms/{serviceName}/phonebooks/{bookKey}/phonebookContact/{id}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 * @param id [required] Contact identifier
	 */
	public void serviceName_phonebooks_bookKey_phonebookContact_id_DELETE(String serviceName, String bookKey, Long id) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}/phonebookContact/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/{serviceName}/phonebooks/{bookKey}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public OvhPhonebook serviceName_phonebooks_bookKey_GET(String serviceName, String bookKey) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPhonebook.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/{serviceName}/phonebooks/{bookKey}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public void serviceName_phonebooks_bookKey_PUT(String serviceName, String bookKey, OvhPhonebook body) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a phonebook
	 *
	 * REST: DELETE /sms/{serviceName}/phonebooks/{bookKey}
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public void serviceName_phonebooks_bookKey_DELETE(String serviceName, String bookKey) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		exec("DELETE", qPath);
	}

	/**
	 * Export the phonebook's contacts
	 *
	 * REST: GET /sms/{serviceName}/phonebooks/{bookKey}/export
	 * @param format [required] Format of the file
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public OvhPcsFile serviceName_phonebooks_bookKey_export_GET(String serviceName, String bookKey, OvhContactsExportFormatsEnum format) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}/export";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		qPath = query(qPath, "format", format);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPcsFile.class);
	}

	/**
	 * Import a contacts file. Supported formats are Excel (.xls and .xlsx) and CSV
	 *
	 * REST: POST /sms/{serviceName}/phonebooks/{bookKey}/import
	 * @param documentId [required] ID of the /me/document file you want to import
	 * @param serviceName [required] The internal name of your SMS offer
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public net.minidev.ovh.api.telephony.OvhTask serviceName_phonebooks_bookKey_import_POST(String serviceName, String bookKey, String documentId) throws IOException {
		String qPath = "/sms/{serviceName}/phonebooks/{bookKey}/import";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{bookKey}", bookKey);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, net.minidev.ovh.api.telephony.OvhTask.class);
	}

	/**
	 * Credit transfer between two sms accounts.
	 *
	 * REST: POST /sms/{serviceName}/transferCredits
	 * @param credits [required] Amount of credits to transfer.
	 * @param smsAccountTarget [required] Sms account destination.
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public void serviceName_transferCredits_POST(String serviceName, Double credits, String smsAccountTarget) throws IOException {
		String qPath = "/sms/{serviceName}/transferCredits";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "credits", credits);
		addBody(o, "smsAccountTarget", smsAccountTarget);
		exec("POST", qPath, o);
	}

	/**
	 * List available services
	 *
	 * REST: GET /sms
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/sms";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * List available services
	 *
	 * REST: GET /sms/virtualNumbers
	 */
	public ArrayList<String> virtualNumbers_GET() throws IOException {
		String qPath = "/sms/virtualNumbers";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/virtualNumbers/{number}/serviceInfos
	 * @param number [required] Your virtual number
	 */
	public OvhService virtualNumbers_number_serviceInfos_GET(String number) throws IOException {
		String qPath = "/sms/virtualNumbers/{number}/serviceInfos";
		qPath = qPath.replace("{number}", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /sms/virtualNumbers/{number}/serviceInfos
	 * @param body [required] New object properties
	 * @param number [required] Your virtual number
	 */
	public void virtualNumbers_number_serviceInfos_PUT(String number, OvhService body) throws IOException {
		String qPath = "/sms/virtualNumbers/{number}/serviceInfos";
		qPath = qPath.replace("{number}", number);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /sms/virtualNumbers/{number}
	 * @param number [required] Your virtual number
	 */
	public OvhVirtualNumberGenericService virtualNumbers_number_GET(String number) throws IOException {
		String qPath = "/sms/virtualNumbers/{number}";
		qPath = qPath.replace("{number}", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhVirtualNumberGenericService.class);
	}

	/**
	 * Get informations about the given ptt code
	 *
	 * REST: GET /sms/ptts
	 * @param ptt [required] The premium transaction tracking code
	 */
	public OvhPttDetails ptts_GET(Long ptt) throws IOException {
		String qPath = "/sms/ptts";
		qPath = query(qPath, "ptt", ptt);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPttDetails.class);
	}
}
