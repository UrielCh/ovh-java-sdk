package net.minidev.ovh.api.cloud.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TypeEnum
 */
public enum OvhTypeEnum {
	@JsonProperty("static")
	_static("static"),
	@JsonProperty("public")
	_public("public"),
	@JsonProperty("private")
	_private("private");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
