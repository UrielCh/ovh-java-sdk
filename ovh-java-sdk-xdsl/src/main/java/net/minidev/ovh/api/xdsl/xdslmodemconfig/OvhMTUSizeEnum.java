package net.minidev.ovh.api.xdsl.xdslmodemconfig;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Size of the Maximum Transmission Unit on the modem's interfaces
 */
public enum OvhMTUSizeEnum {
	@JsonProperty("1432")
	_1432("1432"),
	@JsonProperty("1456")
	_1456("1456"),
	@JsonProperty("1492")
	_1492("1492");

	final String value;

	OvhMTUSizeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
