package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Greeting type
 */
public enum OvhVoicemailGreetingEnum {
	@JsonProperty("default")
	_default("default"),
	full("full"),
	@JsonProperty("short")
	_short("short");

	final String value;

	OvhVoicemailGreetingEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
