package net.minidev.ovh.api.ovhstatus.task;

/**
 * TaskImpactEnum
 */
public enum OvhTaskImpactEnum {
	partialUnavailability("partialUnavailability"),
	fullUnavailability("fullUnavailability"),
	downtime("downtime"),
	none("none"),
	unknown("unknown");

	final String value;

	OvhTaskImpactEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
