package net.minidev.ovh.api.dedicated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The datacenter
 */
public enum OvhAvailabilityDatacenterEnum {
	bhs("bhs"),
	@JsonProperty("default")
	_default("default"),
	gra("gra"),
	rbx("rbx"),
	sbg("sbg");

	final String value;

	OvhAvailabilityDatacenterEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
