package net.minidev.ovh.api.cloud.usage;

/**
 * PaymentTypeEnum
 */
public enum OvhPaymentTypeEnum {
	pre("pre"),
	post("post");

	final String value;

	OvhPaymentTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
