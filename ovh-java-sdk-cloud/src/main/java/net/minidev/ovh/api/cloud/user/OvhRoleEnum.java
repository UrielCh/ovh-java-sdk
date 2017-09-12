package net.minidev.ovh.api.cloud.user;

/**
 * RoleEnum
 */
public enum OvhRoleEnum {
	admin("admin"),
	authentication("authentication");

	final String value;

	OvhRoleEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
