package net.minidev.ovh.api.cloud;

/**
 * Enum values for State
 */
public enum OvhExecutionState {
	IDLE("IDLE"),
	RUNNING("RUNNING"),
	SUCCESS("SUCCESS"),
	ERROR("ERROR"),
	PAUSED("PAUSED");

	final String value;

	OvhExecutionState(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
