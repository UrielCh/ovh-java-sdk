package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * expiration possibility
 */
public enum OvhTokenExpirationEnum {
	@JsonProperty("1 day")
	_1_day("1 day"),
	@JsonProperty("1 hour")
	_1_hour("1 hour"),
	@JsonProperty("30 days")
	_30_days("30 days"),
	@JsonProperty("5 minutes")
	_5_minutes("5 minutes"),
	unlimited("unlimited");

	final String value;

	OvhTokenExpirationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
