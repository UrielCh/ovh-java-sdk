package net.minidev.ovh.api.msservices;

/**
 * Active Directory UPN Suffix State
 */
public enum OvhUPNStateEnum {
	creating("creating"),
	deleting("deleting"),
	ok("ok");

	final String value;

	OvhUPNStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
