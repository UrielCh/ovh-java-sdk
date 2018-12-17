package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.pack.xdsl.OvhDomainActionEnum;
import net.minidev.ovh.api.pack.xdsl.OvhExchangeAccountService;
import net.minidev.ovh.api.pack.xdsl.OvhExchangeLiteService;
import net.minidev.ovh.api.pack.xdsl.OvhHubic;
import net.minidev.ovh.api.pack.xdsl.OvhPackAdsl;
import net.minidev.ovh.api.pack.xdsl.OvhResiliationFollowUpDetail;
import net.minidev.ovh.api.pack.xdsl.OvhResiliationSurvey;
import net.minidev.ovh.api.pack.xdsl.OvhResiliationTerms;
import net.minidev.ovh.api.pack.xdsl.OvhServiceInformation;
import net.minidev.ovh.api.pack.xdsl.OvhShippingAddress;
import net.minidev.ovh.api.pack.xdsl.OvhShippingAddressContextEnum;
import net.minidev.ovh.api.pack.xdsl.OvhSiteBuilderDomain;
import net.minidev.ovh.api.pack.xdsl.OvhSiteBuilderTemplate;
import net.minidev.ovh.api.pack.xdsl.OvhTask;
import net.minidev.ovh.api.pack.xdsl.OvhTaskStatusEnum;
import net.minidev.ovh.api.pack.xdsl.OvhUnpackTerms;
import net.minidev.ovh.api.pack.xdsl.OvhVoIPHardware;
import net.minidev.ovh.api.pack.xdsl.OvhVoIPLineOrder;
import net.minidev.ovh.api.pack.xdsl.OvhVoipLineService;
import net.minidev.ovh.api.pack.xdsl.addressmove.OvhCreation;
import net.minidev.ovh.api.pack.xdsl.addressmove.OvhEligibility;
import net.minidev.ovh.api.pack.xdsl.addressmove.OvhLandline;
import net.minidev.ovh.api.pack.xdsl.migration.OvhMigrationOfferResponse;
import net.minidev.ovh.api.pack.xdsl.migration.OvhOfferOption;
import net.minidev.ovh.api.pack.xdsl.migration.OvhOfferServiceToDelete;
import net.minidev.ovh.api.pack.xdsl.migration.OvhSubServiceToDelete;
import net.minidev.ovh.api.pack.xdsl.promotioncode.OvhCapabilities;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.xdsl.OvhAsyncTask;
import net.minidev.ovh.api.xdsl.eligibility.OvhAddress;
import net.minidev.ovh.api.xdsl.eligibility.OvhProviderEnum;
import net.minidev.ovh.api.xdsl.hubic.OvhHubicDetailsResponse;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/pack/xdsl
 * version:1.0
 */
public class ApiOvhPackxdsl extends ApiOvhBase {
	public ApiOvhPackxdsl(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Tasks scheduled for this pack
	 *
	 * REST: GET /pack/xdsl/{packName}/tasks
	 * @param status [required] Filter the value of status property (=)
	 * @param function [required] Filter the value of function property (=)
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<Long> packName_tasks_GET(String packName, String function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/pack/xdsl/{packName}/tasks";
		StringBuilder sb = path(qPath, packName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/tasks/{id}
	 * @param packName [required] The internal name of your pack
	 * @param id [required] Id of the object
	 */
	public OvhTask packName_tasks_id_GET(String packName, Long id) throws IOException {
		String qPath = "/pack/xdsl/{packName}/tasks/{id}";
		StringBuilder sb = path(qPath, packName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/serviceInfos
	 * @param packName [required] The internal name of your pack
	 */
	public OvhService packName_serviceInfos_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/serviceInfos";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /pack/xdsl/{packName}/serviceInfos
	 * @param body [required] New object properties
	 * @param packName [required] The internal name of your pack
	 */
	public void packName_serviceInfos_PUT(String packName, OvhService body) throws IOException {
		String qPath = "/pack/xdsl/{packName}/serviceInfos";
		StringBuilder sb = path(qPath, packName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Domain services
	 *
	 * REST: GET /pack/xdsl/{packName}/domain/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_domain_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/domain/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Activate a domain service
	 *
	 * REST: POST /pack/xdsl/{packName}/domain/services
	 * @param action [required] Domain action
	 * @param domain [required] Domain name
	 * @param tld [required] TLD of the domain
	 * @param authInfo [required] Needed for transfer from another registrar
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_domain_services_POST(String packName, OvhDomainActionEnum action, String domain, String tld, String authInfo) throws IOException {
		String qPath = "/pack/xdsl/{packName}/domain/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		addBody(o, "domain", domain);
		addBody(o, "tld", tld);
		addBody(o, "authInfo", authInfo);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the available tlds for domain order
	 *
	 * REST: GET /pack/xdsl/{packName}/domain/options/tlds
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_domain_options_tlds_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/domain/options/tlds";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Informations about the services included in the pack
	 *
	 * REST: GET /pack/xdsl/{packName}/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhServiceInformation> packName_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhServiceInformation>> t3 = new TypeReference<ArrayList<OvhServiceInformation>>() {};

	/**
	 * Details associated to a voucher
	 *
	 * REST: GET /pack/xdsl/{packName}/hubic/services/{domain}/details
	 * @param packName [required] The internal name of your pack
	 * @param domain [required]
	 */
	public OvhAsyncTask<OvhHubicDetailsResponse> packName_hubic_services_domain_details_GET(String packName, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hubic/services/{domain}/details";
		StringBuilder sb = path(qPath, packName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<OvhAsyncTask<OvhHubicDetailsResponse>> t4 = new TypeReference<OvhAsyncTask<OvhHubicDetailsResponse>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/hubic/services/{domain}
	 * @param packName [required] The internal name of your pack
	 * @param domain [required]
	 */
	public OvhHubic packName_hubic_services_domain_GET(String packName, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hubic/services/{domain}";
		StringBuilder sb = path(qPath, packName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHubic.class);
	}

	/**
	 * Hubic perso services
	 *
	 * REST: GET /pack/xdsl/{packName}/hubic/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_hubic_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hubic/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Allowed shipping addresses given a context
	 *
	 * REST: GET /pack/xdsl/{packName}/shippingAddresses
	 * @param context [required] Context
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhShippingAddress> packName_shippingAddresses_GET(String packName, OvhShippingAddressContextEnum context) throws IOException {
		String qPath = "/pack/xdsl/{packName}/shippingAddresses";
		StringBuilder sb = path(qPath, packName);
		query(sb, "context", context);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhShippingAddress>> t5 = new TypeReference<ArrayList<OvhShippingAddress>>() {};

	/**
	 * Calculate services to delete with new offer and options
	 *
	 * REST: POST /pack/xdsl/{packName}/migration/servicesToDelete
	 * @param options [required] Options wanted in the new offer
	 * @param offerName [required] Reference of the new offer
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSubServiceToDelete> packName_migration_servicesToDelete_POST(String packName, OvhOfferOption[] options, String offerName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/migration/servicesToDelete";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "options", options);
		addBody(o, "offerName", offerName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhSubServiceToDelete>> t6 = new TypeReference<ArrayList<OvhSubServiceToDelete>>() {};

	/**
	 * Migrate to the selected offer
	 *
	 * REST: POST /pack/xdsl/{packName}/migration/migrate
	 * @param otp [required] Do you have an Optical Termination Point (Point de Terminaison Optique) at home ?
	 * @param engageMonths [required] Number of months of re-engagement
	 * @param nicShipping [required] nicShipping if a shipping is needed
	 * @param otpReference [required] Reference of the Optical Termination Point
	 * @param acceptContracts [required] You explicitly accept the terms of the contract corresponding to your new offer
	 * @param options [required] Options wanted in the new offer
	 * @param buildingReference [required] Building reference for FTTH offers
	 * @param offerName [required] Reference of the new offer
	 * @param floor [required] Floor identifier, "_NA_" if no identifier is available
	 * @param subServicesToDelete [required] List of domains of services to delete if needed
	 * @param mondialRelayId [required] Mondial relay ID if a shipping is needed
	 * @param stair [required] Stair identifier, "_NA_" if no identifier is available
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_migration_migrate_POST(String packName, Boolean otp, Long engageMonths, String nicShipping, String otpReference, Boolean acceptContracts, OvhOfferOption[] options, String buildingReference, String offerName, String floor, OvhOfferServiceToDelete[] subServicesToDelete, Long mondialRelayId, String stair) throws IOException {
		String qPath = "/pack/xdsl/{packName}/migration/migrate";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "otp", otp);
		addBody(o, "engageMonths", engageMonths);
		addBody(o, "nicShipping", nicShipping);
		addBody(o, "otpReference", otpReference);
		addBody(o, "acceptContracts", acceptContracts);
		addBody(o, "options", options);
		addBody(o, "buildingReference", buildingReference);
		addBody(o, "offerName", offerName);
		addBody(o, "floor", floor);
		addBody(o, "subServicesToDelete", subServicesToDelete);
		addBody(o, "mondialRelayId", mondialRelayId);
		addBody(o, "stair", stair);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the possibilities of migration offers available
	 *
	 * REST: POST /pack/xdsl/{packName}/migration/offers
	 * @param packName [required] The internal name of your pack
	 */
	public OvhAsyncTask<OvhMigrationOfferResponse> packName_migration_offers_POST(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/migration/offers";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<OvhAsyncTask<OvhMigrationOfferResponse>> t7 = new TypeReference<OvhAsyncTask<OvhMigrationOfferResponse>>() {};

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /pack/xdsl/{packName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<Long> packName_changeContact_POST(String packName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/pack/xdsl/{packName}/changeContact";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}

	/**
	 * Cancel the ongoing resiliation
	 *
	 * REST: POST /pack/xdsl/{packName}/cancelResiliation
	 * @param packName [required] The internal name of your pack
	 */
	public void packName_cancelResiliation_POST(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/cancelResiliation";
		StringBuilder sb = path(qPath, packName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeAccount/services/{domain}
	 * @param packName [required] The internal name of your pack
	 * @param domain [required]
	 */
	public OvhExchangeAccountService packName_exchangeAccount_services_domain_GET(String packName, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeAccount/services/{domain}";
		StringBuilder sb = path(qPath, packName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhExchangeAccountService.class);
	}

	/**
	 * Exchange 2013 services
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeAccount/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_exchangeAccount_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeAccount/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get informations about the promotion code generation
	 *
	 * REST: GET /pack/xdsl/{packName}/promotionCode/capabilities
	 * @param packName [required] The internal name of your pack
	 */
	public OvhCapabilities packName_promotionCode_capabilities_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/promotionCode/capabilities";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCapabilities.class);
	}

	/**
	 * Creates a task to generate a new promotion code
	 *
	 * REST: POST /pack/xdsl/{packName}/promotionCode/generate
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_promotionCode_generate_POST(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/promotionCode/generate";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get available shipping addresses
	 *
	 * REST: GET /pack/xdsl/{packName}/voipLine/options/shippingAddresses
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhShippingAddress> packName_voipLine_options_shippingAddresses_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/options/shippingAddresses";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}

	/**
	 * Get available hardwares
	 *
	 * REST: GET /pack/xdsl/{packName}/voipLine/options/hardwares
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhVoIPHardware> packName_voipLine_options_hardwares_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/options/hardwares";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhVoIPHardware>> t8 = new TypeReference<ArrayList<OvhVoIPHardware>>() {};

	/**
	 * Create a new shippingId to be used for voipLine service creation
	 *
	 * REST: POST /pack/xdsl/{packName}/voipLine/options/customShippingAddress
	 * @param zipCode [required] Zip code
	 * @param cityName [required] City name
	 * @param firstName [required] First name
	 * @param address [required] Address, including street name
	 * @param lastName [required] Last name
	 * @param packName [required] The internal name of your pack
	 */
	public Long packName_voipLine_options_customShippingAddress_POST(String packName, String zipCode, String cityName, String firstName, String address, String lastName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/options/customShippingAddress";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zipCode", zipCode);
		addBody(o, "cityName", cityName);
		addBody(o, "firstName", firstName);
		addBody(o, "address", address);
		addBody(o, "lastName", lastName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, Long.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/voipLine/services/{domain}
	 * @param packName [required] The internal name of your pack
	 * @param domain [required]
	 */
	public OvhVoipLineService packName_voipLine_services_domain_GET(String packName, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/services/{domain}";
		StringBuilder sb = path(qPath, packName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoipLineService.class);
	}

	/**
	 * VOIP line services
	 *
	 * REST: GET /pack/xdsl/{packName}/voipLine/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_voipLine_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Activate a voip line service
	 *
	 * REST: POST /pack/xdsl/{packName}/voipLine/services
	 * @param shippingId [required] Shipping ID for the order
	 * @param hardwareNames [required] List of names from hardwares call
	 * @param mondialRelayId [required] Mondial relay ID
	 * @param packName [required] The internal name of your pack
	 */
	public OvhVoIPLineOrder packName_voipLine_services_POST(String packName, String shippingId, String[] hardwareNames, String mondialRelayId) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "shippingId", shippingId);
		addBody(o, "hardwareNames", hardwareNames);
		addBody(o, "mondialRelayId", mondialRelayId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVoIPLineOrder.class);
	}

	/**
	 * Sitebuilder start services
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderStart/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_siteBuilderStart_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderStart/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Activate a sitebuilder full service
	 *
	 * REST: POST /pack/xdsl/{packName}/siteBuilderStart/services
	 * @param domain [required] Domain name
	 * @param templateId [required] Template ID
	 * @param subdomain [required] Subdomain
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_siteBuilderStart_services_POST(String packName, String domain, Long templateId, String subdomain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderStart/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "templateId", templateId);
		addBody(o, "subdomain", subdomain);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the available domains
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderStart/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSiteBuilderDomain> packName_siteBuilderStart_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderStart/options/domains";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhSiteBuilderDomain>> t9 = new TypeReference<ArrayList<OvhSiteBuilderDomain>>() {};

	/**
	 * Get the available templates
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderStart/options/templates
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSiteBuilderTemplate> packName_siteBuilderStart_options_templates_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderStart/options/templates";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t10);
	}
	private static TypeReference<ArrayList<OvhSiteBuilderTemplate>> t10 = new TypeReference<ArrayList<OvhSiteBuilderTemplate>>() {};

	/**
	 * Move the access to another address
	 *
	 * REST: POST /pack/xdsl/{packName}/addressMove/move
	 * @param moveOutDate [required] The date when the customer is no longer at the current address. Must be between now and +30 days
	 * @param creation [required] The data to create a new line if lineNumber is not available
	 * @param provider [required] Provider of the new line
	 * @param keepCurrentNumber [required] Whether or not the current number should be kept
	 * @param landline [required] Data identifying the landline at the new address, if available
	 * @param offerCode [required] The offerCode from addressMove/eligibility
	 * @param packName [required] The internal name of your pack
	 */
	public OvhAsyncTask<Long> packName_addressMove_move_POST(String packName, Date moveOutDate, OvhCreation creation, OvhProviderEnum provider, Boolean keepCurrentNumber, OvhLandline landline, String offerCode) throws IOException {
		String qPath = "/pack/xdsl/{packName}/addressMove/move";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "moveOutDate", moveOutDate);
		addBody(o, "creation", creation);
		addBody(o, "provider", provider);
		addBody(o, "keepCurrentNumber", keepCurrentNumber);
		addBody(o, "landline", landline);
		addBody(o, "offerCode", offerCode);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t11);
	}
	private static TypeReference<OvhAsyncTask<Long>> t11 = new TypeReference<OvhAsyncTask<Long>>() {};

	/**
	 * Eligibility to move the access
	 *
	 * REST: POST /pack/xdsl/{packName}/addressMove/eligibility
	 * @param address [required] The address to test, if no lineNumber
	 * @param lineNumber [required] The line number to test, if no address
	 * @param packName [required] The internal name of your pack
	 */
	public OvhAsyncTask<OvhEligibility> packName_addressMove_eligibility_POST(String packName, OvhAddress address, String lineNumber) throws IOException {
		String qPath = "/pack/xdsl/{packName}/addressMove/eligibility";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "address", address);
		addBody(o, "lineNumber", lineNumber);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t12);
	}
	private static TypeReference<OvhAsyncTask<OvhEligibility>> t12 = new TypeReference<OvhAsyncTask<OvhEligibility>>() {};

	/**
	 * Exchange services
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeIndividual/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_exchangeIndividual_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeIndividual/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Activate an exchange service
	 *
	 * REST: POST /pack/xdsl/{packName}/exchangeIndividual/services
	 * @param password [required] Password
	 * @param email [required] Email address
	 * @param packName [required] The internal name of your pack
	 * @deprecated
	 */
	public OvhTask packName_exchangeIndividual_services_POST(String packName, String password, String email) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeIndividual/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "email", email);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if the email address is available for service creation
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeIndividual/options/isEmailAvailable
	 * @param email [required] Email
	 * @param packName [required] The internal name of your pack
	 */
	public Boolean packName_exchangeIndividual_options_isEmailAvailable_GET(String packName, String email) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeIndividual/options/isEmailAvailable";
		StringBuilder sb = path(qPath, packName);
		query(sb, "email", email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Get the available domains
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeIndividual/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_exchangeIndividual_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeIndividual/options/domains";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * VOIP ecofax service
	 *
	 * REST: GET /pack/xdsl/{packName}/voipEcofax/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_voipEcofax_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipEcofax/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Activate a voicefax service
	 *
	 * REST: POST /pack/xdsl/{packName}/voipEcofax/services
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_voipEcofax_services_POST(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipEcofax/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Sitebuilder full services
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderFull/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_siteBuilderFull_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderFull/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Activate a sitebuilder full service
	 *
	 * REST: POST /pack/xdsl/{packName}/siteBuilderFull/services
	 * @param domain [required] Domain name
	 * @param subdomain [required] Subdomain
	 * @param templateId [required] Template ID
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_siteBuilderFull_services_POST(String packName, String domain, String subdomain, Long templateId) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderFull/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "subdomain", subdomain);
		addBody(o, "templateId", templateId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the available domains
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderFull/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSiteBuilderDomain> packName_siteBuilderFull_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderFull/options/domains";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}

	/**
	 * Get the available templates
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderFull/options/templates
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSiteBuilderTemplate> packName_siteBuilderFull_options_templates_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderFull/options/templates";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t10);
	}

	/**
	 * Get resiliation terms
	 *
	 * REST: GET /pack/xdsl/{packName}/resiliationTerms
	 * @param resiliationDate [required] The desired resiliation date
	 * @param packName [required] The internal name of your pack
	 */
	public OvhResiliationTerms packName_resiliationTerms_GET(String packName, Date resiliationDate) throws IOException {
		String qPath = "/pack/xdsl/{packName}/resiliationTerms";
		StringBuilder sb = path(qPath, packName);
		query(sb, "resiliationDate", resiliationDate);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResiliationTerms.class);
	}

	/**
	 * Exchange 2013 organization services
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeOrganization/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_exchangeOrganization_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeOrganization/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get information about the ongoing resiliation
	 *
	 * REST: GET /pack/xdsl/{packName}/resiliationFollowUp
	 * @param packName [required] The internal name of your pack
	 */
	public OvhResiliationFollowUpDetail packName_resiliationFollowUp_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/resiliationFollowUp";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhResiliationFollowUpDetail.class);
	}

	/**
	 * Hosted email services
	 *
	 * REST: GET /pack/xdsl/{packName}/hostedEmail/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_hostedEmail_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hostedEmail/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Activate an hosted email service
	 *
	 * REST: POST /pack/xdsl/{packName}/hostedEmail/services
	 * @param email [required] Email address
	 * @param password [required] Password
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_hostedEmail_services_POST(String packName, String email, String password) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hostedEmail/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the hostedemail available domains
	 *
	 * REST: GET /pack/xdsl/{packName}/hostedEmail/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_hostedEmail_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hostedEmail/options/domains";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Resiliate the pack
	 *
	 * REST: POST /pack/xdsl/{packName}/resiliate
	 * @param resiliationDate [required] Effective date of the resiliation
	 * @param servicesToKeep [required] Ids of service you will keep on resiliation. (you can get it with /pack/xdsl/{packName}/subServices)
	 * @param resiliationSurvey [required] Comment about resiliation reasons
	 * @param packName [required] The internal name of your pack
	 */
	public OvhResiliationFollowUpDetail packName_resiliate_POST(String packName, Date resiliationDate, Double[] servicesToKeep, OvhResiliationSurvey resiliationSurvey) throws IOException {
		String qPath = "/pack/xdsl/{packName}/resiliate";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "resiliationDate", resiliationDate);
		addBody(o, "servicesToKeep", servicesToKeep);
		addBody(o, "resiliationSurvey", resiliationSurvey);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhResiliationFollowUpDetail.class);
	}

	/**
	 * VOIP billing accounts
	 *
	 * REST: GET /pack/xdsl/{packName}/voipBillingAccount/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_voipBillingAccount_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipBillingAccount/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}
	 * @param packName [required] The internal name of your pack
	 */
	public OvhPackAdsl packName_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPackAdsl.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /pack/xdsl/{packName}
	 * @param body [required] New object properties
	 * @param packName [required] The internal name of your pack
	 */
	public void packName_PUT(String packName, OvhPackAdsl body) throws IOException {
		String qPath = "/pack/xdsl/{packName}";
		StringBuilder sb = path(qPath, packName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Check if the resiliation can be cancelled
	 *
	 * REST: GET /pack/xdsl/{packName}/canCancelResiliation
	 * @param packName [required] The internal name of your pack
	 */
	public Boolean packName_canCancelResiliation_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/canCancelResiliation";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Check if the given email address is available for an Email Pro activation
	 *
	 * REST: GET /pack/xdsl/{packName}/emailPro/options/isEmailAvailable
	 * @param email [required] The email address
	 * @param packName [required] The internal name of your pack
	 */
	public Boolean packName_emailPro_options_isEmailAvailable_GET(String packName, String email) throws IOException {
		String qPath = "/pack/xdsl/{packName}/emailPro/options/isEmailAvailable";
		StringBuilder sb = path(qPath, packName);
		query(sb, "email", email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * List the available domains for the Email Pro service
	 *
	 * REST: GET /pack/xdsl/{packName}/emailPro/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_emailPro_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/emailPro/options/domains";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * List the Email Pro services
	 *
	 * REST: GET /pack/xdsl/{packName}/emailPro/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_emailPro_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/emailPro/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Activate an Email Pro service
	 *
	 * REST: POST /pack/xdsl/{packName}/emailPro/services
	 * @param password [required] The password
	 * @param email [required] The email address
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_emailPro_services_POST(String packName, String password, String email) throws IOException {
		String qPath = "/pack/xdsl/{packName}/emailPro/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "email", email);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Check if the email address is available for service creation
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeLite/options/isEmailAvailable
	 * @param email [required] Email
	 * @param packName [required] The internal name of your pack
	 */
	public Boolean packName_exchangeLite_options_isEmailAvailable_GET(String packName, String email) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeLite/options/isEmailAvailable";
		StringBuilder sb = path(qPath, packName);
		query(sb, "email", email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeLite/services/{domain}
	 * @param packName [required] The internal name of your pack
	 * @param domain [required]
	 */
	public OvhExchangeLiteService packName_exchangeLite_services_domain_GET(String packName, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeLite/services/{domain}";
		StringBuilder sb = path(qPath, packName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhExchangeLiteService.class);
	}

	/**
	 * Exchange lite services
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeLite/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_exchangeLite_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeLite/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Activate a exchange lite service
	 *
	 * REST: POST /pack/xdsl/{packName}/exchangeLite/services
	 * @param antispam [required] [default=true] Antispam protection
	 * @param email [required] Email address
	 * @param displayName [required] Display name
	 * @param password [required] Password
	 * @param lastName [required] Last name
	 * @param initials [required] Initials
	 * @param firstName [required] First name
	 * @param packName [required] The internal name of your pack
	 * @deprecated
	 */
	public OvhTask packName_exchangeLite_services_POST(String packName, Boolean antispam, String email, String displayName, String password, String lastName, String initials, String firstName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeLite/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "antispam", antispam);
		addBody(o, "email", email);
		addBody(o, "displayName", displayName);
		addBody(o, "password", password);
		addBody(o, "lastName", lastName);
		addBody(o, "initials", initials);
		addBody(o, "firstName", firstName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List services contained in the pack
	 *
	 * REST: GET /pack/xdsl/{packName}/subServices
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_subServices_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/subServices";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Give the condition to unpack service from pack
	 *
	 * REST: GET /pack/xdsl/{packName}/subServices/{domain}/keepServiceTerms
	 * @param packName [required] The internal name of your pack
	 * @param domain [required]
	 */
	public OvhUnpackTerms packName_subServices_domain_keepServiceTerms_GET(String packName, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/subServices/{domain}/keepServiceTerms";
		StringBuilder sb = path(qPath, packName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUnpackTerms.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/subServices/{domain}
	 * @param packName [required] The internal name of your pack
	 * @param domain [required]
	 */
	public net.minidev.ovh.api.pack.xdsl.OvhService packName_subServices_domain_GET(String packName, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/subServices/{domain}";
		StringBuilder sb = path(qPath, packName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.pack.xdsl.OvhService.class);
	}

	/**
	 * xDSL access services
	 *
	 * REST: GET /pack/xdsl/{packName}/xdslAccess/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_xdslAccess_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/xdslAccess/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * List available services
	 *
	 * REST: GET /pack/xdsl
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/pack/xdsl";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
}
