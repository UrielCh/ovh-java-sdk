package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Possible SELT test prelocalizations
 */
public enum OvhSeltPrelocEnum {
	CUST("CUST"),
	DSLAM("DSLAM"),
	LINE("LINE"),
	RE("RE");

	final String value;

	OvhSeltPrelocEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
