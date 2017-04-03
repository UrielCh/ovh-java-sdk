package net.minidev.ovh.api.telephony;

/**
 * Consumption plan type
 */
public enum OvhVoiceConsumptionPlanTypeEnum {
	outplan("outplan"),
	priceplan("priceplan");

	final String value;

	OvhVoiceConsumptionPlanTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
