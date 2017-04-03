package net.minidev.ovh.api.freefax;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available quantity of fax to purchase
 */
public enum OvhQuantityEnum {
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("1000")
	_1000("1000"),
	@JsonProperty("10000")
	_10000("10000"),
	@JsonProperty("100000")
	_100000("100000"),
	@JsonProperty("200")
	_200("200"),
	@JsonProperty("2000")
	_2000("2000"),
	@JsonProperty("50")
	_50("50"),
	@JsonProperty("500")
	_500("500"),
	@JsonProperty("5000")
	_5000("5000");

	final String value;

	OvhQuantityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
