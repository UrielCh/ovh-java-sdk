package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Possible SELT test status
 */
public enum OvhSeltStatusEnum {
	failed("failed"),
	notAvailable("notAvailable"),
	ok("ok");

	final String value;

	OvhSeltStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
