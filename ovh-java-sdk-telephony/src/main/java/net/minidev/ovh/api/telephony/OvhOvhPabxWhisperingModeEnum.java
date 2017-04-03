package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whispering mode
 */
public enum OvhOvhPabxWhisperingModeEnum {
	@JsonProperty("Whisper to agent only")
	Whisper_to_agent_only("Whisper to agent only"),
	@JsonProperty("Whisper to all participants")
	Whisper_to_all_participants("Whisper to all participants");

	final String value;

	OvhOvhPabxWhisperingModeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
