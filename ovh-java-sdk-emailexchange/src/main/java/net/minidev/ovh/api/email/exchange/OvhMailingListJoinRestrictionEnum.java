package net.minidev.ovh.api.email.exchange;

/**
 * Join distribution group restriction status
 */
public enum OvhMailingListJoinRestrictionEnum {
	approvalRequired("approvalRequired"),
	closed("closed"),
	open("open");

	final String value;

	OvhMailingListJoinRestrictionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
