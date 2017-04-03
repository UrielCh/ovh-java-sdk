package net.minidev.ovh.api.vps;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available types for the VPS monitoring and use
 */
public enum OvhVpsStatisticTypeEnum {
	@JsonProperty("cpu:iowait")
	cpu_iowait("cpu:iowait"),
	@JsonProperty("cpu:max")
	cpu_max("cpu:max"),
	@JsonProperty("cpu:nice")
	cpu_nice("cpu:nice"),
	@JsonProperty("cpu:sys")
	cpu_sys("cpu:sys"),
	@JsonProperty("cpu:used")
	cpu_used("cpu:used"),
	@JsonProperty("cpu:user")
	cpu_user("cpu:user"),
	@JsonProperty("mem:max")
	mem_max("mem:max"),
	@JsonProperty("mem:used")
	mem_used("mem:used"),
	@JsonProperty("net:rx")
	net_rx("net:rx"),
	@JsonProperty("net:tx")
	net_tx("net:tx");

	final String value;

	OvhVpsStatisticTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
