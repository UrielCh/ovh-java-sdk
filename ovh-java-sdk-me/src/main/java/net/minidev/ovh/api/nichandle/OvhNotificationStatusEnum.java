package net.minidev.ovh.api.nichandle;

/**
 * Status of your notification
 */
public enum OvhNotificationStatusEnum {
	ok("ok"),
	waitingForValidation("waitingForValidation");

	final String value;

	OvhNotificationStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
