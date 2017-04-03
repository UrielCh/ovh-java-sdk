package net.minidev.ovh.api.email.exchange;

/**
 * Depart distribution group restriction status
 */
public enum OvhMailingListDepartRestrictionEnum {
	closed("closed"),
	open("open");

	final String value;

	OvhMailingListDepartRestrictionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
