package net.minidev.ovh.api.ip;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for auto mitigation timeout (minutes)
 */
public enum OvhMitigationProfileAutoMitigationTimeOutEnum {
	@JsonProperty("0")
	_0("0"),
	@JsonProperty("15")
	_15("15"),
	@JsonProperty("1560")
	_1560("1560"),
	@JsonProperty("360")
	_360("360"),
	@JsonProperty("60")
	_60("60");

	final String value;

	OvhMitigationProfileAutoMitigationTimeOutEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
