package net.minidev.ovh.api.sms;

/**
 * Response type
 */
public enum OvhResponseTypeEnum {
	cgi("cgi"),
	none("none"),
	text("text");

	final String value;

	OvhResponseTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
