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
import net.minidev.ovh.api.dbaas.logs.OvhDashboard;
import net.minidev.ovh.api.dbaas.logs.OvhEngine;
import net.minidev.ovh.api.dbaas.logs.OvhFlowggerConfiguration;
import net.minidev.ovh.api.dbaas.logs.OvhFlowggerConfigurationLogFormatEnum;
import net.minidev.ovh.api.dbaas.logs.OvhFlowggerConfigurationLogFramingEnum;
import net.minidev.ovh.api.dbaas.logs.OvhFlowggerConfigurationTlsMethodEnum;
import net.minidev.ovh.api.dbaas.logs.OvhFlowggerConfigurationTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhIndex;
import net.minidev.ovh.api.dbaas.logs.OvhInput;
import net.minidev.ovh.api.dbaas.logs.OvhInputAction;
import net.minidev.ovh.api.dbaas.logs.OvhLogstashConfiguration;
import net.minidev.ovh.api.dbaas.logs.OvhOffer;
import net.minidev.ovh.api.dbaas.logs.OvhOperation;
import net.minidev.ovh.api.dbaas.logs.OvhOption;
import net.minidev.ovh.api.dbaas.logs.OvhPermission;
import net.minidev.ovh.api.dbaas.logs.OvhRole;
import net.minidev.ovh.api.dbaas.logs.OvhServiceMetric;
import net.minidev.ovh.api.dbaas.logs.OvhStream;
import net.minidev.ovh.api.dbaas.logs.OvhStreamAlertCondition;
import net.minidev.ovh.api.dbaas.logs.OvhStreamAlertConditionConditionTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamAlertConditionConstraintTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamAlertConditionThresholdTypeEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamColdStorageCompressionEnum;
import net.minidev.ovh.api.dbaas.logs.OvhStreamRule;
import net.minidev.ovh.api.dbaas.logs.OvhTemporaryLogsLink;
import net.minidev.ovh.api.dbaas.logs.OvhTestResult;
import net.minidev.ovh.api.dbaas.logs.OvhToken;
import net.minidev.ovh.api.dbaas.logs.OvhUrl;
import net.minidev.ovh.api.services.OvhService;
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
	 * Get this object properties
	 *
	 * REST: GET /dbaas/logs/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your Logs pack
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your Logs pack
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Return the service object of connected identity.
	 *
	 * REST: GET /dbaas/logs/{serviceName}
	 * @param serviceName [required]
	 *
	 * API beta
	 */
	public net.minidev.ovh.api.dbaas.logs.OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.dbaas.logs.OvhService.class);
	}

	/**
	 * Update the service contact
	 *
	 * REST: PUT /dbaas/logs/{serviceName}
	 * @param serviceName [required]
	 * @param contactId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_PUT(String serviceName, Long contactId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactId", contactId);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of allowed cluster
	 *
	 * REST: GET /dbaas/logs/{serviceName}/cluster
	 * @param serviceName [required]
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_cluster_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/cluster";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Return details of an allowed cluster
	 *
	 * REST: GET /dbaas/logs/{serviceName}/cluster/{clusterId}
	 * @param serviceName [required]
	 * @param clusterId [required]
	 *
	 * API beta
	 */
	public OvhCluster serviceName_cluster_clusterId_GET(String serviceName, String clusterId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/cluster/{clusterId}";
		StringBuilder sb = path(qPath, serviceName, clusterId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCluster.class);
	}

	/**
	 * Return the list of registered input attached to the logged user
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input
	 * @param serviceName [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param engineId [required]
	 * @param optionId [required]
	 * @param title [required]
	 * @param exposedPort [required]
	 * @param singleInstance [required]
	 * @param description [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_input_POST(String serviceName, String streamId, String engineId, String optionId, String title, String exposedPort, Boolean singleInstance, String description) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streamId", streamId);
		addBody(o, "engineId", engineId);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		addBody(o, "exposedPort", exposedPort);
		addBody(o, "singleInstance", singleInstance);
		addBody(o, "description", description);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Schedule the restart of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/restart
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_input_inputId_restart_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/restart";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove the specified input object
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/input/{inputId}
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_input_inputId_DELETE(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param streamId [required]
	 * @param engineId [required]
	 * @param optionId [required]
	 * @param title [required]
	 * @param exposedPort [required]
	 * @param singleInstance [required]
	 * @param description [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_input_inputId_PUT(String serviceName, String inputId, String streamId, String engineId, String optionId, String title, String exposedPort, Boolean singleInstance, String description) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}";
		StringBuilder sb = path(qPath, serviceName, inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streamId", streamId);
		addBody(o, "engineId", engineId);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		addBody(o, "exposedPort", exposedPort);
		addBody(o, "singleInstance", singleInstance);
		addBody(o, "description", description);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Generate a temporary url to retrieve input logs
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/logs/url
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
	 */
	public OvhTemporaryLogsLink serviceName_input_inputId_logs_url_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/logs/url";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTemporaryLogsLink.class);
	}

	/**
	 * Schedule the end of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/end
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param network [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param allowedNetworkId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param allowedNetworkId [required]
	 *
	 * API beta
	 */
	public OvhAllowedNetwork serviceName_input_inputId_allowedNetwork_allowedNetworkId_GET(String serviceName, String inputId, String allowedNetworkId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork/{allowedNetworkId}";
		StringBuilder sb = path(qPath, serviceName, inputId, allowedNetworkId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAllowedNetwork.class);
	}

	/**
	 * Return the list of urls of specified input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/url
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
	 */
	public ArrayList<OvhUrl> serviceName_input_inputId_url_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/url";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhUrl>> t2 = new TypeReference<ArrayList<OvhUrl>>() {};

	/**
	 * Return actions of specified input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/action
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
	 */
	public ArrayList<OvhInputAction> serviceName_input_inputId_action_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/action";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhInputAction>> t3 = new TypeReference<ArrayList<OvhInputAction>>() {};

	/**
	 * Return the flowgger configuration
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param type [required]
	 * @param kafkaCoalesce [required]
	 * @param logFormat [required]
	 * @param logFraming [required]
	 * @param tlsMethod [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_input_inputId_configuration_flowgger_PUT(String serviceName, String inputId, OvhFlowggerConfigurationTypeEnum type, Long kafkaCoalesce, OvhFlowggerConfigurationLogFormatEnum logFormat, OvhFlowggerConfigurationLogFramingEnum logFraming, OvhFlowggerConfigurationTlsMethodEnum tlsMethod) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger";
		StringBuilder sb = path(qPath, serviceName, inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "type", type);
		addBody(o, "kafkaCoalesce", kafkaCoalesce);
		addBody(o, "logFormat", logFormat);
		addBody(o, "logFraming", logFraming);
		addBody(o, "tlsMethod", tlsMethod);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the logstash configuration
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param patternSection [required]
	 * @param inputSection [required]
	 * @param filterSection [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_input_inputId_configuration_logstash_PUT(String serviceName, String inputId, String patternSection, String inputSection, String filterSection) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash";
		StringBuilder sb = path(qPath, serviceName, inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "patternSection", patternSection);
		addBody(o, "inputSection", inputSection);
		addBody(o, "filterSection", filterSection);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Validate configuration of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/configtest
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_input_inputId_configtest_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configtest";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the config test operation result
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/configtest/result
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
	 */
	public OvhTestResult serviceName_input_inputId_configtest_result_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configtest/result";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTestResult.class);
	}

	/**
	 * Schedule the start of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/start
	 * @param serviceName [required]
	 * @param inputId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_input_inputId_start_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/start";
		StringBuilder sb = path(qPath, serviceName, inputId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the subscribed offer
	 *
	 * REST: GET /dbaas/logs/{serviceName}/offer
	 * @param serviceName [required]
	 *
	 * API beta
	 */
	public OvhOffer serviceName_offer_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/offer";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOffer.class);
	}

	/**
	 * Remove specified elasticsearch index
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}
	 * @param serviceName [required]
	 * @param indexId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_elasticsearch_index_indexId_DELETE(String serviceName, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}";
		StringBuilder sb = path(qPath, serviceName, indexId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return specified elasticsearch index
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}
	 * @param serviceName [required]
	 * @param indexId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param indexId [required]
	 * @param optionId [required]
	 * @param description [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_elasticsearch_index_indexId_PUT(String serviceName, String indexId, String optionId, String description) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}";
		StringBuilder sb = path(qPath, serviceName, indexId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "optionId", optionId);
		addBody(o, "description", description);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of urls of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}/url
	 * @param serviceName [required]
	 * @param indexId [required]
	 *
	 * API beta
	 */
	public ArrayList<OvhUrl> serviceName_output_elasticsearch_index_indexId_url_GET(String serviceName, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}/url";
		StringBuilder sb = path(qPath, serviceName, indexId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Return the list of elasticsearch indexes
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/index
	 * @param serviceName [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param suffix [required]
	 * @param optionId [required]
	 * @param description [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_elasticsearch_index_POST(String serviceName, String suffix, String optionId, String description) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "suffix", suffix);
		addBody(o, "optionId", optionId);
		addBody(o, "description", description);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of alias for connected user
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias
	 * @param serviceName [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param suffix [required]
	 * @param optionId [required]
	 * @param description [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_POST(String serviceName, String suffix, String optionId, String description) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "suffix", suffix);
		addBody(o, "optionId", optionId);
		addBody(o, "description", description);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified elasticsearch alias
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}
	 * @param serviceName [required]
	 * @param aliasId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_DELETE(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return specified elasticsearch alias
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}
	 * @param serviceName [required]
	 * @param aliasId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param aliasId [required]
	 * @param optionId [required]
	 * @param description [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_PUT(String serviceName, String aliasId, String optionId, String description) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "optionId", optionId);
		addBody(o, "description", description);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of urls of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/url
	 * @param serviceName [required]
	 * @param aliasId [required]
	 *
	 * API beta
	 */
	public ArrayList<OvhUrl> serviceName_output_elasticsearch_alias_aliasId_url_GET(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/url";
		StringBuilder sb = path(qPath, serviceName, aliasId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Return the list of graylog streams attached to specified         elasticsearch alias
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream
	 * @param serviceName [required]
	 * @param aliasId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param aliasId [required]
	 * @param streamId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param aliasId [required]
	 * @param streamId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_stream_streamId_DELETE(String serviceName, String aliasId, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream/{streamId}";
		StringBuilder sb = path(qPath, serviceName, aliasId, streamId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of graylog streams
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream
	 * @param serviceName [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param coldStorageEnabled [required]
	 * @param optionId [required]
	 * @param title [required]
	 * @param coldStorageNotify [required]
	 * @param coldStorageRetention [required]
	 * @param webSocketEnabled [required]
	 * @param description [required]
	 * @param coldStorageCompression [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_stream_POST(String serviceName, Boolean coldStorageEnabled, String optionId, String title, Boolean coldStorageNotify, Long coldStorageRetention, Boolean webSocketEnabled, String description, OvhStreamColdStorageCompressionEnum coldStorageCompression) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "coldStorageEnabled", coldStorageEnabled);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		addBody(o, "coldStorageNotify", coldStorageNotify);
		addBody(o, "coldStorageRetention", coldStorageRetention);
		addBody(o, "webSocketEnabled", webSocketEnabled);
		addBody(o, "description", description);
		addBody(o, "coldStorageCompression", coldStorageCompression);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of configured alerts of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert
	 * @param serviceName [required]
	 * @param streamId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param value [required]
	 * @param time [required]
	 * @param backlog [required]
	 * @param field [required]
	 * @param conditionType [required]
	 * @param constraintType [required]
	 * @param grace [required]
	 * @param title [required]
	 * @param thresholdType [required]
	 * @param threshold [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_alert_POST(String serviceName, String streamId, String value, Long time, Long backlog, String field, OvhStreamAlertConditionConditionTypeEnum conditionType, OvhStreamAlertConditionConstraintTypeEnum constraintType, Long grace, String title, OvhStreamAlertConditionThresholdTypeEnum thresholdType, Long threshold) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert";
		StringBuilder sb = path(qPath, serviceName, streamId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "value", value);
		addBody(o, "time", time);
		addBody(o, "backlog", backlog);
		addBody(o, "field", field);
		addBody(o, "conditionType", conditionType);
		addBody(o, "constraintType", constraintType);
		addBody(o, "grace", grace);
		addBody(o, "title", title);
		addBody(o, "thresholdType", thresholdType);
		addBody(o, "threshold", threshold);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove alert from specified graylog stream
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param alertId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_alert_alertId_DELETE(String serviceName, String streamId, String alertId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}";
		StringBuilder sb = path(qPath, serviceName, streamId, alertId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified graylog stream alert
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param alertId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param alertId [required]
	 * @param value [required]
	 * @param time [required]
	 * @param backlog [required]
	 * @param field [required]
	 * @param conditionType [required]
	 * @param constraintType [required]
	 * @param grace [required]
	 * @param title [required]
	 * @param thresholdType [required]
	 * @param threshold [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_alert_alertId_PUT(String serviceName, String streamId, String alertId, String value, Long time, Long backlog, String field, OvhStreamAlertConditionConditionTypeEnum conditionType, OvhStreamAlertConditionConstraintTypeEnum constraintType, Long grace, String title, OvhStreamAlertConditionThresholdTypeEnum thresholdType, Long threshold) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}";
		StringBuilder sb = path(qPath, serviceName, streamId, alertId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "value", value);
		addBody(o, "time", time);
		addBody(o, "backlog", backlog);
		addBody(o, "field", field);
		addBody(o, "conditionType", conditionType);
		addBody(o, "constraintType", constraintType);
		addBody(o, "grace", grace);
		addBody(o, "title", title);
		addBody(o, "thresholdType", thresholdType);
		addBody(o, "threshold", threshold);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified graylog stream
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_DELETE(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param coldStorageEnabled [required]
	 * @param optionId [required]
	 * @param title [required]
	 * @param coldStorageNotify [required]
	 * @param coldStorageCompression [required]
	 * @param webSocketEnabled [required]
	 * @param description [required]
	 * @param coldStorageRetention [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_PUT(String serviceName, String streamId, Boolean coldStorageEnabled, String optionId, String title, Boolean coldStorageNotify, OvhStreamColdStorageCompressionEnum coldStorageCompression, Boolean webSocketEnabled, String description, Long coldStorageRetention) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}";
		StringBuilder sb = path(qPath, serviceName, streamId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "coldStorageEnabled", coldStorageEnabled);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		addBody(o, "coldStorageNotify", coldStorageNotify);
		addBody(o, "coldStorageCompression", coldStorageCompression);
		addBody(o, "webSocketEnabled", webSocketEnabled);
		addBody(o, "description", description);
		addBody(o, "coldStorageRetention", coldStorageRetention);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of archives
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive
	 * @param serviceName [required]
	 * @param streamId [required]
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_output_graylog_stream_streamId_archive_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Return details of specified archive
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive/{archiveId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param archiveId [required]
	 *
	 * API beta
	 */
	public OvhArchive serviceName_output_graylog_stream_streamId_archive_archiveId_GET(String serviceName, String streamId, String archiveId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive/{archiveId}";
		StringBuilder sb = path(qPath, serviceName, streamId, archiveId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhArchive.class);
	}

	/**
	 * Get a public temporary URL to access the archive
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive/{archiveId}/url
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param archiveId [required]
	 * @param expirationInSeconds [required]
	 *
	 * API beta
	 */
	public OvhArchiveUrl serviceName_output_graylog_stream_streamId_archive_archiveId_url_POST(String serviceName, String streamId, String archiveId, Long expirationInSeconds) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/archive/{archiveId}/url";
		StringBuilder sb = path(qPath, serviceName, streamId, archiveId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "expirationInSeconds", expirationInSeconds);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhArchiveUrl.class);
	}

	/**
	 * Return the list of urls of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/url
	 * @param serviceName [required]
	 * @param streamId [required]
	 *
	 * API beta
	 */
	public ArrayList<OvhUrl> serviceName_output_graylog_stream_streamId_url_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/url";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Return the list of rules of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule
	 * @param serviceName [required]
	 * @param streamId [required]
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_output_graylog_stream_streamId_rule_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule";
		StringBuilder sb = path(qPath, serviceName, streamId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Return details of specified graylog stream rule
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule/{ruleId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param ruleId [required]
	 *
	 * API beta
	 */
	public ArrayList<OvhStreamRule> serviceName_output_graylog_stream_streamId_rule_ruleId_GET(String serviceName, String streamId, String ruleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, serviceName, streamId, ruleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhStreamRule>> t4 = new TypeReference<ArrayList<OvhStreamRule>>() {};

	/**
	 * Return the list graylog dashboards
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/dashboard
	 * @param serviceName [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param optionId [required]
	 * @param description [required]
	 * @param title [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_dashboard_POST(String serviceName, String optionId, String description, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "optionId", optionId);
		addBody(o, "description", description);
		addBody(o, "title", title);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified graylog dashboard
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_dashboard_dashboardId_DELETE(String serviceName, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}";
		StringBuilder sb = path(qPath, serviceName, dashboardId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified graylog dashboard
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 * @param optionId [required]
	 * @param description [required]
	 * @param title [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_dashboard_dashboardId_PUT(String serviceName, String dashboardId, String optionId, String description, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}";
		StringBuilder sb = path(qPath, serviceName, dashboardId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "optionId", optionId);
		addBody(o, "description", description);
		addBody(o, "title", title);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Copy all widgets from specified dashboard to a new one
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/duplicate
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 * @param streamId [required]
	 * @param optionId [required]
	 * @param description [required]
	 * @param title [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_output_graylog_dashboard_dashboardId_duplicate_POST(String serviceName, String dashboardId, String streamId, String optionId, String description, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/duplicate";
		StringBuilder sb = path(qPath, serviceName, dashboardId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streamId", streamId);
		addBody(o, "optionId", optionId);
		addBody(o, "description", description);
		addBody(o, "title", title);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of urls of specified graylog dashboard
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/url
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 *
	 * API beta
	 */
	public ArrayList<OvhUrl> serviceName_output_graylog_dashboard_dashboardId_url_GET(String serviceName, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/url";
		StringBuilder sb = path(qPath, serviceName, dashboardId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /dbaas/logs/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your Logs pack
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<Long>> t5 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Initiate a password change procedure.
	 *
	 * REST: POST /dbaas/logs/{serviceName}/user/changePassword
	 * @param serviceName [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_user_changePassword_POST(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/user/changePassword";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return platform useful urls.
	 *
	 * REST: GET /dbaas/logs/{serviceName}/url
	 * @param serviceName [required]
	 *
	 * API beta
	 */
	public ArrayList<OvhUrl> serviceName_url_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/url";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Return Metrics credentials
	 *
	 * REST: GET /dbaas/logs/{serviceName}/metrics
	 * @param serviceName [required]
	 *
	 * API beta
	 */
	public OvhServiceMetric serviceName_metrics_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/metrics";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceMetric.class);
	}

	/**
	 * Latest operations
	 *
	 * REST: GET /dbaas/logs/{serviceName}/operation
	 * @param serviceName [required]
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_operation_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/operation";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Return details of specified operation
	 *
	 * REST: GET /dbaas/logs/{serviceName}/operation/{operationId}
	 * @param serviceName [required]
	 * @param operationId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_operation_operationId_GET(String serviceName, String operationId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/operation/{operationId}";
		StringBuilder sb = path(qPath, serviceName, operationId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the subscribed additional options
	 *
	 * REST: GET /dbaas/logs/{serviceName}/option
	 * @param serviceName [required]
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_option_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/option";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Return details of a subscribed option
	 *
	 * REST: GET /dbaas/logs/{serviceName}/option/{optionId}
	 * @param serviceName [required]
	 * @param optionId [required]
	 *
	 * API beta
	 */
	public OvhOption serviceName_option_optionId_GET(String serviceName, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/option/{optionId}";
		StringBuilder sb = path(qPath, serviceName, optionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOption.class);
	}

	/**
	 * Return the list of service tokens
	 *
	 * REST: GET /dbaas/logs/{serviceName}/token
	 * @param serviceName [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param clusterId [required]
	 * @param name [required]
	 *
	 * API beta
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
	 * Delete the specified token
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/token/{tokenId}
	 * @param serviceName [required]
	 * @param tokenId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_token_tokenId_DELETE(String serviceName, String tokenId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token/{tokenId}";
		StringBuilder sb = path(qPath, serviceName, tokenId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the specified token
	 *
	 * REST: GET /dbaas/logs/{serviceName}/token/{tokenId}
	 * @param serviceName [required]
	 * @param tokenId [required]
	 *
	 * API beta
	 */
	public OvhToken serviceName_token_tokenId_GET(String serviceName, String tokenId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token/{tokenId}";
		StringBuilder sb = path(qPath, serviceName, tokenId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhToken.class);
	}

	/**
	 * Remove specified role
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/role/{roleId}
	 * @param serviceName [required]
	 * @param roleId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_role_roleId_DELETE(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}";
		StringBuilder sb = path(qPath, serviceName, roleId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified role
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}
	 * @param serviceName [required]
	 * @param roleId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param optionId [required]
	 * @param description [required]
	 * @param name [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_role_roleId_PUT(String serviceName, String roleId, String optionId, String description, String name) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "optionId", optionId);
		addBody(o, "description", description);
		addBody(o, "name", name);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the member list of specified role
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/member
	 * @param serviceName [required]
	 * @param roleId [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param username [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_role_roleId_member_POST(String serviceName, String roleId, String username) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "username", username);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove user from the member list of specified role
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/role/{roleId}/member/{username}
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param username [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_role_roleId_member_username_DELETE(String serviceName, String roleId, String username) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member/{username}";
		StringBuilder sb = path(qPath, serviceName, roleId, username);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of permissions of specified role
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/permission
	 * @param serviceName [required]
	 * @param roleId [required]
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_role_roleId_permission_GET(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission";
		StringBuilder sb = path(qPath, serviceName, roleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Append a elasticsearch index permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/index
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param indexId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_role_roleId_permission_index_POST(String serviceName, String roleId, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/index";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "indexId", indexId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified permission
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param permissionId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_role_roleId_permission_permissionId_DELETE(String serviceName, String roleId, String permissionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}";
		StringBuilder sb = path(qPath, serviceName, roleId, permissionId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified permission
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param permissionId [required]
	 *
	 * API beta
	 */
	public ArrayList<OvhPermission> serviceName_role_roleId_permission_permissionId_GET(String serviceName, String roleId, String permissionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}";
		StringBuilder sb = path(qPath, serviceName, roleId, permissionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhPermission>> t6 = new TypeReference<ArrayList<OvhPermission>>() {};

	/**
	 * Append a graylog stream permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/stream
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param streamId [required]
	 *
	 * API beta
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
	 * Append a elasticsearch alias permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/alias
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param aliasId [required]
	 *
	 * API beta
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
	 * Append a graylog dashboard permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/dashboard
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param dashboardId [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_role_roleId_permission_dashboard_POST(String serviceName, String roleId, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/dashboard";
		StringBuilder sb = path(qPath, serviceName, roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dashboardId", dashboardId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of roles
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role
	 * @param serviceName [required]
	 *
	 * API beta
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
	 * @param serviceName [required]
	 * @param optionId [required]
	 * @param description [required]
	 * @param name [required]
	 *
	 * API beta
	 */
	public OvhOperation serviceName_role_POST(String serviceName, String optionId, String description, String name) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "optionId", optionId);
		addBody(o, "description", description);
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dbaas/logs
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dbaas/logs";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Return the list of available input engines
	 *
	 * REST: GET /dbaas/logs/input/engine
	 *
	 * API beta
	 */
	public ArrayList<String> input_engine_GET() throws IOException {
		String qPath = "/dbaas/logs/input/engine";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Return details of specified input engine
	 *
	 * REST: GET /dbaas/logs/input/engine/{engineId}
	 * @param engineId [required]
	 *
	 * API beta
	 */
	public OvhEngine input_engine_engineId_GET(String engineId) throws IOException {
		String qPath = "/dbaas/logs/input/engine/{engineId}";
		StringBuilder sb = path(qPath, engineId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEngine.class);
	}
}
