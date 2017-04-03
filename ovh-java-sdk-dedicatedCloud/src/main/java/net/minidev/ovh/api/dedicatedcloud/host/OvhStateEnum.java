package net.minidev.ovh.api.dedicatedcloud.host;

/**
 * All states a Dedicated Cloud Host can be in
 */
public enum OvhStateEnum {
	adding("adding"),
	delivered("delivered"),
	error("error"),
	removing("removing"),
	unknown("unknown");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
