package net.minidev.ovh.api.hosting.web;

/**
 * Different support of PHP versions
 */
public enum OvhPhpVersionStateEnum {
	BETA("BETA"),
	END_OF_LIFE("END_OF_LIFE"),
	SECURITY_FIXES("SECURITY_FIXES"),
	SUPPORTED("SUPPORTED");

	final String value;

	OvhPhpVersionStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
