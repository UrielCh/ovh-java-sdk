package net.minidev.ovh.api.dedicatedcloud;

/**
 * Open or restricted access to management interface ?
 */
public enum OvhUserAccessPolicyEnum {
	filtered("filtered"),
	open("open");

	final String value;

	OvhUserAccessPolicyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
