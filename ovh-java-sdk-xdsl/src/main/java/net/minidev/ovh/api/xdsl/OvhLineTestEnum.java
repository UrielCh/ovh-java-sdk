package net.minidev.ovh.api.xdsl;

/**
 * Line tests results
 */
public enum OvhLineTestEnum {
	actionPending("actionPending"),
	customerSideProblem("customerSideProblem"),
	error("error"),
	noProblem("noProblem"),
	ovhSideProblem("ovhSideProblem");

	final String value;

	OvhLineTestEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
