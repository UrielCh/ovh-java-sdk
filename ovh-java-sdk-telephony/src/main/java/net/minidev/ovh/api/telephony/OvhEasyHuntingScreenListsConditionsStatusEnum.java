package net.minidev.ovh.api.telephony;

/**
 * Screenlist condition type
 */
public enum OvhEasyHuntingScreenListsConditionsStatusEnum {
	disabled("disabled"),
	incomingBlackList("incomingBlackList"),
	incomingWhiteList("incomingWhiteList");

	final String value;

	OvhEasyHuntingScreenListsConditionsStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
