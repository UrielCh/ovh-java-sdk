package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for server status
 */
public enum OvhBackendCustomerServerStatusEnum {
	active("active"),
	inactive("inactive");

	final String value;

	OvhBackendCustomerServerStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
