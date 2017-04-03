package net.minidev.ovh.api.stack;

/**
 * Stack type
 */
public enum OvhStackTypeEnum {
	MDS("MDS"),
	MIS("MIS"),
	MOS("MOS");

	final String value;

	OvhStackTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
