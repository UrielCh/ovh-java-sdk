package net.minidev.ovh.api.hosting.web.ovhconfig;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hosting available configuration version
 */
public enum OvhAvailableEngineVersionEnum {
	@JsonProperty("5.4")
	_5_4("5.4"),
	@JsonProperty("5.5")
	_5_5("5.5"),
	@JsonProperty("5.6")
	_5_6("5.6"),
	@JsonProperty("7.0")
	_7_0("7.0"),
	@JsonProperty("7.1")
	_7_1("7.1");

	final String value;

	OvhAvailableEngineVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
