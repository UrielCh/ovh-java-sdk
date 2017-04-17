package net.minidev.ovh.api.hosting.web.cdn;

/**
 * Cdn status
 */
public enum OvhStatusEnum {
	created("created"),
	creating("creating"),
	deleting("deleting"),
	flushing("flushing");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
