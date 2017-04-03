package net.minidev.ovh.api.agreements;

/**
 * The current state of a contract agreement
 */
public enum OvhAgreementStateEnum {
	ko("ko"),
	obsolete("obsolete"),
	ok("ok"),
	todo("todo");

	final String value;

	OvhAgreementStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
