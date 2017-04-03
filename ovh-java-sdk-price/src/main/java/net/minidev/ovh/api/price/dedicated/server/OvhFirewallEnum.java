package net.minidev.ovh.api.price.dedicated.server;

/**
 * Enum of Firewalls
 */
public enum OvhFirewallEnum {
	asa5505("asa5505"),
	asa5510("asa5510"),
	asa5520("asa5520");

	final String value;

	OvhFirewallEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
