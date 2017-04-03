package net.minidev.ovh.api.cloud.instance;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetricsType
 */
public enum OvhMetricsType {
	@JsonProperty("mem:used")
	mem_used("mem:used"),
	@JsonProperty("mem:max")
	mem_max("mem:max"),
	@JsonProperty("cpu:used")
	cpu_used("cpu:used"),
	@JsonProperty("cpu:max")
	cpu_max("cpu:max"),
	@JsonProperty("net:tx")
	net_tx("net:tx"),
	@JsonProperty("net:rx")
	net_rx("net:rx");

	final String value;

	OvhMetricsType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
