package net.minidev.ovh.api.dedicated.server;

/**
 * Different option activated on netboot 
 */
public enum OvhBootOptionEnum {
	cpufamily("cpufamily"),
	grsec("grsec"),
	ipv6("ipv6"),
	smp("smp");

	final String value;

	OvhBootOptionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
