package net.minidev.ovh.api.telephony;

/**
 * Calls dispatching startegy
 */
public enum OvhEasyMiniPabxHuntingStrategyEnum {
	cyclic("cyclic"),
	leastIdleSinceLastCall("leastIdleSinceLastCall"),
	linear("linear"),
	mostIdleSinceLastCall("mostIdleSinceLastCall"),
	mostIdleSinceLogging("mostIdleSinceLogging"),
	parallel("parallel"),
	random("random");

	final String value;

	OvhEasyMiniPabxHuntingStrategyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
