package net.minidev.ovh.api.email.exchange;

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
