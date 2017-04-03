package net.minidev.ovh.api.email.exchange;

/**
 * Public folder right type
 */
public enum OvhPublicFolderRightTypeEnum {
	editor("editor"),
	none("none"),
	reviewer("reviewer");

	final String value;

	OvhPublicFolderRightTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
