package net.minidev.ovh.api.hpcspot;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All references a HPC Spot consumption can be in
 */
public enum OvhConsumptionReferenceEnum {
	@JsonProperty("12core.60gb.quadrok4000")
	_12core_60gb_quadrok4000("12core.60gb.quadrok4000"),
	@JsonProperty("16core.64gb")
	_16core_64gb("16core.64gb"),
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
	@JsonProperty("4core.32gb")
	_4core_32gb("4core.32gb"),
	@JsonProperty("8core.30gb")
	_8core_30gb("8core.30gb"),
	@JsonProperty("8core.30gb.quadrok4000")
	_8core_30gb_quadrok4000("8core.30gb.quadrok4000"),
	@JsonProperty("8core.32gb.1teslak20")
	_8core_32gb_1teslak20("8core.32gb.1teslak20");

	final String value;

	OvhConsumptionReferenceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
