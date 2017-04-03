package net.minidev.ovh.api.registry.user;

/**
 * The status of the user
 */
public enum OvhStatus {
	DELETING("DELETING"),
	DEPLOYING("DEPLOYING"),
	ERROR("ERROR"),
	OK("OK");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
