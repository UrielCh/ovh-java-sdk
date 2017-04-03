package net.minidev.ovh.api.cdnanycast;

/**
 * Period of the statistics
 */
public enum OvhStatsPeriodEnum {
	day("day"),
	month("month"),
	week("week");

	final String value;

	OvhStatsPeriodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
