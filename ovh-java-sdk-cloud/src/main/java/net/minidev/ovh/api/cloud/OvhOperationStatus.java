package net.minidev.ovh.api.cloud;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum values for Status
 */
public enum OvhOperationStatus {
	created("created"),
	@JsonProperty("in-progress")
	in_progress("in-progress"),
	completed("completed"),
	@JsonProperty("in-error")
	in_error("in-error"),
	unknown("unknown");

	final String value;

	OvhOperationStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
