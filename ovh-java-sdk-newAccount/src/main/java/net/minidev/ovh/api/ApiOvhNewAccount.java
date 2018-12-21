package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.nichandle.OvhCountryEnum;
import net.minidev.ovh.api.nichandle.OvhCreationRule;
import net.minidev.ovh.api.nichandle.OvhCreationRules;
import net.minidev.ovh.api.nichandle.OvhCreationRulesActionEnum;
import net.minidev.ovh.api.nichandle.OvhGenderEnum;
import net.minidev.ovh.api.nichandle.OvhLanguageEnum;
import net.minidev.ovh.api.nichandle.OvhLegalFormEnum;
import net.minidev.ovh.api.nichandle.OvhNewAccountAndToken;
import net.minidev.ovh.api.nichandle.OvhOvhCompanyEnum;
import net.minidev.ovh.api.nichandle.OvhOvhSubsidiaryEnum;
import net.minidev.ovh.api.order.OvhContract;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/newAccount
 * version:1.0
 */
public class ApiOvhNewAccount extends ApiOvhBase {
	public ApiOvhNewAccount(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Give all the rules to follow in order to create and update an OVH identifier
	 *
	 * REST: POST /newAccount/rules
	 * @param country [required]
	 * @param name [required]
	 * @param organisation [required]
	 * @param phoneCountry [required]
	 * @param birthDay [required]
	 * @param city [required]
	 * @param companyNationalIdentificationNumber [required]
	 * @param fax [required]
	 * @param area [required]
	 * @param birthCity [required]
	 * @param firstname [required]
	 * @param email [required]
	 * @param ovhSubsidiary [required]
	 * @param sex [required]
	 * @param address [required]
	 * @param action [required]
	 * @param nationalIdentificationNumber [required]
	 * @param vat [required]
	 * @param zip [required]
	 * @param spareEmail [required]
	 * @param corporationType [required]
	 * @param legalform [required]
	 * @param language [required]
	 * @param ovhCompany [required]
	 * @param phone [required]
	 */
	public ArrayList<OvhCreationRule> rules_POST(OvhCountryEnum country, String name, String organisation, OvhCountryEnum phoneCountry, String birthDay, String city, String companyNationalIdentificationNumber, String fax, String area, String birthCity, String firstname, String email, OvhOvhSubsidiaryEnum ovhSubsidiary, OvhGenderEnum sex, String address, OvhCreationRulesActionEnum action, String nationalIdentificationNumber, String vat, String zip, String spareEmail, String corporationType, OvhLegalFormEnum legalform, OvhLanguageEnum language, OvhOvhCompanyEnum ovhCompany, String phone) throws IOException {
		String qPath = "/newAccount/rules";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "country", country);
		addBody(o, "name", name);
		addBody(o, "organisation", organisation);
		addBody(o, "phoneCountry", phoneCountry);
		addBody(o, "birthDay", birthDay);
		addBody(o, "city", city);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "fax", fax);
		addBody(o, "area", area);
		addBody(o, "birthCity", birthCity);
		addBody(o, "firstname", firstname);
		addBody(o, "email", email);
		addBody(o, "ovhSubsidiary", ovhSubsidiary);
		addBody(o, "sex", sex);
		addBody(o, "address", address);
		addBody(o, "action", action);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "vat", vat);
		addBody(o, "zip", zip);
		addBody(o, "spareEmail", spareEmail);
		addBody(o, "corporationType", corporationType);
		addBody(o, "legalform", legalform);
		addBody(o, "language", language);
		addBody(o, "ovhCompany", ovhCompany);
		addBody(o, "phone", phone);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhCreationRule>> t1 = new TypeReference<ArrayList<OvhCreationRule>>() {};

	/**
	 * All available countries for an ovh company and an ovh subsidiary
	 *
	 * REST: GET /newAccount/countries
	 * @param ovhCompany [required]
	 * @param ovhSubsidiary [required]
	 */
	public ArrayList<OvhCountryEnum> countries_GET(OvhOvhCompanyEnum ovhCompany, OvhOvhSubsidiaryEnum ovhSubsidiary) throws IOException {
		String qPath = "/newAccount/countries";
		StringBuilder sb = path(qPath);
		query(sb, "ovhCompany", ovhCompany);
		query(sb, "ovhSubsidiary", ovhSubsidiary);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhCountryEnum>> t2 = new TypeReference<ArrayList<OvhCountryEnum>>() {};

	/**
	 * All available areas for a given country
	 *
	 * REST: GET /newAccount/area
	 * @param country [required]
	 */
	public ArrayList<String> area_GET(OvhCountryEnum country) throws IOException {
		String qPath = "/newAccount/area";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};

	/**
	 * All available corporation types for a given country
	 *
	 * REST: GET /newAccount/corporationType
	 * @param country [required]
	 */
	public ArrayList<String> corporationType_GET(OvhCountryEnum country) throws IOException {
		String qPath = "/newAccount/corporationType";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Give all the rules to follow in order to create an OVH identifier
	 *
	 * REST: GET /newAccount/creationRules
	 * @param ovhSubsidiary [required]
	 * @param ovhCompany [required]
	 * @param legalform [required]
	 * @param country [required]
	 */
	public OvhCreationRules creationRules_GET(OvhCountryEnum country, OvhLegalFormEnum legalform, OvhOvhCompanyEnum ovhCompany, OvhOvhSubsidiaryEnum ovhSubsidiary) throws IOException {
		String qPath = "/newAccount/creationRules";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		query(sb, "legalform", legalform);
		query(sb, "ovhCompany", ovhCompany);
		query(sb, "ovhSubsidiary", ovhSubsidiary);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCreationRules.class);
	}

	/**
	 * Returns the contracts that governs the creation of an OVH identifier
	 *
	 * REST: GET /newAccount/contracts
	 * @param subsidiary [required]
	 * @param company [required]
	 */
	public ArrayList<OvhContract> contracts_GET(OvhOvhCompanyEnum company, OvhOvhSubsidiaryEnum subsidiary) throws IOException {
		String qPath = "/newAccount/contracts";
		StringBuilder sb = path(qPath);
		query(sb, "company", company);
		query(sb, "subsidiary", subsidiary);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhContract>> t4 = new TypeReference<ArrayList<OvhContract>>() {};

	/**
	 * All available legal forms for a given country
	 *
	 * REST: GET /newAccount/legalform
	 * @param country [required]
	 */
	public ArrayList<String> legalform_GET(OvhCountryEnum country) throws IOException {
		String qPath = "/newAccount/legalform";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new OVH identifier
	 *
	 * REST: POST /newAccount
	 * @param name [required]
	 * @param country [required]
	 * @param birthDay [required]
	 * @param phoneCountry [required]
	 * @param organisation [required]
	 * @param city [required]
	 * @param fax [required]
	 * @param companyNationalIdentificationNumber [required]
	 * @param area [required]
	 * @param email [required]
	 * @param birthCity [required]
	 * @param firstname [required]
	 * @param nationalIdentificationNumber [required]
	 * @param ovhSubsidiary [required]
	 * @param address [required]
	 * @param sex [required]
	 * @param legalform [required]
	 * @param language [required]
	 * @param vat [required]
	 * @param zip [required]
	 * @param corporationType [required]
	 * @param spareEmail [required]
	 * @param phone [required]
	 * @param ovhCompany [required]
	 */
	public OvhNewAccountAndToken POST(String name, OvhCountryEnum country, String birthDay, OvhCountryEnum phoneCountry, String organisation, String city, String fax, String companyNationalIdentificationNumber, String area, String email, String birthCity, String firstname, String nationalIdentificationNumber, OvhOvhSubsidiaryEnum ovhSubsidiary, String address, OvhGenderEnum sex, OvhLegalFormEnum legalform, OvhLanguageEnum language, String vat, String zip, String corporationType, String spareEmail, String phone, OvhOvhCompanyEnum ovhCompany) throws IOException {
		String qPath = "/newAccount";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "country", country);
		addBody(o, "birthDay", birthDay);
		addBody(o, "phoneCountry", phoneCountry);
		addBody(o, "organisation", organisation);
		addBody(o, "city", city);
		addBody(o, "fax", fax);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "area", area);
		addBody(o, "email", email);
		addBody(o, "birthCity", birthCity);
		addBody(o, "firstname", firstname);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "ovhSubsidiary", ovhSubsidiary);
		addBody(o, "address", address);
		addBody(o, "sex", sex);
		addBody(o, "legalform", legalform);
		addBody(o, "language", language);
		addBody(o, "vat", vat);
		addBody(o, "zip", zip);
		addBody(o, "corporationType", corporationType);
		addBody(o, "spareEmail", spareEmail);
		addBody(o, "phone", phone);
		addBody(o, "ovhCompany", ovhCompany);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNewAccountAndToken.class);
	}
}
