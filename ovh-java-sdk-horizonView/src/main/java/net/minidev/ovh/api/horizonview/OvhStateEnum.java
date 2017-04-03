package net.minidev.ovh.api.horizonview;

/**
 * All states a dedicated horizon  can be in
 */
public enum OvhStateEnum {
	available("available"),
	creating("creating"),
	delivered("delivered"),
	disabled("disabled"),
	error("error"),
	reserved("reserved");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
