package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Types of statistics available for a line.
 */
public enum OvhLineNotificationsLogsFrequencyEnum {
	Never("Never"),
	@JsonProperty("Once a day")
	Once_a_day("Once a day"),
	@JsonProperty("Twice a day")
	Twice_a_day("Twice a day");

	final String value;

	OvhLineNotificationsLogsFrequencyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
