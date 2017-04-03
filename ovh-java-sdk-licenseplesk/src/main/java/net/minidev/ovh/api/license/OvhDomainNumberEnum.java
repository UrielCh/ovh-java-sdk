package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All quantities of domain available for a license
 */
public enum OvhDomainNumberEnum {
	@JsonProperty("0")
	_0("0"),
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("30")
	_30("30"),
	@JsonProperty("300")
	_300("300"),
	unlimited("unlimited");

	final String value;

	OvhDomainNumberEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
