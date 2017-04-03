package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tones type
 */
public enum OvhTonesOnHoldEnum {
	@JsonProperty("Custom sound")
	Custom_sound("Custom sound"),
	None("None"),
	@JsonProperty("Predefined 1")
	Predefined_1("Predefined 1"),
	@JsonProperty("Predefined 2")
	Predefined_2("Predefined 2");

	final String value;

	OvhTonesOnHoldEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
