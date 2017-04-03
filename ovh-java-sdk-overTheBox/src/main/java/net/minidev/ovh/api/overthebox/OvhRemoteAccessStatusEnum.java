package net.minidev.ovh.api.overthebox;

/**
 * Status of the remote access.
 */
public enum OvhRemoteAccessStatusEnum {
	active("active"),
	creating("creating"),
	deleted("deleted"),
	deleting("deleting"),
	pendingValidation("pendingValidation"),
	toDelete("toDelete");

	final String value;

	OvhRemoteAccessStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
