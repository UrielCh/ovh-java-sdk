package net.minidev.ovh.api.dedicated.server;

/**
 *  Different netboot boot
 */
public enum OvhBootTypeEnum {
	harddisk("harddisk"),
	internal("internal"),
	ipxeCustomerScript("ipxeCustomerScript"),
	network("network"),
	rescue("rescue");

	final String value;

	OvhBootTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
