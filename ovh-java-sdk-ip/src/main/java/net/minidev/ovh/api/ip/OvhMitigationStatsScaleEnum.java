package net.minidev.ovh.api.ip;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible aggregation scale on statistics
 */
public enum OvhMitigationStatsScaleEnum {
	@JsonProperty("10s")
	_10s("10s"),
	@JsonProperty("1m")
	_1m("1m"),
	@JsonProperty("5m")
	_5m("5m");

	final String value;

	OvhMitigationStatsScaleEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
