package net.minidev.ovh.api.telephony;

/**
 * Day of the week
 */
public enum OvhOvhPabxDialplanExtensionConditionTimeWeekDayEnum {
	friday("friday"),
	monday("monday"),
	saturday("saturday"),
	sunday("sunday"),
	thursday("thursday"),
	tuesday("tuesday"),
	wednesday("wednesday");

	final String value;

	OvhOvhPabxDialplanExtensionConditionTimeWeekDayEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
