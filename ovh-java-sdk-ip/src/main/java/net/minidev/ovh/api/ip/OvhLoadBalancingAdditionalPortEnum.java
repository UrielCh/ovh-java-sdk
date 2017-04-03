package net.minidev.ovh.api.ip;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional available ports for ip loadbalancing
 */
public enum OvhLoadBalancingAdditionalPortEnum {
	@JsonProperty("3306")
	_3306("3306"),
	@JsonProperty("443")
	_443("443"),
	@JsonProperty("5432")
	_5432("5432"),
	@JsonProperty("80")
	_80("80");

	final String value;

	OvhLoadBalancingAdditionalPortEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
