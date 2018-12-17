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
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Give all the rules to follow in order to create an OVH identifier
	 *
	 * REST: GET /newAccount/creationRules
	 * @param ovhCompany [required]
	 * @param country [required]
	 * @param ovhSubsidiary [required]
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
	 * Returns the contracts that governs the creation of an OVH identifier
	 *
	 * REST: GET /newAccount/contracts
	 * @param company [required]
	 * @param subsidiary [required]
	 */
	public ArrayList<OvhContract> contracts_GET(OvhOvhCompanyEnum company, OvhOvhSubsidiaryEnum subsidiary) throws IOException {
		String qPath = "/newAccount/contracts";
		StringBuilder sb = path(qPath);
		query(sb, "company", company);
		query(sb, "subsidiary", subsidiary);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhContract>> t2 = new TypeReference<ArrayList<OvhContract>>() {};

	/**
	 * Give all the rules to follow in order to create and update an OVH identifier
	 *
	 * REST: POST /newAccount/rules
	 * @param language [required]
	 * @param email [required]
	 * @param spareEmail [required]
	 * @param vat [required]
	 * @param firstname [required]
	 * @param zip [required]
	 * @param birthDay [required]
	 * @param legalform [required]
	 * @param organisation [required]
	 * @param sex [required]
	 * @param fax [required]
	 * @param name [required]
	 * @param nationalIdentificationNumber [required]
	 * @param companyNationalIdentificationNumber [required]
	 * @param phone [required]
	 * @param birthCity [required]
	 * @param corporationType [required]
	 * @param country [required]
	 * @param city [required]
	 * @param ovhCompany [required]
	 * @param address [required]
	 * @param action [required]
	 * @param ovhSubsidiary [required]
	 * @param area [required]
	 * @param phoneCountry [required]
	 */
	public ArrayList<OvhCreationRule> rules_POST(OvhLanguageEnum language, String email, String spareEmail, String vat, String firstname, String zip, String birthDay, OvhLegalFormEnum legalform, String organisation, OvhGenderEnum sex, String fax, String name, String nationalIdentificationNumber, String companyNationalIdentificationNumber, String phone, String birthCity, String corporationType, OvhCountryEnum country, String city, OvhOvhCompanyEnum ovhCompany, String address, OvhCreationRulesActionEnum action, OvhOvhSubsidiaryEnum ovhSubsidiary, String area, OvhCountryEnum phoneCountry) throws IOException {
		String qPath = "/newAccount/rules";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "language", language);
		addBody(o, "email", email);
		addBody(o, "spareEmail", spareEmail);
		addBody(o, "vat", vat);
		addBody(o, "firstname", firstname);
		addBody(o, "zip", zip);
		addBody(o, "birthDay", birthDay);
		addBody(o, "legalform", legalform);
		addBody(o, "organisation", organisation);
		addBody(o, "sex", sex);
		addBody(o, "fax", fax);
		addBody(o, "name", name);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "phone", phone);
		addBody(o, "birthCity", birthCity);
		addBody(o, "corporationType", corporationType);
		addBody(o, "country", country);
		addBody(o, "city", city);
		addBody(o, "ovhCompany", ovhCompany);
		addBody(o, "address", address);
		addBody(o, "action", action);
		addBody(o, "ovhSubsidiary", ovhSubsidiary);
		addBody(o, "area", area);
		addBody(o, "phoneCountry", phoneCountry);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhCreationRule>> t3 = new TypeReference<ArrayList<OvhCreationRule>>() {};

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
	 * Create a new OVH identifier
	 *
	 * REST: POST /newAccount
	 * @param spareEmail [required]
	 * @param email [required]
	 * @param vat [required]
	 * @param firstname [required]
	 * @param language [required]
	 * @param birthDay [required]
	 * @param legalform [required]
	 * @param organisation [required]
	 * @param sex [required]
	 * @param fax [required]
	 * @param zip [required]
	 * @param companyNationalIdentificationNumber [required]
	 * @param phone [required]
	 * @param birthCity [required]
	 * @param name [required]
	 * @param nationalIdentificationNumber [required]
	 * @param address [required]
	 * @param ovhSubsidiary [required]
	 * @param area [required]
	 * @param phoneCountry [required]
	 * @param country [required]
	 * @param corporationType [required]
	 * @param city [required]
	 * @param ovhCompany [required]
	 */
	public OvhNewAccountAndToken POST(String spareEmail, String email, String vat, String firstname, OvhLanguageEnum language, String birthDay, OvhLegalFormEnum legalform, String organisation, OvhGenderEnum sex, String fax, String zip, String companyNationalIdentificationNumber, String phone, String birthCity, String name, String nationalIdentificationNumber, String address, OvhOvhSubsidiaryEnum ovhSubsidiary, String area, OvhCountryEnum phoneCountry, OvhCountryEnum country, String corporationType, String city, OvhOvhCompanyEnum ovhCompany) throws IOException {
		String qPath = "/newAccount";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "spareEmail", spareEmail);
		addBody(o, "email", email);
		addBody(o, "vat", vat);
		addBody(o, "firstname", firstname);
		addBody(o, "language", language);
		addBody(o, "birthDay", birthDay);
		addBody(o, "legalform", legalform);
		addBody(o, "organisation", organisation);
		addBody(o, "sex", sex);
		addBody(o, "fax", fax);
		addBody(o, "zip", zip);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "phone", phone);
		addBody(o, "birthCity", birthCity);
		addBody(o, "name", name);
		addBody(o, "nationalIdentificationNumber", nationalIdentificationNumber);
		addBody(o, "address", address);
		addBody(o, "ovhSubsidiary", ovhSubsidiary);
		addBody(o, "area", area);
		addBody(o, "phoneCountry", phoneCountry);
		addBody(o, "country", country);
		addBody(o, "corporationType", corporationType);
		addBody(o, "city", city);
		addBody(o, "ovhCompany", ovhCompany);
		String resp = execN(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNewAccountAndToken.class);
	}

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
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhCountryEnum>> t4 = new TypeReference<ArrayList<OvhCountryEnum>>() {};
}
