package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Time to live in minutes for cache
 */
public enum OvhCacheTTLEnum {
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("15")
	_15("15"),
	@JsonProperty("3")
	_3("3"),
	@JsonProperty("5")
	_5("5");

	final String value;

	OvhCacheTTLEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
