package net.minidev.ovh.api.vrack;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for block size
 */
public enum OvhBlockSizeEnum {
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

	OvhBlockSizeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
