package net.minidev.ovh.api.horizonview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All packs a Cloud Desktop Infrastructure can have
 */
public enum OvhOffer {
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("2")
	_2("2"),
	@JsonProperty("3")
	_3("3");

	final String value;

	OvhOffer(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
