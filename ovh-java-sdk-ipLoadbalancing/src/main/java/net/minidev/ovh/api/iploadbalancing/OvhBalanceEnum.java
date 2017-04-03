package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for load balancing balance algorithm
 */
public enum OvhBalanceEnum {
	first("first"),
	leastconn("leastconn"),
	roundrobin("roundrobin"),
	source("source"),
	uri("uri");

	final String value;

	OvhBalanceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
