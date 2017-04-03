package net.minidev.ovh.api.sms;

/**
 * The referer of the available sender
 */
public enum OvhSenderRefererEnum {
	domain("domain"),
	nichandle("nichandle");

	final String value;

	OvhSenderRefererEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
