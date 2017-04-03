package net.minidev.ovh.api.telephony;

/**
 * Conference report receiver
 */
public enum OvhConferenceReportStatusEnum {
	customer("customer"),
	none("none"),
	other("other");

	final String value;

	OvhConferenceReportStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
