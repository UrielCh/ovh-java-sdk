package net.minidev.ovh.api.cloud.instance;

/**
 * ApplicationAccessStateEnum
 */
public enum OvhApplicationAccessStateEnum {
	installing("installing"),
	ok("ok");

	final String value;

	OvhApplicationAccessStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
