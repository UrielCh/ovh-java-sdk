package net.minidev.ovh.api.hosting.web.ovhconfig;

/**
 * Hosting configuration firewall
 */
public enum OvhHttpFirewallEnum {
	none("none"),
	security("security");

	final String value;

	OvhHttpFirewallEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
