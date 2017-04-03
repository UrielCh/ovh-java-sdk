package net.minidev.ovh.api.cdnanycast;

/**
 * All function CDN task can be
 */
public enum OvhTaskFunctionEnum {
	flush("flush"),
	flushAll("flushAll"),
	generateSsl("generateSsl"),
	installSsl("installSsl"),
	reinstallSsl("reinstallSsl"),
	removeDomain("removeDomain"),
	uninstallSsl("uninstallSsl"),
	updateCacheRule("updateCacheRule");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
