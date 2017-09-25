package net.minidev.ovh.api.telephony;

/**
 * Day of the time condition
 */
public enum OvhTimeConditionsDayEnum {
	friday("friday"),
	holiday("holiday"),
	monday("monday"),
	saturday("saturday"),
	sunday("sunday"),
	thursday("thursday"),
	tuesday("tuesday"),
	wednesday("wednesday");

	final String value;

	OvhTimeConditionsDayEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
