package net.minidev.ovh.api.billing;

/**
 * Reusable payment mean type
 */
public enum OvhReusablePaymentMeanEnum {
	bankAccount("bankAccount"),
	creditCard("creditCard"),
	fidelityAccount("fidelityAccount"),
	ovhAccount("ovhAccount"),
	paypal("paypal");

	final String value;

	OvhReusablePaymentMeanEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
