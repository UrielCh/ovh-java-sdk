package net.minidev.ovh.api.dedicated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The datacenter
 */
public enum OvhAvailabilityDatacenterEnum {
	bhs("bhs"),
	@JsonProperty("default")
	_default("default"),
	fra("fra"),
	gra("gra"),
	lon("lon"),
	rbx("rbx"),
	sbg("sbg"),
	sgp("sgp"),
	syd("syd"),
	vin("vin"),
	waw("waw");

	final String value;

	OvhAvailabilityDatacenterEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
