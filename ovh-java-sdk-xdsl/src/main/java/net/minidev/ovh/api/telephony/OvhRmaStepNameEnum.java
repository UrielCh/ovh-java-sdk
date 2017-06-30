package net.minidev.ovh.api.telephony;

/**
 * RMA step names
 */
public enum OvhRmaStepNameEnum {
	dispatchJustification("dispatchJustification"),
	equipmentSending("equipmentSending"),
	equipmentTesting("equipmentTesting"),
	opening("opening"),
	parcelReception("parcelReception"),
	parcelValidation("parcelValidation"),
	validation("validation");

	final String value;

	OvhRmaStepNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
