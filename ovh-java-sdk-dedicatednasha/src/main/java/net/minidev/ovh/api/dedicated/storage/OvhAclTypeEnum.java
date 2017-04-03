package net.minidev.ovh.api.dedicated.storage;

/**
 * Acl Type
 */
public enum OvhAclTypeEnum {
	readonly("readonly"),
	readwrite("readwrite");

	final String value;

	OvhAclTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
