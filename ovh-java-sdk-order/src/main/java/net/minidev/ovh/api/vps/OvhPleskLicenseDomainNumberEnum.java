package net.minidev.ovh.api.vps;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain number the plesk license will be valid for
 */
public enum OvhPleskLicenseDomainNumberEnum {
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("300")
	_300("300"),
	hostingsuite("hostingsuite");

	final String value;

	OvhPleskLicenseDomainNumberEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
