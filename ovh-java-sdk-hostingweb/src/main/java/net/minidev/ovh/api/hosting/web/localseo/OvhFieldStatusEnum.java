package net.minidev.ovh.api.hosting.web.localseo;

/**
 * Sync status of a location field
 */
public enum OvhFieldStatusEnum {
	MATCH("MATCH"),
	MISMATCH("MISMATCH"),
	MISSING("MISSING"),
	NOT_APPLICABLE("NOT_APPLICABLE"),
	PRESENT("PRESENT");

	final String value;

	OvhFieldStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
