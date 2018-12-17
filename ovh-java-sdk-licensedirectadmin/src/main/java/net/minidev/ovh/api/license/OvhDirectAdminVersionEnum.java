package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All versions for DirectAdmin products
 */
public enum OvhDirectAdminVersionEnum {
	DIRECTADMIN_1("DIRECTADMIN_1"),
	@JsonProperty("directadmin-license")
	directadmin_license("directadmin-license");

	final String value;

	OvhDirectAdminVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
