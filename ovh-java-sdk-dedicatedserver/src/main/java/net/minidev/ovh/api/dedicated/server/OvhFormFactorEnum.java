package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Server form factor
 */
public enum OvhFormFactorEnum {
	@JsonProperty("0.25u")
	_0_25u("0.25u"),
	@JsonProperty("0.5u")
	_0_5u("0.5u"),
	@JsonProperty("1u")
	_1u("1u"),
	@JsonProperty("2u")
	_2u("2u"),
	@JsonProperty("3u")
	_3u("3u"),
	@JsonProperty("4u")
	_4u("4u");

	final String value;

	OvhFormFactorEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
