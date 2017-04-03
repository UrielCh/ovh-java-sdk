package net.minidev.ovh.api.telephony;

/**
 * Policy of the time condition
 */
public enum OvhEasyHuntingTimeConditionsPolicyEnum {
	available("available"),
	slot1("slot1");

	final String value;

	OvhEasyHuntingTimeConditionsPolicyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
