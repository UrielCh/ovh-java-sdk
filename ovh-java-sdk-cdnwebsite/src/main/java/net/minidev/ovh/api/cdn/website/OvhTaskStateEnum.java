package net.minidev.ovh.api.cdn.website;

/**
 * All states a CDN task can be in
 */
public enum OvhTaskStateEnum {
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhTaskStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
