package net.minidev.ovh.api.hosting.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available offers to increase bandwidth quota (unit in GB)
 */
public enum OvhBandwidthOfferEnum {
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
	@JsonProperty("250")
	_250("250"),
	@JsonProperty("30")
	_30("30"),
	@JsonProperty("40")
	_40("40"),
	@JsonProperty("50")
	_50("50"),
	@JsonProperty("500")
	_500("500");

	final String value;

	OvhBandwidthOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
