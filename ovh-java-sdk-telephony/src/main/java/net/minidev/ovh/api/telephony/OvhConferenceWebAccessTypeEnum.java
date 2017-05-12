package net.minidev.ovh.api.telephony;

/**
 * Webaccess type for your conference
 */
public enum OvhConferenceWebAccessTypeEnum {
	read("read"),
	write("write");

	final String value;

	OvhConferenceWebAccessTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
