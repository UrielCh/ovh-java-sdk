package net.minidev.ovh.api.cloud.workflow;

/**
 * ExecutionStateEnum
 */
public enum OvhExecutionStateEnum {
	IDLE("IDLE"),
	RUNNING("RUNNING"),
	SUCCESS("SUCCESS"),
	ERROR("ERROR"),
	PAUSED("PAUSED");

	final String value;

	OvhExecutionStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
