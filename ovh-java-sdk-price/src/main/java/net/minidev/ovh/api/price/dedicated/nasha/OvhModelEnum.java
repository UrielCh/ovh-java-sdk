package net.minidev.ovh.api.price.dedicated.nasha;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Models
 */
public enum OvhModelEnum {
	@JsonProperty("1200g")
	_1200g("1200g"),
	@JsonProperty("13200g")
	_13200g("13200g"),
	@JsonProperty("19200g")
	_19200g("19200g"),
	@JsonProperty("2400g")
	_2400g("2400g"),
	@JsonProperty("26400g")
	_26400g("26400g"),
	@JsonProperty("3600g")
	_3600g("3600g"),
	@JsonProperty("7200g")
	_7200g("7200g");

	final String value;

	OvhModelEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
