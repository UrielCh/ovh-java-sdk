package net.minidev.ovh.api.dedicated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The availability
 */
public enum OvhAvailabilityEnum {
	@JsonProperty("1H-high")
	_1H_high("1H-high"),
	@JsonProperty("1H-low")
	_1H_low("1H-low"),
	@JsonProperty("240H")
	_240H("240H"),
	@JsonProperty("24H")
	_24H("24H"),
	@JsonProperty("72H")
	_72H("72H"),
	unavailable("unavailable"),
	unknown("unknown");

	final String value;

	OvhAvailabilityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
