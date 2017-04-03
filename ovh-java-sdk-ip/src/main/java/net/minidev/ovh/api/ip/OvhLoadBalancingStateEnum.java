package net.minidev.ovh.api.ip;

/**
 * Possible values for load balancing IP state
 */
public enum OvhLoadBalancingStateEnum {
	blacklisted("blacklisted"),
	deleted("deleted"),
	free("free"),
	ok("ok"),
	quarantined("quarantined"),
	suspended("suspended");

	final String value;

	OvhLoadBalancingStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
