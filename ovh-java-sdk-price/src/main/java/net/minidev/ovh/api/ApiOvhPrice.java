package net.minidev.ovh.api;

import java.io.IOException;
import net.minidev.ovh.api.order.OvhPrice;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/price
 * version:1.0
 */
public class ApiOvhPrice extends ApiOvhBase {
	public ApiOvhPrice(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/bhs1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_bhs1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.bhs1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/bhs1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/bhs1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_bhs1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.bhs1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/bhs1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/bhs1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_bhs1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.bhs1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/bhs1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/bhs1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_bhs1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.bhs1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/bhs1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/bhs1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_bhs1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.bhs1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/bhs1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/bhs1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_bhs1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.bhs1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/bhs1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/bhs1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_bhs1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.bhs1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/bhs1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/bhs1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_bhs1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.bhs1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/bhs1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2b/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2b_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2b.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2b/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2b/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2b_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2b.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2b/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2b/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2b_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2b.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2b/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2b/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2b_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2b.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2b/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2b/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2b_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2b.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2b/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2b/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2b_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2b.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2b/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2b/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2b_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2b.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2b/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2b/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2b_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2b.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2b/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/sbg1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_sbg1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.sbg1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/sbg1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/sbg1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_sbg1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.sbg1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/sbg1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/sbg1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_sbg1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.sbg1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/sbg1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/sbg1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_sbg1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.sbg1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/sbg1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/sbg1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_sbg1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.sbg1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/sbg1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/sbg1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_sbg1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.sbg1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/sbg1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/sbg1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_sbg1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.sbg1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/sbg1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/sbg1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_sbg1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.sbg1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/sbg1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v6/rbx2a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v6_rbx2a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v6.rbx2a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v6/rbx2a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/bhs1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_bhs1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.bhs1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/bhs1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/bhs1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_bhs1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.bhs1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/bhs1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/bhs1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_bhs1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.bhs1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/bhs1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/bhs1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_bhs1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.bhs1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/bhs1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/bhs1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_bhs1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.bhs1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/bhs1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/bhs1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_bhs1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.bhs1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/bhs1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/bhs1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_bhs1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.bhs1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/bhs1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/bhs1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_bhs1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.bhs1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/bhs1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2b/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2b_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2b.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2b/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2b/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2b_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2b.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2b/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2b/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2b_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2b.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2b/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2b/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2b_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2b.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2b/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2b/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2b_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2b.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2b/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2b/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2b_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2b.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2b/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2b/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2b_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2b.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2b/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2b/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2b_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2b.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2b/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/sbg1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_sbg1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.sbg1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/sbg1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/sbg1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_sbg1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.sbg1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/sbg1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/sbg1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_sbg1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.sbg1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/sbg1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/sbg1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_sbg1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.sbg1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/sbg1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/sbg1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_sbg1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.sbg1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/sbg1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/sbg1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_sbg1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.sbg1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/sbg1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/sbg1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_sbg1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.sbg1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/sbg1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/sbg1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_sbg1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.sbg1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/sbg1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v7/rbx2a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v7_rbx2a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v7.rbx2a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v7/rbx2a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/bhs1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_bhs1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.bhs1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/bhs1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/bhs1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_bhs1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.bhs1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/bhs1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/bhs1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_bhs1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.bhs1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/bhs1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/bhs1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_bhs1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.bhs1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/bhs1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/bhs1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_bhs1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.bhs1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/bhs1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/bhs1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_bhs1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.bhs1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/bhs1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/bhs1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_bhs1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.bhs1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/bhs1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/bhs1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_bhs1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.bhs1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/bhs1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2b/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2b_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2b.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2b/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2b/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2b_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2b.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2b/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2b/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2b_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2b.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2b/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2b/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2b_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2b.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2b/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2b/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2b_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2b.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2b/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2b/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2b_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2b.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2b/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2b/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2b_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2b.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2b/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2b/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2b_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2b.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2b/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/sbg1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_sbg1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.sbg1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/sbg1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/sbg1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_sbg1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.sbg1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/sbg1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/sbg1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_sbg1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.sbg1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/sbg1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/sbg1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_sbg1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.sbg1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/sbg1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/sbg1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_sbg1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.sbg1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/sbg1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/sbg1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_sbg1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.sbg1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/sbg1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/sbg1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_sbg1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.sbg1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/sbg1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/sbg1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_sbg1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.sbg1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/sbg1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v1/rbx2a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v1_rbx2a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v1.rbx2a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v1/rbx2a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/bhs1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_bhs1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.bhs1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/bhs1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/bhs1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_bhs1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.bhs1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/bhs1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/bhs1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_bhs1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.bhs1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/bhs1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/bhs1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_bhs1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.bhs1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/bhs1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/bhs1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_bhs1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.bhs1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/bhs1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/bhs1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_bhs1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.bhs1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/bhs1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/bhs1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_bhs1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.bhs1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/bhs1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/bhs1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_bhs1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.bhs1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/bhs1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2b/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2b_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2b.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2b/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2b/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2b_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2b.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2b/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2b/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2b_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2b.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2b/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2b/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2b_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2b.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2b/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2b/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2b_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2b.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2b/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2b/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2b_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2b.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2b/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2b/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2b_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2b.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2b/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2b/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2b_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2b.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2b/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/sbg1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_sbg1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.sbg1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/sbg1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/sbg1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_sbg1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.sbg1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/sbg1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/sbg1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_sbg1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.sbg1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/sbg1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/sbg1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_sbg1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.sbg1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/sbg1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/sbg1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_sbg1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.sbg1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/sbg1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/sbg1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_sbg1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.sbg1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/sbg1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/sbg1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_sbg1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.sbg1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/sbg1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/sbg1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_sbg1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.sbg1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/sbg1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v4/rbx2a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v4_rbx2a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v4.rbx2a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v4/rbx2a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/bhs1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_bhs1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.bhs1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/bhs1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/bhs1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_bhs1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.bhs1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/bhs1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/bhs1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_bhs1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.bhs1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/bhs1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/bhs1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_bhs1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.bhs1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/bhs1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/bhs1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_bhs1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.bhs1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/bhs1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/bhs1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_bhs1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.bhs1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/bhs1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/bhs1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_bhs1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.bhs1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/bhs1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/bhs1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_bhs1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.bhs1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/bhs1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2b/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2b_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2b.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2b/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2b/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2b_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2b.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2b/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2b/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2b_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2b.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2b/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2b/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2b_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2b.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2b/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2b/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2b_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2b.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2b/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2b/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2b_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2b.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2b/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2b/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2b_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2b.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2b/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2b/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2b_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2b.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2b/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/sbg1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_sbg1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.sbg1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/sbg1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/sbg1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_sbg1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.sbg1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/sbg1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/sbg1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_sbg1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.sbg1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/sbg1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/sbg1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_sbg1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.sbg1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/sbg1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/sbg1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_sbg1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.sbg1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/sbg1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/sbg1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_sbg1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.sbg1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/sbg1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/sbg1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_sbg1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.sbg1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/sbg1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/sbg1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_sbg1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.sbg1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/sbg1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v2/rbx2a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v2_rbx2a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v2.rbx2a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v2/rbx2a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/bhs1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_bhs1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.bhs1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/bhs1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/bhs1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_bhs1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.bhs1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/bhs1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/bhs1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_bhs1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.bhs1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/bhs1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/bhs1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_bhs1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.bhs1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/bhs1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/bhs1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_bhs1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.bhs1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/bhs1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/bhs1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_bhs1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.bhs1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/bhs1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/bhs1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_bhs1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.bhs1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/bhs1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/bhs1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_bhs1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.bhs1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/bhs1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2b/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2b_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2b.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2b/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2b/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2b_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2b.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2b/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2b/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2b_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2b.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2b/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2b/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2b_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2b.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2b/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2b/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2b_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2b.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2b/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2b/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2b_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2b.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2b/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2b/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2b_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2b.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2b/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2b/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2b_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2b.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2b/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/sbg1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_sbg1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/sbg1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/sbg1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_sbg1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/sbg1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/sbg1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_sbg1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/sbg1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/sbg1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_sbg1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/sbg1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/sbg1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_sbg1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/sbg1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/sbg1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_sbg1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/sbg1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/sbg1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_sbg1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/sbg1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/sbg1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_sbg1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/sbg1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2014v1/rbx2a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2014v1_rbx2a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2014v1.rbx2a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2014v1/rbx2a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/bhs1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_bhs1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.bhs1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/bhs1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/bhs1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_bhs1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.bhs1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/bhs1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/bhs1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_bhs1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.bhs1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/bhs1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/bhs1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_bhs1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.bhs1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/bhs1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/bhs1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_bhs1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.bhs1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/bhs1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/bhs1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_bhs1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.bhs1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/bhs1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/bhs1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_bhs1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.bhs1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/bhs1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/bhs1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_bhs1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.bhs1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/bhs1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2b/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2b_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2b.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2b/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2b/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2b_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2b.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2b/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2b/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2b_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2b.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2b/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2b/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2b_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2b.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2b/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2b/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2b_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2b.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2b/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2b/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2b_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2b.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2b/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2b/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2b_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2b.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2b/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2b/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2b_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2b.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2b/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/sbg1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_sbg1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.sbg1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/sbg1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/sbg1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_sbg1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.sbg1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/sbg1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/sbg1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_sbg1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.sbg1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/sbg1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/sbg1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_sbg1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.sbg1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/sbg1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/sbg1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_sbg1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.sbg1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/sbg1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/sbg1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_sbg1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.sbg1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/sbg1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/sbg1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_sbg1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.sbg1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/sbg1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/sbg1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_sbg1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.sbg1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/sbg1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v2/rbx2a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v2_rbx2a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v2.rbx2a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v2/rbx2a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/bhs1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_bhs1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.bhs1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/bhs1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/bhs1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_bhs1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.bhs1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/bhs1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/bhs1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_bhs1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.bhs1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/bhs1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/bhs1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_bhs1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.bhs1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/bhs1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/bhs1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_bhs1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.bhs1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/bhs1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/bhs1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_bhs1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.bhs1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/bhs1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/bhs1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_bhs1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.bhs1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/bhs1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/bhs1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_bhs1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.bhs1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/bhs1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2b/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2b_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2b.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2b/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2b/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2b_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2b.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2b/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2b/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2b_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2b.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2b/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2b/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2b_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2b.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2b/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2b/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2b_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2b.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2b/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2b/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2b_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2b.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2b/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2b/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2b_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2b.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2b/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2b/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2b_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2b.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2b/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/sbg1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_sbg1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.sbg1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/sbg1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/sbg1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_sbg1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.sbg1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/sbg1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/sbg1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_sbg1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.sbg1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/sbg1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/sbg1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_sbg1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.sbg1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/sbg1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/sbg1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_sbg1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.sbg1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/sbg1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/sbg1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_sbg1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.sbg1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/sbg1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/sbg1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_sbg1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.sbg1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/sbg1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/sbg1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_sbg1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.sbg1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/sbg1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v3/rbx2a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v3_rbx2a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v3/rbx2a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/bhs1a/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_bhs1a_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.bhs1a.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/bhs1a/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/bhs1a/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_bhs1a_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.bhs1a.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/bhs1a/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/bhs1a/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_bhs1a_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.bhs1a.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/bhs1a/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/bhs1a/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_bhs1a_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.bhs1a.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/bhs1a/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/sbg1a/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_sbg1a_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.sbg1a.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/sbg1a/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/sbg1a/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_sbg1a_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.sbg1a.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/sbg1a/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/sbg1a/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_sbg1a_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.sbg1a.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/sbg1a/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/sbg1a/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_sbg1a_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.sbg1a.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/sbg1a/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/rbx2a/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_rbx2a_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.rbx2a.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/rbx2a/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/rbx2a/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_rbx2a_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.rbx2a.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/rbx2a/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/rbx2a/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_rbx2a_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.rbx2a.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/rbx2a/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2013v1/rbx2a/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2013v1_rbx2a_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2013v1.rbx2a.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2013v1/rbx2a/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/bhs1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_bhs1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.bhs1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/bhs1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/bhs1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_bhs1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.bhs1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/bhs1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/bhs1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_bhs1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.bhs1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/bhs1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/bhs1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_bhs1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.bhs1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/bhs1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/bhs1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_bhs1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.bhs1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/bhs1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/bhs1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_bhs1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.bhs1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/bhs1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/bhs1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_bhs1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.bhs1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/bhs1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/bhs1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_bhs1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.bhs1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/bhs1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2b/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2b_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2b.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2b/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2b/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2b_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2b.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2b/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2b/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2b_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2b.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2b/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2b/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2b_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2b.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2b/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2b/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2b_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2b.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2b/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2b/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2b_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2b.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2b/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2b/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2b_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2b.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2b/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2b/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2b_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2b.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2b/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/sbg1a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_sbg1a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.sbg1a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/sbg1a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/sbg1a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_sbg1a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.sbg1a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/sbg1a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/sbg1a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_sbg1a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.sbg1a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/sbg1a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/sbg1a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_sbg1a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.sbg1a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/sbg1a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/sbg1a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_sbg1a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.sbg1a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/sbg1a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/sbg1a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_sbg1a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.sbg1a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/sbg1a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/sbg1a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_sbg1a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.sbg1a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/sbg1a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/sbg1a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_sbg1a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.sbg1a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/sbg1a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2a/infrastructure/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2a_infrastructure_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2a.infrastructure.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2a/infrastructure/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2a/infrastructure/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2a_infrastructure_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2a.infrastructure.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2a/infrastructure/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2a/infrastructure/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2a_infrastructure_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2a.infrastructure.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2a/infrastructure/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2a/infrastructure/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2a_infrastructure_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2a.infrastructure.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2a/infrastructure/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2a/enterprise/filer/hourly/{filerProfile}
	 * @param filerProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2a_enterprise_filer_hourly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2a.enterprise.filer.OvhHourlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2a/enterprise/filer/hourly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly filer ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2a/enterprise/filer/monthly/{filerProfile}
	 * @param filerProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2a_enterprise_filer_monthly_filerProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2a.enterprise.filer.OvhMonthlyEnum filerProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2a/enterprise/filer/monthly/{filerProfile}";
		qPath = qPath.replace("{filerProfile}", filerProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud hourly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2a/enterprise/host/hourly/{hostProfile}
	 * @param hostProfile [required] type of the hourly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2a_enterprise_host_hourly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2a.enterprise.host.OvhHourlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2a/enterprise/host/hourly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of dedicated Cloud monthly host ressources
	 * 
	 * REST: GET /price/dedicatedCloud/2016v5/rbx2a/enterprise/host/monthly/{hostProfile}
	 * @param hostProfile [required] type of the monthly ressources you want to order
	 */
	public OvhPrice dedicatedCloud_2016v5_rbx2a_enterprise_host_monthly_hostProfile_GET(net.minidev.ovh.api.price.dedicatedcloud._2016v5.rbx2a.enterprise.host.OvhMonthlyEnum hostProfile) throws IOException {
		String qPath = "/price/dedicatedCloud/2016v5/rbx2a/enterprise/host/monthly/{hostProfile}";
		qPath = qPath.replace("{hostProfile}", hostProfile.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud
	 * 
	 * REST: GET /price/vps/cloud/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_cloud_model_modelName_GET(net.minidev.ovh.api.price.vps.cloud.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/cloud/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud Options
	 * 
	 * REST: GET /price/vps/cloud/option/{optionName}
	 * @param optionName [required] Option
	 */
	public OvhPrice vps_cloud_option_optionName_GET(net.minidev.ovh.api.price.vps.cloud.OvhOptionEnum optionName) throws IOException {
		String qPath = "/price/vps/cloud/option/{optionName}";
		qPath = qPath.replace("{optionName}", optionName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud 2014
	 * 
	 * REST: GET /price/vps/2014v1/cloud/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_2014v1_cloud_model_modelName_GET(net.minidev.ovh.api.price.vps._2014v1.cloud.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/2014v1/cloud/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud Options 2014
	 * 
	 * REST: GET /price/vps/2014v1/cloud/option/{optionName}
	 * @param optionName [required] Option
	 */
	public OvhPrice vps_2014v1_cloud_option_optionName_GET(net.minidev.ovh.api.price.vps._2014v1.cloud.OvhOptionEnum optionName) throws IOException {
		String qPath = "/price/vps/2014v1/cloud/option/{optionName}";
		qPath = qPath.replace("{optionName}", optionName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Classic 2014
	 * 
	 * REST: GET /price/vps/2014v1/classic/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_2014v1_classic_model_modelName_GET(net.minidev.ovh.api.price.vps._2014v1.classic.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/2014v1/classic/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Low Latency
	 * 
	 * REST: GET /price/vps/lowlat/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_lowlat_model_modelName_GET(net.minidev.ovh.api.price.vps.lowlat.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/lowlat/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Classic 2013
	 * 
	 * REST: GET /price/vps/2013v1/cloud/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_2013v1_cloud_model_modelName_GET(net.minidev.ovh.api.price.vps._2013v1.cloud.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/2013v1/cloud/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud Options 2013
	 * 
	 * REST: GET /price/vps/2013v1/cloud/option/{optionName}
	 * @param optionName [required] Option
	 */
	public OvhPrice vps_2013v1_cloud_option_optionName_GET(net.minidev.ovh.api.price.vps._2013v1.cloud.OvhOptionEnum optionName) throws IOException {
		String qPath = "/price/vps/2013v1/cloud/option/{optionName}";
		qPath = qPath.replace("{optionName}", optionName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Low Latency 2013
	 * 
	 * REST: GET /price/vps/2013v1/lowlat/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_2013v1_lowlat_model_modelName_GET(net.minidev.ovh.api.price.vps._2013v1.lowlat.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/2013v1/lowlat/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud 2013
	 * 
	 * REST: GET /price/vps/2013v1/classic/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_2013v1_classic_model_modelName_GET(net.minidev.ovh.api.price.vps._2013v1.classic.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/2013v1/classic/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Classic
	 * 
	 * REST: GET /price/vps/classic/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_classic_model_modelName_GET(net.minidev.ovh.api.price.vps.classic.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/classic/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud 2015
	 * 
	 * REST: GET /price/vps/2015v1/cloud/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_2015v1_cloud_model_modelName_GET(net.minidev.ovh.api.price.vps._2015v1.cloud.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/2015v1/cloud/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud Options 2015/2016
	 * 
	 * REST: GET /price/vps/2015v1/cloud/option/{optionName}
	 * @param optionName [required] Option
	 */
	public OvhPrice vps_2015v1_cloud_option_optionName_GET(net.minidev.ovh.api.price.vps._2015v1.cloud.OvhOptionEnum optionName) throws IOException {
		String qPath = "/price/vps/2015v1/cloud/option/{optionName}";
		qPath = qPath.replace("{optionName}", optionName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud RAM 2016
	 * 
	 * REST: GET /price/vps/2015v1/cloudram/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_2015v1_cloudram_model_modelName_GET(net.minidev.ovh.api.price.vps._2015v1.cloudram.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/2015v1/cloudram/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS Cloud RAM Options 2015/2016
	 * 
	 * REST: GET /price/vps/2015v1/cloudram/option/{optionName}
	 * @param optionName [required] Option
	 */
	public OvhPrice vps_2015v1_cloudram_option_optionName_GET(net.minidev.ovh.api.price.vps._2015v1.cloudram.OvhOptionEnum optionName) throws IOException {
		String qPath = "/price/vps/2015v1/cloudram/option/{optionName}";
		qPath = qPath.replace("{optionName}", optionName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS SSD 2015
	 * 
	 * REST: GET /price/vps/2015v1/ssd/model/{modelName}
	 * @param modelName [required] Model
	 */
	public OvhPrice vps_2015v1_ssd_model_modelName_GET(net.minidev.ovh.api.price.vps._2015v1.ssd.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/vps/2015v1/ssd/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of VPS SSD Options 2015/2016
	 * 
	 * REST: GET /price/vps/2015v1/ssd/option/{optionName}
	 * @param optionName [required] Option
	 */
	public OvhPrice vps_2015v1_ssd_option_optionName_GET(net.minidev.ovh.api.price.vps._2015v1.ssd.OvhOptionEnum optionName) throws IOException {
		String qPath = "/price/vps/2015v1/ssd/option/{optionName}";
		qPath = qPath.replace("{optionName}", optionName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price for cdn option
	 * 
	 * REST: GET /price/hosting/web/cdn/{cdnName}
	 * @param cdnName [required] Cdn
	 */
	public OvhPrice hosting_web_cdn_cdnName_GET(net.minidev.ovh.api.price.hosting.web.OvhCdnEnum cdnName) throws IOException {
		String qPath = "/price/hosting/web/cdn/{cdnName}";
		qPath = qPath.replace("{cdnName}", cdnName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price for hosted ssl option
	 * 
	 * REST: GET /price/hosting/web/ssl/{sslName}
	 * @param sslName [required] Ssl
	 */
	public OvhPrice hosting_web_ssl_sslName_GET(net.minidev.ovh.api.price.hosting.web.OvhSslEnum sslName) throws IOException {
		String qPath = "/price/hosting/web/ssl/{sslName}";
		qPath = qPath.replace("{sslName}", sslName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price for extra sql perso option
	 * 
	 * REST: GET /price/hosting/web/extraSqlPerso/{extraSqlPersoName}
	 * @param extraSqlPersoName [required] ExtraSqlPerso
	 */
	public OvhPrice hosting_web_extraSqlPerso_extraSqlPersoName_GET(net.minidev.ovh.api.price.hosting.web.OvhExtraSqlPersoEnum extraSqlPersoName) throws IOException {
		String qPath = "/price/hosting/web/extraSqlPerso/{extraSqlPersoName}";
		qPath = qPath.replace("{extraSqlPersoName}", extraSqlPersoName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price for a private database
	 * 
	 * REST: GET /price/hosting/privateDatabase/{privateDatabaseName}
	 * @param privateDatabaseName [required] PrivateDatabase
	 */
	public OvhPrice hosting_privateDatabase_privateDatabaseName_GET(net.minidev.ovh.api.price.hosting.OvhPrivateDatabaseEnum privateDatabaseName) throws IOException {
		String qPath = "/price/hosting/privateDatabase/{privateDatabaseName}";
		qPath = qPath.replace("{privateDatabaseName}", privateDatabaseName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the monthly price for an office license
	 * 
	 * REST: GET /price/license/office/{officeName}
	 * @param officeName [required] Office
	 */
	public OvhPrice license_office_officeName_GET(net.minidev.ovh.api.price.license.OvhOfficeEnum officeName) throws IOException {
		String qPath = "/price/license/office/{officeName}";
		qPath = qPath.replace("{officeName}", officeName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of zone options
	 * 
	 * REST: GET /price/domain/zone/option/{optionName}
	 * @param optionName [required] Option
	 */
	public OvhPrice domain_zone_option_optionName_GET(net.minidev.ovh.api.price.domain.zone.OvhOptionEnum optionName) throws IOException {
		String qPath = "/price/domain/zone/option/{optionName}";
		qPath = qPath.replace("{optionName}", optionName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of address move option fee
	 * 
	 * REST: GET /price/xdsl/addressMove/fee/{option}
	 * @param option [required] The option name
	 */
	public OvhPrice xdsl_addressMove_fee_option_GET(net.minidev.ovh.api.price.xdsl.addressmove.OvhFeeEnum option) throws IOException {
		String qPath = "/price/xdsl/addressMove/fee/{option}";
		qPath = qPath.replace("{option}", option.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of IPv4 options
	 * 
	 * REST: GET /price/xdsl/options/ipv4/{ipRange}
	 * @param ipRange [required] The range of the IPv4
	 */
	public OvhPrice xdsl_options_ipv4_ipRange_GET(net.minidev.ovh.api.price.xdsl.options.OvhIpv4Enum ipRange) throws IOException {
		String qPath = "/price/xdsl/options/ipv4/{ipRange}";
		qPath = qPath.replace("{ipRange}", ipRange.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of options installation fee
	 * 
	 * REST: GET /price/xdsl/options/installation/{option}
	 * @param option [required] The option
	 */
	public OvhPrice xdsl_options_installation_option_GET(net.minidev.ovh.api.price.xdsl.options.OvhInstallationEnum option) throws IOException {
		String qPath = "/price/xdsl/options/installation/{option}";
		qPath = qPath.replace("{option}", option.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of line action
	 * 
	 * REST: GET /price/xdsl/options/line/{lineAction}
	 * @param lineAction [required] The type of line action
	 */
	public OvhPrice xdsl_options_line_lineAction_GET(net.minidev.ovh.api.price.xdsl.options.OvhLineEnum lineAction) throws IOException {
		String qPath = "/price/xdsl/options/line/{lineAction}";
		qPath = qPath.replace("{lineAction}", lineAction.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of xdsl offers
	 * 
	 * REST: GET /price/xdsl/offers/{offersName}
	 * @param offersName [required] The name of the offer
	 */
	public OvhPrice xdsl_offers_offersName_GET(net.minidev.ovh.api.price.xdsl.OvhOffersEnum offersName) throws IOException {
		String qPath = "/price/xdsl/offers/{offersName}";
		qPath = qPath.replace("{offersName}", offersName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of options installation fee
	 * 
	 * REST: GET /price/xdsl/installation/{offer}
	 * @param offer [required] The offer
	 */
	public OvhPrice xdsl_installation_offer_GET(net.minidev.ovh.api.price.xdsl.OvhInstallationEnum offer) throws IOException {
		String qPath = "/price/xdsl/installation/{offer}";
		qPath = qPath.replace("{offer}", offer.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the monthly price for an Office 365 license
	 * 
	 * REST: GET /price/saas/csp2/license/{licenseName}
	 * @param licenseName [required] License
	 */
	public OvhPrice saas_csp2_license_licenseName_GET(net.minidev.ovh.api.price.saas.csp2.OvhLicenseEnum licenseName) throws IOException {
		String qPath = "/price/saas/csp2/license/{licenseName}";
		qPath = qPath.replace("{licenseName}", licenseName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of Nas HA offers
	 * 
	 * REST: GET /price/dedicated/nasha/model/{modelName}
	 * @param modelName [required] capacity in gigabit of Nas Ha
	 */
	public OvhPrice dedicated_nasha_model_modelName_GET(net.minidev.ovh.api.price.dedicated.nasha.OvhModelEnum modelName) throws IOException {
		String qPath = "/price/dedicated/nasha/model/{modelName}";
		qPath = qPath.replace("{modelName}", modelName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of available firewall models
	 * 
	 * REST: GET /price/dedicated/server/firewall/{firewallModel}
	 * @param firewallModel [required] Model of firewall
	 */
	public OvhPrice dedicated_server_firewall_firewallModel_GET(net.minidev.ovh.api.price.dedicated.server.OvhFirewallEnum firewallModel) throws IOException {
		String qPath = "/price/dedicated/server/firewall/{firewallModel}";
		qPath = qPath.replace("{firewallModel}", firewallModel.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of IPs
	 * 
	 * REST: GET /price/dedicated/server/ip/{routedTo}
	 * @param routedTo [required] Ip
	 */
	public OvhPrice dedicated_server_ip_routedTo_GET(net.minidev.ovh.api.price.dedicated.server.OvhIpEnum routedTo) throws IOException {
		String qPath = "/price/dedicated/server/ip/{routedTo}";
		qPath = qPath.replace("{routedTo}", routedTo.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of backup storage offer
	 * 
	 * REST: GET /price/dedicated/server/backupStorage/{capacity}
	 * @param capacity [required] Capacity in gigabytes of backup storage offer
	 */
	public OvhPrice dedicated_server_backupStorage_capacity_GET(net.minidev.ovh.api.price.dedicated.server.OvhBackupStorageEnum capacity) throws IOException {
		String qPath = "/price/dedicated/server/backupStorage/{capacity}";
		qPath = qPath.replace("{capacity}", capacity.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get price of anti-DDos Pro option
	 * 
	 * REST: GET /price/dedicated/server/antiDDoSPro/{commercialRange}
	 * @param commercialRange [required] commercial range of your dedicated server
	 */
	public OvhPrice dedicated_server_antiDDoSPro_commercialRange_GET(net.minidev.ovh.api.price.dedicated.server.OvhAntiDDoSProEnum commercialRange) throws IOException {
		String qPath = "/price/dedicated/server/antiDDoSPro/{commercialRange}";
		qPath = qPath.replace("{commercialRange}", commercialRange.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of overTheBox offers
	 * 
	 * REST: GET /price/overTheBox/offer/{offerName}
	 * @param offerName [required] The name of the offer
	 */
	public OvhPrice overTheBox_offer_offerName_GET(net.minidev.ovh.api.price.overthebox.OvhOfferEnum offerName) throws IOException {
		String qPath = "/price/overTheBox/offer/{offerName}";
		qPath = qPath.replace("{offerName}", offerName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of a HPC Spot Account for 1 month
	 * 
	 * REST: GET /price/hpcspot/account/subscription/{subscriptionName}
	 * @param subscriptionName [required] Subscription
	 */
	public OvhPrice hpcspot_account_subscription_subscriptionName_GET(net.minidev.ovh.api.price.hpcspot.account.OvhSubscriptionEnum subscriptionName) throws IOException {
		String qPath = "/price/hpcspot/account/subscription/{subscriptionName}";
		qPath = qPath.replace("{subscriptionName}", subscriptionName.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of a RESERVATION consumption for 1 hour
	 * 
	 * REST: GET /price/hpcspot/consumption/reservation/{reference}
	 * @param reference [required] The reference of the RESERVATION consumption
	 */
	public OvhPrice hpcspot_consumption_reservation_reference_GET(net.minidev.ovh.api.price.hpcspot.consumption.OvhReservationEnum reference) throws IOException {
		String qPath = "/price/hpcspot/consumption/reservation/{reference}";
		qPath = qPath.replace("{reference}", reference.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of a SESSION consumption for 1 hour
	 * 
	 * REST: GET /price/hpcspot/consumption/session/{reference}
	 * @param reference [required] The reference of the SESSION consumption
	 */
	public OvhPrice hpcspot_consumption_session_reference_GET(net.minidev.ovh.api.price.hpcspot.consumption.OvhSessionEnum reference) throws IOException {
		String qPath = "/price/hpcspot/consumption/session/{reference}";
		qPath = qPath.replace("{reference}", reference.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}

	/**
	 * Get the price of a JOB consumption for 1 hour
	 * 
	 * REST: GET /price/hpcspot/consumption/job/{reference}
	 * @param reference [required] The reference of the JOB consumption
	 */
	public OvhPrice hpcspot_consumption_job_reference_GET(net.minidev.ovh.api.price.hpcspot.consumption.OvhJobEnum reference) throws IOException {
		String qPath = "/price/hpcspot/consumption/job/{reference}";
		qPath = qPath.replace("{reference}", reference.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}
}
