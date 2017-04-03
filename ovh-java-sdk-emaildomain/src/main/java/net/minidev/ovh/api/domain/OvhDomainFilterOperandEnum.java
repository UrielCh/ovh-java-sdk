package net.minidev.ovh.api.domain;

/**
 * Possible values for filter operation
 */
public enum OvhDomainFilterOperandEnum {
	checkspf("checkspf"),
	contains("contains"),
	noContains("noContains");

	final String value;

	OvhDomainFilterOperandEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
