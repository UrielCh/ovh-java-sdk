package net.minidev.ovh.api.dedicated;

/**
 * partition type
 */
public enum OvhTemplatePartitionTypeEnum {
	logical("logical"),
	lv("lv"),
	primary("primary");

	final String value;

	OvhTemplatePartitionTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
