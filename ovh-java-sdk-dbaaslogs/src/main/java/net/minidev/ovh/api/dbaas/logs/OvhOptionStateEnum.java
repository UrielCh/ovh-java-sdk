package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for OptionStateEnum
 */
public enum OvhOptionStateEnum {
	ENABLED("ENABLED"),
	DISABLED("DISABLED");

	final String value;

	OvhOptionStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
