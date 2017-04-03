package net.minidev.ovh.api.veeamcloudconnect;

/**
 * All Location where cloud can be physically located
 */
public enum OvhLocation {
	bhs1("bhs1"),
	rbx2("rbx2"),
	sbg1("sbg1");

	final String value;

	OvhLocation(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
