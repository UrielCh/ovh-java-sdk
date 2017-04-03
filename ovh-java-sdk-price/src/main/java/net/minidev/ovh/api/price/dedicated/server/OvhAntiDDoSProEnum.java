package net.minidev.ovh.api.price.dedicated.server;

/**
 * Enum of AntiDDoSPros
 */
public enum OvhAntiDDoSProEnum {
	sk("sk");

	final String value;

	OvhAntiDDoSProEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
