package net.minidev.ovh.api.sms;

/**
 * All typology of ptt duration
 */
public enum OvhPttDurationTypeEnum {
	indeterminated("indeterminated"),
	permanent("permanent"),
	temporary("temporary");

	final String value;

	OvhPttDurationTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
