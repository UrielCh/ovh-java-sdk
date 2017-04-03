package net.minidev.ovh.api.dedicatedcloud;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Hypervisor version of this Dedicated Cloud component
 */
public enum OvhHypervisorVersionEnum {
	@JsonProperty("4.1")
	_4_1("4.1"),
	@JsonProperty("5.0")
	_5_0("5.0"),
	@JsonProperty("5.1")
	_5_1("5.1"),
	@JsonProperty("5.5")
	_5_5("5.5"),
	@JsonProperty("6.0")
	_6_0("6.0"),
	@JsonProperty("6.5")
	_6_5("6.5"),
	@JsonProperty("hv3.1")
	hv3_1("hv3.1"),
	@JsonProperty("hvdc3.1")
	hvdc3_1("hvdc3.1"),
	@JsonProperty("nc1.0")
	nc1_0("nc1.0");

	final String value;

	OvhHypervisorVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
