package net.minidev.ovh.api.email.exchange;

/**
 * Level of access to calendar of Resource Mailbox
 */
public enum OvhShowMeetingDetailsEnum {
	availabilityOnly("availabilityOnly"),
	limitedDetails("limitedDetails"),
	reviewer("reviewer");

	final String value;

	OvhShowMeetingDetailsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
