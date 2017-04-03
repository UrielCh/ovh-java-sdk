package net.minidev.ovh.api.price.hpcspot.consumption;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Sessions
 */
public enum OvhSessionEnum {
	@JsonProperty("16core.64gb")
	_16core_64gb("16core.64gb"),
	@JsonProperty("4core.32gb")
	_4core_32gb("4core.32gb"),
	@JsonProperty("8core.32gb")
	_8core_32gb("8core.32gb");

	final String value;

	OvhSessionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
