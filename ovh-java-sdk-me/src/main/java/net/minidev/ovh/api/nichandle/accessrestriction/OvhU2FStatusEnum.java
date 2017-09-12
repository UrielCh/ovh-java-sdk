package net.minidev.ovh.api.nichandle.accessrestriction;

/**
 * Status of U2F account
 */
public enum OvhU2FStatusEnum {
	disabled("disabled"),
	enabled("enabled"),
	needCodeValidation("needCodeValidation");

	final String value;

	OvhU2FStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
