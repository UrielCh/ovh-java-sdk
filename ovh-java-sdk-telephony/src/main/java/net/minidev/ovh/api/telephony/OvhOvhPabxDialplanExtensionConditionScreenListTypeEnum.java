package net.minidev.ovh.api.telephony;

/**
 * Screenlist condition type
 */
public enum OvhOvhPabxDialplanExtensionConditionScreenListTypeEnum {
	destinationBlackList("destinationBlackList"),
	destinationWhiteList("destinationWhiteList"),
	incomingBlackList("incomingBlackList"),
	incomingWhiteList("incomingWhiteList");

	final String value;

	OvhOvhPabxDialplanExtensionConditionScreenListTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
