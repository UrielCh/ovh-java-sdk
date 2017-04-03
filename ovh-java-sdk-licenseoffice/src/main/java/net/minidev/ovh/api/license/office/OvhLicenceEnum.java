package net.minidev.ovh.api.license.office;

/**
 * Office Licence
 */
public enum OvhLicenceEnum {
	officeBusiness("officeBusiness"),
	officeProPlus("officeProPlus");

	final String value;

	OvhLicenceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
