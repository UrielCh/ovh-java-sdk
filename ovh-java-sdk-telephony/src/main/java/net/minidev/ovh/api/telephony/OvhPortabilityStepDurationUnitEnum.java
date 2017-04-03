package net.minidev.ovh.api.telephony;

/**
 * List of possible duration unit. "NA" means that there is no defined duration
 */
public enum OvhPortabilityStepDurationUnitEnum {
	NA("NA"),
	day("day"),
	hour("hour"),
	openday("openday");

	final String value;

	OvhPortabilityStepDurationUnitEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
