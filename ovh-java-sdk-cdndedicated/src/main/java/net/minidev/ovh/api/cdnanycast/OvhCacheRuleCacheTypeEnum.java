package net.minidev.ovh.api.cdnanycast;

/**
 * All type a cache can be in
 */
public enum OvhCacheRuleCacheTypeEnum {
	forceCache("forceCache"),
	noCache("noCache");

	final String value;

	OvhCacheRuleCacheTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
