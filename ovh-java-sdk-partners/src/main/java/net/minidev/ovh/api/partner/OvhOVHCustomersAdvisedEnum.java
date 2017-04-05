package net.minidev.ovh.api.partner;

/**
 * Possible choices for OVHCustomersAdvisedEnum
 */
public enum OvhOVHCustomersAdvisedEnum {
	none("none"),
	one("one"),
	from2To3("from2To3"),
	from4To5("from4To5"),
	moreThan5("moreThan5");

	final String value;

	OvhOVHCustomersAdvisedEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
