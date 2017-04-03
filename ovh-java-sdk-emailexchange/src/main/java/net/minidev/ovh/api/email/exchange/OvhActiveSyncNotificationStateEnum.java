package net.minidev.ovh.api.email.exchange;

/**
 * Subscription state
 */
public enum OvhActiveSyncNotificationStateEnum {
	creating("creating"),
	deleting("deleting"),
	ok("ok");

	final String value;

	OvhActiveSyncNotificationStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
