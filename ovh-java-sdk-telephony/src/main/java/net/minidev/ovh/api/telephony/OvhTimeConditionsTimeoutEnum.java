package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Timeout before unavailable action is triggered
 */
public enum OvhTimeConditionsTimeoutEnum {
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("15")
	_15("15"),
	@JsonProperty("20")
	_20("20"),
	@JsonProperty("25")
	_25("25"),
	@JsonProperty("30")
	_30("30"),
	@JsonProperty("35")
	_35("35"),
	@JsonProperty("40")
	_40("40"),
	@JsonProperty("45")
	_45("45"),
	@JsonProperty("5")
	_5("5"),
	@JsonProperty("50")
	_50("50"),
	@JsonProperty("55")
	_55("55"),
	@JsonProperty("60")
	_60("60"),
	@JsonProperty("65")
	_65("65"),
	@JsonProperty("70")
	_70("70"),
	@JsonProperty("75")
	_75("75"),
	@JsonProperty("80")
	_80("80"),
	@JsonProperty("85")
	_85("85"),
	@JsonProperty("90")
	_90("90");

	final String value;

	OvhTimeConditionsTimeoutEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
