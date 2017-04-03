package net.minidev.ovh.api.hosting.web.ovhconfig;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hosting configuration version
 */
public enum OvhEngineVersionEnum {
	@JsonProperty("4.4")
	_4_4("4.4"),
	@JsonProperty("5.0")
	_5_0("5.0"),
	@JsonProperty("5.1")
	_5_1("5.1"),
	@JsonProperty("5.2")
	_5_2("5.2"),
	@JsonProperty("5.3")
	_5_3("5.3"),
	@JsonProperty("5.4")
	_5_4("5.4"),
	@JsonProperty("5.5")
	_5_5("5.5"),
	@JsonProperty("5.6")
	_5_6("5.6"),
	@JsonProperty("7.0")
	_7_0("7.0"),
	@JsonProperty("7.1")
	_7_1("7.1"),
	AUTO("AUTO");

	final String value;

	OvhEngineVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
