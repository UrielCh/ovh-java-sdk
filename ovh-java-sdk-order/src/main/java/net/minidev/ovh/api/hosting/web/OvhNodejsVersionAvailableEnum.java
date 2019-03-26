package net.minidev.ovh.api.hosting.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Different NodeJs versions available
 */
public enum OvhNodejsVersionAvailableEnum {
	@JsonProperty("nodejs-10")
	nodejs_10("nodejs-10"),
	@JsonProperty("nodejs-11")
	nodejs_11("nodejs-11"),
	@JsonProperty("nodejs-8")
	nodejs_8("nodejs-8"),
	@JsonProperty("nodejs-9")
	nodejs_9("nodejs-9");

	final String value;

	OvhNodejsVersionAvailableEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
