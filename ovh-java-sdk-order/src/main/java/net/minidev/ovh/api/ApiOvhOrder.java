package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.cdn.webstorage.OvhOrderStorageEnum;
import net.minidev.ovh.api.cdn.webstorage.OvhOrderTrafficEnum;
import net.minidev.ovh.api.cdnanycast.OvhOrderCacheRuleEnum;
import net.minidev.ovh.api.cdnanycast.OvhOrderQuotaEnum;
import net.minidev.ovh.api.dedicated.OvhNasHAOfferEnum;
import net.minidev.ovh.api.dedicated.OvhNasHAZoneEnum;
import net.minidev.ovh.api.dedicated.server.OvhBackupStorageCapacityEnum;
import net.minidev.ovh.api.dedicated.server.OvhBandwidthOrderEnum;
import net.minidev.ovh.api.dedicated.server.OvhBandwidthOrderTypeEnum;
import net.minidev.ovh.api.dedicated.server.OvhFirewallModelEnum;
import net.minidev.ovh.api.dedicated.server.OvhIpBlockSizeEnum;
import net.minidev.ovh.api.dedicated.server.OvhIpCountryEnum;
import net.minidev.ovh.api.dedicated.server.OvhIpStaticCountryEnum;
import net.minidev.ovh.api.dedicated.server.OvhIpTypeOrderableEnum;
import net.minidev.ovh.api.dedicated.server.OvhOrderableSysFeatureEnum;
import net.minidev.ovh.api.dedicated.server.OvhUsbKeyCapacityEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhAdditionalBandwidthEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhIpCountriesEnum;
import net.minidev.ovh.api.dedicatedcloud.OvhOrderableIpBlockRangeEnum;
import net.minidev.ovh.api.dedicatedcloud.ressources.OvhUpgradeRessourceTypeEnum;
import net.minidev.ovh.api.dedicatedcloud.ressources.OvhUpgradeTypeEnum;
import net.minidev.ovh.api.email.domain.OvhOfferEnum;
import net.minidev.ovh.api.email.exchange.OvhAccountQuotaEnum;
import net.minidev.ovh.api.email.exchange.OvhOutlookVersionEnum;
import net.minidev.ovh.api.email.exchange.OvhOvhLicenceEnum;
import net.minidev.ovh.api.freefax.OvhQuantityEnum;
import net.minidev.ovh.api.hosting.privatedatabase.OvhAvailableRamSizeEnum;
import net.minidev.ovh.api.hosting.privatedatabase.OvhDatacenterEnum;
import net.minidev.ovh.api.hosting.privatedatabase.OvhOrderableVersionEnum;
import net.minidev.ovh.api.hosting.web.OvhBandwidthOfferEnum;
import net.minidev.ovh.api.hosting.web.OvhCdnOfferEnum;
import net.minidev.ovh.api.hosting.web.OvhDnsZoneEnum;
import net.minidev.ovh.api.hosting.web.database.OvhSqlPersoOfferEnum;
import net.minidev.ovh.api.hosting.web.module.OvhOrderableNameEnum;
import net.minidev.ovh.api.hosting.web.order.OvhMxPlanEnum;
import net.minidev.ovh.api.ip.OvhLoadBalancingZoneEnum;
import net.minidev.ovh.api.license.OvhCloudLinuxVersionEnum;
import net.minidev.ovh.api.license.OvhLicenseTypeEnum;
import net.minidev.ovh.api.license.OvhOrderableAntispamEnum;
import net.minidev.ovh.api.license.OvhOrderableAntivirusEnum;
import net.minidev.ovh.api.license.OvhOrderableCpanelVersionEnum;
import net.minidev.ovh.api.license.OvhOrderableDirectAdminVersionEnum;
import net.minidev.ovh.api.license.OvhOrderablePleskDomainNumberEnum;
import net.minidev.ovh.api.license.OvhOrderablePleskLanguagePackEnum;
import net.minidev.ovh.api.license.OvhOrderableVirtuozzoContainerNumberEnum;
import net.minidev.ovh.api.license.OvhOrderableVirtuozzoVersionEnum;
import net.minidev.ovh.api.license.OvhPleskApplicationSetEnum;
import net.minidev.ovh.api.license.OvhPleskVersionEnum;
import net.minidev.ovh.api.license.OvhSqlServerVersionEnum;
import net.minidev.ovh.api.license.OvhWindowsOsVersionEnum;
import net.minidev.ovh.api.license.OvhWindowsSqlVersionEnum;
import net.minidev.ovh.api.license.OvhWorkLightVersionEnum;
import net.minidev.ovh.api.nichandle.OvhLegalFormEnum;
import net.minidev.ovh.api.nichandle.OvhOvhSubsidiaryEnum;
import net.minidev.ovh.api.order.OvhOrder;
import net.minidev.ovh.api.order.cart.OvhCart;
import net.minidev.ovh.api.order.cart.OvhConfigurationItem;
import net.minidev.ovh.api.order.cart.OvhConfigurationRequirements;
import net.minidev.ovh.api.order.cart.OvhDomainPacksProductInformation;
import net.minidev.ovh.api.order.cart.OvhGenericOptionDefinition;
import net.minidev.ovh.api.order.cart.OvhGenericProductDefinition;
import net.minidev.ovh.api.order.cart.OvhItem;
import net.minidev.ovh.api.order.cart.OvhProductInformation;
import net.minidev.ovh.api.order.cart.OvhWebHostingProductInformation;
import net.minidev.ovh.api.order.catalog.OvhCatalog;
import net.minidev.ovh.api.order.upgrade.OvhOrderUpgradeOperationAndOrder;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.telephony.OvhLineTypeEnum;
import net.minidev.ovh.api.telephony.OvhNumberCountryEnum;
import net.minidev.ovh.api.telephony.OvhNumberOffer;
import net.minidev.ovh.api.telephony.OvhNumberPoolEnum;
import net.minidev.ovh.api.telephony.OvhNumberSpecialTypologyEnum;
import net.minidev.ovh.api.telephony.OvhSecurityDepositAmountsEnum;
import net.minidev.ovh.api.telephony.portability.OvhCountriesAvailable;
import net.minidev.ovh.api.telephony.portability.OvhNumberType;
import net.minidev.ovh.api.telephony.portability.OvhOfferType;
import net.minidev.ovh.api.telephony.portability.OvhSocialReason;
import net.minidev.ovh.api.veeamcloudconnect.OvhOffer;
import net.minidev.ovh.api.vps.OvhPleskLicenseDomainNumberEnum;
import net.minidev.ovh.api.vps.additionaldisk.OvhAdditionalDiskSizeEnum;
import net.minidev.ovh.api.vps.ip.OvhGeolocationEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/order
 * version:1.0
 */
public class ApiOvhOrder extends ApiOvhBase {
	public ApiOvhOrder(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get allowed durations for 'quota' option
	 * 
	 * REST: GET /order/cdn/dedicated/{serviceName}/quota
	 * @param quota [required] quota number in TB that will be added to the CDN service
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<String> cdn_dedicated_serviceName_quota_GET(String serviceName, OvhOrderQuotaEnum quota) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}/quota";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "quota", quota);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/cdn/dedicated/{serviceName}/quota/{duration}
	 * @param quota [required] quota number in TB that will be added to the CDN service
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_dedicated_serviceName_quota_duration_GET(String serviceName, String duration, OvhOrderQuotaEnum quota) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}/quota/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "quota", quota);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/cdn/dedicated/{serviceName}/quota/{duration}
	 * @param quota [required] quota number in TB that will be added to the CDN service
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_dedicated_serviceName_quota_duration_POST(String serviceName, String duration, OvhOrderQuotaEnum quota) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}/quota/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quota", quota);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/cdn/dedicated/{serviceName}
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<String> cdn_dedicated_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'cacheRule' option
	 * 
	 * REST: GET /order/cdn/dedicated/{serviceName}/cacheRule
	 * @param cacheRule [required] cache rule upgrade option to 100 or 1000
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<String> cdn_dedicated_serviceName_cacheRule_GET(String serviceName, OvhOrderCacheRuleEnum cacheRule) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}/cacheRule";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "cacheRule", cacheRule);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/cdn/dedicated/{serviceName}/cacheRule/{duration}
	 * @param cacheRule [required] cache rule upgrade option to 100 or 1000
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_dedicated_serviceName_cacheRule_duration_GET(String serviceName, String duration, OvhOrderCacheRuleEnum cacheRule) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}/cacheRule/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "cacheRule", cacheRule);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/cdn/dedicated/{serviceName}/cacheRule/{duration}
	 * @param cacheRule [required] cache rule upgrade option to 100 or 1000
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_dedicated_serviceName_cacheRule_duration_POST(String serviceName, String duration, OvhOrderCacheRuleEnum cacheRule) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}/cacheRule/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cacheRule", cacheRule);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'backend' option
	 * 
	 * REST: GET /order/cdn/dedicated/{serviceName}/backend
	 * @param backend [required] Backend number that will be ordered
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<String> cdn_dedicated_serviceName_backend_GET(String serviceName, Long backend) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}/backend";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "backend", backend);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/cdn/dedicated/{serviceName}/backend/{duration}
	 * @param backend [required] Backend number that will be ordered
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_dedicated_serviceName_backend_duration_GET(String serviceName, String duration, Long backend) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}/backend/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "backend", backend);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/cdn/dedicated/{serviceName}/backend/{duration}
	 * @param backend [required] Backend number that will be ordered
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_dedicated_serviceName_backend_duration_POST(String serviceName, String duration, Long backend) throws IOException {
		String qPath = "/order/cdn/dedicated/{serviceName}/backend/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backend", backend);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cdn/dedicated
	 */
	public ArrayList<String> cdn_dedicated_GET() throws IOException {
		String qPath = "/order/cdn/dedicated";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/cdn/dedicated/new
	 */
	public ArrayList<String> cdn_dedicated_new_GET() throws IOException {
		String qPath = "/order/cdn/dedicated/new";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/cdn/dedicated/new/{duration}
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_dedicated_new_duration_GET(String duration) throws IOException {
		String qPath = "/order/cdn/dedicated/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/cdn/dedicated/new/{duration}
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_dedicated_new_duration_POST(String duration) throws IOException {
		String qPath = "/order/cdn/dedicated/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/cdn/webstorage/{serviceName}/traffic
	 * @param bandwidth [required] Traffic in TB that will be added to the cdn.webstorage service
	 * @param serviceName [required] The internal name of your CDN Static offer
	 */
	public OvhOrder cdn_webstorage_serviceName_traffic_GET(String serviceName, OvhOrderTrafficEnum bandwidth) throws IOException {
		String qPath = "/order/cdn/webstorage/{serviceName}/traffic";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "bandwidth", bandwidth);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/cdn/webstorage/{serviceName}/traffic
	 * @param bandwidth [required] Traffic in TB that will be added to the cdn.webstorage service
	 * @param serviceName [required] The internal name of your CDN Static offer
	 */
	public OvhOrder cdn_webstorage_serviceName_traffic_POST(String serviceName, OvhOrderTrafficEnum bandwidth) throws IOException {
		String qPath = "/order/cdn/webstorage/{serviceName}/traffic";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "bandwidth", bandwidth);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/cdn/webstorage/{serviceName}
	 * @param serviceName [required] The internal name of your CDN Static offer
	 */
	public ArrayList<String> cdn_webstorage_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cdn/webstorage/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'storage' option
	 * 
	 * REST: GET /order/cdn/webstorage/{serviceName}/storage
	 * @param storage [required] Storage option that will be ordered
	 * @param serviceName [required] The internal name of your CDN Static offer
	 */
	public ArrayList<String> cdn_webstorage_serviceName_storage_GET(String serviceName, OvhOrderStorageEnum storage) throws IOException {
		String qPath = "/order/cdn/webstorage/{serviceName}/storage";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "storage", storage);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/cdn/webstorage/{serviceName}/storage/{duration}
	 * @param storage [required] Storage option that will be ordered
	 * @param serviceName [required] The internal name of your CDN Static offer
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_webstorage_serviceName_storage_duration_GET(String serviceName, String duration, OvhOrderStorageEnum storage) throws IOException {
		String qPath = "/order/cdn/webstorage/{serviceName}/storage/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "storage", storage);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/cdn/webstorage/{serviceName}/storage/{duration}
	 * @param storage [required] Storage option that will be ordered
	 * @param serviceName [required] The internal name of your CDN Static offer
	 * @param duration [required] Duration
	 */
	public OvhOrder cdn_webstorage_serviceName_storage_duration_POST(String serviceName, String duration, OvhOrderStorageEnum storage) throws IOException {
		String qPath = "/order/cdn/webstorage/{serviceName}/storage/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "storage", storage);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cdn/webstorage
	 */
	public ArrayList<String> cdn_webstorage_GET() throws IOException {
		String qPath = "/order/cdn/webstorage";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/sms/{serviceName}
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public ArrayList<String> sms_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/sms/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/sms/{serviceName}/credits
	 * @param quantity [required] Sms credit quantity
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public OvhOrder sms_serviceName_credits_GET(String serviceName, Long quantity) throws IOException {
		String qPath = "/order/sms/{serviceName}/credits";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/sms/{serviceName}/credits
	 * @param quantity [required] Sms credit quantity
	 * @param serviceName [required] The internal name of your SMS offer
	 */
	public OvhOrder sms_serviceName_credits_POST(String serviceName, Long quantity) throws IOException {
		String qPath = "/order/sms/{serviceName}/credits";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/sms
	 */
	public ArrayList<String> sms_GET() throws IOException {
		String qPath = "/order/sms";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/sms/new
	 * @param quantity [required] Sms credit quantity
	 */
	public OvhOrder sms_new_GET(Long quantity) throws IOException {
		String qPath = "/order/sms/new";
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/sms/new
	 * @param quantity [required] Sms credit quantity
	 */
	public OvhOrder sms_new_POST(Long quantity) throws IOException {
		String qPath = "/order/sms/new";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Retrieve list of catalog name
	 * 
	 * REST: GET /order/catalog/formatted
	 */
	public ArrayList<String> catalog_formatted_GET() throws IOException {
		String qPath = "/order/catalog/formatted";
		String resp = execN("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Retrieve information of catalog
	 * 
	 * REST: GET /order/catalog/formatted/{catalogName}
	 * @param catalogName [required] Catalog name you want to consult.
	 * @param ovhSubsidiary [required] Subsidiary of the country you want to consult catalog
	 */
	public OvhCatalog catalog_formatted_catalogName_GET(String catalogName, OvhOvhSubsidiaryEnum ovhSubsidiary) throws IOException {
		String qPath = "/order/catalog/formatted/{catalogName}";
		qPath = qPath.replace("{catalogName}", catalogName);
		qPath = query(qPath, "ovhSubsidiary", ovhSubsidiary);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhCatalog.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/telephony
	 */
	public ArrayList<String> telephony_GET() throws IOException {
		String qPath = "/order/telephony";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/telephony/{billingAccount}
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> telephony_billingAccount_GET(String billingAccount) throws IOException {
		String qPath = "/order/telephony/{billingAccount}";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/{billingAccount}/securityDeposit
	 * @param amount [required] The amount, in euros, to credit to the current security deposit
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_securityDeposit_GET(String billingAccount, OvhSecurityDepositAmountsEnum amount) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/securityDeposit";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		qPath = query(qPath, "amount", amount);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/{billingAccount}/securityDeposit
	 * @param amount [required] The amount, in euros, to credit to the current security deposit
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_securityDeposit_POST(String billingAccount, OvhSecurityDepositAmountsEnum amount) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/securityDeposit";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "amount", amount);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/{billingAccount}/numberSpecial
	 * @param firstname [required] Contact firstname
	 * @param typology [required] Special range typology
	 * @param ape [required] Company ape
	 * @param range [required] Special range
	 * @param email [required]
	 * @param city [required] Contact city
	 * @param streetName [required] Street name
	 * @param pool [required] Number of alias in case of pool
	 * @param specificNumber [required] Preselected standard number
	 * @param siret [required] Companu siret
	 * @param displayUniversalDirectory [required] Publish contact informations on universal directories
	 * @param country [required] Number country
	 * @param organisation [required] Contact organisation
	 * @param socialNomination [required] Company social nomination
	 * @param name [required] Contact name
	 * @param phone [required] Contact phone
	 * @param retractation [required] Retractation rights if set
	 * @param zip [required] Contact zip
	 * @param streetNumber [required] Street number
	 * @param legalform [required] Legal form
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_numberSpecial_GET(String billingAccount, String ape, String city, OvhNumberCountryEnum country, Boolean displayUniversalDirectory, String email, String firstname, OvhLegalFormEnum legalform, String name, String organisation, String phone, OvhNumberPoolEnum pool, String range, Boolean retractation, String siret, String socialNomination, String specificNumber, String streetName, String streetNumber, OvhNumberSpecialTypologyEnum typology, String zip) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/numberSpecial";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		qPath = query(qPath, "ape", ape);
		qPath = query(qPath, "city", city);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "displayUniversalDirectory", displayUniversalDirectory);
		qPath = query(qPath, "email", email);
		qPath = query(qPath, "firstname", firstname);
		qPath = query(qPath, "legalform", legalform);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "organisation", organisation);
		qPath = query(qPath, "phone", phone);
		qPath = query(qPath, "pool", pool);
		qPath = query(qPath, "range", range);
		qPath = query(qPath, "retractation", retractation);
		qPath = query(qPath, "siret", siret);
		qPath = query(qPath, "socialNomination", socialNomination);
		qPath = query(qPath, "specificNumber", specificNumber);
		qPath = query(qPath, "streetName", streetName);
		qPath = query(qPath, "streetNumber", streetNumber);
		qPath = query(qPath, "typology", typology);
		qPath = query(qPath, "zip", zip);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/{billingAccount}/numberSpecial
	 * @param firstname [required] Contact firstname
	 * @param typology [required] Special range typology
	 * @param ape [required] Company ape
	 * @param range [required] Special range
	 * @param email [required]
	 * @param city [required] Contact city
	 * @param streetName [required] Street name
	 * @param pool [required] Number of alias in case of pool
	 * @param specificNumber [required] Preselected standard number
	 * @param siret [required] Companu siret
	 * @param displayUniversalDirectory [required] Publish contact informations on universal directories
	 * @param country [required] Number country
	 * @param organisation [required] Contact organisation
	 * @param socialNomination [required] Company social nomination
	 * @param name [required] Contact name
	 * @param phone [required] Contact phone
	 * @param retractation [required] Retractation rights if set
	 * @param zip [required] Contact zip
	 * @param streetNumber [required] Street number
	 * @param legalform [required] Legal form
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_numberSpecial_POST(String billingAccount, String firstname, OvhNumberSpecialTypologyEnum typology, String ape, String range, String email, String city, String streetName, OvhNumberPoolEnum pool, String specificNumber, String siret, Boolean displayUniversalDirectory, OvhNumberCountryEnum country, String organisation, String socialNomination, String name, String phone, Boolean retractation, String zip, String streetNumber, OvhLegalFormEnum legalform) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/numberSpecial";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "firstname", firstname);
		addBody(o, "typology", typology);
		addBody(o, "ape", ape);
		addBody(o, "range", range);
		addBody(o, "email", email);
		addBody(o, "city", city);
		addBody(o, "streetName", streetName);
		addBody(o, "pool", pool);
		addBody(o, "specificNumber", specificNumber);
		addBody(o, "siret", siret);
		addBody(o, "displayUniversalDirectory", displayUniversalDirectory);
		addBody(o, "country", country);
		addBody(o, "organisation", organisation);
		addBody(o, "socialNomination", socialNomination);
		addBody(o, "name", name);
		addBody(o, "phone", phone);
		addBody(o, "retractation", retractation);
		addBody(o, "zip", zip);
		addBody(o, "streetNumber", streetNumber);
		addBody(o, "legalform", legalform);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/{billingAccount}/accessories
	 * @param retractation [required] Retractation rights if set
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param accessories [required] Accessories to order
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_accessories_GET(String billingAccount, String[] accessories, String mondialRelayId, Boolean retractation, Long shippingContactId) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/accessories";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		qPath = query(qPath, "accessories", accessories);
		qPath = query(qPath, "mondialRelayId", mondialRelayId);
		qPath = query(qPath, "retractation", retractation);
		qPath = query(qPath, "shippingContactId", shippingContactId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/{billingAccount}/accessories
	 * @param retractation [required] Retractation rights if set
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param accessories [required] Accessories to order
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_accessories_POST(String billingAccount, Boolean retractation, Long shippingContactId, String mondialRelayId, String[] accessories) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/accessories";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "retractation", retractation);
		addBody(o, "shippingContactId", shippingContactId);
		addBody(o, "mondialRelayId", mondialRelayId);
		addBody(o, "accessories", accessories);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/{billingAccount}/portability
	 * @param socialReason [required] Your social reason
	 * @param rio [required] RIO of the number for individual offer
	 * @param offer [required] The offer : individual or company
	 * @param floor [required] Address floor
	 * @param contactNumber [required] Your contact phone number
	 * @param stair [required] Address stair
	 * @param streetNumberExtra [required] Address street number extra : bis,ter,...
	 * @param listNumbers [required] Extra numbers to be ported
	 * @param city [required] Address city
	 * @param streetName [required] Address street name
	 * @param lineToRedirectAliasTo [required] Redirect ported numbers to the specific line
	 * @param siret [required] If you port under your society, the SIRET number
	 * @param displayUniversalDirectory [required] Publish informations on directory ? (Yellow Pages, 118XXX, ...)
	 * @param country [required] Country of number
	 * @param callNumber [required] The number you want to port
	 * @param firstName [required] Your firstname
	 * @param contactName [required] Your contact name
	 * @param streetType [required] Address street type
	 * @param name [required] Your name
	 * @param zip [required] Address zip code
	 * @param desireDate [required] The date you want for portability execution
	 * @param groupNumber [required] Secondary designation number
	 * @param comment [required] Comment
	 * @param streetNumber [required] Address street number
	 * @param door [required] Address door
	 * @param building [required] Address building
	 * @param type [required] The type of number : landline or special
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_portability_GET(String billingAccount, String building, String callNumber, String city, String comment, String contactName, String contactNumber, OvhCountriesAvailable country, Date desireDate, Boolean displayUniversalDirectory, String door, String firstName, Double floor, String groupNumber, String lineToRedirectAliasTo, String[] listNumbers, String name, OvhOfferType offer, String rio, String siret, OvhSocialReason socialReason, Double stair, String streetName, Double streetNumber, String streetNumberExtra, String streetType, OvhNumberType type, String zip) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/portability";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		qPath = query(qPath, "building", building);
		qPath = query(qPath, "callNumber", callNumber);
		qPath = query(qPath, "city", city);
		qPath = query(qPath, "comment", comment);
		qPath = query(qPath, "contactName", contactName);
		qPath = query(qPath, "contactNumber", contactNumber);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "desireDate", desireDate);
		qPath = query(qPath, "displayUniversalDirectory", displayUniversalDirectory);
		qPath = query(qPath, "door", door);
		qPath = query(qPath, "firstName", firstName);
		qPath = query(qPath, "floor", floor);
		qPath = query(qPath, "groupNumber", groupNumber);
		qPath = query(qPath, "lineToRedirectAliasTo", lineToRedirectAliasTo);
		qPath = query(qPath, "listNumbers", listNumbers);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "offer", offer);
		qPath = query(qPath, "rio", rio);
		qPath = query(qPath, "siret", siret);
		qPath = query(qPath, "socialReason", socialReason);
		qPath = query(qPath, "stair", stair);
		qPath = query(qPath, "streetName", streetName);
		qPath = query(qPath, "streetNumber", streetNumber);
		qPath = query(qPath, "streetNumberExtra", streetNumberExtra);
		qPath = query(qPath, "streetType", streetType);
		qPath = query(qPath, "type", type);
		qPath = query(qPath, "zip", zip);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/{billingAccount}/portability
	 * @param socialReason [required] Your social reason
	 * @param rio [required] RIO of the number for individual offer
	 * @param offer [required] The offer : individual or company
	 * @param floor [required] Address floor
	 * @param contactNumber [required] Your contact phone number
	 * @param stair [required] Address stair
	 * @param streetNumberExtra [required] Address street number extra : bis,ter,...
	 * @param listNumbers [required] Extra numbers to be ported
	 * @param city [required] Address city
	 * @param streetName [required] Address street name
	 * @param lineToRedirectAliasTo [required] Redirect ported numbers to the specific line
	 * @param siret [required] If you port under your society, the SIRET number
	 * @param displayUniversalDirectory [required] Publish informations on directory ? (Yellow Pages, 118XXX, ...)
	 * @param country [required] Country of number
	 * @param callNumber [required] The number you want to port
	 * @param firstName [required] Your firstname
	 * @param contactName [required] Your contact name
	 * @param streetType [required] Address street type
	 * @param name [required] Your name
	 * @param zip [required] Address zip code
	 * @param desireDate [required] The date you want for portability execution
	 * @param groupNumber [required] Secondary designation number
	 * @param comment [required] Comment
	 * @param streetNumber [required] Address street number
	 * @param door [required] Address door
	 * @param building [required] Address building
	 * @param type [required] The type of number : landline or special
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_portability_POST(String billingAccount, OvhSocialReason socialReason, String rio, OvhOfferType offer, Double floor, String contactNumber, Double stair, String streetNumberExtra, String[] listNumbers, String city, String streetName, String lineToRedirectAliasTo, String siret, Boolean displayUniversalDirectory, OvhCountriesAvailable country, String callNumber, String firstName, String contactName, String streetType, String name, String zip, Date desireDate, String groupNumber, String comment, Double streetNumber, String door, String building, OvhNumberType type) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/portability";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "socialReason", socialReason);
		addBody(o, "rio", rio);
		addBody(o, "offer", offer);
		addBody(o, "floor", floor);
		addBody(o, "contactNumber", contactNumber);
		addBody(o, "stair", stair);
		addBody(o, "streetNumberExtra", streetNumberExtra);
		addBody(o, "listNumbers", listNumbers);
		addBody(o, "city", city);
		addBody(o, "streetName", streetName);
		addBody(o, "lineToRedirectAliasTo", lineToRedirectAliasTo);
		addBody(o, "siret", siret);
		addBody(o, "displayUniversalDirectory", displayUniversalDirectory);
		addBody(o, "country", country);
		addBody(o, "callNumber", callNumber);
		addBody(o, "firstName", firstName);
		addBody(o, "contactName", contactName);
		addBody(o, "streetType", streetType);
		addBody(o, "name", name);
		addBody(o, "zip", zip);
		addBody(o, "desireDate", desireDate);
		addBody(o, "groupNumber", groupNumber);
		addBody(o, "comment", comment);
		addBody(o, "streetNumber", streetNumber);
		addBody(o, "door", door);
		addBody(o, "building", building);
		addBody(o, "type", type);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/{billingAccount}/numberNogeographic
	 * @param firstname [required] Contact firstname
	 * @param ape [required] Company ape
	 * @param offer [required] Number offer
	 * @param email [required]
	 * @param city [required] Contact city
	 * @param streetName [required] Street name
	 * @param pool [required] Number of alias in case of pool
	 * @param specificNumber [required] Preselected standard number
	 * @param siret [required] Companu siret
	 * @param displayUniversalDirectory [required] Publish contact informations on universal directories
	 * @param country [required] Number country
	 * @param organisation [required] Contact organisation
	 * @param socialNomination [required] Company social nomination
	 * @param name [required] Contact name
	 * @param phone [required] Contact phone
	 * @param retractation [required] Retractation rights if set
	 * @param zip [required] Contact zip
	 * @param streetNumber [required] Street number
	 * @param legalform [required] Legal form
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_numberNogeographic_GET(String billingAccount, String ape, String city, OvhNumberCountryEnum country, Boolean displayUniversalDirectory, String email, String firstname, OvhLegalFormEnum legalform, String name, OvhNumberOffer offer, String organisation, String phone, OvhNumberPoolEnum pool, Boolean retractation, String siret, String socialNomination, String specificNumber, String streetName, String streetNumber, String zip) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/numberNogeographic";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		qPath = query(qPath, "ape", ape);
		qPath = query(qPath, "city", city);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "displayUniversalDirectory", displayUniversalDirectory);
		qPath = query(qPath, "email", email);
		qPath = query(qPath, "firstname", firstname);
		qPath = query(qPath, "legalform", legalform);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "offer", offer);
		qPath = query(qPath, "organisation", organisation);
		qPath = query(qPath, "phone", phone);
		qPath = query(qPath, "pool", pool);
		qPath = query(qPath, "retractation", retractation);
		qPath = query(qPath, "siret", siret);
		qPath = query(qPath, "socialNomination", socialNomination);
		qPath = query(qPath, "specificNumber", specificNumber);
		qPath = query(qPath, "streetName", streetName);
		qPath = query(qPath, "streetNumber", streetNumber);
		qPath = query(qPath, "zip", zip);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/{billingAccount}/numberNogeographic
	 * @param firstname [required] Contact firstname
	 * @param ape [required] Company ape
	 * @param offer [required] Number offer
	 * @param email [required]
	 * @param city [required] Contact city
	 * @param streetName [required] Street name
	 * @param pool [required] Number of alias in case of pool
	 * @param specificNumber [required] Preselected standard number
	 * @param siret [required] Companu siret
	 * @param displayUniversalDirectory [required] Publish contact informations on universal directories
	 * @param country [required] Number country
	 * @param organisation [required] Contact organisation
	 * @param socialNomination [required] Company social nomination
	 * @param name [required] Contact name
	 * @param phone [required] Contact phone
	 * @param retractation [required] Retractation rights if set
	 * @param zip [required] Contact zip
	 * @param streetNumber [required] Street number
	 * @param legalform [required] Legal form
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_numberNogeographic_POST(String billingAccount, String firstname, String ape, OvhNumberOffer offer, String email, String city, String streetName, OvhNumberPoolEnum pool, String specificNumber, String siret, Boolean displayUniversalDirectory, OvhNumberCountryEnum country, String organisation, String socialNomination, String name, String phone, Boolean retractation, String zip, String streetNumber, OvhLegalFormEnum legalform) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/numberNogeographic";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "firstname", firstname);
		addBody(o, "ape", ape);
		addBody(o, "offer", offer);
		addBody(o, "email", email);
		addBody(o, "city", city);
		addBody(o, "streetName", streetName);
		addBody(o, "pool", pool);
		addBody(o, "specificNumber", specificNumber);
		addBody(o, "siret", siret);
		addBody(o, "displayUniversalDirectory", displayUniversalDirectory);
		addBody(o, "country", country);
		addBody(o, "organisation", organisation);
		addBody(o, "socialNomination", socialNomination);
		addBody(o, "name", name);
		addBody(o, "phone", phone);
		addBody(o, "retractation", retractation);
		addBody(o, "zip", zip);
		addBody(o, "streetNumber", streetNumber);
		addBody(o, "legalform", legalform);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/{billingAccount}/accessory
	 * @param retractation [required] Retractation rights if set
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param accessory [required] Accessory brand name
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param quantity [required] Quantity of request repetition in this configuration
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_accessory_GET(String billingAccount, String accessory, String mondialRelayId, Long quantity, Boolean retractation, Long shippingContactId) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/accessory";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		qPath = query(qPath, "accessory", accessory);
		qPath = query(qPath, "mondialRelayId", mondialRelayId);
		qPath = query(qPath, "quantity", quantity);
		qPath = query(qPath, "retractation", retractation);
		qPath = query(qPath, "shippingContactId", shippingContactId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/{billingAccount}/accessory
	 * @param retractation [required] Retractation rights if set
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param accessory [required] Accessory brand name
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param quantity [required] Quantity of request repetition in this configuration
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_accessory_POST(String billingAccount, Boolean retractation, Long shippingContactId, String accessory, String mondialRelayId, Long quantity) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/accessory";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "retractation", retractation);
		addBody(o, "shippingContactId", shippingContactId);
		addBody(o, "accessory", accessory);
		addBody(o, "mondialRelayId", mondialRelayId);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/{billingAccount}/numberGeographic
	 * @param firstname [required] Contact firstname
	 * @param ape [required] Company ape
	 * @param zone [required] Zone
	 * @param offer [required] Number offer
	 * @param email [required]
	 * @param city [required] Contact city
	 * @param streetName [required] Street name
	 * @param pool [required] Number of alias in case of pool
	 * @param specificNumber [required] Preselected standard number
	 * @param siret [required] Companu siret
	 * @param displayUniversalDirectory [required] Publish contact informations on universal directories
	 * @param country [required] Number country
	 * @param organisation [required] Contact organisation
	 * @param socialNomination [required] Company social nomination
	 * @param name [required] Contact name
	 * @param phone [required] Contact phone
	 * @param retractation [required] Retractation rights if set
	 * @param zip [required] Contact zip
	 * @param streetNumber [required] Street number
	 * @param legalform [required] Legal form
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_numberGeographic_GET(String billingAccount, String ape, String city, OvhNumberCountryEnum country, Boolean displayUniversalDirectory, String email, String firstname, OvhLegalFormEnum legalform, String name, OvhNumberOffer offer, String organisation, String phone, OvhNumberPoolEnum pool, Boolean retractation, String siret, String socialNomination, String specificNumber, String streetName, String streetNumber, String zip, String zone) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/numberGeographic";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		qPath = query(qPath, "ape", ape);
		qPath = query(qPath, "city", city);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "displayUniversalDirectory", displayUniversalDirectory);
		qPath = query(qPath, "email", email);
		qPath = query(qPath, "firstname", firstname);
		qPath = query(qPath, "legalform", legalform);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "offer", offer);
		qPath = query(qPath, "organisation", organisation);
		qPath = query(qPath, "phone", phone);
		qPath = query(qPath, "pool", pool);
		qPath = query(qPath, "retractation", retractation);
		qPath = query(qPath, "siret", siret);
		qPath = query(qPath, "socialNomination", socialNomination);
		qPath = query(qPath, "specificNumber", specificNumber);
		qPath = query(qPath, "streetName", streetName);
		qPath = query(qPath, "streetNumber", streetNumber);
		qPath = query(qPath, "zip", zip);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/{billingAccount}/numberGeographic
	 * @param firstname [required] Contact firstname
	 * @param ape [required] Company ape
	 * @param zone [required] Zone
	 * @param offer [required] Number offer
	 * @param email [required]
	 * @param city [required] Contact city
	 * @param streetName [required] Street name
	 * @param pool [required] Number of alias in case of pool
	 * @param specificNumber [required] Preselected standard number
	 * @param siret [required] Companu siret
	 * @param displayUniversalDirectory [required] Publish contact informations on universal directories
	 * @param country [required] Number country
	 * @param organisation [required] Contact organisation
	 * @param socialNomination [required] Company social nomination
	 * @param name [required] Contact name
	 * @param phone [required] Contact phone
	 * @param retractation [required] Retractation rights if set
	 * @param zip [required] Contact zip
	 * @param streetNumber [required] Street number
	 * @param legalform [required] Legal form
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_numberGeographic_POST(String billingAccount, String firstname, String ape, String zone, OvhNumberOffer offer, String email, String city, String streetName, OvhNumberPoolEnum pool, String specificNumber, String siret, Boolean displayUniversalDirectory, OvhNumberCountryEnum country, String organisation, String socialNomination, String name, String phone, Boolean retractation, String zip, String streetNumber, OvhLegalFormEnum legalform) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/numberGeographic";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "firstname", firstname);
		addBody(o, "ape", ape);
		addBody(o, "zone", zone);
		addBody(o, "offer", offer);
		addBody(o, "email", email);
		addBody(o, "city", city);
		addBody(o, "streetName", streetName);
		addBody(o, "pool", pool);
		addBody(o, "specificNumber", specificNumber);
		addBody(o, "siret", siret);
		addBody(o, "displayUniversalDirectory", displayUniversalDirectory);
		addBody(o, "country", country);
		addBody(o, "organisation", organisation);
		addBody(o, "socialNomination", socialNomination);
		addBody(o, "name", name);
		addBody(o, "phone", phone);
		addBody(o, "retractation", retractation);
		addBody(o, "zip", zip);
		addBody(o, "streetNumber", streetNumber);
		addBody(o, "legalform", legalform);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/{billingAccount}/line
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param types [required] Number type. Set several types for each line per phone
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping address information entry.
	 * @param quantity [required] Quantity of request repetition in this configuration
	 * @param brand [required] Phone brands wanted with the offer. Set null for NO phone
	 * @param zones [required] Geographic zones. Let empty for nogeographic type. Set several zones for each line per phone
	 * @param retractation [required] Retractation rights if set
	 * @param offers [required] The line offers. Set several offers for each line per phone (Deprecated, use offer method instead)
	 * @param displayUniversalDirectories [required] Publish owner contact informations on universal directories or not
	 * @param ownerContactIds [required] Owner contact information id from /me entry point for each line
	 * @param extraSimultaneousLines [required] Additional simultaneous numbers. Set several simultaneous lines for each line per phone
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_line_GET(String billingAccount, String brand, Boolean[] displayUniversalDirectories, Long[] extraSimultaneousLines, String mondialRelayId, String[] offers, Long[] ownerContactIds, Long quantity, Boolean retractation, Long shippingContactId, OvhLineTypeEnum[] types, String[] zones) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/line";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		qPath = query(qPath, "brand", brand);
		qPath = query(qPath, "displayUniversalDirectories", displayUniversalDirectories);
		qPath = query(qPath, "extraSimultaneousLines", extraSimultaneousLines);
		qPath = query(qPath, "mondialRelayId", mondialRelayId);
		qPath = query(qPath, "offers", offers);
		qPath = query(qPath, "ownerContactIds", ownerContactIds);
		qPath = query(qPath, "quantity", quantity);
		qPath = query(qPath, "retractation", retractation);
		qPath = query(qPath, "shippingContactId", shippingContactId);
		qPath = query(qPath, "types", types);
		qPath = query(qPath, "zones", zones);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/{billingAccount}/line
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param types [required] Number type. Set several types for each line per phone
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping address information entry.
	 * @param quantity [required] Quantity of request repetition in this configuration
	 * @param brand [required] Phone brands wanted with the offer. Set null for NO phone
	 * @param zones [required] Geographic zones. Let empty for nogeographic type. Set several zones for each line per phone
	 * @param retractation [required] Retractation rights if set
	 * @param offers [required] The line offers. Set several offers for each line per phone (Deprecated, use offer method instead)
	 * @param displayUniversalDirectories [required] Publish owner contact informations on universal directories or not
	 * @param ownerContactIds [required] Owner contact information id from /me entry point for each line
	 * @param extraSimultaneousLines [required] Additional simultaneous numbers. Set several simultaneous lines for each line per phone
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhOrder telephony_billingAccount_line_POST(String billingAccount, Long shippingContactId, OvhLineTypeEnum[] types, String mondialRelayId, Long quantity, String brand, String[] zones, Boolean retractation, String[] offers, Boolean[] displayUniversalDirectories, Long[] ownerContactIds, Long[] extraSimultaneousLines) throws IOException {
		String qPath = "/order/telephony/{billingAccount}/line";
		qPath = qPath.replace("{billingAccount}", billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "shippingContactId", shippingContactId);
		addBody(o, "types", types);
		addBody(o, "mondialRelayId", mondialRelayId);
		addBody(o, "quantity", quantity);
		addBody(o, "brand", brand);
		addBody(o, "zones", zones);
		addBody(o, "retractation", retractation);
		addBody(o, "offers", offers);
		addBody(o, "displayUniversalDirectories", displayUniversalDirectories);
		addBody(o, "ownerContactIds", ownerContactIds);
		addBody(o, "extraSimultaneousLines", extraSimultaneousLines);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/lines/{serviceName}/addSimultaneousLines
	 * @param billingAccount [required] The name of your billingAccount
	 * @param quantity [required] The quantity of extra simultaneous lines to add
	 * @param serviceName [required] Your line number
	 */
	public OvhOrder telephony_lines_serviceName_addSimultaneousLines_GET(String serviceName, String billingAccount, Long quantity) throws IOException {
		String qPath = "/order/telephony/lines/{serviceName}/addSimultaneousLines";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "billingAccount", billingAccount);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/lines/{serviceName}/addSimultaneousLines
	 * @param billingAccount [required] The name of your billingAccount
	 * @param quantity [required] The quantity of extra simultaneous lines to add
	 * @param serviceName [required] Your line number
	 */
	public OvhOrder telephony_lines_serviceName_addSimultaneousLines_POST(String serviceName, String billingAccount, Long quantity) throws IOException {
		String qPath = "/order/telephony/lines/{serviceName}/addSimultaneousLines";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "billingAccount", billingAccount);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/telephony/lines/{serviceName}
	 * @param serviceName [required] Your line number
	 */
	public ArrayList<String> telephony_lines_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/telephony/lines/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/lines/{serviceName}/hardware
	 * @param retractation [required] Retractation rights if set
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param hardware [required] The hardware you want to order for this specific line
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param serviceName [required] Your line number
	 */
	public OvhOrder telephony_lines_serviceName_hardware_GET(String serviceName, String hardware, String mondialRelayId, Boolean retractation, String shippingContactId) throws IOException {
		String qPath = "/order/telephony/lines/{serviceName}/hardware";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "hardware", hardware);
		qPath = query(qPath, "mondialRelayId", mondialRelayId);
		qPath = query(qPath, "retractation", retractation);
		qPath = query(qPath, "shippingContactId", shippingContactId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/lines/{serviceName}/hardware
	 * @param retractation [required] Retractation rights if set
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param hardware [required] The hardware you want to order for this specific line
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param serviceName [required] Your line number
	 */
	public OvhOrder telephony_lines_serviceName_hardware_POST(String serviceName, Boolean retractation, String shippingContactId, String hardware, String mondialRelayId) throws IOException {
		String qPath = "/order/telephony/lines/{serviceName}/hardware";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "retractation", retractation);
		addBody(o, "shippingContactId", shippingContactId);
		addBody(o, "hardware", hardware);
		addBody(o, "mondialRelayId", mondialRelayId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/telephony/lines
	 */
	public ArrayList<String> telephony_lines_GET() throws IOException {
		String qPath = "/order/telephony/lines";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/new
	 */
	public OvhOrder telephony_new_GET() throws IOException {
		String qPath = "/order/telephony/new";
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/new
	 */
	public OvhOrder telephony_new_POST() throws IOException {
		String qPath = "/order/telephony/new";
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/spare/new
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param quantity [required] Number of phone quantity
	 * @param brand [required] Spare phone brand model
	 */
	public OvhOrder telephony_spare_new_GET(String brand, String mondialRelayId, Long quantity, Long shippingContactId) throws IOException {
		String qPath = "/order/telephony/spare/new";
		qPath = query(qPath, "brand", brand);
		qPath = query(qPath, "mondialRelayId", mondialRelayId);
		qPath = query(qPath, "quantity", quantity);
		qPath = query(qPath, "shippingContactId", shippingContactId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/spare/new
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param quantity [required] Number of phone quantity
	 * @param brand [required] Spare phone brand model
	 */
	public OvhOrder telephony_spare_new_POST(Long shippingContactId, String mondialRelayId, Long quantity, String brand) throws IOException {
		String qPath = "/order/telephony/spare/new";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "shippingContactId", shippingContactId);
		addBody(o, "mondialRelayId", mondialRelayId);
		addBody(o, "quantity", quantity);
		addBody(o, "brand", brand);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/trunks/{serviceName}/addSimultaneousLines
	 * @param billingAccount [required] The name of your billingAccount
	 * @param quantity [required] The quantity of extra simultaneous lines to add
	 * @param serviceName [required] Your trunk number
	 */
	public OvhOrder telephony_trunks_serviceName_addSimultaneousLines_GET(String serviceName, String billingAccount, Long quantity) throws IOException {
		String qPath = "/order/telephony/trunks/{serviceName}/addSimultaneousLines";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "billingAccount", billingAccount);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/trunks/{serviceName}/addSimultaneousLines
	 * @param billingAccount [required] The name of your billingAccount
	 * @param quantity [required] The quantity of extra simultaneous lines to add
	 * @param serviceName [required] Your trunk number
	 */
	public OvhOrder telephony_trunks_serviceName_addSimultaneousLines_POST(String serviceName, String billingAccount, Long quantity) throws IOException {
		String qPath = "/order/telephony/trunks/{serviceName}/addSimultaneousLines";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "billingAccount", billingAccount);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/telephony/trunks/{serviceName}
	 * @param serviceName [required] Your trunk number
	 */
	public ArrayList<String> telephony_trunks_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/telephony/trunks/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/telephony/trunks/{serviceName}/hardware
	 * @param retractation [required] Retractation rights if set
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param hardware [required] The hardware you want to order for this specific line
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param serviceName [required] Your trunk number
	 */
	public OvhOrder telephony_trunks_serviceName_hardware_GET(String serviceName, String hardware, String mondialRelayId, Boolean retractation, String shippingContactId) throws IOException {
		String qPath = "/order/telephony/trunks/{serviceName}/hardware";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "hardware", hardware);
		qPath = query(qPath, "mondialRelayId", mondialRelayId);
		qPath = query(qPath, "retractation", retractation);
		qPath = query(qPath, "shippingContactId", shippingContactId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/telephony/trunks/{serviceName}/hardware
	 * @param retractation [required] Retractation rights if set
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param hardware [required] The hardware you want to order for this specific line
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param serviceName [required] Your trunk number
	 */
	public OvhOrder telephony_trunks_serviceName_hardware_POST(String serviceName, Boolean retractation, String shippingContactId, String hardware, String mondialRelayId) throws IOException {
		String qPath = "/order/telephony/trunks/{serviceName}/hardware";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "retractation", retractation);
		addBody(o, "shippingContactId", shippingContactId);
		addBody(o, "hardware", hardware);
		addBody(o, "mondialRelayId", mondialRelayId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/telephony/trunks
	 */
	public ArrayList<String> telephony_trunks_GET() throws IOException {
		String qPath = "/order/telephony/trunks";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/ip/loadBalancing/{serviceName}
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> ip_loadBalancing_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/ip/loadBalancing/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/ip/loadBalancing/{serviceName}/ssl
	 * @param domain [required] The domain for which you want an SSL option. A DCV mail will be sent at postmaster@your_domain.abc, make sure this address exists before ordering
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhOrder ip_loadBalancing_serviceName_ssl_GET(String serviceName, String domain) throws IOException {
		String qPath = "/order/ip/loadBalancing/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "domain", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/ip/loadBalancing/{serviceName}/ssl
	 * @param domain [required] The domain for which you want an SSL option. A DCV mail will be sent at postmaster@your_domain.abc, make sure this address exists before ordering
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhOrder ip_loadBalancing_serviceName_ssl_POST(String serviceName, String domain) throws IOException {
		String qPath = "/order/ip/loadBalancing/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/ip/loadBalancing/{serviceName}/pop
	 * @param pop [required] The domain of the ip Load Balancing you want to add pop on
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhOrder ip_loadBalancing_serviceName_pop_GET(String serviceName, OvhLoadBalancingZoneEnum pop) throws IOException {
		String qPath = "/order/ip/loadBalancing/{serviceName}/pop";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "pop", pop);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/ip/loadBalancing/{serviceName}/pop
	 * @param pop [required] The domain of the ip Load Balancing you want to add pop on
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhOrder ip_loadBalancing_serviceName_pop_POST(String serviceName, OvhLoadBalancingZoneEnum pop) throws IOException {
		String qPath = "/order/ip/loadBalancing/{serviceName}/pop";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "pop", pop);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/ip/loadBalancing
	 */
	public ArrayList<String> ip_loadBalancing_GET() throws IOException {
		String qPath = "/order/ip/loadBalancing";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/ip/loadBalancing/new
	 * @param pop [required] The pop(s) you want your IP LoadBalancing on
	 */
	public ArrayList<String> ip_loadBalancing_new_GET(OvhLoadBalancingZoneEnum[] pop) throws IOException {
		String qPath = "/order/ip/loadBalancing/new";
		qPath = query(qPath, "pop", pop);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/ip/loadBalancing/new/{duration}
	 * @param pop [required] The pop(s) you want your IP LoadBalancing on
	 * @param duration [required] Duration
	 */
	public OvhOrder ip_loadBalancing_new_duration_GET(String duration, OvhLoadBalancingZoneEnum[] pop) throws IOException {
		String qPath = "/order/ip/loadBalancing/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "pop", pop);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/ip/loadBalancing/new/{duration}
	 * @param pop [required] The pop(s) you want your IP LoadBalancing on
	 * @param duration [required] Duration
	 */
	public OvhOrder ip_loadBalancing_new_duration_POST(String duration, OvhLoadBalancingZoneEnum[] pop) throws IOException {
		String qPath = "/order/ip/loadBalancing/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "pop", pop);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/email/pro
	 */
	public ArrayList<String> email_pro_GET() throws IOException {
		String qPath = "/order/email/pro";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/email/pro/{service}
	 * @param service [required] The internal name of your pro organization
	 */
	public ArrayList<String> email_pro_service_GET(String service) throws IOException {
		String qPath = "/order/email/pro/{service}";
		qPath = qPath.replace("{service}", service);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'account' option
	 * 
	 * REST: GET /order/email/pro/{service}/account
	 * @param number [required] Number of Accounts to order
	 * @param service [required] The internal name of your pro organization
	 */
	public ArrayList<String> email_pro_service_account_GET(String service, Long number) throws IOException {
		String qPath = "/order/email/pro/{service}/account";
		qPath = qPath.replace("{service}", service);
		qPath = query(qPath, "number", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/email/pro/{service}/account/{duration}
	 * @param number [required] Number of Accounts to order
	 * @param service [required] The internal name of your pro organization
	 * @param duration [required] Duration
	 */
	public OvhOrder email_pro_service_account_duration_GET(String service, String duration, Long number) throws IOException {
		String qPath = "/order/email/pro/{service}/account/{duration}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "number", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/email/pro/{service}/account/{duration}
	 * @param number [required] Number of Accounts to order
	 * @param service [required] The internal name of your pro organization
	 * @param duration [required] Duration
	 */
	public OvhOrder email_pro_service_account_duration_POST(String service, String duration, Long number) throws IOException {
		String qPath = "/order/email/pro/{service}/account/{duration}";
		qPath = qPath.replace("{service}", service);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/email/domain
	 */
	public ArrayList<String> email_domain_GET() throws IOException {
		String qPath = "/order/email/domain";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/email/domain/new
	 * @param domain [required] Domain name which will be linked to this mx account
	 * @param offer [required] Offer for your new mx account
	 */
	public ArrayList<String> email_domain_new_GET(String domain, OvhOfferEnum offer) throws IOException {
		String qPath = "/order/email/domain/new";
		qPath = query(qPath, "domain", domain);
		qPath = query(qPath, "offer", offer);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/email/domain/new/{duration}
	 * @param domain [required] Domain name which will be linked to this mx account
	 * @param offer [required] Offer for your new mx account
	 * @param duration [required] Duration
	 */
	public OvhOrder email_domain_new_duration_GET(String duration, String domain, OvhOfferEnum offer) throws IOException {
		String qPath = "/order/email/domain/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "domain", domain);
		qPath = query(qPath, "offer", offer);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/email/domain/new/{duration}
	 * @param domain [required] Domain name which will be linked to this mx account
	 * @param offer [required] Offer for your new mx account
	 * @param duration [required] Duration
	 */
	public OvhOrder email_domain_new_duration_POST(String duration, String domain, OvhOfferEnum offer) throws IOException {
		String qPath = "/order/email/domain/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "offer", offer);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/email/exchange
	 */
	public ArrayList<String> email_exchange_GET() throws IOException {
		String qPath = "/order/email/exchange";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service
	 * @param organizationName [required] The internal name of your exchange organization
	 */
	public ArrayList<String> email_exchange_organizationName_service_GET(String organizationName) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service";
		qPath = qPath.replace("{organizationName}", organizationName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}/serviceInfos
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhService email_exchange_organizationName_service_exchangeService_serviceInfos_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/serviceInfos";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /order/email/exchange/{organizationName}/service/{exchangeService}/serviceInfos
	 * @param body [required] New object properties
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public void email_exchange_organizationName_service_exchangeService_serviceInfos_PUT(String organizationName, String exchangeService, OvhService body) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/serviceInfos";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		exec("PUT", qPath, body);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> email_exchange_organizationName_service_exchangeService_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'accountUpgrade' option
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}/accountUpgrade
	 * @param primaryEmailAddress [required] The account you wish to upgrade
	 * @param newQuota [required] New storage quota for that account
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> email_exchange_organizationName_service_exchangeService_accountUpgrade_GET(String organizationName, String exchangeService, OvhAccountQuotaEnum newQuota, String primaryEmailAddress) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/accountUpgrade";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "newQuota", newQuota);
		qPath = query(qPath, "primaryEmailAddress", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}/accountUpgrade/{duration}
	 * @param primaryEmailAddress [required] The account you wish to upgrade
	 * @param newQuota [required] New storage quota for that account
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param duration [required] Duration
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_accountUpgrade_duration_GET(String organizationName, String exchangeService, String duration, OvhAccountQuotaEnum newQuota, String primaryEmailAddress) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/accountUpgrade/{duration}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "newQuota", newQuota);
		qPath = query(qPath, "primaryEmailAddress", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/email/exchange/{organizationName}/service/{exchangeService}/accountUpgrade/{duration}
	 * @param primaryEmailAddress [required] The account you wish to upgrade
	 * @param newQuota [required] New storage quota for that account
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param duration [required] Duration
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_accountUpgrade_duration_POST(String organizationName, String exchangeService, String duration, String primaryEmailAddress, OvhAccountQuotaEnum newQuota) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/accountUpgrade/{duration}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "primaryEmailAddress", primaryEmailAddress);
		addBody(o, "newQuota", newQuota);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'outlook' option
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}/outlook
	 * @param licence [required] Outlook version
	 * @param primaryEmailAddress [required] Primary email address for account which You want to buy an outlook
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> email_exchange_organizationName_service_exchangeService_outlook_GET(String organizationName, String exchangeService, OvhOutlookVersionEnum licence, String primaryEmailAddress) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/outlook";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "licence", licence);
		qPath = query(qPath, "primaryEmailAddress", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}/outlook/{duration}
	 * @param licence [required] Outlook version
	 * @param primaryEmailAddress [required] Primary email address for account which You want to buy an outlook
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param duration [required] Duration
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_outlook_duration_GET(String organizationName, String exchangeService, String duration, OvhOutlookVersionEnum licence, String primaryEmailAddress) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/outlook/{duration}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "licence", licence);
		qPath = query(qPath, "primaryEmailAddress", primaryEmailAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/email/exchange/{organizationName}/service/{exchangeService}/outlook/{duration}
	 * @param licence [required] Outlook version
	 * @param primaryEmailAddress [required] Primary email address for account which You want to buy an outlook
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param duration [required] Duration
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_outlook_duration_POST(String organizationName, String exchangeService, String duration, OvhOutlookVersionEnum licence, String primaryEmailAddress) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/outlook/{duration}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "licence", licence);
		addBody(o, "primaryEmailAddress", primaryEmailAddress);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'account' option
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}/account
	 * @param number [required] Number of Accounts to order
	 * @param licence [required] Licence type for the account
	 * @param storageQuota [required] The storage quota for the account(s) in GB (default = 50)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public ArrayList<String> email_exchange_organizationName_service_exchangeService_account_GET(String organizationName, String exchangeService, OvhOvhLicenceEnum licence, Long number, OvhAccountQuotaEnum storageQuota) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/account";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = query(qPath, "licence", licence);
		qPath = query(qPath, "number", number);
		qPath = query(qPath, "storageQuota", storageQuota);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}/account/{duration}
	 * @param number [required] Number of Accounts to order
	 * @param licence [required] Licence type for the account
	 * @param storageQuota [required] The storage quota for the account(s) in GB (default = 50)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param duration [required] Duration
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_account_duration_GET(String organizationName, String exchangeService, String duration, OvhOvhLicenceEnum licence, Long number, OvhAccountQuotaEnum storageQuota) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/account/{duration}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "licence", licence);
		qPath = query(qPath, "number", number);
		qPath = query(qPath, "storageQuota", storageQuota);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/email/exchange/{organizationName}/service/{exchangeService}/account/{duration}
	 * @param number [required] Number of Accounts to order
	 * @param licence [required] Licence type for the account
	 * @param storageQuota [required] The storage quota for the account(s) in GB (default = 50)
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 * @param duration [required] Duration
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_account_duration_POST(String organizationName, String exchangeService, String duration, Long number, OvhOvhLicenceEnum licence, OvhAccountQuotaEnum storageQuota) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/account/{duration}";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		addBody(o, "licence", licence);
		addBody(o, "storageQuota", storageQuota);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}/upgrade
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_upgrade_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/upgrade";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/email/exchange/{organizationName}/service/{exchangeService}/upgrade
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_upgrade_POST(String organizationName, String exchangeService) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/upgrade";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/email/exchange/{organizationName}/service/{exchangeService}/diskSpace
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_diskSpace_GET(String organizationName, String exchangeService) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/diskSpace";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/email/exchange/{organizationName}/service/{exchangeService}/diskSpace
	 * @param organizationName [required] The internal name of your exchange organization
	 * @param exchangeService [required] The internal name of your exchange service
	 */
	public OvhOrder email_exchange_organizationName_service_exchangeService_diskSpace_POST(String organizationName, String exchangeService) throws IOException {
		String qPath = "/order/email/exchange/{organizationName}/service/{exchangeService}/diskSpace";
		qPath = qPath.replace("{organizationName}", organizationName);
		qPath = qPath.replace("{exchangeService}", exchangeService);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/cloud/project/{serviceName}
	 * @param serviceName [required] The project id
	 */
	public ArrayList<String> cloud_project_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cloud/project/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/cloud/project/{serviceName}/credit
	 * @param amount [required] Amount to add in your cloud credit
	 * @param serviceName [required] The project id
	 */
	public OvhOrder cloud_project_serviceName_credit_GET(String serviceName, Long amount) throws IOException {
		String qPath = "/order/cloud/project/{serviceName}/credit";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "amount", amount);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/cloud/project/{serviceName}/credit
	 * @param amount [required] Amount to add in your cloud credit
	 * @param serviceName [required] The project id
	 */
	public OvhOrder cloud_project_serviceName_credit_POST(String serviceName, Long amount) throws IOException {
		String qPath = "/order/cloud/project/{serviceName}/credit";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "amount", amount);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/cloud/project/{serviceName}/ip
	 * @param country [required] IP geolocation
	 * @param instanceId [required] Instance id where ip will be routed to
	 * @param quantity [required] Number of failover ip
	 * @param serviceName [required] The project id
	 */
	public OvhOrder cloud_project_serviceName_ip_GET(String serviceName, OvhGeolocationEnum country, String instanceId, Long quantity) throws IOException {
		String qPath = "/order/cloud/project/{serviceName}/ip";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "instanceId", instanceId);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/cloud/project/{serviceName}/ip
	 * @param country [required] IP geolocation
	 * @param instanceId [required] Instance id where ip will be routed to
	 * @param quantity [required] Number of failover ip
	 * @param serviceName [required] The project id
	 */
	public OvhOrder cloud_project_serviceName_ip_POST(String serviceName, OvhGeolocationEnum country, String instanceId, Long quantity) throws IOException {
		String qPath = "/order/cloud/project/{serviceName}/ip";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "country", country);
		addBody(o, "instanceId", instanceId);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cloud/project
	 */
	public ArrayList<String> cloud_project_GET() throws IOException {
		String qPath = "/order/cloud/project";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/domain/zone
	 */
	public ArrayList<String> domain_zone_GET() throws IOException {
		String qPath = "/order/domain/zone";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/domain/zone/{zoneName}
	 * @param zoneName [required] The internal name of your zone
	 */
	public ArrayList<String> domain_zone_zoneName_GET(String zoneName) throws IOException {
		String qPath = "/order/domain/zone/{zoneName}";
		qPath = qPath.replace("{zoneName}", zoneName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'dnsAnycast' option
	 * 
	 * REST: GET /order/domain/zone/{zoneName}/dnsAnycast
	 * @param zoneName [required] The internal name of your zone
	 */
	public ArrayList<String> domain_zone_zoneName_dnsAnycast_GET(String zoneName) throws IOException {
		String qPath = "/order/domain/zone/{zoneName}/dnsAnycast";
		qPath = qPath.replace("{zoneName}", zoneName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/domain/zone/{zoneName}/dnsAnycast/{duration}
	 * @param zoneName [required] The internal name of your zone
	 * @param duration [required] Duration
	 */
	public OvhOrder domain_zone_zoneName_dnsAnycast_duration_GET(String zoneName, String duration) throws IOException {
		String qPath = "/order/domain/zone/{zoneName}/dnsAnycast/{duration}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/domain/zone/{zoneName}/dnsAnycast/{duration}
	 * @param zoneName [required] The internal name of your zone
	 * @param duration [required] Duration
	 */
	public OvhOrder domain_zone_zoneName_dnsAnycast_duration_POST(String zoneName, String duration) throws IOException {
		String qPath = "/order/domain/zone/{zoneName}/dnsAnycast/{duration}";
		qPath = qPath.replace("{zoneName}", zoneName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/domain/zone/new
	 * @param zoneName [required] Name of the zone to create
	 * @param minimized [required] Create only mandatory records
	 */
	public OvhOrder domain_zone_new_GET(Boolean minimized, String zoneName) throws IOException {
		String qPath = "/order/domain/zone/new";
		qPath = query(qPath, "minimized", minimized);
		qPath = query(qPath, "zoneName", zoneName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/domain/zone/new
	 * @param zoneName [required] Name of the zone to create
	 * @param minimized [required] Create only mandatory records
	 */
	public OvhOrder domain_zone_new_POST(String zoneName, Boolean minimized) throws IOException {
		String qPath = "/order/domain/zone/new";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zoneName", zoneName);
		addBody(o, "minimized", minimized);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/freefax/new
	 * @param quantity [required] Fax quantity possibilities to purchase
	 */
	public OvhOrder freefax_new_GET(OvhQuantityEnum quantity) throws IOException {
		String qPath = "/order/freefax/new";
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/freefax/new
	 * @param quantity [required] Fax quantity possibilities to purchase
	 */
	public OvhOrder freefax_new_POST(OvhQuantityEnum quantity) throws IOException {
		String qPath = "/order/freefax/new";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Retrieve available offers to upgrade your service to
	 * 
	 * REST: GET /order/upgrade/cephaas/{serviceName}
	 * @param serviceName [required] The internal ID of Ceph service
	 */
	public ArrayList<OvhGenericProductDefinition> upgrade_cephaas_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/upgrade/cephaas/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhGenericProductDefinition>> t2 = new TypeReference<ArrayList<OvhGenericProductDefinition>>() {};

	/**
	 * Get a provisional order for the selected upgrade of your service
	 * 
	 * REST: GET /order/upgrade/cephaas/{serviceName}/{planCode}
	 * @param planCode [required] Plan code of the offer you want to upgrade to
	 * @param quantity [required] Quantity you want to upgrade to
	 * @param serviceName [required] The internal ID of Ceph service
	 */
	public OvhOrderUpgradeOperationAndOrder upgrade_cephaas_serviceName_planCode_GET(String serviceName, String planCode, Long quantity) throws IOException {
		String qPath = "/order/upgrade/cephaas/{serviceName}/{planCode}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{planCode}", planCode);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrderUpgradeOperationAndOrder.class);
	}

	/**
	 * Perform the requested upgrade of your service
	 * 
	 * REST: POST /order/upgrade/cephaas/{serviceName}/{planCode}
	 * @param planCode [required] Plan code of the offer you want to upgrade to
	 * @param quantity [required] Quantity you want to upgrade to
	 * @param serviceName [required] The internal ID of Ceph service
	 */
	public OvhOrderUpgradeOperationAndOrder upgrade_cephaas_serviceName_planCode_POST(String serviceName, String planCode, Long quantity) throws IOException {
		String qPath = "/order/upgrade/cephaas/{serviceName}/{planCode}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{planCode}", planCode);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrderUpgradeOperationAndOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/upgrade/cephaas
	 */
	public ArrayList<String> upgrade_cephaas_GET() throws IOException {
		String qPath = "/order/upgrade/cephaas";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Retrieve available offers to upgrade your service to
	 * 
	 * REST: GET /order/upgrade/sslGateway/{serviceName}
	 * @param serviceName [required] The internal ID of SSL Gateway service
	 */
	public ArrayList<OvhGenericProductDefinition> upgrade_sslGateway_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/upgrade/sslGateway/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get a provisional order for the selected upgrade of your service
	 * 
	 * REST: GET /order/upgrade/sslGateway/{serviceName}/{planCode}
	 * @param planCode [required] Plan code of the offer you want to upgrade to
	 * @param quantity [required] Quantity you want to upgrade to
	 * @param serviceName [required] The internal ID of SSL Gateway service
	 */
	public OvhOrderUpgradeOperationAndOrder upgrade_sslGateway_serviceName_planCode_GET(String serviceName, String planCode, Long quantity) throws IOException {
		String qPath = "/order/upgrade/sslGateway/{serviceName}/{planCode}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{planCode}", planCode);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrderUpgradeOperationAndOrder.class);
	}

	/**
	 * Perform the requested upgrade of your service
	 * 
	 * REST: POST /order/upgrade/sslGateway/{serviceName}/{planCode}
	 * @param planCode [required] Plan code of the offer you want to upgrade to
	 * @param quantity [required] Quantity you want to upgrade to
	 * @param serviceName [required] The internal ID of SSL Gateway service
	 */
	public OvhOrderUpgradeOperationAndOrder upgrade_sslGateway_serviceName_planCode_POST(String serviceName, String planCode, Long quantity) throws IOException {
		String qPath = "/order/upgrade/sslGateway/{serviceName}/{planCode}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{planCode}", planCode);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrderUpgradeOperationAndOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/upgrade/sslGateway
	 */
	public ArrayList<String> upgrade_sslGateway_GET() throws IOException {
		String qPath = "/order/upgrade/sslGateway";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/saas/csp2/new
	 * @param officeBusinessQuantity [required] Number of prepaid office business license
	 * @param officeProPlusQuantity [required] Number of prepaid office pro plus license
	 * @param giftCode [required] Gift code for office license
	 */
	public ArrayList<String> saas_csp2_new_GET(String giftCode, Long officeBusinessQuantity, Long officeProPlusQuantity) throws IOException {
		String qPath = "/order/saas/csp2/new";
		qPath = query(qPath, "giftCode", giftCode);
		qPath = query(qPath, "officeBusinessQuantity", officeBusinessQuantity);
		qPath = query(qPath, "officeProPlusQuantity", officeProPlusQuantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/saas/csp2/new/{duration}
	 * @param officeBusinessQuantity [required] Number of prepaid office business license
	 * @param officeProPlusQuantity [required] Number of prepaid office pro plus license
	 * @param giftCode [required] Gift code for office license
	 * @param duration [required] Duration
	 */
	public OvhOrder saas_csp2_new_duration_GET(String duration, String giftCode, Long officeBusinessQuantity, Long officeProPlusQuantity) throws IOException {
		String qPath = "/order/saas/csp2/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "giftCode", giftCode);
		qPath = query(qPath, "officeBusinessQuantity", officeBusinessQuantity);
		qPath = query(qPath, "officeProPlusQuantity", officeProPlusQuantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/saas/csp2/new/{duration}
	 * @param officeBusinessQuantity [required] Number of prepaid office business license
	 * @param officeProPlusQuantity [required] Number of prepaid office pro plus license
	 * @param giftCode [required] Gift code for office license
	 * @param duration [required] Duration
	 */
	public OvhOrder saas_csp2_new_duration_POST(String duration, Long officeBusinessQuantity, Long officeProPlusQuantity, String giftCode) throws IOException {
		String qPath = "/order/saas/csp2/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "officeBusinessQuantity", officeBusinessQuantity);
		addBody(o, "officeProPlusQuantity", officeProPlusQuantity);
		addBody(o, "giftCode", giftCode);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/dedicated/housing/{serviceName}
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public ArrayList<String> dedicated_housing_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/dedicated/housing/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'APC' option
	 * 
	 * REST: GET /order/dedicated/housing/{serviceName}/APC
	 * @param serviceName [required] The internal name of your Housing bay
	 */
	public ArrayList<String> dedicated_housing_serviceName_APC_GET(String serviceName) throws IOException {
		String qPath = "/order/dedicated/housing/{serviceName}/APC";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/housing/{serviceName}/APC/{duration}
	 * @param serviceName [required] The internal name of your Housing bay
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_housing_serviceName_APC_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/dedicated/housing/{serviceName}/APC/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/housing/{serviceName}/APC/{duration}
	 * @param serviceName [required] The internal name of your Housing bay
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_housing_serviceName_APC_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/dedicated/housing/{serviceName}/APC/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/dedicated/housing
	 */
	public ArrayList<String> dedicated_housing_GET() throws IOException {
		String qPath = "/order/dedicated/housing";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'kvmExpress' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/kvmExpress
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_kvmExpress_GET(String serviceName) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/kvmExpress";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/kvmExpress/{duration}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_kvmExpress_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/kvmExpress/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/kvmExpress/{duration}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_kvmExpress_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/kvmExpress/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'professionalUse' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/professionalUse
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_professionalUse_GET(String serviceName) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/professionalUse";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/professionalUse/{duration}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_professionalUse_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/professionalUse/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/professionalUse/{duration}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_professionalUse_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/professionalUse/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'usbKey' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/usbKey
	 * @param capacity [required] Capacity in gigabytes
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_usbKey_GET(String serviceName, OvhUsbKeyCapacityEnum capacity) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/usbKey";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "capacity", capacity);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/usbKey/{duration}
	 * @param capacity [required] Capacity in gigabytes
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_usbKey_duration_GET(String serviceName, String duration, OvhUsbKeyCapacityEnum capacity) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/usbKey/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "capacity", capacity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/usbKey/{duration}
	 * @param capacity [required] Capacity in gigabytes
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_usbKey_duration_POST(String serviceName, String duration, OvhUsbKeyCapacityEnum capacity) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/usbKey/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "capacity", capacity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'ip' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/ip
	 * @param organisationId [required] Your organisation id to add on block informations
	 * @param country [required] IP localization
	 * @param blockSize [required] IP block size
	 * @param type [required] The type of IP
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_ip_GET(String serviceName, OvhIpBlockSizeEnum blockSize, OvhIpCountryEnum country, String organisationId, OvhIpTypeOrderableEnum type) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/ip";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "blockSize", blockSize);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "organisationId", organisationId);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/ip/{duration}
	 * @param organisationId [required] Your organisation id to add on block informations
	 * @param country [required] IP localization
	 * @param blockSize [required] IP block size
	 * @param type [required] The type of IP
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_ip_duration_GET(String serviceName, String duration, OvhIpBlockSizeEnum blockSize, OvhIpCountryEnum country, String organisationId, OvhIpTypeOrderableEnum type) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/ip/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "blockSize", blockSize);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "organisationId", organisationId);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/ip/{duration}
	 * @param organisationId [required] Your organisation id to add on block informations
	 * @param country [required] IP localization
	 * @param blockSize [required] IP block size
	 * @param type [required] The type of IP
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_ip_duration_POST(String serviceName, String duration, String organisationId, OvhIpCountryEnum country, OvhIpBlockSizeEnum blockSize, OvhIpTypeOrderableEnum type) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/ip/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "organisationId", organisationId);
		addBody(o, "country", country);
		addBody(o, "blockSize", blockSize);
		addBody(o, "type", type);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'backupStorage' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/backupStorage
	 * @param capacity [required] The capacity in gigabytes of your backup storage
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_backupStorage_GET(String serviceName, OvhBackupStorageCapacityEnum capacity) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/backupStorage";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "capacity", capacity);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/backupStorage/{duration}
	 * @param capacity [required] The capacity in gigabytes of your backup storage
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_backupStorage_duration_GET(String serviceName, String duration, OvhBackupStorageCapacityEnum capacity) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/backupStorage/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "capacity", capacity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/backupStorage/{duration}
	 * @param capacity [required] The capacity in gigabytes of your backup storage
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_backupStorage_duration_POST(String serviceName, String duration, OvhBackupStorageCapacityEnum capacity) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/backupStorage/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "capacity", capacity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'ipMigration' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/ipMigration
	 * @param ip [required] The IP to move to this server
	 * @param token [required] IP migration token
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_ipMigration_GET(String serviceName, String ip, String token) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/ipMigration";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "token", token);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/ipMigration/{duration}
	 * @param ip [required] The IP to move to this server
	 * @param token [required] IP migration token
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_ipMigration_duration_GET(String serviceName, String duration, String ip, String token) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/ipMigration/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "token", token);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/ipMigration/{duration}
	 * @param ip [required] The IP to move to this server
	 * @param token [required] IP migration token
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_ipMigration_duration_POST(String serviceName, String duration, String ip, String token) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/ipMigration/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'kvm' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/kvm
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_kvm_GET(String serviceName) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/kvm";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/kvm/{duration}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_kvm_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/kvm/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/kvm/{duration}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_kvm_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/kvm/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'feature' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/feature
	 * @param feature [required] the feature
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_feature_GET(String serviceName, OvhOrderableSysFeatureEnum feature) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/feature";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "feature", feature);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/feature/{duration}
	 * @param feature [required] the feature
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_feature_duration_GET(String serviceName, String duration, OvhOrderableSysFeatureEnum feature) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/feature/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "feature", feature);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/feature/{duration}
	 * @param feature [required] the feature
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_feature_duration_POST(String serviceName, String duration, OvhOrderableSysFeatureEnum feature) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/feature/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "feature", feature);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'staticIP' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/staticIP
	 * @param country [required] Ip localization
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_staticIP_GET(String serviceName, OvhIpStaticCountryEnum country) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/staticIP";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "country", country);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/staticIP/{duration}
	 * @param country [required] Ip localization
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_staticIP_duration_GET(String serviceName, String duration, OvhIpStaticCountryEnum country) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/staticIP/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "country", country);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/staticIP/{duration}
	 * @param country [required] Ip localization
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_staticIP_duration_POST(String serviceName, String duration, OvhIpStaticCountryEnum country) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/staticIP/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "country", country);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'failoverIP' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/failoverIP
	 * @param country [required] Ip localization
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_failoverIP_GET(String serviceName, OvhIpCountryEnum country) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/failoverIP";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "country", country);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/failoverIP/{duration}
	 * @param country [required] Ip localization
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_failoverIP_duration_GET(String serviceName, String duration, OvhIpCountryEnum country) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/failoverIP/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "country", country);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/failoverIP/{duration}
	 * @param country [required] Ip localization
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_failoverIP_duration_POST(String serviceName, String duration, OvhIpCountryEnum country) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/failoverIP/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "country", country);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'bandwidth' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/bandwidth
	 * @param bandwidth [required] Bandwidth to allocate
	 * @param type [required] bandwidth type
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_bandwidth_GET(String serviceName, OvhBandwidthOrderEnum bandwidth, OvhBandwidthOrderTypeEnum type) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/bandwidth";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "bandwidth", bandwidth);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/bandwidth/{duration}
	 * @param bandwidth [required] Bandwidth to allocate
	 * @param type [required] bandwidth type
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_bandwidth_duration_GET(String serviceName, String duration, OvhBandwidthOrderEnum bandwidth, OvhBandwidthOrderTypeEnum type) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/bandwidth/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "bandwidth", bandwidth);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/bandwidth/{duration}
	 * @param bandwidth [required] Bandwidth to allocate
	 * @param type [required] bandwidth type
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_bandwidth_duration_POST(String serviceName, String duration, OvhBandwidthOrderEnum bandwidth, OvhBandwidthOrderTypeEnum type) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/bandwidth/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "bandwidth", bandwidth);
		addBody(o, "type", type);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'firewall' option
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/firewall
	 * @param firewallModel [required] Firewall type
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> dedicated_server_serviceName_firewall_GET(String serviceName, OvhFirewallModelEnum firewallModel) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/firewall";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "firewallModel", firewallModel);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/server/{serviceName}/firewall/{duration}
	 * @param firewallModel [required] Firewall type
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_firewall_duration_GET(String serviceName, String duration, OvhFirewallModelEnum firewallModel) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/firewall/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "firewallModel", firewallModel);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/server/{serviceName}/firewall/{duration}
	 * @param firewallModel [required] Firewall type
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_server_serviceName_firewall_duration_POST(String serviceName, String duration, OvhFirewallModelEnum firewallModel) throws IOException {
		String qPath = "/order/dedicated/server/{serviceName}/firewall/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "firewallModel", firewallModel);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/dedicated/server
	 */
	public ArrayList<String> dedicated_server_GET() throws IOException {
		String qPath = "/order/dedicated/server";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/dedicated/nasha/new
	 * @param datacenter [required] Nas HA localization
	 * @param model [required] Capacity of Nas HA offer
	 */
	public ArrayList<String> dedicated_nasha_new_GET(OvhNasHAZoneEnum datacenter, OvhNasHAOfferEnum model) throws IOException {
		String qPath = "/order/dedicated/nasha/new";
		qPath = query(qPath, "datacenter", datacenter);
		qPath = query(qPath, "model", model);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicated/nasha/new/{duration}
	 * @param datacenter [required] Nas HA localization
	 * @param model [required] Capacity of Nas HA offer
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_nasha_new_duration_GET(String duration, OvhNasHAZoneEnum datacenter, OvhNasHAOfferEnum model) throws IOException {
		String qPath = "/order/dedicated/nasha/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "datacenter", datacenter);
		qPath = query(qPath, "model", model);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicated/nasha/new/{duration}
	 * @param datacenter [required] Nas HA localization
	 * @param model [required] Capacity of Nas HA offer
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicated_nasha_new_duration_POST(String duration, OvhNasHAZoneEnum datacenter, OvhNasHAOfferEnum model) throws IOException {
		String qPath = "/order/dedicated/nasha/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "datacenter", datacenter);
		addBody(o, "model", model);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get informations about additional Horizon View offer for your service
	 * 
	 * REST: GET /order/cartServiceOption/vdi/{serviceName}
	 * @param serviceName [required] The internal ID of Horizon View service
	 */
	public ArrayList<OvhGenericOptionDefinition> cartServiceOption_vdi_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cartServiceOption/vdi/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhGenericOptionDefinition>> t3 = new TypeReference<ArrayList<OvhGenericOptionDefinition>>() {};

	/**
	 * Post an additional Horizon View option in your cart
	 * 
	 * REST: POST /order/cartServiceOption/vdi/{serviceName}
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the additional Horizon View offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 * @param serviceName [required] The internal ID of Horizon View service
	 */
	public OvhItem cartServiceOption_vdi_serviceName_POST(String serviceName, String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cartServiceOption/vdi/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cartId", cartId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cartServiceOption/vdi
	 */
	public ArrayList<String> cartServiceOption_vdi_GET() throws IOException {
		String qPath = "/order/cartServiceOption/vdi";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get informations about additional Web Hosting offer for your service
	 * 
	 * REST: GET /order/cartServiceOption/webHosting/{serviceName}
	 * @param serviceName [required] The internal ID of Web Hosting service
	 */
	public ArrayList<OvhGenericOptionDefinition> cartServiceOption_webHosting_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cartServiceOption/webHosting/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post an additional Web Hosting option in your cart
	 * 
	 * REST: POST /order/cartServiceOption/webHosting/{serviceName}
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the additional Web Hosting offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 * @param serviceName [required] The internal ID of Web Hosting service
	 */
	public OvhItem cartServiceOption_webHosting_serviceName_POST(String serviceName, String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cartServiceOption/webHosting/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cartId", cartId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cartServiceOption/webHosting
	 */
	public ArrayList<String> cartServiceOption_webHosting_GET() throws IOException {
		String qPath = "/order/cartServiceOption/webHosting";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get informations about additional Logs offer for your service
	 * 
	 * REST: GET /order/cartServiceOption/logs/{serviceName}
	 * @param serviceName [required] The internal ID of Logs service
	 */
	public ArrayList<OvhGenericOptionDefinition> cartServiceOption_logs_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cartServiceOption/logs/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post an additional Logs option in your cart
	 * 
	 * REST: POST /order/cartServiceOption/logs/{serviceName}
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the additional Logs offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 * @param serviceName [required] The internal ID of Logs service
	 */
	public OvhItem cartServiceOption_logs_serviceName_POST(String serviceName, String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cartServiceOption/logs/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cartId", cartId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cartServiceOption/logs
	 */
	public ArrayList<String> cartServiceOption_logs_GET() throws IOException {
		String qPath = "/order/cartServiceOption/logs";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get informations about additional SSL Gateway offer for your service
	 * 
	 * REST: GET /order/cartServiceOption/sslGateway/{serviceName}
	 * @param serviceName [required] The internal ID of SSL Gateway service
	 */
	public ArrayList<OvhGenericOptionDefinition> cartServiceOption_sslGateway_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cartServiceOption/sslGateway/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post an additional SSL Gateway option in your cart
	 * 
	 * REST: POST /order/cartServiceOption/sslGateway/{serviceName}
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the additional SSL Gateway offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 * @param serviceName [required] The internal ID of SSL Gateway service
	 */
	public OvhItem cartServiceOption_sslGateway_serviceName_POST(String serviceName, String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cartServiceOption/sslGateway/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cartId", cartId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cartServiceOption/sslGateway
	 */
	public ArrayList<String> cartServiceOption_sslGateway_GET() throws IOException {
		String qPath = "/order/cartServiceOption/sslGateway";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get informations about additional Docker offer for your service
	 * 
	 * REST: GET /order/cartServiceOption/docker/{serviceName}
	 * @param serviceName [required] The internal ID of Docker service
	 */
	public ArrayList<OvhGenericOptionDefinition> cartServiceOption_docker_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cartServiceOption/docker/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post an additional Docker option in your cart
	 * 
	 * REST: POST /order/cartServiceOption/docker/{serviceName}
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the additional Docker offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 * @param serviceName [required] The internal ID of Docker service
	 */
	public OvhItem cartServiceOption_docker_serviceName_POST(String serviceName, String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cartServiceOption/docker/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cartId", cartId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cartServiceOption/docker
	 */
	public ArrayList<String> cartServiceOption_docker_GET() throws IOException {
		String qPath = "/order/cartServiceOption/docker";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get informations about additional Domain offer for your service
	 * 
	 * REST: GET /order/cartServiceOption/domain/{serviceName}
	 * @param serviceName [required] The internal ID of Domain service
	 */
	public ArrayList<OvhGenericOptionDefinition> cartServiceOption_domain_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cartServiceOption/domain/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post an additional Domain option in your cart
	 * 
	 * REST: POST /order/cartServiceOption/domain/{serviceName}
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the additional Domain offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 * @param serviceName [required] The internal ID of Domain service
	 */
	public OvhItem cartServiceOption_domain_serviceName_POST(String serviceName, String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cartServiceOption/domain/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cartId", cartId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cartServiceOption/domain
	 * @param whoisOwner Filter the value of whoisOwner property (=)
	 */
	public ArrayList<String> cartServiceOption_domain_GET(String whoisOwner) throws IOException {
		String qPath = "/order/cartServiceOption/domain";
		qPath = query(qPath, "whoisOwner", whoisOwner);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get informations about additional Sharepoint offer for your service
	 * 
	 * REST: GET /order/cartServiceOption/sharepoint/{serviceName}
	 * @param serviceName [required] The internal ID of Sharepoint service
	 */
	public ArrayList<OvhGenericOptionDefinition> cartServiceOption_sharepoint_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/cartServiceOption/sharepoint/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post an additional Sharepoint option in your cart
	 * 
	 * REST: POST /order/cartServiceOption/sharepoint/{serviceName}
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the additional Sharepoint offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 * @param serviceName [required] The internal ID of Sharepoint service
	 */
	public OvhItem cartServiceOption_sharepoint_serviceName_POST(String serviceName, String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cartServiceOption/sharepoint/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cartId", cartId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/cartServiceOption/sharepoint
	 */
	public ArrayList<String> cartServiceOption_sharepoint_GET() throws IOException {
		String qPath = "/order/cartServiceOption/sharepoint";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * List of your OVH order carts
	 * 
	 * REST: GET /order/cart
	 * @param description [required] Filter the value of description property (=)
	 */
	public ArrayList<String> cart_GET(String description) throws IOException {
		String qPath = "/order/cart";
		qPath = query(qPath, "description", description);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create a new OVH order cart
	 * 
	 * REST: POST /order/cart
	 * @param description [required] Description of your cart
	 * @param expire [required] Time of expiration of the cart
	 * @param ovhSubsidiary [required] OVH Subsidiary where you want to order
	 */
	public OvhCart cart_POST(String description, Date expire, OvhOvhSubsidiaryEnum ovhSubsidiary) throws IOException {
		String qPath = "/order/cart";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "expire", expire);
		addBody(o, "ovhSubsidiary", ovhSubsidiary);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhCart.class);
	}

	/**
	 * Retrieve information about a specific cart
	 * 
	 * REST: GET /order/cart/{cartId}
	 * @param cartId [required] Cart identifier
	 */
	public OvhCart cart_cartId_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhCart.class);
	}

	/**
	 * Modify information about a specific cart
	 * 
	 * REST: PUT /order/cart/{cartId}
	 * @param cartId [required] Cart identifier
	 * @param description [required] Description of your cart
	 * @param expire [required] Time of expiration of the cart
	 */
	public OvhCart cart_cartId_PUT(String cartId, String description, Date expire) throws IOException {
		String qPath = "/order/cart/{cartId}";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "expire", expire);
		String resp = execN("PUT", qPath, o);
		return convertTo(resp, OvhCart.class);
	}

	/**
	 * Delete a cart
	 * 
	 * REST: DELETE /order/cart/{cartId}
	 * @param cartId [required] Cart identifier
	 */
	public void cart_cartId_DELETE(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}";
		qPath = qPath.replace("{cartId}", cartId);
		exec("DELETE", qPath);
	}

	/**
	 * Get informations about Desk As A Service offers
	 * 
	 * REST: GET /order/cart/{cartId}/deskaas
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_deskaas_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/deskaas";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Desk as a service item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/deskaas
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Desk as a Service offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_deskaas_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/deskaas";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about VoIP offers
	 * 
	 * REST: GET /order/cart/{cartId}/telephony
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_telephony_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/telephony";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new VoIP item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/telephony
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the VoIP offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_telephony_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/telephony";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about VoIP options
	 * 
	 * REST: GET /order/cart/{cartId}/telephony/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the VoIP you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_telephony_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/telephony/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new VoIP option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/telephony/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a VoIP option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_telephony_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/telephony/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Horizon View offers
	 * 
	 * REST: GET /order/cart/{cartId}/vdi
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_vdi_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/vdi";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Horizon View item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/vdi
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Horizon View offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_vdi_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/vdi";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Horizon View options
	 * 
	 * REST: GET /order/cart/{cartId}/vdi/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Horizon View you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_vdi_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/vdi/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new Horizon View option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/vdi/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a Horizon View option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_vdi_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/vdi/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * List all the items of a cart
	 * 
	 * REST: GET /order/cart/{cartId}/item
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<Long> cart_cartId_item_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/item";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<Long>> t4 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Retrieve all required configuration item of the cart item
	 * 
	 * REST: GET /order/cart/{cartId}/item/{itemId}/requiredConfiguration
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Product item identifier
	 */
	public ArrayList<OvhConfigurationRequirements> cart_cartId_item_itemId_requiredConfiguration_GET(String cartId, Long itemId) throws IOException {
		String qPath = "/order/cart/{cartId}/item/{itemId}/requiredConfiguration";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = qPath.replace("{itemId}", itemId.toString());
		String resp = execN("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhConfigurationRequirements>> t5 = new TypeReference<ArrayList<OvhConfigurationRequirements>>() {};

	/**
	 * Retrieve information about a specific item of a cart
	 * 
	 * REST: GET /order/cart/{cartId}/item/{itemId}
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Product item identifier
	 */
	public OvhItem cart_cartId_item_itemId_GET(String cartId, Long itemId) throws IOException {
		String qPath = "/order/cart/{cartId}/item/{itemId}";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = qPath.replace("{itemId}", itemId.toString());
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Update some values on a cart item
	 * 
	 * REST: PUT /order/cart/{cartId}/item/{itemId}
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Product item identifier
	 * @param quantity [required] New quantity for item
	 * @param duration [required] New duration for item
	 */
	public OvhItem cart_cartId_item_itemId_PUT(String cartId, Long itemId, Long quantity, String duration) throws IOException {
		String qPath = "/order/cart/{cartId}/item/{itemId}";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = qPath.replace("{itemId}", itemId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		addBody(o, "duration", duration);
		String resp = execN("PUT", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Delete an item from a cart
	 * 
	 * REST: DELETE /order/cart/{cartId}/item/{itemId}
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Product item identifier
	 */
	public void cart_cartId_item_itemId_DELETE(String cartId, Long itemId) throws IOException {
		String qPath = "/order/cart/{cartId}/item/{itemId}";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = qPath.replace("{itemId}", itemId.toString());
		execN("DELETE", qPath);
	}

	/**
	 * Retrieve all configuration item of the cart item
	 * 
	 * REST: GET /order/cart/{cartId}/item/{itemId}/configuration
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Product item identifier
	 * @param label [required] Filter the value of label property (=)
	 */
	public ArrayList<Long> cart_cartId_item_itemId_configuration_GET(String cartId, Long itemId, String label) throws IOException {
		String qPath = "/order/cart/{cartId}/item/{itemId}/configuration";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = qPath.replace("{itemId}", itemId.toString());
		qPath = query(qPath, "label", label);
		String resp = execN("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Setup configuration item for the product
	 * 
	 * REST: POST /order/cart/{cartId}/item/{itemId}/configuration
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Product item identifier
	 * @param label [required] Label for your configuration item
	 * @param value [required] Value or resource URL on API.OVH.COM of your configuration item
	 */
	public OvhConfigurationItem cart_cartId_item_itemId_configuration_POST(String cartId, Long itemId, String label, String value) throws IOException {
		String qPath = "/order/cart/{cartId}/item/{itemId}/configuration";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = qPath.replace("{itemId}", itemId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "label", label);
		addBody(o, "value", value);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhConfigurationItem.class);
	}

	/**
	 * Retrieve configuration item
	 * 
	 * REST: GET /order/cart/{cartId}/item/{itemId}/configuration/{configurationId}
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Product item identifier
	 * @param configurationId [required] Configuration item identifier
	 */
	public OvhConfigurationItem cart_cartId_item_itemId_configuration_configurationId_GET(String cartId, Long itemId, Long configurationId) throws IOException {
		String qPath = "/order/cart/{cartId}/item/{itemId}/configuration/{configurationId}";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = qPath.replace("{itemId}", itemId.toString());
		qPath = qPath.replace("{configurationId}", configurationId.toString());
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhConfigurationItem.class);
	}

	/**
	 * Delete configuration item
	 * 
	 * REST: DELETE /order/cart/{cartId}/item/{itemId}/configuration/{configurationId}
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Product item identifier
	 * @param configurationId [required] Configuration item identifier
	 */
	public void cart_cartId_item_itemId_configuration_configurationId_DELETE(String cartId, Long itemId, Long configurationId) throws IOException {
		String qPath = "/order/cart/{cartId}/item/{itemId}/configuration/{configurationId}";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = qPath.replace("{itemId}", itemId.toString());
		qPath = qPath.replace("{configurationId}", configurationId.toString());
		execN("DELETE", qPath);
	}

	/**
	 * Get informations about Domain Restore
	 * 
	 * REST: GET /order/cart/{cartId}/domainRestore
	 * @param cartId [required] Cart identifier
	 * @param domain [required] Domain name requested
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_domainRestore_GET(String cartId, String domain) throws IOException {
		String qPath = "/order/cart/{cartId}/domainRestore";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "domain", domain);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get informations about Reseller offers
	 * 
	 * REST: GET /order/cart/{cartId}/reseller
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_reseller_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/reseller";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Reseller offer item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/reseller
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of Reseller offer (planCode)
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_reseller_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/reseller";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about a timeseries offer
	 * 
	 * REST: GET /order/cart/{cartId}/dbaasTimeseries
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_dbaasTimeseries_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/dbaasTimeseries";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new timeseries offer item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/dbaasTimeseries
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the timeseries offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_dbaasTimeseries_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/dbaasTimeseries";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Dedicated Discover server offers
	 * 
	 * REST: GET /order/cart/{cartId}/discover
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_discover_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/discover";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Dedicated Discover server item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/discover
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Dedicated Discover server offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_discover_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/discover";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Dedicated Discover server options
	 * 
	 * REST: GET /order/cart/{cartId}/discover/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Dedicated Discover server you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_discover_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/discover/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new Dedicated Discover server option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/discover/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a Dedicated Discover server option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_discover_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/discover/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Hosting Reseller offers
	 * 
	 * REST: GET /order/cart/{cartId}/hostingReseller
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_hostingReseller_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/hostingReseller";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Hosting Reseller item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/hostingReseller
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Hosting Reseller offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_hostingReseller_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/hostingReseller";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Office 365 licenses
	 * 
	 * REST: GET /order/cart/{cartId}/office365
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_office365_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/office365";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Office 365 item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/office365
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Office365 license
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_office365_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/office365";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Office 365 options
	 * 
	 * REST: GET /order/cart/{cartId}/office365/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of a Office 365 main offer
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_office365_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/office365/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new Office 365 option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/office365/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a Office 365 offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_office365_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/office365/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Sharepoint offers
	 * 
	 * REST: GET /order/cart/{cartId}/sharepoint
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_sharepoint_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/sharepoint";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Sharepoint offer item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/sharepoint
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of Sharepoint offer (planCode)
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_sharepoint_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/sharepoint";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Sharepoint options
	 * 
	 * REST: GET /order/cart/{cartId}/sharepoint/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of a Sharepoint main offer
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_sharepoint_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/sharepoint/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new Sharepoint option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/sharepoint/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a Sharepoint offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_sharepoint_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/sharepoint/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Assign a shopping cart to an loggedin client
	 * 
	 * REST: POST /order/cart/{cartId}/assign
	 * @param cartId [required] Cart identifier
	 */
	public void cart_cartId_assign_POST(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/assign";
		qPath = qPath.replace("{cartId}", cartId);
		exec("POST", qPath);
	}

	/**
	 * Retrieve coupons associated to cart
	 * 
	 * REST: GET /order/cart/{cartId}/coupon
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<String> cart_cartId_coupon_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/coupon";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add a new coupon to cart
	 * 
	 * REST: POST /order/cart/{cartId}/coupon
	 * @param cartId [required] Cart identifier
	 * @param coupon [required] Coupon identifier
	 */
	public ArrayList<String> cart_cartId_coupon_POST(String cartId, String coupon) throws IOException {
		String qPath = "/order/cart/{cartId}/coupon";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "coupon", coupon);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, t1);
	}

	/**
	 * Delete a coupon from cart
	 * 
	 * REST: DELETE /order/cart/{cartId}/coupon
	 * @param cartId [required] Cart identifier
	 * @param coupon [required] Coupon identifier
	 */
	public void cart_cartId_coupon_DELETE(String cartId, String coupon) throws IOException {
		String qPath = "/order/cart/{cartId}/coupon";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "coupon", coupon);
		execN("DELETE", qPath);
	}

	/**
	 * Get informations about SSL Comodo offers
	 * 
	 * REST: GET /order/cart/{cartId}/sslComodo
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_sslComodo_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/sslComodo";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new SSL Comodo item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/sslComodo
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the SSL Comodo offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_sslComodo_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/sslComodo";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about SSL Comodo options
	 * 
	 * REST: GET /order/cart/{cartId}/sslComodo/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the SSL Comodo you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_sslComodo_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/sslComodo/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new SSL Comodo option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/sslComodo/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a SSL Comodo option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_sslComodo_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/sslComodo/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about SMS offers
	 * 
	 * REST: GET /order/cart/{cartId}/sms
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_sms_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/sms";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new SMS item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/sms
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the SMS offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_sms_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/sms";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about CaaS Registry offers
	 * 
	 * REST: GET /order/cart/{cartId}/registry
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_registry_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/registry";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new CaaS Registry item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/registry
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the CaaS Registry offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_registry_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/registry";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Logs offers
	 * 
	 * REST: GET /order/cart/{cartId}/logs
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_logs_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/logs";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Logs item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/logs
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Logs offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_logs_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/logs";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Logs options
	 * 
	 * REST: GET /order/cart/{cartId}/logs/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Logs you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_logs_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/logs/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new Logs option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/logs/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a Logs option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_logs_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/logs/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about SSL Gateway offers
	 * 
	 * REST: GET /order/cart/{cartId}/sslGateway
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_sslGateway_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/sslGateway";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new SSL Gateway item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/sslGateway
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the SSL Gateway offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_sslGateway_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/sslGateway";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about SSL Gateway options
	 * 
	 * REST: GET /order/cart/{cartId}/sslGateway/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the SSL Gateway you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_sslGateway_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/sslGateway/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new SSL Gateway option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/sslGateway/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a SSL Gateway option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_sslGateway_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/sslGateway/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Docker offers
	 * 
	 * REST: GET /order/cart/{cartId}/docker
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_docker_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/docker";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Docker item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/docker
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Docker offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_docker_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/docker";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Docker options
	 * 
	 * REST: GET /order/cart/{cartId}/docker/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Docker you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_docker_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/docker/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new Docker option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/docker/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a Docker option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_docker_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/docker/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about SaaS CSP2 offers
	 * 
	 * REST: GET /order/cart/{cartId}/csp2
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_csp2_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/csp2";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new SaaS CSP2 offer item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/csp2
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of SaaS CSP2 offer (planCode)
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_csp2_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/csp2";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about SaaS CSP2 options
	 * 
	 * REST: GET /order/cart/{cartId}/csp2/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of a SaaS CSP2 main offer
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_csp2_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/csp2/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new SaaS CSP2 option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/csp2/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a SaaS CSP2 offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_csp2_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/csp2/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about a domain name
	 * 
	 * REST: GET /order/cart/{cartId}/domain
	 * @param cartId [required] Cart identifier
	 * @param domain [required] Domain name requested
	 */
	public ArrayList<OvhProductInformation> cart_cartId_domain_GET(String cartId, String domain) throws IOException {
		String qPath = "/order/cart/{cartId}/domain";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "domain", domain);
		String resp = execN("GET", qPath);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhProductInformation>> t6 = new TypeReference<ArrayList<OvhProductInformation>>() {};

	/**
	 * Post a new domain in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/domain
	 * @param cartId [required] Cart identifier
	 * @param domain [required] Domain name to order
	 * @param offerId [required] Offer unique identifier
	 * @param quantity [required] Quantity to order
	 * @param duration [required] Duration for the product
	 */
	public OvhItem cart_cartId_domain_POST(String cartId, String domain, String offerId, Long quantity, String duration) throws IOException {
		String qPath = "/order/cart/{cartId}/domain";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "offerId", offerId);
		addBody(o, "quantity", quantity);
		addBody(o, "duration", duration);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about domain names options
	 * 
	 * REST: GET /order/cart/{cartId}/domain/options
	 * @param cartId [required] Cart identifier
	 * @param domain [required] Domain name linked to the option
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_domain_options_GET(String cartId, String domain) throws IOException {
		String qPath = "/order/cart/{cartId}/domain/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "domain", domain);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new domain name option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/domain/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a domain name option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_domain_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/domain/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get a summary of your current order
	 * 
	 * REST: GET /order/cart/{cartId}/summary
	 * @param cartId [required] Cart identifier
	 */
	public OvhOrder cart_cartId_summary_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/summary";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get informations about a domain name transfer
	 * 
	 * REST: GET /order/cart/{cartId}/domainTransfer
	 * @param cartId [required] Cart identifier
	 * @param domain [required] Domain name requested
	 */
	public ArrayList<OvhProductInformation> cart_cartId_domainTransfer_GET(String cartId, String domain) throws IOException {
		String qPath = "/order/cart/{cartId}/domainTransfer";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "domain", domain);
		String resp = execN("GET", qPath);
		return convertTo(resp, t6);
	}

	/**
	 * Post a new domain tranfer in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/domainTransfer
	 * @param cartId [required] Cart identifier
	 * @param domain [required] Domain name to order
	 * @param offerId [required] Offer unique identifier
	 * @param quantity [required] Quantity to order
	 * @param duration [required] Duration for the product
	 */
	public OvhItem cart_cartId_domainTransfer_POST(String cartId, String domain, String offerId, Long quantity, String duration) throws IOException {
		String qPath = "/order/cart/{cartId}/domainTransfer";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "offerId", offerId);
		addBody(o, "quantity", quantity);
		addBody(o, "duration", duration);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about domain names transfer options
	 * 
	 * REST: GET /order/cart/{cartId}/domainTransfer/options
	 * @param cartId [required] Cart identifier
	 * @param domain [required] Domain name linked to the option
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_domainTransfer_options_GET(String cartId, String domain) throws IOException {
		String qPath = "/order/cart/{cartId}/domainTransfer/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "domain", domain);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new domain name transfer option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/domainTransfer/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a domain name option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_domainTransfer_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/domainTransfer/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about a dedicated server
	 * 
	 * REST: GET /order/cart/{cartId}/dedicated
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Filter the value of planCode property (=)
	 * @param family [required] Filter the value of family property (=)
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_dedicated_GET(String cartId, String family, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/dedicated";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "family", family);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new dedicated server item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/dedicated
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of a dedicated server offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_dedicated_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/dedicated";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about dedicated server options
	 * 
	 * REST: GET /order/cart/{cartId}/dedicated/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of a dedicated server offer
	 * @param family [required] Filter the value of family property (=)
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_dedicated_options_GET(String cartId, String family, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/dedicated/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "family", family);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new dedicated server option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/dedicated/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a dedicated server offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_dedicated_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/dedicated/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about VPS offers
	 * 
	 * REST: GET /order/cart/{cartId}/vps
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_vps_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/vps";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new VPS item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/vps
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the VPS offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_vps_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/vps";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about VPS options
	 * 
	 * REST: GET /order/cart/{cartId}/vps/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the VPS you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_vps_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/vps/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new VPS option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/vps/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a VPS option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_vps_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/vps/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Ceph as a Service offers
	 * 
	 * REST: GET /order/cart/{cartId}/cephaas
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_cephaas_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/cephaas";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Ceph as a Service item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/cephaas
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Ceph as a Service offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_cephaas_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/cephaas";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Ceph as a Service options
	 * 
	 * REST: GET /order/cart/{cartId}/cephaas/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Ceph as a Service you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_cephaas_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/cephaas/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new Ceph as a Service option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/cephaas/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a Ceph as a Service option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_cephaas_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/cephaas/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about webHosting offers
	 * 
	 * REST: GET /order/cart/{cartId}/webHosting
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhWebHostingProductInformation> cart_cartId_webHosting_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/webHosting";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhWebHostingProductInformation>> t7 = new TypeReference<ArrayList<OvhWebHostingProductInformation>>() {};

	/**
	 * Post a new webHosting item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/webHosting
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the webHosting offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_webHosting_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/webHosting";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about webHosting options
	 * 
	 * REST: GET /order/cart/{cartId}/webHosting/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the webHosting you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_webHosting_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/webHosting/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new webHosting option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/webHosting/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a webHosting option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_webHosting_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/webHosting/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about IP Load-Balancing offers
	 * 
	 * REST: GET /order/cart/{cartId}/ipLoadbalancing
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_ipLoadbalancing_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/ipLoadbalancing";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new IP Load-Balancing item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/ipLoadbalancing
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the IP Load-Balancing offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_ipLoadbalancing_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/ipLoadbalancing";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about IP Load-Balancing options
	 * 
	 * REST: GET /order/cart/{cartId}/ipLoadbalancing/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the IP Load-Balancing you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_ipLoadbalancing_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/ipLoadbalancing/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new IP Load-Balancing option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/ipLoadbalancing/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a IP Load-Balancing option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_ipLoadbalancing_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/ipLoadbalancing/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about PaaS Database offers
	 * 
	 * REST: GET /order/cart/{cartId}/paasdb
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_paasdb_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/paasdb";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new PaaS Database item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/paasdb
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the PaaS Database offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_paasdb_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/paasdb";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get prices and contracts information for your cart
	 * 
	 * REST: GET /order/cart/{cartId}/checkout
	 * @param cartId [required] Cart identifier
	 */
	public OvhOrder cart_cartId_checkout_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/checkout";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Validate your shopping and create order
	 * 
	 * REST: POST /order/cart/{cartId}/checkout
	 * @param cartId [required] Cart identifier
	 * @param waiveRetractationPeriod [required] Indicates that order will be processed with waiving retractation period
	 */
	public OvhOrder cart_cartId_checkout_POST(String cartId, Boolean waiveRetractationPeriod) throws IOException {
		String qPath = "/order/cart/{cartId}/checkout";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "waiveRetractationPeriod", waiveRetractationPeriod);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get informations about PaaS Monitoring offers
	 * 
	 * REST: GET /order/cart/{cartId}/paasmon
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_paasmon_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/paasmon";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new PaaS Monitoring item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/paasmon
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the PaaS Monitoring offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_paasmon_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/paasmon";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Domain packs offers (AllDom)
	 * 
	 * REST: GET /order/cart/{cartId}/domainPacks
	 * @param cartId [required] Cart identifier
	 * @param domain [required] Domain name requested
	 */
	public ArrayList<OvhDomainPacksProductInformation> cart_cartId_domainPacks_GET(String cartId, String domain) throws IOException {
		String qPath = "/order/cart/{cartId}/domainPacks";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "domain", domain);
		String resp = execN("GET", qPath);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhDomainPacksProductInformation>> t8 = new TypeReference<ArrayList<OvhDomainPacksProductInformation>>() {};

	/**
	 * Post a new Domain Packs item (AllDom) in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/domainPacks
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Domain Packs offer (AllDom)
	 * @param domain [required] Domain name to order
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_domainPacks_POST(String cartId, String planCode, String domain, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/domainPacks";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "domain", domain);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about EmailPro offers
	 * 
	 * REST: GET /order/cart/{cartId}/emailpro
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_emailpro_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/emailpro";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new EmailPro item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/emailpro
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the EmailPro offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_emailpro_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/emailpro";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about EmailPro options
	 * 
	 * REST: GET /order/cart/{cartId}/emailpro/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the EmailPro you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_emailpro_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/emailpro/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new EmailPro option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/emailpro/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a EmailPro option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_emailpro_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/emailpro/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about PaaS Queue offers
	 * 
	 * REST: GET /order/cart/{cartId}/paasqueue
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_paasqueue_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/paasqueue";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new PaaS Queue item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/paasqueue
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the PaaS Queue offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_paasqueue_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/paasqueue";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Exchange offers
	 * 
	 * REST: GET /order/cart/{cartId}/exchange
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_exchange_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/exchange";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Exchange item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/exchange
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Exchange offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_exchange_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/exchange";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Exchange options
	 * 
	 * REST: GET /order/cart/{cartId}/exchange/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Exchange you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_exchange_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/exchange/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new Exchange option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/exchange/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item to be linked
	 * @param planCode [required] Identifier of a Exchange option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_exchange_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/exchange/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Exchange Enterprise offers
	 * 
	 * REST: GET /order/cart/{cartId}/exchangeEnterprise
	 * @param cartId [required] Cart identifier
	 */
	public ArrayList<OvhGenericProductDefinition> cart_cartId_exchangeEnterprise_GET(String cartId) throws IOException {
		String qPath = "/order/cart/{cartId}/exchangeEnterprise";
		qPath = qPath.replace("{cartId}", cartId);
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Post a new Exchange Enterprise item in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/exchangeEnterprise
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Exchange Enterprise offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_exchangeEnterprise_POST(String cartId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/exchangeEnterprise";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get informations about Exchange Enterprise options
	 * 
	 * REST: GET /order/cart/{cartId}/exchangeEnterprise/options
	 * @param cartId [required] Cart identifier
	 * @param planCode [required] Identifier of the Exchange Enterprise offer you want to consult options
	 */
	public ArrayList<OvhGenericOptionDefinition> cart_cartId_exchangeEnterprise_options_GET(String cartId, String planCode) throws IOException {
		String qPath = "/order/cart/{cartId}/exchangeEnterprise/options";
		qPath = qPath.replace("{cartId}", cartId);
		qPath = query(qPath, "planCode", planCode);
		String resp = execN("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Post a new Exchange Enterprise option in your cart
	 * 
	 * REST: POST /order/cart/{cartId}/exchangeEnterprise/options
	 * @param cartId [required] Cart identifier
	 * @param itemId [required] Cart item offer parent of the option
	 * @param planCode [required] Identifier of a Exchange Enterprise option offer
	 * @param duration [required] Duration selected for the purchase of the product
	 * @param pricingMode [required] Pricing mode selected for the purchase of the product
	 * @param quantity [required] Quantity of product desired
	 */
	public OvhItem cart_cartId_exchangeEnterprise_options_POST(String cartId, Long itemId, String planCode, String duration, String pricingMode, Long quantity) throws IOException {
		String qPath = "/order/cart/{cartId}/exchangeEnterprise/options";
		qPath = qPath.replace("{cartId}", cartId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "itemId", itemId);
		addBody(o, "planCode", planCode);
		addBody(o, "duration", duration);
		addBody(o, "pricingMode", pricingMode);
		addBody(o, "quantity", quantity);
		String resp = execN("POST", qPath, o);
		return convertTo(resp, OvhItem.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/veeamCloudConnect/{serviceName}
	 * @param serviceName [required]
	 */
	public ArrayList<String> veeamCloudConnect_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/veeamCloudConnect/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'upgrade' option
	 * 
	 * REST: GET /order/veeamCloudConnect/{serviceName}/upgrade
	 * @param offer [required] The offer on which you want to be upgraded
	 * @param serviceName [required]
	 */
	public ArrayList<String> veeamCloudConnect_serviceName_upgrade_GET(String serviceName, OvhOffer offer) throws IOException {
		String qPath = "/order/veeamCloudConnect/{serviceName}/upgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "offer", offer);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/veeamCloudConnect/{serviceName}/upgrade/{duration}
	 * @param offer [required] The offer on which you want to be upgraded
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder veeamCloudConnect_serviceName_upgrade_duration_GET(String serviceName, String duration, OvhOffer offer) throws IOException {
		String qPath = "/order/veeamCloudConnect/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "offer", offer);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/veeamCloudConnect/{serviceName}/upgrade/{duration}
	 * @param offer [required] The offer on which you want to be upgraded
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder veeamCloudConnect_serviceName_upgrade_duration_POST(String serviceName, String duration, OvhOffer offer) throws IOException {
		String qPath = "/order/veeamCloudConnect/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "offer", offer);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/veeamCloudConnect
	 */
	public ArrayList<String> veeamCloudConnect_GET() throws IOException {
		String qPath = "/order/veeamCloudConnect";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}
	 * @param serviceName [required]
	 */
	public ArrayList<String> dedicatedCloud_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'ip' option
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/ip
	 * @param usage [required] Basic information of how will this bloc be used (as "web","ssl","cloud" or other things)
	 * @param country [required] This Ip block country
	 * @param estimatedClientsNumber [required] How much clients would be hosted on those ips ?
	 * @param description [required] Information visible on whois (minimum 3 and maximum 250 alphanumeric characters)
	 * @param size [required] The network ranges orderable
	 * @param networkName [required] Information visible on whois (between 2 and maximum 20 alphanumeric characters)
	 * @param serviceName [required]
	 */
	public ArrayList<String> dedicatedCloud_serviceName_ip_GET(String serviceName, OvhIpCountriesEnum country, String description, Long estimatedClientsNumber, String networkName, OvhOrderableIpBlockRangeEnum size, String usage) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/ip";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "description", description);
		qPath = query(qPath, "estimatedClientsNumber", estimatedClientsNumber);
		qPath = query(qPath, "networkName", networkName);
		qPath = query(qPath, "size", size);
		qPath = query(qPath, "usage", usage);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/ip/{duration}
	 * @param usage [required] Basic information of how will this bloc be used (as "web","ssl","cloud" or other things)
	 * @param country [required] This Ip block country
	 * @param estimatedClientsNumber [required] How much clients would be hosted on those ips ?
	 * @param description [required] Information visible on whois (minimum 3 and maximum 250 alphanumeric characters)
	 * @param size [required] The network ranges orderable
	 * @param networkName [required] Information visible on whois (between 2 and maximum 20 alphanumeric characters)
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_ip_duration_GET(String serviceName, String duration, OvhIpCountriesEnum country, String description, Long estimatedClientsNumber, String networkName, OvhOrderableIpBlockRangeEnum size, String usage) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/ip/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "description", description);
		qPath = query(qPath, "estimatedClientsNumber", estimatedClientsNumber);
		qPath = query(qPath, "networkName", networkName);
		qPath = query(qPath, "size", size);
		qPath = query(qPath, "usage", usage);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicatedCloud/{serviceName}/ip/{duration}
	 * @param usage [required] Basic information of how will this bloc be used (as "web","ssl","cloud" or other things)
	 * @param country [required] This Ip block country
	 * @param estimatedClientsNumber [required] How much clients would be hosted on those ips ?
	 * @param description [required] Information visible on whois (minimum 3 and maximum 250 alphanumeric characters)
	 * @param size [required] The network ranges orderable
	 * @param networkName [required] Information visible on whois (between 2 and maximum 20 alphanumeric characters)
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_ip_duration_POST(String serviceName, String duration, String usage, OvhIpCountriesEnum country, Long estimatedClientsNumber, String description, OvhOrderableIpBlockRangeEnum size, String networkName) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/ip/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "usage", usage);
		addBody(o, "country", country);
		addBody(o, "estimatedClientsNumber", estimatedClientsNumber);
		addBody(o, "description", description);
		addBody(o, "size", size);
		addBody(o, "networkName", networkName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'filer' option
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/filer
	 * @param quantity [required] Quantity of filer you want to order (default 1)
	 * @param name [required] Filer profile you want to order ("name" field in a profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles)
	 * @param datacenterId [required] Datacenter where the filer will be mounted (if not precised, will be mounted in each Datacenter of this Private Cloud)
	 * @param serviceName [required]
	 */
	public ArrayList<String> dedicatedCloud_serviceName_filer_GET(String serviceName, Long datacenterId, String name, Long quantity) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/filer";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "datacenterId", datacenterId);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/filer/{duration}
	 * @param quantity [required] Quantity of filer you want to order (default 1)
	 * @param name [required] Filer profile you want to order ("name" field in a profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles)
	 * @param datacenterId [required] Datacenter where the filer will be mounted (if not precised, will be mounted in each Datacenter of this Private Cloud)
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_filer_duration_GET(String serviceName, String duration, Long datacenterId, String name, Long quantity) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/filer/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "datacenterId", datacenterId);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicatedCloud/{serviceName}/filer/{duration}
	 * @param quantity [required] Quantity of filer you want to order (default 1)
	 * @param name [required] Filer profile you want to order ("name" field in a profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableFilerProfiles)
	 * @param datacenterId [required] Datacenter where the filer will be mounted (if not precised, will be mounted in each Datacenter of this Private Cloud)
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_filer_duration_POST(String serviceName, String duration, Long quantity, String name, Long datacenterId) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/filer/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		addBody(o, "name", name);
		addBody(o, "datacenterId", datacenterId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'host' option
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/host
	 * @param quantity [required] Quantity of hosts you want to order (default 1)
	 * @param name [required] Host profile you want to order ("name" field of a Profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles)
	 * @param datacenterId [required] Datacenter where the Host will be added
	 * @param serviceName [required]
	 */
	public ArrayList<String> dedicatedCloud_serviceName_host_GET(String serviceName, Long datacenterId, String name, Long quantity) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/host";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "datacenterId", datacenterId);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/host/{duration}
	 * @param quantity [required] Quantity of hosts you want to order (default 1)
	 * @param name [required] Host profile you want to order ("name" field of a Profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles)
	 * @param datacenterId [required] Datacenter where the Host will be added
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_host_duration_GET(String serviceName, String duration, Long datacenterId, String name, Long quantity) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/host/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "datacenterId", datacenterId);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicatedCloud/{serviceName}/host/{duration}
	 * @param quantity [required] Quantity of hosts you want to order (default 1)
	 * @param name [required] Host profile you want to order ("name" field of a Profile returned by /dedicatedCloud/{serviceName}/datacenter/{datacenterId}/orderableHostProfiles)
	 * @param datacenterId [required] Datacenter where the Host will be added
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_host_duration_POST(String serviceName, String duration, Long quantity, String name, Long datacenterId) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/host/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		addBody(o, "name", name);
		addBody(o, "datacenterId", datacenterId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'upgradeRessource' option
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/upgradeRessource
	 * @param upgradedRessourceId [required] The id of a particular ressource you want to upgrade in your Private Cloud (useless for "all" UpgradeRessourceTypeEnum)
	 * @param upgradedRessourceType [required] The type of ressource you want to upgrade.
	 * @param upgradeType [required] The type of upgrade you want to process on the ressource(s)
	 * @param serviceName [required]
	 */
	public ArrayList<String> dedicatedCloud_serviceName_upgradeRessource_GET(String serviceName, OvhUpgradeTypeEnum upgradeType, Long upgradedRessourceId, OvhUpgradeRessourceTypeEnum upgradedRessourceType) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/upgradeRessource";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "upgradeType", upgradeType);
		qPath = query(qPath, "upgradedRessourceId", upgradedRessourceId);
		qPath = query(qPath, "upgradedRessourceType", upgradedRessourceType);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/upgradeRessource/{duration}
	 * @param upgradedRessourceId [required] The id of a particular ressource you want to upgrade in your Private Cloud (useless for "all" UpgradeRessourceTypeEnum)
	 * @param upgradedRessourceType [required] The type of ressource you want to upgrade.
	 * @param upgradeType [required] The type of upgrade you want to process on the ressource(s)
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_upgradeRessource_duration_GET(String serviceName, String duration, OvhUpgradeTypeEnum upgradeType, Long upgradedRessourceId, OvhUpgradeRessourceTypeEnum upgradedRessourceType) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/upgradeRessource/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "upgradeType", upgradeType);
		qPath = query(qPath, "upgradedRessourceId", upgradedRessourceId);
		qPath = query(qPath, "upgradedRessourceType", upgradedRessourceType);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicatedCloud/{serviceName}/upgradeRessource/{duration}
	 * @param upgradedRessourceId [required] The id of a particular ressource you want to upgrade in your Private Cloud (useless for "all" UpgradeRessourceTypeEnum)
	 * @param upgradedRessourceType [required] The type of ressource you want to upgrade.
	 * @param upgradeType [required] The type of upgrade you want to process on the ressource(s)
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_upgradeRessource_duration_POST(String serviceName, String duration, Long upgradedRessourceId, OvhUpgradeRessourceTypeEnum upgradedRessourceType, OvhUpgradeTypeEnum upgradeType) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/upgradeRessource/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "upgradedRessourceId", upgradedRessourceId);
		addBody(o, "upgradedRessourceType", upgradedRessourceType);
		addBody(o, "upgradeType", upgradeType);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/spla
	 * @param serviceName [required]
	 */
	public OvhOrder dedicatedCloud_serviceName_spla_GET(String serviceName) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/spla";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicatedCloud/{serviceName}/spla
	 * @param serviceName [required]
	 */
	public OvhOrder dedicatedCloud_serviceName_spla_POST(String serviceName) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/spla";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'additionalBandwidth' option
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/additionalBandwidth
	 * @param bandwidth [required] How much additional bandwidth do you want ?
	 * @param serviceName [required]
	 */
	public ArrayList<String> dedicatedCloud_serviceName_additionalBandwidth_GET(String serviceName, OvhAdditionalBandwidthEnum bandwidth) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/additionalBandwidth";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "bandwidth", bandwidth);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/dedicatedCloud/{serviceName}/additionalBandwidth/{duration}
	 * @param bandwidth [required] How much additional bandwidth do you want ?
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_additionalBandwidth_duration_GET(String serviceName, String duration, OvhAdditionalBandwidthEnum bandwidth) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/additionalBandwidth/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "bandwidth", bandwidth);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/dedicatedCloud/{serviceName}/additionalBandwidth/{duration}
	 * @param bandwidth [required] How much additional bandwidth do you want ?
	 * @param serviceName [required]
	 * @param duration [required] Duration
	 */
	public OvhOrder dedicatedCloud_serviceName_additionalBandwidth_duration_POST(String serviceName, String duration, OvhAdditionalBandwidthEnum bandwidth) throws IOException {
		String qPath = "/order/dedicatedCloud/{serviceName}/additionalBandwidth/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "bandwidth", bandwidth);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/dedicatedCloud
	 */
	public ArrayList<String> dedicatedCloud_GET() throws IOException {
		String qPath = "/order/dedicatedCloud";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/vps/{serviceName}
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/vps/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'ftpbackup' option
	 * 
	 * REST: GET /order/vps/{serviceName}/ftpbackup
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_ftpbackup_GET(String serviceName) throws IOException {
		String qPath = "/order/vps/{serviceName}/ftpbackup";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/ftpbackup/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_ftpbackup_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/ftpbackup/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/ftpbackup/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_ftpbackup_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/ftpbackup/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'ip' option
	 * 
	 * REST: GET /order/vps/{serviceName}/ip
	 * @param country [required] Choose a geolocation for your IP Address
	 * @param number [required] Number of IPs to order
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_ip_GET(String serviceName, OvhGeolocationEnum country, Long number) throws IOException {
		String qPath = "/order/vps/{serviceName}/ip";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "number", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/ip/{duration}
	 * @param country [required] Choose a geolocation for your IP Address
	 * @param number [required] Number of IPs to order
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_ip_duration_GET(String serviceName, String duration, OvhGeolocationEnum country, Long number) throws IOException {
		String qPath = "/order/vps/{serviceName}/ip/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "country", country);
		qPath = query(qPath, "number", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/ip/{duration}
	 * @param country [required] Choose a geolocation for your IP Address
	 * @param number [required] Number of IPs to order
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_ip_duration_POST(String serviceName, String duration, OvhGeolocationEnum country, Long number) throws IOException {
		String qPath = "/order/vps/{serviceName}/ip/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "country", country);
		addBody(o, "number", number);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'windows' option
	 * 
	 * REST: GET /order/vps/{serviceName}/windows
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_windows_GET(String serviceName) throws IOException {
		String qPath = "/order/vps/{serviceName}/windows";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/windows/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_windows_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/windows/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/windows/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_windows_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/windows/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'additionalDisk' option
	 * 
	 * REST: GET /order/vps/{serviceName}/additionalDisk
	 * @param additionalDiskSize [required] Size of the additional disk
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_additionalDisk_GET(String serviceName, OvhAdditionalDiskSizeEnum additionalDiskSize) throws IOException {
		String qPath = "/order/vps/{serviceName}/additionalDisk";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "additionalDiskSize", additionalDiskSize);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/additionalDisk/{duration}
	 * @param additionalDiskSize [required] Size of the additional disk
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_additionalDisk_duration_GET(String serviceName, String duration, OvhAdditionalDiskSizeEnum additionalDiskSize) throws IOException {
		String qPath = "/order/vps/{serviceName}/additionalDisk/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "additionalDiskSize", additionalDiskSize);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/additionalDisk/{duration}
	 * @param additionalDiskSize [required] Size of the additional disk
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_additionalDisk_duration_POST(String serviceName, String duration, OvhAdditionalDiskSizeEnum additionalDiskSize) throws IOException {
		String qPath = "/order/vps/{serviceName}/additionalDisk/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "additionalDiskSize", additionalDiskSize);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'cpanel' option
	 * 
	 * REST: GET /order/vps/{serviceName}/cpanel
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_cpanel_GET(String serviceName) throws IOException {
		String qPath = "/order/vps/{serviceName}/cpanel";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/cpanel/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_cpanel_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/cpanel/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/cpanel/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_cpanel_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/cpanel/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'automatedBackup' option
	 * 
	 * REST: GET /order/vps/{serviceName}/automatedBackup
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_automatedBackup_GET(String serviceName) throws IOException {
		String qPath = "/order/vps/{serviceName}/automatedBackup";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/automatedBackup/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_automatedBackup_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/automatedBackup/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/automatedBackup/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_automatedBackup_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/automatedBackup/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'upgrade' option
	 * 
	 * REST: GET /order/vps/{serviceName}/upgrade
	 * @param model [required] Model
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_upgrade_GET(String serviceName, String model) throws IOException {
		String qPath = "/order/vps/{serviceName}/upgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "model", model);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/upgrade/{duration}
	 * @param model [required] Model
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_upgrade_duration_GET(String serviceName, String duration, String model) throws IOException {
		String qPath = "/order/vps/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "model", model);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/upgrade/{duration}
	 * @param model [required] Model
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_upgrade_duration_POST(String serviceName, String duration, String model) throws IOException {
		String qPath = "/order/vps/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "model", model);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'snapshot' option
	 * 
	 * REST: GET /order/vps/{serviceName}/snapshot
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_snapshot_GET(String serviceName) throws IOException {
		String qPath = "/order/vps/{serviceName}/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/snapshot/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_snapshot_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/snapshot/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/snapshot/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_snapshot_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/snapshot/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'veeam' option
	 * 
	 * REST: GET /order/vps/{serviceName}/veeam
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_veeam_GET(String serviceName) throws IOException {
		String qPath = "/order/vps/{serviceName}/veeam";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/veeam/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_veeam_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/veeam/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/veeam/{duration}
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_veeam_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/vps/{serviceName}/veeam/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'plesk' option
	 * 
	 * REST: GET /order/vps/{serviceName}/plesk
	 * @param domainNumber [required] Domain number you want to order a licence for
	 * @param serviceName [required] The internal name of your VPS offer
	 */
	public ArrayList<String> vps_serviceName_plesk_GET(String serviceName, OvhPleskLicenseDomainNumberEnum domainNumber) throws IOException {
		String qPath = "/order/vps/{serviceName}/plesk";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "domainNumber", domainNumber);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vps/{serviceName}/plesk/{duration}
	 * @param domainNumber [required] Domain number you want to order a licence for
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_plesk_duration_GET(String serviceName, String duration, OvhPleskLicenseDomainNumberEnum domainNumber) throws IOException {
		String qPath = "/order/vps/{serviceName}/plesk/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "domainNumber", domainNumber);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vps/{serviceName}/plesk/{duration}
	 * @param domainNumber [required] Domain number you want to order a licence for
	 * @param serviceName [required] The internal name of your VPS offer
	 * @param duration [required] Duration
	 */
	public OvhOrder vps_serviceName_plesk_duration_POST(String serviceName, String duration, OvhPleskLicenseDomainNumberEnum domainNumber) throws IOException {
		String qPath = "/order/vps/{serviceName}/plesk/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domainNumber", domainNumber);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/vps
	 */
	public ArrayList<String> vps_GET() throws IOException {
		String qPath = "/order/vps";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/hosting/web/{serviceName}
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> hosting_web_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'cdn' option
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/cdn
	 * @param offer [required] Cdn offers you can add to your hosting
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> hosting_web_serviceName_cdn_GET(String serviceName, OvhCdnOfferEnum offer) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/cdn";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "offer", offer);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/cdn/{duration}
	 * @param offer [required] Cdn offers you can add to your hosting
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_cdn_duration_GET(String serviceName, String duration, OvhCdnOfferEnum offer) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/cdn/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "offer", offer);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hosting/web/{serviceName}/cdn/{duration}
	 * @param offer [required] Cdn offers you can add to your hosting
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_cdn_duration_POST(String serviceName, String duration, OvhCdnOfferEnum offer) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/cdn/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "offer", offer);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'bandwidth' option
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/bandwidth
	 * @param traffic [required] Available offers to increase bandwidth quota (unit: GB)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> hosting_web_serviceName_bandwidth_GET(String serviceName, OvhBandwidthOfferEnum traffic) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/bandwidth";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "traffic", traffic);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/bandwidth/{duration}
	 * @param traffic [required] Available offers to increase bandwidth quota (unit: GB)
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_bandwidth_duration_GET(String serviceName, String duration, OvhBandwidthOfferEnum traffic) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/bandwidth/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "traffic", traffic);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hosting/web/{serviceName}/bandwidth/{duration}
	 * @param traffic [required] Available offers to increase bandwidth quota (unit: GB)
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_bandwidth_duration_POST(String serviceName, String duration, OvhBandwidthOfferEnum traffic) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/bandwidth/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "traffic", traffic);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'changeMainDomain' option
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/changeMainDomain
	 * @param domain [required] New domain for change the main domain
	 * @param mxplan [required] MX plan linked to the odl main domain
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> hosting_web_serviceName_changeMainDomain_GET(String serviceName, String domain, OvhMxPlanEnum mxplan) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/changeMainDomain";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "domain", domain);
		qPath = query(qPath, "mxplan", mxplan);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/changeMainDomain/{duration}
	 * @param domain [required] New domain for change the main domain
	 * @param mxplan [required] MX plan linked to the odl main domain
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_changeMainDomain_duration_GET(String serviceName, String duration, String domain, OvhMxPlanEnum mxplan) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/changeMainDomain/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "domain", domain);
		qPath = query(qPath, "mxplan", mxplan);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hosting/web/{serviceName}/changeMainDomain/{duration}
	 * @param domain [required] New domain for change the main domain
	 * @param mxplan [required] MX plan linked to the odl main domain
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_changeMainDomain_duration_POST(String serviceName, String duration, String domain, OvhMxPlanEnum mxplan) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/changeMainDomain/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "mxplan", mxplan);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'ssl' option
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/ssl
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> hosting_web_serviceName_ssl_GET(String serviceName) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/ssl/{duration}
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_ssl_duration_GET(String serviceName, String duration) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/ssl/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hosting/web/{serviceName}/ssl/{duration}
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_ssl_duration_POST(String serviceName, String duration) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/ssl/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'extraSqlPerso' option
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/extraSqlPerso
	 * @param offer [required] Offers you can add to your hosting
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> hosting_web_serviceName_extraSqlPerso_GET(String serviceName, OvhSqlPersoOfferEnum offer) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/extraSqlPerso";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "offer", offer);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/extraSqlPerso/{duration}
	 * @param offer [required] Offers you can add to your hosting
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_extraSqlPerso_duration_GET(String serviceName, String duration, OvhSqlPersoOfferEnum offer) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/extraSqlPerso/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "offer", offer);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hosting/web/{serviceName}/extraSqlPerso/{duration}
	 * @param offer [required] Offers you can add to your hosting
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_extraSqlPerso_duration_POST(String serviceName, String duration, OvhSqlPersoOfferEnum offer) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/extraSqlPerso/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "offer", offer);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'upgrade' option
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/upgrade
	 * @param waiveRetractationPeriod [required] Indicates that order will be processed with waiving retractation period
	 * @param offer [required] New offers for your hosting account
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> hosting_web_serviceName_upgrade_GET(String serviceName, net.minidev.ovh.api.hosting.web.OvhOfferEnum offer, Boolean waiveRetractationPeriod) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/upgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "offer", offer);
		qPath = query(qPath, "waiveRetractationPeriod", waiveRetractationPeriod);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hosting/web/{serviceName}/upgrade/{duration}
	 * @param waiveRetractationPeriod [required] Indicates that order will be processed with waiving retractation period
	 * @param offer [required] New offers for your hosting account
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_upgrade_duration_GET(String serviceName, String duration, net.minidev.ovh.api.hosting.web.OvhOfferEnum offer, Boolean waiveRetractationPeriod) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "offer", offer);
		qPath = query(qPath, "waiveRetractationPeriod", waiveRetractationPeriod);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hosting/web/{serviceName}/upgrade/{duration}
	 * @param waiveRetractationPeriod [required] Indicates that order will be processed with waiving retractation period
	 * @param offer [required] New offers for your hosting account
	 * @param serviceName [required] The internal name of your hosting
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_serviceName_upgrade_duration_POST(String serviceName, String duration, Boolean waiveRetractationPeriod, net.minidev.ovh.api.hosting.web.OvhOfferEnum offer) throws IOException {
		String qPath = "/order/hosting/web/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "waiveRetractationPeriod", waiveRetractationPeriod);
		addBody(o, "offer", offer);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/hosting/web
	 */
	public ArrayList<String> hosting_web_GET() throws IOException {
		String qPath = "/order/hosting/web";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/hosting/web/new
	 * @param waiveRetractationPeriod [required] Indicates that order will be processed with waiving retractation period
	 * @param dnsZone [required] Dns zone modification possibilities ( by default : RESET_ALL )
	 * @param domain [required] Domain name which will be linked to this hosting account
	 * @param offer [required] Offer for your new hosting account
	 * @param module [required] Module installation ready to use
	 */
	public ArrayList<String> hosting_web_new_GET(OvhDnsZoneEnum dnsZone, String domain, OvhOrderableNameEnum module, net.minidev.ovh.api.hosting.web.OvhOfferEnum offer, Boolean waiveRetractationPeriod) throws IOException {
		String qPath = "/order/hosting/web/new";
		qPath = query(qPath, "dnsZone", dnsZone);
		qPath = query(qPath, "domain", domain);
		qPath = query(qPath, "module", module);
		qPath = query(qPath, "offer", offer);
		qPath = query(qPath, "waiveRetractationPeriod", waiveRetractationPeriod);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hosting/web/new/{duration}
	 * @param waiveRetractationPeriod [required] Indicates that order will be processed with waiving retractation period
	 * @param dnsZone [required] Dns zone modification possibilities ( by default : RESET_ALL )
	 * @param domain [required] Domain name which will be linked to this hosting account
	 * @param offer [required] Offer for your new hosting account
	 * @param module [required] Module installation ready to use
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_new_duration_GET(String duration, OvhDnsZoneEnum dnsZone, String domain, OvhOrderableNameEnum module, net.minidev.ovh.api.hosting.web.OvhOfferEnum offer, Boolean waiveRetractationPeriod) throws IOException {
		String qPath = "/order/hosting/web/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "dnsZone", dnsZone);
		qPath = query(qPath, "domain", domain);
		qPath = query(qPath, "module", module);
		qPath = query(qPath, "offer", offer);
		qPath = query(qPath, "waiveRetractationPeriod", waiveRetractationPeriod);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hosting/web/new/{duration}
	 * @param waiveRetractationPeriod [required] Indicates that order will be processed with waiving retractation period
	 * @param dnsZone [required] Dns zone modification possibilities ( by default : RESET_ALL )
	 * @param domain [required] Domain name which will be linked to this hosting account
	 * @param offer [required] Offer for your new hosting account
	 * @param module [required] Module installation ready to use
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_web_new_duration_POST(String duration, Boolean waiveRetractationPeriod, OvhDnsZoneEnum dnsZone, String domain, net.minidev.ovh.api.hosting.web.OvhOfferEnum offer, OvhOrderableNameEnum module) throws IOException {
		String qPath = "/order/hosting/web/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "waiveRetractationPeriod", waiveRetractationPeriod);
		addBody(o, "dnsZone", dnsZone);
		addBody(o, "domain", domain);
		addBody(o, "offer", offer);
		addBody(o, "module", module);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/hosting/privateDatabase/{serviceName}
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<String> hosting_privateDatabase_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/hosting/privateDatabase/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'ram' option
	 * 
	 * REST: GET /order/hosting/privateDatabase/{serviceName}/ram
	 * @param ram [required] Private database ram size
	 * @param serviceName [required] The internal name of your private database
	 */
	public ArrayList<String> hosting_privateDatabase_serviceName_ram_GET(String serviceName, OvhAvailableRamSizeEnum ram) throws IOException {
		String qPath = "/order/hosting/privateDatabase/{serviceName}/ram";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "ram", ram);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hosting/privateDatabase/{serviceName}/ram/{duration}
	 * @param ram [required] Private database ram size
	 * @param serviceName [required] The internal name of your private database
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_privateDatabase_serviceName_ram_duration_GET(String serviceName, String duration, OvhAvailableRamSizeEnum ram) throws IOException {
		String qPath = "/order/hosting/privateDatabase/{serviceName}/ram/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "ram", ram);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hosting/privateDatabase/{serviceName}/ram/{duration}
	 * @param ram [required] Private database ram size
	 * @param serviceName [required] The internal name of your private database
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_privateDatabase_serviceName_ram_duration_POST(String serviceName, String duration, OvhAvailableRamSizeEnum ram) throws IOException {
		String qPath = "/order/hosting/privateDatabase/{serviceName}/ram/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ram", ram);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/hosting/privateDatabase
	 */
	public ArrayList<String> hosting_privateDatabase_GET() throws IOException {
		String qPath = "/order/hosting/privateDatabase";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/hosting/privateDatabase/new
	 * @param datacenter [required] Datacenter to deploy this new private database
	 * @param version [required] Private database available versions
	 * @param ram [required] Private database ram size
	 */
	public ArrayList<String> hosting_privateDatabase_new_GET(OvhDatacenterEnum datacenter, OvhAvailableRamSizeEnum ram, OvhOrderableVersionEnum version) throws IOException {
		String qPath = "/order/hosting/privateDatabase/new";
		qPath = query(qPath, "datacenter", datacenter);
		qPath = query(qPath, "ram", ram);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hosting/privateDatabase/new/{duration}
	 * @param datacenter [required] Datacenter to deploy this new private database
	 * @param version [required] Private database available versions
	 * @param ram [required] Private database ram size
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_privateDatabase_new_duration_GET(String duration, OvhDatacenterEnum datacenter, OvhAvailableRamSizeEnum ram, OvhOrderableVersionEnum version) throws IOException {
		String qPath = "/order/hosting/privateDatabase/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "datacenter", datacenter);
		qPath = query(qPath, "ram", ram);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hosting/privateDatabase/new/{duration}
	 * @param datacenter [required] Datacenter to deploy this new private database
	 * @param version [required] Private database available versions
	 * @param ram [required] Private database ram size
	 * @param duration [required] Duration
	 */
	public OvhOrder hosting_privateDatabase_new_duration_POST(String duration, OvhDatacenterEnum datacenter, OvhOrderableVersionEnum version, OvhAvailableRamSizeEnum ram) throws IOException {
		String qPath = "/order/hosting/privateDatabase/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "datacenter", datacenter);
		addBody(o, "version", version);
		addBody(o, "ram", ram);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/ipLoadbalancing/{serviceName}
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> ipLoadbalancing_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/ipLoadbalancing/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/ipLoadbalancing/{serviceName}/ssl
	 * @param fqdn [required] The FQDN for which you want an SSL option. A DCV (Domain Control Validation) http request will be made to http://your_domain.abc, make sure this domain exists and resolves to your iplb ip before ordering
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhOrder ipLoadbalancing_serviceName_ssl_GET(String serviceName, String fqdn) throws IOException {
		String qPath = "/order/ipLoadbalancing/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "fqdn", fqdn);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/ipLoadbalancing/{serviceName}/ssl
	 * @param fqdn [required] The FQDN for which you want an SSL option. A DCV (Domain Control Validation) http request will be made to http://your_domain.abc, make sure this domain exists and resolves to your iplb ip before ordering
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhOrder ipLoadbalancing_serviceName_ssl_POST(String serviceName, String fqdn) throws IOException {
		String qPath = "/order/ipLoadbalancing/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "fqdn", fqdn);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'zone' option
	 * 
	 * REST: GET /order/ipLoadbalancing/{serviceName}/zone
	 * @param zone [required] Zones name you want to add to your iplb. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> ipLoadbalancing_serviceName_zone_GET(String serviceName, String[] zone) throws IOException {
		String qPath = "/order/ipLoadbalancing/{serviceName}/zone";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/ipLoadbalancing/{serviceName}/zone/{duration}
	 * @param zone [required] Zones name you want to add to your iplb. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param duration [required] Duration
	 */
	public OvhOrder ipLoadbalancing_serviceName_zone_duration_GET(String serviceName, String duration, String[] zone) throws IOException {
		String qPath = "/order/ipLoadbalancing/{serviceName}/zone/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/ipLoadbalancing/{serviceName}/zone/{duration}
	 * @param zone [required] Zones name you want to add to your iplb. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param duration [required] Duration
	 */
	public OvhOrder ipLoadbalancing_serviceName_zone_duration_POST(String serviceName, String duration, String[] zone) throws IOException {
		String qPath = "/order/ipLoadbalancing/{serviceName}/zone/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zone", zone);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/ipLoadbalancing
	 */
	public ArrayList<String> ipLoadbalancing_GET() throws IOException {
		String qPath = "/order/ipLoadbalancing";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/ipLoadbalancing/new
	 * @param zone [required] The zone(s) of your iplb. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 */
	public ArrayList<String> ipLoadbalancing_new_GET(String[] zone) throws IOException {
		String qPath = "/order/ipLoadbalancing/new";
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/ipLoadbalancing/new/{duration}
	 * @param zone [required] The zone(s) of your iplb. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param duration [required] Duration
	 */
	public OvhOrder ipLoadbalancing_new_duration_GET(String duration, String[] zone) throws IOException {
		String qPath = "/order/ipLoadbalancing/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/ipLoadbalancing/new/{duration}
	 * @param zone [required] The zone(s) of your iplb. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param duration [required] Duration
	 */
	public OvhOrder ipLoadbalancing_new_duration_POST(String duration, String[] zone) throws IOException {
		String qPath = "/order/ipLoadbalancing/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "zone", zone);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/license/worklight/{serviceName}
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public ArrayList<String> license_worklight_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/license/worklight/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'upgrade' option
	 * 
	 * REST: GET /order/license/worklight/{serviceName}/upgrade
	 * @param version [required] This license version
	 * @param serviceName [required] The name of your WorkLight license
	 */
	public ArrayList<String> license_worklight_serviceName_upgrade_GET(String serviceName, OvhWorkLightVersionEnum version) throws IOException {
		String qPath = "/order/license/worklight/{serviceName}/upgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/worklight/{serviceName}/upgrade/{duration}
	 * @param version [required] This license version
	 * @param serviceName [required] The name of your WorkLight license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_worklight_serviceName_upgrade_duration_GET(String serviceName, String duration, OvhWorkLightVersionEnum version) throws IOException {
		String qPath = "/order/license/worklight/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/worklight/{serviceName}/upgrade/{duration}
	 * @param version [required] This license version
	 * @param serviceName [required] The name of your WorkLight license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_worklight_serviceName_upgrade_duration_POST(String serviceName, String duration, OvhWorkLightVersionEnum version) throws IOException {
		String qPath = "/order/license/worklight/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/license/worklight
	 */
	public ArrayList<String> license_worklight_GET() throws IOException {
		String qPath = "/order/license/worklight";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/license/worklight/new
	 * @param lessThan1000Users [required] Does your company have less than 1000 potential users
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 */
	public ArrayList<String> license_worklight_new_GET(String ip, Boolean lessThan1000Users, OvhWorkLightVersionEnum version) throws IOException {
		String qPath = "/order/license/worklight/new";
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "lessThan1000Users", lessThan1000Users);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/worklight/new/{duration}
	 * @param lessThan1000Users [required] Does your company have less than 1000 potential users
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration [required] Duration
	 */
	public OvhOrder license_worklight_new_duration_GET(String duration, String ip, Boolean lessThan1000Users, OvhWorkLightVersionEnum version) throws IOException {
		String qPath = "/order/license/worklight/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "lessThan1000Users", lessThan1000Users);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/worklight/new/{duration}
	 * @param lessThan1000Users [required] Does your company have less than 1000 potential users
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration [required] Duration
	 */
	public OvhOrder license_worklight_new_duration_POST(String duration, Boolean lessThan1000Users, OvhWorkLightVersionEnum version, String ip) throws IOException {
		String qPath = "/order/license/worklight/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "lessThan1000Users", lessThan1000Users);
		addBody(o, "version", version);
		addBody(o, "ip", ip);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/license/cloudLinux/new
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 */
	public ArrayList<String> license_cloudLinux_new_GET(String ip, OvhCloudLinuxVersionEnum version) throws IOException {
		String qPath = "/order/license/cloudLinux/new";
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/cloudLinux/new/{duration}
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration [required] Duration
	 */
	public OvhOrder license_cloudLinux_new_duration_GET(String duration, String ip, OvhCloudLinuxVersionEnum version) throws IOException {
		String qPath = "/order/license/cloudLinux/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/cloudLinux/new/{duration}
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration [required] Duration
	 */
	public OvhOrder license_cloudLinux_new_duration_POST(String duration, OvhCloudLinuxVersionEnum version, String ip) throws IOException {
		String qPath = "/order/license/cloudLinux/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		addBody(o, "ip", ip);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/license/windows/{serviceName}
	 * @param serviceName [required] The name of your Windows license
	 */
	public ArrayList<String> license_windows_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/license/windows/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'upgrade' option
	 * 
	 * REST: GET /order/license/windows/{serviceName}/upgrade
	 * @param sqlVersion [required] The SQL Server version to enable on this license Windows license
	 * @param version [required] The windows version you want to enable on your windows license
	 * @param serviceName [required] The name of your Windows license
	 */
	public ArrayList<String> license_windows_serviceName_upgrade_GET(String serviceName, OvhWindowsSqlVersionEnum sqlVersion, OvhWindowsOsVersionEnum version) throws IOException {
		String qPath = "/order/license/windows/{serviceName}/upgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "sqlVersion", sqlVersion);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/windows/{serviceName}/upgrade/{duration}
	 * @param sqlVersion [required] The SQL Server version to enable on this license Windows license
	 * @param version [required] The windows version you want to enable on your windows license
	 * @param serviceName [required] The name of your Windows license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_windows_serviceName_upgrade_duration_GET(String serviceName, String duration, OvhWindowsSqlVersionEnum sqlVersion, OvhWindowsOsVersionEnum version) throws IOException {
		String qPath = "/order/license/windows/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "sqlVersion", sqlVersion);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/windows/{serviceName}/upgrade/{duration}
	 * @param sqlVersion [required] The SQL Server version to enable on this license Windows license
	 * @param version [required] The windows version you want to enable on your windows license
	 * @param serviceName [required] The name of your Windows license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_windows_serviceName_upgrade_duration_POST(String serviceName, String duration, OvhWindowsSqlVersionEnum sqlVersion, OvhWindowsOsVersionEnum version) throws IOException {
		String qPath = "/order/license/windows/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "sqlVersion", sqlVersion);
		addBody(o, "version", version);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/license/windows
	 */
	public ArrayList<String> license_windows_GET() throws IOException {
		String qPath = "/order/license/windows";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/license/windows/new
	 * @param sqlVersion [required] The SQL Server version to enable on this license Windows license
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 */
	public ArrayList<String> license_windows_new_GET(String ip, OvhLicenseTypeEnum serviceType, OvhWindowsSqlVersionEnum sqlVersion, OvhWindowsOsVersionEnum version) throws IOException {
		String qPath = "/order/license/windows/new";
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "sqlVersion", sqlVersion);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/windows/new/{duration}
	 * @param sqlVersion [required] The SQL Server version to enable on this license Windows license
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration [required] Duration
	 */
	public OvhOrder license_windows_new_duration_GET(String duration, String ip, OvhLicenseTypeEnum serviceType, OvhWindowsSqlVersionEnum sqlVersion, OvhWindowsOsVersionEnum version) throws IOException {
		String qPath = "/order/license/windows/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "sqlVersion", sqlVersion);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/windows/new/{duration}
	 * @param sqlVersion [required] The SQL Server version to enable on this license Windows license
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration [required] Duration
	 */
	public OvhOrder license_windows_new_duration_POST(String duration, OvhWindowsSqlVersionEnum sqlVersion, OvhLicenseTypeEnum serviceType, OvhWindowsOsVersionEnum version, String ip) throws IOException {
		String qPath = "/order/license/windows/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "sqlVersion", sqlVersion);
		addBody(o, "serviceType", serviceType);
		addBody(o, "version", version);
		addBody(o, "ip", ip);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/license/directadmin/new
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 */
	public ArrayList<String> license_directadmin_new_GET(String ip, OvhLicenseTypeEnum serviceType, OvhOrderableDirectAdminVersionEnum version) throws IOException {
		String qPath = "/order/license/directadmin/new";
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/directadmin/new/{duration}
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 * @param duration [required] Duration
	 */
	public OvhOrder license_directadmin_new_duration_GET(String duration, String ip, OvhLicenseTypeEnum serviceType, OvhOrderableDirectAdminVersionEnum version) throws IOException {
		String qPath = "/order/license/directadmin/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/directadmin/new/{duration}
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 * @param duration [required] Duration
	 */
	public OvhOrder license_directadmin_new_duration_POST(String duration, OvhLicenseTypeEnum serviceType, OvhOrderableDirectAdminVersionEnum version, String ip) throws IOException {
		String qPath = "/order/license/directadmin/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "serviceType", serviceType);
		addBody(o, "version", version);
		addBody(o, "ip", ip);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/license/virtuozzo/{serviceName}
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public ArrayList<String> license_virtuozzo_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/license/virtuozzo/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'upgrade' option
	 * 
	 * REST: GET /order/license/virtuozzo/{serviceName}/upgrade
	 * @param containerNumber [required] How much container is this license able to manage ...
	 * @param serviceName [required] The name of your Virtuozzo license
	 */
	public ArrayList<String> license_virtuozzo_serviceName_upgrade_GET(String serviceName, OvhOrderableVirtuozzoContainerNumberEnum containerNumber) throws IOException {
		String qPath = "/order/license/virtuozzo/{serviceName}/upgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "containerNumber", containerNumber);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/virtuozzo/{serviceName}/upgrade/{duration}
	 * @param containerNumber [required] How much container is this license able to manage ...
	 * @param serviceName [required] The name of your Virtuozzo license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_virtuozzo_serviceName_upgrade_duration_GET(String serviceName, String duration, OvhOrderableVirtuozzoContainerNumberEnum containerNumber) throws IOException {
		String qPath = "/order/license/virtuozzo/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "containerNumber", containerNumber);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/virtuozzo/{serviceName}/upgrade/{duration}
	 * @param containerNumber [required] How much container is this license able to manage ...
	 * @param serviceName [required] The name of your Virtuozzo license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_virtuozzo_serviceName_upgrade_duration_POST(String serviceName, String duration, OvhOrderableVirtuozzoContainerNumberEnum containerNumber) throws IOException {
		String qPath = "/order/license/virtuozzo/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "containerNumber", containerNumber);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/license/virtuozzo
	 */
	public ArrayList<String> license_virtuozzo_GET() throws IOException {
		String qPath = "/order/license/virtuozzo";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/license/virtuozzo/new
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param containerNumber [required] How much container is this license able to manage ...
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 */
	public ArrayList<String> license_virtuozzo_new_GET(OvhOrderableVirtuozzoContainerNumberEnum containerNumber, String ip, OvhLicenseTypeEnum serviceType, OvhOrderableVirtuozzoVersionEnum version) throws IOException {
		String qPath = "/order/license/virtuozzo/new";
		qPath = query(qPath, "containerNumber", containerNumber);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/virtuozzo/new/{duration}
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param containerNumber [required] How much container is this license able to manage ...
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 * @param duration [required] Duration
	 */
	public OvhOrder license_virtuozzo_new_duration_GET(String duration, OvhOrderableVirtuozzoContainerNumberEnum containerNumber, String ip, OvhLicenseTypeEnum serviceType, OvhOrderableVirtuozzoVersionEnum version) throws IOException {
		String qPath = "/order/license/virtuozzo/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "containerNumber", containerNumber);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/virtuozzo/new/{duration}
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param containerNumber [required] How much container is this license able to manage ...
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 * @param duration [required] Duration
	 */
	public OvhOrder license_virtuozzo_new_duration_POST(String duration, OvhLicenseTypeEnum serviceType, OvhOrderableVirtuozzoContainerNumberEnum containerNumber, OvhOrderableVirtuozzoVersionEnum version, String ip) throws IOException {
		String qPath = "/order/license/virtuozzo/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "serviceType", serviceType);
		addBody(o, "containerNumber", containerNumber);
		addBody(o, "version", version);
		addBody(o, "ip", ip);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/license/cpanel/new
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 */
	public ArrayList<String> license_cpanel_new_GET(String ip, OvhLicenseTypeEnum serviceType, OvhOrderableCpanelVersionEnum version) throws IOException {
		String qPath = "/order/license/cpanel/new";
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/cpanel/new/{duration}
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 * @param duration [required] Duration
	 */
	public OvhOrder license_cpanel_new_duration_GET(String duration, String ip, OvhLicenseTypeEnum serviceType, OvhOrderableCpanelVersionEnum version) throws IOException {
		String qPath = "/order/license/cpanel/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/cpanel/new/{duration}
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 * @param duration [required] Duration
	 */
	public OvhOrder license_cpanel_new_duration_POST(String duration, OvhLicenseTypeEnum serviceType, OvhOrderableCpanelVersionEnum version, String ip) throws IOException {
		String qPath = "/order/license/cpanel/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "serviceType", serviceType);
		addBody(o, "version", version);
		addBody(o, "ip", ip);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/license/office/new
	 * @param officeBusinessQuantity [required] Number of prepaid office business license
	 * @param officeProPlusQuantity [required] Number of prepaid office pro plus license
	 * @param giftCode [required] Gift code for office license
	 */
	public ArrayList<String> license_office_new_GET(String giftCode, Long officeBusinessQuantity, Long officeProPlusQuantity) throws IOException {
		String qPath = "/order/license/office/new";
		qPath = query(qPath, "giftCode", giftCode);
		qPath = query(qPath, "officeBusinessQuantity", officeBusinessQuantity);
		qPath = query(qPath, "officeProPlusQuantity", officeProPlusQuantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/office/new/{duration}
	 * @param officeBusinessQuantity [required] Number of prepaid office business license
	 * @param officeProPlusQuantity [required] Number of prepaid office pro plus license
	 * @param giftCode [required] Gift code for office license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_office_new_duration_GET(String duration, String giftCode, Long officeBusinessQuantity, Long officeProPlusQuantity) throws IOException {
		String qPath = "/order/license/office/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "giftCode", giftCode);
		qPath = query(qPath, "officeBusinessQuantity", officeBusinessQuantity);
		qPath = query(qPath, "officeProPlusQuantity", officeProPlusQuantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/office/new/{duration}
	 * @param officeBusinessQuantity [required] Number of prepaid office business license
	 * @param officeProPlusQuantity [required] Number of prepaid office pro plus license
	 * @param giftCode [required] Gift code for office license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_office_new_duration_POST(String duration, Long officeBusinessQuantity, Long officeProPlusQuantity, String giftCode) throws IOException {
		String qPath = "/order/license/office/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "officeBusinessQuantity", officeBusinessQuantity);
		addBody(o, "officeProPlusQuantity", officeProPlusQuantity);
		addBody(o, "giftCode", giftCode);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/license/sqlserver/{serviceName}
	 * @param serviceName [required] The name of your SQL Server license
	 */
	public ArrayList<String> license_sqlserver_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/license/sqlserver/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'upgrade' option
	 * 
	 * REST: GET /order/license/sqlserver/{serviceName}/upgrade
	 * @param version [required] This license version
	 * @param serviceName [required] The name of your SQL Server license
	 */
	public ArrayList<String> license_sqlserver_serviceName_upgrade_GET(String serviceName, OvhSqlServerVersionEnum version) throws IOException {
		String qPath = "/order/license/sqlserver/{serviceName}/upgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/sqlserver/{serviceName}/upgrade/{duration}
	 * @param version [required] This license version
	 * @param serviceName [required] The name of your SQL Server license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_sqlserver_serviceName_upgrade_duration_GET(String serviceName, String duration, OvhSqlServerVersionEnum version) throws IOException {
		String qPath = "/order/license/sqlserver/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/sqlserver/{serviceName}/upgrade/{duration}
	 * @param version [required] This license version
	 * @param serviceName [required] The name of your SQL Server license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_sqlserver_serviceName_upgrade_duration_POST(String serviceName, String duration, OvhSqlServerVersionEnum version) throws IOException {
		String qPath = "/order/license/sqlserver/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/license/sqlserver
	 */
	public ArrayList<String> license_sqlserver_GET() throws IOException {
		String qPath = "/order/license/sqlserver";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/license/sqlserver/new
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 */
	public ArrayList<String> license_sqlserver_new_GET(String ip, OvhSqlServerVersionEnum version) throws IOException {
		String qPath = "/order/license/sqlserver/new";
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/sqlserver/new/{duration}
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration [required] Duration
	 */
	public OvhOrder license_sqlserver_new_duration_GET(String duration, String ip, OvhSqlServerVersionEnum version) throws IOException {
		String qPath = "/order/license/sqlserver/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "version", version);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/sqlserver/new/{duration}
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed (for dedicated your main server Ip)
	 * @param duration [required] Duration
	 */
	public OvhOrder license_sqlserver_new_duration_POST(String duration, OvhSqlServerVersionEnum version, String ip) throws IOException {
		String qPath = "/order/license/sqlserver/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		addBody(o, "ip", ip);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/license/plesk/{serviceName}
	 * @param serviceName [required] The name of your Plesk license
	 */
	public ArrayList<String> license_plesk_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/license/plesk/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'upgrade' option
	 * 
	 * REST: GET /order/license/plesk/{serviceName}/upgrade
	 * @param version [required] This license version
	 * @param resellerManagement [required] Reseller management option activation
	 * @param powerpack [required] powerpack current activation state on your license
	 * @param antispam [required] The antispam currently enabled on this Plesk License
	 * @param applicationSet [required] Wanted application set
	 * @param wordpressToolkit [required] WordpressToolkit option activation
	 * @param languagePackNumber [required] The amount (between 0 and 5) of language pack numbers to include in this licences
	 * @param antivirus [required] The antivirus to enable on this Plesk license
	 * @param domainNumber [required] This license domain number
	 * @param serviceName [required] The name of your Plesk license
	 */
	public ArrayList<String> license_plesk_serviceName_upgrade_GET(String serviceName, OvhOrderableAntispamEnum antispam, OvhOrderableAntivirusEnum antivirus, OvhPleskApplicationSetEnum applicationSet, OvhOrderablePleskDomainNumberEnum domainNumber, OvhOrderablePleskLanguagePackEnum languagePackNumber, Boolean powerpack, Boolean resellerManagement, OvhPleskVersionEnum version, Boolean wordpressToolkit) throws IOException {
		String qPath = "/order/license/plesk/{serviceName}/upgrade";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "antispam", antispam);
		qPath = query(qPath, "antivirus", antivirus);
		qPath = query(qPath, "applicationSet", applicationSet);
		qPath = query(qPath, "domainNumber", domainNumber);
		qPath = query(qPath, "languagePackNumber", languagePackNumber);
		qPath = query(qPath, "powerpack", powerpack);
		qPath = query(qPath, "resellerManagement", resellerManagement);
		qPath = query(qPath, "version", version);
		qPath = query(qPath, "wordpressToolkit", wordpressToolkit);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/plesk/{serviceName}/upgrade/{duration}
	 * @param version [required] This license version
	 * @param resellerManagement [required] Reseller management option activation
	 * @param powerpack [required] powerpack current activation state on your license
	 * @param antispam [required] The antispam currently enabled on this Plesk License
	 * @param applicationSet [required] Wanted application set
	 * @param wordpressToolkit [required] WordpressToolkit option activation
	 * @param languagePackNumber [required] The amount (between 0 and 5) of language pack numbers to include in this licences
	 * @param antivirus [required] The antivirus to enable on this Plesk license
	 * @param domainNumber [required] This license domain number
	 * @param serviceName [required] The name of your Plesk license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_plesk_serviceName_upgrade_duration_GET(String serviceName, String duration, OvhOrderableAntispamEnum antispam, OvhOrderableAntivirusEnum antivirus, OvhPleskApplicationSetEnum applicationSet, OvhOrderablePleskDomainNumberEnum domainNumber, OvhOrderablePleskLanguagePackEnum languagePackNumber, Boolean powerpack, Boolean resellerManagement, OvhPleskVersionEnum version, Boolean wordpressToolkit) throws IOException {
		String qPath = "/order/license/plesk/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "antispam", antispam);
		qPath = query(qPath, "antivirus", antivirus);
		qPath = query(qPath, "applicationSet", applicationSet);
		qPath = query(qPath, "domainNumber", domainNumber);
		qPath = query(qPath, "languagePackNumber", languagePackNumber);
		qPath = query(qPath, "powerpack", powerpack);
		qPath = query(qPath, "resellerManagement", resellerManagement);
		qPath = query(qPath, "version", version);
		qPath = query(qPath, "wordpressToolkit", wordpressToolkit);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/plesk/{serviceName}/upgrade/{duration}
	 * @param version [required] This license version
	 * @param resellerManagement [required] Reseller management option activation
	 * @param powerpack [required] powerpack current activation state on your license
	 * @param antispam [required] The antispam currently enabled on this Plesk License
	 * @param applicationSet [required] Wanted application set
	 * @param wordpressToolkit [required] WordpressToolkit option activation
	 * @param languagePackNumber [required] The amount (between 0 and 5) of language pack numbers to include in this licences
	 * @param antivirus [required] The antivirus to enable on this Plesk license
	 * @param domainNumber [required] This license domain number
	 * @param serviceName [required] The name of your Plesk license
	 * @param duration [required] Duration
	 */
	public OvhOrder license_plesk_serviceName_upgrade_duration_POST(String serviceName, String duration, OvhPleskVersionEnum version, Boolean resellerManagement, Boolean powerpack, OvhOrderableAntispamEnum antispam, OvhPleskApplicationSetEnum applicationSet, Boolean wordpressToolkit, OvhOrderablePleskLanguagePackEnum languagePackNumber, OvhOrderableAntivirusEnum antivirus, OvhOrderablePleskDomainNumberEnum domainNumber) throws IOException {
		String qPath = "/order/license/plesk/{serviceName}/upgrade/{duration}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		addBody(o, "resellerManagement", resellerManagement);
		addBody(o, "powerpack", powerpack);
		addBody(o, "antispam", antispam);
		addBody(o, "applicationSet", applicationSet);
		addBody(o, "wordpressToolkit", wordpressToolkit);
		addBody(o, "languagePackNumber", languagePackNumber);
		addBody(o, "antivirus", antivirus);
		addBody(o, "domainNumber", domainNumber);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/license/plesk
	 */
	public ArrayList<String> license_plesk_GET() throws IOException {
		String qPath = "/order/license/plesk";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/license/plesk/new
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 * @param resellerManagement [required] Reseller management option activation
	 * @param powerpack [required] powerpack current activation state on your license
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param applicationSet [required] Wanted application set
	 * @param wordpressToolkit [required] WordpressToolkit option activation
	 * @param languagePackNumber [required] The amount of language pack numbers to include in this licences
	 * @param antivirus [required] The antivirus to enable on this Plesk license
	 * @param domainNumber [required] This license domain number
	 */
	public ArrayList<String> license_plesk_new_GET(OvhOrderableAntivirusEnum antivirus, OvhPleskApplicationSetEnum applicationSet, OvhOrderablePleskDomainNumberEnum domainNumber, String ip, OvhOrderablePleskLanguagePackEnum languagePackNumber, Boolean powerpack, Boolean resellerManagement, OvhLicenseTypeEnum serviceType, OvhPleskVersionEnum version, Boolean wordpressToolkit) throws IOException {
		String qPath = "/order/license/plesk/new";
		qPath = query(qPath, "antivirus", antivirus);
		qPath = query(qPath, "applicationSet", applicationSet);
		qPath = query(qPath, "domainNumber", domainNumber);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "languagePackNumber", languagePackNumber);
		qPath = query(qPath, "powerpack", powerpack);
		qPath = query(qPath, "resellerManagement", resellerManagement);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "version", version);
		qPath = query(qPath, "wordpressToolkit", wordpressToolkit);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/license/plesk/new/{duration}
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 * @param resellerManagement [required] Reseller management option activation
	 * @param powerpack [required] powerpack current activation state on your license
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param applicationSet [required] Wanted application set
	 * @param wordpressToolkit [required] WordpressToolkit option activation
	 * @param languagePackNumber [required] The amount of language pack numbers to include in this licences
	 * @param antivirus [required] The antivirus to enable on this Plesk license
	 * @param domainNumber [required] This license domain number
	 * @param duration [required] Duration
	 */
	public OvhOrder license_plesk_new_duration_GET(String duration, OvhOrderableAntivirusEnum antivirus, OvhPleskApplicationSetEnum applicationSet, OvhOrderablePleskDomainNumberEnum domainNumber, String ip, OvhOrderablePleskLanguagePackEnum languagePackNumber, Boolean powerpack, Boolean resellerManagement, OvhLicenseTypeEnum serviceType, OvhPleskVersionEnum version, Boolean wordpressToolkit) throws IOException {
		String qPath = "/order/license/plesk/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "antivirus", antivirus);
		qPath = query(qPath, "applicationSet", applicationSet);
		qPath = query(qPath, "domainNumber", domainNumber);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "languagePackNumber", languagePackNumber);
		qPath = query(qPath, "powerpack", powerpack);
		qPath = query(qPath, "resellerManagement", resellerManagement);
		qPath = query(qPath, "serviceType", serviceType);
		qPath = query(qPath, "version", version);
		qPath = query(qPath, "wordpressToolkit", wordpressToolkit);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/license/plesk/new/{duration}
	 * @param version [required] This license version
	 * @param ip [required] Ip on which this license would be installed
	 * @param resellerManagement [required] Reseller management option activation
	 * @param powerpack [required] powerpack current activation state on your license
	 * @param serviceType [required] # DEPRECATED # The kind of service on which this license will be used # Will not be used, keeped only for compatibility #
	 * @param applicationSet [required] Wanted application set
	 * @param wordpressToolkit [required] WordpressToolkit option activation
	 * @param languagePackNumber [required] The amount of language pack numbers to include in this licences
	 * @param antivirus [required] The antivirus to enable on this Plesk license
	 * @param domainNumber [required] This license domain number
	 * @param duration [required] Duration
	 */
	public OvhOrder license_plesk_new_duration_POST(String duration, OvhPleskVersionEnum version, String ip, Boolean resellerManagement, Boolean powerpack, OvhLicenseTypeEnum serviceType, OvhPleskApplicationSetEnum applicationSet, Boolean wordpressToolkit, OvhOrderablePleskLanguagePackEnum languagePackNumber, OvhOrderableAntivirusEnum antivirus, OvhOrderablePleskDomainNumberEnum domainNumber) throws IOException {
		String qPath = "/order/license/plesk/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		addBody(o, "ip", ip);
		addBody(o, "resellerManagement", resellerManagement);
		addBody(o, "powerpack", powerpack);
		addBody(o, "serviceType", serviceType);
		addBody(o, "applicationSet", applicationSet);
		addBody(o, "wordpressToolkit", wordpressToolkit);
		addBody(o, "languagePackNumber", languagePackNumber);
		addBody(o, "antivirus", antivirus);
		addBody(o, "domainNumber", domainNumber);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/router/new
	 * @param vrack [required] The name of your vrack
	 */
	public ArrayList<String> router_new_GET(String vrack) throws IOException {
		String qPath = "/order/router/new";
		qPath = query(qPath, "vrack", vrack);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/router/new/{duration}
	 * @param vrack [required] The name of your vrack
	 * @param duration [required] Duration
	 */
	public OvhOrder router_new_duration_GET(String duration, String vrack) throws IOException {
		String qPath = "/order/router/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "vrack", vrack);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/router/new/{duration}
	 * @param vrack [required] The name of your vrack
	 * @param duration [required] Duration
	 */
	public OvhOrder router_new_duration_POST(String duration, String vrack) throws IOException {
		String qPath = "/order/router/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "vrack", vrack);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed options
	 * 
	 * REST: GET /order/vrack/{serviceName}
	 * @param serviceName [required] The internal name of your vrack
	 */
	public ArrayList<String> vrack_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/order/vrack/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /order/vrack
	 */
	public ArrayList<String> vrack_GET() throws IOException {
		String qPath = "/order/vrack";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/vrack/new
	 * @param quantity [required] Number of vrack you want to order
	 */
	public OvhOrder vrack_new_GET(Long quantity) throws IOException {
		String qPath = "/order/vrack/new";
		qPath = query(qPath, "quantity", quantity);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/vrack/new
	 * @param quantity [required] Number of vrack you want to order
	 */
	public OvhOrder vrack_new_POST(Long quantity) throws IOException {
		String qPath = "/order/vrack/new";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/xdsl/spare/new
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param quantity [required] Number of modem quantity
	 * @param brand [required] Spare modem brand model
	 */
	public OvhOrder xdsl_spare_new_GET(String brand, String mondialRelayId, Long quantity, Long shippingContactId) throws IOException {
		String qPath = "/order/xdsl/spare/new";
		qPath = query(qPath, "brand", brand);
		qPath = query(qPath, "mondialRelayId", mondialRelayId);
		qPath = query(qPath, "quantity", quantity);
		qPath = query(qPath, "shippingContactId", shippingContactId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/xdsl/spare/new
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param quantity [required] Number of modem quantity
	 * @param brand [required] Spare modem brand model
	 */
	public OvhOrder xdsl_spare_new_POST(Long shippingContactId, String mondialRelayId, Long quantity, String brand) throws IOException {
		String qPath = "/order/xdsl/spare/new";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "shippingContactId", shippingContactId);
		addBody(o, "mondialRelayId", mondialRelayId);
		addBody(o, "quantity", quantity);
		addBody(o, "brand", brand);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/overTheBox/new
	 * @param deviceId [required] The id of the device
	 * @param voucher [required] An optional voucher
	 * @param offer [required] Offer name
	 */
	public ArrayList<String> overTheBox_new_GET(String deviceId, String offer, String voucher) throws IOException {
		String qPath = "/order/overTheBox/new";
		qPath = query(qPath, "deviceId", deviceId);
		qPath = query(qPath, "offer", offer);
		qPath = query(qPath, "voucher", voucher);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/overTheBox/new/{duration}
	 * @param deviceId [required] The id of the device
	 * @param voucher [required] An optional voucher
	 * @param offer [required] Offer name
	 * @param duration [required] Duration
	 */
	public OvhOrder overTheBox_new_duration_GET(String duration, String deviceId, String offer, String voucher) throws IOException {
		String qPath = "/order/overTheBox/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		qPath = query(qPath, "deviceId", deviceId);
		qPath = query(qPath, "offer", offer);
		qPath = query(qPath, "voucher", voucher);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/overTheBox/new/{duration}
	 * @param deviceId [required] The id of the device
	 * @param voucher [required] An optional voucher
	 * @param offer [required] Offer name
	 * @param duration [required] Duration
	 */
	public OvhOrder overTheBox_new_duration_POST(String duration, String deviceId, String voucher, String offer) throws IOException {
		String qPath = "/order/overTheBox/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "deviceId", deviceId);
		addBody(o, "voucher", voucher);
		addBody(o, "offer", offer);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Get allowed durations for 'new' option
	 * 
	 * REST: GET /order/hpcspot/new
	 */
	public ArrayList<String> hpcspot_new_GET() throws IOException {
		String qPath = "/order/hpcspot/new";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get prices and contracts information
	 * 
	 * REST: GET /order/hpcspot/new/{duration}
	 * @param duration [required] Duration
	 */
	public OvhOrder hpcspot_new_duration_GET(String duration) throws IOException {
		String qPath = "/order/hpcspot/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOrder.class);
	}

	/**
	 * Create order
	 * 
	 * REST: POST /order/hpcspot/new/{duration}
	 * @param duration [required] Duration
	 */
	public OvhOrder hpcspot_new_duration_POST(String duration) throws IOException {
		String qPath = "/order/hpcspot/new/{duration}";
		qPath = qPath.replace("{duration}", duration);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOrder.class);
	}
}
