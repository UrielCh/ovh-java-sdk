package net.minidev.ovh.api.dedicated.server;

/**
 * Firewall model name
 */
public enum OvhFirewallModelEnum {
	asa5505("asa5505"),
	asa5510("asa5510"),
	asa5520("asa5520");

	final String value;

	OvhFirewallModelEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
