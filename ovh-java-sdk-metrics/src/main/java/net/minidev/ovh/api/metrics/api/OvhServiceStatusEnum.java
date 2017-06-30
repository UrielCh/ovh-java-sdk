package net.minidev.ovh.api.metrics.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Status of of the service
 */
public enum OvhServiceStatusEnum {
	@JsonProperty("new")
	_new("new"),
	alive("alive"),
	disabled("disabled"),
	dead("dead");

	final String value;

	OvhServiceStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
