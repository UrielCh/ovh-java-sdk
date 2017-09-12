package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  traffic orderable 
 */
public enum OvhTrafficOrderEnum {
	@JsonProperty("100Mbps-Unlimited")
	_100Mbps_Unlimited("100Mbps-Unlimited"),
	@JsonProperty("250Mbps-Unlimited")
	_250Mbps_Unlimited("250Mbps-Unlimited"),
	@JsonProperty("500Mbps-Unlimited")
	_500Mbps_Unlimited("500Mbps-Unlimited");

	final String value;

	OvhTrafficOrderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
