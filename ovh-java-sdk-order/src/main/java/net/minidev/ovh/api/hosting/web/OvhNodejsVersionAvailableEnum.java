package net.minidev.ovh.api.hosting.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Different NodeJs versions available
 */
public enum OvhNodejsVersionAvailableEnum {
	@JsonProperty("nodejs-8")
	nodejs_8("nodejs-8");

	final String value;

	OvhNodejsVersionAvailableEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
