package net.minidev.ovh.api.paas.database.task;

/**
 * Task status
 */
public enum OvhStatus {
	CANCELLED("CANCELLED"),
	DOING("DOING"),
	DONE("DONE"),
	ERROR("ERROR"),
	TODO("TODO");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
