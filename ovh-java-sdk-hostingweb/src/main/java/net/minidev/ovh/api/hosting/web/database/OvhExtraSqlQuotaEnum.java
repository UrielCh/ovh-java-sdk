package net.minidev.ovh.api.hosting.web.database;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExtraSqlPerso quota enum
 */
public enum OvhExtraSqlQuotaEnum {
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("200")
	_200("200"),
	@JsonProperty("25")
	_25("25"),
	@JsonProperty("400")
	_400("400"),
	@JsonProperty("800")
	_800("800");

	final String value;

	OvhExtraSqlQuotaEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
