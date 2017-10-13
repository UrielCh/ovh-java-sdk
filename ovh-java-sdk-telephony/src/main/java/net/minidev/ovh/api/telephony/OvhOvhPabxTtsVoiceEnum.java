package net.minidev.ovh.api.telephony;

/**
 * Voice to use for your text to speech
 */
public enum OvhOvhPabxTtsVoiceEnum {
	Bruce("Bruce"),
	Helene("Helene"),
	Jenny("Jenny"),
	Loic("Loic");

	final String value;

	OvhOvhPabxTtsVoiceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
