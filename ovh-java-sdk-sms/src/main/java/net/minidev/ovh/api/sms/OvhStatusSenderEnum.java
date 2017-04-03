package net.minidev.ovh.api.sms;

/**
 * All existing status for a given referer
 */
public enum OvhStatusSenderEnum {
	disable("disable"),
	enable("enable"),
	refused("refused"),
	waitingValidation("waitingValidation");

	final String value;

	OvhStatusSenderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
