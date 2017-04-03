package net.minidev.ovh.api.telephony;

/**
 * Possible languages of the sound played to inform caller that he can disable call record
 */
public enum OvhOvhPabxHuntingQueueRecordDisablingLanguageEnum {
	english("english"),
	french("french");

	final String value;

	OvhOvhPabxHuntingQueueRecordDisablingLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
