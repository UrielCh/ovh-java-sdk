package net.minidev.ovh.api.paas.database.region;

/**
 * Region status
 */
public enum OvhStatus {
	available("available"),
	testing("testing"),
	unavailable("unavailable");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
