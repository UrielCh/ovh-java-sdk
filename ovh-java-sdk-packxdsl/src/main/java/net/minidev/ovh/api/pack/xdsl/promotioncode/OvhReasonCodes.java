package net.minidev.ovh.api.pack.xdsl.promotioncode;

/**
 * Reasons why the promotion code can not be generated
 */
public enum OvhReasonCodes {
	offerNotCompatible("offerNotCompatible"),
	serviceNotInOkState("serviceNotInOkState"),
	stillEngaged("stillEngaged"),
	taskInProgress("taskInProgress");

	final String value;

	OvhReasonCodes(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
