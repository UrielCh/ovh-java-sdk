package net.minidev.ovh.api.vps;

/**
 * All values keymap can be in
 */
public enum OvhVpsKeymapEnum {
	fr("fr"),
	us("us");

	final String value;

	OvhVpsKeymapEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
