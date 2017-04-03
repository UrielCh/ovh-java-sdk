package net.minidev.ovh.api.xdsl;

/**
 * Periods for statistics.
 */
public enum OvhStatisticsPeriodEnum {
	daily("daily"),
	monthly("monthly"),
	preview("preview"),
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
