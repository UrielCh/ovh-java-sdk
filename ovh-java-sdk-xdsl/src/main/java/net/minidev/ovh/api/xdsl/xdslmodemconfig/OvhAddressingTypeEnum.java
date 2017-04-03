package net.minidev.ovh.api.xdsl.xdslmodemconfig;

/**
 * How the modem gets its LAN IP Address
 */
public enum OvhAddressingTypeEnum {
	DHCP("DHCP"),
	Static("Static");

	final String value;

	OvhAddressingTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
