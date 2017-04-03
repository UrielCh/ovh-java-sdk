package net.minidev.ovh.api.telephony;

/**
 * Folder type
 */
public enum OvhVoicemailMessageFolderGreetingEnum {
	busy("busy"),
	greet("greet"),
	temp("temp"),
	unavail("unavail");

	final String value;

	OvhVoicemailMessageFolderGreetingEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
