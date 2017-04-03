package net.minidev.ovh.api.cdn.website;

/**
 * All function CDN task can be
 */
public enum OvhTaskFunctionEnum {
	flushAll("flushAll"),
	installBackend("installBackend"),
	removeBackend("removeBackend"),
	removeDomain("removeDomain"),
	removeZone("removeZone");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
