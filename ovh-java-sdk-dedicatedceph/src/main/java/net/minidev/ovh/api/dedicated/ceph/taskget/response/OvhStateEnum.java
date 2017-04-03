package net.minidev.ovh.api.dedicated.ceph.taskget.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * State of task
 */
public enum OvhStateEnum {
	@JsonProperty("IN PROGRESS")
	IN_PROGRESS("IN PROGRESS"),
	DONE("DONE"),
	FAILED("FAILED");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
