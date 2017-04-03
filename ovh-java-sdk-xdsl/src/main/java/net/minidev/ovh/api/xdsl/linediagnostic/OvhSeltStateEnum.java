package net.minidev.ovh.api.xdsl.linediagnostic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible SELT test states
 */
public enum OvhSeltStateEnum {
	open("open"),
	@JsonProperty("short")
	_short("short"),
	synced("synced"),
	unknown("unknown");

	final String value;

	OvhSeltStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
