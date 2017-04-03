package net.minidev.ovh.api.overthebox;

/**
 * Status of the service.
 */
public enum OvhServiceStatusEnum {
	active("active"),
	creating("creating"),
	deleted("deleted"),
	suspended("suspended"),
	toCreate("toCreate"),
	toDelete("toDelete");

	final String value;

	OvhServiceStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
