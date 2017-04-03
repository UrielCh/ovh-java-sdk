package net.minidev.ovh.api.billing;

/**
 * All the validation you may have to do
 */
public enum OvhPaymentMeanValidationType {
	creditAccount("creditAccount"),
	documentToSend("documentToSend"),
	simpleValidation("simpleValidation");

	final String value;

	OvhPaymentMeanValidationType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
