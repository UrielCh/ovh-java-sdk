package net.minidev.ovh.api.vps;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All versions that VPS can have
 */
public enum OvhVpsVersionEnum {
	@JsonProperty("2013v1")
	_2013v1("2013v1"),
	@JsonProperty("2014v1")
	_2014v1("2014v1"),
	@JsonProperty("2015v1")
	_2015v1("2015v1"),
	@JsonProperty("2017v1")
	_2017v1("2017v1");

	final String value;

	OvhVpsVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
