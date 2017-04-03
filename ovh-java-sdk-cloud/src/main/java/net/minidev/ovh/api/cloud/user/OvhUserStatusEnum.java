package net.minidev.ovh.api.cloud.user;

/**
 * UserStatusEnum
 */
public enum OvhUserStatusEnum {
	creating("creating"),
	ok("ok"),
	deleting("deleting"),
	deleted("deleted");

	final String value;

	OvhUserStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
