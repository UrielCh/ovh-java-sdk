package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.license.office.OvhLicenceEnum;
import net.minidev.ovh.api.license.office.OvhOfficeDomain;
import net.minidev.ovh.api.license.office.OvhOfficeTask;
import net.minidev.ovh.api.license.office.OvhOfficeTenant;
import net.minidev.ovh.api.license.office.OvhOfficeUser;
import net.minidev.ovh.api.license.office.OvhStatistics;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/license/office
 * version:1.0
 */
public class ApiOvhLicenseoffice extends ApiOvhBase {
	public ApiOvhLicenseoffice(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/office/{serviceName}/serviceInfos
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/license/office/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/office/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/license/office/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Shows the licenses usage statistics for the given time period.
	 *
	 * REST: GET /license/office/{serviceName}/usageStatistics
	 * @param to [required] Period's end point.
	 * @param from [required] Period's start point.
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public ArrayList<OvhStatistics> serviceName_usageStatistics_GET(String serviceName, Date from, Date to) throws IOException {
		String qPath = "/license/office/{serviceName}/usageStatistics";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "from", from);
		query(sb, "to", to);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhStatistics>> t1 = new TypeReference<ArrayList<OvhStatistics>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/office/{serviceName}
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public OvhOfficeTenant serviceName_GET(String serviceName) throws IOException {
		String qPath = "/license/office/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfficeTenant.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /license/office/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public void serviceName_PUT(String serviceName, OvhOfficeTenant body) throws IOException {
		String qPath = "/license/office/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/office/{serviceName}/domain/{domainName}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param domainName [required] Domain name
	 */
	public OvhOfficeDomain serviceName_domain_domainName_GET(String serviceName, String domainName) throws IOException {
		String qPath = "/license/office/{serviceName}/domain/{domainName}";
		StringBuilder sb = path(qPath, serviceName, domainName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfficeDomain.class);
	}

	/**
	 * Domain associated to this office tenant
	 *
	 * REST: GET /license/office/{serviceName}/domain
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public ArrayList<String> serviceName_domain_GET(String serviceName) throws IOException {
		String qPath = "/license/office/{serviceName}/domain";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Accounts associated to this office tenant
	 *
	 * REST: GET /license/office/{serviceName}/user
	 * @param firstName [required] Filter the value of firstName property (like)
	 * @param lastName [required] Filter the value of lastName property (like)
	 * @param activationEmail [required] Filter the value of activationEmail property (like)
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public ArrayList<String> serviceName_user_GET(String serviceName, String activationEmail, String firstName, String lastName) throws IOException {
		String qPath = "/license/office/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "activationEmail", activationEmail);
		query(sb, "firstName", firstName);
		query(sb, "lastName", lastName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create new office user
	 *
	 * REST: POST /license/office/{serviceName}/user
	 * @param firstName [required] Account first name
	 * @param domain [required] Office domain
	 * @param licence [required] Office licence
	 * @param lastName [required] Account last name
	 * @param login [required] Account login
	 * @param serviceName [required] The unique identifier of your Office service
	 */
	public OvhOfficeTask serviceName_user_POST(String serviceName, String firstName, String domain, OvhLicenceEnum licence, String lastName, String login) throws IOException {
		String qPath = "/license/office/{serviceName}/user";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "firstName", firstName);
		addBody(o, "domain", domain);
		addBody(o, "licence", licence);
		addBody(o, "lastName", lastName);
		addBody(o, "login", login);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /license/office/{serviceName}/user/{activationEmail}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param activationEmail [required] Email used to activate Microsoft Office
	 */
	public OvhOfficeUser serviceName_user_activationEmail_GET(String serviceName, String activationEmail) throws IOException {
		String qPath = "/license/office/{serviceName}/user/{activationEmail}";
		StringBuilder sb = path(qPath, serviceName, activationEmail);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfficeUser.class);
	}

	/**
	 * Delete existing office user
	 *
	 * REST: DELETE /license/office/{serviceName}/user/{activationEmail}
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param activationEmail [required] Email used to activate Microsoft Office
	 */
	public OvhOfficeTask serviceName_user_activationEmail_DELETE(String serviceName, String activationEmail) throws IOException {
		String qPath = "/license/office/{serviceName}/user/{activationEmail}";
		StringBuilder sb = path(qPath, serviceName, activationEmail);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * Change or reset  user's password
	 *
	 * REST: POST /license/office/{serviceName}/user/{activationEmail}/changePassword
	 * @param password [required] New password or empty to receive a generated password by email
	 * @param shouldSendMail [required] Specify if the new password should be send via email or not.
	 * @param notifyEmail [required] Email to send the new password to. Default is nicAdmin's email.
	 * @param serviceName [required] The unique identifier of your Office service
	 * @param activationEmail [required] Email used to activate Microsoft Office
	 */
	public OvhOfficeTask serviceName_user_activationEmail_changePassword_POST(String serviceName, String activationEmail, String password, Boolean shouldSendMail, String notifyEmail) throws IOException {
		String qPath = "/license/office/{serviceName}/user/{activationEmail}/changePassword";
		StringBuilder sb = path(qPath, serviceName, activationEmail);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "shouldSendMail", shouldSendMail);
		addBody(o, "notifyEmail", notifyEmail);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOfficeTask.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /license/office
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/license/office";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
}
