package net.minidev.ovh.api.domain;

/**
 * DNS server state
 */
public enum OvhDomainNsStateEnum {
	ko("ko"),
	ok("ok");

	final String value;

	OvhDomainNsStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
