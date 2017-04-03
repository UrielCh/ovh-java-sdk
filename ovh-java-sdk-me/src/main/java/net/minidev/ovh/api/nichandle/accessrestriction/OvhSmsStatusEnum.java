package net.minidev.ovh.api.nichandle.accessrestriction;

/**
 * Status of the Sms account
 */
public enum OvhSmsStatusEnum {
	disabled("disabled"),
	enabled("enabled"),
	needCodeValidation("needCodeValidation"),
	needEmailValidation("needEmailValidation");

	final String value;

	OvhSmsStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
