package net.minidev.ovh.api.sms;

/**
 * The ISO formated country code of the number
 */
public enum OvhVirtualNumberIsoCountryCodeEnum {
	be("be"),
	ch("ch"),
	de("de"),
	es("es"),
	fr("fr"),
	uk("uk");

	final String value;

	OvhVirtualNumberIsoCountryCodeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
