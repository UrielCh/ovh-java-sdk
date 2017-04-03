package net.minidev.ovh.api.iploadbalancing;

/**
 * List of possible route rule matches
 */
public enum OvhRouteRuleMatchesEnum {
	contains("contains"),
	endswith("endswith"),
	exists("exists"),
	in("in"),
	internal("internal"),
	is("is"),
	matches("matches"),
	startswith("startswith");

	final String value;

	OvhRouteRuleMatchesEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
