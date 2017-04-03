package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for load balancing balance algorithm
 */
public enum OvhBalanceHTTPEnum {
	first("first"),
	leastconn("leastconn"),
	roundrobin("roundrobin"),
	source("source"),
	uri("uri");

	final String value;

	OvhBalanceHTTPEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
