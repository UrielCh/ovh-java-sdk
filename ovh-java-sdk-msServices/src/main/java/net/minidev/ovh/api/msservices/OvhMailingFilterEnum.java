package net.minidev.ovh.api.msservices;

/**
 * Mailing filter options availlable
 */
public enum OvhMailingFilterEnum {
	vaderetro("vaderetro");

	final String value;

	OvhMailingFilterEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
