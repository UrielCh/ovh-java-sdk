package net.minidev.ovh.api.dedicatedcloud.backup;

/**
 * State of the backup job
 */
public enum OvhJobStateEnum {
	failed("failed"),
	running("running"),
	stopped("stopped"),
	stopping("stopping"),
	success("success"),
	unknown("unknown"),
	warning("warning");

	final String value;

	OvhJobStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
