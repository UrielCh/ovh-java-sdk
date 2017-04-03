package net.minidev.ovh.api.dedicatedcloud.vlan;

/**
 * This Dedicated Cloud vlan type
 */
public enum OvhTypeEnum {
	admin("admin"),
	free("free"),
	paid("paid");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
