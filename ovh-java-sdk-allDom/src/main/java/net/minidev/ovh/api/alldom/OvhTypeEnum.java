package net.minidev.ovh.api.alldom;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Type
 */
public enum OvhTypeEnum {
	french("french"),
	@JsonProperty("french+international")
	frenchPlusinternational("french+international"),
	international("international");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
