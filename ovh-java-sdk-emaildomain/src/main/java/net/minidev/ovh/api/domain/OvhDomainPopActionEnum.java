package net.minidev.ovh.api.domain;

/**
 * Possible values for pop action task
 */
public enum OvhDomainPopActionEnum {
	addAccount("addAccount"),
	changeAccount("changeAccount"),
	changePassword("changePassword"),
	deleteAccount("deleteAccount"),
	migration("migration"),
	temporaryTask("temporaryTask"),
	unknown("unknown");

	final String value;

	OvhDomainPopActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
