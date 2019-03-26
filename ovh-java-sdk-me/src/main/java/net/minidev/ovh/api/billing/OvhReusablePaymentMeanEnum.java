package net.minidev.ovh.api.billing;

/**
 * Reusable payment mean type
 */
public enum OvhReusablePaymentMeanEnum {
	CREDIT_CARD("CREDIT_CARD"),
	ENTERPRISE("ENTERPRISE"),
	INTERNAL_TRUSTED_ACCOUNT("INTERNAL_TRUSTED_ACCOUNT"),
	PAYPAL("PAYPAL"),
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
