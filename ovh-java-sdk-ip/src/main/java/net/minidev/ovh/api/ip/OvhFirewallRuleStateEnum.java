package net.minidev.ovh.api.ip;

/**
 * Possible values for firewall rule state
 */
public enum OvhFirewallRuleStateEnum {
	creationPending("creationPending"),
	ok("ok"),
	removalPending("removalPending");

	final String value;

	OvhFirewallRuleStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
