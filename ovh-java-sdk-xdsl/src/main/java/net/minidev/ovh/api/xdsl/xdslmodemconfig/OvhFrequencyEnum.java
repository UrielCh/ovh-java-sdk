package net.minidev.ovh.api.xdsl.xdslmodemconfig;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Modem frequency
 */
public enum OvhFrequencyEnum {
	@JsonProperty("2.4GHz")
	_2_4GHz("2.4GHz"),
	@JsonProperty("5GHz")
	_5GHz("5GHz");

	final String value;

	OvhFrequencyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
