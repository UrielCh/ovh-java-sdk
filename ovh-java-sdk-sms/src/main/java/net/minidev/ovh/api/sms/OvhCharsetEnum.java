package net.minidev.ovh.api.sms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The charset format
 */
public enum OvhCharsetEnum {
	@JsonProperty("UTF-8")
	UTF_8("UTF-8");

	final String value;

	OvhCharsetEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
