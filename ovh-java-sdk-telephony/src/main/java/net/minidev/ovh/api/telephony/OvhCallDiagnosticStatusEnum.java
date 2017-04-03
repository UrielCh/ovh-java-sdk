package net.minidev.ovh.api.telephony;

/**
 * Information extraction status
 */
public enum OvhCallDiagnosticStatusEnum {
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhCallDiagnosticStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
