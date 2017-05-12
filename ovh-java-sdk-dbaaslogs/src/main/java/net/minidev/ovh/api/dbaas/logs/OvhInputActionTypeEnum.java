package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for InputActionTypeEnum
 */
public enum OvhInputActionTypeEnum {
	END("END"),
	LOG("LOG"),
	START("START"),
	TEST("TEST"),
	DESTROY("DESTROY"),
	RESTART("RESTART");

	final String value;

	OvhInputActionTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
