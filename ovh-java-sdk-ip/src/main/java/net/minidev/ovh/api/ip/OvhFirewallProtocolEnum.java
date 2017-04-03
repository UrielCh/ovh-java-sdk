package net.minidev.ovh.api.ip;

/**
 * Possible values for protocol
 */
public enum OvhFirewallProtocolEnum {
	ah("ah"),
	esp("esp"),
	gre("gre"),
	icmp("icmp"),
	ipv4("ipv4"),
	tcp("tcp"),
	udp("udp");

	final String value;

	OvhFirewallProtocolEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
