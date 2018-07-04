package net.minidev.ovh.api.hosting.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Different PHP versions available
 */
public enum OvhPhpVersionAvailableEnum {
	@JsonProperty("phpfpm-5.6")
	phpfpm_5_6("phpfpm-5.6"),
	@JsonProperty("phpfpm-7.0")
	phpfpm_7_0("phpfpm-7.0"),
	@JsonProperty("phpfpm-7.1")
	phpfpm_7_1("phpfpm-7.1"),
	@JsonProperty("phpfpm-7.2")
	phpfpm_7_2("phpfpm-7.2");

	final String value;

	OvhPhpVersionAvailableEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
