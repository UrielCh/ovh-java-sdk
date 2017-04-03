package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for load balancing balance algorithm
 */
public enum OvhBalanceTCPEnum {
	first("first"),
	leastconn("leastconn"),
	roundrobin("roundrobin"),
	source("source");

	final String value;

	OvhBalanceTCPEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
