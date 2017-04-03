package net.minidev.ovh.api.email.exchange;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage quota options in GB
 */
public enum OvhAccountQuotaEnum {
	@JsonProperty("300")
	_300("300"),
	@JsonProperty("50")
	_50("50");

	final String value;

	OvhAccountQuotaEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
