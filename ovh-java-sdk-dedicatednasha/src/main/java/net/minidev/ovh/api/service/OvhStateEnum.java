package net.minidev.ovh.api.service;

/**
 * 
 */
public enum OvhStateEnum {
	expired("expired"),
	inCreation("inCreation"),
	ok("ok"),
	pendingDebt("pendingDebt"),
	unPaid("unPaid");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
