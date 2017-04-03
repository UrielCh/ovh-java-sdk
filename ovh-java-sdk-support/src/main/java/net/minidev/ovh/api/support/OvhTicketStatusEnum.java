package net.minidev.ovh.api.support;

/**
 * Support ticket statuses
 */
public enum OvhTicketStatusEnum {
	closed("closed"),
	open("open"),
	unknown("unknown");

	final String value;

	OvhTicketStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
