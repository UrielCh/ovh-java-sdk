package net.minidev.ovh.api.hosting.web.order;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MX plan linked to the new main domain
 */
public enum OvhMxPlanEnum {
	@JsonProperty("005")
	_005("005"),
	@JsonProperty("025")
	_025("025"),
	@JsonProperty("100")
	_100("100"),
	delete("delete"),
	full("full");

	final String value;

	OvhMxPlanEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
