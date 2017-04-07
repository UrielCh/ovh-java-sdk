package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.iot.OvhGrafanaUser;
import net.minidev.ovh.api.iot.OvhIOTApp;
import net.minidev.ovh.api.iot.OvhIOTCluster;
import net.minidev.ovh.api.iot.OvhIOTToken;
import net.minidev.ovh.api.iot.OvhTag;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/iot
 * version:1.0
 */
public class ApiOvhIot extends ApiOvhBase {
	public ApiOvhIot(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Unregister an existing App for current user account
	 *
	 * REST: DELETE /iot/app/{app}
	 * @param app [required] App name
	 */
	public void app_app_DELETE(String app) throws IOException {
		String qPath = "/iot/app/{app}";
		StringBuilder sb = path(qPath, app);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Update an existing App for current user account
	 *
	 * REST: PUT /iot/app/{app}
	 * @param app [required] App name
	 * @param description [required] App description
	 * @param cluster [required] App Cluster
	 */
	public OvhIOTApp app_app_PUT(String app, String description, String cluster) throws IOException {
		String qPath = "/iot/app/{app}";
		StringBuilder sb = path(qPath, app);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "cluster", cluster);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhIOTApp.class);
	}

	/**
	 * Get App Details for current user account
	 *
	 * REST: GET /iot/app/{app}
	 * @param app [required] App name
	 */
	public OvhIOTApp app_app_GET(String app) throws IOException {
		String qPath = "/iot/app/{app}";
		StringBuilder sb = path(qPath, app);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIOTApp.class);
	}

	/**
	 * Delete an existing Token for a specified app
	 *
	 * REST: DELETE /iot/app/{app}/token/{token}
	 * @param app [required] App name
	 * @param token [required] Token
	 */
	public void app_app_token_token_DELETE(String app, String token) throws IOException {
		String qPath = "/iot/app/{app}/token/{token}";
		StringBuilder sb = path(qPath, app, token);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Update Token properties for a specified app
	 *
	 * REST: PUT /iot/app/{app}/token/{token}
	 * @param app [required] App name
	 * @param token [required] Token
	 * @param description [required] Token description
	 * @param tagList [required] Tag List
	 */
	public OvhIOTToken app_app_token_token_PUT(String app, String token, String description, OvhTag[] tagList) throws IOException {
		String qPath = "/iot/app/{app}/token/{token}";
		StringBuilder sb = path(qPath, app, token);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "tagList", tagList);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhIOTToken.class);
	}

	/**
	 * Get Token properties for a specified app
	 *
	 * REST: GET /iot/app/{app}/token/{token}
	 * @param app [required] App name
	 * @param token [required] Token
	 */
	public OvhIOTToken app_app_token_token_GET(String app, String token) throws IOException {
		String qPath = "/iot/app/{app}/token/{token}";
		StringBuilder sb = path(qPath, app, token);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIOTToken.class);
	}

	/**
	 * Update Token to create a Grafana datasource
	 *
	 * REST: PUT /iot/app/{app}/token/{token}/actions/addGrafana
	 * @param app [required] App name
	 * @param token [required] Token
	 */
	public OvhGrafanaUser app_app_token_token_actions_addGrafana_PUT(String app, String token) throws IOException {
		String qPath = "/iot/app/{app}/token/{token}/actions/addGrafana";
		StringBuilder sb = path(qPath, app, token);
		String resp = exec(qPath, "PUT", sb.toString(), null);
		return convertTo(resp, OvhGrafanaUser.class);
	}

	/**
	 * Get cluster list for current user account
	 *
	 * REST: GET /iot/availableCluster
	 */
	public ArrayList<OvhIOTCluster> availableCluster_GET() throws IOException {
		String qPath = "/iot/availableCluster";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhIOTCluster>> t1 = new TypeReference<ArrayList<OvhIOTCluster>>() {};

	/**
	 * Get App List for current user account
	 *
	 * REST: GET /iot/app
	 */
	public ArrayList<OvhIOTApp> app_GET() throws IOException {
		String qPath = "/iot/app";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhIOTApp>> t2 = new TypeReference<ArrayList<OvhIOTApp>>() {};

	/**
	 * Register a new App for current user account
	 *
	 * REST: POST /iot/app
	 * @param name [required] App name
	 * @param description [required] App description
	 * @param cluster [required] App Cluster
	 */
	public OvhIOTApp app_POST(String name, String description, String cluster) throws IOException {
		String qPath = "/iot/app";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "description", description);
		addBody(o, "cluster", cluster);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhIOTApp.class);
	}

	/**
	 * Get all Tokens for a specified app
	 *
	 * REST: GET /iot/app/{app}/token
	 * @param app [required] App name
	 */
	public ArrayList<OvhIOTToken> app_app_token_GET(String app) throws IOException {
		String qPath = "/iot/app/{app}/token";
		StringBuilder sb = path(qPath, app);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhIOTToken>> t3 = new TypeReference<ArrayList<OvhIOTToken>>() {};

	/**
	 * Create a new Token for a specified app
	 *
	 * REST: POST /iot/app/{app}/token
	 * @param app [required] App name
	 * @param description [required] Token description
	 * @param tagList [required] Tag List
	 */
	public OvhIOTToken app_app_token_POST(String app, String description, OvhTag[] tagList) throws IOException {
		String qPath = "/iot/app/{app}/token";
		StringBuilder sb = path(qPath, app);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "tagList", tagList);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhIOTToken.class);
	}

	/**
	 * Register a new IOT device for current user account
	 *
	 * REST: POST /iot/goodies/register
	 * @param activationCode [required] Activation code of your iot device
	 */
	public OvhIOTApp goodies_register_POST(String activationCode) throws IOException {
		String qPath = "/iot/goodies/register";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "activationCode", activationCode);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhIOTApp.class);
	}
}
