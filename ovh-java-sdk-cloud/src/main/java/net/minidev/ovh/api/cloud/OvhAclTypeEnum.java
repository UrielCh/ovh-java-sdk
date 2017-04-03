package net.minidev.ovh.api.cloud;

/**
 * Possible values for ACL type
 */
public enum OvhAclTypeEnum {
	readOnly("readOnly"),
	readWrite("readWrite");

	final String value;

	OvhAclTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
