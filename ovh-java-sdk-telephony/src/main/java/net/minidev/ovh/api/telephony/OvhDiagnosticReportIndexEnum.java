package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The index interval
 */
public enum OvhDiagnosticReportIndexEnum {
	@JsonProperty("2 days ago")
	_2_days_ago("2 days ago"),
	@JsonProperty("3 days ago")
	_3_days_ago("3 days ago"),
	today("today"),
	yesterday("yesterday");

	final String value;

	OvhDiagnosticReportIndexEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
