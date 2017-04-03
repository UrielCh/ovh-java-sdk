package net.minidev.ovh.api.ip;

/**
 * Possible values for TCP option - only for TCP protocol
 */
public enum OvhFirewallTCPOptionEnum {
	established("established"),
	syn("syn");

	final String value;

	OvhFirewallTCPOptionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
