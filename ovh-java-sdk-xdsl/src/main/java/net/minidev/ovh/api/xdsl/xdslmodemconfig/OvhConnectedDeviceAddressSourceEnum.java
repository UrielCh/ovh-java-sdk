package net.minidev.ovh.api.xdsl.xdslmodemconfig;

/**
 * How did the device got its IP Address
 */
public enum OvhConnectedDeviceAddressSourceEnum {
	DHCP("DHCP"),
	Static("Static"),
	Unknown("Unknown");

	final String value;

	OvhConnectedDeviceAddressSourceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
