package net.minidev.ovh.api.telephony;

/**
 * Status of the trunk's external displayed number
 */
public enum OvhTrunkExternalDisplayedNumberStatusEnum {
	enabled("enabled"),
	refused("refused"),
	toDelete("toDelete"),
	waitingValidation("waitingValidation");

	final String value;

	OvhTrunkExternalDisplayedNumberStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
