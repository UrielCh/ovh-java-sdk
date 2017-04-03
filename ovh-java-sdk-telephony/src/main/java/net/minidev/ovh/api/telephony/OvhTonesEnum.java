package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tones type
 */
public enum OvhTonesEnum {
	@JsonProperty("Custom sound")
	Custom_sound("Custom sound"),
	None("None");

	final String value;

	OvhTonesEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
