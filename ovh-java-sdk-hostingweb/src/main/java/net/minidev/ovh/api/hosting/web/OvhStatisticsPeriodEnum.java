package net.minidev.ovh.api.hosting.web;

/**
 * Available periods for statistics
 */
public enum OvhStatisticsPeriodEnum {
	daily("daily"),
	monthly("monthly"),
	weekly("weekly"),
	yearly("yearly");

	final String value;

	OvhStatisticsPeriodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
