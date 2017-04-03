package net.minidev.ovh.api.hosting.web.attacheddomain;

/**
 * Attached domain firewall enum
 */
public enum OvhFirewallEnum {
	active("active"),
	none("none");

	final String value;

	OvhFirewallEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
