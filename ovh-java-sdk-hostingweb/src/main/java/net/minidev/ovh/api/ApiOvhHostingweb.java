package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhChartSerie;
import net.minidev.ovh.api.complextype.OvhChartTimestampValue;
import net.minidev.ovh.api.hosting.privatedatabase.OvhAvailableRamSizeEnum;
import net.minidev.ovh.api.hosting.privatedatabase.OvhOrderableVersionEnum;
import net.minidev.ovh.api.hosting.web.OvhAttachedDomain;
import net.minidev.ovh.api.hosting.web.OvhBoostHistory;
import net.minidev.ovh.api.hosting.web.OvhCapabilities;
import net.minidev.ovh.api.hosting.web.OvhCdn;
import net.minidev.ovh.api.hosting.web.OvhCron;
import net.minidev.ovh.api.hosting.web.OvhDatabase;
import net.minidev.ovh.api.hosting.web.OvhDatabaseDump;
import net.minidev.ovh.api.hosting.web.OvhDump;
import net.minidev.ovh.api.hosting.web.OvhEmail;
import net.minidev.ovh.api.hosting.web.OvhEnvVar;
import net.minidev.ovh.api.hosting.web.OvhExtrasqlperso;
import net.minidev.ovh.api.hosting.web.OvhFreedom;
import net.minidev.ovh.api.hosting.web.OvhIndy;
import net.minidev.ovh.api.hosting.web.OvhLocalSeoAccount;
import net.minidev.ovh.api.hosting.web.OvhLocalSeoLocation;
import net.minidev.ovh.api.hosting.web.OvhModule;
import net.minidev.ovh.api.hosting.web.OvhModuleList;
import net.minidev.ovh.api.hosting.web.OvhOfferCapabilitiesEnum;
import net.minidev.ovh.api.hosting.web.OvhOfferEnum;
import net.minidev.ovh.api.hosting.web.OvhOvhConfig;
import net.minidev.ovh.api.hosting.web.OvhOwnLogs;
import net.minidev.ovh.api.hosting.web.OvhRequestActionEnum;
import net.minidev.ovh.api.hosting.web.OvhRuntime;
import net.minidev.ovh.api.hosting.web.OvhService;
import net.minidev.ovh.api.hosting.web.OvhSsl;
import net.minidev.ovh.api.hosting.web.OvhSslReport;
import net.minidev.ovh.api.hosting.web.OvhStatisticsPeriodEnum;
import net.minidev.ovh.api.hosting.web.OvhStatisticsTypeEnum;
import net.minidev.ovh.api.hosting.web.OvhTask;
import net.minidev.ovh.api.hosting.web.OvhUser;
import net.minidev.ovh.api.hosting.web.OvhUserLogs;
import net.minidev.ovh.api.hosting.web.attacheddomain.OvhCdnEnum;
import net.minidev.ovh.api.hosting.web.attacheddomain.OvhFirewallEnum;
import net.minidev.ovh.api.hosting.web.cron.OvhLanguageEnum;
import net.minidev.ovh.api.hosting.web.database.OvhAvailableVersionStruct;
import net.minidev.ovh.api.hosting.web.database.OvhCreationDatabaseCapabilities;
import net.minidev.ovh.api.hosting.web.database.OvhDatabaseCapabilities;
import net.minidev.ovh.api.hosting.web.database.OvhDatabaseCapabilitiesTypeEnum;
import net.minidev.ovh.api.hosting.web.database.OvhDatabaseTypeEnum;
import net.minidev.ovh.api.hosting.web.database.OvhExtraSqlQuotaEnum;
import net.minidev.ovh.api.hosting.web.database.OvhModeEnum;
import net.minidev.ovh.api.hosting.web.database.OvhVersionEnum;
import net.minidev.ovh.api.hosting.web.database.dump.OvhDateEnum;
import net.minidev.ovh.api.hosting.web.localseo.OvhDirectoriesList;
import net.minidev.ovh.api.hosting.web.localseo.OvhEmailAvailability;
import net.minidev.ovh.api.hosting.web.localseo.OvhVisibilityCheckResponse;
import net.minidev.ovh.api.hosting.web.localseo.OvhVisibilityCheckResultResponse;
import net.minidev.ovh.api.hosting.web.localseo.location.OvhCountryEnum;
import net.minidev.ovh.api.hosting.web.mail.OvhActionEnum;
import net.minidev.ovh.api.hosting.web.mail.OvhBounce;
import net.minidev.ovh.api.hosting.web.mail.OvhVolumeHistory;
import net.minidev.ovh.api.hosting.web.module.OvhBranchEnum;
import net.minidev.ovh.api.hosting.web.module.OvhDependencyType;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhAvailableEngineVersionEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhContainerEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhEngineNameEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhEnvironmentEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhHttpFirewallEnum;
import net.minidev.ovh.api.hosting.web.runtime.OvhEnvEnum;
import net.minidev.ovh.api.hosting.web.runtime.OvhTypeEnum;
import net.minidev.ovh.api.hosting.web.task.OvhStatusEnum;
import net.minidev.ovh.api.hosting.web.user.OvhSshStateEnum;
import net.minidev.ovh.api.service.OvhRenewType;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/hosting/web
 * version:1.0
 */
public class ApiOvhHostingweb extends ApiOvhBase {
	public ApiOvhHostingweb(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /hosting/web
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/hosting/web";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get available offer
	 *
	 * REST: GET /hosting/web/availableOffer
	 * @param domain [required] Domain you want to add or upgrade a hosting
	 */
	public ArrayList<OvhOfferEnum> availableOffer_GET(String domain) throws IOException {
		String qPath = "/hosting/web/availableOffer";
		StringBuilder sb = path(qPath);
		query(sb, "domain", domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhOfferEnum>> t2 = new TypeReference<ArrayList<OvhOfferEnum>>() {};

	/**
	 * Tasks attached to your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/tasks
	 * @param status [required] Filter the value of status property (=)
	 * @param function [required] Filter the value of function property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, String function, OvhStatusEnum status) throws IOException {
		String qPath = "/hosting/web/{serviceName}/tasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/tasks/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] the id of the task
	 */
	public OvhTask serviceName_tasks_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/tasks/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Apply a new configuration on this path
	 *
	 * REST: POST /hosting/web/{serviceName}/ovhConfig/{id}/changeConfiguration
	 * @param container [required] Container to run this website
	 * @param environment [required] Environment configuration you want
	 * @param httpFirewall [required] Configuration you want for http firewall
	 * @param engineName [required] Version of engine you want
	 * @param engineVersion [required] Name of engine you want
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Configuration's id
	 */
	public OvhTask serviceName_ovhConfig_id_changeConfiguration_POST(String serviceName, Long id, OvhContainerEnum container, OvhEngineNameEnum engineName, OvhAvailableEngineVersionEnum engineVersion, OvhEnvironmentEnum environment, OvhHttpFirewallEnum httpFirewall) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfig/{id}/changeConfiguration";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "container", container);
		addBody(o, "engineName", engineName);
		addBody(o, "engineVersion", engineVersion);
		addBody(o, "environment", environment);
		addBody(o, "httpFirewall", httpFirewall);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/ovhConfig/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Configuration's id
	 */
	public OvhOvhConfig serviceName_ovhConfig_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfig/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhConfig.class);
	}

	/**
	 * Rollback to an old configuration
	 *
	 * REST: POST /hosting/web/{serviceName}/ovhConfig/{id}/rollback
	 * @param rollbackId [required] The configuration's id you want to rollback
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Configuration's id
	 */
	public OvhTask serviceName_ovhConfig_id_rollback_POST(String serviceName, Long id, Long rollbackId) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfig/{id}/rollback";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "rollbackId", rollbackId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Configuration used on your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/ovhConfig
	 * @param path [required] Filter the value of path property (like)
	 * @param historical [required] Filter the value of historical property (=)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_ovhConfig_GET(String serviceName, Boolean historical, String path) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfig";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "historical", historical);
		query(sb, "path", path);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * List available runtime configurations available backend types
	 *
	 * REST: GET /hosting/web/{serviceName}/runtimeAvailableTypes
	 * @param language [required] Specific programming language to filter
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhTypeEnum> serviceName_runtimeAvailableTypes_GET(String serviceName, String language) throws IOException {
		String qPath = "/hosting/web/{serviceName}/runtimeAvailableTypes";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "language", language);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhTypeEnum>> t4 = new TypeReference<ArrayList<OvhTypeEnum>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/boostHistory/{date}
	 * @param serviceName [required] The internal name of your hosting
	 * @param date [required] The date when the change has been requested
	 */
	public OvhBoostHistory serviceName_boostHistory_date_GET(String serviceName, java.util.Date date) throws IOException {
		String qPath = "/hosting/web/{serviceName}/boostHistory/{date}";
		StringBuilder sb = path(qPath, serviceName, date);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBoostHistory.class);
	}

	/**
	 * History of your hosting boost
	 *
	 * REST: GET /hosting/web/{serviceName}/boostHistory
	 * @param date [required] Filter the value of date property (=)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Date> serviceName_boostHistory_GET(String serviceName, Date date) throws IOException {
		String qPath = "/hosting/web/{serviceName}/boostHistory";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "date", date);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<Date>> t5 = new TypeReference<ArrayList<Date>>() {};

	/**
	 * Get a temporary token to access the your web hosting logs interface
	 *
	 * REST: GET /hosting/web/{serviceName}/userLogsToken
	 * @param attachedDomain [required] Specific attached domain to be included in the scope of your token
	 * @param ttl [required] [default=3600] Expiration of your token (in seconds)
	 * @param remoteCheck [required] Whether to limit the use of the token to the remote IPv4 of API caller
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_userLogsToken_GET(String serviceName, String attachedDomain, Boolean remoteCheck, Long ttl) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogsToken";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "attachedDomain", attachedDomain);
		query(sb, "remoteCheck", remoteCheck);
		query(sb, "ttl", ttl);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get the attached domains linked to this runtime configuration
	 *
	 * REST: GET /hosting/web/{serviceName}/runtime/{id}/attachedDomains
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] The runtime configuration ID
	 */
	public ArrayList<String> serviceName_runtime_id_attachedDomains_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/runtime/{id}/attachedDomains";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/runtime/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] The runtime configuration ID
	 */
	public OvhRuntime serviceName_runtime_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/runtime/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRuntime.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}/runtime/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] The runtime configuration ID
	 */
	public void serviceName_runtime_id_PUT(String serviceName, Long id, OvhRuntime body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/runtime/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a runtime configuration of an hosting
	 *
	 * REST: DELETE /hosting/web/{serviceName}/runtime/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] The runtime configuration ID
	 */
	public OvhTask serviceName_runtime_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/runtime/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of runtime configurations to your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/runtime
	 * @param name [required] Filter the value of name property (like)
	 * @param type [required] Filter the value of type property (=)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_runtime_GET(String serviceName, String name, OvhTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/runtime";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "name", name);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Request the creation of a new runtime configuration
	 *
	 * REST: POST /hosting/web/{serviceName}/runtime
	 * @param isDefault [required] Set if the runtime configuration is the one by default for the hosting
	 * @param appEnv [required] The client application environment
	 * @param publicDir [required] The client application public directory
	 * @param type [required] The backend type of a runtime configuration
	 * @param attachedDomains [required] The attached domains fqdn to link to this runtime configuration
	 * @param appBootstrap [required] The client application bootstrap script
	 * @param name [required] The custom display name of the runtime configuration
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_runtime_POST(String serviceName, String appBootstrap, OvhEnvEnum appEnv, String[] attachedDomains, Boolean isDefault, String name, String publicDir, OvhTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/runtime";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "appBootstrap", appBootstrap);
		addBody(o, "appEnv", appEnv);
		addBody(o, "attachedDomains", attachedDomains);
		addBody(o, "isDefault", isDefault);
		addBody(o, "name", name);
		addBody(o, "publicDir", publicDir);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Dumps linked to your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/dump
	 * @param creationDate [required] Filter the value of creationDate property (like)
	 * @param orphan [required] Filter the value of orphan property (like)
	 * @param deletionDate [required] Filter the value of deletionDate property (like)
	 * @param databaseName [required] Filter the value of databaseName property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_dump_GET(String serviceName, Date creationDate, String databaseName, Date deletionDate, Boolean orphan) throws IOException {
		String qPath = "/hosting/web/{serviceName}/dump";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "creationDate", creationDate);
		query(sb, "databaseName", databaseName);
		query(sb, "deletionDate", deletionDate);
		query(sb, "orphan", orphan);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/dump/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Dump id
	 */
	public OvhDump serviceName_dump_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/dump/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDump.class);
	}

	/**
	 * Delete dump before expiration date
	 *
	 * REST: DELETE /hosting/web/{serviceName}/dump/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Dump id
	 */
	public OvhTask serviceName_dump_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/dump/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the regeneration of your HostedSsl
	 *
	 * REST: POST /hosting/web/{serviceName}/ssl/regenerate
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhSsl serviceName_ssl_regenerate_POST(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl/regenerate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/ssl/report
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhSslReport serviceName_ssl_report_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl/report";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSslReport.class);
	}

	/**
	 * Get domains linked to this HostedSsl
	 *
	 * REST: GET /hosting/web/{serviceName}/ssl/domains
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_ssl_domains_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl/domains";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/ssl
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhSsl serviceName_ssl_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Create the free default HostedSsl OR import your proper SSL on your hosting
	 *
	 * REST: POST /hosting/web/{serviceName}/ssl
	 * @param chain [required] If you want import your proper SSL, give the chain linked to the associated certificate (optional)
	 * @param key [required] If you want import your proper SSL, give the key here and the associated certificate before (optional)
	 * @param certificate [required] If you want import your proper SSL, give the certificate here and the associated key after (optional)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhSsl serviceName_ssl_POST(String serviceName, String certificate, String chain, String key) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "certificate", certificate);
		addBody(o, "chain", chain);
		addBody(o, "key", key);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Delete the HostedSsl on your hosting
	 *
	 * REST: DELETE /hosting/web/{serviceName}/ssl
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhSsl serviceName_ssl_DELETE(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Get statistics about this web hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/statistics
	 * @param period [required]
	 * @param type [required]
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhChartSerie<OvhChartTimestampValue>> serviceName_statistics_GET(String serviceName, OvhStatisticsPeriodEnum period, OvhStatisticsTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/statistics";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhChartSerie<OvhChartTimestampValue>>> t6 = new TypeReference<ArrayList<OvhChartSerie<OvhChartTimestampValue>>>() {};

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /hosting/web/{serviceName}/confirmTermination
	 * @param futureUse What next after your termination request
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/hosting/web/{serviceName}/confirmTermination";
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
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/indy/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login of the multidomain independent user
	 */
	public OvhIndy serviceName_indy_login_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/indy/{login}";
		StringBuilder sb = path(qPath, serviceName, login);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIndy.class);
	}

	/**
	 * User of multidomain independent allowed on your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/indy
	 * @param login [required] Filter the value of login property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_indy_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/indy";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "login", login);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/freedom/{domain}
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Freedom domain
	 */
	public OvhFreedom serviceName_freedom_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/freedom/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFreedom.class);
	}

	/**
	 * Delete the freedom
	 *
	 * REST: DELETE /hosting/web/{serviceName}/freedom/{domain}
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Freedom domain
	 */
	public void serviceName_freedom_domain_DELETE(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/freedom/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Freedom linked to this hosting account
	 *
	 * REST: GET /hosting/web/{serviceName}/freedom
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_freedom_GET(String serviceName, net.minidev.ovh.api.hosting.web.freedom.OvhStatusEnum status) throws IOException {
		String qPath = "/hosting/web/{serviceName}/freedom";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * User allowed to connect into your logs interface
	 *
	 * REST: GET /hosting/web/{serviceName}/userLogs
	 * @param login [required] Filter the value of login property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_userLogs_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "login", login);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new userLogs
	 *
	 * REST: POST /hosting/web/{serviceName}/userLogs
	 * @param ownLogsId [required] OwnLogs where this userLogs will be enable. Default : main domain ownlogs
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 * @param description [required] Description field for you
	 * @param password [required] The new userLogs password
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_userLogs_POST(String serviceName, String description, String login, Long ownLogsId, String password) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "login", login);
		addBody(o, "ownLogsId", ownLogsId);
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Request a password change
	 *
	 * REST: POST /hosting/web/{serviceName}/userLogs/{login}/changePassword
	 * @param password [required] The new userLogs password
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public String serviceName_userLogs_login_changePassword_POST(String serviceName, String login, String password) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs/{login}/changePassword";
		StringBuilder sb = path(qPath, serviceName, login);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/userLogs/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public OvhUserLogs serviceName_userLogs_login_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs/{login}";
		StringBuilder sb = path(qPath, serviceName, login);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUserLogs.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}/userLogs/{login}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public void serviceName_userLogs_login_PUT(String serviceName, String login, OvhUserLogs body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs/{login}";
		StringBuilder sb = path(qPath, serviceName, login);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the userLogs
	 *
	 * REST: DELETE /hosting/web/{serviceName}/userLogs/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public String serviceName_userLogs_login_DELETE(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs/{login}";
		StringBuilder sb = path(qPath, serviceName, login);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Request specific operation for your hosting
	 *
	 * REST: POST /hosting/web/{serviceName}/request
	 * @param action [required] Action you want to request
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_request_POST(String serviceName, OvhRequestActionEnum action) throws IOException {
		String qPath = "/hosting/web/{serviceName}/request";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available database version following a type
	 *
	 * REST: GET /hosting/web/{serviceName}/databaseAvailableVersion
	 * @param type [required] Type of the database
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhAvailableVersionStruct serviceName_databaseAvailableVersion_GET(String serviceName, OvhDatabaseTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/databaseAvailableVersion";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAvailableVersionStruct.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 */
	public void serviceName_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/hosting/web/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/localSeo/location/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Location id
	 */
	public OvhLocalSeoLocation serviceName_localSeo_location_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/localSeo/location/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhLocalSeoLocation.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/localSeo/location/{id}/serviceInfos
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Location id
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_localSeo_location_id_serviceInfos_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/localSeo/location/{id}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Terminate a local SEO sub service
	 *
	 * REST: POST /hosting/web/{serviceName}/localSeo/location/{id}/terminate
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Location id
	 */
	public String serviceName_localSeo_location_id_terminate_POST(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/localSeo/location/{id}/terminate";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: POST /hosting/web/{serviceName}/localSeo/location/{id}/serviceInfosUpdate
	 * @param renew [required] Renew type
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Location id
	 */
	public void serviceName_localSeo_location_id_serviceInfosUpdate_POST(String serviceName, Long id, OvhRenewType renew) throws IOException {
		String qPath = "/hosting/web/{serviceName}/localSeo/location/{id}/serviceInfosUpdate";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "renew", renew);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Local SEO locations associated to the hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/localSeo/location
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_localSeo_location_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/localSeo/location";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Check email availability for a local SEO order
	 *
	 * REST: GET /hosting/web/{serviceName}/localSeo/emailAvailability
	 * @param email [required] The email address to check
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhEmailAvailability serviceName_localSeo_emailAvailability_GET(String serviceName, String email) throws IOException {
		String qPath = "/hosting/web/{serviceName}/localSeo/emailAvailability";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "email", email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEmailAvailability.class);
	}

	/**
	 * Local SEO accounts associated to the hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/localSeo/account
	 * @param email [required] Filter the value of email property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_localSeo_account_GET(String serviceName, String email) throws IOException {
		String qPath = "/hosting/web/{serviceName}/localSeo/account";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "email", email);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/localSeo/account/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Account id
	 */
	public OvhLocalSeoAccount serviceName_localSeo_account_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/localSeo/account/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhLocalSeoAccount.class);
	}

	/**
	 * Login this location for SSO
	 *
	 * REST: POST /hosting/web/{serviceName}/localSeo/account/{id}/login
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Account id
	 */
	public String serviceName_localSeo_account_id_login_POST(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/localSeo/account/{id}/login";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List available privateDatabase you can install
	 *
	 * REST: GET /hosting/web/{serviceName}/privateDatabaseCreationCapabilities
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhCreationDatabaseCapabilities> serviceName_privateDatabaseCreationCapabilities_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/privateDatabaseCreationCapabilities";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhCreationDatabaseCapabilities>> t7 = new TypeReference<ArrayList<OvhCreationDatabaseCapabilities>>() {};

	/**
	 * Own Logs linked to your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/ownLogs
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_ownLogs_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ownLogs";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/ownLogs/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Id of the object
	 */
	public OvhOwnLogs serviceName_ownLogs_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ownLogs/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOwnLogs.class);
	}

	/**
	 * User allowed to connect into your logs interface
	 *
	 * REST: GET /hosting/web/{serviceName}/ownLogs/{id}/userLogs
	 * @param login [required] Filter the value of login property (like)
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Id of the object
	 */
	public ArrayList<String> serviceName_ownLogs_id_userLogs_GET(String serviceName, Long id, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ownLogs/{id}/userLogs";
		StringBuilder sb = path(qPath, serviceName, id);
		query(sb, "login", login);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new userLogs
	 *
	 * REST: POST /hosting/web/{serviceName}/ownLogs/{id}/userLogs
	 * @param ownLogsId [required] OwnLogs where this userLogs will be enable. Default : main domain ownlogs
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 * @param description [required] Description field for you
	 * @param password [required] The new userLogs password
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Id of the object
	 */
	public String serviceName_ownLogs_id_userLogs_POST(String serviceName, Long id, String description, String login, Long ownLogsId, String password) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ownLogs/{id}/userLogs";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "login", login);
		addBody(o, "ownLogsId", ownLogsId);
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/ownLogs/{id}/userLogs/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Id of the object
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public OvhUserLogs serviceName_ownLogs_id_userLogs_login_GET(String serviceName, Long id, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ownLogs/{id}/userLogs/{login}";
		StringBuilder sb = path(qPath, serviceName, id, login);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUserLogs.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}/ownLogs/{id}/userLogs/{login}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Id of the object
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public void serviceName_ownLogs_id_userLogs_login_PUT(String serviceName, Long id, String login, OvhUserLogs body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ownLogs/{id}/userLogs/{login}";
		StringBuilder sb = path(qPath, serviceName, id, login);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the userLogs
	 *
	 * REST: DELETE /hosting/web/{serviceName}/ownLogs/{id}/userLogs/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Id of the object
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public String serviceName_ownLogs_id_userLogs_login_DELETE(String serviceName, Long id, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ownLogs/{id}/userLogs/{login}";
		StringBuilder sb = path(qPath, serviceName, id, login);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Request a password change
	 *
	 * REST: POST /hosting/web/{serviceName}/ownLogs/{id}/userLogs/{login}/changePassword
	 * @param password [required] The new userLogs password
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Id of the object
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public String serviceName_ownLogs_id_userLogs_login_changePassword_POST(String serviceName, Long id, String login, String password) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ownLogs/{id}/userLogs/{login}/changePassword";
		StringBuilder sb = path(qPath, serviceName, id, login);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Restore this snapshot ALL CURRENT DATA WILL BE REPLACED BY YOUR SNAPSHOT
	 *
	 * REST: POST /hosting/web/{serviceName}/restoreSnapshot
	 * @param backup [required] The backup you want to restore
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_restoreSnapshot_POST(String serviceName, net.minidev.ovh.api.hosting.web.backup.OvhTypeEnum backup) throws IOException {
		String qPath = "/hosting/web/{serviceName}/restoreSnapshot";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backup", backup);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Databases linked to your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/database
	 * @param type [required] Filter the value of type property (=)
	 * @param name [required] Filter the value of name property (like)
	 * @param server [required] Filter the value of server property (like)
	 * @param mode [required] Filter the value of mode property (=)
	 * @param user [required] Filter the value of user property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_database_GET(String serviceName, OvhModeEnum mode, String name, String server, OvhDatabaseTypeEnum type, String user) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "mode", mode);
		query(sb, "name", name);
		query(sb, "server", server);
		query(sb, "type", type);
		query(sb, "user", user);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Install new database
	 *
	 * REST: POST /hosting/web/{serviceName}/database
	 * @param type [required] Type you want for your database
	 * @param password [required] Database password
	 * @param user [required] Database user name. Must begin with your hosting login and must be in lower case
	 * @param quota [required] Quota assign to your database. Only for extraSql
	 * @param version [required] Version you want for your database following the type
	 * @param capabilitie [required] Type of your database
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_database_POST(String serviceName, OvhDatabaseCapabilitiesTypeEnum capabilitie, String password, OvhExtraSqlQuotaEnum quota, OvhDatabaseTypeEnum type, String user, OvhVersionEnum version) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "capabilitie", capabilitie);
		addBody(o, "password", password);
		addBody(o, "quota", quota);
		addBody(o, "type", type);
		addBody(o, "user", user);
		addBody(o, "version", version);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/database/{name}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhDatabase serviceName_database_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDatabase.class);
	}

	/**
	 * Delete database
	 *
	 * REST: DELETE /hosting/web/{serviceName}/database/{name}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_DELETE(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request specific operation for your database
	 *
	 * REST: POST /hosting/web/{serviceName}/database/{name}/request
	 * @param action [required] Action you want to request
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_request_POST(String serviceName, String name, net.minidev.ovh.api.hosting.web.database.OvhRequestActionEnum action) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/request";
		StringBuilder sb = path(qPath, serviceName, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Dump available for your databases
	 *
	 * REST: GET /hosting/web/{serviceName}/database/{name}/dump
	 * @param type [required] Filter the value of type property (=)
	 * @param deletionDate [required] Filter the value of deletionDate property (like)
	 * @param creationDate [required] Filter the value of creationDate property (like)
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public ArrayList<Long> serviceName_database_name_dump_GET(String serviceName, String name, Date creationDate, Date deletionDate, OvhDateEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump";
		StringBuilder sb = path(qPath, serviceName, name);
		query(sb, "creationDate", creationDate);
		query(sb, "deletionDate", deletionDate);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Request the dump from your database
	 *
	 * REST: POST /hosting/web/{serviceName}/database/{name}/dump
	 * @param date [required] The date you want to dump
	 * @param sendEmail [required] Send an email when dump will be available? Default: true
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_dump_POST(String serviceName, String name, OvhDateEnum date, Boolean sendEmail) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump";
		StringBuilder sb = path(qPath, serviceName, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "date", date);
		addBody(o, "sendEmail", sendEmail);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/database/{name}/dump/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 * @param id [required] Dump id
	 */
	public OvhDatabaseDump serviceName_database_name_dump_id_GET(String serviceName, String name, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump/{id}";
		StringBuilder sb = path(qPath, serviceName, name, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDatabaseDump.class);
	}

	/**
	 * Delete dump before expiration date
	 *
	 * REST: DELETE /hosting/web/{serviceName}/database/{name}/dump/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 * @param id [required] Dump id
	 */
	public OvhTask serviceName_database_name_dump_id_DELETE(String serviceName, String name, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump/{id}";
		StringBuilder sb = path(qPath, serviceName, name, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the restore from this dump
	 *
	 * REST: POST /hosting/web/{serviceName}/database/{name}/dump/{id}/restore
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 * @param id [required] Dump id
	 */
	public OvhTask serviceName_database_name_dump_id_restore_POST(String serviceName, String name, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump/{id}/restore";
		StringBuilder sb = path(qPath, serviceName, name, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get available capabilities for this database
	 *
	 * REST: GET /hosting/web/{serviceName}/database/{name}/capabilities
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhDatabaseCapabilities serviceName_database_name_capabilities_GET(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/capabilities";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDatabaseCapabilities.class);
	}

	/**
	 * Request the restore from your database backup
	 *
	 * REST: POST /hosting/web/{serviceName}/database/{name}/restore
	 * @param date [required] The date you want to dump
	 * @param sendEmail [required] Send an email when the restore will be done? Default: false
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_restore_POST(String serviceName, String name, OvhDateEnum date, Boolean sendEmail) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/restore";
		StringBuilder sb = path(qPath, serviceName, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "date", date);
		addBody(o, "sendEmail", sendEmail);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request a password change
	 *
	 * REST: POST /hosting/web/{serviceName}/database/{name}/changePassword
	 * @param password [required] The new database password
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_changePassword_POST(String serviceName, String name, String password) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/changePassword";
		StringBuilder sb = path(qPath, serviceName, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get statistics about this database
	 *
	 * REST: GET /hosting/web/{serviceName}/database/{name}/statistics
	 * @param type [required] Types of statistics available for the database
	 * @param period [required] Available periods for statistics
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public ArrayList<OvhChartSerie<OvhChartTimestampValue>> serviceName_database_name_statistics_GET(String serviceName, String name, OvhStatisticsPeriodEnum period, net.minidev.ovh.api.hosting.web.database.OvhStatisticsTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/statistics";
		StringBuilder sb = path(qPath, serviceName, name);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}

	/**
	 * Import a dump from an specific file uploaded with /me/documents
	 *
	 * REST: POST /hosting/web/{serviceName}/database/{name}/import
	 * @param flushDatabase [required] If database will be flushed before importing the dump. Default: false
	 * @param documentId [required] Documents ID of the dump from /me/documents
	 * @param sendEmail [required] Send an email when the import will be done? Default: false
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_import_POST(String serviceName, String name, String documentId, Boolean flushDatabase, Boolean sendEmail) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/import";
		StringBuilder sb = path(qPath, serviceName, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		addBody(o, "flushDatabase", flushDatabase);
		addBody(o, "sendEmail", sendEmail);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /hosting/web/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/hosting/web/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}

	/**
	 * List available cron language
	 *
	 * REST: GET /hosting/web/{serviceName}/cronAvailableLanguage
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhLanguageEnum> serviceName_cronAvailableLanguage_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cronAvailableLanguage";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhLanguageEnum>> t8 = new TypeReference<ArrayList<OvhLanguageEnum>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/extraSqlPerso/{name}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public OvhExtrasqlperso serviceName_extraSqlPerso_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhExtrasqlperso.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: POST /hosting/web/{serviceName}/extraSqlPerso/{name}/serviceInfosUpdate
	 * @param renew [required] Renew type
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public void serviceName_extraSqlPerso_name_serviceInfosUpdate_POST(String serviceName, String name, OvhRenewType renew) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}/serviceInfosUpdate";
		StringBuilder sb = path(qPath, serviceName, name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "renew", renew);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get databases linked with this option
	 *
	 * REST: GET /hosting/web/{serviceName}/extraSqlPerso/{name}/databases
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public ArrayList<String> serviceName_extraSqlPerso_name_databases_GET(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}/databases";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/extraSqlPerso/{name}/serviceInfos
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_extraSqlPerso_name_serviceInfos_GET(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Terminate your extraSqlPerso sub service
	 *
	 * REST: POST /hosting/web/{serviceName}/extraSqlPerso/{name}/terminate
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public String serviceName_extraSqlPerso_name_terminate_POST(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}/terminate";
		StringBuilder sb = path(qPath, serviceName, name);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Sqlperso linked to your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/extraSqlPerso
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_extraSqlPerso_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /hosting/web/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/cdn
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhCdn serviceName_cdn_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cdn";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCdn.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: POST /hosting/web/{serviceName}/cdn/serviceInfosUpdate
	 * @param renew [required] Renew type
	 * @param serviceName [required] The internal name of your hosting
	 */
	public void serviceName_cdn_serviceInfosUpdate_POST(String serviceName, OvhRenewType renew) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cdn/serviceInfosUpdate";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "renew", renew);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/cdn/serviceInfos
	 * @param serviceName [required] The internal name of your hosting
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_cdn_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cdn/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Terminate your cdn sub service
	 *
	 * REST: POST /hosting/web/{serviceName}/cdn/terminate
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_cdn_terminate_POST(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cdn/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List available database type
	 *
	 * REST: GET /hosting/web/{serviceName}/databaseAvailableType
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhDatabaseTypeEnum> serviceName_databaseAvailableType_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/databaseAvailableType";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhDatabaseTypeEnum>> t9 = new TypeReference<ArrayList<OvhDatabaseTypeEnum>>() {};

	/**
	 * Use to link an external domain. ( This token has to be insert into a TXT field on your dns zone with ovhcontrol subdomain )
	 *
	 * REST: GET /hosting/web/{serviceName}/token
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_token_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/token";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List linked privateDatabases
	 *
	 * REST: GET /hosting/web/{serviceName}/privateDatabases
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_privateDatabases_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/privateDatabases";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Allows you to boost your offer.
	 *
	 * REST: POST /hosting/web/{serviceName}/requestBoost
	 * @param offer [required] The boost offer of your choice. Set to null to disable boost.
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_requestBoost_POST(String serviceName, OvhOfferEnum offer) throws IOException {
		String qPath = "/hosting/web/{serviceName}/requestBoost";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "offer", offer);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Generate a new admin password for your module
	 *
	 * REST: POST /hosting/web/{serviceName}/module/{id}/changePassword
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Installation ID
	 */
	public OvhTask serviceName_module_id_changePassword_POST(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module/{id}/changePassword";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/module/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Installation ID
	 */
	public OvhModule serviceName_module_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhModule.class);
	}

	/**
	 * Delete a module installed
	 *
	 * REST: DELETE /hosting/web/{serviceName}/module/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Installation ID
	 */
	public OvhTask serviceName_module_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Module installed on your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/module
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_module_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Install a new module
	 *
	 * REST: POST /hosting/web/{serviceName}/module
	 * @param language [required] The language to set to your module
	 * @param adminName [required] The login for the admin account (may be a standard string or your email)
	 * @param adminPassword [required] The password for the admin account (at least 8 characters)
	 * @param path [required] Where to install the module, relative to your home directory
	 * @param moduleId [required] ID of the module you want to install
	 * @param dependencies [required] The dependencies that we have to configure on your module. A dependency can be a standard database (like MySQL or PostgreSQL) or a key-value store (like Redis or Memcached) for example
	 * @param domain [required] On which domain the module has to be available (it can be a multidomain or a subdomain) - if not set, the module will be available on your serviceName domain
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_module_POST(String serviceName, String adminName, String adminPassword, OvhDependencyType[] dependencies, String domain, net.minidev.ovh.api.hosting.web.module.OvhLanguageEnum language, Long moduleId, String path) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "adminName", adminName);
		addBody(o, "adminPassword", adminPassword);
		addBody(o, "dependencies", dependencies);
		addBody(o, "domain", domain);
		addBody(o, "language", language);
		addBody(o, "moduleId", moduleId);
		addBody(o, "path", path);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * User allowed to connect into your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/user
	 * @param login [required] Filter the value of login property (like)
	 * @param home [required] Filter the value of home property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_user_GET(String serviceName, String home, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "home", home);
		query(sb, "login", login);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Create new ftp/ssh user
	 *
	 * REST: POST /hosting/web/{serviceName}/user
	 * @param password [required] Password
	 * @param login [required] Login use for your new user
	 * @param sshState [required] Ssh state for this user. Default: none
	 * @param home [required] Home directory
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_user_POST(String serviceName, String home, String login, String password, OvhSshStateEnum sshState) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "home", home);
		addBody(o, "login", login);
		addBody(o, "password", password);
		addBody(o, "sshState", sshState);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request a password change
	 *
	 * REST: POST /hosting/web/{serviceName}/user/{login}/changePassword
	 * @param password [required] The user's new password
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login used to connect on FTP and SSH
	 */
	public OvhTask serviceName_user_login_changePassword_POST(String serviceName, String login, String password) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user/{login}/changePassword";
		StringBuilder sb = path(qPath, serviceName, login);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/user/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login used to connect on FTP and SSH
	 */
	public OvhUser serviceName_user_login_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user/{login}";
		StringBuilder sb = path(qPath, serviceName, login);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}/user/{login}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login used to connect on FTP and SSH
	 */
	public void serviceName_user_login_PUT(String serviceName, String login, OvhUser body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user/{login}";
		StringBuilder sb = path(qPath, serviceName, login);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete ftp/ssh user
	 *
	 * REST: DELETE /hosting/web/{serviceName}/user/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login used to connect on FTP and SSH
	 */
	public OvhTask serviceName_user_login_DELETE(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user/{login}";
		StringBuilder sb = path(qPath, serviceName, login);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/envVar/{key}
	 * @param serviceName [required] The internal name of your hosting
	 * @param key [required] Name of the variable
	 */
	public OvhEnvVar serviceName_envVar_key_GET(String serviceName, String key) throws IOException {
		String qPath = "/hosting/web/{serviceName}/envVar/{key}";
		StringBuilder sb = path(qPath, serviceName, key);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEnvVar.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}/envVar/{key}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param key [required] Name of the variable
	 */
	public void serviceName_envVar_key_PUT(String serviceName, String key, OvhEnvVar body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/envVar/{key}";
		StringBuilder sb = path(qPath, serviceName, key);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove variable from hosting
	 *
	 * REST: DELETE /hosting/web/{serviceName}/envVar/{key}
	 * @param serviceName [required] The internal name of your hosting
	 * @param key [required] Name of the variable
	 */
	public OvhTask serviceName_envVar_key_DELETE(String serviceName, String key) throws IOException {
		String qPath = "/hosting/web/{serviceName}/envVar/{key}";
		StringBuilder sb = path(qPath, serviceName, key);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Environment variables set on your webhosting
	 *
	 * REST: GET /hosting/web/{serviceName}/envVar
	 * @param type [required] Filter the value of type property (=)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_envVar_GET(String serviceName, net.minidev.ovh.api.hosting.web.envvar.OvhTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/envVar";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Set a variable to this hosting
	 *
	 * REST: POST /hosting/web/{serviceName}/envVar
	 * @param value [required] Value of the variable
	 * @param key [required] Name of the new variable
	 * @param type [required] Type of variable set
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_envVar_POST(String serviceName, String key, net.minidev.ovh.api.hosting.web.envvar.OvhTypeEnum type, String value) throws IOException {
		String qPath = "/hosting/web/{serviceName}/envVar";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "key", key);
		addBody(o, "type", type);
		addBody(o, "value", value);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the history volume of email sent
	 *
	 * REST: GET /hosting/web/{serviceName}/email/volumes
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhVolumeHistory> serviceName_email_volumes_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email/volumes";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t10);
	}
	private static TypeReference<ArrayList<OvhVolumeHistory>> t10 = new TypeReference<ArrayList<OvhVolumeHistory>>() {};

	/**
	 * Request specific operation for your email
	 *
	 * REST: POST /hosting/web/{serviceName}/email/request
	 * @param action [required] Action you want to request
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_email_request_POST(String serviceName, OvhActionEnum action) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email/request";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/email
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhEmail serviceName_email_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEmail.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}/email
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 */
	public void serviceName_email_PUT(String serviceName, OvhEmail body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Request the last bounces
	 *
	 * REST: GET /hosting/web/{serviceName}/email/bounces
	 * @param limit [required] Maximum bounces limit ( default : 20 / max : 100 )
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhBounce> serviceName_email_bounces_GET(String serviceName, Long limit) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email/bounces";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "limit", limit);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}
	private static TypeReference<ArrayList<OvhBounce>> t11 = new TypeReference<ArrayList<OvhBounce>>() {};

	/**
	 * Synchronize the configuration listing with content on your hosting
	 *
	 * REST: POST /hosting/web/{serviceName}/ovhConfigRefresh
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_ovhConfigRefresh_POST(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfigRefresh";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Purge cache for this attached domain
	 *
	 * REST: POST /hosting/web/{serviceName}/attachedDomain/{domain}/purgeCache
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Domain linked (fqdn)
	 */
	public OvhTask serviceName_attachedDomain_domain_purgeCache_POST(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain/{domain}/purgeCache";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/attachedDomain/{domain}
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Domain linked (fqdn)
	 */
	public OvhAttachedDomain serviceName_attachedDomain_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAttachedDomain.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}/attachedDomain/{domain}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Domain linked (fqdn)
	 */
	public void serviceName_attachedDomain_domain_PUT(String serviceName, String domain, OvhAttachedDomain body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Unlink domain from hosting
	 *
	 * REST: DELETE /hosting/web/{serviceName}/attachedDomain/{domain}
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Domain linked (fqdn)
	 */
	public OvhTask serviceName_attachedDomain_domain_DELETE(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restart the virtual host of the attached domain
	 *
	 * REST: POST /hosting/web/{serviceName}/attachedDomain/{domain}/restart
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Domain linked (fqdn)
	 */
	public OvhTask serviceName_attachedDomain_domain_restart_POST(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain/{domain}/restart";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Domains or subdomains attached to your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/attachedDomain
	 * @param path [required] Filter the value of path property (like)
	 * @param domain [required] Filter the value of domain property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_attachedDomain_GET(String serviceName, String domain, String path) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "domain", domain);
		query(sb, "path", path);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Link a domain to this hosting
	 *
	 * REST: POST /hosting/web/{serviceName}/attachedDomain
	 * @param cdn [required] Is linked to the hosting cdn
	 * @param runtimeId [required] The runtime configuration ID linked to this attached domain
	 * @param ownLog [required] Put domain for separate the logs on logs.ovh.net
	 * @param ssl [required] Put domain in ssl certificate
	 * @param domain [required] Domain to link
	 * @param path [required] Domain's path, relative to your home directory
	 * @param firewall [required] Firewall state for this path
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_attachedDomain_POST(String serviceName, OvhCdnEnum cdn, String domain, OvhFirewallEnum firewall, String ownLog, String path, Long runtimeId, Boolean ssl) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cdn", cdn);
		addBody(o, "domain", domain);
		addBody(o, "firewall", firewall);
		addBody(o, "ownLog", ownLog);
		addBody(o, "path", path);
		addBody(o, "runtimeId", runtimeId);
		addBody(o, "ssl", ssl);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available database you can install
	 *
	 * REST: GET /hosting/web/{serviceName}/databaseCreationCapabilities
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhCreationDatabaseCapabilities> serviceName_databaseCreationCapabilities_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/databaseCreationCapabilities";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}

	/**
	 * Activate an included private database on your hosting offer
	 *
	 * REST: POST /hosting/web/{serviceName}/activatePrivateDatabase
	 * @param version [required] Private database available versions
	 * @param ram [required] The private database ram size included in your offer
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_activatePrivateDatabase_POST(String serviceName, OvhAvailableRamSizeEnum ram, OvhOrderableVersionEnum version) throws IOException {
		String qPath = "/hosting/web/{serviceName}/activatePrivateDatabase";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ram", ram);
		addBody(o, "version", version);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/cron/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Cron's id
	 */
	public OvhCron serviceName_cron_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCron.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}/cron/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Cron's id
	 */
	public void serviceName_cron_id_PUT(String serviceName, Long id, OvhCron body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete cron
	 *
	 * REST: DELETE /hosting/web/{serviceName}/cron/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Cron's id
	 */
	public String serviceName_cron_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Crons on your hosting
	 *
	 * REST: GET /hosting/web/{serviceName}/cron
	 * @param description [required] Filter the value of description property (like)
	 * @param command [required] Filter the value of command property (like)
	 * @param language [required] Filter the value of language property (=)
	 * @param email [required] Filter the value of email property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_cron_GET(String serviceName, String command, String description, String email, OvhLanguageEnum language) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "command", command);
		query(sb, "description", description);
		query(sb, "email", email);
		query(sb, "language", language);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create new cron
	 *
	 * REST: POST /hosting/web/{serviceName}/cron
	 * @param status [required] Cron status
	 * @param language [required] Cron language
	 * @param command [required] Command to execute
	 * @param description [required] Description field for you
	 * @param email [required] Email used to receive error log ( stderr )
	 * @param frequency [required] Frequency ( crontab format ) define for the script ( minutes are ignored )
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_cron_POST(String serviceName, String command, String description, String email, String frequency, OvhLanguageEnum language, net.minidev.ovh.api.hosting.web.cron.OvhStatusEnum status) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "command", command);
		addBody(o, "description", description);
		addBody(o, "email", email);
		addBody(o, "frequency", frequency);
		addBody(o, "language", language);
		addBody(o, "status", status);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your hosting
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /hosting/web/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, net.minidev.ovh.api.services.OvhService body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get offer capabilities
	 *
	 * REST: GET /hosting/web/offerCapabilities
	 * @param offer [required] Describe offer capabilities
	 */
	public OvhCapabilities offerCapabilities_GET(OvhOfferCapabilitiesEnum offer) throws IOException {
		String qPath = "/hosting/web/offerCapabilities";
		StringBuilder sb = path(qPath);
		query(sb, "offer", offer);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCapabilities.class);
	}

	/**
	 * Check visibility of a location
	 *
	 * REST: POST /hosting/web/localSeo/visibilityCheck
	 * @param name [required] Name of the location
	 * @param country [required] Country of the location
	 * @param street [required] Address line 1 of the location
	 * @param zip [required] Zipcode of the location
	 */
	public OvhVisibilityCheckResponse localSeo_visibilityCheck_POST(OvhCountryEnum country, String name, String street, String zip) throws IOException {
		String qPath = "/hosting/web/localSeo/visibilityCheck";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "country", country);
		addBody(o, "name", name);
		addBody(o, "street", street);
		addBody(o, "zip", zip);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhVisibilityCheckResponse.class);
	}

	/**
	 * Get list of directories associated to a local SEO offer and a country
	 *
	 * REST: GET /hosting/web/localSeo/directoriesList
	 * @param offer [required] Local SEO offer
	 * @param country [required] Country of the location
	 */
	public OvhDirectoriesList localSeo_directoriesList_GET(OvhCountryEnum country, net.minidev.ovh.api.hosting.web.localseo.location.OvhOfferEnum offer) throws IOException {
		String qPath = "/hosting/web/localSeo/directoriesList";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		query(sb, "offer", offer);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDirectoriesList.class);
	}

	/**
	 * Get the result of a visibility check
	 *
	 * REST: GET /hosting/web/localSeo/visibilityCheckResult
	 * @param directory [required] Get the result only for one directory
	 * @param token [required] Token received when requesting the check
	 * @param id [required] Id of the check
	 */
	public ArrayList<OvhVisibilityCheckResultResponse> localSeo_visibilityCheckResult_GET(String directory, Long id, String token) throws IOException {
		String qPath = "/hosting/web/localSeo/visibilityCheckResult";
		StringBuilder sb = path(qPath);
		query(sb, "directory", directory);
		query(sb, "id", id);
		query(sb, "token", token);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}
	private static TypeReference<ArrayList<OvhVisibilityCheckResultResponse>> t12 = new TypeReference<ArrayList<OvhVisibilityCheckResultResponse>>() {};

	/**
	 * Check email availability for a local SEO order
	 *
	 * REST: GET /hosting/web/localSeo/emailAvailability
	 * @param email [required] The email address to check
	 */
	public OvhEmailAvailability localSeo_emailAvailability_GET(String email) throws IOException {
		String qPath = "/hosting/web/localSeo/emailAvailability";
		StringBuilder sb = path(qPath);
		query(sb, "email", email);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEmailAvailability.class);
	}

	/**
	 * Find hosting service linked to a domain
	 *
	 * REST: GET /hosting/web/attachedDomain
	 * @param domain [required] Domain used into web hosting attached Domains
	 */
	public ArrayList<String> attachedDomain_GET(String domain) throws IOException {
		String qPath = "/hosting/web/attachedDomain";
		StringBuilder sb = path(qPath);
		query(sb, "domain", domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get current incident
	 *
	 * REST: GET /hosting/web/incident
	 */
	public ArrayList<String> incident_GET() throws IOException {
		String qPath = "/hosting/web/incident";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * IDs of all modules available
	 *
	 * REST: GET /hosting/web/moduleList
	 * @param branch [required] Filter the value of branch property (=)
	 * @param active [required] Filter the value of active property (=)
	 * @param latest [required] Filter the value of latest property (=)
	 */
	public ArrayList<Long> moduleList_GET(Boolean active, OvhBranchEnum branch, Boolean latest) throws IOException {
		String qPath = "/hosting/web/moduleList";
		StringBuilder sb = path(qPath);
		query(sb, "active", active);
		query(sb, "branch", branch);
		query(sb, "latest", latest);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /hosting/web/moduleList/{id}
	 * @param id [required] The ID of the module
	 */
	public OvhModuleList moduleList_id_GET(Long id) throws IOException {
		String qPath = "/hosting/web/moduleList/{id}";
		StringBuilder sb = path(qPath, id);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhModuleList.class);
	}
}
