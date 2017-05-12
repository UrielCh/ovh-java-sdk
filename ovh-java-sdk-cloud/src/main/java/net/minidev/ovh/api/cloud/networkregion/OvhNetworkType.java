package net.minidev.ovh.api.cloud.networkregion;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NetworkType
 */
public enum OvhNetworkType {
	@JsonProperty("public")
	_public("public"),
	@JsonProperty("private")
	_private("private");

	final String value;

	OvhNetworkType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
