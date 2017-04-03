package net.minidev.ovh.api.sms;

/**
 * The sms class of sms sending job
 */
public enum OvhClassEnum {
	flash("flash"),
	phoneDisplay("phoneDisplay"),
	sim("sim"),
	toolkit("toolkit");

	final String value;

	OvhClassEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
