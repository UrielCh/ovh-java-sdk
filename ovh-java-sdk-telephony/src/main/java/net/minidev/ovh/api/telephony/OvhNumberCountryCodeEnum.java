package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Number country code
 */
public enum OvhNumberCountryCodeEnum {
	@JsonProperty("32")
	_32("32"),
	@JsonProperty("33")
	_33("33"),
	@JsonProperty("34")
	_34("34"),
	@JsonProperty("39")
	_39("39"),
	@JsonProperty("41")
	_41("41"),
	@JsonProperty("44")
	_44("44"),
	@JsonProperty("49")
	_49("49");

	final String value;

	OvhNumberCountryCodeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
