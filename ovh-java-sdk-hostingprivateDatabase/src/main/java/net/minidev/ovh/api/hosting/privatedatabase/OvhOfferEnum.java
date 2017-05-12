package net.minidev.ovh.api.hosting.privatedatabase;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available offers
 */
public enum OvhOfferEnum {
	classic("classic"),
	@JsonProperty("public")
	_public("public");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
