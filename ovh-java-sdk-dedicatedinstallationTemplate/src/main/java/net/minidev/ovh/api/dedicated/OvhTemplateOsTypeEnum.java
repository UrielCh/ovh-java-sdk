package net.minidev.ovh.api.dedicated;

/**
 * Os type
 */
public enum OvhTemplateOsTypeEnum {
	bsd("bsd"),
	linux("linux"),
	solaris("solaris"),
	windows("windows");

	final String value;

	OvhTemplateOsTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
