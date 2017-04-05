package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.msservices.OvhLicensePeriodEnum;
import net.minidev.ovh.api.saas.csp2.OvhBillingStatistics;
import net.minidev.ovh.api.saas.csp2.OvhOfficeLicence;
import net.minidev.ovh.api.saas.csp2.OvhOfficeSubscription;
import net.minidev.ovh.api.saas.csp2.OvhOfficeTask;
import net.minidev.ovh.api.saas.csp2.OvhOfficeTenant;
import net.minidev.ovh.api.saas.csp2.OvhStatistics;
import net.minidev.ovh.api.saas.csp2.OvhSupportedServiceEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/saas/csp2
 * version:1.0
 */
public class ApiOvhSaascsp2 extends ApiOvhBase {
	public ApiOvhSaascsp2(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}/serviceInfos
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /saas/csp2/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get the usage statistics over the chose period
	 *
	 * REST: GET /saas/csp2/{serviceName}/usageStatistics
	 * @param timePeriod [required] The period to query
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public ArrayList<OvhStatistics> serviceName_usageStatistics_GET(String serviceName, OvhLicensePeriodEnum timePeriod) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/usageStatistics";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "timePeriod", timePeriod);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhStatistics>> t1 = new TypeReference<ArrayList<OvhStatistics>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public OvhOfficeTenant serviceName_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOfficeTenant.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /saas/csp2/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public void serviceName_PUT(String serviceName, OvhOfficeTenant body) throws IOException {
		String qPath = "/saas/csp2/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Changes the tenant administrator's password
	 *
	 * REST: POST /saas/csp2/{serviceName}/changeAdministratorPassword
	 * @param newPassword [required] New password for the tenant administrator
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public OvhOfficeTask serviceName_changeAdministratorPassword_POST(String serviceName, String newPassword) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/changeAdministratorPassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "newPassword", newPassword);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Automatically sets up an OVH-hosted domain of yours for your office365 services. Note, this requires the domain to not have any interfering MX/SRV/TXT records
	 *
	 * REST: POST /saas/csp2/{serviceName}/configureDomain
	 * @param supportedServices [required] Services that your domain needs to be configured with
	 * @param domain [required] Your OVH-hosted domain to configure
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public OvhOfficeTask serviceName_configureDomain_POST(String serviceName, OvhSupportedServiceEnum[] supportedServices, String domain) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/configureDomain";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "supportedServices", supportedServices);
		addBody(o, "domain", domain);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Pending tasks of this tenant
	 *
	 * REST: GET /saas/csp2/{serviceName}/task
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}/task/{id}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Unique identifier of the task
	 */
	public OvhOfficeTask serviceName_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/task/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Licenses available for order
	 *
	 * REST: GET /saas/csp2/{serviceName}/orderableLicenses
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public ArrayList<Long> serviceName_orderableLicenses_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/orderableLicenses";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}/orderableLicenses/{id}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] License unique identifier
	 */
	public OvhOfficeLicence serviceName_orderableLicenses_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/orderableLicenses/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOfficeLicence.class);
	}

	/**
	 * Get the curren billing period's usage peak for each subscription
	 *
	 * REST: GET /saas/csp2/{serviceName}/billingPeriodPeaks
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public OvhBillingStatistics serviceName_billingPeriodPeaks_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/billingPeriodPeaks";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBillingStatistics.class);
	}

	/**
	 * Subscriptions associated to this office tenant
	 *
	 * REST: GET /saas/csp2/{serviceName}/subscription
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public ArrayList<Long> serviceName_subscription_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a subscription to this tenant
	 *
	 * REST: POST /saas/csp2/{serviceName}/subscription
	 * @param licenseId [required] License's type unique identifier
	 * @param quantity [required] Quantity of licenses to order
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public OvhOfficeTask serviceName_subscription_POST(String serviceName, Long licenseId, Long quantity) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "licenseId", licenseId);
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}/subscription/{id}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Subscription's unique identifier
	 */
	public OvhOfficeSubscription serviceName_subscription_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOfficeSubscription.class);
	}

	/**
	 * Delete a subscription from this tenant
	 *
	 * REST: DELETE /saas/csp2/{serviceName}/subscription/{id}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Subscription's unique identifier
	 */
	public OvhOfficeTask serviceName_subscription_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Change the quantity of seats in the subscription
	 *
	 * REST: POST /saas/csp2/{serviceName}/subscription/{id}/changeQuantity
	 * @param quantity [required] New seat quantity
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Subscription's unique identifier
	 */
	public OvhOfficeTask serviceName_subscription_id_changeQuantity_POST(String serviceName, Long id, Long quantity) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription/{id}/changeQuantity";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /saas/csp2
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/saas/csp2";
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};
}
