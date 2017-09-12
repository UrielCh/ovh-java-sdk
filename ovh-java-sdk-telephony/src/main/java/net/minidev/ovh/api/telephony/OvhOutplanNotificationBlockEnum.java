package net.minidev.ovh.api.telephony;

/**
 * Type of line blocking on outplan notification
 */
public enum OvhOutplanNotificationBlockEnum {
	blockAllCalls("blockAllCalls"),
	blockIncomingCalls("blockIncomingCalls"),
	blockOutgoingCalls("blockOutgoingCalls"),
	none("none");

	final String value;

	OvhOutplanNotificationBlockEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
