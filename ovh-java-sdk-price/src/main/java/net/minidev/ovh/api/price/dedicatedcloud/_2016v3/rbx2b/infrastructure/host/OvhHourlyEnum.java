package net.minidev.ovh.api.price.dedicatedcloud._2016v3.rbx2b.infrastructure.host;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Hourlys
 */
public enum OvhHourlyEnum {
	L("L"),
	@JsonProperty("L+")
	LPlus("L+"),
	M("M"),
	XL("XL"),
	@JsonProperty("XL+")
	XLPlus("XL+");

	final String value;

	OvhHourlyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
