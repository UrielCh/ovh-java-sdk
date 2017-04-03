package net.minidev.ovh.api.cloud.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NetworkTypeEnum
 */
public enum OvhNetworkTypeEnum {
	@JsonProperty("public")
	_public("public"),
	@JsonProperty("private")
	_private("private");

	final String value;

	OvhNetworkTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
