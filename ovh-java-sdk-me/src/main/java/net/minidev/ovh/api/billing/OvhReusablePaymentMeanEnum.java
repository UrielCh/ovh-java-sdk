package net.minidev.ovh.api.billing;

/**
 * Reusable payment mean type
 */
public enum OvhReusablePaymentMeanEnum {
	fidelityAccount("fidelityAccount"),
	ovhAccount("ovhAccount");

	final String value;

	OvhReusablePaymentMeanEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
