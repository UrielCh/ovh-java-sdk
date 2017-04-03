package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Monitoring interval in seconds
 */
public enum OvhMonitoringIntervalEnum {
	@JsonProperty("1800")
	_1800("1800"),
	@JsonProperty("21600")
	_21600("21600"),
	@JsonProperty("300")
	_300("300"),
	@JsonProperty("3600")
	_3600("3600");

	final String value;

	OvhMonitoringIntervalEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
