package net.minidev.ovh.api.tsaas;

/**
 * Metric name
 */
public enum OvhMetricNameEnum {
	storage("storage"),
	input("input"),
	output("output");

	final String value;

	OvhMetricNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
