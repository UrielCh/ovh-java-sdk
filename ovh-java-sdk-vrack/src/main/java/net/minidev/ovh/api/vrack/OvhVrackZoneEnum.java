package net.minidev.ovh.api.vrack;

/**
 * Possible values for vrack zone
 */
public enum OvhVrackZoneEnum {
	bhs("bhs"),
	fra1("fra1"),
	gra("gra"),
	lon1("lon1"),
	pdx1("pdx1"),
	rbx("rbx"),
	sbg("sbg"),
	sgp1("sgp1"),
	syd1("syd1"),
	was1("was1"),
	waw("waw");

	final String value;

	OvhVrackZoneEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
