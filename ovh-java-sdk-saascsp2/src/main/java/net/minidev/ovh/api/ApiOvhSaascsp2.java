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
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/saas/csp2
 * version:1.0
 */
public class ApiOvhSaascsp2 extends ApiOvhBase {
	public ApiOvhSaascsp2(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Changes the tenant administrator's password
	 *
	 * REST: POST /saas/csp2/{serviceName}/changeAdministratorPassword
	 * @param newPassword [required] New password for the tenant administrator
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public OvhOfficeTask serviceName_changeAdministratorPassword_POST(String serviceName, String newPassword) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/changeAdministratorPassword";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "newPassword", newPassword);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Get the curren billing period's usage peak for each subscription
	 *
	 * REST: GET /saas/csp2/{serviceName}/billingPeriodPeaks
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public OvhBillingStatistics serviceName_billingPeriodPeaks_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/billingPeriodPeaks";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBillingStatistics.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}/serviceInfos
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /saas/csp2/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Pending tasks of this tenant
	 *
	 * REST: GET /saas/csp2/{serviceName}/task
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}/task/{id}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Unique identifier of the task
	 *
	 * API beta
	 */
	public OvhOfficeTask serviceName_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/task/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Creates a new subscription as an addon for this subscription
	 *
	 * REST: POST /saas/csp2/{serviceName}/subscription/{id}/orderAddon
	 * @param quantity [required] Seat quantity of the new subscription
	 * @param licenseId [required] License id associated to this addon subscription (see subscription/<id>/availableAddonLicenses)
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Subscription's unique identifier
	 *
	 * API beta
	 */
	public OvhOfficeTask serviceName_subscription_id_orderAddon_POST(String serviceName, Long id, Long quantity, Long licenseId) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription/{id}/orderAddon";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		addBody(o, "licenseId", licenseId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Addon subscriptions associated to this office subscription
	 *
	 * REST: GET /saas/csp2/{serviceName}/subscription/{id}/addonsSubscriptionIds
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Subscription's unique identifier
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_subscription_id_addonsSubscriptionIds_GET(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription/{id}/addonsSubscriptionIds";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Gives a list of licenses ids that can be ordered as an addon for this subscription
	 *
	 * REST: GET /saas/csp2/{serviceName}/subscription/{id}/availableAddonLicenses
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Subscription's unique identifier
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_subscription_id_availableAddonLicenses_GET(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription/{id}/availableAddonLicenses";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Change the quantity of seats in the subscription
	 *
	 * REST: POST /saas/csp2/{serviceName}/subscription/{id}/changeQuantity
	 * @param quantity [required] New seat quantity
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Subscription's unique identifier
	 *
	 * API beta
	 */
	public OvhOfficeTask serviceName_subscription_id_changeQuantity_POST(String serviceName, Long id, Long quantity) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription/{id}/changeQuantity";
		StringBuilder sb = path(qPath, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantity", quantity);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}/subscription/{id}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Subscription's unique identifier
	 *
	 * API beta
	 */
	public OvhOfficeSubscription serviceName_subscription_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfficeSubscription.class);
	}

	/**
	 * Delete a subscription from this tenant
	 *
	 * REST: DELETE /saas/csp2/{serviceName}/subscription/{id}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] Subscription's unique identifier
	 *
	 * API beta
	 */
	public OvhOfficeTask serviceName_subscription_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Subscriptions associated to this office tenant
	 *
	 * REST: GET /saas/csp2/{serviceName}/subscription
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_subscription_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a subscription to this tenant
	 *
	 * REST: POST /saas/csp2/{serviceName}/subscription
	 * @param licenseId [required] License's type unique identifier
	 * @param quantity [required] Quantity of licenses to order
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public OvhOfficeTask serviceName_subscription_POST(String serviceName, Long licenseId, Long quantity) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/subscription";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "licenseId", licenseId);
		addBody(o, "quantity", quantity);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public OvhOfficeTenant serviceName_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfficeTenant.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /saas/csp2/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public void serviceName_PUT(String serviceName, OvhOfficeTenant body) throws IOException {
		String qPath = "/saas/csp2/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Licenses available for order
	 *
	 * REST: GET /saas/csp2/{serviceName}/orderableLicenses
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_orderableLicenses_GET(String serviceName) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/orderableLicenses";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /saas/csp2/{serviceName}/orderableLicenses/{id}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param id [required] License unique identifier
	 *
	 * API beta
	 */
	public OvhOfficeLicence serviceName_orderableLicenses_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/orderableLicenses/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfficeLicence.class);
	}

	/**
	 * Automatically sets up an OVH-hosted domain of yours for your office365 services. Note, this requires the domain to not have any interfering MX/SRV/TXT records
	 *
	 * REST: POST /saas/csp2/{serviceName}/configureDomain
	 * @param domain [required] Your OVH-hosted domain to configure
	 * @param supportedServices [required] Services that your domain needs to be configured with
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public OvhOfficeTask serviceName_configureDomain_POST(String serviceName, String domain, OvhSupportedServiceEnum[] supportedServices) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/configureDomain";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "supportedServices", supportedServices);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Get the usage statistics over the chose period
	 *
	 * REST: GET /saas/csp2/{serviceName}/usageStatistics
	 * @param timePeriod [required] The period to query
	 * @param serviceName [required] The unique identifier of your Office service
	 *
	 * API beta
	 */
	public ArrayList<OvhStatistics> serviceName_usageStatistics_GET(String serviceName, OvhLicensePeriodEnum timePeriod) throws IOException {
		String qPath = "/saas/csp2/{serviceName}/usageStatistics";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "timePeriod", timePeriod);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhStatistics>> t2 = new TypeReference<ArrayList<OvhStatistics>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /saas/csp2
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/saas/csp2";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};
}
