package net.minidev.ovh.api.vps;

/**
 * All values a VPS netboot mode can be in
 */
public enum OvhVpsNetbootEnum {
	local("local"),
	rescue("rescue");

	final String value;

	OvhVpsNetbootEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
