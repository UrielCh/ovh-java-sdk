package net.minidev.ovh.api.sms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pack quantity levels
 */
public enum OvhPackQuantityEnum {
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("1000")
	_1000("1000"),
	@JsonProperty("10000")
	_10000("10000"),
	@JsonProperty("100000")
	_100000("100000"),
	@JsonProperty("1000000")
	_1000000("1000000"),
	@JsonProperty("200")
	_200("200"),
	@JsonProperty("250")
	_250("250"),
	@JsonProperty("2500")
	_2500("2500"),
	@JsonProperty("25000")
	_25000("25000"),
	@JsonProperty("500")
	_500("500"),
	@JsonProperty("5000")
	_5000("5000"),
	@JsonProperty("50000")
	_50000("50000");

	final String value;

	OvhPackQuantityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
