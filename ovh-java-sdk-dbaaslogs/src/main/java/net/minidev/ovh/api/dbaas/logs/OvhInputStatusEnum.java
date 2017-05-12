package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for InputStatusEnum
 */
public enum OvhInputStatusEnum {
	INIT("INIT"),
	PENDING("PENDING"),
	RUNNING("RUNNING"),
	PROCESSING("PROCESSING");

	final String value;

	OvhInputStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
