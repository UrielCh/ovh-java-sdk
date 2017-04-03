package net.minidev.ovh.api.price.hpcspot.consumption;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Reservations
 */
public enum OvhReservationEnum {
	@JsonProperty("12core.60gb.quadrok400")
	_12core_60gb_quadrok400("12core.60gb.quadrok400"),
	@JsonProperty("1core.4gb")
	_1core_4gb("1core.4gb"),
	@JsonProperty("1core.4gb.quadrok4000")
	_1core_4gb_quadrok4000("1core.4gb.quadrok4000"),
	@JsonProperty("2core.8gb")
	_2core_8gb("2core.8gb"),
	@JsonProperty("2core.8gb.quadrok4000")
	_2core_8gb_quadrok4000("2core.8gb.quadrok4000"),
	@JsonProperty("4core.15gb")
	_4core_15gb("4core.15gb"),
	@JsonProperty("4core.15gb.quadrok4000")
	_4core_15gb_quadrok4000("4core.15gb.quadrok4000"),
	@JsonProperty("8core.30gb")
	_8core_30gb("8core.30gb"),
	@JsonProperty("8core.30gb.quadrok4000")
	_8core_30gb_quadrok4000("8core.30gb.quadrok4000");

	final String value;

	OvhReservationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
