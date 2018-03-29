package net.minidev.ovh.api.telephony;

/**
 * Offer task actions
 */
public enum OvhOfferTaskActionEnum {
	convertToAlias("convertToAlias"),
	convertToSip("convertToSip"),
	migrateToNewVoicemail("migrateToNewVoicemail"),
	removeSimltaneousLines("removeSimltaneousLines"),
	switchServer("switchServer"),
	termination("termination"),
	updateFirmware("updateFirmware"),
	upgrade("upgrade");

	final String value;

	OvhOfferTaskActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
