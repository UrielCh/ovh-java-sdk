package net.minidev.ovh.api.hosting.web.module;

/**
 * Branch enum
 */
public enum OvhBranchEnum {
	old("old"),
	stable("stable"),
	testing("testing");

	final String value;

	OvhBranchEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
