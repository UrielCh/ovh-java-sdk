package net.minidev.ovh.api.telephony;

/**
 * Status of the agent
 */
public enum OvhOvhPabxHuntingAgentStatusEnum {
	available("available"),
	loggedOut("loggedOut"),
	onBreak("onBreak");

	final String value;

	OvhOvhPabxHuntingAgentStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
