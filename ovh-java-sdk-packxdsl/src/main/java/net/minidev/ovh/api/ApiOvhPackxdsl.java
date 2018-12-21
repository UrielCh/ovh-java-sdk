package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.pack.xdsl.OvhAsyncTask;
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
	 * Get the possibilities of migration offers available
	 *
	 * REST: POST /pack/xdsl/{packName}/migration/offers
	 * @param packName [required] The internal name of your pack
	 */
	public OvhAsyncTask<OvhMigrationOfferResponse> packName_migration_offers_POST(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/migration/offers";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<OvhAsyncTask<OvhMigrationOfferResponse>> t1 = new TypeReference<OvhAsyncTask<OvhMigrationOfferResponse>>() {};

	/**
	 * Calculate services to delete with new offer and options
	 *
	 * REST: POST /pack/xdsl/{packName}/migration/servicesToDelete
	 * @param offerName [required] Reference of the new offer
	 * @param options [required] Options wanted in the new offer
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSubServiceToDelete> packName_migration_servicesToDelete_POST(String packName, String offerName, OvhOfferOption[] options) throws IOException {
		String qPath = "/pack/xdsl/{packName}/migration/servicesToDelete";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "offerName", offerName);
		addBody(o, "options", options);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhSubServiceToDelete>> t2 = new TypeReference<ArrayList<OvhSubServiceToDelete>>() {};

	/**
	 * Migrate to the selected offer
	 *
	 * REST: POST /pack/xdsl/{packName}/migration/migrate
	 * @param floor [required] Floor identifier, "_NA_" if no identifier is available
	 * @param acceptContracts [required] You explicitly accept the terms of the contract corresponding to your new offer
	 * @param otpReference [required] Reference of the Optical Termination Point
	 * @param options [required] Options wanted in the new offer
	 * @param otp [required] Do you have an Optical Termination Point (Point de Terminaison Optique) at home ?
	 * @param nicShipping [required] nicShipping if a shipping is needed
	 * @param offerName [required] Reference of the new offer
	 * @param stair [required] Stair identifier, "_NA_" if no identifier is available
	 * @param engageMonths [required] Number of months of re-engagement
	 * @param buildingReference [required] Building reference for FTTH offers
	 * @param subServicesToDelete [required] List of domains of services to delete if needed
	 * @param mondialRelayId [required] Mondial relay ID if a shipping is needed
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_migration_migrate_POST(String packName, String floor, Boolean acceptContracts, String otpReference, OvhOfferOption[] options, Boolean otp, String nicShipping, String offerName, String stair, Long engageMonths, String buildingReference, OvhOfferServiceToDelete[] subServicesToDelete, Long mondialRelayId) throws IOException {
		String qPath = "/pack/xdsl/{packName}/migration/migrate";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "floor", floor);
		addBody(o, "acceptContracts", acceptContracts);
		addBody(o, "otpReference", otpReference);
		addBody(o, "options", options);
		addBody(o, "otp", otp);
		addBody(o, "nicShipping", nicShipping);
		addBody(o, "offerName", offerName);
		addBody(o, "stair", stair);
		addBody(o, "engageMonths", engageMonths);
		addBody(o, "buildingReference", buildingReference);
		addBody(o, "subServicesToDelete", subServicesToDelete);
		addBody(o, "mondialRelayId", mondialRelayId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

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
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhSiteBuilderTemplate>> t3 = new TypeReference<ArrayList<OvhSiteBuilderTemplate>>() {};

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
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhSiteBuilderDomain>> t4 = new TypeReference<ArrayList<OvhSiteBuilderDomain>>() {};

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
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<String>> t5 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Activate a sitebuilder full service
	 *
	 * REST: POST /pack/xdsl/{packName}/siteBuilderStart/services
	 * @param templateId [required] Template ID
	 * @param subdomain [required] Subdomain
	 * @param domain [required] Domain name
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_siteBuilderStart_services_POST(String packName, Long templateId, String subdomain, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderStart/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "templateId", templateId);
		addBody(o, "subdomain", subdomain);
		addBody(o, "domain", domain);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
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
		return convertTo(resp, t5);
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
		return convertTo(resp, t5);
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
		return convertTo(resp, t6);
	}
	private static TypeReference<OvhAsyncTask<OvhEligibility>> t6 = new TypeReference<OvhAsyncTask<OvhEligibility>>() {};

	/**
	 * Move the access to another address
	 *
	 * REST: POST /pack/xdsl/{packName}/addressMove/move
	 * @param keepCurrentNumber [required] Whether or not the current number should be kept
	 * @param creation [required] The data to create a new line if lineNumber is not available
	 * @param provider [required] Provider of the new line
	 * @param moveOutDate [required] The date when the customer is no longer at the current address. Must be between now and +30 days
	 * @param landline [required] Data identifying the landline at the new address, if available
	 * @param offerCode [required] The offerCode from addressMove/eligibility
	 * @param packName [required] The internal name of your pack
	 */
	public OvhAsyncTask<Long> packName_addressMove_move_POST(String packName, Boolean keepCurrentNumber, OvhCreation creation, OvhProviderEnum provider, Date moveOutDate, OvhLandline landline, String offerCode) throws IOException {
		String qPath = "/pack/xdsl/{packName}/addressMove/move";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "keepCurrentNumber", keepCurrentNumber);
		addBody(o, "creation", creation);
		addBody(o, "provider", provider);
		addBody(o, "moveOutDate", moveOutDate);
		addBody(o, "landline", landline);
		addBody(o, "offerCode", offerCode);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t7);
	}
	private static TypeReference<OvhAsyncTask<Long>> t7 = new TypeReference<OvhAsyncTask<Long>>() {};

	/**
	 * Resiliate the pack
	 *
	 * REST: POST /pack/xdsl/{packName}/resiliate
	 * @param resiliationSurvey [required] Comment about resiliation reasons
	 * @param resiliationDate [required] Effective date of the resiliation
	 * @param servicesToKeep [required] Ids of service you will keep on resiliation. (you can get it with /pack/xdsl/{packName}/subServices)
	 * @param packName [required] The internal name of your pack
	 */
	public OvhResiliationFollowUpDetail packName_resiliate_POST(String packName, OvhResiliationSurvey resiliationSurvey, Date resiliationDate, Double[] servicesToKeep) throws IOException {
		String qPath = "/pack/xdsl/{packName}/resiliate";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "resiliationSurvey", resiliationSurvey);
		addBody(o, "resiliationDate", resiliationDate);
		addBody(o, "servicesToKeep", servicesToKeep);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhResiliationFollowUpDetail.class);
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
	 * Get the available domains
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeIndividual/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_exchangeIndividual_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeIndividual/options/domains";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
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
	 * Exchange services
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeIndividual/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_exchangeIndividual_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeIndividual/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
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
	 * Tasks scheduled for this pack
	 *
	 * REST: GET /pack/xdsl/{packName}/tasks
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<Long> packName_tasks_GET(String packName, String function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/pack/xdsl/{packName}/tasks";
		StringBuilder sb = path(qPath, packName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<Long>> t8 = new TypeReference<ArrayList<Long>>() {};

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
	 * Hubic perso services
	 *
	 * REST: GET /pack/xdsl/{packName}/hubic/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_hubic_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hubic/services";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}

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
		return convertTo(resp, t9);
	}
	private static TypeReference<OvhAsyncTask<OvhHubicDetailsResponse>> t9 = new TypeReference<OvhAsyncTask<OvhHubicDetailsResponse>>() {};

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
		return convertTo(resp, t5);
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
		return convertTo(resp, t5);
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
		return convertTo(resp, t5);
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
		return convertTo(resp, t8);
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
		return convertTo(resp, t5);
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
	 * Get available shipping addresses
	 *
	 * REST: GET /pack/xdsl/{packName}/voipLine/options/shippingAddresses
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhShippingAddress> packName_voipLine_options_shippingAddresses_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/options/shippingAddresses";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t10);
	}
	private static TypeReference<ArrayList<OvhShippingAddress>> t10 = new TypeReference<ArrayList<OvhShippingAddress>>() {};

	/**
	 * Create a new shippingId to be used for voipLine service creation
	 *
	 * REST: POST /pack/xdsl/{packName}/voipLine/options/customShippingAddress
	 * @param cityName [required] City name
	 * @param lastName [required] Last name
	 * @param address [required] Address, including street name
	 * @param zipCode [required] Zip code
	 * @param firstName [required] First name
	 * @param packName [required] The internal name of your pack
	 */
	public Long packName_voipLine_options_customShippingAddress_POST(String packName, String cityName, String lastName, String address, String zipCode, String firstName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/options/customShippingAddress";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cityName", cityName);
		addBody(o, "lastName", lastName);
		addBody(o, "address", address);
		addBody(o, "zipCode", zipCode);
		addBody(o, "firstName", firstName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, Long.class);
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
		return convertTo(resp, t11);
	}
	private static TypeReference<ArrayList<OvhVoIPHardware>> t11 = new TypeReference<ArrayList<OvhVoIPHardware>>() {};

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
		return convertTo(resp, t5);
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
		return convertTo(resp, t5);
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
		return convertTo(resp, t3);
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
		return convertTo(resp, t4);
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
		return convertTo(resp, t5);
	}

	/**
	 * Activate a sitebuilder full service
	 *
	 * REST: POST /pack/xdsl/{packName}/siteBuilderFull/services
	 * @param templateId [required] Template ID
	 * @param subdomain [required] Subdomain
	 * @param domain [required] Domain name
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_siteBuilderFull_services_POST(String packName, Long templateId, String subdomain, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderFull/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "templateId", templateId);
		addBody(o, "subdomain", subdomain);
		addBody(o, "domain", domain);
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
		return convertTo(resp, t5);
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
		return convertTo(resp, t5);
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
	 * Get the available tlds for domain order
	 *
	 * REST: GET /pack/xdsl/{packName}/domain/options/tlds
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_domain_options_tlds_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/domain/options/tlds";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
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
		return convertTo(resp, t5);
	}

	/**
	 * Activate a domain service
	 *
	 * REST: POST /pack/xdsl/{packName}/domain/services
	 * @param authInfo [required] Needed for transfer from another registrar
	 * @param tld [required] TLD of the domain
	 * @param action [required] Domain action
	 * @param domain [required] Domain name
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_domain_services_POST(String packName, String authInfo, String tld, OvhDomainActionEnum action, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/domain/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "authInfo", authInfo);
		addBody(o, "tld", tld);
		addBody(o, "action", action);
		addBody(o, "domain", domain);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
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
		return convertTo(resp, t10);
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
		return convertTo(resp, t12);
	}
	private static TypeReference<ArrayList<OvhServiceInformation>> t12 = new TypeReference<ArrayList<OvhServiceInformation>>() {};

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
	 * List services contained in the pack
	 *
	 * REST: GET /pack/xdsl/{packName}/subServices
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_subServices_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/subServices";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
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
		return convertTo(resp, t5);
	}

	/**
	 * Activate a exchange lite service
	 *
	 * REST: POST /pack/xdsl/{packName}/exchangeLite/services
	 * @param antispam [required] [default=true] Antispam protection
	 * @param firstName [required] First name
	 * @param displayName [required] Display name
	 * @param password [required] Password
	 * @param email [required] Email address
	 * @param lastName [required] Last name
	 * @param initials [required] Initials
	 * @param packName [required] The internal name of your pack
	 * @deprecated
	 */
	public OvhTask packName_exchangeLite_services_POST(String packName, Boolean antispam, String firstName, String displayName, String password, String email, String lastName, String initials) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeLite/services";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "antispam", antispam);
		addBody(o, "firstName", firstName);
		addBody(o, "displayName", displayName);
		addBody(o, "password", password);
		addBody(o, "email", email);
		addBody(o, "lastName", lastName);
		addBody(o, "initials", initials);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
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
	 * List available services
	 *
	 * REST: GET /pack/xdsl
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/pack/xdsl";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
}
