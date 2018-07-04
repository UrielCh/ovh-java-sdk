package net.minidev.ovh.api.telephony;

/**
 * Type of the agent
 */
public enum OvhOvhPabxHuntingAgentTypeEnum {
	external("external"),
	internal("internal");

	final String value;

	OvhOvhPabxHuntingAgentTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
