package net.minidev.ovh.api.dedicated.server;

/**
 * Dedicated server firewall mode
 */
public enum OvhFirewallModeEnum {
	routed("routed"),
	transparent("transparent");

	final String value;

	OvhFirewallModeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
