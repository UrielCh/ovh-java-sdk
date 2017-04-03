package net.minidev.ovh.api.price.xdsl.options;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Ipv4s
 */
public enum OvhIpv4Enum {
	@JsonProperty("29")
	_29("29");

	final String value;

	OvhIpv4Enum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
