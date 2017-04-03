package net.minidev.ovh.api.xander;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available contact fields
 */
public enum OvhContactFieldEnum {
	@JsonProperty("address.city")
	address_city("address.city"),
	@JsonProperty("address.country")
	address_country("address.country"),
	@JsonProperty("address.line1")
	address_line1("address.line1"),
	@JsonProperty("address.line2")
	address_line2("address.line2"),
	@JsonProperty("address.line3")
	address_line3("address.line3"),
	@JsonProperty("address.otherDetails")
	address_otherDetails("address.otherDetails"),
	@JsonProperty("address.province")
	address_province("address.province"),
	@JsonProperty("address.zip")
	address_zip("address.zip"),
	birthCity("birthCity"),
	birthCountry("birthCountry"),
	birthDay("birthDay"),
	birthZip("birthZip"),
	cellPhone("cellPhone"),
	companyNationalIdentificationNumber("companyNationalIdentificationNumber"),
	email("email"),
	fax("fax"),
	firstName("firstName"),
	gender("gender"),
	language("language"),
	lastName("lastName"),
	legalForm("legalForm"),
	nationalIdentificationNumber("nationalIdentificationNumber"),
	nationality("nationality"),
	organisationName("organisationName"),
	organisationType("organisationType"),
	phone("phone"),
	spareEmail("spareEmail"),
	vat("vat");

	final String value;

	OvhContactFieldEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
