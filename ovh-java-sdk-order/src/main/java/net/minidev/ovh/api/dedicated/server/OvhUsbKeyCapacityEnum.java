package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  Different USB key capacity in gigabytes
 */
public enum OvhUsbKeyCapacityEnum {
	@JsonProperty("128")
	_128("128"),
	@JsonProperty("16")
	_16("16"),
	@JsonProperty("256")
	_256("256"),
	@JsonProperty("32")
	_32("32"),
	@JsonProperty("64")
	_64("64");

	final String value;

	OvhUsbKeyCapacityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
