package net.minidev.ovh.api.nichandle;

/**
 * All genders a nic can choose
 */
public enum OvhGenderEnum {
	female("female"),
	male("male");

	final String value;

	OvhGenderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
