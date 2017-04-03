package net.minidev.ovh.api.vrack;

/**
 * Possible values for vrack zone
 */
public enum OvhVrackZoneEnum {
	bhs("bhs"),
	gra("gra"),
	rbx("rbx"),
	sbg("sbg");

	final String value;

	OvhVrackZoneEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
