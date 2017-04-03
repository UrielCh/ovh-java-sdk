package net.minidev.ovh.api.cdn.webstorage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available traffic order in TB
 */
public enum OvhOrderTrafficEnum {
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("1000")
	_1000("1000"),
	@JsonProperty("10000")
	_10000("10000");

	final String value;

	OvhOrderTrafficEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
