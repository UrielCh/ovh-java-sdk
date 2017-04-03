package net.minidev.ovh.api.nichandle.accessrestriction;

/**
 * Status of TOTP account
 */
public enum OvhTOTPStatusEnum {
	disabled("disabled"),
	enabled("enabled"),
	needCodeValidation("needCodeValidation"),
	needEmailValidation("needEmailValidation");

	final String value;

	OvhTOTPStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
