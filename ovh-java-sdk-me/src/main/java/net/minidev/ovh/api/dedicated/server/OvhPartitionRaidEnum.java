package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * partition raid type
 */
public enum OvhPartitionRaidEnum {
	@JsonProperty("0")
	_0("0"),
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("5")
	_5("5"),
	@JsonProperty("6")
	_6("6");

	final String value;

	OvhPartitionRaidEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
