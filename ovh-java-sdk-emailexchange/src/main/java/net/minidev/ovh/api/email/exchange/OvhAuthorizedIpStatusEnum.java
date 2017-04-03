package net.minidev.ovh.api.email.exchange;

/**
 * Authorized IP State
 */
public enum OvhAuthorizedIpStatusEnum {
	creating("creating"),
	deleting("deleting"),
	ok("ok");

	final String value;

	OvhAuthorizedIpStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
