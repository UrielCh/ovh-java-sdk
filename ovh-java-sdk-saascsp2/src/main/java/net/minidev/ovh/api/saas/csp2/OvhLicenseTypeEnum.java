package net.minidev.ovh.api.saas.csp2;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Office license's type
 */
public enum OvhLicenseTypeEnum {
	ADDON("ADDON"),
	@JsonProperty("NON-SPECIFIC")
	NON_SPECIFIC("NON-SPECIFIC");

	final String value;

	OvhLicenseTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
