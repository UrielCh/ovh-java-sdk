package net.minidev.ovh.api.coretypes;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Continents
 */
public enum OvhContinentEnum {
	africa("africa"),
	antartica("antartica"),
	asia("asia"),
	europe("europe"),
	@JsonProperty("north-america")
	north_america("north-america"),
	oceania("oceania"),
	@JsonProperty("south-america")
	south_america("south-america");

	final String value;

	OvhContinentEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
