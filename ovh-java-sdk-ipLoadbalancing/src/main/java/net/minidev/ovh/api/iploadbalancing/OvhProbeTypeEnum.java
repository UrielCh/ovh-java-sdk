package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for farm probe
 */
public enum OvhProbeTypeEnum {
	http("http"),
	internal("internal"),
	mysql("mysql"),
	oco("oco"),
	pgsql("pgsql"),
	smtp("smtp"),
	tcp("tcp");

	final String value;

	OvhProbeTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
