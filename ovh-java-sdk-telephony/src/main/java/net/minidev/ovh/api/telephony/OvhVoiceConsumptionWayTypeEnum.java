package net.minidev.ovh.api.telephony;

/**
 * Consumption way type
 */
public enum OvhVoiceConsumptionWayTypeEnum {
	incoming("incoming"),
	outgoing("outgoing"),
	transfer("transfer");

	final String value;

	OvhVoiceConsumptionWayTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
