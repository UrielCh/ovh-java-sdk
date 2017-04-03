package net.minidev.ovh.api.email.exchange;

/**
 * Public folder type
 */
public enum OvhPublicFolderTypeEnum {
	calendar("calendar"),
	contacts("contacts"),
	plain("plain"),
	tasks("tasks");

	final String value;

	OvhPublicFolderTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
