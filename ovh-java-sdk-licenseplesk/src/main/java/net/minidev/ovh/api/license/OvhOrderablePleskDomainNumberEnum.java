package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All domain available for Plesk products
 */
public enum OvhOrderablePleskDomainNumberEnum {
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("30")
	_30("30"),
	@JsonProperty("300")
	_300("300"),
	hostingsuite("hostingsuite"),
	unlimited("unlimited");

	final String value;

	OvhOrderablePleskDomainNumberEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
