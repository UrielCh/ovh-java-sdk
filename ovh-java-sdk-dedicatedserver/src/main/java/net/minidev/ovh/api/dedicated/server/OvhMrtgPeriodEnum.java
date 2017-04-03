package net.minidev.ovh.api.dedicated.server;

/**
 * distincts MRTG period
 */
public enum OvhMrtgPeriodEnum {
	daily("daily"),
	hourly("hourly"),
	monthly("monthly"),
	weekly("weekly"),
	yearly("yearly");

	final String value;

	OvhMrtgPeriodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
