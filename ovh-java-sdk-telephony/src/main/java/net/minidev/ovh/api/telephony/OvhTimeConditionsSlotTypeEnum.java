package net.minidev.ovh.api.telephony;

/**
 * Type of slot
 */
public enum OvhTimeConditionsSlotTypeEnum {
	number("number"),
	voicemail("voicemail");

	final String value;

	OvhTimeConditionsSlotTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
