package net.minidev.ovh.api.cdnanycast;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available number for quota order
 */
public enum OvhOrderQuotaEnum {
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("1000")
	_1000("1000");

	final String value;

	OvhOrderQuotaEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
