package net.minidev.ovh.api.telephony;

/**
 * Policy of the time condition
 */
public enum OvhTimeConditionsPolicyEnum {
	available("available"),
	slot1("slot1"),
	slot2("slot2"),
	slot3("slot3");

	final String value;

	OvhTimeConditionsPolicyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
