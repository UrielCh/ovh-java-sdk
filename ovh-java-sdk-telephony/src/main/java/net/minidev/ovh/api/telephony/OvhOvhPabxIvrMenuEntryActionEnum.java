package net.minidev.ovh.api.telephony;

/**
 * IVR menu action
 */
public enum OvhOvhPabxIvrMenuEntryActionEnum {
	bridge("bridge"),
	callcenter("callcenter"),
	menuBack("menuBack"),
	menuExit("menuExit"),
	menuSub("menuSub"),
	menuTop("menuTop"),
	playback("playback"),
	readDtmf("readDtmf"),
	setCallerName("setCallerName");

	final String value;

	OvhOvhPabxIvrMenuEntryActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
