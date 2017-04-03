package net.minidev.ovh.api.overthebox;

/**
 * Status of a MPTCP Interface.
 */
public enum OvhMultipathStatusEnum {
	backup("backup"),
	handover("handover"),
	master("master"),
	off("off"),
	on("on");

	final String value;

	OvhMultipathStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
