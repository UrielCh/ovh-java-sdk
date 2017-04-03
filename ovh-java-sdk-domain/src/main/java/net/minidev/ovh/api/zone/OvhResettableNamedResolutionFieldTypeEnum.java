package net.minidev.ovh.api.zone;

/**
 * Resource record type
 */
public enum OvhResettableNamedResolutionFieldTypeEnum {
	A("A"),
	MX("MX");

	final String value;

	OvhResettableNamedResolutionFieldTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
