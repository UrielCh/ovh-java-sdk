package net.minidev.ovh.api.partner;

/**
 * Possible ranges for company employees number
 */
public enum OvhEmployeesNumberEnum {
	from1To10("from1To10"),
	from11To50("from11To50"),
	from51To100("from51To100"),
	from101To500("from101To500"),
	moreThan500("moreThan500");

	final String value;

	OvhEmployeesNumberEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
