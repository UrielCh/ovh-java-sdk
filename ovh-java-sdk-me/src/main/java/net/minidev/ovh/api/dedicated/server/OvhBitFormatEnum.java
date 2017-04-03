package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available os bit format
 */
public enum OvhBitFormatEnum {
	@JsonProperty("32")
	_32("32"),
	@JsonProperty("64")
	_64("64");

	final String value;

	OvhBitFormatEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
