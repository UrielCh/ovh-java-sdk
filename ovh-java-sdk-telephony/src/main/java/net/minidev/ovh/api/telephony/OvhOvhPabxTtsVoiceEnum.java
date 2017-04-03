package net.minidev.ovh.api.telephony;

/**
 * Voice to use for your text to speech
 */
public enum OvhOvhPabxTtsVoiceEnum {
	Helene("Helene"),
	Loic("Loic");

	final String value;

	OvhOvhPabxTtsVoiceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
