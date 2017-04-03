package net.minidev.ovh.api.cdnanycast;

/**
 * All states an anycast pool can be in
 */
public enum OvhCacheRuleFileTypeEnum {
	extension("extension"),
	file("file"),
	folder("folder");

	final String value;

	OvhCacheRuleFileTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
