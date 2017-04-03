package net.minidev.ovh.api.sms;

/**
 * The tracking media response
 */
public enum OvhResponseTrackingMediaEnum {
	email("email"),
	sms("sms"),
	voice("voice");

	final String value;

	OvhResponseTrackingMediaEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
