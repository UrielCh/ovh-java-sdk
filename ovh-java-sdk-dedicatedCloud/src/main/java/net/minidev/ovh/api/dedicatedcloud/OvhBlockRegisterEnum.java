package net.minidev.ovh.api.dedicatedcloud;

/**
 * The Regional Internet Registry of this IP block
 */
public enum OvhBlockRegisterEnum {
	arin("arin"),
	ripe("ripe");

	final String value;

	OvhBlockRegisterEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
