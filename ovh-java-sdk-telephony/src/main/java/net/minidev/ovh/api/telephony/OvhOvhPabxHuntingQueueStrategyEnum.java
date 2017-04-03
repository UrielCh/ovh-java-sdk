package net.minidev.ovh.api.telephony;

/**
 * Calls dispatching startegy
 */
public enum OvhOvhPabxHuntingQueueStrategyEnum {
	cumulationByAgentOrder("cumulationByAgentOrder"),
	longestHangupAgent("longestHangupAgent"),
	longestIdleAgent("longestIdleAgent"),
	random("random"),
	ringAll("ringAll"),
	roundRobin("roundRobin"),
	sequentiallyByAgentOrder("sequentiallyByAgentOrder");

	final String value;

	OvhOvhPabxHuntingQueueStrategyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
