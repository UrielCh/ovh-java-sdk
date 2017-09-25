package net.minidev.ovh.api.vip;

/**
 * Available universe for VIP service
 */
public enum OvhUniverseEnum {
	cloud("cloud"),
	dedicated("dedicated"),
	telecom("telecom"),
	web("web");

	final String value;

	OvhUniverseEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
