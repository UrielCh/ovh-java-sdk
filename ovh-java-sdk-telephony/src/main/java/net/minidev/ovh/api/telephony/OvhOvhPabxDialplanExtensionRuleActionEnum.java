package net.minidev.ovh.api.telephony;

/**
 * Dialplan rule action
 */
public enum OvhOvhPabxDialplanExtensionRuleActionEnum {
	bridge("bridge"),
	endless_playback("endless_playback"),
	hangup("hangup"),
	hunting("hunting"),
	ivr("ivr"),
	playback("playback"),
	readDtmf("readDtmf"),
	setCallerName("setCallerName"),
	sleep("sleep"),
	tts("tts"),
	voicemail("voicemail");

	final String value;

	OvhOvhPabxDialplanExtensionRuleActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
