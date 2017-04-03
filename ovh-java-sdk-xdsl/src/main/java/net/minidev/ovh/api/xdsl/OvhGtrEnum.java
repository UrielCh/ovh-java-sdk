package net.minidev.ovh.api.xdsl;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Gtr of the line.
 */
public enum OvhGtrEnum {
	@JsonProperty("4hno")
	_4hno("4hno"),
	@JsonProperty("4ho")
	_4ho("4ho"),
	none("none");

	final String value;

	OvhGtrEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
