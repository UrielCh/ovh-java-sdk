package net.minidev.ovh.api.dedicatedcloud.right;

/**
 * Determine how this user can act on the Dedicated Cloud vmNetwork
 */
public enum OvhVmNetworkRoleEnum {
	admin("admin"),
	noAccess("noAccess"),
	readonly("readonly");

	final String value;

	OvhVmNetworkRoleEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
