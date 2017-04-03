package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP block size
 */
public enum OvhIpBlockSizeEnum {
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("128")
	_128("128"),
	@JsonProperty("16")
	_16("16"),
	@JsonProperty("256")
	_256("256"),
	@JsonProperty("32")
	_32("32"),
	@JsonProperty("4")
	_4("4"),
	@JsonProperty("64")
	_64("64"),
	@JsonProperty("8")
	_8("8");

	final String value;

	OvhIpBlockSizeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
