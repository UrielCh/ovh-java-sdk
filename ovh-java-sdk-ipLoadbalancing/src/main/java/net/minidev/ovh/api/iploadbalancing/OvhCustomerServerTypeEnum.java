package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for server type
 */
public enum OvhCustomerServerTypeEnum {
	ipv4("ipv4"),
	ipv6("ipv6");

	final String value;

	OvhCustomerServerTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
