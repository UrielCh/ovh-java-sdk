package net.minidev.ovh.api.dedicatedcloud.vlan;

/**
 * All states a Dedicated Cloud Vlan can be in
 */
public enum OvhStateEnum {
	available("available"),
	delivered("delivered"),
	disabled("disabled"),
	error("error"),
	removing("removing"),
	reserved("reserved");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
