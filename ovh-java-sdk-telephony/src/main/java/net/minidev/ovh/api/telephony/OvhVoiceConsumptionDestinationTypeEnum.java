package net.minidev.ovh.api.telephony;

/**
 * Consumption destination type
 */
public enum OvhVoiceConsumptionDestinationTypeEnum {
	landline("landline"),
	mobile("mobile"),
	special("special");

	final String value;

	OvhVoiceConsumptionDestinationTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
