package net.minidev.ovh.api.telephony;

/**
 * Available quality for fax documents
 */
public enum OvhFaxQualityEnum {
	best("best"),
	high("high"),
	normal("normal");

	final String value;

	OvhFaxQualityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
