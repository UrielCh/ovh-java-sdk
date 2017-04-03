package net.minidev.ovh.api.dedicated.server;

/**
 * distincts RTM charts period
 */
public enum OvhRtmChartPeriodEnum {
	daily("daily"),
	monthly("monthly"),
	weekly("weekly"),
	yearly("yearly");

	final String value;

	OvhRtmChartPeriodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
