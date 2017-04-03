package net.minidev.ovh.api.router;

/**
 * All states this object can be in
 */
public enum OvhIpStatusEnum {
	blacklisted("blacklisted"),
	deleted("deleted"),
	free("free"),
	installing("installing"),
	ok("ok"),
	quarantined("quarantined"),
	removing("removing"),
	suspended("suspended");

	final String value;

	OvhIpStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
