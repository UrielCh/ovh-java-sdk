package net.minidev.ovh.api.telephony;

/**
 * Available timeframes for statistics
 */
public enum OvhStatisticsTimeframeEnum {
	daily("daily"),
	hourly("hourly"),
	monthly("monthly"),
	weekly("weekly"),
	yearly("yearly");

	final String value;

	OvhStatisticsTimeframeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
