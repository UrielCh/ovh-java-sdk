package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Number quantity contained in the pool
 */
public enum OvhNumberPoolEnum {
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("50")
	_50("50");

	final String value;

	OvhNumberPoolEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
