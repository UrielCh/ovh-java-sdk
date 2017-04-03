package net.minidev.ovh.api.telephony;

/**
 * Voicemail audio format
 */
public enum OvhServiceVoicemailAudioFormatEnum {
	aiff("aiff"),
	au("au"),
	flac("flac"),
	mp3("mp3"),
	ogg("ogg"),
	wav("wav");

	final String value;

	OvhServiceVoicemailAudioFormatEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
