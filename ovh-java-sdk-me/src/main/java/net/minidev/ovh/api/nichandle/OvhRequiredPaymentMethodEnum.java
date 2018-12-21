package net.minidev.ovh.api.nichandle;

/**
 * Indicates the mandatory nature of having a valid payment method
 */
public enum OvhRequiredPaymentMethodEnum {
	mandatoryForAutorenew("mandatoryForAutorenew"),
	mandatoryForPostpaid("mandatoryForPostpaid"),
	notMandatory("notMandatory");

	final String value;

	OvhRequiredPaymentMethodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
