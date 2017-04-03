package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for load balancing IP state
 */
public enum OvhIpStateEnum {
	blacklisted("blacklisted"),
	deleted("deleted"),
	free("free"),
	ok("ok"),
	quarantined("quarantined"),
	suspended("suspended");

	final String value;

	OvhIpStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
