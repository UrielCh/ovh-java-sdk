package net.minidev.ovh.api.billing.paymentmethod;

/**
 * List of payment type enum
 */
public enum OvhPaymentTypeEnum {
	BANK_ACCOUNT("BANK_ACCOUNT"),
	CREDIT_CARD("CREDIT_CARD"),
	DEFERRED_PAYMENT_ACCOUNT("DEFERRED_PAYMENT_ACCOUNT"),
	ENTERPRISE("ENTERPRISE"),
	INTERNAL_TRUSTED_ACCOUNT("INTERNAL_TRUSTED_ACCOUNT"),
	PAYPAL("PAYPAL");

	final String value;

	OvhPaymentTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
