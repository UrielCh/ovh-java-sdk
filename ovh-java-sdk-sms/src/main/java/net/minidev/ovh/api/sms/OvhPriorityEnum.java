package net.minidev.ovh.api.sms;

/**
 * The priority of an sms sending
 */
public enum OvhPriorityEnum {
	high("high"),
	low("low"),
	medium("medium"),
	veryLow("veryLow");

	final String value;

	OvhPriorityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
