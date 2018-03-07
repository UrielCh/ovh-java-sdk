package net.minidev.ovh.api.hosting.web.localseo.account;

/**
 * Account status
 */
public enum OvhStatusEnum {
	created("created"),
	creating("creating"),
	deleting("deleting"),
	updating("updating");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
