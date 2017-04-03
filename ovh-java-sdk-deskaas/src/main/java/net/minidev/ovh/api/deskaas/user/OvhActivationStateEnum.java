package net.minidev.ovh.api.deskaas.user;

/**
 * All activation states a Dedicated Cloud User can have
 */
public enum OvhActivationStateEnum {
	disabled("disabled"),
	disabling("disabling"),
	enabled("enabled"),
	enabling("enabling"),
	toDisable("toDisable"),
	toEnable("toEnable");

	final String value;

	OvhActivationStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
