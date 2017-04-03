package net.minidev.ovh.api.iploadbalancing;

/**
 * Route configuration status
 */
public enum OvhRouteStatusEnum {
	creating("creating"),
	deleting("deleting"),
	internal("internal"),
	ok("ok"),
	updating("updating");

	final String value;

	OvhRouteStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
