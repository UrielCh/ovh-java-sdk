package net.minidev.ovh.api.cdnanycast;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available number for cacheRule upgrade
 */
public enum OvhOrderCacheRuleEnum {
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("1000")
	_1000("1000");

	final String value;

	OvhOrderCacheRuleEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
