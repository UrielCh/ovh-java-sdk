package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.dbaaslogs.OvhAlias;
import net.minidev.ovh.api.dbaaslogs.OvhAllowedNetwork;
import net.minidev.ovh.api.dbaaslogs.OvhDashboard;
import net.minidev.ovh.api.dbaaslogs.OvhEngine;
import net.minidev.ovh.api.dbaaslogs.OvhFlowggerConfiguration;
import net.minidev.ovh.api.dbaaslogs.OvhFlowggerConfigurationLogformat;
import net.minidev.ovh.api.dbaaslogs.OvhFlowggerConfigurationLogframing;
import net.minidev.ovh.api.dbaaslogs.OvhFlowggerConfigurationTlsmethod;
import net.minidev.ovh.api.dbaaslogs.OvhFlowggerConfigurationType;
import net.minidev.ovh.api.dbaaslogs.OvhIndex;
import net.minidev.ovh.api.dbaaslogs.OvhInput;
import net.minidev.ovh.api.dbaaslogs.OvhInputAction;
import net.minidev.ovh.api.dbaaslogs.OvhLogstashConfiguration;
import net.minidev.ovh.api.dbaaslogs.OvhNewStreamAlertConditionConditiontype;
import net.minidev.ovh.api.dbaaslogs.OvhNewStreamAlertConditionConstrainttype;
import net.minidev.ovh.api.dbaaslogs.OvhNewStreamAlertConditionThresholdtype;
import net.minidev.ovh.api.dbaaslogs.OvhOffer;
import net.minidev.ovh.api.dbaaslogs.OvhOperation;
import net.minidev.ovh.api.dbaaslogs.OvhOption;
import net.minidev.ovh.api.dbaaslogs.OvhPermission;
import net.minidev.ovh.api.dbaaslogs.OvhRole;
import net.minidev.ovh.api.dbaaslogs.OvhServiceMetric;
import net.minidev.ovh.api.dbaaslogs.OvhStream;
import net.minidev.ovh.api.dbaaslogs.OvhStreamAlertCondition;
import net.minidev.ovh.api.dbaaslogs.OvhStreamRule;
import net.minidev.ovh.api.dbaaslogs.OvhTestResult;
import net.minidev.ovh.api.dbaaslogs.OvhToken;
import net.minidev.ovh.api.dbaaslogs.OvhUrl;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
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
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your Logs pack
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Return the service object of connected identity.
	 *
	 * REST: GET /dbaas/logs/{serviceName}
	 * @param serviceName [required]
	 */
	public net.minidev.ovh.api.dbaaslogs.OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, net.minidev.ovh.api.dbaaslogs.OvhService.class);
	}

	/**
	 * Update the service contact
	 *
	 * REST: PUT /dbaas/logs/{serviceName}
	 * @param serviceName [required]
	 * @param contactId [required]
	 */
	public OvhOperation serviceName_PUT(String serviceName, Long contactId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactId", contactId);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of registered input attached to the logged user
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input
	 * @param serviceName [required]
	 */
	public ArrayList<String> serviceName_input_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Register a new input object
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input
	 * @param serviceName [required]
	 * @param engineId [required]
	 * @param streamId [required]
	 * @param exposedPort [required]
	 * @param title [required]
	 * @param singleInstance [required]
	 * @param description [required]
	 * @param optionId [required]
	 */
	public OvhOperation serviceName_input_POST(String serviceName, String engineId, String streamId, String exposedPort, String title, Boolean singleInstance, String description, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "engineId", engineId);
		addBody(o, "streamId", streamId);
		addBody(o, "exposedPort", exposedPort);
		addBody(o, "title", title);
		addBody(o, "singleInstance", singleInstance);
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Schedule the restart of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/restart
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public OvhOperation serviceName_input_inputId_restart_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/restart";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove the specified input object
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/input/{inputId}
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public OvhOperation serviceName_input_inputId_DELETE(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public OvhInput serviceName_input_inputId_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhInput.class);
	}

	/**
	 * Update information of specified input object
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/input/{inputId}
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param engineId [required]
	 * @param streamId [required]
	 * @param exposedPort [required]
	 * @param title [required]
	 * @param singleInstance [required]
	 * @param description [required]
	 * @param optionId [required]
	 */
	public OvhOperation serviceName_input_inputId_PUT(String serviceName, String inputId, String engineId, String streamId, String exposedPort, String title, Boolean singleInstance, String description, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "engineId", engineId);
		addBody(o, "streamId", streamId);
		addBody(o, "exposedPort", exposedPort);
		addBody(o, "title", title);
		addBody(o, "singleInstance", singleInstance);
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Schedule the end of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/end
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public OvhOperation serviceName_input_inputId_end_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/end";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * List all network UUID allowed to join input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public ArrayList<String> serviceName_input_inputId_allowedNetwork_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Allow an ip to join input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param network [required]
	 */
	public OvhOperation serviceName_input_inputId_allowedNetwork_POST(String serviceName, String inputId, String network) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "network", network);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove the specified IP from the list of allowed networks
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork/{allowedNetworkId}
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param allowedNetworkId [required]
	 */
	public OvhOperation serviceName_input_inputId_allowedNetwork_allowedNetworkId_DELETE(String serviceName, String inputId, String allowedNetworkId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork/{allowedNetworkId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		qPath = qPath.replace("{allowedNetworkId}", allowedNetworkId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * List all network UUID allowed to join input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork/{allowedNetworkId}
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param allowedNetworkId [required]
	 */
	public OvhAllowedNetwork serviceName_input_inputId_allowedNetwork_allowedNetworkId_GET(String serviceName, String inputId, String allowedNetworkId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/allowedNetwork/{allowedNetworkId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		qPath = qPath.replace("{allowedNetworkId}", allowedNetworkId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAllowedNetwork.class);
	}

	/**
	 * Return the list of urls of specified input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/url
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public ArrayList<OvhUrl> serviceName_input_inputId_url_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/url";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhUrl>> t2 = new TypeReference<ArrayList<OvhUrl>>() {};

	/**
	 * Return actions of specified input
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/action
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public ArrayList<OvhInputAction> serviceName_input_inputId_action_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/action";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhInputAction>> t3 = new TypeReference<ArrayList<OvhInputAction>>() {};

	/**
	 * Return the flowgger configuration
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public OvhFlowggerConfiguration serviceName_input_inputId_configuration_flowgger_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFlowggerConfiguration.class);
	}

	/**
	 * Update the flowgger configuration
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param tlsMethod [required]
	 * @param logFraming [required]
	 * @param logFormat [required]
	 * @param kafkaCoalesce [required]
	 * @param type [required]
	 */
	public OvhOperation serviceName_input_inputId_configuration_flowgger_PUT(String serviceName, String inputId, OvhFlowggerConfigurationTlsmethod tlsMethod, OvhFlowggerConfigurationLogframing logFraming, OvhFlowggerConfigurationLogformat logFormat, Long kafkaCoalesce, OvhFlowggerConfigurationType type) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/flowgger";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "tlsMethod", tlsMethod);
		addBody(o, "logFraming", logFraming);
		addBody(o, "logFormat", logFormat);
		addBody(o, "kafkaCoalesce", kafkaCoalesce);
		addBody(o, "type", type);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the logstash configuration
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public OvhLogstashConfiguration serviceName_input_inputId_configuration_logstash_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhLogstashConfiguration.class);
	}

	/**
	 * Update the logstash configuration
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash
	 * @param serviceName [required]
	 * @param inputId [required]
	 * @param patternSection [required]
	 * @param filterSection [required]
	 * @param inputSection [required]
	 */
	public OvhOperation serviceName_input_inputId_configuration_logstash_PUT(String serviceName, String inputId, String patternSection, String filterSection, String inputSection) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configuration/logstash";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "patternSection", patternSection);
		addBody(o, "filterSection", filterSection);
		addBody(o, "inputSection", inputSection);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Validate configuration of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/configtest
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public OvhOperation serviceName_input_inputId_configtest_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configtest";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the config test operation result
	 *
	 * REST: GET /dbaas/logs/{serviceName}/input/{inputId}/configtest/result
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public OvhTestResult serviceName_input_inputId_configtest_result_GET(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/configtest/result";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTestResult.class);
	}

	/**
	 * Schedule the start of specified input
	 *
	 * REST: POST /dbaas/logs/{serviceName}/input/{inputId}/start
	 * @param serviceName [required]
	 * @param inputId [required]
	 */
	public OvhOperation serviceName_input_inputId_start_POST(String serviceName, String inputId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/input/{inputId}/start";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{inputId}", inputId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the subscribed offer
	 *
	 * REST: GET /dbaas/logs/{serviceName}/offer
	 * @param serviceName [required]
	 */
	public OvhOffer serviceName_offer_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/offer";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOffer.class);
	}

	/**
	 * Remove specified elasticsearch index
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}
	 * @param serviceName [required]
	 * @param indexId [required]
	 */
	public OvhOperation serviceName_output_elasticsearch_index_indexId_DELETE(String serviceName, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{indexId}", indexId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return specified elasticsearch index
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}
	 * @param serviceName [required]
	 * @param indexId [required]
	 */
	public OvhIndex serviceName_output_elasticsearch_index_indexId_GET(String serviceName, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{indexId}", indexId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIndex.class);
	}

	/**
	 * Update specified elasticsearch index
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}
	 * @param serviceName [required]
	 * @param indexId [required]
	 * @param description [required]
	 * @param optionId [required]
	 */
	public OvhOperation serviceName_output_elasticsearch_index_indexId_PUT(String serviceName, String indexId, String description, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{indexId}", indexId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of urls of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}/url
	 * @param serviceName [required]
	 * @param indexId [required]
	 */
	public ArrayList<OvhUrl> serviceName_output_elasticsearch_index_indexId_url_GET(String serviceName, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index/{indexId}/url";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{indexId}", indexId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Return the list of elasticsearch indexes
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/index
	 * @param serviceName [required]
	 */
	public ArrayList<String> serviceName_output_elasticsearch_index_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new elasticsearch index
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/elasticsearch/index
	 * @param serviceName [required]
	 * @param description [required]
	 * @param optionId [required]
	 * @param suffix [required]
	 */
	public OvhOperation serviceName_output_elasticsearch_index_POST(String serviceName, String description, String optionId, String suffix) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/index";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "suffix", suffix);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of alias for connected user
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias
	 * @param serviceName [required]
	 */
	public ArrayList<String> serviceName_output_elasticsearch_alias_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new elasticsearch alias
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/elasticsearch/alias
	 * @param serviceName [required]
	 * @param description [required]
	 * @param optionId [required]
	 * @param suffix [required]
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_POST(String serviceName, String description, String optionId, String suffix) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "suffix", suffix);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified elasticsearch alias
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}
	 * @param serviceName [required]
	 * @param aliasId [required]
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_DELETE(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{aliasId}", aliasId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return specified elasticsearch alias
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}
	 * @param serviceName [required]
	 * @param aliasId [required]
	 */
	public OvhAlias serviceName_output_elasticsearch_alias_aliasId_GET(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{aliasId}", aliasId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAlias.class);
	}

	/**
	 * Update specified elasticsearch alias
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}
	 * @param serviceName [required]
	 * @param aliasId [required]
	 * @param description [required]
	 * @param optionId [required]
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_PUT(String serviceName, String aliasId, String description, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{aliasId}", aliasId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of urls of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/url
	 * @param serviceName [required]
	 * @param aliasId [required]
	 */
	public ArrayList<OvhUrl> serviceName_output_elasticsearch_alias_aliasId_url_GET(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/url";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{aliasId}", aliasId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Return the list of graylog streams attached to specified         elasticsearch alias
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream
	 * @param serviceName [required]
	 * @param aliasId [required]
	 */
	public ArrayList<String> serviceName_output_elasticsearch_alias_aliasId_stream_GET(String serviceName, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{aliasId}", aliasId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Attach a graylog stream to specified elasticsearch alias
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream
	 * @param serviceName [required]
	 * @param aliasId [required]
	 * @param streamId [required]
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_stream_POST(String serviceName, String aliasId, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{aliasId}", aliasId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streamId", streamId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Detach a graylog stream from specified elasticsearch alias
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream/{streamId}
	 * @param serviceName [required]
	 * @param aliasId [required]
	 * @param streamId [required]
	 */
	public OvhOperation serviceName_output_elasticsearch_alias_aliasId_stream_streamId_DELETE(String serviceName, String aliasId, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/elasticsearch/alias/{aliasId}/stream/{streamId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{aliasId}", aliasId);
		qPath = qPath.replace("{streamId}", streamId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of graylog streams
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream
	 * @param serviceName [required]
	 */
	public ArrayList<String> serviceName_output_graylog_stream_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new graylog stream
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/stream
	 * @param serviceName [required]
	 * @param description [required]
	 * @param optionId [required]
	 * @param title [required]
	 */
	public OvhOperation serviceName_output_graylog_stream_POST(String serviceName, String description, String optionId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of configured alerts of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert
	 * @param serviceName [required]
	 * @param streamId [required]
	 */
	public ArrayList<String> serviceName_output_graylog_stream_streamId_alert_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new alert on specified graylog stream
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param field [required]
	 * @param time [required]
	 * @param title [required]
	 * @param value [required]
	 * @param thresholdType [required]
	 * @param threshold [required]
	 * @param backlog [required]
	 * @param constraintType [required]
	 * @param conditionType [required]
	 * @param grace [required]
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_alert_POST(String serviceName, String streamId, String field, Long time, String title, String value, OvhNewStreamAlertConditionThresholdtype thresholdType, Long threshold, Long backlog, OvhNewStreamAlertConditionConstrainttype constraintType, OvhNewStreamAlertConditionConditiontype conditionType, Long grace) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "field", field);
		addBody(o, "time", time);
		addBody(o, "title", title);
		addBody(o, "value", value);
		addBody(o, "thresholdType", thresholdType);
		addBody(o, "threshold", threshold);
		addBody(o, "backlog", backlog);
		addBody(o, "constraintType", constraintType);
		addBody(o, "conditionType", conditionType);
		addBody(o, "grace", grace);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove alert from specified graylog stream
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param alertId [required]
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_alert_alertId_DELETE(String serviceName, String streamId, String alertId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		qPath = qPath.replace("{alertId}", alertId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified graylog stream alert
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param alertId [required]
	 */
	public OvhStreamAlertCondition serviceName_output_graylog_stream_streamId_alert_alertId_GET(String serviceName, String streamId, String alertId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		qPath = qPath.replace("{alertId}", alertId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhStreamAlertCondition.class);
	}

	/**
	 * Update alert information of specified graylog stream
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param alertId [required]
	 * @param field [required]
	 * @param time [required]
	 * @param title [required]
	 * @param value [required]
	 * @param thresholdType [required]
	 * @param threshold [required]
	 * @param backlog [required]
	 * @param constraintType [required]
	 * @param conditionType [required]
	 * @param grace [required]
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_alert_alertId_PUT(String serviceName, String streamId, String alertId, String field, Long time, String title, String value, OvhNewStreamAlertConditionThresholdtype thresholdType, Long threshold, Long backlog, OvhNewStreamAlertConditionConstrainttype constraintType, OvhNewStreamAlertConditionConditiontype conditionType, Long grace) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/alert/{alertId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		qPath = qPath.replace("{alertId}", alertId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "field", field);
		addBody(o, "time", time);
		addBody(o, "title", title);
		addBody(o, "value", value);
		addBody(o, "thresholdType", thresholdType);
		addBody(o, "threshold", threshold);
		addBody(o, "backlog", backlog);
		addBody(o, "constraintType", constraintType);
		addBody(o, "conditionType", conditionType);
		addBody(o, "grace", grace);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified graylog stream
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_DELETE(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 */
	public OvhStream serviceName_output_graylog_stream_streamId_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhStream.class);
	}

	/**
	 * Update information of specified graylog stream
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param description [required]
	 * @param optionId [required]
	 * @param title [required]
	 */
	public OvhOperation serviceName_output_graylog_stream_streamId_PUT(String serviceName, String streamId, String description, String optionId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of urls of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/url
	 * @param serviceName [required]
	 * @param streamId [required]
	 */
	public ArrayList<OvhUrl> serviceName_output_graylog_stream_streamId_url_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/url";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Return the list of rules of specified graylog stream
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule
	 * @param serviceName [required]
	 * @param streamId [required]
	 */
	public ArrayList<String> serviceName_output_graylog_stream_streamId_rule_GET(String serviceName, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Return details of specified graylog stream rule
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule/{ruleId}
	 * @param serviceName [required]
	 * @param streamId [required]
	 * @param ruleId [required]
	 */
	public ArrayList<OvhStreamRule> serviceName_output_graylog_stream_streamId_rule_ruleId_GET(String serviceName, String streamId, String ruleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/stream/{streamId}/rule/{ruleId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{streamId}", streamId);
		qPath = qPath.replace("{ruleId}", ruleId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhStreamRule>> t4 = new TypeReference<ArrayList<OvhStreamRule>>() {};

	/**
	 * Return the list graylog dashboards
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/dashboard
	 * @param serviceName [required]
	 */
	public ArrayList<String> serviceName_output_graylog_dashboard_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new graylog dashboard
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/dashboard
	 * @param serviceName [required]
	 * @param description [required]
	 * @param optionId [required]
	 * @param title [required]
	 */
	public OvhOperation serviceName_output_graylog_dashboard_POST(String serviceName, String description, String optionId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified graylog dashboard
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 */
	public OvhOperation serviceName_output_graylog_dashboard_dashboardId_DELETE(String serviceName, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{dashboardId}", dashboardId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified graylog dashboard
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 */
	public OvhDashboard serviceName_output_graylog_dashboard_dashboardId_GET(String serviceName, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{dashboardId}", dashboardId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDashboard.class);
	}

	/**
	 * Update information of specified graylog dashboard
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 * @param description [required]
	 * @param optionId [required]
	 * @param title [required]
	 */
	public OvhOperation serviceName_output_graylog_dashboard_dashboardId_PUT(String serviceName, String dashboardId, String description, String optionId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{dashboardId}", dashboardId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "title", title);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Copy all widgets from specified dashboard to a new one
	 *
	 * REST: POST /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/duplicate
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 * @param description [required]
	 * @param optionId [required]
	 * @param streamId [required]
	 * @param title [required]
	 */
	public OvhOperation serviceName_output_graylog_dashboard_dashboardId_duplicate_POST(String serviceName, String dashboardId, String description, String optionId, String streamId, String title) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/duplicate";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{dashboardId}", dashboardId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		addBody(o, "streamId", streamId);
		addBody(o, "title", title);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of urls of specified graylog dashboard
	 *
	 * REST: GET /dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/url
	 * @param serviceName [required]
	 * @param dashboardId [required]
	 */
	public ArrayList<OvhUrl> serviceName_output_graylog_dashboard_dashboardId_url_GET(String serviceName, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/output/graylog/dashboard/{dashboardId}/url";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{dashboardId}", dashboardId);
		String resp = exec("GET", qPath);
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
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<Long>> t5 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Initiate a password change procedure.
	 *
	 * REST: POST /dbaas/logs/{serviceName}/user/changePassword
	 * @param serviceName [required]
	 */
	public OvhOperation serviceName_user_changePassword_POST(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/user/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return platform useful urls.
	 *
	 * REST: GET /dbaas/logs/{serviceName}/url
	 * @param serviceName [required]
	 */
	public ArrayList<OvhUrl> serviceName_url_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/url";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Return IOT credentials
	 *
	 * REST: GET /dbaas/logs/{serviceName}/metrics
	 * @param serviceName [required]
	 */
	public OvhServiceMetric serviceName_metrics_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/metrics";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServiceMetric.class);
	}

	/**
	 * Latest operations
	 *
	 * REST: GET /dbaas/logs/{serviceName}/operation
	 * @param serviceName [required]
	 */
	public ArrayList<String> serviceName_operation_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/operation";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Return details of specified operation
	 *
	 * REST: GET /dbaas/logs/{serviceName}/operation/{operationId}
	 * @param serviceName [required]
	 * @param operationId [required]
	 */
	public OvhOperation serviceName_operation_operationId_GET(String serviceName, String operationId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/operation/{operationId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{operationId}", operationId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the subscribed additional options
	 *
	 * REST: GET /dbaas/logs/{serviceName}/option
	 * @param serviceName [required]
	 */
	public ArrayList<String> serviceName_option_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/option";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Return details of a subscribed option
	 *
	 * REST: GET /dbaas/logs/{serviceName}/option/{optionId}
	 * @param serviceName [required]
	 * @param optionId [required]
	 */
	public OvhOption serviceName_option_optionId_GET(String serviceName, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/option/{optionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{optionId}", optionId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOption.class);
	}

	/**
	 * Return the list of service tokens
	 *
	 * REST: GET /dbaas/logs/{serviceName}/token
	 * @param serviceName [required]
	 */
	public ArrayList<String> serviceName_token_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add a new token
	 *
	 * REST: POST /dbaas/logs/{serviceName}/token
	 * @param serviceName [required]
	 * @param name [required]
	 */
	public OvhOperation serviceName_token_POST(String serviceName, String name) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Delete the given token
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/token/{tokenId}
	 * @param serviceName [required]
	 * @param tokenId [required]
	 */
	public OvhOperation serviceName_token_tokenId_DELETE(String serviceName, String tokenId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token/{tokenId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{tokenId}", tokenId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Get the given token
	 *
	 * REST: GET /dbaas/logs/{serviceName}/token/{tokenId}
	 * @param serviceName [required]
	 * @param tokenId [required]
	 */
	public OvhToken serviceName_token_tokenId_GET(String serviceName, String tokenId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/token/{tokenId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{tokenId}", tokenId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhToken.class);
	}

	/**
	 * Remove specified role
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/role/{roleId}
	 * @param serviceName [required]
	 * @param roleId [required]
	 */
	public OvhOperation serviceName_role_roleId_DELETE(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified role
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}
	 * @param serviceName [required]
	 * @param roleId [required]
	 */
	public OvhRole serviceName_role_roleId_GET(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRole.class);
	}

	/**
	 * Update information of specified role
	 *
	 * REST: PUT /dbaas/logs/{serviceName}/role/{roleId}
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param name [required]
	 * @param description [required]
	 * @param optionId [required]
	 */
	public OvhOperation serviceName_role_roleId_PUT(String serviceName, String roleId, String name, String description, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the member list of specified role
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/member
	 * @param serviceName [required]
	 * @param roleId [required]
	 */
	public ArrayList<String> serviceName_role_roleId_member_GET(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Append user into the member list of specified role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/member
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param username [required]
	 */
	public OvhOperation serviceName_role_roleId_member_POST(String serviceName, String roleId, String username) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "username", username);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove user from the member list of specified role
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/role/{roleId}/member/{username}
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param username [required]
	 */
	public OvhOperation serviceName_role_roleId_member_username_DELETE(String serviceName, String roleId, String username) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/member/{username}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		qPath = qPath.replace("{username}", username);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of permissions of specified role
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/permission
	 * @param serviceName [required]
	 * @param roleId [required]
	 */
	public ArrayList<String> serviceName_role_roleId_permission_GET(String serviceName, String roleId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Append a elasticsearch index permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/index
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param indexId [required]
	 */
	public OvhOperation serviceName_role_roleId_permission_index_POST(String serviceName, String roleId, String indexId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/index";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "indexId", indexId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Remove specified permission
	 *
	 * REST: DELETE /dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param permissionId [required]
	 */
	public OvhOperation serviceName_role_roleId_permission_permissionId_DELETE(String serviceName, String roleId, String permissionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		qPath = qPath.replace("{permissionId}", permissionId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return details of specified permission
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param permissionId [required]
	 */
	public ArrayList<OvhPermission> serviceName_role_roleId_permission_permissionId_GET(String serviceName, String roleId, String permissionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/{permissionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		qPath = qPath.replace("{permissionId}", permissionId);
		String resp = exec("GET", qPath);
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
	 */
	public OvhOperation serviceName_role_roleId_permission_stream_POST(String serviceName, String roleId, String streamId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/stream";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "streamId", streamId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Append a elasticsearch alias permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/alias
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param aliasId [required]
	 */
	public OvhOperation serviceName_role_roleId_permission_alias_POST(String serviceName, String roleId, String aliasId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/alias";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "aliasId", aliasId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Append a graylog dashboard permission to role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role/{roleId}/permission/dashboard
	 * @param serviceName [required]
	 * @param roleId [required]
	 * @param dashboardId [required]
	 */
	public OvhOperation serviceName_role_roleId_permission_dashboard_POST(String serviceName, String roleId, String dashboardId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role/{roleId}/permission/dashboard";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{roleId}", roleId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dashboardId", dashboardId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * Return the list of roles
	 *
	 * REST: GET /dbaas/logs/{serviceName}/role
	 * @param serviceName [required]
	 */
	public ArrayList<String> serviceName_role_GET(String serviceName) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Register a new role
	 *
	 * REST: POST /dbaas/logs/{serviceName}/role
	 * @param serviceName [required]
	 * @param name [required]
	 * @param description [required]
	 * @param optionId [required]
	 */
	public OvhOperation serviceName_role_POST(String serviceName, String name, String description, String optionId) throws IOException {
		String qPath = "/dbaas/logs/{serviceName}/role";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "description", description);
		addBody(o, "optionId", optionId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOperation.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dbaas/logs
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dbaas/logs";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Return the list of available input engines
	 *
	 * REST: GET /dbaas/logs/input/engine
	 */
	public ArrayList<String> input_engine_GET() throws IOException {
		String qPath = "/dbaas/logs/input/engine";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Return details of specified input engine
	 *
	 * REST: GET /dbaas/logs/input/engine/{engineId}
	 * @param engineId [required]
	 */
	public OvhEngine input_engine_engineId_GET(String engineId) throws IOException {
		String qPath = "/dbaas/logs/input/engine/{engineId}";
		qPath = qPath.replace("{engineId}", engineId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhEngine.class);
	}
}
