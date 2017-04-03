package net.minidev.ovh.api.dedicated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The availability
 */
public enum OvhNasHAAvailabilityEnum {
	@JsonProperty("1H")
	_1H("1H"),
	@JsonProperty("240H")
	_240H("240H"),
	@JsonProperty("24H")
	_24H("24H"),
	@JsonProperty("72H")
	_72H("72H"),
	unknown("unknown");

	final String value;

	OvhNasHAAvailabilityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
