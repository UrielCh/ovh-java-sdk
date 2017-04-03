package net.minidev.ovh.api.price.license;

/**
 * Enum of Offices
 */
public enum OvhOfficeEnum {
	officeBusiness("officeBusiness"),
	officeProPlus("officeProPlus");

	final String value;

	OvhOfficeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
