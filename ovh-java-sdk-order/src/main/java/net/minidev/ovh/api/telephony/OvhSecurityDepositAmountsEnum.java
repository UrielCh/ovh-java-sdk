package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available amounts for security deposit crediting
 */
public enum OvhSecurityDepositAmountsEnum {
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("1000")
	_1000("1000"),
	@JsonProperty("10000")
	_10000("10000"),
	@JsonProperty("20")
	_20("20"),
	@JsonProperty("200")
	_200("200"),
	@JsonProperty("2000")
	_2000("2000"),
	@JsonProperty("30")
	_30("30"),
	@JsonProperty("300")
	_300("300"),
	@JsonProperty("3000")
	_3000("3000"),
	@JsonProperty("40")
	_40("40"),
	@JsonProperty("400")
	_400("400"),
	@JsonProperty("4000")
	_4000("4000"),
	@JsonProperty("50")
	_50("50"),
	@JsonProperty("500")
	_500("500"),
	@JsonProperty("5000")
	_5000("5000");

	final String value;

	OvhSecurityDepositAmountsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
