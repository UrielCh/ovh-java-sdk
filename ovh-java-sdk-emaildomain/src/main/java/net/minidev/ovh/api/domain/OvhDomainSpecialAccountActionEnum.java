package net.minidev.ovh.api.domain;

/**
 * Possible values for pop action task
 */
public enum OvhDomainSpecialAccountActionEnum {
	add("add"),
	change("change"),
	delete("delete");

	final String value;

	OvhDomainSpecialAccountActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
