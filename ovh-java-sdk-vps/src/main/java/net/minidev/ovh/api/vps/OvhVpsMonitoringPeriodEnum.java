package net.minidev.ovh.api.vps;

/**
 * Available periods for the VPS monitoring
 */
public enum OvhVpsMonitoringPeriodEnum {
	lastday("lastday"),
	lastmonth("lastmonth"),
	lastweek("lastweek"),
	lastyear("lastyear"),
	today("today");

	final String value;

	OvhVpsMonitoringPeriodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
