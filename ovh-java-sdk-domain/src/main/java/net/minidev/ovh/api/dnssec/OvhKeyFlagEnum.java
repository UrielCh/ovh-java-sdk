package net.minidev.ovh.api.dnssec;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dnssec Key Flag Type
                        ###
                        256 : Zone Signing Key (ZSK)
                        257 : Key  Signing Key (KSK)
 */
public enum OvhKeyFlagEnum {
	@JsonProperty("256")
	_256("256"),
	@JsonProperty("257")
	_257("257");

	final String value;

	OvhKeyFlagEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
