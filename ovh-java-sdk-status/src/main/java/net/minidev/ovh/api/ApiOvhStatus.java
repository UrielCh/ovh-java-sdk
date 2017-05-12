package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.ovhstatus.task.OvhTaskImpactEnum;
import net.minidev.ovh.api.ovhstatus.task.OvhTaskStatusEnum;
import net.minidev.ovh.api.ovhstatus.task.OvhTaskTypeEnum;
import net.minidev.ovh.api.status.task.OvhTask;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/status
 * version:1.0
 */
public class ApiOvhStatus extends ApiOvhBase {
	public ApiOvhStatus(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Find all the incidents or maintenances linked to your services
	 *
	 * REST: GET /status/task
	 * @param impact [required] Filter by impact
	 * @param status [required] Filter by status
	 * @param type [required] Filter by type
	 *
	 * API beta
	 */
	public ArrayList<OvhTask> task_GET(OvhTaskImpactEnum impact, OvhTaskStatusEnum status, OvhTaskTypeEnum type) throws IOException {
		String qPath = "/status/task";
		StringBuilder sb = path(qPath);
		query(sb, "impact", impact);
		query(sb, "status", status);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhTask>> t1 = new TypeReference<ArrayList<OvhTask>>() {};
}
