package net.minidev.ovh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import net.minidev.ovh.api.ApiOvhCloud;
import net.minidev.ovh.api.cloud.network.OvhNetwork;
import net.minidev.ovh.core.ApiOvhCore;
import net.minidev.ovh.core.ApiOvhUtils;

public class ListNetworks {
	/**
	 * Login using ovh.conf
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		ApiOvhCore core = new ApiOvhCore();
		ApiOvhCloud cloud = new ApiOvhCloud(core);
		ArrayList<String> projects = cloud.project_GET();
		for (String project: projects) {
			System.out.println(project);
			ArrayList<OvhNetwork> networds = cloud.project_serviceName_network_private_GET(project);
			List<String> debug = networds.stream().map(ApiOvhUtils::objectJsonBody).collect(Collectors.toList());
			
			//String txt = ApiOvhUtils.objectJsonBody(payload);

			System.out.println(debug);
		}
//		project_serviceName_network_private_GET
	}
}
