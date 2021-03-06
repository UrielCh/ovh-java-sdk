package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.dbaas.logs.OvhAlias;
import net.minidev.ovh.api.dbaas.logs.OvhAllowedNetwork;
import net.minidev.ovh.api.dbaas.logs.OvhArchive;
import net.minidev.ovh.api.dbaas.logs.OvhArchiveUrl;
import net.minidev.ovh.api.dbaas.logs.OvhCluster;
import net.minidev.ovh.api.dbaas.logs.OvhClusterAllowedNetwork;
import net.minidev.ovh.api.dbaas.logs.OvhClusterAllowedNetworkFlowTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhDashboard;
import net.minidev.ovh.api.dbaas.logs.OvhEngine;
import net.minidev.ovh.api.dbaas.logs.OvhFlowggerConfiguration;
import net.minidev.ovh.api.dbaas.logs.OvhFlowggerConfigurationLogFormatEnum;
import net.minidev.ovh.api.dbaas.logs.OvhFlowggerConfigurationLogFramingEnum;
import net.minidev.ovh.api.dbaas.logs.OvhIndex;
import net.minidev.ovh.api.dbaas.logs.OvhInput;
import net.minidev.ovh.api.dbaas.logs.OvhInputAction;
import net.minidev.ovh.api.dbaas.logs.OvhLogstashConfiguration;
import net.minidev.ovh.api.dbaas.logs.OvhMember;
import net.minidev.ovh.api.dbaas.logs.OvhOffer;
import net.minidev.ovh.api.dbaas.logs.OvhOperation;
import net.minidev.ovh.api.dbaas.logs.OvhOption;
import net.minidev.ovh.api.dbaas.logs.OvhPermission;
import net.minidev.ovh.api.dbaas.logs.OvhPermissionDashboardPermissionTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhPermissionIndexPermissionTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhPublicOffer;
import net.minidev.ovh.api.dbaas.logs.OvhQuota;
import net.minidev.ovh.api.dbaas.logs.OvhRole;
import net.minidev.ovh.api.dbaas.logs.OvhService;
import net.minidev.ovh.api.dbaas.logs.OvhServiceMetric;
import net.minidev.ovh.api.dbaas.logs.OvhStream;
import net.minidev.ovh.api.dbaas.logs.OvhStreamAlertCondition;
import net.minidev.ovh.api.dbaas.logs.OvhStreamAlertConditionConditionTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamAlertConditionConstraintTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamAlertConditionThresholdTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamColdStorageCompressionEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamColdStorageContentEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamColdStorageTargetEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamRule;
import net.minidev.ovh.api.dbaas.logs.OvhStreamRuleOperatorEnum;
import net.minidev.ovh.api.dbaas.logs.OvhTemporaryLogsLink;
import net.minidev.ovh.api.dbaas.logs.OvhTestResult;
import net.minidev.ovh.api.dbaas.logs.OvhToken;
import net.minidev.ovh.api.dbaas.logs.OvhUrl;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/dbaas/logs
 * version:1.0
 */
public class ApiOvhDbaaslogs extends ApiOvhBase {
	public ApiOvhDbaaslogs(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dbaas/logs
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dbaas/logs";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Returns the list of available input engines
	 *
	 * REST: GET /dbaas/logs/input/engine
	 */
	public ArrayList<String> input_engine_GET() throws IOException {
		String qPath = "/dbaas/logs/input/engine";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Returns details of specified input engine
	 *
	 * REST: GET /dbaas/logs/input/engine/{engineId}
	 * @param engineId [required] Engine ID
	 */
	public OvhEngine input_engine_engineId_GET(String engineId) throws IOException {
		String qPath = "/dbaas/logs/input/engine/{engineId}";
		StringBuilder sb = path(qPath, engineId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEngine.class);
	}

	/**
	 * Initiate a password change procedure.
	 *
	 * REST: POST /dbaas/logs/{serviceName}/user/changePassword
	 * @param serviceName [required] Service name
	 * @param password [required] Password must be at least 12 characters long contain a number, an uppercase, a lowercase and a special letter
	 */
	public OvhOperation serviceName_user_changePassword_POST(String serviceName, String password) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/user/changePassword";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of specified operation
	 *
	 * REST: GET /dbaas/logs/{serviceName}/operation/{operationId}
	 * @param serviceName [required] Service name
	 * @param operationId [required] Operation ID
	 */
	public OvhOperation serviceName_operation_operationId_GET(String serviceName, String operationId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/operation/{operationId}";
		StringBuilder sb = path(qPath, serviceName, operationId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Latest operations
	 *
	 * REST: GET /dbaas/logs/{serviceName}/operation
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_operation_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/operation";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Returns the service object of connected identity.
	 *
	 * REST: GET /dbaas/logs/{serviceName}
	 * @param serviceName [required] Service name
	 */
	public OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Update the service properties
	 *
	 * REST: PUT /dbaas/logs/{serviceName}
	 * @param serviceName [required] Service name
	 * @param displayName [required] Service custom name
	 * @param isCapped [required] If set, block indexation when plan's limit is reached
	 */
	public OvhOperation serviceName_PUT(String serviceName, String displayName, Boolean isCapped) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "displayName", displayName);
		addBody(o, "isCapped", isCapped);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove the specified IP from the list of allowed networks
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/cluster/{clusterId}/allowedNetwork/{allowedNetworkId}
	 * @param serviceName [required] Service name
	 * @param clusterId [required] Cluster ID
	 * @param allowedNetworkId [required] Allowed network UUID
	 */
	public OvhOperation serviceName_cluster_clusterId_allowedNetwork_allowedNetworkId_DELETE(String serviceName, String clusterId, String allowedNetworkId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/cluster/{clusterId}/allowedNetwork/{allowedNetworkId}";
		StringBuilder sb = path(qPath, serviceName, clusterId, allowedNetworkId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of an allowed network
	 *
	 * REST: GET /dbaas/logs/{serviceName}/cluster/{clusterId}/allowedNetwork/{allowedNetworkId}
	 * @param serviceName [required] Service name
	 * @param clusterId [required] Cluster ID
	 * @param allowedNetworkId [required] Allowed network UUID
	 */
	public OvhClusterAllowedNetwork serviceName_cluster_clusterId_allowedNetwork_allowedNetworkId_GET(String serviceName, String clusterId, String allowedNetworkId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/cluster/{clusterId}/allowedNetwork/{allowedNetworkId}";
		StringBuilder sb = path(qPath, serviceName, clusterId, allowedNetworkId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhClusterAllowedNetwork.class);
	}

	/**
	 * List all the network UUID allowed to contact given cluster
	 *
	 * REST: GET /dbaas/logs/{serviceName}/cluster/{clusterId}/allowedNetwork
	 * @param serviceName [required] Service name
	 * @param clusterId [required] Cluster ID
	 */
	public ArrayList<String> serviceName_cluster_clusterId_allowedNetwork_GET(String serviceName, String clusterId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/cluster/{clusterId}/allowedNetwork";
		StringBuilder sb = path(qPath, serviceName, clusterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Allow an IP to contact cluster
	 *
	 * REST: POST /dbaas/logs/{serviceName}/cluster/{clusterId}/allowedNetwork
	 * @param serviceName [required] Service name
	 * @param clusterId [required] Cluster ID
	 * @param network [required] IP block
	 * @param flowType [required] Flow type
	 */
	public OvhOperation serviceName_cluster_clusterId_allowedNetwork_POST(String serviceName, String clusterId, OvhClusterAllowedNetworkFlowTypeEnum flowType, String network) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/cluster/{clusterId}/allowedNetwork";
		StringBuilder sb = path(qPath, serviceName, clusterId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flowType", flowType);
		addBody(o, "network", network);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of an allowed cluster
	 *
	 * REST: GET /dbaas/logs/{serviceName}/cluster/{clusterId}
	 * @param serviceName [required] Service name
	 * @param clusterId [required] Cluster ID
	 */
	public OvhCluster serviceName_cluster_clusterId_GET(String serviceName, String clusterId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/cluster/{clusterId}";
		StringBuilder sb = path(qPath, serviceName, clusterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCluster.class);
	}

	/**
	 * Returns the list of allowed cluster
	 *
	 * REST: GET /dbaas/logs/{serviceName}/cluster
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_cluster_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/cluster";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Delete the specified token
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/token/{tokenId}
	 * @param serviceName [required] Service name
	 * @param tokenId [required] Token ID
	 */
	public OvhOperation serviceName_token_tokenId_DELETE(String serviceName, String tokenId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token/{tokenId}";
		StringBuilder sb = path(qPath, serviceName, tokenId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the specified token
	 *
	 * REST: GET /dbaas/logs/{serviceName}/token/{tokenId}
	 * @param serviceName [required] Service name
	 * @param tokenId [required] Token ID
	 */
	public OvhToken serviceName_token_tokenId_GET(String serviceName, String tokenId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token/{tokenId}";
		StringBuilder sb = path(qPath, serviceName, tokenId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhToken.class);
	}

	/**
	 * Returns the list of service tokens
	 *
	 * REST: GET /dbaas/logs/{serviceName}/token
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_token_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a new token
	 *
	 * REST: POST /dbaas/logs/{serviceName}/token
	 * @param serviceName [required] Service name
	 * @param name [required] Token name
	 * @param clusterId [required] Cluster ID
	 */
	public OvhOperation serviceName_token_POST(String serviceName, String clusterId, String name) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "clusterId", clusterId);
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of registered input attached to the logged user
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_input_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new input object
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input
	 * @param serviceName [required] Service name
	 * @param autoSelectOption [required] If set, automatically selects a compatible option
	 * @param streamId [required] Stream ID
	 * @param engineId [required] Engine ID
	 * @param description [required] Description
	 * @param singleInstanceEnabled [required] Indicate if input have only a single instance
	 * @param optionId [required] Option ID
	 * @param title [required] Title
	 * @param exposedPort [required] Exposed port
	 */
	public OvhOperation serviceName_input_POST(String serviceName, Boolean autoSelectOption, String description, String engineId, String exposedPort, String optionId, Boolean singleInstanceEnabled, String streamId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "autoSelectOption", autoSelectOption);
		addBody(o, "description", description);
		addBody(o, "engineId", engineId);
		addBody(o, "exposedPort", exposedPort);
		addBody(o, "optionId", optionId);
		addBody(o, "singleInstanceEnabled", singleInstanceEnabled);
		addBody(o, "streamId", streamId);
		addBody(o, "title", title);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Schedule the restart of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/restart
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhOperation serviceName_input_inputId_restart_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/restart";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the flowgger configuration
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhFlowggerConfiguration serviceName_input_inputId_configuration_flowgger_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFlowggerConfiguration.class);
	}

	/**
	 * Update the flowgger configuration
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 * @param logFraming [required] Log framing
	 * @param logFormat [required] configuration log format
	 */
	public OvhOperation serviceName_input_inputId_configuration_flowgger_PUT(String serviceName, String inputId, OvhFlowggerConfigurationLogFormatEnum logFormat, OvhFlowggerConfigurationLogFramingEnum logFraming) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger";
		StringBuilder sb = path(qPath, serviceName, inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "logFormat", logFormat);
		addBody(o, "logFraming", logFraming);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the logstash configuration
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhLogstashConfiguration serviceName_input_inputId_configuration_logstash_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhLogstashConfiguration.class);
	}

	/**
	 * Update the logstash configuration
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 * @param patternSection [required] Pattern section
	 * @param inputSection [required] Input section
	 * @param filterSection [required] Filter section
	 */
	public OvhOperation serviceName_input_inputId_configuration_logstash_PUT(String serviceName, String inputId, String filterSection, String inputSection, String patternSection) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash";
		StringBuilder sb = path(qPath, serviceName, inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "filterSection", filterSection);
		addBody(o, "inputSection", inputSection);
		addBody(o, "patternSection", patternSection);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove the specified input object
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/input/{inputId}
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhOperation serviceName_input_inputId_DELETE(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of specified input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhInput serviceName_input_inputId_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInput.class);
	}

	/**
	 * Update information of specified input object
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/input/{inputId}
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 * @param streamId [required] Stream ID
	 * @param engineId [required] Engine ID
	 * @param description [required] Description
	 * @param singleInstanceEnabled [required] Indicate if input have only a single instance
	 * @param optionId [required] Option ID
	 * @param title [required] Title
	 * @param exposedPort [required] Exposed port
	 */
	public OvhOperation serviceName_input_inputId_PUT(String serviceName, String inputId, String description, String engineId, String exposedPort, String optionId, Boolean singleInstanceEnabled, String streamId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}";
		StringBuilder sb = path(qPath, serviceName, inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "engineId", engineId);
		addBody(o, "exposedPort", exposedPort);
		addBody(o, "optionId", optionId);
		addBody(o, "singleInstanceEnabled", singleInstanceEnabled);
		addBody(o, "streamId", streamId);
		addBody(o, "title", title);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Validate configuration of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/configtest
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhOperation serviceName_input_inputId_configtest_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configtest";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the config test operation result
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/configtest/result
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhTestResult serviceName_input_inputId_configtest_result_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configtest/result";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTestResult.class);
	}

	/**
	 * Schedule the end of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/end
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhOperation serviceName_input_inputId_end_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/end";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * List all network UUID allowed to join input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public ArrayList<String> serviceName_input_inputId_allowedNetwork_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Allow an ip to join input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 * @param network [required] IP block
	 */
	public OvhOperation serviceName_input_inputId_allowedNetwork_POST(String serviceName, String inputId, String network) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork";
		StringBuilder sb = path(qPath, serviceName, inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "network", network);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove the specified IP from the list of allowed networks
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork/{allowedNetworkId}
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 * @param allowedNetworkId [required] Allowed network ID
	 */
	public OvhOperation serviceName_input_inputId_allowedNetwork_allowedNetworkId_DELETE(String serviceName, String inputId, String allowedNetworkId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork/{allowedNetworkId}";
		StringBuilder sb = path(qPath, serviceName, inputId, allowedNetworkId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * List all network UUID allowed to join input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork/{allowedNetworkId}
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 * @param allowedNetworkId [required] Allowed network ID
	 */
	public OvhAllowedNetwork serviceName_input_inputId_allowedNetwork_allowedNetworkId_GET(String serviceName, String inputId, String allowedNetworkId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork/{allowedNetworkId}";
		StringBuilder sb = path(qPath, serviceName, inputId, allowedNetworkId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAllowedNetwork.class);
	}

	/**
	 * Returns actions of specified input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/action
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public ArrayList<OvhInputAction> serviceName_input_inputId_action_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/action";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhInputAction>> t2 = new TypeReference<ArrayList<OvhInputAction>>() {};

	/**
	 * Generate a temporary url to retrieve input logs
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/logs/url
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhTemporaryLogsLink serviceName_input_inputId_logs_url_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/logs/url";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTemporaryLogsLink.class);
	}

	/**
	 * Returns the list of urls of specified input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/url
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public ArrayList<OvhUrl> serviceName_input_inputId_url_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/url";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhUrl>> t3 = new TypeReference<ArrayList<OvhUrl>>() {};

	/**
	 * Schedule the start of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/start
	 * @param serviceName [required] Service name
	 * @param inputId [required] Input ID
	 */
	public OvhOperation serviceName_input_inputId_start_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/start";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of alias for connected user
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_output_elasticsearch_alias_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new elasticsearch alias
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/elasticsearch/alias
	 * @param serviceName [required] Service name
	 * @param autoSelectOption [required] If set, automatically selects a compatible option
	 * @param optionId [required] Option ID
	 * @param suffix [required] Suffix
	 * @param description [required] Description
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_POST(String serviceName, Boolean autoSelectOption, String description, String optionId, String suffix) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "autoSelectOption", autoSelectOption);
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "suffix", suffix);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of graylog streams attached to specified         elasticsearch alias
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 */
	public ArrayList<String> serviceName_output_elasticsearch_alias_aliasId_stream_GET(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Attach a graylog stream to specified elasticsearch alias
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 * @param streamId [required] Stream ID
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_stream_POST(String serviceName, String aliasId, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streamId", streamId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Detach a graylog stream from specified elasticsearch alias
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream/{streamId}
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 * @param streamId [required] Stream ID
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_stream_streamId_DELETE(String serviceName, String aliasId, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream/{streamId}";
		StringBuilder sb = path(qPath, serviceName, aliasId, streamId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Detach a elasticsearch index from specified elasticsearch alias
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/index/{indexId}
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 * @param indexId [required] Index ID
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_index_indexId_DELETE(String serviceName, String aliasId, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/index/{indexId}";
		StringBuilder sb = path(qPath, serviceName, aliasId, indexId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of elasticsearch indexes attached to specified         elasticsearch alias
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/index
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 */
	public ArrayList<String> serviceName_output_elasticsearch_alias_aliasId_index_GET(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/index";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Attach a elasticsearch index to specified elasticsearch alias
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/index
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 * @param indexId [required] Index ID
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_index_POST(String serviceName, String aliasId, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/index";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "indexId", indexId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified elasticsearch alias
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_DELETE(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns specified elasticsearch alias
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 */
	public OvhAlias serviceName_output_elasticsearch_alias_aliasId_GET(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAlias.class);
	}

	/**
	 * Update specified elasticsearch alias
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 * @param optionId [required] Option ID
	 * @param description [required] Description
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_PUT(String serviceName, String aliasId, String description, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of urls of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/url
	 * @param serviceName [required] Service name
	 * @param aliasId [required] Alias ID
	 */
	public ArrayList<OvhUrl> serviceName_output_elasticsearch_alias_aliasId_url_GET(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/url";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Returns the list of elasticsearch indexes
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/index
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_output_elasticsearch_index_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new elasticsearch index
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/elasticsearch/index
	 * @param serviceName [required] Service name
	 * @param autoSelectOption [required] If set, automatically selects a compatible option
	 * @param optionId [required] Option ID
	 * @param alertNotifyEnabled [required] Alert notify enabled
	 * @param suffix [required] Suffix
	 * @param description [required] Description
	 */
	public OvhOperation serviceName_output_elasticsearch_index_POST(String serviceName, Boolean alertNotifyEnabled, Boolean autoSelectOption, String description, String optionId, String suffix) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "alertNotifyEnabled", alertNotifyEnabled);
		addBody(o, "autoSelectOption", autoSelectOption);
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "suffix", suffix);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of urls of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}/url
	 * @param serviceName [required] Service name
	 * @param indexId [required] Index ID
	 */
	public ArrayList<OvhUrl> serviceName_output_elasticsearch_index_indexId_url_GET(String serviceName, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}/url";
		StringBuilder sb = path(qPath, serviceName, indexId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Remove specified elasticsearch index
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}
	 * @param serviceName [required] Service name
	 * @param indexId [required] Index ID
	 */
	public OvhOperation serviceName_output_elasticsearch_index_indexId_DELETE(String serviceName, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}";
		StringBuilder sb = path(qPath, serviceName, indexId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns specified elasticsearch index
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}
	 * @param serviceName [required] Service name
	 * @param indexId [required] Index ID
	 */
	public OvhIndex serviceName_output_elasticsearch_index_indexId_GET(String serviceName, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}";
		StringBuilder sb = path(qPath, serviceName, indexId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIndex.class);
	}

	/**
	 * Update specified elasticsearch index
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}
	 * @param serviceName [required] Service name
	 * @param indexId [required] Index ID
	 * @param alertNotifyEnabled [required] Alert notify enabled
	 * @param description [required] Description
	 */
	public OvhOperation serviceName_output_elasticsearch_index_indexId_PUT(String serviceName, String indexId, Boolean alertNotifyEnabled, String description) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}";
		StringBuilder sb = path(qPath, serviceName, indexId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "alertNotifyEnabled", alertNotifyEnabled);
		addBody(o, "description", description);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of graylog streams
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_output_graylog_stream_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new graylog stream
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/stream
	 * @param serviceName [required] Service name
	 * @param autoSelectOption [required] If set, automatically selects a compatible option
	 * @param webSocketEnabled [required] Web Socket enabled
	 * @param indexingEnabled [required] ES indexing enabled
	 * @param coldStorageRetention [required] Cold storage retention time
	 * @param coldStorageCompression [required] Cold storage compression
	 * @param coldStorageContent [required] Cold storage archive content
	 * @param coldStorageTarget [required] Cold storage destination
	 * @param optionId [required] Option ID
	 * @param coldStorageNotifyEnabled [required] Cold storage notify enabled
	 * @param parentStreamId [required] Parent stream id
	 * @param description [required] Description
	 * @param title [required] Title
	 * @param coldStorageEnabled [required] Cold storage enabled
	 */
	public OvhOperation serviceName_output_graylog_stream_POST(String serviceName, Boolean autoSelectOption, OvhStreamColdStorageCompressionEnum coldStorageCompression, OvhStreamColdStorageContentEnum coldStorageContent, Boolean coldStorageEnabled, Boolean coldStorageNotifyEnabled, Long coldStorageRetention, OvhStreamColdStorageTargetEnum coldStorageTarget, String description, Boolean indexingEnabled, String optionId, String parentStreamId, String title, Boolean webSocketEnabled) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "autoSelectOption", autoSelectOption);
		addBody(o, "coldStorageCompression", coldStorageCompression);
		addBody(o, "coldStorageContent", coldStorageContent);
		addBody(o, "coldStorageEnabled", coldStorageEnabled);
		addBody(o, "coldStorageNotifyEnabled", coldStorageNotifyEnabled);
		addBody(o, "coldStorageRetention", coldStorageRetention);
		addBody(o, "coldStorageTarget", coldStorageTarget);
		addBody(o, "description", description);
		addBody(o, "indexingEnabled", indexingEnabled);
		addBody(o, "optionId", optionId);
		addBody(o, "parentStreamId", parentStreamId);
		addBody(o, "title", title);
		addBody(o, "webSocketEnabled", webSocketEnabled);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified graylog stream
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_DELETE(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 */
	public OvhStream serviceName_output_graylog_stream_streamId_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhStream.class);
	}

	/**
	 * Update information of specified graylog stream
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param webSocketEnabled [required] Web socket enabled
	 * @param indexingEnabled [required] ES indexing enabled
	 * @param coldStorageRetention [required] Cold storage retention time
	 * @param coldStorageCompression [required] Cold storage compression
	 * @param coldStorageContent [required] Cold storage content
	 * @param coldStorageTarget [required] Cold storage destination
	 * @param description [required] Description
	 * @param coldStorageNotifyEnabled [required] Cold storage notify enabled
	 * @param optionId [required] Option ID
	 * @param title [required] Title
	 * @param coldStorageEnabled [required] Cold storage enabled
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_PUT(String serviceName, String streamId, OvhStreamColdStorageCompressionEnum coldStorageCompression, OvhStreamColdStorageContentEnum coldStorageContent, Boolean coldStorageEnabled, Boolean coldStorageNotifyEnabled, Long coldStorageRetention, OvhStreamColdStorageTargetEnum coldStorageTarget, String description, Boolean indexingEnabled, String optionId, String title, Boolean webSocketEnabled) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}";
		StringBuilder sb = path(qPath, serviceName, streamId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "coldStorageCompression", coldStorageCompression);
		addBody(o, "coldStorageContent", coldStorageContent);
		addBody(o, "coldStorageEnabled", coldStorageEnabled);
		addBody(o, "coldStorageNotifyEnabled", coldStorageNotifyEnabled);
		addBody(o, "coldStorageRetention", coldStorageRetention);
		addBody(o, "coldStorageTarget", coldStorageTarget);
		addBody(o, "description", description);
		addBody(o, "indexingEnabled", indexingEnabled);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		addBody(o, "webSocketEnabled", webSocketEnabled);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of urls of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/url
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 */
	public ArrayList<OvhUrl> serviceName_output_graylog_stream_streamId_url_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/url";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get a public temporary URL to access the archive
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive/{archiveId}/url
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param archiveId [required] Archive ID
	 */
	public OvhArchiveUrl serviceName_output_graylog_stream_streamId_archive_archiveId_url_POST(String serviceName, String streamId, String archiveId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive/{archiveId}/url";
		StringBuilder sb = path(qPath, serviceName, streamId, archiveId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhArchiveUrl.class);
	}

	/**
	 * Returns details of specified archive
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive/{archiveId}
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param archiveId [required] Archive ID
	 */
	public OvhArchive serviceName_output_graylog_stream_streamId_archive_archiveId_GET(String serviceName, String streamId, String archiveId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive/{archiveId}";
		StringBuilder sb = path(qPath, serviceName, streamId, archiveId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhArchive.class);
	}

	/**
	 * Returns the list of archives
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 */
	public ArrayList<String> serviceName_output_graylog_stream_streamId_archive_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Remove alert from specified graylog stream
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param alertId [required] Alert ID
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_alert_alertId_DELETE(String serviceName, String streamId, String alertId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}";
		StringBuilder sb = path(qPath, serviceName, streamId, alertId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of specified graylog stream alert
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param alertId [required] Alert ID
	 */
	public OvhStreamAlertCondition serviceName_output_graylog_stream_streamId_alert_alertId_GET(String serviceName, String streamId, String alertId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}";
		StringBuilder sb = path(qPath, serviceName, streamId, alertId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhStreamAlertCondition.class);
	}

	/**
	 * Update alert information of specified graylog stream
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param alertId [required] Alert ID
	 * @param thresholdType [required] Threshold type
	 * @param grace [required] Grace period
	 * @param constraintType [required] Constraint type
	 * @param conditionType [required] Condition type
	 * @param repeatNotificationsEnabled [required] Repeat notifications enabled
	 * @param value [required] Value
	 * @param backlog [required] Backlog
	 * @param threshold [required] Threshold
	 * @param time [required] Time
	 * @param title [required] Title
	 * @param field [required] Field
	 * @param queryFilter [required] Query filter
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_alert_alertId_PUT(String serviceName, String streamId, String alertId, Long backlog, OvhStreamAlertConditionConditionTypeEnum conditionType, OvhStreamAlertConditionConstraintTypeEnum constraintType, String field, Long grace, String queryFilter, Boolean repeatNotificationsEnabled, Long threshold, OvhStreamAlertConditionThresholdTypeEnum thresholdType, Long time, String title, String value) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}";
		StringBuilder sb = path(qPath, serviceName, streamId, alertId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backlog", backlog);
		addBody(o, "conditionType", conditionType);
		addBody(o, "constraintType", constraintType);
		addBody(o, "field", field);
		addBody(o, "grace", grace);
		addBody(o, "queryFilter", queryFilter);
		addBody(o, "repeatNotificationsEnabled", repeatNotificationsEnabled);
		addBody(o, "threshold", threshold);
		addBody(o, "thresholdType", thresholdType);
		addBody(o, "time", time);
		addBody(o, "title", title);
		addBody(o, "value", value);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of configured alerts of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 */
	public ArrayList<String> serviceName_output_graylog_stream_streamId_alert_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new alert on specified graylog stream
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param thresholdType [required] Threshold type
	 * @param grace [required] Grace period
	 * @param constraintType [required] Constraint type
	 * @param conditionType [required] Condition type
	 * @param repeatNotificationsEnabled [required] Repeat notifications enabled
	 * @param value [required] Value
	 * @param backlog [required] Backlog
	 * @param threshold [required] Threshold
	 * @param time [required] Time
	 * @param title [required] Title
	 * @param field [required] Field
	 * @param queryFilter [required] Query filter
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_alert_POST(String serviceName, String streamId, Long backlog, OvhStreamAlertConditionConditionTypeEnum conditionType, OvhStreamAlertConditionConstraintTypeEnum constraintType, String field, Long grace, String queryFilter, Boolean repeatNotificationsEnabled, Long threshold, OvhStreamAlertConditionThresholdTypeEnum thresholdType, Long time, String title, String value) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert";
		StringBuilder sb = path(qPath, serviceName, streamId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backlog", backlog);
		addBody(o, "conditionType", conditionType);
		addBody(o, "constraintType", constraintType);
		addBody(o, "field", field);
		addBody(o, "grace", grace);
		addBody(o, "queryFilter", queryFilter);
		addBody(o, "repeatNotificationsEnabled", repeatNotificationsEnabled);
		addBody(o, "threshold", threshold);
		addBody(o, "thresholdType", thresholdType);
		addBody(o, "time", time);
		addBody(o, "title", title);
		addBody(o, "value", value);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of rules of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 */
	public ArrayList<String> serviceName_output_graylog_stream_streamId_rule_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new rule on specified graylog stream
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param value [required] Field value
	 * @param field [required] Field name
	 * @param operator [required] Field operator
	 * @param isInverted [required] Invert condition
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_rule_POST(String serviceName, String streamId, String field, Boolean isInverted, OvhStreamRuleOperatorEnum operator, String value) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule";
		StringBuilder sb = path(qPath, serviceName, streamId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "field", field);
		addBody(o, "isInverted", isInverted);
		addBody(o, "operator", operator);
		addBody(o, "value", value);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified graylog stream rule
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule/{ruleId}
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param ruleId [required] Rule ID
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_rule_ruleId_DELETE(String serviceName, String streamId, String ruleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, serviceName, streamId, ruleId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of specified graylog stream rule
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule/{ruleId}
	 * @param serviceName [required] Service name
	 * @param streamId [required] Stream ID
	 * @param ruleId [required] Rule ID
	 */
	public ArrayList<OvhStreamRule> serviceName_output_graylog_stream_streamId_rule_ruleId_GET(String serviceName, String streamId, String ruleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, serviceName, streamId, ruleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhStreamRule>> t4 = new TypeReference<ArrayList<OvhStreamRule>>() {};

	/**
	 * Remove specified graylog dashboard
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}
	 * @param serviceName [required] Service name
	 * @param dashboardId [required] Dashboard ID
	 */
	public OvhOperation serviceName_output_graylog_dashboard_dashboardId_DELETE(String serviceName, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}";
		StringBuilder sb = path(qPath, serviceName, dashboardId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of specified graylog dashboard
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}
	 * @param serviceName [required] Service name
	 * @param dashboardId [required] Dashboard ID
	 */
	public OvhDashboard serviceName_output_graylog_dashboard_dashboardId_GET(String serviceName, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}";
		StringBuilder sb = path(qPath, serviceName, dashboardId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDashboard.class);
	}

	/**
	 * Update information of specified graylog dashboard
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}
	 * @param serviceName [required] Service name
	 * @param dashboardId [required] Dashboard ID
	 * @param optionId [required] Option ID
	 * @param title [required] Title
	 * @param description [required] Description
	 */
	public OvhOperation serviceName_output_graylog_dashboard_dashboardId_PUT(String serviceName, String dashboardId, String description, String optionId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}";
		StringBuilder sb = path(qPath, serviceName, dashboardId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of urls of specified graylog dashboard
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/url
	 * @param serviceName [required] Service name
	 * @param dashboardId [required] Dashboard ID
	 */
	public ArrayList<OvhUrl> serviceName_output_graylog_dashboard_dashboardId_url_GET(String serviceName, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/url";
		StringBuilder sb = path(qPath, serviceName, dashboardId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Copy all widgets from specified dashboard to a new one
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/duplicate
	 * @param serviceName [required] Service name
	 * @param dashboardId [required] Dashboard ID
	 * @param optionId [required] Option ID
	 * @param autoSelectOption [required] If set, automatically selects a compatible option
	 * @param title [required] Title
	 * @param streamId [required] Stream ID
	 * @param description [required] Description
	 */
	public OvhOperation serviceName_output_graylog_dashboard_dashboardId_duplicate_POST(String serviceName, String dashboardId, Boolean autoSelectOption, String description, String optionId, String streamId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/duplicate";
		StringBuilder sb = path(qPath, serviceName, dashboardId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "autoSelectOption", autoSelectOption);
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "streamId", streamId);
		addBody(o, "title", title);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of graylog dashboards
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/dashboard
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_output_graylog_dashboard_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new graylog dashboard
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/dashboard
	 * @param serviceName [required] Service name
	 * @param optionId [required] Option ID
	 * @param title [required] Title
	 * @param description [required] Description
	 * @param autoSelectOption [required] If set, automatically selects a compatible option
	 */
	public OvhOperation serviceName_output_graylog_dashboard_POST(String serviceName, Boolean autoSelectOption, String description, String optionId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "autoSelectOption", autoSelectOption);
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /dbaas/logs/{serviceName}/changeContact
	 * @param contactAdmin [required] The contact to set as admin contact
	 * @param contactTech [required] The contact to set as tech contact
	 * @param contactBilling [required] The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your Logs pack
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<Long>> t5 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dbaas/logs/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your Logs pack
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your Logs pack
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, net.minidev.ovh.api.services.OvhService body) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Returns Metrics credentials
	 *
	 * REST: GET /dbaas/logs/{serviceName}/metrics
	 * @param serviceName [required] Service name
	 */
	public OvhServiceMetric serviceName_metrics_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/metrics";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceMetric.class);
	}

	/**
	 * Returns platform useful urls.
	 *
	 * REST: GET /dbaas/logs/{serviceName}/url
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhUrl> serviceName_url_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/url";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Returns the subscribed additional options
	 *
	 * REST: GET /dbaas/logs/{serviceName}/option
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_option_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/option";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Remove the specified subscribed option
	 *
	 * REST: POST /dbaas/logs/{serviceName}/option/{optionId}/terminate
	 * @param serviceName [required] Service name
	 * @param optionId [required] Option ID
	 */
	public OvhOperation serviceName_option_optionId_terminate_POST(String serviceName, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/option/{optionId}/terminate";
		StringBuilder sb = path(qPath, serviceName, optionId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of a subscribed option
	 *
	 * REST: GET /dbaas/logs/{serviceName}/option/{optionId}
	 * @param serviceName [required] Service name
	 * @param optionId [required] Option ID
	 */
	public OvhOption serviceName_option_optionId_GET(String serviceName, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/option/{optionId}";
		StringBuilder sb = path(qPath, serviceName, optionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOption.class);
	}

	/**
	 * Returns the list of roles
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role
	 * @param serviceName [required] service name
	 */
	public ArrayList<String> serviceName_role_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role
	 * @param serviceName [required] service name
	 * @param autoSelectOption [required] If set, automatically selects a compatible option
	 * @param optionId [required] Option ID
	 * @param name [required] Name
	 * @param description [required] Description
	 */
	public OvhOperation serviceName_role_POST(String serviceName, Boolean autoSelectOption, String description, String name, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "autoSelectOption", autoSelectOption);
		addBody(o, "description", description);
		addBody(o, "name", name);
		addBody(o, "optionId", optionId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove user from the member list of specified role
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/role/{roleId}/member/{username}
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param username [required] Username
	 */
	public OvhOperation serviceName_role_roleId_member_username_DELETE(String serviceName, String roleId, String username) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member/{username}";
		StringBuilder sb = path(qPath, serviceName, roleId, username);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the member metadata
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/member/{username}
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param username [required] Username
	 */
	public OvhMember serviceName_role_roleId_member_username_GET(String serviceName, String roleId, String username) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member/{username}";
		StringBuilder sb = path(qPath, serviceName, roleId, username);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMember.class);
	}

	/**
	 * Update the member metadata
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/role/{roleId}/member/{username}
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param username [required] Username
	 * @param note [required] Custom note
	 */
	public OvhOperation serviceName_role_roleId_member_username_PUT(String serviceName, String roleId, String username, String note) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member/{username}";
		StringBuilder sb = path(qPath, serviceName, roleId, username);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "note", note);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the member list of specified role
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/member
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 */
	public ArrayList<String> serviceName_role_roleId_member_GET(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member";
		StringBuilder sb = path(qPath, serviceName, roleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Append user into the member list of specified role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/member
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param username [required] Username
	 * @param note [required] Custom note
	 */
	public OvhOperation serviceName_role_roleId_member_POST(String serviceName, String roleId, String note, String username) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "note", note);
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Append a elasticsearch index permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/index
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param indexId [required] Index ID
	 * @param permissionType [required] Permission type
	 */
	public OvhOperation serviceName_role_roleId_permission_index_POST(String serviceName, String roleId, String indexId, OvhPermissionIndexPermissionTypeEnum permissionType) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/index";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "indexId", indexId);
		addBody(o, "permissionType", permissionType);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the list of permissions of specified role
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/permission
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 */
	public ArrayList<String> serviceName_role_roleId_permission_GET(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission";
		StringBuilder sb = path(qPath, serviceName, roleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Append a elasticsearch alias permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/alias
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param aliasId [required] Alias ID
	 */
	public OvhOperation serviceName_role_roleId_permission_alias_POST(String serviceName, String roleId, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/alias";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "aliasId", aliasId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Append a graylog stream permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/stream
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param streamId [required] Stream ID
	 */
	public OvhOperation serviceName_role_roleId_permission_stream_POST(String serviceName, String roleId, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/stream";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streamId", streamId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified permission
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param permissionId [required] Permission ID
	 */
	public OvhOperation serviceName_role_roleId_permission_permissionId_DELETE(String serviceName, String roleId, String permissionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}";
		StringBuilder sb = path(qPath, serviceName, roleId, permissionId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of specified permission
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param permissionId [required] Permission ID
	 */
	public ArrayList<OvhPermission> serviceName_role_roleId_permission_permissionId_GET(String serviceName, String roleId, String permissionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}";
		StringBuilder sb = path(qPath, serviceName, roleId, permissionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhPermission>> t6 = new TypeReference<ArrayList<OvhPermission>>() {};

	/**
	 * Append a graylog dashboard permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/dashboard
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param dashboardId [required] Dashboard ID
	 * @param permissionType [required] Permission type
	 */
	public OvhOperation serviceName_role_roleId_permission_dashboard_POST(String serviceName, String roleId, String dashboardId, OvhPermissionDashboardPermissionTypeEnum permissionType) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/dashboard";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dashboardId", dashboardId);
		addBody(o, "permissionType", permissionType);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified role
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/role/{roleId}
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 */
	public OvhOperation serviceName_role_roleId_DELETE(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}";
		StringBuilder sb = path(qPath, serviceName, roleId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns details of specified role
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 */
	public OvhRole serviceName_role_roleId_GET(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}";
		StringBuilder sb = path(qPath, serviceName, roleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRole.class);
	}

	/**
	 * Update information of specified role
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/role/{roleId}
	 * @param serviceName [required] Service name
	 * @param roleId [required] Role ID
	 * @param optionId [required] Option ID
	 * @param name [required] Name
	 * @param description [required] Description
	 */
	public OvhOperation serviceName_role_roleId_PUT(String serviceName, String roleId, String description, String name, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "name", name);
		addBody(o, "optionId", optionId);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Returns the subscribed offer
	 *
	 * REST: GET /dbaas/logs/{serviceName}/offer
	 * @param serviceName [required] Service name
	 */
	public OvhOffer serviceName_offer_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/offer";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOffer.class);
	}

	/**
	 * Returns the overall quota limits
	 *
	 * REST: GET /dbaas/logs/{serviceName}/quota
	 * @param serviceName [required] Service name
	 */
	public OvhQuota serviceName_quota_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/quota";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhQuota.class);
	}

	/**
	 * Display specified offer
	 *
	 * REST: GET /dbaas/logs/offer/{reference}
	 * @param reference [required] Reference
	 */
	public OvhPublicOffer offer_reference_GET(String reference) throws IOException {
		String qPath = "/dbaas/logs/offer/{reference}";
		StringBuilder sb = path(qPath, reference);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPublicOffer.class);
	}
}
