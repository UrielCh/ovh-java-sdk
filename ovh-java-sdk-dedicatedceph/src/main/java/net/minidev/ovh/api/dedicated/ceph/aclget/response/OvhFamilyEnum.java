package net.minidev.ovh.api.dedicated.ceph.aclget.response;

/**
 * Family of IP ACL
 */
public enum OvhFamilyEnum {
	IPV4("IPV4"),
	IPV6("IPV6");

	final String value;

	OvhFamilyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
