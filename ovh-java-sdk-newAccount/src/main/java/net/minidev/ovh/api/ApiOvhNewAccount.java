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
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

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
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhContract>> t3 = new TypeReference<ArrayList<OvhContract>>() {};

	/**
	 * Give all the rules to follow in order to create and update an OVH identifier
	 *
	 * REST: POST /newAccount/rules
	 * @param ovhSubsidiary [required]
	 * @param phone [required]
	 * @param phoneCountry [required]
	 * @param country [required]
	 * @param fax [required]
	 * @param organisation [required]
	 * @param nationalIdentificationNumber [required]
	 * @param vat [required]
	 * @param spareEmail [required]
	 * @param action [required]
	 * @param area [required]
	 * @param zip [required]
	 * @param address [required]
	 * @param legalform [required]
	 * @param sex [required]
	 * @param name [required]
	 * @param corporationType [required]
	 * @param birthCity [required]
	 * @param email [required]
	 * @param city [required]
	 * @param birthDay [required]
	 * @param companyNationalIdentificationNumber [required]
	 * @param firstname [required]
	 * @param language [required]
	 * @param ovhCompany [required]
	 */
	public ArrayList<OvhCreationRule> rules_POST(OvhCreationRulesActionEnum action, String address, String area, String birthCity, String birthDay, String city, String companyNationalIdentificationNumber, String corporationType, OvhCountryEnum country, String email, String fax, String firstname, OvhLanguageEnum language, OvhLegalFormEnum legalform, String name, String nationalIdentificationNumber, String organisation, OvhOvhCompanyEnum ovhCompany, OvhOvhSubsidiaryEnum ovhSubsidiary, String phone, OvhCountryEnum phoneCountry, OvhGenderEnum sex, String spareEmail, String vat, String zip) throws IOException {
		String qPath = "/newAccount/rules";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		addBody(o, "address", address);
		addBody(o, "area", area);
		addBody(o, "birthCity", birthCity);
		addBody(o, "birthDay", birthDay);
		addBody(o, "city", city);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "corporationType", corporationType);
		addBody(o, "country", country);
		addBody(o, "email", email);
		addBody(o, "fax", fax);
		addBody(o, "firstname", firstname);
		addBody(o, "language", language);
		addBody(o, "legalform", legalform);
		addBody(o, "name", name);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "organisation", organisation);
		addBody(o, "ovhCompany", ovhCompany);
		addBody(o, "ovhSubsidiary", ovhSubsidiary);
		addBody(o, "phone", phone);
		addBody(o, "phoneCountry", phoneCountry);
		addBody(o, "sex", sex);
		addBody(o, "spareEmail", spareEmail);
		addBody(o, "vat", vat);
		addBody(o, "zip", zip);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhCreationRule>> t4 = new TypeReference<ArrayList<OvhCreationRule>>() {};

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

	/**
	 * Give all the rules to follow in order to create an OVH identifier
	 *
	 * REST: GET /newAccount/creationRules
	 * @param legalform [required]
	 * @param ovhCompany [required]
	 * @param ovhSubsidiary [required]
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
	 * Create a new OVH identifier
	 *
	 * REST: POST /newAccount
	 * @param nationalIdentificationNumber [required]
	 * @param organisation [required]
	 * @param vat [required]
	 * @param spareEmail [required]
	 * @param area [required]
	 * @param zip [required]
	 * @param ovhSubsidiary [required]
	 * @param phone [required]
	 * @param country [required]
	 * @param phoneCountry [required]
	 * @param fax [required]
	 * @param corporationType [required]
	 * @param name [required]
	 * @param birthCity [required]
	 * @param email [required]
	 * @param city [required]
	 * @param companyNationalIdentificationNumber [required]
	 * @param birthDay [required]
	 * @param firstname [required]
	 * @param language [required]
	 * @param ovhCompany [required]
	 * @param address [required]
	 * @param legalform [required]
	 * @param sex [required]
	 */
	public OvhNewAccountAndToken POST(String address, String area, String birthCity, String birthDay, String city, String companyNationalIdentificationNumber, String corporationType, OvhCountryEnum country, String email, String fax, String firstname, OvhLanguageEnum language, OvhLegalFormEnum legalform, String name, String nationalIdentificationNumber, String organisation, OvhOvhCompanyEnum ovhCompany, OvhOvhSubsidiaryEnum ovhSubsidiary, String phone, OvhCountryEnum phoneCountry, OvhGenderEnum sex, String spareEmail, String vat, String zip) throws IOException {
		String qPath = "/newAccount";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "address", address);
		addBody(o, "area", area);
		addBody(o, "birthCity", birthCity);
		addBody(o, "birthDay", birthDay);
		addBody(o, "city", city);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "corporationType", corporationType);
		addBody(o, "country", country);
		addBody(o, "email", email);
		addBody(o, "fax", fax);
		addBody(o, "firstname", firstname);
		addBody(o, "language", language);
		addBody(o, "legalform", legalform);
		addBody(o, "name", name);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "organisation", organisation);
		addBody(o, "ovhCompany", ovhCompany);
		addBody(o, "ovhSubsidiary", ovhSubsidiary);
		addBody(o, "phone", phone);
		addBody(o, "phoneCountry", phoneCountry);
		addBody(o, "sex", sex);
		addBody(o, "spareEmail", spareEmail);
		addBody(o, "vat", vat);
		addBody(o, "zip", zip);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNewAccountAndToken.class);
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
}
