package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.nichandle.OvhCountryEnum;
import net.minidev.ovh.api.partner.OvhActivitySectors;
import net.minidev.ovh.api.partner.OvhApplication;
import net.minidev.ovh.api.partner.OvhClientKinds;
import net.minidev.ovh.api.partner.OvhCompany;
import net.minidev.ovh.api.partner.OvhContact;
import net.minidev.ovh.api.partner.OvhEmployeesNumberEnum;
import net.minidev.ovh.api.partner.OvhExpertisesChoices;
import net.minidev.ovh.api.partner.OvhExternalCertifications;
import net.minidev.ovh.api.partner.OvhKnowledgeResourcesRangeEnum;
import net.minidev.ovh.api.partner.OvhNic;
import net.minidev.ovh.api.partner.OvhOVHCertifications;
import net.minidev.ovh.api.partner.OvhOVHCustomersAdvisedEnum;
import net.minidev.ovh.api.partner.OvhOVHProductsUsed;
import net.minidev.ovh.api.partner.OvhPartnerKnowledges;
import net.minidev.ovh.api.partner.OvhProductCountries;
import net.minidev.ovh.api.partner.OvhRevenueRangeEnum;
import net.minidev.ovh.api.partner.OvhTechnicalAdvancedResourcesRangeEnum;
import net.minidev.ovh.api.partner.OvhTechnicalExpertResourcesRangeEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/partners
 * version:1.0
 */
public class ApiOvhPartners extends ApiOvhBase {
	public ApiOvhPartners(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get information on a created company
	 *
	 * REST: GET /partners/register/company/{companyId}
	 * @param companyId [required] Company's id
	 */
	public OvhCompany register_company_companyId_GET(String companyId) throws IOException {
		String qPath = "/partners/register/company/{companyId}";
		StringBuilder sb = path(qPath, companyId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCompany.class);
	}

	/**
	 * Update some fields on a created company
	 *
	 * REST: PUT /partners/register/company/{companyId}
	 * @param companyId [required] Company's id
	 * @param name [required] Name of the company
	 * @param commercialName [required] The commercial name of the company
	 * @param registrationNumber [required] Company's registration number
	 * @param address [required] Company's street address
	 * @param city [required] Company's city
	 * @param zipCode [required] Company's zipCode
	 * @param country [required] Company's country
	 * @param phone [required] Company's phone
	 * @param website [required] Company's website
	 * @param description [required] Company's summary
	 * @param email [required] Company's email
	 * @param linkedin [required] Company's linkedin url, must resemble "https://www.linkedin.com/in/ovh")
	 * @param facebook [required] Company's facebook url, must resemble "https://www.facebook.com/ovh")
	 * @param twitter [required] Company's twitter url, must resemble "https://twitter.com/ovh")
	 * @param logo [required] Company's logo url
	 * @param effective [required] Estimation of the number of employees
	 * @param revenue [required] Estimation of the revenue of the company
	 * @param OVHKnowledgeResources [required] Estimation of the number of resources knowing OVH product the company has
	 * @param OVHTechnicalAdvancedResources [required] Estimation of the number of resources that have technical skills on OVH solutions the company has
	 * @param OVHTechnicalExpertResources [required] Estimation of the number of expert resources for OVH solutions the company has
	 * @param expertises [required] Company's domain of competence
	 * @param OVHCertifications [required] OVH certification acquired
	 * @param OVHCustomersAdvised [required] Estimation of the number of accompanied customers in using OVH's solutions
	 * @param OVHProductsUsed [required] OVH's product the company's solutions relies on
	 * @param clientKinds [required] Kind of client the company target
	 * @param activitySectors [required] Company's sector of activity
	 * @param productCountries [required] In which country the company products of solutions are available
	 * @param externalCertifications [required] Certifications obtained from other enterprises
	 * @param partnerKnowledges [required] How did you heard about the OVH's partnership program
	 */
	public OvhCompany register_company_companyId_PUT(String companyId, String name, String commercialName, String registrationNumber, String address, String city, String zipCode, OvhCountryEnum country, String phone, String website, String description, String email, String linkedin, String facebook, String twitter, String logo, OvhEmployeesNumberEnum effective, OvhRevenueRangeEnum revenue, OvhKnowledgeResourcesRangeEnum OVHKnowledgeResources, OvhTechnicalAdvancedResourcesRangeEnum OVHTechnicalAdvancedResources, OvhTechnicalExpertResourcesRangeEnum OVHTechnicalExpertResources, OvhExpertisesChoices expertises, OvhOVHCertifications OVHCertifications, OvhOVHCustomersAdvisedEnum OVHCustomersAdvised, OvhOVHProductsUsed OVHProductsUsed, OvhClientKinds clientKinds, OvhActivitySectors activitySectors, OvhProductCountries productCountries, OvhExternalCertifications externalCertifications, OvhPartnerKnowledges partnerKnowledges) throws IOException {
		String qPath = "/partners/register/company/{companyId}";
		StringBuilder sb = path(qPath, companyId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "commercialName", commercialName);
		addBody(o, "registrationNumber", registrationNumber);
		addBody(o, "address", address);
		addBody(o, "city", city);
		addBody(o, "zipCode", zipCode);
		addBody(o, "country", country);
		addBody(o, "phone", phone);
		addBody(o, "website", website);
		addBody(o, "description", description);
		addBody(o, "email", email);
		addBody(o, "linkedin", linkedin);
		addBody(o, "facebook", facebook);
		addBody(o, "twitter", twitter);
		addBody(o, "logo", logo);
		addBody(o, "effective", effective);
		addBody(o, "revenue", revenue);
		addBody(o, "OVHKnowledgeResources", OVHKnowledgeResources);
		addBody(o, "OVHTechnicalAdvancedResources", OVHTechnicalAdvancedResources);
		addBody(o, "OVHTechnicalExpertResources", OVHTechnicalExpertResources);
		addBody(o, "expertises", expertises);
		addBody(o, "OVHCertifications", OVHCertifications);
		addBody(o, "OVHCustomersAdvised", OVHCustomersAdvised);
		addBody(o, "OVHProductsUsed", OVHProductsUsed);
		addBody(o, "clientKinds", clientKinds);
		addBody(o, "activitySectors", activitySectors);
		addBody(o, "productCountries", productCountries);
		addBody(o, "externalCertifications", externalCertifications);
		addBody(o, "partnerKnowledges", partnerKnowledges);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhCompany.class);
	}

	/**
	 * Remove a company
	 *
	 * REST: DELETE /partners/register/company/{companyId}
	 * @param companyId [required] Company's id
	 */
	public String register_company_companyId_DELETE(String companyId) throws IOException {
		String qPath = "/partners/register/company/{companyId}";
		StringBuilder sb = path(qPath, companyId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Submit application information for validation
	 *
	 * REST: POST /partners/register/company/{companyId}/application
	 * @param companyId [required] Company's id
	 * @param termsAndConditionsOfServiceAccepted [required] I have read the terms and conditions of the OVH partner program and accept them
	 */
	public OvhApplication register_company_companyId_application_POST(String companyId, Boolean termsAndConditionsOfServiceAccepted) throws IOException {
		String qPath = "/partners/register/company/{companyId}/application";
		StringBuilder sb = path(qPath, companyId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "termsAndConditionsOfServiceAccepted", termsAndConditionsOfServiceAccepted);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhApplication.class);
	}

	/**
	 * Compute scoring score without submitting application
	 *
	 * REST: GET /partners/register/company/{companyId}/application
	 * @param companyId [required] Company's id
	 */
	public OvhApplication register_company_companyId_application_GET(String companyId) throws IOException {
		String qPath = "/partners/register/company/{companyId}/application";
		StringBuilder sb = path(qPath, companyId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhApplication.class);
	}

	/**
	 * Get information on a created contact
	 *
	 * REST: GET /partners/register/company/{companyId}/contact/{contactId}
	 * @param companyId [required] Company's id
	 * @param contactId [required] Contact's id
	 */
	public OvhContact register_company_companyId_contact_contactId_GET(String companyId, String contactId) throws IOException {
		String qPath = "/partners/register/company/{companyId}/contact/{contactId}";
		StringBuilder sb = path(qPath, companyId, contactId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * Update some fields on a created contact
	 *
	 * REST: PUT /partners/register/company/{companyId}/contact/{contactId}
	 * @param companyId [required] Company's id
	 * @param contactId [required] Contact's id
	 * @param otherNics [required] List of nics to associate with this contact
	 * @param firstName [required] Contact's first name
	 * @param lastName [required] Contact's last name
	 * @param email [required] Contact's email
	 * @param role [required] Contact's role in the company
	 * @param phone [required] Contact's phone number
	 * @param linkedin [required] Contact's linkedin url, must resemble "https://www.linkedin.com/in/ovh")
	 * @param facebook [required] Contact's facebook url, must resemble "https://www.facebook.com/ovh")
	 * @param twitter [required] Contact's twitter url, must resemble "https://twitter.com/ovh")
	 * @param newsletter [required] Newsletter subscription choice
	 */
	public OvhContact register_company_companyId_contact_contactId_PUT(String companyId, String contactId, OvhNic[] otherNics, String firstName, String lastName, String email, String role, String phone, String linkedin, String facebook, String twitter, Boolean newsletter) throws IOException {
		String qPath = "/partners/register/company/{companyId}/contact/{contactId}";
		StringBuilder sb = path(qPath, companyId, contactId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "otherNics", otherNics);
		addBody(o, "firstName", firstName);
		addBody(o, "lastName", lastName);
		addBody(o, "email", email);
		addBody(o, "role", role);
		addBody(o, "phone", phone);
		addBody(o, "linkedin", linkedin);
		addBody(o, "facebook", facebook);
		addBody(o, "twitter", twitter);
		addBody(o, "newsletter", newsletter);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * Remove a contact
	 *
	 * REST: DELETE /partners/register/company/{companyId}/contact/{contactId}
	 * @param companyId [required] Company's id
	 * @param contactId [required] Contact's id
	 */
	public String register_company_companyId_contact_contactId_DELETE(String companyId, String contactId) throws IOException {
		String qPath = "/partners/register/company/{companyId}/contact/{contactId}";
		StringBuilder sb = path(qPath, companyId, contactId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List created contacts
	 *
	 * REST: GET /partners/register/company/{companyId}/contact
	 * @param companyId [required] Company's id
	 */
	public ArrayList<String> register_company_companyId_contact_GET(String companyId) throws IOException {
		String qPath = "/partners/register/company/{companyId}/contact";
		StringBuilder sb = path(qPath, companyId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Created a new contact for the inscription
	 *
	 * REST: POST /partners/register/company/{companyId}/contact
	 * @param companyId [required] Company's id
	 * @param otherNics [required] List of nics to associate with this contact
	 * @param firstName [required] Contact's first name
	 * @param lastName [required] Contact's last name
	 * @param email [required] Contact's email
	 * @param role [required] Contact's function in the company
	 * @param phone [required] Contact's phone number
	 * @param linkedin [required] Contact's linkedin url, must resemble "https://www.linkedin.com/in/ovh")
	 * @param facebook [required] Contact's facebook url, must resemble "https://www.facebook.com/ovh")
	 * @param twitter [required] Contact's twitter url, must resemble "https://twitter.com/ovh")
	 * @param newsletter [required] Newsletter subscription choice
	 */
	public OvhContact register_company_companyId_contact_POST(String companyId, OvhNic[] otherNics, String firstName, String lastName, String email, String role, String phone, String linkedin, String facebook, String twitter, Boolean newsletter) throws IOException {
		String qPath = "/partners/register/company/{companyId}/contact";
		StringBuilder sb = path(qPath, companyId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "otherNics", otherNics);
		addBody(o, "firstName", firstName);
		addBody(o, "lastName", lastName);
		addBody(o, "email", email);
		addBody(o, "role", role);
		addBody(o, "phone", phone);
		addBody(o, "linkedin", linkedin);
		addBody(o, "facebook", facebook);
		addBody(o, "twitter", twitter);
		addBody(o, "newsletter", newsletter);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * List created companies
	 *
	 * REST: GET /partners/register/company
	 */
	public ArrayList<String> register_company_GET() throws IOException {
		String qPath = "/partners/register/company";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Created a new company for the inscription
	 *
	 * REST: POST /partners/register/company
	 * @param name [required] Name of the company
	 * @param commercialName [required] The commercial name of the company
	 * @param registrationNumber [required] Company's registration number
	 * @param address [required] Company's street address
	 * @param city [required] Company's city
	 * @param zipCode [required] Company's zipCode
	 * @param country [required] Company's country
	 * @param phone [required] Company's phone
	 * @param website [required] Company's website
	 * @param description [required] Company's summary
	 * @param email [required] Company's email
	 * @param linkedin [required] Company's linkedin url, must resemble "https://www.linkedin.com/in/ovh")
	 * @param facebook [required] Company's facebook url, must resemble "https://www.facebook.com/ovh")
	 * @param twitter [required] Company's twitter url, must resemble "https://twitter.com/ovh")
	 * @param logo [required] Company's logo url
	 * @param employeesNumber [required] Estimation of the number of employees
	 * @param revenue [required] Estimation of the revenue of the company
	 * @param OVHKnowledgeResources [required] Estimation of the number of resources knowing OVH product the company has
	 * @param OVHTechnicalAdvancedResources [required] Estimation of the number of resources that have technical skills on OVH solutions the company has
	 * @param OVHTechnicalExpertResources [required] Estimation of the number of expert resources for OVH solutions the company has
	 * @param OVHCustomersAdvised [required] Estimation of the number of accompanied customers in using OVH's solutions
	 * @param expertises [required] Company's domain of expertises
	 * @param OVHCertifications [required] OVH certification acquired
	 * @param OVHProductsUsed [required] OVH's product the company's solutions relies on
	 * @param clientKinds [required] Kind of client the company target
	 * @param activitySectors [required] Company's sector of activity
	 * @param productCountries [required] In which country the company products of solutions are available
	 * @param externalCertifications [required] Certifications obtained from other enterprises
	 * @param partnerKnowledges [required] How did you heard about the OVH's partnership program
	 */
	public OvhCompany register_company_POST(String name, String commercialName, String registrationNumber, String address, String city, String zipCode, OvhCountryEnum country, String phone, String website, String description, String email, String linkedin, String facebook, String twitter, String logo, OvhEmployeesNumberEnum employeesNumber, OvhRevenueRangeEnum revenue, OvhKnowledgeResourcesRangeEnum OVHKnowledgeResources, OvhTechnicalAdvancedResourcesRangeEnum OVHTechnicalAdvancedResources, OvhTechnicalExpertResourcesRangeEnum OVHTechnicalExpertResources, OvhOVHCustomersAdvisedEnum OVHCustomersAdvised, OvhExpertisesChoices expertises, OvhOVHCertifications OVHCertifications, OvhOVHProductsUsed OVHProductsUsed, OvhClientKinds clientKinds, OvhActivitySectors activitySectors, OvhProductCountries productCountries, OvhExternalCertifications externalCertifications, OvhPartnerKnowledges partnerKnowledges) throws IOException {
		String qPath = "/partners/register/company";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "commercialName", commercialName);
		addBody(o, "registrationNumber", registrationNumber);
		addBody(o, "address", address);
		addBody(o, "city", city);
		addBody(o, "zipCode", zipCode);
		addBody(o, "country", country);
		addBody(o, "phone", phone);
		addBody(o, "website", website);
		addBody(o, "description", description);
		addBody(o, "email", email);
		addBody(o, "linkedin", linkedin);
		addBody(o, "facebook", facebook);
		addBody(o, "twitter", twitter);
		addBody(o, "logo", logo);
		addBody(o, "employeesNumber", employeesNumber);
		addBody(o, "revenue", revenue);
		addBody(o, "OVHKnowledgeResources", OVHKnowledgeResources);
		addBody(o, "OVHTechnicalAdvancedResources", OVHTechnicalAdvancedResources);
		addBody(o, "OVHTechnicalExpertResources", OVHTechnicalExpertResources);
		addBody(o, "OVHCustomersAdvised", OVHCustomersAdvised);
		addBody(o, "expertises", expertises);
		addBody(o, "OVHCertifications", OVHCertifications);
		addBody(o, "OVHProductsUsed", OVHProductsUsed);
		addBody(o, "clientKinds", clientKinds);
		addBody(o, "activitySectors", activitySectors);
		addBody(o, "productCountries", productCountries);
		addBody(o, "externalCertifications", externalCertifications);
		addBody(o, "partnerKnowledges", partnerKnowledges);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhCompany.class);
	}
}
