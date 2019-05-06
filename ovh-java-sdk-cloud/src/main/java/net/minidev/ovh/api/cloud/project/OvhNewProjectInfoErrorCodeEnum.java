package net.minidev.ovh.api.cloud.project;

/**
 * Possible values for error code on project creation
 */
public enum OvhNewProjectInfoErrorCodeEnum {
	accountNotEligible("accountNotEligible"),
	invalidPaymentMean("invalidPaymentMean"),
	maxProjectsLimitReached("maxProjectsLimitReached"),
	paypalAccountNotVerified("paypalAccountNotVerified"),
	unpaidDebts("unpaidDebts");

	final String value;

	OvhNewProjectInfoErrorCodeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
