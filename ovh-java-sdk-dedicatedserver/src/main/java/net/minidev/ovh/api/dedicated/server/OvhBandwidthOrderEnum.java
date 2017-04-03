package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  Different Bandwidth orderable in Mbps
 */
public enum OvhBandwidthOrderEnum {
	@JsonProperty("1000")
	_1000("1000"),
	@JsonProperty("2000")
	_2000("2000"),
	@JsonProperty("3000")
	_3000("3000");

	final String value;

	OvhBandwidthOrderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
