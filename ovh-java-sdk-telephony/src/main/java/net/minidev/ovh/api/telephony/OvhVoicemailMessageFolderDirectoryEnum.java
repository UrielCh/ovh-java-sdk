package net.minidev.ovh.api.telephony;

/**
 * Folder type
 */
public enum OvhVoicemailMessageFolderDirectoryEnum {
	family("family"),
	friends("friends"),
	inbox("inbox"),
	old("old"),
	urgent("urgent"),
	work("work");

	final String value;

	OvhVoicemailMessageFolderDirectoryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
