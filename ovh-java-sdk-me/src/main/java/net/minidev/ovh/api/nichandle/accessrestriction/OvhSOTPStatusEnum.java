package net.minidev.ovh.api.nichandle.accessrestriction;

/**
 * Status of SOTP account
 */
public enum OvhSOTPStatusEnum {
	disabled("disabled"),
	enabled("enabled"),
	needCodeValidation("needCodeValidation"),
	needEmailValidation("needEmailValidation");

	final String value;

	OvhSOTPStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
