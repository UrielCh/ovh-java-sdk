package net.minidev.ovh.api.telephony;

/**
 * Product type
 */
public enum OvhSipDomainProductTypeEnum {
	sip("sip"),
	trunk("trunk");

	final String value;

	OvhSipDomainProductTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
