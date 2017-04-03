package net.minidev.ovh.api.deskaas;

/**
 * All states a Desktop As A Service can be in
 */
public enum OvhStateEnum {
	available("available"),
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
