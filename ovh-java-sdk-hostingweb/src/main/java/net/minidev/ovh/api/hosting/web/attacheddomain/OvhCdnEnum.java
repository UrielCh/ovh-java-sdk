package net.minidev.ovh.api.hosting.web.attacheddomain;

/**
 * Attached domain cdn enum
 */
public enum OvhCdnEnum {
	active("active"),
	none("none");

	final String value;

	OvhCdnEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
