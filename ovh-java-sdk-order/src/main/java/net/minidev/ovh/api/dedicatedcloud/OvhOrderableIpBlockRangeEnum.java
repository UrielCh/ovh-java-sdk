package net.minidev.ovh.api.dedicatedcloud;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All orderable IP Block ranges in your Dedicated Cloud
 */
public enum OvhOrderableIpBlockRangeEnum {
	@JsonProperty("24")
	_24("24"),
	@JsonProperty("25")
	_25("25"),
	@JsonProperty("26")
	_26("26"),
	@JsonProperty("27")
	_27("27"),
	@JsonProperty("28")
	_28("28");

	final String value;

	OvhOrderableIpBlockRangeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
