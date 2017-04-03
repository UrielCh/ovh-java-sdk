package net.minidev.ovh.api.sms;

/**
 * The media support used to be contacted in case of alert
 */
public enum OvhSupportEnum {
	both("both"),
	mail("mail"),
	sms("sms");

	final String value;

	OvhSupportEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
