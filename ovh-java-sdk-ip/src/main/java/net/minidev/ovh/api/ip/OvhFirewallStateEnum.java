package net.minidev.ovh.api.ip;

/**
 * Possible values for firewall ip state
 */
public enum OvhFirewallStateEnum {
	disableFirewallPending("disableFirewallPending"),
	enableFirewallPending("enableFirewallPending"),
	ok("ok");

	final String value;

	OvhFirewallStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
