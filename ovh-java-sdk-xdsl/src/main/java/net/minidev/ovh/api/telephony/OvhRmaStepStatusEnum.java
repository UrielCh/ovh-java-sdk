package net.minidev.ovh.api.telephony;

/**
 * Status of the RMA step
 */
public enum OvhRmaStepStatusEnum {
	done("done"),
	todo("todo");

	final String value;

	OvhRmaStepStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
