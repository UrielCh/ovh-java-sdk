package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.license.OvhActionType;
import net.minidev.ovh.api.license.OvhSqlServerOrderConfiguration;
import net.minidev.ovh.api.license.OvhTask;
import net.minidev.ovh.api.license.OvhTaskStateEnum;
import net.minidev.ovh.api.license.sqlserver.OvhSqlServer;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/license/sqlserver
 * version:1.0
 */
public class ApiOvhLicensesqlserver extends ApiOvhBase {
	public ApiOvhLicensesqlserver(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get the orderable Sql Server versions
	 *
	 * REST: GET /license/sqlserver/orderableVersions
	 * @param ip [required] Your license Ip
	 */
	public ArrayList<OvhSqlServerOrderConfiguration> orderableVersions_GET(String ip) throws IOException {
		String qPath = "/license/sqlserver/orderableVersions";
		StringBuilder sb = path(qPath);
		query(sb, "ip", ip);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhSqlServerOrderConfiguration>> t1 = new TypeReference<ArrayList<OvhSqlServerOrderConfiguration>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /license/sqlserver
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/license/sqlserver";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/sqlserver/{serviceName}/serviceInfos
	 * @param serviceName [required] The name of your SQL Server license
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/license/sqlserver/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/sqlserver/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The name of your SQL Server license
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/license/sqlserver/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /license/sqlserver/{serviceName}/terminate
	 * @param serviceName [required] The name of your SQL Server license
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/license/sqlserver/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /license/sqlserver/{serviceName}/confirmTermination
	 * @param futureUse [required] What next after your termination request
	 * @param reason [required] Reason of your termination request
	 * @param commentary [required] Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The name of your SQL Server license
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/license/sqlserver/{serviceName}/confirmTermination";
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
	 * REST: GET /license/sqlserver/{serviceName}
	 * @param serviceName [required] The name of your SQL Server license
	 */
	public OvhSqlServer serviceName_GET(String serviceName) throws IOException {
		String qPath = "/license/sqlserver/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSqlServer.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/sqlserver/{serviceName}/tasks/{taskId}
	 * @param serviceName [required] The name of your SQL Server license
	 * @param taskId [required] This Task id
	 */
	public OvhTask serviceName_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/license/sqlserver/{serviceName}/tasks/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks linked to this license
	 *
	 * REST: GET /license/sqlserver/{serviceName}/tasks
	 * @param action [required] Filter the value of action property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The name of your SQL Server license
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, OvhActionType action, OvhTaskStateEnum status) throws IOException {
		String qPath = "/license/sqlserver/{serviceName}/tasks";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "action", action);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};
}
