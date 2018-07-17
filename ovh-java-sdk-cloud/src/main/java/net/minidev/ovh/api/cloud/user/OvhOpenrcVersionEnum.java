package net.minidev.ovh.api.cloud.user;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OpenrcVersionEnum
 */
public enum OvhOpenrcVersionEnum {
	@JsonProperty("v2.0")
	v2_0("v2.0"),
	v3("v3");

	final String value;

	OvhOpenrcVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
