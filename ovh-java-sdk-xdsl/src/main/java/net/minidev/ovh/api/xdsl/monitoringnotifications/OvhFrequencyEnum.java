package net.minidev.ovh.api.xdsl.monitoringnotifications;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Frequency between notifications.
 */
public enum OvhFrequencyEnum {
	@JsonProperty("1h")
	_1h("1h"),
	@JsonProperty("5m")
	_5m("5m"),
	@JsonProperty("6h")
	_6h("6h"),
	once("once");

	final String value;

	OvhFrequencyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
