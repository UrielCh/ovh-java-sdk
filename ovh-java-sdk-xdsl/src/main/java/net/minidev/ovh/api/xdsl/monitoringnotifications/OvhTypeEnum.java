package net.minidev.ovh.api.xdsl.monitoringnotifications;

/**
 * Type of notification.
 */
public enum OvhTypeEnum {
	mail("mail"),
	sms("sms");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
