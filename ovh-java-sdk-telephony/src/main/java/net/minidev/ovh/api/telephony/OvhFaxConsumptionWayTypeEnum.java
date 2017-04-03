package net.minidev.ovh.api.telephony;

/**
 * Consumption way type
 */
public enum OvhFaxConsumptionWayTypeEnum {
	received("received"),
	sent("sent");

	final String value;

	OvhFaxConsumptionWayTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
