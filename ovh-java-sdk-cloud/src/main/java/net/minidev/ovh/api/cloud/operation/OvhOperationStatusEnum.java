package net.minidev.ovh.api.cloud.operation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OperationStatusEnum
 */
public enum OvhOperationStatusEnum {
	created("created"),
	@JsonProperty("in-progress")
	in_progress("in-progress"),
	completed("completed"),
	@JsonProperty("in-error")
	in_error("in-error"),
	unknown("unknown");

	final String value;

	OvhOperationStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
