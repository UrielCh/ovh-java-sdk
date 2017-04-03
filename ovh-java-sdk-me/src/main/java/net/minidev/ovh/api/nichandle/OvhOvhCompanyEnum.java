package net.minidev.ovh.api.nichandle;

/**
 * OVH subsidiaries
 */
public enum OvhOvhCompanyEnum {
	kimsufi("kimsufi"),
	ovh("ovh"),
	soyoustart("soyoustart");

	final String value;

	OvhOvhCompanyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
