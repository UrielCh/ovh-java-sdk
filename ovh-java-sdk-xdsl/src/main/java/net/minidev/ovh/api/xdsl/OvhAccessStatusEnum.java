package net.minidev.ovh.api.xdsl;

/**
 * Status of the access
 */
public enum OvhAccessStatusEnum {
	active("active"),
	cancelled("cancelled"),
	close("close"),
	deleting("deleting"),
	doing("doing"),
	migration("migration"),
	slamming("slamming"),
	upgradeOffer("upgradeOffer");

	final String value;

	OvhAccessStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
