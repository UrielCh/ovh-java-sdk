package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for InputStatus
 */
public enum OvhInputStatus {
	INIT("INIT"),
	PENDING("PENDING"),
	RUNNING("RUNNING"),
	PROCESSING("PROCESSING");

	final String value;

	OvhInputStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
