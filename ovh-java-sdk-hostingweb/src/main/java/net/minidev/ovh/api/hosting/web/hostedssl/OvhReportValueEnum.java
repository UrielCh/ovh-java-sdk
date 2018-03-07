package net.minidev.ovh.api.hosting.web.hostedssl;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hostedssl report value
 */
public enum OvhReportValueEnum {
	completed("completed"),
	@JsonProperty("in-progress")
	in_progress("in-progress"),
	@JsonProperty("non-completed")
	non_completed("non-completed"),
	@JsonProperty("non-required")
	non_required("non-required"),
	@JsonProperty("not-applicable")
	not_applicable("not-applicable"),
	@JsonProperty("not-provided")
	not_provided("not-provided");

	final String value;

	OvhReportValueEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
