package net.minidev.ovh.api.hosting.web.mail;

/**
 * Types of action you can request for your mail
 */
public enum OvhActionEnum {
	BLOCK("BLOCK"),
	PURGE("PURGE"),
	UNBLOCK("UNBLOCK");

	final String value;

	OvhActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
