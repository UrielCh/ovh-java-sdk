package net.minidev.ovh.api.ovhstatus.task;

/**
 * Description not available
 */
public enum OvhTaskStatusEnum {
	planned("planned"),
	inProgress("inProgress"),
	finished("finished");

	final String value;

	OvhTaskStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
