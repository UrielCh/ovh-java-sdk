package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.agreements.OvhAgreementStateEnum;
import net.minidev.ovh.api.agreements.OvhContract;
import net.minidev.ovh.api.agreements.OvhContractAgreement;
import net.minidev.ovh.api.api.OvhApplication;
import net.minidev.ovh.api.api.OvhCredential;
import net.minidev.ovh.api.api.OvhLog;
import net.minidev.ovh.api.auth.OvhCredentialStateEnum;
import net.minidev.ovh.api.billing.OvhAutomaticPaymentMean;
import net.minidev.ovh.api.billing.OvhBankAccount;
import net.minidev.ovh.api.billing.OvhBankAccountStateEnum;
import net.minidev.ovh.api.billing.OvhBill;
import net.minidev.ovh.api.billing.OvhBillDetail;
import net.minidev.ovh.api.billing.OvhCreditCard;
import net.minidev.ovh.api.billing.OvhFidelityAccount;
import net.minidev.ovh.api.billing.OvhFidelityMovement;
import net.minidev.ovh.api.billing.OvhMovement;
import net.minidev.ovh.api.billing.OvhOrder;
import net.minidev.ovh.api.billing.OvhOrderDetail;
import net.minidev.ovh.api.billing.OvhOvhAccount;
import net.minidev.ovh.api.billing.OvhPayment;
import net.minidev.ovh.api.billing.OvhPaymentMeanValidation;
import net.minidev.ovh.api.billing.OvhPaypal;
import net.minidev.ovh.api.billing.OvhRefund;
import net.minidev.ovh.api.billing.OvhRefundDetail;
import net.minidev.ovh.api.billing.OvhReusablePaymentMeanEnum;
import net.minidev.ovh.api.billing.order.OvhOrderStatusEnum;
import net.minidev.ovh.api.billing.order.OvhPaymentMeans;
import net.minidev.ovh.api.billing.order.OvhRegisteredPaymentMean;
import net.minidev.ovh.api.complextype.OvhSafeKeyValue;
import net.minidev.ovh.api.contact.OvhAddress;
import net.minidev.ovh.api.contact.OvhContact;
import net.minidev.ovh.api.contact.OvhFieldInformation;
import net.minidev.ovh.api.debt.OvhBalance;
import net.minidev.ovh.api.debt.OvhDebt;
import net.minidev.ovh.api.debt.OvhOperation;
import net.minidev.ovh.api.debt.entry.OvhAssociatedObject;
import net.minidev.ovh.api.dedicated.OvhTemplateOsFileSystemEnum;
import net.minidev.ovh.api.dedicated.OvhTemplateOsHardwareRaidEnum;
import net.minidev.ovh.api.dedicated.OvhTemplateOsLanguageEnum;
import net.minidev.ovh.api.dedicated.OvhTemplatePartitionTypeEnum;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhHardwareRaid;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhTemplatePartitioningSchemes;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhTemplatePartitions;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhTemplates;
import net.minidev.ovh.api.domain.OvhNicOperationFunctionEnum;
import net.minidev.ovh.api.domain.OvhOperationStatusEnum;
import net.minidev.ovh.api.nichandle.OvhCountryEnum;
import net.minidev.ovh.api.nichandle.OvhDomainTask;
import net.minidev.ovh.api.nichandle.OvhDomainTaskArgument;
import net.minidev.ovh.api.nichandle.OvhEmailNotification;
import net.minidev.ovh.api.nichandle.OvhGenderEnum;
import net.minidev.ovh.api.nichandle.OvhIpRegistryEnum;
import net.minidev.ovh.api.nichandle.OvhIpRestriction;
import net.minidev.ovh.api.nichandle.OvhIpRestrictionDefaultRule;
import net.minidev.ovh.api.nichandle.OvhIpv4Org;
import net.minidev.ovh.api.nichandle.OvhIpxe;
import net.minidev.ovh.api.nichandle.OvhLanguageEnum;
import net.minidev.ovh.api.nichandle.OvhLegalFormEnum;
import net.minidev.ovh.api.nichandle.OvhNicAutorenewInfos;
import net.minidev.ovh.api.nichandle.OvhNichandle;
import net.minidev.ovh.api.nichandle.OvhOvhCompanyEnum;
import net.minidev.ovh.api.nichandle.OvhSlaApply;
import net.minidev.ovh.api.nichandle.OvhSlaService;
import net.minidev.ovh.api.nichandle.OvhSshKey;
import net.minidev.ovh.api.nichandle.OvhSubAccount;
import net.minidev.ovh.api.nichandle.OvhSubAccountConsumerKey;
import net.minidev.ovh.api.nichandle.OvhSubscription;
import net.minidev.ovh.api.nichandle.OvhVipStatus;
import net.minidev.ovh.api.nichandle.OvhVoucherStatus;
import net.minidev.ovh.api.nichandle.accessrestriction.OvhIpRestrictionRuleEnum;
import net.minidev.ovh.api.nichandle.accessrestriction.OvhSOTPAccount;
import net.minidev.ovh.api.nichandle.accessrestriction.OvhSOTPSecret;
import net.minidev.ovh.api.nichandle.accessrestriction.OvhSOTPValidate;
import net.minidev.ovh.api.nichandle.accessrestriction.OvhSmsAccount;
import net.minidev.ovh.api.nichandle.accessrestriction.OvhSmsCode;
import net.minidev.ovh.api.nichandle.accessrestriction.OvhSmsSecret;
import net.minidev.ovh.api.nichandle.accessrestriction.OvhTOTPAccount;
import net.minidev.ovh.api.nichandle.accessrestriction.OvhTOTPSecret;
import net.minidev.ovh.api.nichandle.changeemail.OvhTaskStateEnum;
import net.minidev.ovh.api.nichandle.document.OvhDocument;
import net.minidev.ovh.api.nichandle.emailchange.OvhTask;
import net.minidev.ovh.api.xdsl.OvhSetting;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/me
 * version:1.0
 */
public class ApiOvhMe extends ApiOvhBase {
	public ApiOvhMe(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me
	 */
	public OvhNichandle GET() throws IOException {
		String qPath = "/me";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhNichandle.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me
	 * @param body [required] New object properties
	 */
	public void PUT(OvhNichandle body) throws IOException {
		String qPath = "/me";
		StringBuilder sb = path(qPath);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * List of all your IPXE scripts
	 *
	 * REST: GET /me/ipxeScript
	 */
	public ArrayList<String> ipxeScript_GET() throws IOException {
		String qPath = "/me/ipxeScript";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Add an IPXE script
	 *
	 * REST: POST /me/ipxeScript
	 * @param script [required] Content of your IPXE script
	 * @param name [required] name of your script
	 * @param description [required] A personnal description of this script
	 */
	public OvhIpxe ipxeScript_POST(String script, String name, String description) throws IOException {
		String qPath = "/me/ipxeScript";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "script", script);
		addBody(o, "name", name);
		addBody(o, "description", description);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhIpxe.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/ipxeScript/{name}
	 * @param name [required] Name of this script
	 */
	public OvhIpxe ipxeScript_name_GET(String name) throws IOException {
		String qPath = "/me/ipxeScript/{name}";
		StringBuilder sb = path(qPath, name);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhIpxe.class);
	}

	/**
	 * Remove this IPXE Script
	 *
	 * REST: DELETE /me/ipxeScript/{name}
	 * @param name [required] Name of this script
	 */
	public void ipxeScript_name_DELETE(String name) throws IOException {
		String qPath = "/me/ipxeScript/{name}";
		StringBuilder sb = path(qPath, name);
		exec("DELETE", sb.toString());
	}

	/**
	 * List of documents added in your account
	 *
	 * REST: GET /me/document
	 */
	public ArrayList<String> document_GET() throws IOException {
		String qPath = "/me/document";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Create new document
	 *
	 * REST: POST /me/document
	 * @param name [required] File name
	 * @param tags [required] File tags
	 */
	public OvhDocument document_POST(String name, OvhSafeKeyValue<String>[] tags) throws IOException {
		String qPath = "/me/document";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "tags", tags);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhDocument.class);
	}

	/**
	 * Add CORS support on your container
	 *
	 * REST: POST /me/document/cors
	 * @param origin [required] Allow this origin
	 */
	public void document_cors_POST(String origin) throws IOException {
		String qPath = "/me/document/cors";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "origin", origin);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/document/{id}
	 * @param id [required] Document id
	 */
	public OvhDocument document_id_GET(String id) throws IOException {
		String qPath = "/me/document/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhDocument.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/document/{id}
	 * @param body [required] New object properties
	 * @param id [required] Document id
	 */
	public void document_id_PUT(String id, OvhDocument body) throws IOException {
		String qPath = "/me/document/{id}";
		StringBuilder sb = path(qPath, id);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Delete a document
	 *
	 * REST: DELETE /me/document/{id}
	 * @param id [required] Document id
	 */
	public void document_id_DELETE(String id) throws IOException {
		String qPath = "/me/document/{id}";
		StringBuilder sb = path(qPath, id);
		exec("DELETE", sb.toString());
	}

	/**
	 * List active SLA
	 *
	 * REST: GET /me/sla
	 */
	public ArrayList<Long> sla_GET() throws IOException {
		String qPath = "/me/sla";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Ask for SLA application
	 *
	 * REST: POST /me/sla/{id}/apply
	 * @param id [required] Id of the object
	 */
	public void sla_id_apply_POST(Long id) throws IOException {
		String qPath = "/me/sla/{id}/apply";
		StringBuilder sb = path(qPath, id);
		exec("POST", sb.toString());
	}

	/**
	 * Check whether this SLA can be applied on your services
	 *
	 * REST: GET /me/sla/{id}/canBeApplied
	 * @param id [required] Id of the object
	 */
	public Boolean sla_id_canBeApplied_GET(Long id) throws IOException {
		String qPath = "/me/sla/{id}/canBeApplied";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/sla/{id}
	 * @param id [required] Id of the object
	 */
	public OvhSlaApply sla_id_GET(Long id) throws IOException {
		String qPath = "/me/sla/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSlaApply.class);
	}

	/**
	 * Get services impacted by this SLA
	 *
	 * REST: GET /me/sla/{id}/services
	 * @param id [required] Id of the object
	 */
	public ArrayList<OvhSlaService> sla_id_services_GET(Long id) throws IOException {
		String qPath = "/me/sla/{id}/services";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhSlaService>> t3 = new TypeReference<ArrayList<OvhSlaService>>() {};

	/**
	 * List of sub-accounts
	 *
	 * REST: GET /me/subAccount
	 */
	public ArrayList<Long> subAccount_GET() throws IOException {
		String qPath = "/me/subAccount";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Create a new sub-account
	 *
	 * REST: POST /me/subAccount
	 * @param description [required] Description of the new sub-account
	 */
	public Long subAccount_POST(String description) throws IOException {
		String qPath = "/me/subAccount";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, Long.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/subAccount/{id}
	 * @param id [required] Id of the object
	 */
	public OvhSubAccount subAccount_id_GET(Long id) throws IOException {
		String qPath = "/me/subAccount/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSubAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/subAccount/{id}
	 * @param body [required] New object properties
	 * @param id [required] Id of the object
	 */
	public void subAccount_id_PUT(Long id, OvhSubAccount body) throws IOException {
		String qPath = "/me/subAccount/{id}";
		StringBuilder sb = path(qPath, id);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Create a consumer key for the current application
	 *
	 * REST: POST /me/subAccount/{id}/createConsumerKey
	 * @param id [required] Id of the object
	 */
	public OvhSubAccountConsumerKey subAccount_id_createConsumerKey_POST(Long id) throws IOException {
		String qPath = "/me/subAccount/{id}/createConsumerKey";
		StringBuilder sb = path(qPath, id);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhSubAccountConsumerKey.class);
	}

	/**
	 * List of all the orders the logged account has
	 *
	 * REST: GET /me/order
	 * @param date_to [required] Filter the value of date property (<=)
	 * @param date_from [required] Filter the value of date property (>=)
	 */
	public ArrayList<Long> order_GET(Date date_from, Date date_to) throws IOException {
		String qPath = "/me/order";
		StringBuilder sb = path(qPath);
		query(sb, "date.from", date_from);
		query(sb, "date.to", date_to);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Return main data about the object the processing of the order generated
	 *
	 * REST: GET /me/order/{orderId}/paymentMeans
	 * @param orderId [required]
	 */
	public OvhPaymentMeans order_orderId_paymentMeans_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/paymentMeans";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhPaymentMeans.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/order/{orderId}
	 * @param orderId [required]
	 */
	public OvhOrder order_orderId_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/order/{orderId}/debt
	 * @param orderId [required]
	 */
	public OvhDebt order_orderId_debt_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/debt";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhDebt.class);
	}

	/**
	 * Create an order in order to pay this order's debt
	 *
	 * REST: POST /me/order/{orderId}/debt/pay
	 * @param orderId [required]
	 */
	public OvhOrder order_orderId_debt_pay_POST(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/debt/pay";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * All operations related to these debts
	 *
	 * REST: GET /me/order/{orderId}/debt/operation
	 * @param orderId [required]
	 */
	public ArrayList<Long> order_orderId_debt_operation_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/debt/operation";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/order/{orderId}/debt/operation/{operationId}
	 * @param orderId [required]
	 * @param operationId [required]
	 */
	public OvhOperation order_orderId_debt_operation_operationId_GET(Long orderId, Long operationId) throws IOException {
		String qPath = "/me/order/{orderId}/debt/operation/{operationId}";
		StringBuilder sb = path(qPath, orderId, operationId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return main data about the object related to this debt operation
	 *
	 * REST: GET /me/order/{orderId}/debt/operation/{operationId}/associatedObject
	 * @param orderId [required]
	 * @param operationId [required]
	 */
	public OvhAssociatedObject order_orderId_debt_operation_operationId_associatedObject_GET(Long orderId, Long operationId) throws IOException {
		String qPath = "/me/order/{orderId}/debt/operation/{operationId}/associatedObject";
		StringBuilder sb = path(qPath, orderId, operationId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhAssociatedObject.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/order/{orderId}/payment
	 * @param orderId [required]
	 */
	public OvhPayment order_orderId_payment_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/payment";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhPayment.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/order/{orderId}/refund
	 * @param orderId [required]
	 */
	public OvhRefund order_orderId_refund_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/refund";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhRefund.class);
	}

	/**
	 * Return status of order
	 *
	 * REST: GET /me/order/{orderId}/status
	 * @param orderId [required]
	 */
	public OvhOrderStatusEnum order_orderId_status_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/status";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhOrderStatusEnum.class);
	}

	/**
	 * Give access to all entries of the order
	 *
	 * REST: GET /me/order/{orderId}/details
	 * @param orderId [required]
	 */
	public ArrayList<Long> order_orderId_details_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/details";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/order/{orderId}/details/{orderDetailId}
	 * @param orderId [required]
	 * @param orderDetailId [required]
	 */
	public OvhOrderDetail order_orderId_details_orderDetailId_GET(Long orderId, Long orderDetailId) throws IOException {
		String qPath = "/me/order/{orderId}/details/{orderDetailId}";
		StringBuilder sb = path(qPath, orderId, orderDetailId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhOrderDetail.class);
	}

	/**
	 * List of registered payment mean you can use to pay this order
	 *
	 * REST: GET /me/order/{orderId}/availableRegisteredPaymentMean
	 * @param orderId [required]
	 */
	public ArrayList<OvhRegisteredPaymentMean> order_orderId_availableRegisteredPaymentMean_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/availableRegisteredPaymentMean";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhRegisteredPaymentMean>> t4 = new TypeReference<ArrayList<OvhRegisteredPaymentMean>>() {};

	/**
	 * Pay with an already registered payment mean
	 *
	 * REST: POST /me/order/{orderId}/payWithRegisteredPaymentMean
	 * @param paymentMean [required] The registered payment mean you want to use
	 * @param orderId [required]
	 */
	public void order_orderId_payWithRegisteredPaymentMean_POST(Long orderId, OvhReusablePaymentMeanEnum paymentMean) throws IOException {
		String qPath = "/me/order/{orderId}/payWithRegisteredPaymentMean";
		StringBuilder sb = path(qPath, orderId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "paymentMean", paymentMean);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/order/{orderId}/bill
	 * @param orderId [required]
	 */
	public OvhBill order_orderId_bill_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/bill";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhBill.class);
	}

	/**
	 * Return main data about the object the processing of the order generated
	 *
	 * REST: GET /me/order/{orderId}/associatedObject
	 * @param orderId [required]
	 */
	public net.minidev.ovh.api.billing.order.OvhAssociatedObject order_orderId_associatedObject_GET(Long orderId) throws IOException {
		String qPath = "/me/order/{orderId}/associatedObject";
		StringBuilder sb = path(qPath, orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, net.minidev.ovh.api.billing.order.OvhAssociatedObject.class);
	}

	/**
	 * List of all OVH things you can subscribe to
	 *
	 * REST: GET /me/subscription
	 */
	public ArrayList<String> subscription_GET() throws IOException {
		String qPath = "/me/subscription";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/subscription/{subscriptionType}
	 * @param subscriptionType [required] The type of subscription
	 */
	public OvhSubscription subscription_subscriptionType_GET(String subscriptionType) throws IOException {
		String qPath = "/me/subscription/{subscriptionType}";
		StringBuilder sb = path(qPath, subscriptionType);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSubscription.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/subscription/{subscriptionType}
	 * @param body [required] New object properties
	 * @param subscriptionType [required] The type of subscription
	 */
	public void subscription_subscriptionType_PUT(String subscriptionType, OvhSubscription body) throws IOException {
		String qPath = "/me/subscription/{subscriptionType}";
		StringBuilder sb = path(qPath, subscriptionType);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Your customized operating system installation templates
	 *
	 * REST: GET /me/installationTemplate
	 */
	public ArrayList<String> installationTemplate_GET() throws IOException {
		String qPath = "/me/installationTemplate";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Create a template
	 *
	 * REST: POST /me/installationTemplate
	 * @param defaultLanguage [required]
	 * @param name [required] Your template name
	 * @param baseTemplateName [required] OVH template name yours will be based on, choose one among the list given by compatibleTemplates function
	 */
	public void installationTemplate_POST(OvhTemplateOsLanguageEnum defaultLanguage, String name, String baseTemplateName) throws IOException {
		String qPath = "/me/installationTemplate";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "defaultLanguage", defaultLanguage);
		addBody(o, "name", name);
		addBody(o, "baseTemplateName", baseTemplateName);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/installationTemplate/{templateName}
	 * @param templateName [required] This template name
	 */
	public OvhTemplates installationTemplate_templateName_GET(String templateName) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}";
		StringBuilder sb = path(qPath, templateName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhTemplates.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/installationTemplate/{templateName}
	 * @param body [required] New object properties
	 * @param templateName [required] This template name
	 */
	public void installationTemplate_templateName_PUT(String templateName, OvhTemplates body) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}";
		StringBuilder sb = path(qPath, templateName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * remove this template
	 *
	 * REST: DELETE /me/installationTemplate/{templateName}
	 * @param templateName [required] This template name
	 */
	public void installationTemplate_templateName_DELETE(String templateName) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}";
		StringBuilder sb = path(qPath, templateName);
		exec("DELETE", sb.toString());
	}

	/**
	 * Partitioning schemes available on this template
	 *
	 * REST: GET /me/installationTemplate/{templateName}/partitionScheme
	 * @param templateName [required] This template name
	 */
	public ArrayList<String> installationTemplate_templateName_partitionScheme_GET(String templateName) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme";
		StringBuilder sb = path(qPath, templateName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Add a scheme of partition
	 *
	 * REST: POST /me/installationTemplate/{templateName}/partitionScheme
	 * @param priority [required] on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications)
	 * @param name [required] name of this partitioning scheme
	 * @param templateName [required] This template name
	 */
	public void installationTemplate_templateName_partitionScheme_POST(String templateName, Long priority, String name) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme";
		StringBuilder sb = path(qPath, templateName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "priority", priority);
		addBody(o, "name", name);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/installationTemplate/{templateName}/partitionScheme/{schemeName}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public OvhTemplatePartitioningSchemes installationTemplate_templateName_partitionScheme_schemeName_GET(String templateName, String schemeName) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}";
		StringBuilder sb = path(qPath, templateName, schemeName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhTemplatePartitioningSchemes.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/installationTemplate/{templateName}/partitionScheme/{schemeName}
	 * @param body [required] New object properties
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public void installationTemplate_templateName_partitionScheme_schemeName_PUT(String templateName, String schemeName, OvhTemplatePartitioningSchemes body) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}";
		StringBuilder sb = path(qPath, templateName, schemeName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * remove this scheme of partition
	 *
	 * REST: DELETE /me/installationTemplate/{templateName}/partitionScheme/{schemeName}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public void installationTemplate_templateName_partitionScheme_schemeName_DELETE(String templateName, String schemeName) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}";
		StringBuilder sb = path(qPath, templateName, schemeName);
		exec("DELETE", sb.toString());
	}

	/**
	 * Partitions defined in this partitioning scheme
	 *
	 * REST: GET /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public ArrayList<String> installationTemplate_templateName_partitionScheme_schemeName_partition_GET(String templateName, String schemeName) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition";
		StringBuilder sb = path(qPath, templateName, schemeName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Add a partition in this partitioning scheme
	 *
	 * REST: POST /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition
	 * @param volumeName [required] The volume name needed for proxmox distribution
	 * @param raid [required]
	 * @param step [required]
	 * @param filesystem [required] Partition filesytem
	 * @param mountpoint [required] partition mount point
	 * @param type [required]
	 * @param size [required] size of partition in Mb, 0 => rest of the space
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public void installationTemplate_templateName_partitionScheme_schemeName_partition_POST(String templateName, String schemeName, String volumeName, Long raid, Long step, OvhTemplateOsFileSystemEnum filesystem, String mountpoint, OvhTemplatePartitionTypeEnum type, Long size) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition";
		StringBuilder sb = path(qPath, templateName, schemeName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "volumeName", volumeName);
		addBody(o, "raid", raid);
		addBody(o, "step", step);
		addBody(o, "filesystem", filesystem);
		addBody(o, "mountpoint", mountpoint);
		addBody(o, "type", type);
		addBody(o, "size", size);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param mountpoint [required] partition mount point
	 */
	public OvhTemplatePartitions installationTemplate_templateName_partitionScheme_schemeName_partition_mountpoint_GET(String templateName, String schemeName, String mountpoint) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}";
		StringBuilder sb = path(qPath, templateName, schemeName, mountpoint);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhTemplatePartitions.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}
	 * @param body [required] New object properties
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param mountpoint [required] partition mount point
	 */
	public void installationTemplate_templateName_partitionScheme_schemeName_partition_mountpoint_PUT(String templateName, String schemeName, String mountpoint, OvhTemplatePartitions body) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}";
		StringBuilder sb = path(qPath, templateName, schemeName, mountpoint);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * remove this partition
	 *
	 * REST: DELETE /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param mountpoint [required] partition mount point
	 */
	public void installationTemplate_templateName_partitionScheme_schemeName_partition_mountpoint_DELETE(String templateName, String schemeName, String mountpoint) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}";
		StringBuilder sb = path(qPath, templateName, schemeName, mountpoint);
		exec("DELETE", sb.toString());
	}

	/**
	 * Hardware RAIDs defined in this partitioning scheme
	 *
	 * REST: GET /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public ArrayList<String> installationTemplate_templateName_partitionScheme_schemeName_hardwareRaid_GET(String templateName, String schemeName) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid";
		StringBuilder sb = path(qPath, templateName, schemeName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Add an hardware RAID in this partitioning scheme
	 *
	 * REST: POST /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid
	 * @param disks [required] Disk list. Syntax is cX:dY for disks and [cX:dY, cX:dY] for groups. With X and Y resp. the controler id and the disk id.
	 * @param step [required] Specifies the creation order of the hardware RAID
	 * @param mode [required] RAID mode
	 * @param name [required] Hardware RAID name
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public void installationTemplate_templateName_partitionScheme_schemeName_hardwareRaid_POST(String templateName, String schemeName, String[] disks, Long step, OvhTemplateOsHardwareRaidEnum mode, String name) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid";
		StringBuilder sb = path(qPath, templateName, schemeName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "disks", disks);
		addBody(o, "step", step);
		addBody(o, "mode", mode);
		addBody(o, "name", name);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param name [required] Hardware RAID name
	 */
	public OvhHardwareRaid installationTemplate_templateName_partitionScheme_schemeName_hardwareRaid_name_GET(String templateName, String schemeName, String name) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}";
		StringBuilder sb = path(qPath, templateName, schemeName, name);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhHardwareRaid.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}
	 * @param body [required] New object properties
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param name [required] Hardware RAID name
	 */
	public void installationTemplate_templateName_partitionScheme_schemeName_hardwareRaid_name_PUT(String templateName, String schemeName, String name, OvhHardwareRaid body) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}";
		StringBuilder sb = path(qPath, templateName, schemeName, name);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Remove this RAID
	 *
	 * REST: DELETE /me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param name [required] Hardware RAID name
	 */
	public void installationTemplate_templateName_partitionScheme_schemeName_hardwareRaid_name_DELETE(String templateName, String schemeName, String name) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}";
		StringBuilder sb = path(qPath, templateName, schemeName, name);
		exec("DELETE", sb.toString());
	}

	/**
	 * Check the integrity of this template
	 *
	 * REST: POST /me/installationTemplate/{templateName}/checkIntegrity
	 * @param templateName [required] This template name
	 */
	public void installationTemplate_templateName_checkIntegrity_POST(String templateName) throws IOException {
		String qPath = "/me/installationTemplate/{templateName}/checkIntegrity";
		StringBuilder sb = path(qPath, templateName);
		exec("POST", sb.toString());
	}

	/**
	 * List of all the refunds the logged account has
	 *
	 * REST: GET /me/refund
	 * @param orderId [required] Filter the value of orderId property (=)
	 * @param date_to [required] Filter the value of date property (<=)
	 * @param date_from [required] Filter the value of date property (>=)
	 */
	public ArrayList<String> refund_GET(Date date_from, Date date_to, Long orderId) throws IOException {
		String qPath = "/me/refund";
		StringBuilder sb = path(qPath);
		query(sb, "date.from", date_from);
		query(sb, "date.to", date_to);
		query(sb, "orderId", orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/refund/{refundId}
	 * @param refundId [required]
	 */
	public OvhRefund refund_refundId_GET(String refundId) throws IOException {
		String qPath = "/me/refund/{refundId}";
		StringBuilder sb = path(qPath, refundId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhRefund.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/refund/{refundId}/payment
	 * @param refundId [required]
	 */
	public OvhPayment refund_refundId_payment_GET(String refundId) throws IOException {
		String qPath = "/me/refund/{refundId}/payment";
		StringBuilder sb = path(qPath, refundId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhPayment.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/refund/{refundId}/details/{refundDetailId}
	 * @param refundId [required]
	 * @param refundDetailId [required]
	 */
	public OvhRefundDetail refund_refundId_details_refundDetailId_GET(String refundId, String refundDetailId) throws IOException {
		String qPath = "/me/refund/{refundId}/details/{refundDetailId}";
		StringBuilder sb = path(qPath, refundId, refundDetailId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhRefundDetail.class);
	}

	/**
	 * Give access to all entries of the refund
	 *
	 * REST: GET /me/refund/{refundId}/details
	 * @param refundId [required]
	 */
	public ArrayList<String> refund_refundId_details_GET(String refundId) throws IOException {
		String qPath = "/me/refund/{refundId}/details";
		StringBuilder sb = path(qPath, refundId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Verify existing voucher
	 *
	 * REST: POST /me/voucher/checkValidity
	 * @param voucher [required] Voucher value
	 */
	public OvhVoucherStatus voucher_checkValidity_POST(String voucher) throws IOException {
		String qPath = "/me/voucher/checkValidity";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "voucher", voucher);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhVoucherStatus.class);
	}

	/**
	 * Initiate a password change procedure
	 *
	 * REST: POST /me/changePassword
	 */
	public void changePassword_POST() throws IOException {
		String qPath = "/me/changePassword";
		StringBuilder sb = path(qPath);
		exec("POST", sb.toString());
	}

	/**
	 * Request a password recover
	 *
	 * REST: POST /me/passwordRecover
	 * @param ovhId [required] Your OVH Account Id
	 * @param ovhCompany [required] Company of your OVH Account Id
	 */
	public void passwordRecover_POST(String ovhId, OvhOvhCompanyEnum ovhCompany) throws IOException {
		String qPath = "/me/passwordRecover";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ovhId", ovhId);
		addBody(o, "ovhCompany", ovhCompany);
		execN("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/autorenew
	 */
	public OvhNicAutorenewInfos autorenew_GET() throws IOException {
		String qPath = "/me/autorenew";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhNicAutorenewInfos.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/autorenew
	 * @param body [required] New object properties
	 */
	public void autorenew_PUT(OvhNicAutorenewInfos body) throws IOException {
		String qPath = "/me/autorenew";
		StringBuilder sb = path(qPath);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Activate auto renew for this nic
	 *
	 * REST: POST /me/autorenew
	 * @param renewDay [required] Day of autorenew
	 */
	public void autorenew_POST(Long renewDay) throws IOException {
		String qPath = "/me/autorenew";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "renewDay", renewDay);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/accessRestriction/backupCode
	 */
	public OvhSOTPAccount accessRestriction_backupCode_GET() throws IOException {
		String qPath = "/me/accessRestriction/backupCode";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSOTPAccount.class);
	}

	/**
	 * Add a SOTP access restriction
	 *
	 * REST: POST /me/accessRestriction/backupCode
	 */
	public OvhSOTPSecret accessRestriction_backupCode_POST() throws IOException {
		String qPath = "/me/accessRestriction/backupCode";
		StringBuilder sb = path(qPath);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhSOTPSecret.class);
	}

	/**
	 * Delete this Two-Factor
	 *
	 * REST: DELETE /me/accessRestriction/backupCode
	 */
	public void accessRestriction_backupCode_DELETE() throws IOException {
		String qPath = "/me/accessRestriction/backupCode";
		StringBuilder sb = path(qPath);
		exec("DELETE", sb.toString());
	}

	/**
	 * Enable this SOTP account
	 *
	 * REST: POST /me/accessRestriction/backupCode/enable
	 * @param code [required] OTP code given by the application
	 */
	public void accessRestriction_backupCode_enable_POST(String code) throws IOException {
		String qPath = "/me/accessRestriction/backupCode/enable";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Validate your SOTP account
	 *
	 * REST: POST /me/accessRestriction/backupCode/validate
	 * @param code [required] OTP code given by the application
	 */
	public OvhSOTPValidate accessRestriction_backupCode_validate_POST(String code) throws IOException {
		String qPath = "/me/accessRestriction/backupCode/validate";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhSOTPValidate.class);
	}

	/**
	 * Disable this SOTP account
	 *
	 * REST: POST /me/accessRestriction/backupCode/disable
	 * @param code [required] OTP code given by the application
	 */
	public void accessRestriction_backupCode_disable_POST(String code) throws IOException {
		String qPath = "/me/accessRestriction/backupCode/disable";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", sb.toString(), o);
	}

	/**
	 * List of Sms accounts
	 *
	 * REST: GET /me/accessRestriction/sms
	 */
	public ArrayList<Long> accessRestriction_sms_GET() throws IOException {
		String qPath = "/me/accessRestriction/sms";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Add a SMS access restriction
	 *
	 * REST: POST /me/accessRestriction/sms
	 * @param phone [required] Cell phone number to register
	 */
	public OvhSmsSecret accessRestriction_sms_POST(String phone) throws IOException {
		String qPath = "/me/accessRestriction/sms";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "phone", phone);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhSmsSecret.class);
	}

	/**
	 * Send a SMS to this account
	 *
	 * REST: POST /me/accessRestriction/sms/{id}/sendCode
	 * @param id [required] The Id of the restriction
	 */
	public OvhSmsCode accessRestriction_sms_id_sendCode_POST(Long id) throws IOException {
		String qPath = "/me/accessRestriction/sms/{id}/sendCode";
		StringBuilder sb = path(qPath, id);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhSmsCode.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/accessRestriction/sms/{id}
	 * @param id [required] The Id of the restriction
	 */
	public OvhSmsAccount accessRestriction_sms_id_GET(Long id) throws IOException {
		String qPath = "/me/accessRestriction/sms/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSmsAccount.class);
	}

	/**
	 * Delete this Two-Factor
	 *
	 * REST: DELETE /me/accessRestriction/sms/{id}
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_sms_id_DELETE(Long id) throws IOException {
		String qPath = "/me/accessRestriction/sms/{id}";
		StringBuilder sb = path(qPath, id);
		exec("DELETE", sb.toString());
	}

	/**
	 * Enable this SMS account
	 *
	 * REST: POST /me/accessRestriction/sms/{id}/enable
	 * @param code [required] SMS code send by a cellphone
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_sms_id_enable_POST(Long id, String code) throws IOException {
		String qPath = "/me/accessRestriction/sms/{id}/enable";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Validate your SMS account
	 *
	 * REST: POST /me/accessRestriction/sms/{id}/validate
	 * @param code [required] SMS code send to a cellphone
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_sms_id_validate_POST(Long id, String code) throws IOException {
		String qPath = "/me/accessRestriction/sms/{id}/validate";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Disable this SMS account
	 *
	 * REST: POST /me/accessRestriction/sms/{id}/disable
	 * @param code [required] SMS code send by a cellphone
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_sms_id_disable_POST(Long id, String code) throws IOException {
		String qPath = "/me/accessRestriction/sms/{id}/disable";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", sb.toString(), o);
	}

	/**
	 * List of TOTP accounts
	 *
	 * REST: GET /me/accessRestriction/totp
	 */
	public ArrayList<Long> accessRestriction_totp_GET() throws IOException {
		String qPath = "/me/accessRestriction/totp";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Add a TOTP access restriction
	 *
	 * REST: POST /me/accessRestriction/totp
	 */
	public OvhTOTPSecret accessRestriction_totp_POST() throws IOException {
		String qPath = "/me/accessRestriction/totp";
		StringBuilder sb = path(qPath);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhTOTPSecret.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/accessRestriction/totp/{id}
	 * @param id [required] The Id of the restriction
	 */
	public OvhTOTPAccount accessRestriction_totp_id_GET(Long id) throws IOException {
		String qPath = "/me/accessRestriction/totp/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhTOTPAccount.class);
	}

	/**
	 * Delete this Two-Factor
	 *
	 * REST: DELETE /me/accessRestriction/totp/{id}
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_totp_id_DELETE(Long id) throws IOException {
		String qPath = "/me/accessRestriction/totp/{id}";
		StringBuilder sb = path(qPath, id);
		exec("DELETE", sb.toString());
	}

	/**
	 * Enable this TOTP account
	 *
	 * REST: POST /me/accessRestriction/totp/{id}/enable
	 * @param code [required] OTP code given by the application
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_totp_id_enable_POST(Long id, String code) throws IOException {
		String qPath = "/me/accessRestriction/totp/{id}/enable";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Validate your TOTP account
	 *
	 * REST: POST /me/accessRestriction/totp/{id}/validate
	 * @param code [required] OTP code given by the application
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_totp_id_validate_POST(Long id, String code) throws IOException {
		String qPath = "/me/accessRestriction/totp/{id}/validate";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Disable this TOTP account
	 *
	 * REST: POST /me/accessRestriction/totp/{id}/disable
	 * @param code [required] OTP code given by the application
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_totp_id_disable_POST(Long id, String code) throws IOException {
		String qPath = "/me/accessRestriction/totp/{id}/disable";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", sb.toString(), o);
	}

	/**
	 * List of IP restrictions
	 *
	 * REST: GET /me/accessRestriction/ip
	 */
	public ArrayList<Long> accessRestriction_ip_GET() throws IOException {
		String qPath = "/me/accessRestriction/ip";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Add an IP access restriction
	 *
	 * REST: POST /me/accessRestriction/ip
	 * @param ip [required] An IP range where we will apply the rule
	 * @param warning [required] Send an email if someone try to access with this IP address
	 * @param rule [required] Accept or deny IP access
	 */
	public void accessRestriction_ip_POST(String ip, Boolean warning, OvhIpRestrictionRuleEnum rule) throws IOException {
		String qPath = "/me/accessRestriction/ip";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		addBody(o, "warning", warning);
		addBody(o, "rule", rule);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/accessRestriction/ip/{id}
	 * @param id [required] The Id of the restriction
	 */
	public OvhIpRestriction accessRestriction_ip_id_GET(Long id) throws IOException {
		String qPath = "/me/accessRestriction/ip/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhIpRestriction.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/accessRestriction/ip/{id}
	 * @param body [required] New object properties
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_ip_id_PUT(Long id, OvhIpRestriction body) throws IOException {
		String qPath = "/me/accessRestriction/ip/{id}";
		StringBuilder sb = path(qPath, id);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Delete this restriction rule
	 *
	 * REST: DELETE /me/accessRestriction/ip/{id}
	 * @param id [required] The Id of the restriction
	 */
	public void accessRestriction_ip_id_DELETE(Long id) throws IOException {
		String qPath = "/me/accessRestriction/ip/{id}";
		StringBuilder sb = path(qPath, id);
		exec("DELETE", sb.toString());
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/accessRestriction/ipDefaultRule
	 */
	public OvhIpRestrictionDefaultRule accessRestriction_ipDefaultRule_GET() throws IOException {
		String qPath = "/me/accessRestriction/ipDefaultRule";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhIpRestrictionDefaultRule.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/accessRestriction/ipDefaultRule
	 * @param body [required] New object properties
	 */
	public void accessRestriction_ipDefaultRule_PUT(OvhIpRestrictionDefaultRule body) throws IOException {
		String qPath = "/me/accessRestriction/ipDefaultRule";
		StringBuilder sb = path(qPath);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Retrieve all contact that you created
	 *
	 * REST: GET /me/contact
	 */
	public ArrayList<Long> contact_GET() throws IOException {
		String qPath = "/me/contact";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Create a new contact
	 *
	 * REST: POST /me/contact
	 * @param address [required] Address of the contact
	 * @param cellPhone [required] Cellphone number
	 * @param phone [required] Landline phone number
	 * @param fax [required] Fax phone number
	 * @param birthDay [required] Birthday date
	 * @param birthCity [required] City of birth
	 * @param birthZip [required] Birth Zipcode
	 * @param birthCountry [required] Birth Country
	 * @param vat [required] VAT number
	 * @param companyNationalIdentificationNumber [required] Company national identification number
	 * @param nationalIdentificationNumber [required] National identification number
	 * @param organisationType [required] Type of your organisation
	 * @param organisationName [required] Name of your organisation
	 * @param email [required] Email address
	 * @param firstName [required] First name
	 * @param gender [required] Gender
	 * @param language [required] Language
	 * @param nationality [required] Nationality
	 * @param lastName [required] Last name
	 * @param legalForm [required] Legal form of the contact
	 */
	public OvhContact contact_POST(OvhAddress address, String cellPhone, String phone, String fax, Date birthDay, String birthCity, String birthZip, OvhCountryEnum birthCountry, String vat, String companyNationalIdentificationNumber, String nationalIdentificationNumber, String organisationType, String organisationName, String email, String firstName, OvhGenderEnum gender, OvhLanguageEnum language, OvhCountryEnum nationality, String lastName, OvhLegalFormEnum legalForm) throws IOException {
		String qPath = "/me/contact";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "address", address);
		addBody(o, "cellPhone", cellPhone);
		addBody(o, "phone", phone);
		addBody(o, "fax", fax);
		addBody(o, "birthDay", birthDay);
		addBody(o, "birthCity", birthCity);
		addBody(o, "birthZip", birthZip);
		addBody(o, "birthCountry", birthCountry);
		addBody(o, "vat", vat);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "organisationType", organisationType);
		addBody(o, "organisationName", organisationName);
		addBody(o, "email", email);
		addBody(o, "firstName", firstName);
		addBody(o, "gender", gender);
		addBody(o, "language", language);
		addBody(o, "nationality", nationality);
		addBody(o, "lastName", lastName);
		addBody(o, "legalForm", legalForm);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * Retrieve information about a contact
	 *
	 * REST: GET /me/contact/{contactId}
	 * @param contactId [required] Contact Identifier
	 */
	public OvhContact contact_contactId_GET(Long contactId) throws IOException {
		String qPath = "/me/contact/{contactId}";
		StringBuilder sb = path(qPath, contactId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * Update an existing contact
	 *
	 * REST: PUT /me/contact/{contactId}
	 * @param contactId [required] Contact Identifier
	 * @param address [required] Address of the contact
	 * @param cellPhone [required] Cellphone number
	 * @param phone [required] Landline phone number
	 * @param fax [required] Fax phone number
	 * @param birthDay [required] Birthday date
	 * @param birthCity [required] City of birth
	 * @param birthZip [required] Birth Zipcode
	 * @param birthCountry [required] Birth Country
	 * @param vat [required] VAT number
	 * @param companyNationalIdentificationNumber [required] Company national identification number
	 * @param nationalIdentificationNumber [required] National identification number
	 * @param organisationType [required] Type of your organisation
	 * @param organisationName [required] Name of your organisation
	 * @param email [required] Email address
	 * @param firstName [required] First name
	 * @param gender [required] Gender
	 * @param language [required] Language
	 * @param nationality [required] Nationality
	 * @param lastName [required] Last name
	 * @param legalForm [required] Legal form of the contact
	 */
	public OvhContact contact_contactId_PUT(Long contactId, OvhAddress address, String cellPhone, String phone, String fax, Date birthDay, String birthCity, String birthZip, OvhCountryEnum birthCountry, String vat, String companyNationalIdentificationNumber, String nationalIdentificationNumber, String organisationType, String organisationName, String email, String firstName, OvhGenderEnum gender, OvhLanguageEnum language, OvhCountryEnum nationality, String lastName, OvhLegalFormEnum legalForm) throws IOException {
		String qPath = "/me/contact/{contactId}";
		StringBuilder sb = path(qPath, contactId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "address", address);
		addBody(o, "cellPhone", cellPhone);
		addBody(o, "phone", phone);
		addBody(o, "fax", fax);
		addBody(o, "birthDay", birthDay);
		addBody(o, "birthCity", birthCity);
		addBody(o, "birthZip", birthZip);
		addBody(o, "birthCountry", birthCountry);
		addBody(o, "vat", vat);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "organisationType", organisationType);
		addBody(o, "organisationName", organisationName);
		addBody(o, "email", email);
		addBody(o, "firstName", firstName);
		addBody(o, "gender", gender);
		addBody(o, "language", language);
		addBody(o, "nationality", nationality);
		addBody(o, "lastName", lastName);
		addBody(o, "legalForm", legalForm);
		String resp = exec("PUT", sb.toString(), o);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * Display mandatory/read-only informations of a contact
	 *
	 * REST: GET /me/contact/{contactId}/fields
	 * @param contactId [required] Contact Identifier
	 */
	public ArrayList<OvhFieldInformation> contact_contactId_fields_GET(Long contactId) throws IOException {
		String qPath = "/me/contact/{contactId}/fields";
		StringBuilder sb = path(qPath, contactId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhFieldInformation>> t5 = new TypeReference<ArrayList<OvhFieldInformation>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/fidelityAccount/movements/{movementId}
	 * @param movementId [required]
	 */
	public OvhFidelityMovement fidelityAccount_movements_movementId_GET(Long movementId) throws IOException {
		String qPath = "/me/fidelityAccount/movements/{movementId}";
		StringBuilder sb = path(qPath, movementId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhFidelityMovement.class);
	}

	/**
	 * List of entries of the fidelity account
	 *
	 * REST: GET /me/fidelityAccount/movements
	 * @param date_to [required] Filter the value of date property (<=)
	 * @param date_from [required] Filter the value of date property (>=)
	 */
	public ArrayList<Long> fidelityAccount_movements_GET(Date date_from, Date date_to) throws IOException {
		String qPath = "/me/fidelityAccount/movements";
		StringBuilder sb = path(qPath);
		query(sb, "date.from", date_from);
		query(sb, "date.to", date_to);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/fidelityAccount
	 */
	public OvhFidelityAccount fidelityAccount_GET() throws IOException {
		String qPath = "/me/fidelityAccount";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhFidelityAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/fidelityAccount
	 * @param body [required] New object properties
	 */
	public void fidelityAccount_PUT(OvhFidelityAccount body) throws IOException {
		String qPath = "/me/fidelityAccount";
		StringBuilder sb = path(qPath);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Generate an order that can be paid in order to credit the fidelity account
	 *
	 * REST: POST /me/fidelityAccount/creditOrder
	 * @param amount [required] The amount of points you want to credit your fidelity account of
	 */
	public OvhOrder fidelityAccount_creditOrder_POST(Long amount) throws IOException {
		String qPath = "/me/fidelityAccount/creditOrder";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "amount", amount);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * VIP Status of this account
	 *
	 * REST: GET /me/vipStatus
	 */
	public OvhVipStatus vipStatus_GET() throws IOException {
		String qPath = "/me/vipStatus";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhVipStatus.class);
	}

	/**
	 * Initiate an email change procedure
	 *
	 * REST: POST /me/changeEmail
	 * @param newEmail [required] New email to associate to your account
	 */
	public OvhTask changeEmail_POST(String newEmail) throws IOException {
		String qPath = "/me/changeEmail";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "newEmail", newEmail);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of your Api Application
	 *
	 * REST: GET /me/api/application
	 */
	public ArrayList<Long> api_application_GET() throws IOException {
		String qPath = "/me/api/application";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/api/application/{applicationId}
	 * @param applicationId [required]
	 */
	public OvhApplication api_application_applicationId_GET(Long applicationId) throws IOException {
		String qPath = "/me/api/application/{applicationId}";
		StringBuilder sb = path(qPath, applicationId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhApplication.class);
	}

	/**
	 * Remove this application. It will revoke all credential belonging to this application.
	 *
	 * REST: DELETE /me/api/application/{applicationId}
	 * @param applicationId [required]
	 */
	public void api_application_applicationId_DELETE(Long applicationId) throws IOException {
		String qPath = "/me/api/application/{applicationId}";
		StringBuilder sb = path(qPath, applicationId);
		exec("DELETE", sb.toString());
	}

	/**
	 * List of Api calls done on services you have access to
	 *
	 * REST: GET /me/api/logs/services
	 */
	public ArrayList<Long> api_logs_services_GET() throws IOException {
		String qPath = "/me/api/logs/services";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/api/logs/services/{logId}
	 * @param logId [required]
	 */
	public OvhLog api_logs_services_logId_GET(Long logId) throws IOException {
		String qPath = "/me/api/logs/services/{logId}";
		StringBuilder sb = path(qPath, logId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhLog.class);
	}

	/**
	 * List of Api calls done with your account
	 *
	 * REST: GET /me/api/logs/self
	 */
	public ArrayList<Long> api_logs_self_GET() throws IOException {
		String qPath = "/me/api/logs/self";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/api/logs/self/{logId}
	 * @param logId [required]
	 */
	public OvhLog api_logs_self_logId_GET(Long logId) throws IOException {
		String qPath = "/me/api/logs/self/{logId}";
		StringBuilder sb = path(qPath, logId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhLog.class);
	}

	/**
	 * List of your Api Credentials
	 *
	 * REST: GET /me/api/credential
	 * @param status [required] Filter the value of status property (=)
	 * @param applicationId [required] Filter the value of applicationId property (like)
	 */
	public ArrayList<Long> api_credential_GET(Long applicationId, OvhCredentialStateEnum status) throws IOException {
		String qPath = "/me/api/credential";
		StringBuilder sb = path(qPath);
		query(sb, "applicationId", applicationId);
		query(sb, "status", status);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/api/credential/{credentialId}
	 * @param credentialId [required]
	 */
	public OvhCredential api_credential_credentialId_GET(Long credentialId) throws IOException {
		String qPath = "/me/api/credential/{credentialId}";
		StringBuilder sb = path(qPath, credentialId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhCredential.class);
	}

	/**
	 * Remove this credential
	 *
	 * REST: DELETE /me/api/credential/{credentialId}
	 * @param credentialId [required]
	 */
	public void api_credential_credentialId_DELETE(Long credentialId) throws IOException {
		String qPath = "/me/api/credential/{credentialId}";
		StringBuilder sb = path(qPath, credentialId);
		exec("DELETE", sb.toString());
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/api/credential/{credentialId}/application
	 * @param credentialId [required]
	 */
	public OvhApplication api_credential_credentialId_application_GET(Long credentialId) throws IOException {
		String qPath = "/me/api/credential/{credentialId}/application";
		StringBuilder sb = path(qPath, credentialId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhApplication.class);
	}

	/**
	 * List of Paypal accounts usable for payments on this account
	 *
	 * REST: GET /me/paymentMean/paypal
	 */
	public ArrayList<Long> paymentMean_paypal_GET() throws IOException {
		String qPath = "/me/paymentMean/paypal";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Enable payment through a new PayPal account
	 *
	 * REST: POST /me/paymentMean/paypal
	 * @param returnUrl [required] Callback URL where the customer will be redirected to after validation
	 * @param setDefault [required] Set as default payment mean once validated
	 * @param description [required] Custom description of this account
	 */
	public OvhPaymentMeanValidation paymentMean_paypal_POST(String returnUrl, Boolean setDefault, String description) throws IOException {
		String qPath = "/me/paymentMean/paypal";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "returnUrl", returnUrl);
		addBody(o, "setDefault", setDefault);
		addBody(o, "description", description);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhPaymentMeanValidation.class);
	}

	/**
	 * Choose this Paypal agreement as your default payment mean. Will cancel the previous choice.
	 *
	 * REST: POST /me/paymentMean/paypal/{id}/chooseAsDefaultPaymentMean
	 * @param id [required] Id of the object
	 */
	public void paymentMean_paypal_id_chooseAsDefaultPaymentMean_POST(Long id) throws IOException {
		String qPath = "/me/paymentMean/paypal/{id}/chooseAsDefaultPaymentMean";
		StringBuilder sb = path(qPath, id);
		exec("POST", sb.toString());
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/paymentMean/paypal/{id}
	 * @param id [required] Id of the object
	 */
	public OvhPaypal paymentMean_paypal_id_GET(Long id) throws IOException {
		String qPath = "/me/paymentMean/paypal/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhPaypal.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/paymentMean/paypal/{id}
	 * @param body [required] New object properties
	 * @param id [required] Id of the object
	 */
	public void paymentMean_paypal_id_PUT(Long id, OvhPaypal body) throws IOException {
		String qPath = "/me/paymentMean/paypal/{id}";
		StringBuilder sb = path(qPath, id);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Disable payment through this PayPal account
	 *
	 * REST: DELETE /me/paymentMean/paypal/{id}
	 * @param id [required] Id of the object
	 */
	public void paymentMean_paypal_id_DELETE(Long id) throws IOException {
		String qPath = "/me/paymentMean/paypal/{id}";
		StringBuilder sb = path(qPath, id);
		exec("DELETE", sb.toString());
	}

	/**
	 * List of bank accounts
	 *
	 * REST: GET /me/paymentMean/bankAccount
	 * @param state [required] Filter the value of state property (=)
	 */
	public ArrayList<Long> paymentMean_bankAccount_GET(OvhBankAccountStateEnum state) throws IOException {
		String qPath = "/me/paymentMean/bankAccount";
		StringBuilder sb = path(qPath);
		query(sb, "state", state);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Enable payment through a new account
	 *
	 * REST: POST /me/paymentMean/bankAccount
	 * @param iban [required] Account's IBAN
	 * @param ownerAddress [required] Account owner's address
	 * @param ownerName [required] Account owner's name
	 * @param bic [required] Account's BIC
	 * @param description [required] Custom description of this account
	 */
	public OvhPaymentMeanValidation paymentMean_bankAccount_POST(String iban, String ownerAddress, String ownerName, String bic, String description) throws IOException {
		String qPath = "/me/paymentMean/bankAccount";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "iban", iban);
		addBody(o, "ownerAddress", ownerAddress);
		addBody(o, "ownerName", ownerName);
		addBody(o, "bic", bic);
		addBody(o, "description", description);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhPaymentMeanValidation.class);
	}

	/**
	 * Choose this bank account as your default payment mean. Will cancel the previous choice.
	 *
	 * REST: POST /me/paymentMean/bankAccount/{id}/chooseAsDefaultPaymentMean
	 * @param id [required] Id of the object
	 */
	public void paymentMean_bankAccount_id_chooseAsDefaultPaymentMean_POST(Long id) throws IOException {
		String qPath = "/me/paymentMean/bankAccount/{id}/chooseAsDefaultPaymentMean";
		StringBuilder sb = path(qPath, id);
		exec("POST", sb.toString());
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/paymentMean/bankAccount/{id}
	 * @param id [required] Id of the object
	 */
	public OvhBankAccount paymentMean_bankAccount_id_GET(Long id) throws IOException {
		String qPath = "/me/paymentMean/bankAccount/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhBankAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/paymentMean/bankAccount/{id}
	 * @param body [required] New object properties
	 * @param id [required] Id of the object
	 */
	public void paymentMean_bankAccount_id_PUT(Long id, OvhBankAccount body) throws IOException {
		String qPath = "/me/paymentMean/bankAccount/{id}";
		StringBuilder sb = path(qPath, id);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Disable payment through this account
	 *
	 * REST: DELETE /me/paymentMean/bankAccount/{id}
	 * @param id [required] Id of the object
	 */
	public void paymentMean_bankAccount_id_DELETE(Long id) throws IOException {
		String qPath = "/me/paymentMean/bankAccount/{id}";
		StringBuilder sb = path(qPath, id);
		exec("DELETE", sb.toString());
	}

	/**
	 * List of credit cards
	 *
	 * REST: GET /me/paymentMean/creditCard
	 */
	public ArrayList<Long> paymentMean_creditCard_GET() throws IOException {
		String qPath = "/me/paymentMean/creditCard";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Add a new credit card
	 *
	 * REST: POST /me/paymentMean/creditCard
	 * @param returnUrl [required] Callback URL where the customer will be redirected to after validation
	 * @param setDefault [required] Set as default payment mean once validated
	 * @param description [required] Custom description of this account
	 */
	public OvhPaymentMeanValidation paymentMean_creditCard_POST(String returnUrl, Boolean setDefault, String description) throws IOException {
		String qPath = "/me/paymentMean/creditCard";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "returnUrl", returnUrl);
		addBody(o, "setDefault", setDefault);
		addBody(o, "description", description);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhPaymentMeanValidation.class);
	}

	/**
	 * Choose this credit card as your default payment mean. Will cancel the previous choice.
	 *
	 * REST: POST /me/paymentMean/creditCard/{id}/chooseAsDefaultPaymentMean
	 * @param id [required] Id of the object
	 */
	public void paymentMean_creditCard_id_chooseAsDefaultPaymentMean_POST(Long id) throws IOException {
		String qPath = "/me/paymentMean/creditCard/{id}/chooseAsDefaultPaymentMean";
		StringBuilder sb = path(qPath, id);
		exec("POST", sb.toString());
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/paymentMean/creditCard/{id}
	 * @param id [required] Id of the object
	 */
	public OvhCreditCard paymentMean_creditCard_id_GET(Long id) throws IOException {
		String qPath = "/me/paymentMean/creditCard/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhCreditCard.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/paymentMean/creditCard/{id}
	 * @param body [required] New object properties
	 * @param id [required] Id of the object
	 */
	public void paymentMean_creditCard_id_PUT(Long id, OvhCreditCard body) throws IOException {
		String qPath = "/me/paymentMean/creditCard/{id}";
		StringBuilder sb = path(qPath, id);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Disable payment through this credit card
	 *
	 * REST: DELETE /me/paymentMean/creditCard/{id}
	 * @param id [required] Id of the object
	 */
	public void paymentMean_creditCard_id_DELETE(Long id) throws IOException {
		String qPath = "/me/paymentMean/creditCard/{id}";
		StringBuilder sb = path(qPath, id);
		exec("DELETE", sb.toString());
	}

	/**
	 * List of OVH accounts the logged account has
	 *
	 * REST: GET /me/ovhAccount
	 */
	public ArrayList<String> ovhAccount_GET() throws IOException {
		String qPath = "/me/ovhAccount";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/ovhAccount/{ovhAccountId}/movements/{movementId}
	 * @param ovhAccountId [required]
	 * @param movementId [required]
	 */
	public OvhMovement ovhAccount_ovhAccountId_movements_movementId_GET(String ovhAccountId, Long movementId) throws IOException {
		String qPath = "/me/ovhAccount/{ovhAccountId}/movements/{movementId}";
		StringBuilder sb = path(qPath, ovhAccountId, movementId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhMovement.class);
	}

	/**
	 * Details about an entry of the OVH account
	 *
	 * REST: GET /me/ovhAccount/{ovhAccountId}/movements
	 * @param date_to [required] Filter the value of date property (<=)
	 * @param date_from [required] Filter the value of date property (>=)
	 * @param ovhAccountId [required]
	 */
	public ArrayList<Long> ovhAccount_ovhAccountId_movements_GET(String ovhAccountId, Date date_from, Date date_to) throws IOException {
		String qPath = "/me/ovhAccount/{ovhAccountId}/movements";
		StringBuilder sb = path(qPath, ovhAccountId);
		query(sb, "date.from", date_from);
		query(sb, "date.to", date_to);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/ovhAccount/{ovhAccountId}
	 * @param ovhAccountId [required]
	 */
	public OvhOvhAccount ovhAccount_ovhAccountId_GET(String ovhAccountId) throws IOException {
		String qPath = "/me/ovhAccount/{ovhAccountId}";
		StringBuilder sb = path(qPath, ovhAccountId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhOvhAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/ovhAccount/{ovhAccountId}
	 * @param body [required] New object properties
	 * @param ovhAccountId [required]
	 */
	public void ovhAccount_ovhAccountId_PUT(String ovhAccountId, OvhOvhAccount body) throws IOException {
		String qPath = "/me/ovhAccount/{ovhAccountId}";
		StringBuilder sb = path(qPath, ovhAccountId);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Generate an order that can be paid in order to credit the OVH account
	 *
	 * REST: POST /me/ovhAccount/{ovhAccountId}/creditOrder
	 * @param amount [required] The amount in cents you want to credit your account of
	 * @param ovhAccountId [required]
	 */
	public OvhOrder ovhAccount_ovhAccountId_creditOrder_POST(String ovhAccountId, Long amount) throws IOException {
		String qPath = "/me/ovhAccount/{ovhAccountId}/creditOrder";
		StringBuilder sb = path(qPath, ovhAccountId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "amount", amount);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Transfer money from ovhAccount to your bank account
	 *
	 * REST: POST /me/ovhAccount/{ovhAccountId}/retrieveMoney
	 * @param amount [required] The amount in cents you want to transfer
	 * @param bankAccountId [required] A valid bank account
	 * @param ovhAccountId [required]
	 */
	public OvhOrder ovhAccount_ovhAccountId_retrieveMoney_POST(String ovhAccountId, Long amount, Long bankAccountId) throws IOException {
		String qPath = "/me/ovhAccount/{ovhAccountId}/retrieveMoney";
		StringBuilder sb = path(qPath, ovhAccountId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "amount", amount);
		addBody(o, "bankAccountId", bankAccountId);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List of domain task
	 *
	 * REST: GET /me/task/domain
	 * @param domain [required] Filter the value of domain property (like)
	 * @param function [required] Filter the value of function property (like)
	 * @param status [required] Filter the value of status property (=)
	 */
	public ArrayList<Long> task_domain_GET(String domain, OvhNicOperationFunctionEnum function, OvhOperationStatusEnum status) throws IOException {
		String qPath = "/me/task/domain";
		StringBuilder sb = path(qPath);
		query(sb, "domain", domain);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * List of arguments
	 *
	 * REST: GET /me/task/domain/{id}/argument
	 * @param id [required] Id of the task
	 */
	public ArrayList<String> task_domain_id_argument_GET(Long id) throws IOException {
		String qPath = "/me/task/domain/{id}/argument";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/task/domain/{id}/argument/{key}
	 * @param id [required] Id of the task
	 * @param key [required] Key of the argument
	 */
	public OvhDomainTaskArgument task_domain_id_argument_key_GET(Long id, String key) throws IOException {
		String qPath = "/me/task/domain/{id}/argument/{key}";
		StringBuilder sb = path(qPath, id, key);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhDomainTaskArgument.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/task/domain/{id}/argument/{key}
	 * @param body [required] New object properties
	 * @param id [required] Id of the task
	 * @param key [required] Key of the argument
	 */
	public void task_domain_id_argument_key_PUT(Long id, String key, OvhDomainTaskArgument body) throws IOException {
		String qPath = "/me/task/domain/{id}/argument/{key}";
		StringBuilder sb = path(qPath, id, key);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/task/domain/{id}
	 * @param id [required] Id of the task
	 */
	public OvhDomainTask task_domain_id_GET(Long id) throws IOException {
		String qPath = "/me/task/domain/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhDomainTask.class);
	}

	/**
	 * Relaunch the task
	 *
	 * REST: POST /me/task/domain/{id}/relaunch
	 * @param id [required] Id of the task
	 */
	public void task_domain_id_relaunch_POST(Long id) throws IOException {
		String qPath = "/me/task/domain/{id}/relaunch";
		StringBuilder sb = path(qPath, id);
		exec("POST", sb.toString());
	}

	/**
	 * Accelerate the task
	 *
	 * REST: POST /me/task/domain/{id}/accelerate
	 * @param id [required] Id of the task
	 */
	public void task_domain_id_accelerate_POST(Long id) throws IOException {
		String qPath = "/me/task/domain/{id}/accelerate";
		StringBuilder sb = path(qPath, id);
		exec("POST", sb.toString());
	}

	/**
	 * Cancel the task
	 *
	 * REST: POST /me/task/domain/{id}/cancel
	 * @param id [required] Id of the task
	 */
	public void task_domain_id_cancel_POST(Long id) throws IOException {
		String qPath = "/me/task/domain/{id}/cancel";
		StringBuilder sb = path(qPath, id);
		exec("POST", sb.toString());
	}

	/**
	 * List of email change tasks you are involved in
	 *
	 * REST: GET /me/task/emailChange
	 * @param state [required] Filter the value of state property (like)
	 */
	public ArrayList<Long> task_emailChange_GET(OvhTaskStateEnum state) throws IOException {
		String qPath = "/me/task/emailChange";
		StringBuilder sb = path(qPath);
		query(sb, "state", state);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/task/emailChange/{id}
	 * @param id [required]
	 */
	public OvhTask task_emailChange_id_GET(Long id) throws IOException {
		String qPath = "/me/task/emailChange/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Accept this change request
	 *
	 * REST: POST /me/task/emailChange/{id}/accept
	 * @param token [required] The token you received by email for this request
	 * @param id [required]
	 */
	public void task_emailChange_id_accept_POST(Long id, String token) throws IOException {
		String qPath = "/me/task/emailChange/{id}/accept";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "token", token);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Refuse this change request
	 *
	 * REST: POST /me/task/emailChange/{id}/refuse
	 * @param token [required] The token you received by email for this request
	 * @param id [required]
	 */
	public void task_emailChange_id_refuse_POST(Long id, String token) throws IOException {
		String qPath = "/me/task/emailChange/{id}/refuse";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "token", token);
		exec("POST", sb.toString(), o);
	}

	/**
	 * List of service contact change tasks you are involved in
	 *
	 * REST: GET /me/task/contactChange
	 * @param toAccount [required] Filter the value of toAccount property (like)
	 * @param askingAccount [required] Filter the value of askingAccount property (like)
	 * @param state [required] Filter the value of state property (like)
	 */
	public ArrayList<Long> task_contactChange_GET(String askingAccount, net.minidev.ovh.api.nichandle.changecontact.OvhTaskStateEnum state, String toAccount) throws IOException {
		String qPath = "/me/task/contactChange";
		StringBuilder sb = path(qPath);
		query(sb, "askingAccount", askingAccount);
		query(sb, "state", state);
		query(sb, "toAccount", toAccount);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/task/contactChange/{id}
	 * @param id [required]
	 */
	public net.minidev.ovh.api.nichandle.contactchange.OvhTask task_contactChange_id_GET(Long id) throws IOException {
		String qPath = "/me/task/contactChange/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, net.minidev.ovh.api.nichandle.contactchange.OvhTask.class);
	}

	/**
	 * Accept this change request
	 *
	 * REST: POST /me/task/contactChange/{id}/accept
	 * @param token [required] The token you received by email for this request
	 * @param id [required]
	 */
	public void task_contactChange_id_accept_POST(Long id, String token) throws IOException {
		String qPath = "/me/task/contactChange/{id}/accept";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "token", token);
		exec("POST", sb.toString(), o);
	}

	/**
	 * This call will send you a new email, containing a new token
	 *
	 * REST: POST /me/task/contactChange/{id}/resendEmail
	 * @param id [required]
	 */
	public void task_contactChange_id_resendEmail_POST(Long id) throws IOException {
		String qPath = "/me/task/contactChange/{id}/resendEmail";
		StringBuilder sb = path(qPath, id);
		exec("POST", sb.toString());
	}

	/**
	 * Refuse this change request
	 *
	 * REST: POST /me/task/contactChange/{id}/refuse
	 * @param token [required] The token you received by email for this request
	 * @param id [required]
	 */
	public void task_contactChange_id_refuse_POST(Long id, String token) throws IOException {
		String qPath = "/me/task/contactChange/{id}/refuse";
		StringBuilder sb = path(qPath, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "token", token);
		exec("POST", sb.toString(), o);
	}

	/**
	 * List of organisations
	 *
	 * REST: GET /me/ipOrganisation
	 */
	public ArrayList<String> ipOrganisation_GET() throws IOException {
		String qPath = "/me/ipOrganisation";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Add an organisation
	 *
	 * REST: POST /me/ipOrganisation
	 * @param country [required]
	 * @param firstname [required]
	 * @param registry [required]
	 * @param lastname [required]
	 * @param phone [required]
	 * @param abuse_mailbox [required]
	 * @param zip [required]
	 * @param city [required]
	 * @param address [required]
	 */
	public void ipOrganisation_POST(OvhCountryEnum country, String firstname, OvhIpRegistryEnum registry, String lastname, String phone, String abuse_mailbox, String zip, String city, String address) throws IOException {
		String qPath = "/me/ipOrganisation";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "country", country);
		addBody(o, "firstname", firstname);
		addBody(o, "registry", registry);
		addBody(o, "lastname", lastname);
		addBody(o, "phone", phone);
		addBody(o, "abuse_mailbox", abuse_mailbox);
		addBody(o, "zip", zip);
		addBody(o, "city", city);
		addBody(o, "address", address);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/ipOrganisation/{organisationId}
	 * @param organisationId [required]
	 */
	public OvhIpv4Org ipOrganisation_organisationId_GET(String organisationId) throws IOException {
		String qPath = "/me/ipOrganisation/{organisationId}";
		StringBuilder sb = path(qPath, organisationId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhIpv4Org.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/ipOrganisation/{organisationId}
	 * @param body [required] New object properties
	 * @param organisationId [required]
	 */
	public void ipOrganisation_organisationId_PUT(String organisationId, OvhIpv4Org body) throws IOException {
		String qPath = "/me/ipOrganisation/{organisationId}";
		StringBuilder sb = path(qPath, organisationId);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * List available payment methods in this Nic's country
	 *
	 * REST: GET /me/availableAutomaticPaymentMeans
	 */
	public OvhAutomaticPaymentMean availableAutomaticPaymentMeans_GET() throws IOException {
		String qPath = "/me/availableAutomaticPaymentMeans";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhAutomaticPaymentMean.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/sshKey/{keyName}
	 * @param keyName [required] Name of this public SSH key
	 */
	public OvhSshKey sshKey_keyName_GET(String keyName) throws IOException {
		String qPath = "/me/sshKey/{keyName}";
		StringBuilder sb = path(qPath, keyName);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSshKey.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /me/sshKey/{keyName}
	 * @param body [required] New object properties
	 * @param keyName [required] Name of this public SSH key
	 */
	public void sshKey_keyName_PUT(String keyName, OvhSshKey body) throws IOException {
		String qPath = "/me/sshKey/{keyName}";
		StringBuilder sb = path(qPath, keyName);
		exec("PUT", sb.toString(), body);
	}

	/**
	 * Remove this public SSH key
	 *
	 * REST: DELETE /me/sshKey/{keyName}
	 * @param keyName [required] Name of this public SSH key
	 */
	public void sshKey_keyName_DELETE(String keyName) throws IOException {
		String qPath = "/me/sshKey/{keyName}";
		StringBuilder sb = path(qPath, keyName);
		exec("DELETE", sb.toString());
	}

	/**
	 * List of your public SSH keys
	 *
	 * REST: GET /me/sshKey
	 */
	public ArrayList<String> sshKey_GET() throws IOException {
		String qPath = "/me/sshKey";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Add a new public SSH key
	 *
	 * REST: POST /me/sshKey
	 * @param key [required] ASCII encoded public SSH key to add
	 * @param keyName [required] name of the new public SSH key
	 */
	public void sshKey_POST(String key, String keyName) throws IOException {
		String qPath = "/me/sshKey";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "key", key);
		addBody(o, "keyName", keyName);
		exec("POST", sb.toString(), o);
	}

	/**
	 * List of all your email notifications
	 *
	 * REST: GET /me/notification/email/history
	 */
	public ArrayList<Long> notification_email_history_GET() throws IOException {
		String qPath = "/me/notification/email/history";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/notification/email/history/{id}
	 * @param id [required] Id of the object
	 */
	public OvhEmailNotification notification_email_history_id_GET(Long id) throws IOException {
		String qPath = "/me/notification/email/history/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhEmailNotification.class);
	}

	/**
	 * List of mailing list you can subscribe
	 *
	 * REST: GET /me/mailingList/availableLists
	 */
	public ArrayList<String> mailingList_availableLists_GET() throws IOException {
		String qPath = "/me/mailingList/availableLists";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Subscribe an email to a restricted mailing list
	 *
	 * REST: POST /me/mailingList/subscribe
	 * @param email [required] Email you want to subscribe to
	 * @param mailingList [required] Mailing list
	 */
	public void mailingList_subscribe_POST(String email, String mailingList) throws IOException {
		String qPath = "/me/mailingList/subscribe";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "mailingList", mailingList);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/debtAccount
	 */
	public OvhBalance debtAccount_GET() throws IOException {
		String qPath = "/me/debtAccount";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhBalance.class);
	}

	/**
	 * All debts related to your account
	 *
	 * REST: GET /me/debtAccount/debt
	 */
	public ArrayList<Long> debtAccount_debt_GET() throws IOException {
		String qPath = "/me/debtAccount/debt";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/debtAccount/debt/{debtId}
	 * @param debtId [required]
	 */
	public OvhDebt debtAccount_debt_debtId_GET(Long debtId) throws IOException {
		String qPath = "/me/debtAccount/debt/{debtId}";
		StringBuilder sb = path(qPath, debtId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhDebt.class);
	}

	/**
	 * Create an order in order to pay this order's debt
	 *
	 * REST: POST /me/debtAccount/debt/{debtId}/pay
	 * @param debtId [required]
	 */
	public OvhOrder debtAccount_debt_debtId_pay_POST(Long debtId) throws IOException {
		String qPath = "/me/debtAccount/debt/{debtId}/pay";
		StringBuilder sb = path(qPath, debtId);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * All operations related to these debts
	 *
	 * REST: GET /me/debtAccount/debt/{debtId}/operation
	 * @param debtId [required]
	 */
	public ArrayList<Long> debtAccount_debt_debtId_operation_GET(Long debtId) throws IOException {
		String qPath = "/me/debtAccount/debt/{debtId}/operation";
		StringBuilder sb = path(qPath, debtId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/debtAccount/debt/{debtId}/operation/{operationId}
	 * @param debtId [required]
	 * @param operationId [required]
	 */
	public OvhOperation debtAccount_debt_debtId_operation_operationId_GET(Long debtId, Long operationId) throws IOException {
		String qPath = "/me/debtAccount/debt/{debtId}/operation/{operationId}";
		StringBuilder sb = path(qPath, debtId, operationId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return main data about the object related to this debt operation
	 *
	 * REST: GET /me/debtAccount/debt/{debtId}/operation/{operationId}/associatedObject
	 * @param debtId [required]
	 * @param operationId [required]
	 */
	public OvhAssociatedObject debtAccount_debt_debtId_operation_operationId_associatedObject_GET(Long debtId, Long operationId) throws IOException {
		String qPath = "/me/debtAccount/debt/{debtId}/operation/{operationId}/associatedObject";
		StringBuilder sb = path(qPath, debtId, operationId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhAssociatedObject.class);
	}

	/**
	 * Create an order in order to pay all your due debts
	 *
	 * REST: POST /me/debtAccount/pay
	 */
	public OvhOrder debtAccount_pay_POST() throws IOException {
		String qPath = "/me/debtAccount/pay";
		StringBuilder sb = path(qPath);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Change xdsl settings linked to the nichandle
	 *
	 * REST: POST /me/xdsl/setting
	 * @param resellerFastModemShipping [required] Send the modem as soon as possible, do not wait the xdsl line to be active
	 */
	public void xdsl_setting_POST(Boolean resellerFastModemShipping) throws IOException {
		String qPath = "/me/xdsl/setting";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "resellerFastModemShipping", resellerFastModemShipping);
		exec("POST", sb.toString(), o);
	}

	/**
	 * Get xdsl settings linked to the nichandle
	 *
	 * REST: GET /me/xdsl/setting
	 */
	public OvhSetting xdsl_setting_GET() throws IOException {
		String qPath = "/me/xdsl/setting";
		StringBuilder sb = path(qPath);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhSetting.class);
	}

	/**
	 * List of contracts signed between you and OVH
	 *
	 * REST: GET /me/agreements
	 * @param agreed [required] Filter the value of agreed property (like)
	 * @param contractId [required] Filter the value of contractId property (like)
	 */
	public ArrayList<Long> agreements_GET(OvhAgreementStateEnum agreed, Long contractId) throws IOException {
		String qPath = "/me/agreements";
		StringBuilder sb = path(qPath);
		query(sb, "agreed", agreed);
		query(sb, "contractId", contractId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/agreements/{id}
	 * @param id [required] Id of the contract
	 */
	public OvhContractAgreement agreements_id_GET(Long id) throws IOException {
		String qPath = "/me/agreements/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhContractAgreement.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/agreements/{id}/contract
	 * @param id [required] Id of the contract
	 */
	public OvhContract agreements_id_contract_GET(Long id) throws IOException {
		String qPath = "/me/agreements/{id}/contract";
		StringBuilder sb = path(qPath, id);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhContract.class);
	}

	/**
	 * Accept this contract
	 *
	 * REST: POST /me/agreements/{id}/accept
	 * @param id [required] Id of the contract
	 */
	public String agreements_id_accept_POST(Long id) throws IOException {
		String qPath = "/me/agreements/{id}/accept";
		StringBuilder sb = path(qPath, id);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, String.class);
	}

	/**
	 * List of all the bills the logged account has
	 *
	 * REST: GET /me/bill
	 * @param orderId [required] Filter the value of orderId property (=)
	 * @param date_to [required] Filter the value of date property (<=)
	 * @param date_from [required] Filter the value of date property (>=)
	 */
	public ArrayList<String> bill_GET(Date date_from, Date date_to, Long orderId) throws IOException {
		String qPath = "/me/bill";
		StringBuilder sb = path(qPath);
		query(sb, "date.from", date_from);
		query(sb, "date.to", date_to);
		query(sb, "orderId", orderId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/bill/{billId}
	 * @param billId [required]
	 */
	public OvhBill bill_billId_GET(String billId) throws IOException {
		String qPath = "/me/bill/{billId}";
		StringBuilder sb = path(qPath, billId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhBill.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/bill/{billId}/debt
	 * @param billId [required]
	 */
	public OvhDebt bill_billId_debt_GET(String billId) throws IOException {
		String qPath = "/me/bill/{billId}/debt";
		StringBuilder sb = path(qPath, billId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhDebt.class);
	}

	/**
	 * Create an order in order to pay this order's debt
	 *
	 * REST: POST /me/bill/{billId}/debt/pay
	 * @param billId [required]
	 */
	public OvhOrder bill_billId_debt_pay_POST(String billId) throws IOException {
		String qPath = "/me/bill/{billId}/debt/pay";
		StringBuilder sb = path(qPath, billId);
		String resp = exec("POST", sb.toString());
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * All operations related to these debts
	 *
	 * REST: GET /me/bill/{billId}/debt/operation
	 * @param billId [required]
	 */
	public ArrayList<Long> bill_billId_debt_operation_GET(String billId) throws IOException {
		String qPath = "/me/bill/{billId}/debt/operation";
		StringBuilder sb = path(qPath, billId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/bill/{billId}/debt/operation/{operationId}
	 * @param billId [required]
	 * @param operationId [required]
	 */
	public OvhOperation bill_billId_debt_operation_operationId_GET(String billId, Long operationId) throws IOException {
		String qPath = "/me/bill/{billId}/debt/operation/{operationId}";
		StringBuilder sb = path(qPath, billId, operationId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return main data about the object related to this debt operation
	 *
	 * REST: GET /me/bill/{billId}/debt/operation/{operationId}/associatedObject
	 * @param billId [required]
	 * @param operationId [required]
	 */
	public OvhAssociatedObject bill_billId_debt_operation_operationId_associatedObject_GET(String billId, Long operationId) throws IOException {
		String qPath = "/me/bill/{billId}/debt/operation/{operationId}/associatedObject";
		StringBuilder sb = path(qPath, billId, operationId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhAssociatedObject.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/bill/{billId}/payment
	 * @param billId [required]
	 */
	public OvhPayment bill_billId_payment_GET(String billId) throws IOException {
		String qPath = "/me/bill/{billId}/payment";
		StringBuilder sb = path(qPath, billId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhPayment.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /me/bill/{billId}/details/{billDetailId}
	 * @param billId [required]
	 * @param billDetailId [required]
	 */
	public OvhBillDetail bill_billId_details_billDetailId_GET(String billId, String billDetailId) throws IOException {
		String qPath = "/me/bill/{billId}/details/{billDetailId}";
		StringBuilder sb = path(qPath, billId, billDetailId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, OvhBillDetail.class);
	}

	/**
	 * Give access to all entries of the bill
	 *
	 * REST: GET /me/bill/{billId}/details
	 * @param billId [required]
	 */
	public ArrayList<String> bill_billId_details_GET(String billId) throws IOException {
		String qPath = "/me/bill/{billId}/details";
		StringBuilder sb = path(qPath, billId);
		String resp = exec("GET", sb.toString());
		return convertTo(resp, t1);
	}
}
