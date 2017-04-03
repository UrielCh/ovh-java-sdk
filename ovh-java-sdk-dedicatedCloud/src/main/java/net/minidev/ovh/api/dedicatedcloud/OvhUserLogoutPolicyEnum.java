package net.minidev.ovh.api.dedicatedcloud;

/**
 * Which user will be disconnected first in case of quota of maximum connection is reached
 */
public enum OvhUserLogoutPolicyEnum {
	first("first"),
	last("last");

	final String value;

	OvhUserLogoutPolicyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
