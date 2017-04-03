package net.minidev.ovh.api.dedicated.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recordsize values
 */
public enum OvhRecordSizeEnum {
	@JsonProperty("131072")
	_131072("131072"),
	@JsonProperty("16384")
	_16384("16384"),
	@JsonProperty("32768")
	_32768("32768"),
	@JsonProperty("4096")
	_4096("4096"),
	@JsonProperty("65536")
	_65536("65536"),
	@JsonProperty("8192")
	_8192("8192");

	final String value;

	OvhRecordSizeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
