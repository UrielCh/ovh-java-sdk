package net.minidev.ovh.api.xdsl;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Frequency of WLAN
 */
public enum OvhWLANFrequencyEnum {
	@JsonProperty("2.4GHz")
	_2_4GHz("2.4GHz"),
	@JsonProperty("5GHz")
	_5GHz("5GHz");

	final String value;

	OvhWLANFrequencyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
