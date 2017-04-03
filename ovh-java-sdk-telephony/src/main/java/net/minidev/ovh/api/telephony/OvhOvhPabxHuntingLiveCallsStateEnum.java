package net.minidev.ovh.api.telephony;

/**
 * State of the call
 */
public enum OvhOvhPabxHuntingLiveCallsStateEnum {
	Answered("Answered"),
	Waiting("Waiting");

	final String value;

	OvhOvhPabxHuntingLiveCallsStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
