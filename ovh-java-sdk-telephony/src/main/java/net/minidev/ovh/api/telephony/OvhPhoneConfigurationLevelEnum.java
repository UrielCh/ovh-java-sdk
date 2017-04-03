package net.minidev.ovh.api.telephony;

/**
 * Phone Configuration level enum
 */
public enum OvhPhoneConfigurationLevelEnum {
	admin("admin"),
	expert("expert");

	final String value;

	OvhPhoneConfigurationLevelEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
