package net.minidev.ovh.api.telephony;

/**
 * Format of the notification mail. "html" will include a preview image of the fax
 */
public enum OvhFaxMailFormatEnum {
	html("html"),
	text("text");

	final String value;

	OvhFaxMailFormatEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
