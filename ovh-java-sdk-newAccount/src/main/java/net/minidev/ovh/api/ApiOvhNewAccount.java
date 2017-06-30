package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.nichandle.OvhCountryEnum;
import net.minidev.ovh.api.nichandle.OvhCreationRule;
import net.minidev.ovh.api.nichandle.OvhCreationRules;
import net.minidev.ovh.api.nichandle.OvhGenderEnum;
import net.minidev.ovh.api.nichandle.OvhLanguageEnum;
import net.minidev.ovh.api.nichandle.OvhLegalFormEnum;
import net.minidev.ovh.api.nichandle.OvhNewAccountAndToken;
import net.minidev.ovh.api.nichandle.OvhOvhCompanyEnum;
import net.minidev.ovh.api.nichandle.OvhOvhSubsidiaryEnum;
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
	 * Create a new OVH identifier
	 *
	 * REST: POST /newAccount
	 * @param firstname [required]
	 * @param vat [required]
	 * @param spareEmail [required]
	 * @param nationalIdentificationNumber [required]
	 * @param birthDay [required]
	 * @param area [required]
	 * @param ovhSubsidiary [required]
	 * @param ovhCompany [required]
	 * @param email [required]
	 * @param city [required]
	 * @param fax [required]
	 * @param address [required]
	 * @param companyNationalIdentificationNumber [required]
	 * @param country [required]
	 * @param birthCity [required]
	 * @param organisation [required]
	 * @param language [required]
	 * @param name [required]
	 * @param sex [required]
	 * @param phone [required]
	 * @param zip [required]
	 * @param corporationType [required]
	 * @param legalform [required]
	 */
	public OvhNewAccountAndToken POST(String firstname, String vat, String spareEmail, String nationalIdentificationNumber, String birthDay, String area, OvhOvhSubsidiaryEnum ovhSubsidiary, OvhOvhCompanyEnum ovhCompany, String email, String city, String fax, String address, String companyNationalIdentificationNumber, OvhCountryEnum country, String birthCity, String organisation, OvhLanguageEnum language, String name, OvhGenderEnum sex, String phone, String zip, String corporationType, OvhLegalFormEnum legalform) throws IOException {
		String qPath = "/newAccount";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "firstname", firstname);
		addBody(o, "vat", vat);
		addBody(o, "spareEmail", spareEmail);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "birthDay", birthDay);
		addBody(o, "area", area);
		addBody(o, "ovhSubsidiary", ovhSubsidiary);
		addBody(o, "ovhCompany", ovhCompany);
		addBody(o, "email", email);
		addBody(o, "city", city);
		addBody(o, "fax", fax);
		addBody(o, "address", address);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "country", country);
		addBody(o, "birthCity", birthCity);
		addBody(o, "organisation", organisation);
		addBody(o, "language", language);
		addBody(o, "name", name);
		addBody(o, "sex", sex);
		addBody(o, "phone", phone);
		addBody(o, "zip", zip);
		addBody(o, "corporationType", corporationType);
		addBody(o, "legalform", legalform);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNewAccountAndToken.class);
	}

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
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Give all the rules to follow in order to create an OVH identifier
	 *
	 * REST: GET /newAccount/creationRules
	 * @param country [required]
	 * @param ovhSubsidiary [required]
	 * @param ovhCompany [required]
	 * @param legalform [required]
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
		return convertTo(resp, t1);
	}

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
		return convertTo(resp, t1);
	}

	/**
	 * Give all the rules to follow in order to create and update an OVH identifier
	 *
	 * REST: POST /newAccount/rules
	 * @param firstname [required]
	 * @param vat [required]
	 * @param spareEmail [required]
	 * @param nationalIdentificationNumber [required]
	 * @param birthDay [required]
	 * @param area [required]
	 * @param ovhSubsidiary [required]
	 * @param ovhCompany [required]
	 * @param email [required]
	 * @param city [required]
	 * @param fax [required]
	 * @param address [required]
	 * @param companyNationalIdentificationNumber [required]
	 * @param country [required]
	 * @param birthCity [required]
	 * @param organisation [required]
	 * @param language [required]
	 * @param name [required]
	 * @param sex [required]
	 * @param phone [required]
	 * @param zip [required]
	 * @param corporationType [required]
	 * @param legalform [required]
	 */
	public ArrayList<OvhCreationRule> rules_POST(String firstname, String vat, String spareEmail, String nationalIdentificationNumber, String birthDay, String area, OvhOvhSubsidiaryEnum ovhSubsidiary, OvhOvhCompanyEnum ovhCompany, String email, String city, String fax, String address, String companyNationalIdentificationNumber, OvhCountryEnum country, String birthCity, String organisation, OvhLanguageEnum language, String name, OvhGenderEnum sex, String phone, String zip, String corporationType, OvhLegalFormEnum legalform) throws IOException {
		String qPath = "/newAccount/rules";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "firstname", firstname);
		addBody(o, "vat", vat);
		addBody(o, "spareEmail", spareEmail);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "birthDay", birthDay);
		addBody(o, "area", area);
		addBody(o, "ovhSubsidiary", ovhSubsidiary);
		addBody(o, "ovhCompany", ovhCompany);
		addBody(o, "email", email);
		addBody(o, "city", city);
		addBody(o, "fax", fax);
		addBody(o, "address", address);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "country", country);
		addBody(o, "birthCity", birthCity);
		addBody(o, "organisation", organisation);
		addBody(o, "language", language);
		addBody(o, "name", name);
		addBody(o, "sex", sex);
		addBody(o, "phone", phone);
		addBody(o, "zip", zip);
		addBody(o, "corporationType", corporationType);
		addBody(o, "legalform", legalform);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhCreationRule>> t2 = new TypeReference<ArrayList<OvhCreationRule>>() {};

	/**
	 * All available countries for an ovh company and an ovh subsidiary
	 *
	 * REST: GET /newAccount/countries
	 * @param ovhSubsidiary [required]
	 * @param ovhCompany [required]
	 */
	public ArrayList<OvhCountryEnum> countries_GET(OvhOvhCompanyEnum ovhCompany, OvhOvhSubsidiaryEnum ovhSubsidiary) throws IOException {
		String qPath = "/newAccount/countries";
		StringBuilder sb = path(qPath);
		query(sb, "ovhCompany", ovhCompany);
		query(sb, "ovhSubsidiary", ovhSubsidiary);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhCountryEnum>> t3 = new TypeReference<ArrayList<OvhCountryEnum>>() {};
}
