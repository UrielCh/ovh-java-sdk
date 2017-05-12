package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for ServiceStateEnum
 */
public enum OvhServiceStateEnum {
	INIT("INIT"),
	ENABLED("ENABLED"),
	DISABLED("DISABLED");

	final String value;

	OvhServiceStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
