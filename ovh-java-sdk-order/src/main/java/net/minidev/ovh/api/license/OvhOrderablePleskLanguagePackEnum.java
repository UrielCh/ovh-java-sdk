package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All language pack numbers available for Plesk products
 */
public enum OvhOrderablePleskLanguagePackEnum {
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("2")
	_2("2"),
	@JsonProperty("3")
	_3("3"),
	@JsonProperty("4")
	_4("4"),
	@JsonProperty("5")
	_5("5"),
	unlimited("unlimited");

	final String value;

	OvhOrderablePleskLanguagePackEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
