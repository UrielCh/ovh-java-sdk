package net.minidev.ovh.api.domain;

/**
 * Possible values for status domain
 */
public enum OvhDomainStatusEnum {
	close("close"),
	ok("ok"),
	readOnly("readOnly"),
	unknown("unknown");

	final String value;

	OvhDomainStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
