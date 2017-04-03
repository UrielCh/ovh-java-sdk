package net.minidev.ovh.api.nichandle;

/**
 * Ip registries
 */
public enum OvhIpRegistryEnum {
	ARIN("ARIN"),
	RIPE("RIPE");

	final String value;

	OvhIpRegistryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
