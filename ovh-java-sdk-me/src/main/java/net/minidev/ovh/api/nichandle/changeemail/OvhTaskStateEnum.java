package net.minidev.ovh.api.nichandle.changeemail;

/**
 * State of email change task
 */
public enum OvhTaskStateEnum {
	aborted("aborted"),
	done("done"),
	refused("refused"),
	todo("todo");

	final String value;

	OvhTaskStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
