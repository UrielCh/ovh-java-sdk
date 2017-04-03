package net.minidev.ovh.api.dedicated.housing;

/**
 * Housing bay datacenters
 */
public enum OvhDatacenterEnum {
	gsw("gsw"),
	pdc1("pdc1");

	final String value;

	OvhDatacenterEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
