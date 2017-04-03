package net.minidev.ovh.api.cloud.instance;

/**
 * MetricsPeriod
 */
public enum OvhMetricsPeriod {
	lastday("lastday"),
	lastmonth("lastmonth"),
	lastweek("lastweek"),
	lastyear("lastyear"),
	today("today");

	final String value;

	OvhMetricsPeriod(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
