package net.minidev.ovh.api.ovhstatus.task;

/**
 * TaskTypeEnum
 */
public enum OvhTaskTypeEnum {
	incident("incident"),
	maintenance("maintenance"),
	upgrade("upgrade");

	final String value;

	OvhTaskTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
