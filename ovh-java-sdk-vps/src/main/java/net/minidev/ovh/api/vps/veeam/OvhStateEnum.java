package net.minidev.ovh.api.vps.veeam;

/**
 * A structure describing a Veeam restored backup's state
 */
public enum OvhStateEnum {
	mounted("mounted"),
	restoring("restoring"),
	unmounted("unmounted"),
	unmounting("unmounting");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
