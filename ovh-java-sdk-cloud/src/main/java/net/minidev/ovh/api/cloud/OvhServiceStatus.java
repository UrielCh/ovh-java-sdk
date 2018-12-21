package net.minidev.ovh.api.cloud;

/**
 * Enum values for Status
 */
public enum OvhServiceStatus {
	UP("UP"),
	DOWN("DOWN");

	final String value;

	OvhServiceStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
