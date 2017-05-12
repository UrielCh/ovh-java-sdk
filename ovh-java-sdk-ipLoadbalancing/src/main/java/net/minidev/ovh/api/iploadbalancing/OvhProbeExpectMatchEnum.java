package net.minidev.ovh.api.iploadbalancing;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of possible probe result matches. "status" is only supported for HTTP probes
 */
public enum OvhProbeExpectMatchEnum {
	contains("contains"),
	@JsonProperty("default")
	_default("default"),
	internal("internal"),
	matches("matches"),
	status("status");

	final String value;

	OvhProbeExpectMatchEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
