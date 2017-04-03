package net.minidev.ovh.api.dedicated.server;

/**
 * Distinct type of virtual mac
 */
public enum OvhVmacTypeEnum {
	ovh("ovh"),
	vmware("vmware");

	final String value;

	OvhVmacTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
