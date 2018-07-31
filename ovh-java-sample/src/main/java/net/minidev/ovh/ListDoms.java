package net.minidev.ovh;

import java.text.SimpleDateFormat;

import net.minidev.ovh.api.ApiOvh;
import net.minidev.ovh.api.ApiOvhDomain;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhCore;

public class ListDoms {
	/**
	 * Login using nic handler
	 */
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("usage: ListDoms nic password");
			return;
		}
		String nic = args[0];
		String password = args[1];
		list2(nic, password);
	}

	public static void list1(String nic, String password) throws Exception {
		ApiOvh api = ApiOvh.getInstance(nic, password);
		int c = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (String serviceName : api.domain.GET(null)) {
			OvhService service = api.domain.serviceName_serviceInfos_GET(serviceName);
			System.out.printf("%3d  %s status:%s expire on:%s\n", ++c, serviceName, service.status.toString(), sdf.format(service.expiration));
		}
	}
	
	public static void list2(String nic, String password) throws Exception {
		ApiOvhCore core = ApiOvhCore.getInstance(nic, password);
		ApiOvhDomain api = new ApiOvhDomain(core);
		int c = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (String serviceName : api.GET(null)) {
			OvhService service = api.serviceName_serviceInfos_GET(serviceName);
			System.out.printf("%3d  %s status:%s expire on:%s\n", ++c, serviceName, service.status.toString(), sdf.format(service.expiration));
		}
	}
	

}
