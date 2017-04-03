package net.minidev.ovh.api.vps;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Bitness of a VPS template
 */
public enum OvhTemplateBitFormatEnum {
	@JsonProperty("32")
	_32("32"),
	@JsonProperty("64")
	_64("64");

	final String value;

	OvhTemplateBitFormatEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
