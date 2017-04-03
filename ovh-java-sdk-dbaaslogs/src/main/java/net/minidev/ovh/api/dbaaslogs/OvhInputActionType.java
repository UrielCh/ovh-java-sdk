package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for InputActionType
 */
public enum OvhInputActionType {
	END("END"),
	LOG("LOG"),
	START("START"),
	TEST("TEST"),
	DESTROY("DESTROY"),
	RESTART("RESTART");

	final String value;

	OvhInputActionType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
