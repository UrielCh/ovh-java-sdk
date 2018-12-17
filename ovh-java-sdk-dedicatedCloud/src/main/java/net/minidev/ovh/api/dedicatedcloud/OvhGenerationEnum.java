package net.minidev.ovh.api.dedicatedcloud;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The generation of a Private Cloud
 */
public enum OvhGenerationEnum {
	@JsonProperty("1.0")
	_1_0("1.0"),
	@JsonProperty("2.0")
	_2_0("2.0");

	final String value;

	OvhGenerationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
