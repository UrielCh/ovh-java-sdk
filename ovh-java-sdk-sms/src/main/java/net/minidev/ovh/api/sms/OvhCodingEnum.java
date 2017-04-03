package net.minidev.ovh.api.sms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The sms coding
 */
public enum OvhCodingEnum {
	@JsonProperty("7bit")
	_7bit("7bit"),
	@JsonProperty("8bit")
	_8bit("8bit");

	final String value;

	OvhCodingEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
