package net.minidev.ovh.api.hosting.privatedatabase;

/**
 * Available datacenters
 */
public enum OvhDatacenterEnum {
	gra1("gra1"),
	gra2("gra2"),
	p19("p19");

	final String value;

	OvhDatacenterEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
