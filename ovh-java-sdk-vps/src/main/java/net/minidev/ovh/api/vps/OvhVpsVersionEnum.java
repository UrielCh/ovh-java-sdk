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
	_2017v1("2017v1"),
	@JsonProperty("2017v2")
	_2017v2("2017v2"),
	@JsonProperty("2017v3")
	_2017v3("2017v3"),
	@JsonProperty("2018v1")
	_2018v1("2018v1"),
	@JsonProperty("2018v2")
	_2018v2("2018v2");

	final String value;

	OvhVpsVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
