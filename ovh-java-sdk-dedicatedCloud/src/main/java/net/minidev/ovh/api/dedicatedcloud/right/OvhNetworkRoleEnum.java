package net.minidev.ovh.api.dedicatedcloud.right;

/**
 * Determine how this user can act on the Dedicated Cloud vLans or vxLans
 */
public enum OvhNetworkRoleEnum {
	admin("admin"),
	manager("manager"),
	noAccess("noAccess"),
	readonly("readonly");

	final String value;

	OvhNetworkRoleEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
