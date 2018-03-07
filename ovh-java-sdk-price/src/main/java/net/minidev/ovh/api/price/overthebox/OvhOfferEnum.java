package net.minidev.ovh.api.price.overthebox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Offers
 */
public enum OvhOfferEnum {
	@JsonProperty("plus.v1")
	plus_v1("plus.v1");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
