package net.minidev.ovh.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parent service type enum
 */
public enum OvhParentServiceTypeEnum {
	@JsonProperty("/allDom")
	_allDom("/allDom");

	final String value;

	OvhParentServiceTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
