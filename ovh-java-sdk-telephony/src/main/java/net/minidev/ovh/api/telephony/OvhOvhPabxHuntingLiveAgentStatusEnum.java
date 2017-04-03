package net.minidev.ovh.api.telephony;

/**
 * Status of the agent
 */
public enum OvhOvhPabxHuntingLiveAgentStatusEnum {
	inAQueueCall("inAQueueCall"),
	loggedOut("loggedOut"),
	onBreak("onBreak"),
	receiving("receiving"),
	waiting("waiting");

	final String value;

	OvhOvhPabxHuntingLiveAgentStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
