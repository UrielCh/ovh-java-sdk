package net.minidev.ovh.api.pack.xdsl;

/**
 * Domain action
 */
public enum OvhDomainActionEnum {
	create("create"),
	trade("trade"),
	transfer("transfer");

	final String value;

	OvhDomainActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
