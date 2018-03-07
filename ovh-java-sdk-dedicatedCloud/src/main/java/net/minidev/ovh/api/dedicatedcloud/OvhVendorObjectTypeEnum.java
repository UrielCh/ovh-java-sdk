package net.minidev.ovh.api.dedicatedcloud;

/**
 * Dedicated Cloud vendors objects types
 */
public enum OvhVendorObjectTypeEnum {
	cluster("cluster"),
	datacenter("datacenter"),
	filer("filer"),
	host("host"),
	vm("vm");

	final String value;

	OvhVendorObjectTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
