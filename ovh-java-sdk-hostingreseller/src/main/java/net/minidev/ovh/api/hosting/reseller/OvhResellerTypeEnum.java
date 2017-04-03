package net.minidev.ovh.api.hosting.reseller;

/**
 * Reseller type
 */
public enum OvhResellerTypeEnum {
	TYPE1("TYPE1"),
	TYPE2("TYPE2"),
	TYPE3("TYPE3"),
	TYPE4("TYPE4"),
	TYPE5("TYPE5");

	final String value;

	OvhResellerTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
