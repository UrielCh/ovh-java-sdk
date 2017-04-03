package net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.enterprise.host;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Monthlys
 */
public enum OvhMonthlyEnum {
	L("L"),
	@JsonProperty("L+")
	LPlus("L+"),
	M("M"),
	XL("XL"),
	@JsonProperty("XL+")
	XLPlus("XL+");

	final String value;

	OvhMonthlyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
