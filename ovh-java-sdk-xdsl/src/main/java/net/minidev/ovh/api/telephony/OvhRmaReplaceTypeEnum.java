package net.minidev.ovh.api.telephony;

/**
 * Return merchandise authorisation type
 */
public enum OvhRmaReplaceTypeEnum {
	changePhone("changePhone"),
	phoneRestitution("phoneRestitution"),
	undefined("undefined");

	final String value;

	OvhRmaReplaceTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
