package net.minidev.ovh.api.hosting.privatedatabase;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Private database available ram sizes
 */
public enum OvhAvailableRamSizeEnum {
	@JsonProperty("1024")
	_1024("1024"),
	@JsonProperty("2048")
	_2048("2048"),
	@JsonProperty("256")
	_256("256"),
	@JsonProperty("4096")
	_4096("4096"),
	@JsonProperty("512")
	_512("512");

	final String value;

	OvhAvailableRamSizeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
