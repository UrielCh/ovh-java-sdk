package net.minidev.ovh.api.dedicatedcloud;

/**
 * The type of the network backing
 */
public enum OvhVmNetworkBackingTypeEnum {
	DVS("DVS"),
	VSS("VSS");

	final String value;

	OvhVmNetworkBackingTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
