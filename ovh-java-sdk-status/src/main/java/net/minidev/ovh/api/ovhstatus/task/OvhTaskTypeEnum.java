package net.minidev.ovh.api.ovhstatus.task;

/**
 * Description not available
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
