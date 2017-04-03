package net.minidev.ovh.api.vps.disk;

/**
 * Possible type a disk can be in
 */
public enum OvhTypeEnum {
	additional("additional"),
	primary("primary");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
