package net.minidev.ovh.api.ovhstatus.task;

/**
 * TaskStatusEnum
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
