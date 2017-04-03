package net.minidev.ovh.api.dedicated.server;

/**
 * SPLA license status
 */
public enum OvhSplaStatusEnum {
	terminated("terminated"),
	used("used"),
	waitingToCheck("waitingToCheck");

	final String value;

	OvhSplaStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
