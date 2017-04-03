package net.minidev.ovh.api.email.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Mx plan offers
 */
public enum OvhOfferEnum {
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("25")
	_25("25"),
	@JsonProperty("5")
	_5("5"),
	FULL("FULL");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
