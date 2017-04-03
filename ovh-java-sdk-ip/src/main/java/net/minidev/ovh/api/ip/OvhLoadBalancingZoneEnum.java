package net.minidev.ovh.api.ip;

/**
 * Possible values for load balancing IP service location
 */
public enum OvhLoadBalancingZoneEnum {
	bhs("bhs"),
	gra("gra"),
	rbx("rbx"),
	sbg("sbg");

	final String value;

	OvhLoadBalancingZoneEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
