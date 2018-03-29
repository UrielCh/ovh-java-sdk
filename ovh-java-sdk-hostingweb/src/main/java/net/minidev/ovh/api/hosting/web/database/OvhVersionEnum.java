package net.minidev.ovh.api.hosting.web.database;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database Version enum
 */
public enum OvhVersionEnum {
	@JsonProperty("3.4")
	_3_4("3.4"),
	@JsonProperty("4.0")
	_4_0("4.0"),
	@JsonProperty("5.1")
	_5_1("5.1"),
	@JsonProperty("5.5")
	_5_5("5.5"),
	@JsonProperty("5.6")
	_5_6("5.6"),
	@JsonProperty("8.4")
	_8_4("8.4");

	final String value;

	OvhVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
