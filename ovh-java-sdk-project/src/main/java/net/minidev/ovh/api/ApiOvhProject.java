package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.project.OvhProject;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/project
 * version:1.0
 */
public class ApiOvhProject extends ApiOvhBase {
	public ApiOvhProject(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get all available projects
	 *
	 * REST: GET /project
	 * @deprecated
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/project";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Ask new project creation
	 *
	 * REST: POST /project
	 * @deprecated
	 */
	public OvhProject POST() throws IOException {
		String qPath = "/project";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhProject.class);
	}
}
