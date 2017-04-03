package net.minidev.ovh.api.cdnanycast;

/**
 * All states a status can be in
 */
public enum OvhDomainStatusEnum {
	error("error"),
	off("off"),
	on("on"),
	removing("removing");

	final String value;

	OvhDomainStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
