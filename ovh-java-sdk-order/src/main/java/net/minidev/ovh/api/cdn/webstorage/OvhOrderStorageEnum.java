package net.minidev.ovh.api.cdn.webstorage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available storage order
 */
public enum OvhOrderStorageEnum {
	@JsonProperty("100GB")
	_100GB("100GB"),
	@JsonProperty("10TB")
	_10TB("10TB"),
	@JsonProperty("1TB")
	_1TB("1TB"),
	@JsonProperty("500GB")
	_500GB("500GB"),
	@JsonProperty("50TB")
	_50TB("50TB"),
	@JsonProperty("5TB")
	_5TB("5TB");

	final String value;

	OvhOrderStorageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
