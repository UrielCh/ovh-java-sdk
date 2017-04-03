package net.minidev.ovh.api.domain;

/**
 * Possible values for filter action
 */
public enum OvhDomainFilterActionEnum {
	accept("accept"),
	account("account"),
	delete("delete"),
	redirect("redirect");

	final String value;

	OvhDomainFilterActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
