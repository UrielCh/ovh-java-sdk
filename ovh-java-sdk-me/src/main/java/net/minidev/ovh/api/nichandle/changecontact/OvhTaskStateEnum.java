package net.minidev.ovh.api.nichandle.changecontact;

/**
 * State of contact change task
 */
public enum OvhTaskStateEnum {
	aborted("aborted"),
	checkValidity("checkValidity"),
	doing("doing"),
	done("done"),
	error("error"),
	expired("expired"),
	refused("refused"),
	todo("todo"),
	validatingByCustomers("validatingByCustomers");

	final String value;

	OvhTaskStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
