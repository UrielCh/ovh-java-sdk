package net.minidev.ovh.api.hosting.web.hostedssl;

/**
 * Hostedssl status
 */
public enum OvhStatusEnum {
	created("created"),
	creating("creating"),
	deleting("deleting"),
	importing("importing"),
	regenerating("regenerating");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
