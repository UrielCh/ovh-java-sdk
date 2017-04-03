package net.minidev.ovh.api.reseller;

/**
 * Possible values for task status
 */
public enum OvhTaskTypeEnum {
	done("done"),
	error("error"),
	doing("doing"),
	todo("todo"),
	unknown("unknown");

	final String value;

	OvhTaskTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
