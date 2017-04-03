package net.minidev.ovh.api.hosting.web.mail;

/**
 * Mail state enum
 */
public enum OvhStateEnum {
	bounce("bounce"),
	force("force"),
	ko("ko"),
	ok("ok"),
	purging("purging"),
	spam("spam");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
