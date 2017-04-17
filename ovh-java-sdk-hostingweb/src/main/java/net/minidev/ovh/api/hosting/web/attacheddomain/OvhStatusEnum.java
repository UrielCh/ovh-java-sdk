package net.minidev.ovh.api.hosting.web.attacheddomain;

/**
 * AttachedDomain status
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
