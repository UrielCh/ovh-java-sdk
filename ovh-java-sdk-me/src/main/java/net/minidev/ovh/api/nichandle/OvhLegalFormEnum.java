package net.minidev.ovh.api.nichandle;

/**
 * Legal forms a nichandle can be registered as
 */
public enum OvhLegalFormEnum {
	administration("administration"),
	association("association"),
	corporation("corporation"),
	individual("individual"),
	other("other"),
	personalcorporation("personalcorporation");

	final String value;

	OvhLegalFormEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
