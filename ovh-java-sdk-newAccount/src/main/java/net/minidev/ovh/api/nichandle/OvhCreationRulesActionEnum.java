package net.minidev.ovh.api.nichandle;

/**
 * Action a nichandle can perform on his account.
 */
public enum OvhCreationRulesActionEnum {
	create("create"),
	update("update");

	final String value;

	OvhCreationRulesActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
