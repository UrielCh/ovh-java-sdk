package net.minidev.ovh.api.billing.paymentmethod;

/**
 * List of payment sub type enum
 */
public enum OvhPaymentSubTypeEnum {
	AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
	MASTERCARD("MASTERCARD"),
	VISA("VISA");

	final String value;

	OvhPaymentSubTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
