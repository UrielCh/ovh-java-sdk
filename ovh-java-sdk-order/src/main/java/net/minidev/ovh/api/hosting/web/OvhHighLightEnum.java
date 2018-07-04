package net.minidev.ovh.api.hosting.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Highlight tips for offer
 */
public enum OvhHighLightEnum {
	@JsonProperty("best-seller")
	best_seller("best-seller"),
	@JsonProperty("new")
	_new("new");

	final String value;

	OvhHighLightEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
