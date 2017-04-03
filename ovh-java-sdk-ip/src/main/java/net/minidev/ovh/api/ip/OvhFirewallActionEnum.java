package net.minidev.ovh.api.ip;

/**
 * Possible values for action
 */
public enum OvhFirewallActionEnum {
	deny("deny"),
	permit("permit");

	final String value;

	OvhFirewallActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
