package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Orderable IP type
 */
public enum OvhIpTypeOrderableEnum {
	failover("failover"),
	@JsonProperty("static")
	_static("static"),
	unshielded("unshielded");

	final String value;

	OvhIpTypeOrderableEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
