package net.minidev.ovh.api.hosting.web.ovhconfig;

/**
 * Ovhconfig status
 */
public enum OvhStatusEnum {
	created("created"),
	rollbacking("rollbacking"),
	updating("updating");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
