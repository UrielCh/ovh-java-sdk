package net.minidev.ovh.api.telephony;

/**
 * Tones type
 */
public enum OvhTonesTypeEnum {
	callWaiting("callWaiting"),
	endCall("endCall"),
	onHold("onHold"),
	ringback("ringback");

	final String value;

	OvhTonesTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
