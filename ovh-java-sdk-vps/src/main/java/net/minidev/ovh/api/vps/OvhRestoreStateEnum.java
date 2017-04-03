package net.minidev.ovh.api.vps;

/**
 * Available restore state
 */
public enum OvhRestoreStateEnum {
	available("available"),
	restored("restored"),
	restoring("restoring");

	final String value;

	OvhRestoreStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
