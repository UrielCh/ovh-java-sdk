package net.minidev.ovh.api.paas.database.instance.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration detail type
 */
public enum OvhDetailType {
	@JsonProperty("boolean")
	_boolean("boolean"),
	number("number"),
	string("string");

	final String value;

	OvhDetailType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
