package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  Different vRack Bandwidth orderable in Mbps
 */
public enum OvhBandwidthvRackOrderEnum {
	@JsonProperty("1000")
	_1000("1000"),
	@JsonProperty("3000")
	_3000("3000");

	final String value;

	OvhBandwidthvRackOrderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
