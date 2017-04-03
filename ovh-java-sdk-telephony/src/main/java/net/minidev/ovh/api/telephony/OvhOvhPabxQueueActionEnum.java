package net.minidev.ovh.api.telephony;

/**
 * Available actions for overflow and on closure
 */
public enum OvhOvhPabxQueueActionEnum {
	playback("playback"),
	voicemail("voicemail");

	final String value;

	OvhOvhPabxQueueActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
