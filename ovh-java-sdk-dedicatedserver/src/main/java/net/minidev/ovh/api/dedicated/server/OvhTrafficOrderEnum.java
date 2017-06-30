package net.minidev.ovh.api.dedicated.server;

/**
 *  traffic orderable 
 */
public enum OvhTrafficOrderEnum {
	unlimited("unlimited");

	final String value;

	OvhTrafficOrderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
