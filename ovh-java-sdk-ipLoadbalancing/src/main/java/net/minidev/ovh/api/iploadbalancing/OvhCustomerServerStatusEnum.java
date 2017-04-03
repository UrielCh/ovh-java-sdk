package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for server status
 */
public enum OvhCustomerServerStatusEnum {
	active("active"),
	inactive("inactive");

	final String value;

	OvhCustomerServerStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
