package net.minidev.ovh.api.nichandle;

/**
 * States a nichandle can be in
 */
public enum OvhStateEnum {
	complete("complete"),
	incomplete("incomplete");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
