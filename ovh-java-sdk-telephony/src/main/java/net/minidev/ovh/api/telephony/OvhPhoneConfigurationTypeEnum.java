package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Phone configuration type enum
 */
public enum OvhPhoneConfigurationTypeEnum {
	@JsonProperty("boolean")
	_boolean("boolean"),
	@JsonProperty("enum")
	_enum("enum"),
	hidden("hidden"),
	ipv4("ipv4"),
	numeric("numeric"),
	string("string");

	final String value;

	OvhPhoneConfigurationTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
