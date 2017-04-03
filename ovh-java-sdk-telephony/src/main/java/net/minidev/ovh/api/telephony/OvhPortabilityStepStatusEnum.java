package net.minidev.ovh.api.telephony;

/**
 * List of possible status of a step
 */
public enum OvhPortabilityStepStatusEnum {
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	hold("hold"),
	todo("todo");

	final String value;

	OvhPortabilityStepStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
