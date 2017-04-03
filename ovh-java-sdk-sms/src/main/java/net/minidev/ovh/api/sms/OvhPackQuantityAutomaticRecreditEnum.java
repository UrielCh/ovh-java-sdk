package net.minidev.ovh.api.sms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pack quantity automatic recredit possibilities
 */
public enum OvhPackQuantityAutomaticRecreditEnum {
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("1000")
	_1000("1000"),
	@JsonProperty("200")
	_200("200"),
	@JsonProperty("250")
	_250("250"),
	@JsonProperty("500")
	_500("500");

	final String value;

	OvhPackQuantityAutomaticRecreditEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
