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
import net.minidev.ovh.api.pack.xdsl.promotioncode.OvhCapabilities;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.xdsl.OvhAsyncTask;
import net.minidev.ovh.api.xdsl.eligibility.OvhAddress;
import net.minidev.ovh.api.xdsl.eligibility.OvhProviderEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/pack/xdsl
 * version:1.0
 */
public class ApiOvhPackxdsl extends ApiOvhBase {
	public ApiOvhPackxdsl(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /pack/xdsl
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/pack/xdsl";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/serviceInfos
	 * @param packName [required] The internal name of your pack
	 */
	public OvhService packName_serviceInfos_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/serviceInfos";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		exec("PUT", qPath, body);
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
		qPath = qPath.replace("{packName}", packName);
		qPath = query(qPath, "email", email);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Activate a exchange lite service
	 *
	 * REST: POST /pack/xdsl/{packName}/exchangeLite/services
	 * @param email [required] Email address
	 * @param initials [required] Initials
	 * @param firstName [required] First name
	 * @param password [required] Password
	 * @param lastName [required] Last name
	 * @param antispam [required] [default=true] Antispam protection
	 * @param displayName [required] Display name
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_exchangeLite_services_POST(String packName, String email, String initials, String firstName, String password, String lastName, Boolean antispam, String displayName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeLite/services";
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "initials", initials);
		addBody(o, "firstName", firstName);
		addBody(o, "password", password);
		addBody(o, "lastName", lastName);
		addBody(o, "antispam", antispam);
		addBody(o, "displayName", displayName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}
	 * @param packName [required] The internal name of your pack
	 */
	public OvhPackAdsl packName_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get information about the ongoing resiliation
	 *
	 * REST: GET /pack/xdsl/{packName}/resiliationFollowUp
	 * @param packName [required] The internal name of your pack
	 */
	public OvhResiliationFollowUpDetail packName_resiliationFollowUp_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/resiliationFollowUp";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResiliationFollowUpDetail.class);
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
		qPath = qPath.replace("{packName}", packName);
		qPath = query(qPath, "context", context);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhShippingAddress>> t2 = new TypeReference<ArrayList<OvhShippingAddress>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/hubic/services/{domain}
	 * @param packName [required] The internal name of your pack
	 * @param domain [required]
	 */
	public OvhHubic packName_hubic_services_domain_GET(String packName, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hubic/services/{domain}";
		qPath = qPath.replace("{packName}", packName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
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
		qPath = qPath.replace("{packName}", packName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, net.minidev.ovh.api.pack.xdsl.OvhService.class);
	}

	/**
	 * List services contained in the pack
	 *
	 * REST: GET /pack/xdsl/{packName}/subServices
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_subServices_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/subServices";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get the available domains
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderFull/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSiteBuilderDomain> packName_siteBuilderFull_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderFull/options/domains";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhSiteBuilderDomain>> t3 = new TypeReference<ArrayList<OvhSiteBuilderDomain>>() {};

	/**
	 * Get the available templates
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderFull/options/templates
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSiteBuilderTemplate> packName_siteBuilderFull_options_templates_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderFull/options/templates";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhSiteBuilderTemplate>> t4 = new TypeReference<ArrayList<OvhSiteBuilderTemplate>>() {};

	/**
	 * Sitebuilder full services
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderFull/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_siteBuilderFull_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderFull/services";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
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
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "subdomain", subdomain);
		addBody(o, "templateId", templateId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
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
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<Long>> t5 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get the available domains
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeIndividual/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_exchangeIndividual_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeIndividual/options/domains";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
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
		qPath = qPath.replace("{packName}", packName);
		qPath = query(qPath, "email", email);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Activate an exchange service
	 *
	 * REST: POST /pack/xdsl/{packName}/exchangeIndividual/services
	 * @param email [required] Email address
	 * @param password [required] Password
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_exchangeIndividual_services_POST(String packName, String email, String password) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeIndividual/services";
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get available shipping addresses
	 *
	 * REST: GET /pack/xdsl/{packName}/voipLine/options/shippingAddresses
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhShippingAddress> packName_voipLine_options_shippingAddresses_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/options/shippingAddresses";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Create a new shippingId to be used for voipLine service creation
	 *
	 * REST: POST /pack/xdsl/{packName}/voipLine/options/customShippingAddress
	 * @param zipCode [required] Zip code
	 * @param firstName [required] First name
	 * @param cityName [required] City name
	 * @param address [required] Address, including street name
	 * @param lastName [required] Last name
	 * @param packName [required] The internal name of your pack
	 */
	public Long packName_voipLine_options_customShippingAddress_POST(String packName, String zipCode, String firstName, String cityName, String address, String lastName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/options/customShippingAddress";
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zipCode", zipCode);
		addBody(o, "firstName", firstName);
		addBody(o, "cityName", cityName);
		addBody(o, "address", address);
		addBody(o, "lastName", lastName);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhVoIPHardware>> t6 = new TypeReference<ArrayList<OvhVoIPHardware>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/voipLine/services/{domain}
	 * @param packName [required] The internal name of your pack
	 * @param domain [required]
	 */
	public OvhVoipLineService packName_voipLine_services_domain_GET(String packName, String domain) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipLine/services/{domain}";
		qPath = qPath.replace("{packName}", packName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
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
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "shippingId", shippingId);
		addBody(o, "hardwareNames", hardwareNames);
		addBody(o, "mondialRelayId", mondialRelayId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhVoIPLineOrder.class);
	}

	/**
	 * Get the available tlds for domain order
	 *
	 * REST: GET /pack/xdsl/{packName}/domain/options/tlds
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_domain_options_tlds_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/domain/options/tlds";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Domain services
	 *
	 * REST: GET /pack/xdsl/{packName}/domain/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_domain_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/domain/services";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Activate a domain service
	 *
	 * REST: POST /pack/xdsl/{packName}/domain/services
	 * @param tld [required] TLD of the domain
	 * @param domain [required] Domain name
	 * @param authInfo [required] Needed for transfer from another registrar
	 * @param action [required] Domain action
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_domain_services_POST(String packName, String tld, String domain, String authInfo, OvhDomainActionEnum action) throws IOException {
		String qPath = "/pack/xdsl/{packName}/domain/services";
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "tld", tld);
		addBody(o, "domain", domain);
		addBody(o, "authInfo", authInfo);
		addBody(o, "action", action);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
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
		qPath = qPath.replace("{packName}", packName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get the hostedemail available domains
	 *
	 * REST: GET /pack/xdsl/{packName}/hostedEmail/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_hostedEmail_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hostedEmail/options/domains";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Hosted email services
	 *
	 * REST: GET /pack/xdsl/{packName}/hostedEmail/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_hostedEmail_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/hostedEmail/services";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
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
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{packName}", packName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/xdsl/{packName}/tasks/{id}
	 * @param packName [required] The internal name of your pack
	 * @param id [required] Id of the object
	 */
	public OvhTask packName_tasks_id_GET(String packName, Long id) throws IOException {
		String qPath = "/pack/xdsl/{packName}/tasks/{id}";
		qPath = qPath.replace("{packName}", packName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Migrate to the selected offer
	 *
	 * REST: POST /pack/xdsl/{packName}/migration/migrate
	 * @param acceptContracts [required] You explicitly accept the terms of the contract corresponding to your new offer
	 * @param subServicesToDelete [required] List of domains of services to delete if needed
	 * @param options [required] Options wanted in the new offer
	 * @param nicShipping [required] nicShipping if a shipping is needed
	 * @param offerName [required] Reference of the new offer
	 * @param mondialRelayId [required] Mondial relay ID if a shipping is needed
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_migration_migrate_POST(String packName, Boolean acceptContracts, OvhOfferServiceToDelete[] subServicesToDelete, OvhOfferOption[] options, String nicShipping, String offerName, Long mondialRelayId) throws IOException {
		String qPath = "/pack/xdsl/{packName}/migration/migrate";
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "acceptContracts", acceptContracts);
		addBody(o, "subServicesToDelete", subServicesToDelete);
		addBody(o, "options", options);
		addBody(o, "nicShipping", nicShipping);
		addBody(o, "offerName", offerName);
		addBody(o, "mondialRelayId", mondialRelayId);
		String resp = exec("POST", qPath, o);
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
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("POST", qPath);
		return convertTo(resp, t7);
	}
	private static TypeReference<OvhAsyncTask<OvhMigrationOfferResponse>> t7 = new TypeReference<OvhAsyncTask<OvhMigrationOfferResponse>>() {};

	/**
	 * VOIP ecofax service
	 *
	 * REST: GET /pack/xdsl/{packName}/voipEcofax/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_voipEcofax_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipEcofax/services";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Activate a voicefax service
	 *
	 * REST: POST /pack/xdsl/{packName}/voipEcofax/services
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_voipEcofax_services_POST(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/voipEcofax/services";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Informations about the services included in the pack
	 *
	 * REST: GET /pack/xdsl/{packName}/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhServiceInformation> packName_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/services";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhServiceInformation>> t8 = new TypeReference<ArrayList<OvhServiceInformation>>() {};

	/**
	 * Exchange 2013 organization services
	 *
	 * REST: GET /pack/xdsl/{packName}/exchangeOrganization/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_exchangeOrganization_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/exchangeOrganization/services";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Check if the resiliation can be cancelled
	 *
	 * REST: GET /pack/xdsl/{packName}/canCancelResiliation
	 * @param packName [required] The internal name of your pack
	 */
	public Boolean packName_canCancelResiliation_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/canCancelResiliation";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Creates a task to generate a new promotion code
	 *
	 * REST: POST /pack/xdsl/{packName}/promotionCode/generate
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_promotionCode_generate_POST(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/promotionCode/generate";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("POST", qPath);
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
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCapabilities.class);
	}

	/**
	 * Eligibility to move the access
	 *
	 * REST: POST /pack/xdsl/{packName}/addressMove/eligibility
	 * @param lineNumber [required] The line number to test, if no address
	 * @param address [required] The address to test, if no lineNumber
	 * @param packName [required] The internal name of your pack
	 */
	public OvhAsyncTask<OvhEligibility> packName_addressMove_eligibility_POST(String packName, String lineNumber, OvhAddress address) throws IOException {
		String qPath = "/pack/xdsl/{packName}/addressMove/eligibility";
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "lineNumber", lineNumber);
		addBody(o, "address", address);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t9);
	}
	private static TypeReference<OvhAsyncTask<OvhEligibility>> t9 = new TypeReference<OvhAsyncTask<OvhEligibility>>() {};

	/**
	 * Move the access to another address
	 *
	 * REST: POST /pack/xdsl/{packName}/addressMove/move
	 * @param provider [required] Provider of the new line
	 * @param keepCurrentNumber [required] Whether or not the current number should be kept
	 * @param moveOutDate [required] The date when the customer is no longer at the current address. Must be between now and +30 days
	 * @param offerCode [required] The offerCode from addressMove/eligibility
	 * @param creation [required] The data to create a new line if lineNumber is not available
	 * @param landline [required] Data identifying the landline at the new address, if available
	 * @param packName [required] The internal name of your pack
	 */
	public OvhAsyncTask<Long> packName_addressMove_move_POST(String packName, OvhProviderEnum provider, Boolean keepCurrentNumber, Date moveOutDate, String offerCode, OvhCreation creation, OvhLandline landline) throws IOException {
		String qPath = "/pack/xdsl/{packName}/addressMove/move";
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "provider", provider);
		addBody(o, "keepCurrentNumber", keepCurrentNumber);
		addBody(o, "moveOutDate", moveOutDate);
		addBody(o, "offerCode", offerCode);
		addBody(o, "creation", creation);
		addBody(o, "landline", landline);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t10);
	}
	private static TypeReference<OvhAsyncTask<Long>> t10 = new TypeReference<OvhAsyncTask<Long>>() {};

	/**
	 * Cancel the ongoing resiliation
	 *
	 * REST: POST /pack/xdsl/{packName}/cancelResiliation
	 * @param packName [required] The internal name of your pack
	 */
	public void packName_cancelResiliation_POST(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/cancelResiliation";
		qPath = qPath.replace("{packName}", packName);
		exec("POST", qPath);
	}

	/**
	 * xDSL access services
	 *
	 * REST: GET /pack/xdsl/{packName}/xdslAccess/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_xdslAccess_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/xdslAccess/services";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get the available domains
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderStart/options/domains
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSiteBuilderDomain> packName_siteBuilderStart_options_domains_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderStart/options/domains";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get the available templates
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderStart/options/templates
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<OvhSiteBuilderTemplate> packName_siteBuilderStart_options_templates_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderStart/options/templates";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Sitebuilder start services
	 *
	 * REST: GET /pack/xdsl/{packName}/siteBuilderStart/services
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<String> packName_siteBuilderStart_services_GET(String packName) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderStart/services";
		qPath = qPath.replace("{packName}", packName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Activate a sitebuilder full service
	 *
	 * REST: POST /pack/xdsl/{packName}/siteBuilderStart/services
	 * @param domain [required] Domain name
	 * @param subdomain [required] Subdomain
	 * @param templateId [required] Template ID
	 * @param packName [required] The internal name of your pack
	 */
	public OvhTask packName_siteBuilderStart_services_POST(String packName, String domain, String subdomain, Long templateId) throws IOException {
		String qPath = "/pack/xdsl/{packName}/siteBuilderStart/services";
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "subdomain", subdomain);
		addBody(o, "templateId", templateId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Resiliate the pack
	 *
	 * REST: POST /pack/xdsl/{packName}/resiliate
	 * @param resiliationSurvey [required] Comment about resiliation reasons
	 * @param servicesToKeep [required] Ids of service you will keep on resiliation. (you can get it with /pack/xdsl/{packName}/subServices)
	 * @param resiliationDate [required] Effective date of the resiliation
	 * @param packName [required] The internal name of your pack
	 */
	public OvhResiliationFollowUpDetail packName_resiliate_POST(String packName, OvhResiliationSurvey resiliationSurvey, Double[] servicesToKeep, Date resiliationDate) throws IOException {
		String qPath = "/pack/xdsl/{packName}/resiliate";
		qPath = qPath.replace("{packName}", packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "resiliationSurvey", resiliationSurvey);
		addBody(o, "servicesToKeep", servicesToKeep);
		addBody(o, "resiliationDate", resiliationDate);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhResiliationFollowUpDetail.class);
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
		qPath = qPath.replace("{packName}", packName);
		qPath = query(qPath, "resiliationDate", resiliationDate);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResiliationTerms.class);
	}
}
