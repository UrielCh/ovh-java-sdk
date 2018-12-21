package net.minidev.ovh.api.cloud;

/**
 * Enum values for Status
 */
public enum OvhRegionStatus {
	UP("UP"),
	DOWN("DOWN"),
	MAINTENANCE("MAINTENANCE");

	final String value;

	OvhRegionStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
