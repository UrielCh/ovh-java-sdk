package net.minidev.ovh.api.cloud;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for delay between two alerts in seconds
 */
public enum OvhAlertingDelayEnum {
	@JsonProperty("10800")
	_10800("10800"),
	@JsonProperty("172800")
	_172800("172800"),
	@JsonProperty("21600")
	_21600("21600"),
	@JsonProperty("259200")
	_259200("259200"),
	@JsonProperty("3600")
	_3600("3600"),
	@JsonProperty("43200")
	_43200("43200"),
	@JsonProperty("604800")
	_604800("604800"),
	@JsonProperty("86400")
	_86400("86400");

	final String value;

	OvhAlertingDelayEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
