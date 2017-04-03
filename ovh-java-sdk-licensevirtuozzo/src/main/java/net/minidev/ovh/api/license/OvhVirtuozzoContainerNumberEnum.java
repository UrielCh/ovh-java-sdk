package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All quantities of container available for a Virtuozzo license
 */
public enum OvhVirtuozzoContainerNumberEnum {
	@JsonProperty("2_CPU_001_CONTAINER")
	_2_CPU_001_CONTAINER("2_CPU_001_CONTAINER"),
	@JsonProperty("2_CPU_003_CONTAINER")
	_2_CPU_003_CONTAINER("2_CPU_003_CONTAINER"),
	@JsonProperty("2_CPU_010_CONTAINER")
	_2_CPU_010_CONTAINER("2_CPU_010_CONTAINER"),
	@JsonProperty("2_CPU_030_CONTAINER")
	_2_CPU_030_CONTAINER("2_CPU_030_CONTAINER"),
	@JsonProperty("2_CPU_060_CONTAINER")
	_2_CPU_060_CONTAINER("2_CPU_060_CONTAINER"),
	@JsonProperty("2_CPU_100_CONTAINER")
	_2_CPU_100_CONTAINER("2_CPU_100_CONTAINER");

	final String value;

	OvhVirtuozzoContainerNumberEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
