package net.minidev.ovh.api.email.exchange;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Exchange commercial version
 */
public enum OvhExchangeCommercialVersionEnum {
	@JsonProperty("2010")
	_2010("2010"),
	@JsonProperty("2013")
	_2013("2013"),
	@JsonProperty("2016")
	_2016("2016");

	final String value;

	OvhExchangeCommercialVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
