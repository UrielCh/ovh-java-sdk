package net.minidev.ovh.api.dedicatedcloud;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All available additional bandwidth amounts in Mbps
 */
public enum OvhAdditionalBandwidthEnum {
	@JsonProperty("1500")
	_1500("1500");

	final String value;

	OvhAdditionalBandwidthEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
