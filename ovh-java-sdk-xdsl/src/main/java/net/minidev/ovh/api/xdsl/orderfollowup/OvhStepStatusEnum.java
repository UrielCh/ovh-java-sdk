package net.minidev.ovh.api.xdsl.orderfollowup;

/**
 * The status of an order step
 */
public enum OvhStepStatusEnum {
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo"),
	waitingCustomer("waitingCustomer");

	final String value;

	OvhStepStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
